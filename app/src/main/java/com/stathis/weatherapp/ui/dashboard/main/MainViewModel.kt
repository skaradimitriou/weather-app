package com.stathis.weatherapp.ui.dashboard.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stathis.weatherapp.models.response.Data
import com.stathis.weatherapp.network.ApiClient

class MainViewModel : ViewModel() {

    val data = MutableLiveData<Data>()

    fun getWeatherForCity(city : String){
        ApiClient.getWeatherForCity(city,data)
    }

    fun getWeek(city : String,noOfDays : String){
        ApiClient.getWeekForecast(city,noOfDays,data)
    }
}