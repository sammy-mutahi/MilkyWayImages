package com.sammy.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sammy.domain.model.SearchResult
import com.sammy.presentation.databinding.FragmentSearchDetailsBinding
import com.sammy.presentation.utils.handleNavigationUp
import dagger.hilt.android.AndroidEntryPoint
import java.lang.ref.WeakReference

@AndroidEntryPoint
class SearchDetailsFragment : Fragment() {
    private val binding: FragmentSearchDetailsBinding by lazy {
        FragmentSearchDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
        }

        binding.toolbar.handleNavigationUp(WeakReference(this))

        val selectedItem = arguments?.get("selectedItem") as SearchResult
        binding.selectedItem = selectedItem
        binding.contentScrolling.selectedItem = selectedItem

    }
}