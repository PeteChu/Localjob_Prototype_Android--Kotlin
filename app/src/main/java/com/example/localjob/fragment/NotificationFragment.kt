package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R
import com.example.localjob.adapter.NotificationListAdapter
import com.malinskiy.superrecyclerview.SuperRecyclerView
import kotlinx.android.synthetic.main.fragment_notification_list.view.*

/**
 * Created by schecterza on 7/18/2017 AD.
 */

class NotificationFragment: Fragment() {

    lateinit var recyclerView: SuperRecyclerView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_notification_list, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {

        recyclerView = rootView.notification_list
        var layoutManager = LinearLayoutManager(context)
        recyclerView.setLayoutManager(layoutManager)
        recyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        recyclerView.adapter = NotificationListAdapter()

    }

    companion object {
        fun newInstances(): NotificationFragment {
            var fragment = NotificationFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}