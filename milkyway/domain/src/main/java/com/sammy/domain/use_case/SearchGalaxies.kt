package com.sammy.domain.use_case

import com.sammy.domain.model.SearchResult
import com.sammy.domain.repository.SearchRepository

class SearchGalaxies(
    private val searchRepository: SearchRepository
) {
    suspend operator fun invoke(
        query: String,
        mediaType: String,
        startYear: String,
        endYear: String
    ): Result<List<SearchResult>> {
        return searchRepository.getSearchResult(
            query = query,
            mediaType = mediaType,
            startYear = startYear,
            endYear = endYear
        )
    }
}