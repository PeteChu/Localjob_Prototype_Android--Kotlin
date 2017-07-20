package com.example.localjob.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks
import com.github.ksoichiro.android.observablescrollview.ScrollState
import kotlinx.android.synthetic.main.fragment_work_detail.view.*




/**
 * Created by schecterza on 7/19/2017 AD.
 */

class WorkDetailFragment : Fragment(), ObservableScrollViewCallbacks {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_work_detail, container, false)
        initInstances(rootView)
        return rootView
    }

    fun initInstances(rootView: View) {

    }

    override fun onUpOrCancelMotionEvent(scrollState: ScrollState?) {

    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onScrollChanged(scrollY: Int, firstScroll: Boolean, dragging: Boolean) {

    }

    override fun onDownMotionEvent() {

    }

    companion object {
        fun newInstances(): WorkDetailFragment {
            var fragment = WorkDetailFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}