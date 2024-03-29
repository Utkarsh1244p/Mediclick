package com.example.mediclick

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

open class FeatureActivity : SignupActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        // Assuming you have a button with the ID "myButton" in your activity_page0.xml layout

        val myButtona: ImageView = findViewById(R.id.imageView111)
        val myButtonb: ImageView = findViewById(R.id.imageView112)
        val myButtonc: ImageView = findViewById(R.id.imageView113)
        val myButtond: ImageView = findViewById(R.id.imageView114)
        val myButtone: ImageView = findViewById(R.id.imageView115)
        val myButtonf: ImageView = findViewById(R.id.imageView116)

        // Set onClickListener for the button
        myButtona.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, HP1::class.java)
            startActivity(intent)
        }
        myButtonb.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, NA1::class.java)
            startActivity(intent)
        }
        myButtonc.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, KYM1::class.java)
            startActivity(intent)
        }
        myButtond.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, AirActivity::class.java)
            startActivity(intent)
        }
        myButtone.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, ER1::class.java)
            startActivity(intent)
        }
        myButtonf.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, IP1::class.java)
            startActivity(intent)
        }


    }
}
