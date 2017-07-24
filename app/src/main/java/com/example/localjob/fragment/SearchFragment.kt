package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.localjob.R
import com.malinskiy.superrecyclerview.SuperRecyclerView
import com.rengwuxian.materialedittext.MaterialEditText
import kotlinx.android.synthetic.main.fragment_search.view.*

/**
 * Created by schecterza on 7/21/2017 AD.
 */

class SearchFragment : Fragment() {

    lateinit var mToolbar: Toolbar
    lateinit var mEditText: MaterialEditText
    lateinit var mRecyclerView: SuperRecyclerView

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


        mToolbar.setNavigationOnClickListener { v ->
            activity.onBackPressed()
        }

        var actionBar = activity.supportActionBar!!
        actionBar.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

        mEditText = rootView.search_bar

        rootView.test_tag1.setOnClickListener(myOnClick)
        rootView.test_tag2.setOnClickListener(myOnClick)
        rootView.test_tag3.setOnClickListener(myOnClick)
        rootView.test_tag4.setOnClickListener(myOnClick)
        rootView.test_tag5.setOnClickListener(myOnClick)


    }

    var myOnClick = View.OnClickListener { v ->
        when (v.id) {
            R.id.test_tag1 -> {
                onClick(v)
            }
            R.id.test_tag2 -> {
                onClick(v)
            }
            R.id.test_tag3 -> {
                onClick(v)
            }
            R.id.test_tag4 -> {
                onClick(v)
            }
            R.id.test_tag5 -> {
                onClick(v)
            }
        }
    }

    fun onClick(v: View) {
        var tag = (v as TextView).text
        mEditText.append(tag.toString() + ", ")
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