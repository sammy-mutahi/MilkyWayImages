package com.sammy.data.utils

import com.sammy.data.data.dto.SearchResultDto
import com.sammy.domain.model.SearchResult

/*
* Not the best way to map data,
* As the amount of data increase it will have an impact on app's perfomance
* Probably find a better way
* */
internal fun SearchResultDto.toSearchResult(): List<SearchResult> {
    val searchResults = mutableListOf<SearchResult>()
    val items = collection.items
    items.forEach {
        for (index in it.data.indices) {
            searchResults.add(
                SearchResult(
                    nasaId = it.data[index].nasa_id,
                    title = it.data[index].title,
                    center = it.data[index].center,
                    imagePath = it.links[index].href,
                    dateCreated = it.data[index].date_created,
                    description = it.data[index].description
                )
            )
        }
    }
    return searchResults
}