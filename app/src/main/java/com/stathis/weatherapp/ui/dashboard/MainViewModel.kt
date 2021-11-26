package com.stathis.weatherapp.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stathis.weatherapp.models.WeatherResponse
import com.stathis.weatherapp.network.ApiClient

class MainViewModel : ViewModel() {

    val data = MutableLiveData<WeatherResponse>()

    fun getWeatherForCity(city : String){
        ApiClient.getWeatherForCity("London",data)
    }
}