package com.stathis.weatherapp.models

import com.google.gson.annotations.SerializedName
import com.stathis.weatherapp.abstraction.LocalModel

data class CurrentCondition (
    val FeelsLikeC: String,
    val FeelsLikeF: String,
    val cloudcover: String,
    val humidity: String,
    val observation_time: String,
    val temp_C: String,
    val temp_F: String,
    //val weatherDesc: List<WeatherDesc>,
    //val weatherIconUrl: List<WeatherIconUrl>,
    val windspeedKmph : String
): LocalModel {
    override fun equalsContent(obj: LocalModel): Boolean = false
}