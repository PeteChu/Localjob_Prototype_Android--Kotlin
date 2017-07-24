package com.example.localjob.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.MenuItemCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.ShareActionProvider
import android.support.v7.widget.Toolbar
import android.view.*
import android.widget.ImageView
import com.example.localjob.MainActivity
import com.example.localjob.R
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks
import com.github.ksoichiro.android.observablescrollview.ScrollState
import com.github.ksoichiro.android.observablescrollview.ScrollUtils
import kotlinx.android.synthetic.main.fragment_work_detail.view.*
import com.nineoldandroids.view.ViewHelper


/**
 * Created by schecterza on 7/19/2017 AD.
 */

class WorkDetailFragment : Fragment(), ObservableScrollViewCallbacks {

    lateinit var mToolbarView: Toolbar
    lateinit var mImageView: ImageView
    lateinit var mScrollView: ObservableScrollView
    lateinit var mShareActionProvider: ShareActionProvider
    var mParallaxImageHeight: Int = 0


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_work_detail, container, false)
        initInstances(rootView)
        return rootView
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {

        inflater!!.inflate(R.menu.share, menu)
        super.onCreateOptionsMenu(menu, inflater)

        val item = menu!!.findItem(R.id.menu_item_share)
        mShareActionProvider = MenuItemCompat.getActionProvider(item) as ShareActionProvider
        setShareIntent(createShareIntent())
    }

    private fun setShareIntent(shareIntent: Intent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent)
        }
    }

    private fun createShareIntent(): Intent {

        val myShareIntent = Intent(Intent.ACTION_SEND)
        myShareIntent.type = "text/plain"
        val appUrl = "TEST"
        myShareIntent.putExtra(Intent.EXTRA_TEXT, appUrl)

        return myShareIntent
    }


    fun initInstances(rootView: View) {
        setHasOptionsMenu(true)

        var activity = activity as AppCompatActivity
        activity.setSupportActionBar(rootView.toolbar)
        var actionbar = activity.supportActionBar!!
        actionbar.setDisplayShowHomeEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.title = "Central Plaza Ubonratchathani"

        mImageView = rootView.image
        mImageView.setOnClickListener {
            fragmentManager.beginTransaction()
                    .replace(R.id.stupid_container, ViewImageFragment.newInstances())
                    .addToBackStack(null)
                    .commit()
        }

        mToolbarView = rootView.toolbar
        mToolbarView.setBackgroundColor(ScrollUtils.getColorWithAlpha(0f, resources.getColor(R.color.primary)))

        mToolbarView.setNavigationOnClickListener { v ->
            activity.onBackPressed()
        }

        mScrollView = rootView.scroll
        mScrollView.setScrollViewCallbacks(this)
        mParallaxImageHeight = resources.getDimensionPixelSize(R.dimen.parallax_image_height)

    }

    override fun onUpOrCancelMotionEvent(scrollState: ScrollState?) {

    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        onScrollChanged(mScrollView.scrollY, false, false);
    }

    override fun onScrollChanged(scrollY: Int, firstScroll: Boolean, dragging: Boolean) {
        val baseColor = resources.getColor(R.color.primary)
        val alpha = Math.min(1.toFloat(), (scrollY / mParallaxImageHeight).toFloat())
        mToolbarView.setBackgroundColor(ScrollUtils.getColorWithAlpha(alpha, baseColor))
        ViewHelper.setTranslationY(mImageView, (scrollY / 2).toFloat())
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