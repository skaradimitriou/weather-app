package com.stathis.weatherapp.network

import com.stathis.weatherapp.models.response.ResponseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("premium/v1/weather.ashx")
    fun getWeatherForCity(
        @Query("key") key: String,
        @Query("q") city: String,
        @Query("format") format: String
    ) : Call<ResponseModel>

    @GET("premium/v1/weather.ashx")
    fun getWeekForecast(
        @Query("key") key: String,
        @Query("q") city: String,
        @Query("format") format: String,
        @Query("num_of_days") days: String
    ): Call<ResponseModel>
}