package com.example.explibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.navinkumar.BottomEdge


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val textView= findViewById<ConstraintLayout>(R.id.containerView)

        textView?.background=BottomEdge.setTopEdge(this,R.color.purple_700,100f)

    }
}