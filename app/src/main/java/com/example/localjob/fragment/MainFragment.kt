package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import com.example.localjob.R
import com.example.localjob.adapter.CategoryListAdapter
import com.example.localjob.toolbar.SearchToolbar
import com.malinskiy.superrecyclerview.SuperRecyclerView
import kotlinx.android.synthetic.main.fragment_main.view.*
import kotlinx.android.synthetic.main.item_category.view.*

/**
 * Created by schecterza on 7/18/2017 AD.
 */

class MainFragment: Fragment() {
    lateinit var category:View
    lateinit var image:ImageView


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_main, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {
        initSearchToolbar()
        category = rootView.layout_category
        image = category.category1
        image.setOnClickListener {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_container,JobListFragment.newInstance(),"list")

                    .commit()
        }




    }

    fun initSearchToolbar() {
        fragmentManager.beginTransaction()
                .add(R.id.search_toolbar, SearchToolbar.newInstances(),"toolbar")
                .commit()
    }

    companion object {
        fun newInstance(): MainFragment {
            var fragment = MainFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}