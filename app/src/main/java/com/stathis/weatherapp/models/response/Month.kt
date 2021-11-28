package com.stathis.weatherapp.models.response

data class Month(
    val absMaxTemp: String,
    val absMaxTemp_F: String,
    val avgDailyRainfall: String,
    val avgMinTemp: String,
    val avgMinTemp_F: String,
    val index: String,
    val name: String
)