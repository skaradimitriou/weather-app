package com.stathis.weatherapp.ui.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stathis.weatherapp.models.response.Data
import com.stathis.weatherapp.network.ApiClient

class DetailsViewModel : ViewModel() {

    val data = MutableLiveData<Data>()

    fun getWeatherForCity(city : String){
        ApiClient.getWeatherForCity(city,data)
    }
}