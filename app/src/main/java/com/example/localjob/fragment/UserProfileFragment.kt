package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.*
import com.example.localjob.R
import kotlinx.android.synthetic.main.fragment_user_profile.view.*

/**
 * Created by schecterza on 7/20/2017 AD.
 */

class UserProfileFragment : Fragment() {

    lateinit var mToolbar: Toolbar

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_user_profile, container, false)
        initInstances(rootView)
        return rootView
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater!!.inflate(R.menu.edit_profile, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }


    fun initInstances(rootView: View) {

        var activity = activity as AppCompatActivity
        mToolbar = rootView.user_profile_toolbar
        mToolbar.title = ""
        setHasOptionsMenu(true)
        activity.setSupportActionBar(mToolbar)

        var actionBar = activity.supportActionBar!!
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

    }

    companion object {
        fun newInstances(): UserProfileFragment {
            var fragment = UserProfileFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}