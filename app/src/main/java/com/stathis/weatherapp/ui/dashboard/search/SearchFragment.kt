package com.stathis.weatherapp.ui.dashboard.search

import androidx.lifecycle.ViewModelProvider
import com.stathis.weatherapp.R
import com.stathis.weatherapp.abstraction.AbstractFragment
import com.stathis.weatherapp.databinding.FragmentSearchBinding


class SearchFragment : AbstractFragment<FragmentSearchBinding>(R.layout.fragment_search) {

    private lateinit var viewModel: SearchViewModel

    override fun init() {
        viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
    }

    override fun startOps() {
        binding.title.text = "Search Fragment"
    }

    override fun stopOps() {
        //
    }
}