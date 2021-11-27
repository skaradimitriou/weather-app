package com.stathis.weatherapp.ui.dashboard.favorites

import androidx.lifecycle.ViewModelProvider
import com.stathis.weatherapp.R
import com.stathis.weatherapp.abstraction.AbstractFragment
import com.stathis.weatherapp.databinding.FragmentFavoritesBinding

class FavoritesFragment : AbstractFragment<FragmentFavoritesBinding>(R.layout.fragment_favorites) {

    private lateinit var viewModel: FavoritesViewModel

    override fun init() {
        viewModel = ViewModelProvider(this).get(FavoritesViewModel::class.java)
    }

    override fun startOps() {
        //
    }

    override fun stopOps() {
        //
    }
}