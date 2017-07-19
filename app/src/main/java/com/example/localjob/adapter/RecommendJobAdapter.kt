package com.example.localjob.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R

import kotlinx.android.synthetic.main.item_recommend.view.*

/**
 * Created by schecterza on 7/18/2017 AD.
 */

class RecommendJobAdapter(): RecyclerView.Adapter<RecommendJobAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent!!.context).inflate(R.layout.item_recommend, parent, false)
        var viewHolder = ViewHolder(v)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindData(itemView: View) {

        }

    }
}