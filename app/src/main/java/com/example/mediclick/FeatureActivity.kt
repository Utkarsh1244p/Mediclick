package com.example.mediclick

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import com.example.mediclick.presentation.activity.BMI

open class FeatureActivity : SignupActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        // Assuming you have a button with the ID "myButton" in your activity_page0.xml layout
        val myButtonw: ImageView = findViewById(R.id.imageView20)
        val myButtonu: ImageView = findViewById(R.id.imageView21)
        val myButtond: ImageView = findViewById(R.id.imageView22)
        val myButtont: ImageView = findViewById(R.id.imageView23)
        val myButtonq: ImageView = findViewById(R.id.imageView24)
//        val myButtonc: ImageView = findViewById(R.id.imageView26)
        val myButtony: ImageView = findViewById(R.id.imageView25)

        // Set onClickListener for the button
        myButtonw.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, BMI::class.java)
            startActivity(intent)
        }
        myButtonu.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, ER1::class.java)
            startActivity(intent)
        }
        myButtond.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, NutritionalAnalysis::class.java)
            startActivity(intent)
        }
//        myButtont.setOnClickListener {
//            // Handle the click event, e.g., start a new activity
//            val intent = Intent(this, AirActivity::class.java)
//            startActivity(intent)
//        }
        myButtonq.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, AirActivity::class.java)
            startActivity(intent)
        }
//        myButtonc.setOnClickListener {
//            // Handle the click event, e.g., start a new activity
//            val intent = Intent(this, ER1::class.java)
//            startActivity(intent)
//        }
        myButtony.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, YogaAndMeditation::class.java)
            startActivity(intent)
        }

    }
}
