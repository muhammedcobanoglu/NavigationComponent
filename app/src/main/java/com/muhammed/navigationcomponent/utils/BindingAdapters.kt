package com.muhammed.navigationcomponent.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter

/**
 * Created by Muhammed COBANOGLU on 27.01.2022.
 */
object BindingAdapters {

    @BindingAdapter("imgRes")
    @JvmStatic fun setImageResource(imageView: ImageView, resource: Int) {
        imageView.setImageResource(resource)
    }
}