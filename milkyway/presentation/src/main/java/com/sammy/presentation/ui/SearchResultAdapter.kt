package com.sammy.presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sammy.domain.model.SearchResult
import com.sammy.presentation.databinding.RowGalaxyItemBinding

class SearchResultAdapter(
    private val listener: SearchResultClickListener
) : ListAdapter<SearchResult, SearchResultAdapter.ViewHolder>(UI_COMPARATOR) {

    inner class ViewHolder(private val binding: RowGalaxyItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(searchResult: SearchResult, listener: SearchResultClickListener) {
            binding.apply {
                item = searchResult
                clickListener = listener
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val layoutInflator = LayoutInflater.from(context)
        val binding = RowGalaxyItemBinding.inflate(layoutInflator, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), listener)
    }
}

private val UI_COMPARATOR = object : DiffUtil.ItemCallback<SearchResult>() {
    override fun areItemsTheSame(oldItem: SearchResult, newItem: SearchResult): Boolean {
        return oldItem.nasaId == newItem.nasaId
    }

    override fun areContentsTheSame(oldItem: SearchResult, newItem: SearchResult): Boolean {
        return oldItem == newItem
    }

}