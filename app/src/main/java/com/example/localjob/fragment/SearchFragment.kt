package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R
import kotlinx.android.synthetic.main.fragment_search.view.*

/**
 * Created by schecterza on 7/21/2017 AD.
 */

class SearchFragment: Fragment() {

    lateinit var mToolbar: Toolbar

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_search, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {

        mToolbar = rootView.toolbar
        mToolbar.navigationIcon = resources.getDrawable(R.drawable.ic_close)
        var activity = activity as AppCompatActivity
        activity.setSupportActionBar(mToolbar)

        var actionBar = activity.supportActionBar!!
        actionBar.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)


    }

    companion object {
        fun newInstances(): SearchFragment {
            var fragment = SearchFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}