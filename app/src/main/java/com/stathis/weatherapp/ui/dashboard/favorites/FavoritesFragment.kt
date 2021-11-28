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
        binding.title.text = "Favorites Fragment"

        binding.addBtn.setOnClickListener {  openDialogue() }
    }

    private fun openDialogue() {
        //FIXME: open a dialogue that you can add a location to your favorite list.
    }

    override fun stopOps() {
        //
    }
}