package com.stathis.weatherapp.models.response

import com.stathis.weatherapp.models.response.Astronomy
import com.stathis.weatherapp.models.response.Hourly

data class Weather(
    val astronomy: List<Astronomy>,
    val avgtempC: String,
    val avgtempF: String,
    val date: String,
    val hourly: List<Hourly>,
    val maxtempC: String,
    val maxtempF: String,
    val mintempC: String,
    val mintempF: String,
    val sunHour: String,
    val totalSnow_cm: String,
    val uvIndex: String
)