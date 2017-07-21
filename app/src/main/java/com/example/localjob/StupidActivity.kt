package com.example.localjob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.localjob.fragment.SearchFragment
import com.example.localjob.fragment.WorkDetailFragment

class StupidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stupid)

        initInstances()
    }

    fun initInstances() {

        var intent = intent
        var view = intent.extras["view"]

        when(view) {
            "search" -> {
                supportFragmentManager.beginTransaction()
                        .add(R.id.stupid_container, SearchFragment.newInstances())
                        .commit()
            }
            "work" -> {
                supportFragmentManager.beginTransaction()
                        .add(R.id.stupid_container, WorkDetailFragment.newInstances())
                        .commit()
            }
        }


    }
}
