package com.example.localjob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.localjob.fragment.MainFragment
import com.example.localjob.fragment.TabMenuFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initInstances()
    }

    fun initInstances() {

        supportFragmentManager.beginTransaction()
                .add(R.id.content_container, MainFragment.newInstance())
                .commit()

        supportFragmentManager.beginTransaction()
                .add(R.id.tab_menu_container, TabMenuFragment.newInstances())
                .commit()
    }
}
