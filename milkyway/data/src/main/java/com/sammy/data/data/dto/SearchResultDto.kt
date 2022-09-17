package com.sammy.data.data.dto

import com.squareup.moshi.Json

data class SearchResultDto(
    val version: String,
    val collection: Collection
)

data class Collection(
    val items: List<Data>,
    val links: List<Link>
)

data class Data(
    val title: String,
    val location: String,
    @Json(name = "nasa_id")
    val nasaId: String,
    val description: String,
    val center: String,
    @Json(name = "date_created")
    val dateCreated: String
)

data class Link(
    val href: String,
    val rel: String,
    val render: String
)

