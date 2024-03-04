package com.example.mediclick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

open class Page3Activity : Page2Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        // Assuming you have a button with the ID "myButton" in your activity_page0.xml layout
        val myButton: ImageView = findViewById(R.id.imageView27)

        // Set onClickListener for the button
        myButton.setOnClickListener {
            // Handle the click event, e.g., start a new activity
            val intent = Intent(this, Page4Activity::class.java)
            startActivity(intent)
        }
    }
}