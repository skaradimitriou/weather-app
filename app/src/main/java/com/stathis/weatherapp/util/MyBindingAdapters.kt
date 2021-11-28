package com.stathis.weatherapp.util

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class MyBindingAdapters {

    companion object{
        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(view: ImageView, url: String?) {
            url?.let { Glide.with(view.context).load(url).into(view) }
        }

        @BindingAdapter("setCelcius")
        @JvmStatic
        fun TextView.setText(value : String?){
            value?.let { this.text = "$value\u2103" }
        }
    }
}