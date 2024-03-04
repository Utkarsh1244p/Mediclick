package com.example.mediclick

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

open class FeatureActivity : SignupActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        // Assuming you have a button with the ID "myButton" in your activity_page0.xml layout

        val myButtona: ImageView = findViewById(R.id.imageView112)
        val myButtonb: ImageView = findViewById(R.id.imageView114)
        val myButtonc: ImageView = findViewById(R.id.imageView115)

        // Set onClickListener for the button

        myButtona.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, NA1::class.java)
            startActivity(intent)
        }
        myButtonb.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, AirActivity::class.java)
            startActivity(intent)
        }
        myButtonc.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, ER1::class.java)
            startActivity(intent)
        }


    }
}
