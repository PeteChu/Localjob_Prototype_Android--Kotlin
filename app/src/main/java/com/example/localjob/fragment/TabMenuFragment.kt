package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.localjob.R
import kotlinx.android.synthetic.main.fragment_tabmenu.*
import kotlinx.android.synthetic.main.fragment_tabmenu.view.*



class TabMenuFragment : Fragment() {

    lateinit var btnHome: LinearLayout
    lateinit var btnChat: LinearLayout
    lateinit var btnNoti: LinearLayout
    lateinit var btnProfile: LinearLayout
    lateinit var iconHome:ImageView
    lateinit var iconChat:ImageView
    lateinit var iconNoti:ImageView
    lateinit var iconPro:ImageView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_tabmenu, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {
        iconHome = rootView.home
        iconChat = rootView.chat
        iconNoti = rootView.nofi
        iconPro = rootView.pro
        btnHome = rootView.tab_menu_home
        btnChat = rootView.tab_menu_chat
        btnNoti = rootView.tab_menu_notification
        btnProfile = rootView.tab_menu_profile
        changColor(1)
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
        changColor(1)
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, MainFragment.newInstance())
                .commit()
    }

    fun goToChatView() {
        changColor(2)
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, ChatFragment.newInstances())
                .commit()
    }

    fun goToNotiView() {
        changColor(3)
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, NotificationFragment.newInstances())
                .commit()
    }

    fun goToProfileView() {
        changColor(4)
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, ProfileFragment.newInstances())
                .commit()
    }

    fun changColor(color:Int){
        removeColor()
        when(color){
            1 ->iconHome.setImageResource(R.drawable.ic_home_blue)
            2 ->iconChat.setImageResource(R.drawable.ic_chat_blue)
            3->iconNoti.setImageResource(R.drawable.ic_notification_blue)
            4->iconPro.setImageResource(R.drawable.ic_profile_blue)
        }

    }
    fun removeColor(){
        iconHome.setImageResource(R.drawable.ic_home)
        iconChat.setImageResource(R.drawable.ic_chat)
        iconNoti.setImageResource(R.drawable.ic_notification)
        iconPro.setImageResource(R.drawable.ic_profile)
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