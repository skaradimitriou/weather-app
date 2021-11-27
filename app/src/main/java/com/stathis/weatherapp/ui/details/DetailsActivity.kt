package com.stathis.weatherapp.ui.details


import androidx.lifecycle.ViewModelProvider
import com.stathis.weatherapp.R
import com.stathis.weatherapp.abstraction.AbstractActivity
import com.stathis.weatherapp.databinding.ActivityDetailsBinding

class DetailsActivity : AbstractActivity<ActivityDetailsBinding>(R.layout.activity_details) {

    private lateinit var viewModel : DetailsViewModel

    override fun init() {
        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)
    }

    override fun startOps() {
        //FIXME: Design UI for this screen
    }

    override fun stopOps() {
        //
    }
}