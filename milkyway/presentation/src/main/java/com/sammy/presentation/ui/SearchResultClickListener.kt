package com.sammy.presentation.ui

import com.sammy.domain.model.SearchResult

class SearchResultClickListener(val clickListener: (item: SearchResult) -> Unit) {
    fun onClick(item: SearchResult) = clickListener(item)
}