package com.example.localjob.custom_view

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.example.localjob.R
import com.example.localjob.StupidActivity
import com.example.localjob.fragment.WorkDetailFragment
import kotlinx.android.synthetic.main.item_list_job.view.*


class ListJob @JvmOverloads constructor(
        context : Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout (context,attrs,defStyleAttr){

    var itemJob: LinearLayout

    init {
        initInflate()

        this.itemJob = item_job
        itemJob.setOnClickListener{ goToJobDetail() }

    }

    fun goToJobDetail() {
        var intent = Intent(context, StupidActivity::class.java)
        context.startActivity(intent)
    }

    fun initInflate() {
        LayoutInflater.from(context).inflate(R.layout.item_list_job, this, true)
    }



}