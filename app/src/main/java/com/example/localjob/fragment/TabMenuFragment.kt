package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.localjob.R
import kotlinx.android.synthetic.main.fragment_tabmenu.*
import kotlinx.android.synthetic.main.fragment_tabmenu.view.*

/**
 * Created by schecterza on 7/18/2017 AD.
 */

class TabMenuFragment : Fragment() {

    lateinit var btnHome: LinearLayout
    lateinit var btnChat: LinearLayout
    lateinit var btnNoti: LinearLayout
    lateinit var btnProfile: LinearLayout

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_tabmenu, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {

        btnHome = rootView.tab_menu_home
        btnChat = rootView.tab_menu_chat
        btnNoti = rootView.tab_menu_notification
        btnProfile = rootView.tab_menu_profile

        btnHome.setOnClickListener(myOnClick)
        btnChat.setOnClickListener(myOnClick)
        btnNoti.setOnClickListener(myOnClick)
        btnProfile.setOnClickListener(myOnClick)


    }

    var myOnClick = View.OnClickListener { v ->
        when (v.id) {
            R.id.tab_menu_home -> goToHomeView()
            R.id.tab_menu_chat -> goToChatView()
            R.id.tab_menu_notification -> goToNotiView()
            R.id.tab_menu_profile -> goToProfileView()
        }
    }

    fun goToHomeView() {
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, MainFragment.newInstance())
                .commit()
    }

    fun goToChatView() {
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, ChatFragment.newInstances())
                .commit()
    }

    fun goToNotiView() {
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, NotificationFragment.newInstances())
                .commit()
    }

    fun goToProfileView() {
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, ProfileFragment.newInstances())
                .commit()
    }


    companion object {
        fun newInstances(): TabMenuFragment {
            var fragment = TabMenuFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}