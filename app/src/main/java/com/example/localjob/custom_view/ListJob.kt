package com.example.localjob.custom_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.localjob.R


class ListJob @JvmOverloads constructor(
        context : Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout (context,attrs,defStyleAttr){
    init {
        LayoutInflater.from(context).inflate(R.layout.item_list_job, this, true)
    }

}