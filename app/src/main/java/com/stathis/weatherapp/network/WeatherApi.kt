package com.stathis.weatherapp.network

import com.stathis.weatherapp.models.MainApiResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("premium/v1/weather.ashx")
    fun getWeatherForCity(
        @Query("key") key: String,
        @Query("q") city: String,
        @Query("format") format: String
    ) : Call<MainApiResponse>
}