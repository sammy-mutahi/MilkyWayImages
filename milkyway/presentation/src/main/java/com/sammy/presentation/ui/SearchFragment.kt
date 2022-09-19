package com.sammy.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sammy.presentation.R
import com.sammy.presentation.databinding.FragmentSearchBinding
import com.sammy.presentation.utils.handleNavigationUp
import dagger.hilt.android.AndroidEntryPoint
import java.lang.ref.WeakReference

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

        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = this@SearchFragment.viewModel
        }

        binding.toolbar.handleNavigationUp(WeakReference(this))

        initObservers()

        setupRecyclerView()

        viewModel.getSearchResult(
            query = "milky way",
            mediaType = "image",
            startYear = "2017",
            endYear = "2017"
        )
    }

    private fun setupRecyclerView() {
        binding.galaxyRecycler.adapter = SearchResultAdapter(SearchResultClickListener {
            viewModel.setSearchResultItem(it)
            findNavController().navigate(
                R.id.action_searchFragment_to_searchItemDetailsFragment,
                bundleOf("selectedItem" to it)
            )
        })
    }

    private fun initObservers() {
        viewModel.errorMessage.observe(viewLifecycleOwner) {

        }
    }
}