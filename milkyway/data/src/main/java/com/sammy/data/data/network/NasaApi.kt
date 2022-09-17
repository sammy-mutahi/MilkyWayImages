package com.sammy.data.data.network

import com.sammy.data.data.dto.SearchResultDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaApi {

    @GET("/search")
    suspend fun getSearchResult(
        @Query("q") query: String,
        @Query("media_type") mediaType: String,
        @Query("year_start") startYear: String,
        @Query("year_end") endYear: String
    ): SearchResultDto


}