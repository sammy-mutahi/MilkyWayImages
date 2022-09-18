package com.sammy.data.data.repository

import android.util.Log
import com.sammy.data.data.network.NasaApi
import com.sammy.data.utils.toSearchResult
import com.sammy.domain.model.SearchResult
import com.sammy.domain.repository.SearchRepository
import javax.inject.Inject

/*
    * @Query("q") query: String = "milky way",
        @Query("media_type") mediaType: String = "image",
        @Query("year_start") startYear: String = "2017",
        @Query("year_end") endYear: String = "2017"
    * */

class SearchRepositoryImpl @Inject constructor(
    private val api: NasaApi
) : SearchRepository {
    override suspend fun getSearchResult(
        query: String,
        mediaType: String,
        startYear: String,
        endYear: String
    ): Result<List<SearchResult>> {
        return try {
            val result = api.getSearchResult(
                query = query,
                mediaType = mediaType,
                startYear = startYear,
                endYear = endYear
            )
            Log.e("Repository", "Response: ${result.toSearchResult()[0]}")
            Result.success(result.toSearchResult())
        } catch (e: Throwable) {
            Result.failure(e)
        }
    }


}