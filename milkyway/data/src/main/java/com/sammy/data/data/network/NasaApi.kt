package com.sammy.data.data.network

import com.sammy.data.data.dto.SearchResultDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaApi {

    @GET("/search")
    suspend fun getImages(
        @Query("q") query: String = "milky way",
        @Query("media_type") mediaType: String = "image",
        @Query("year_start") startYear: String = "2017",
        @Query("year_end") endYear: String = "2017"
    ): SearchResultDto


}