package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.afollestad.materialdialogs.MaterialDialog
import com.example.localjob.MainActivity
import com.example.localjob.R
import kotlinx.android.synthetic.main.fragment_job_list.view.*


/**
 * Created by schecterza on 7/18/2017 AD.
 */

class JobListFragment: Fragment() {
    lateinit var back : ImageView
    lateinit var filter : ImageView
    lateinit var dialog : MaterialDialog


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_job_list, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {
        back = rootView.category_btnback
        filter = rootView.filter_category
        dialog = MaterialDialog.Builder(activity)
                .customView(DialogFilter(context),true)
                .positiveText("yes")
                .negativeText("no")
                .build()
        filter.setOnClickListener(ClickFilter())
        back.setOnClickListener{
            (activity as MainActivity).onBackPressed()
        }



    }
    fun ClickFilter() = View.OnClickListener {

            dialog.show()

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