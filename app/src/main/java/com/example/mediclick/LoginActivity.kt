package com.example.mediclick

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

open class LoginActivity : SignupActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Assuming you have a button with the ID "myButton" in your activity_page0.xml layout
        val myButton: ImageView = findViewById(R.id.imageView14)

        // Set onClickListener for the button
        myButton.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, FeatureActivity::class.java)
            startActivity(intent)
        }
    }
}