package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        var tvText = findViewById<TextView>(R.id.tvText)
        var clMain = findViewById<ConstraintLayout>(R.id.clMain)
        var etDayNight = findViewById<EditText>(R.id.etDayNight)
        var changeBtn = findViewById<Button>(R.id.changeBtn)



        changeBtn.setOnClickListener {
            var userInput = etDayNight.text.toString()
            if (userInput.equals(ConstantValue.option1, true)){
                ConstantValue.changeBackground(clMain, 0)
             }else if (userInput.equals(ConstantValue.option2, true)){
                ConstantValue.changeBackground(clMain, 1)
            }
        }
    }
}

class ConstantValue {
    companion object {
       const val option1 = "Day"
       const val option2 = "Night"

        fun changeBackground(activity: View, day : Int){
            when(day){
                0 -> activity.setBackgroundResource(R.drawable.day)
                1 -> activity.setBackgroundResource(R.drawable.night)
            }
    }

    }
}
