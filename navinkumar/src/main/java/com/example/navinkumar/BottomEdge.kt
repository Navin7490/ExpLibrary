package com.example.navinkumar

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.provider.SyncStateContract
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.contentValuesOf
import com.example.navinkumar.util.Constans
import com.example.navinkumar.util.CustomEdge
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel

class BottomEdge {

    companion object{

        fun setBottomEdge(context: Context,color: Int):MaterialShapeDrawable {
            val arcRadius = Constans.getIntFromDp("95", context) / 2

            val sam = ShapeAppearanceModel.builder()
                .setAllCorners(CornerFamily.ROUNDED, 36f)
                .setTopEdge(CustomEdge(arcRadius, 0))
                .setBottomEdge(CustomEdge(arcRadius, 0))
                .build()
            val msd = MaterialShapeDrawable(sam)


            msd.setTint(ContextCompat.getColor(context, color))
            msd.paintStyle = Paint.Style.FILL
            msd.elevation = 6f

            return msd
        }


    }



}