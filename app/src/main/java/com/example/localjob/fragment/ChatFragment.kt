package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.localjob.R

import kotlinx.android.synthetic.main.fragment_chat_list.view.*

/**
 * Created by schecterza on 7/18/2017 AD.
 */

class ChatFragment: Fragment() {

    lateinit var list1: LinearLayout
    lateinit var list2: LinearLayout

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_chat_list, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {

        list1 = rootView.list1
        list2 = rootView.list2

        list1.setOnClickListener(myOnClick)
        list2.setOnClickListener(myOnClick)



    }

    var myOnClick = View.OnClickListener{ v ->
        when(v.id) {
            R.id.list1 -> goToChatData()
            R.id.list2 -> goToChatData()
        }
    }

    fun goToChatData() {
        fragmentManager.beginTransaction()
                .replace(R.id.content_container, ChatDataFragment.newInstances())
                .addToBackStack(null)
                .commit()
    }


    companion object {
        fun newInstances(): ChatFragment {
            var fragment = ChatFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}