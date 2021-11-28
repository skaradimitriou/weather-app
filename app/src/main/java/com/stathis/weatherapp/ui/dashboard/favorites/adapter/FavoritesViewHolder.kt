package com.stathis.weatherapp.ui.dashboard.favorites.adapter

import androidx.databinding.ViewDataBinding
import com.stathis.weatherapp.abstraction.AbstractViewHolder
import com.stathis.weatherapp.abstraction.LocalModel
import com.stathis.weatherapp.callbacks.ItemClickListener

class FavoritesViewHolder(val binding : ViewDataBinding, val callback : ItemClickListener) : AbstractViewHolder(binding) {

    override fun present(data: LocalModel) {
        when(data){
            //FIXME: Implement favorites viewholder
        }
    }
}