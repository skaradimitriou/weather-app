package com.stathis.weatherapp.ui.dashboard

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.stathis.weatherapp.R
import com.stathis.weatherapp.abstraction.AbstractActivity
import com.stathis.weatherapp.models.Data

class MainActivity : AbstractActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

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

    private fun bindDataToScreen(it: Data) {
        //bind data to ui
        Log.d("",it.toString())
    }

    override fun stopOps() {
        viewModel.data.removeObservers(this)
    }
}