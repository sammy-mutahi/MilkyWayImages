package com.sammy.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sammy.domain.model.ErrorResponse
import com.sammy.domain.model.SearchResult
import com.sammy.domain.use_case.SearchUseCases
import com.sammy.presentation.utils.*
import com.squareup.moshi.Moshi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.net.SocketTimeoutException
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchUseCases: SearchUseCases,
    private val moshi: Moshi
) : ViewModel() {
    private val _searchState = MutableLiveData<ViewState>()
    val searchState: LiveData<ViewState> = _searchState

    private val _searchResult = MutableLiveData<List<SearchResult>>()
    val searchResult: LiveData<List<SearchResult>> = _searchResult

    private val _errorResponse = MutableLiveData<ErrorResponse>()
    val errorResponse: LiveData<ErrorResponse> = _errorResponse

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> = _errorMessage

    fun getSearchResult(
        query: String,
        mediaType: String,
        startYear: String,
        endYear: String
    ) = viewModelScope.launch {
        _searchState.inProgress()
        searchUseCases.searchGalaxiesUseCase(
            query = query,
            mediaType = mediaType,
            startYear = startYear,
            endYear = endYear
        )
            .onSuccess { results ->
                if (results.isNotEmpty()) {
                    _searchResult.value = results
                } else {
                    _errorMessage.value = "No Galaxies"
                }
                _searchState.loaded()
            }
            .onFailure { e ->
                handleException(e)
            }
    }

    private fun handleException(e: Throwable) {
        when (e) {
            is HttpException -> {
                val response: ErrorResponse? = e.parseErrorResponse(moshi)
                _errorResponse.value = response ?: ErrorResponse(e.code(), e.message())
                handleServerError(errorResponse.value)
                _searchState.error()
            }
            is SocketTimeoutException -> {
                _errorMessage.value =
                    "Apologies we are down for scheduled maintenance to improve the app, please check in later"
                _searchState.error()
            }
            else -> {
                _errorMessage.value =
                    "We are unable to get your search results. Please contact the support team"
                _searchState.error()
            }
        }
    }

    private fun handleServerError(value: ErrorResponse?) {
        value?.let { errorResponse ->
            when (errorResponse.statusCode) {
                400 -> _errorMessage.value = errorResponse.message
                404 -> _errorMessage.value = errorResponse.message
                500, 502, 503, 504 -> _errorMessage.value =
                    "Apologies we are down for scheduled maintenance to improve the app, please check in later"

            }
        }
    }
}