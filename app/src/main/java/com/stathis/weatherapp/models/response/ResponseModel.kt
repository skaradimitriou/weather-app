package com.stathis.weatherapp.models.response

import com.google.gson.annotations.SerializedName
import com.stathis.weatherapp.models.response.Data

data class ResponseModel(

    @SerializedName("data")
    val data: Data
)