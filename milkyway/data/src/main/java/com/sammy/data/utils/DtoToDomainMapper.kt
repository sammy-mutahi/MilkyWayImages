package com.sammy.data.utils

import com.sammy.data.data.dto.SearchResultDto
import com.sammy.domain.model.SearchResult

internal fun SearchResultDto.toSearchResult(): List<SearchResult> {
    val searchResults = mutableListOf<SearchResult>()
    val items = collection.items
    val links = collection.links
    for (index in items.indices) {
        searchResults.add(
            SearchResult(
                nasaId = items[index].nasaId,
                title = items[index].title,
                center = items[index].center,
                dateCreated = items[index].dateCreated,
                imagePath = links[index].href,
                description = items[index].description
            )
        )
    }
    return searchResults
}