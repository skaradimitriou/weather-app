package com.stathis.weatherapp.network

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.stathis.weatherapp.models.MainApiResponse
import com.stathis.weatherapp.models.WeatherResponse
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

    fun getWeatherForCity(city : String,data : MutableLiveData<WeatherResponse>) {
        api.getWeatherForCity(API_KEY,city,RESPONSE_FORMAT).enqueue(object :
            Callback<MainApiResponse> {
            override fun onResponse(
                call: Call<MainApiResponse>,
                response: Response<MainApiResponse>
            ) {
                //Log.d("",response.body().toString())
                data.value = response.body()?.data
            }

            override fun onFailure(call: Call<MainApiResponse>, t: Throwable) {
                data.value = null
            }
        })
    }
}