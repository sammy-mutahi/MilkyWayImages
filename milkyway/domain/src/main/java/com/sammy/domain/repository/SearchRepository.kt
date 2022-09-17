package com.sammy.domain.repository

import com.sammy.domain.model.SearchResult

interface SearchRepository {
    suspend fun getSearchResult(
        query: String,
        mediaType: String,
        startYear: String,
        endYear: String
    ): Result<List<SearchResult>>
}