package com.stathis.weatherapp.ui.dashboard.search.adapter

import androidx.databinding.ViewDataBinding
import com.stathis.weatherapp.abstraction.AbstractViewHolder
import com.stathis.weatherapp.abstraction.LocalModel
import com.stathis.weatherapp.callbacks.ItemClickListener
import com.stathis.weatherapp.models.Query

class SearchViewHolder (val binding : ViewDataBinding, val callback : ItemClickListener) : AbstractViewHolder(binding) {

    override fun present(data: LocalModel) {
        when(data){
            is Query -> {}
        }
    }
}