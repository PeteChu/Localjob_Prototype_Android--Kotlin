package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.localjob.R
import kotlinx.android.synthetic.main.fragment_profile.view.*

/**
 * Created by schecterza on 7/19/2017 AD.
 */

class ProfileFragment: Fragment() {

    lateinit var userProfile: LinearLayout

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_profile, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {

        userProfile = rootView.user_profile
        userProfile.setOnClickListener(myOnClick)

    }

    var myOnClick = View.OnClickListener {v ->
        when(v.id) {
            R.id.user_profile -> {
                fragmentManager.beginTransaction()
                        .replace(R.id.content_container, UserProfileFragment.newInstances())
                        .addToBackStack(null)
                        .commit()
            }
        }
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