package com.stathis.weatherapp.abstraction

interface LocalModel {
    fun equalsContent(data : LocalModel) : Boolean
}