package com.example.localjob.custom_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.localjob.R

/**
 * Created by schecterza on 7/20/2017 AD.
 */

class RecommendHorizontalList @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        initInflate()


    }

    fun initInflate() {
        LayoutInflater.from(context).inflate(R.layout.fragment_horizontallist, this, true)
    }

}