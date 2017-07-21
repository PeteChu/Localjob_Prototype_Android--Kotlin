package com.example.localjob.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R
import com.example.localjob.StupidActivity

/**
 * Created by schecterza on 7/19/2017 AD.
 */

class NotificationListAdapter() : RecyclerView.Adapter<NotificationListAdapter.ViewHolder>() {

    lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent!!.context).inflate(R.layout.item_notification, parent, false)
        var viewHolder = ViewHolder(v)
        mContext = parent.context
        v.setOnClickListener(myOnClick)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindData(itemView: View) {

        }

    }

    var myOnClick = View.OnClickListener { v ->
        var intent = Intent(mContext, StupidActivity::class.java)
        intent.putExtra("view", "work")
        mContext.startActivity(intent)
    }
}