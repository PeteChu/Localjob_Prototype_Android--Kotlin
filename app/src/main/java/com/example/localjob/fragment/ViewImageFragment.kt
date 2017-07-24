package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R
import kotlinx.android.synthetic.main.fragment_view_image.view.*

/**
 * Created by schecterza on 7/24/2017 AD.
 */

class ViewImageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_view_image, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {
        rootView.view_image.setBackgroundResource(R.drawable.centralhome)
    }

    companion object {
        fun newInstances(): ViewImageFragment {
            var fragment = ViewImageFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}