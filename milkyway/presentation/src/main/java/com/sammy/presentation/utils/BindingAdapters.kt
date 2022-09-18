package com.sammy.presentation.utils

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.ImageLoader
import coil.load
import com.google.android.material.textview.MaterialTextView
import com.sammy.domain.model.SearchResult
import com.sammy.presentation.ui.SearchResultAdapter

@BindingAdapter("searchResults")
fun setProvidersList(recyclerView: RecyclerView, data: List<SearchResult>?) {
    val adapter = recyclerView.adapter as SearchResultAdapter
    adapter.submitList(data)
}

@BindingAdapter("thumbnail")
fun AppCompatImageView.setThumbnail(imagePath: String) {
    load(uri = imagePath, imageLoader = getCoilImageLoader())
}

@BindingAdapter(value = ["center", "dateCreated"], requireAll = true)
fun setBody(textview: MaterialTextView, center: String, dateCreated: String) {
    textview.text = "${center.uppercase()} | ${dateCreated.formatDate()}"
}

@BindingAdapter(value = ["visibilityOnState", "visibilityCondition"], requireAll = true)
fun visibilityOnState(view: View, visibilityOnState: ViewState?, visibilityCondition: ViewState) {
    view.visibility = if (visibilityCondition == visibilityOnState) View.VISIBLE else View.INVISIBLE
    view.requestLayout()
}

fun View.getCoilImageLoader(): ImageLoader {
    val context = this.context
    return ImageLoader.Builder(context)
        .build()
}