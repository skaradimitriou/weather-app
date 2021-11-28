package com.stathis.weatherapp.ui.dashboard.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.stathis.weatherapp.abstraction.DiffUtilClass
import com.stathis.weatherapp.abstraction.LocalModel
import com.stathis.weatherapp.callbacks.ItemClickListener
import com.stathis.weatherapp.databinding.HolderSearchItemRowBinding

class SearchAdapter(val callback : ItemClickListener) : ListAdapter<LocalModel, SearchViewHolder>(DiffUtilClass<LocalModel>()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val view = HolderSearchItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SearchViewHolder(view, callback)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }
}