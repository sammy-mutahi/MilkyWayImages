package com.sammy.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SearchResult(
    val nasaId: String,
    val title: String,
    val center: String,
    val dateCreated: String,
    val imagePath: String,
    val description: String,
) : Parcelable
