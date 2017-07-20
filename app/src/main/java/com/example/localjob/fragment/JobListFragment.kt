package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.localjob.R
import com.example.localjob.adapter.CategoryListAdapter
import com.example.localjob.toolbar.SearchToolbar
import com.malinskiy.superrecyclerview.SuperRecyclerView
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * Created by schecterza on 7/18/2017 AD.
 */

class JobListFragment: Fragment() {



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_job_list, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {




    }



    companion object {
        fun newInstance(): JobListFragment {
            var fragment = JobListFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}