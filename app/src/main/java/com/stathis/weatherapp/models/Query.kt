package com.stathis.weatherapp.models

import com.stathis.weatherapp.abstraction.LocalModel

data class Query(val queryName: String) : LocalModel {
    override fun equalsContent(data: LocalModel): Boolean = when (data) {
        is Query -> data.queryName == queryName
        else -> false
    }
}