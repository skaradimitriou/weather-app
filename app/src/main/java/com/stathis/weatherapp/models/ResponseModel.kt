package com.stathis.weatherapp.models

import com.google.gson.annotations.SerializedName

data class ResponseModel(

    @SerializedName("data")
    val data: Data
)