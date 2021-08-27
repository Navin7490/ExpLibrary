package com.example.navinkumar.util

import android.content.Context
import android.util.TypedValue
import kotlin.math.roundToInt

class Constans {

    companion object{
        fun getIntFromDp(value: String, context: Context): Int {
            return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                value.toFloat(),
                context.resources.displayMetrics
            ).roundToInt()
        }
    }

}