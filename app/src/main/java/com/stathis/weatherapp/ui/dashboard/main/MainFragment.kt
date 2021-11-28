package com.stathis.weatherapp.ui.dashboard.main

import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.stathis.weatherapp.R
import com.stathis.weatherapp.abstraction.AbstractFragment
import com.stathis.weatherapp.databinding.FragmentMainBinding
import com.stathis.weatherapp.models.response.Data


class MainFragment : AbstractFragment<FragmentMainBinding>(R.layout.fragment_main) {

    private lateinit var viewModel: MainViewModel

    override fun init() {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun startOps() {
        val city = resources.getString(R.string.dummy_city)
        viewModel.getWeatherForCity(city)
        //viewModel.getWeek(city,"6")

        viewModel.data.observe(this, Observer {
            it?.let { bindDataToScreen(it) }
        })
    }

    override fun stopOps() {
        //
    }

    private fun bindDataToScreen(it: Data) {
        //bind data to ui
        Log.d("",it.toString())
        it.request.firstOrNull()?.let { binding.city = it }
    }
}