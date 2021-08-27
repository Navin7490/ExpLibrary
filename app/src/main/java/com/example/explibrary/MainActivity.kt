package com.example.explibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navinkumar.ToasterNavin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToasterNavin().NavinToast(this,"Hello Navin")
    }
}