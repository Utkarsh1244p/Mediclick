package com.example.mediclick

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

open class HealthTipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.health_tips)

        // Initialize views
        val r1: RelativeLayout = findViewById(R.id.R1)
        val r2: RelativeLayout = findViewById(R.id.R2)
        val r3: RelativeLayout = findViewById(R.id.R3)
        val r4: RelativeLayout = findViewById(R.id.R4)

        // Set click listeners for the RelativeLayouts
        setClickListener(r1, NutritionalAnalysis::class.java)
//        setClickListener(r2, ER1::class.java)
        setClickListener(r3, WT1::class.java)
        setClickListener(r4, YogaAndMeditation::class.java)

        // Call initialization method
        initState()
    }

    private fun setClickListener(layout: RelativeLayout, destinationClass: Class<*>) {
        layout.setOnClickListener {
            val intent = Intent(this@HealthTipsActivity, NutritionalAnalysis::class.java)
            startActivity(intent)
        }
    }

    private fun initState() {
        // Initialization code here
    }

    override fun onDestroy() {
        super.onDestroy()
        // Call dispose method
        dispose()
    }

    private fun dispose() {
        // Disposal code here
    }

    // Action blocks (methods) here

    // Additional helper methods here
}
