package com.example.localjob.fragment

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.example.localjob.R

class DialogFilter @JvmOverloads constructor(
        context : Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout(context,attrs,defStyleAttr){
    lateinit var fil : LinearLayout
    lateinit var cat : LinearLayout
    lateinit var btnCat : LinearLayout
    lateinit var btnFil : LinearLayout
    init {
        instant()
    }

    fun instant(){
        LayoutInflater.from(context).inflate(R.layout.fragment_dialog_category, this, true)
        fil = findViewById(R.id.menu_Fil) as LinearLayout
        cat = findViewById(R.id.menu_CAT) as LinearLayout
        btnCat = findViewById(R.id.cat) as LinearLayout
        btnFil = findViewById(R.id.fil) as LinearLayout

        btnCat.setOnClickListener{
            fil.visibility = View.INVISIBLE
            cat.visibility = View.VISIBLE
        }
        btnFil.setOnClickListener{
            cat.visibility = View.INVISIBLE
            fil.visibility = View.VISIBLE
        }
    }

}