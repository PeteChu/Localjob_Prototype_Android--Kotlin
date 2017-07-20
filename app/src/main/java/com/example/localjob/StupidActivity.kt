package com.example.localjob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.localjob.fragment.WorkDetailFragment

class StupidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stupid)

        initInstances()
    }

    fun initInstances() {

        supportFragmentManager.beginTransaction()
                .add(R.id.stupid_container, WorkDetailFragment.newInstances())
                .commit()

    }
}
