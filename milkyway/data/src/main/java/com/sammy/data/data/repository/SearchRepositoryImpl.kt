package com.sammy.data.data.repository

import com.sammy.data.data.dto.SearchResultDto
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
            Result.success(result.toSearchResult())
        } catch (e: Throwable) {
            Result.failure(e)
        }
    }

    //Mock search
    suspend fun getMockSearchResult(
        query: String,
        mediaType: String,
        startYear: String,
        endYear: String
    ): Result<SearchResultDto> {
        return try {
            val response = api.getSearchResult(
                query = query,
                mediaType = mediaType,
                startYear = startYear,
                endYear = endYear
            )
            Result.success(response)
        } catch (e: Throwable) {
            Result.failure(e)
        }
    }


}