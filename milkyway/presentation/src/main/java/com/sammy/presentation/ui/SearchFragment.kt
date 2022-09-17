package com.sammy.presentation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sammy.presentation.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment() {

    private val binding: FragmentSearchBinding by lazy {
        FragmentSearchBinding.inflate(layoutInflater)
    }

    private val viewModel: SearchViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initObservers()

        viewModel.getSearchResult(
            query = "milky way",
            mediaType = "image",
            startYear = "2017",
            endYear = "2017"
        )
    }

    private fun initObservers() {
        viewModel.searchResult.observe(viewLifecycleOwner) {
            Log.e("Fragment", "List of Items is Empty:${it.isEmpty()}")
        }
        viewModel.errorMessage.observe(viewLifecycleOwner) {
            Log.e("Fragment", "Error: $it")
        }
    }
}