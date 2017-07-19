package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R

/**
 * Created by schecterza on 7/19/2017 AD.
 */

class ProfileFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_profile, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {

    }

    companion object {
        fun newInstances(): ProfileFragment {
            var fragment = ProfileFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}