package com.stathis.weatherapp.ui.dashboard.favorites.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.stathis.weatherapp.abstraction.DiffUtilClass
import com.stathis.weatherapp.abstraction.LocalModel
import com.stathis.weatherapp.callbacks.ItemClickListener
import com.stathis.weatherapp.databinding.HolderFavoriteItemRowBinding

class FavoritesAdapter(val callback : ItemClickListener) : ListAdapter<LocalModel, FavoritesViewHolder>(DiffUtilClass<LocalModel>()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritesViewHolder {
        val view = HolderFavoriteItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FavoritesViewHolder(view, callback)
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }
}