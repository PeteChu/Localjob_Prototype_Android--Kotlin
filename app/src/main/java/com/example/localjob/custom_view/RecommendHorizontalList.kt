package com.example.localjob.custom_view

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Toast
import com.example.localjob.R
import com.example.localjob.StupidActivity
import com.example.localjob.fragment.WorkDetailFragment
import kotlinx.android.synthetic.main.fragment_horizontallist.view.*

/**
 * Created by schecterza on 7/20/2017 AD.
 */

class RecommendHorizontalList @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    var item1: LinearLayout
    var item2: LinearLayout
    var item3: LinearLayout
    var item4: LinearLayout
    var item5: LinearLayout

    init {
        initInflate()

        item1 = recommend1
        item2 = recommend2
        item3 = recommend3
        item4 = recommend4
        item5 = recommend5

        item1.setOnClickListener { goToWorkDetail() }
        item2.setOnClickListener { goToWorkDetail() }
        item3.setOnClickListener { goToWorkDetail() }
        item4.setOnClickListener { goToWorkDetail() }
        item5.setOnClickListener { goToWorkDetail() }

    }


    fun goToWorkDetail() {
        var intent = Intent( context, StupidActivity::class.java )
        intent.putExtra("view", "work")
        context.startActivity(intent)
    }

    fun initInflate() {
        LayoutInflater.from(context).inflate(R.layout.fragment_horizontallist, this, true)
    }

}