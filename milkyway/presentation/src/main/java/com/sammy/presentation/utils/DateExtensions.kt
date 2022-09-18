package com.sammy.presentation.utils

import java.text.SimpleDateFormat
import java.util.*

fun String.toDate(): Date? {
    return if (this.isNotEmpty())
        SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(this)
    else null
}

fun Date?.formatDate(pattern: String): String {
    return if (this != null) SimpleDateFormat(pattern, Locale.getDefault()).format(this) else ""
}

fun String?.formatDate(): String {
    return this?.toDate().formatDate("yyyy-MM-dd")
}