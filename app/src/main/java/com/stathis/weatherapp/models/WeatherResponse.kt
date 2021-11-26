package com.stathis.weatherapp.models

import com.stathis.weatherapp.abstraction.LocalModel

data class WeatherResponse(
    val current_condition: List<CurrentCondition>,
    //val request: List<Request>,
    //val weather: List<Weather>
): LocalModel {
    override fun equalsContent(obj: LocalModel): Boolean = when(obj){
        is WeatherResponse -> obj.current_condition == current_condition
        else -> false
    }
}
