package com.stathis.weatherapp.network

import androidx.lifecycle.MutableLiveData
import com.stathis.weatherapp.models.Data
import com.stathis.weatherapp.models.ResponseModel
import com.stathis.weatherapp.util.API_KEY
import com.stathis.weatherapp.util.BASE_URL
import com.stathis.weatherapp.util.RESPONSE_FORMAT
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val api : WeatherApi

    init {
        api = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherApi::class.java)
    }

    fun getWeatherForCity(city : String,data : MutableLiveData<Data>) {
        api.getWeatherForCity(API_KEY,city,RESPONSE_FORMAT).enqueue(object :
            Callback<ResponseModel> {
            override fun onResponse(
                call: Call<ResponseModel>,
                response: Response<ResponseModel>
            ) {
                data.value = response.body()?.data
            }

            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                data.value = null
            }
        })
    }

    fun getWeekForecast(city : String,numOfDays : String, data : MutableLiveData<Data>){
        api.getWeekForecast(API_KEY,city, RESPONSE_FORMAT,numOfDays).enqueue(object :
            Callback<ResponseModel> {
            override fun onResponse(
                call: Call<ResponseModel>,
                response: Response<ResponseModel>
            ) {
                data.value = response.body()?.data
            }

            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                data.value = null
            }
        })
    }
}