package com.example.navinkumar

import android.content.Context
import android.widget.Toast

class ToasterNavin {

    fun NavinToast(context: Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }

}