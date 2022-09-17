package com.sammy.presentation.utils

import com.sammy.domain.model.ErrorResponse
import com.squareup.moshi.Moshi

fun retrofit2.HttpException.parseErrorResponse(moshi: Moshi): ErrorResponse? {
    return try {
        val adapter = moshi.adapter(ErrorResponse::class.java)
        this.response()?.errorBody()?.string()?.let { adapter.fromJson(it) }
    } catch (e: Exception) {
        null
    }
}

fun Throwable.parseHttpErrorMessage(moshi: Moshi): String? {
    if (this is retrofit2.HttpException) {
        val response: ErrorResponse? = this.parseErrorResponse(moshi)
        return response?.message
    }
    return this.message
}