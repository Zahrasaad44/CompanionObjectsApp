package com.example.companionobjectsapp

import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class Time {
    companion object {

        fun makeDay(layout: ConstraintLayout, text: TextView) {
            layout.setBackgroundResource(R.drawable.day)
            text.setTextColor(Color.BLACK)
        }

        fun makeNight(layout: ConstraintLayout, text: TextView){
            layout.setBackgroundResource(R.drawable.night)
            text.setTextColor(Color.WHITE)
        }



//        fun makeDay(layout: ConstraintLayout, text: TextView, field: EditText, btn: Button) {
//           layout.setBackgroundResource(R.drawable.day)
//            text.setTextColor(Color.BLACK)
//            field.setTextColor(Color.BLACK)
//            btn.setBackgroundColor(Color.parseColor("#F3A738"))
//        }

//        fun makeNight(layout: ConstraintLayout, text: TextView, field: EditText, btn: Button){
//            layout.setBackgroundResource(R.drawable.night)
//            text.setTextColor(Color.WHITE)
//            field.setTextColor(Color.WHITE)
//            btn.setBackgroundColor(Color.parseColor("#939CD1"))
//        }

    }

}