package com.example.myapplicationclean.utils

import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

@BindingAdapter("visibleGone")
fun ProgressBar.setVisibleGone(isVisible: Boolean) {
    if (isVisible) this.visibility = View.VISIBLE
    else this.visibility = View.GONE
}