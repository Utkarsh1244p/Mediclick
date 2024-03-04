package com.example.mediclick

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

open class NutritionalAnalysis : HealthTipsActivity() {

    private lateinit var layout1: ConstraintLayout
    private lateinit var layout2: ConstraintLayout
    private lateinit var layout3: ConstraintLayout
    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var constraintLayout2: ConstraintLayout
    private lateinit var constraintLayout3: ConstraintLayout
    private lateinit var constraintLayout4: ConstraintLayout
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var queryEditText: EditText
    private lateinit var R1: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nutrition_analysis)

        // Find the ProgressBar by its ID
        progressBar = findViewById(R.id.progressBar)
        queryEditText = findViewById(R.id.editTextContainer1)

        // Find the ConstraintLayouts by their IDs
        layout1 = findViewById(R.id.Layout1)
        layout2 = findViewById(R.id.Layout2)
        layout3 = findViewById(R.id.Layout3)
        R1 = findViewById(R.id.relativeLayout1)

        // Find the TextViews by their IDs
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val textView3: TextView = findViewById(R.id.textView3)
        val textViewa: TextView = findViewById(R.id.textViewa)
        val textViewb: TextView = findViewById(R.id.textViewb)
        val textViewc: TextView = findViewById(R.id.textViewc)

        // Find the Buttons by their IDs
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)

        // Find the ConstraintLayouts by their IDs
        constraintLayout = findViewById(R.id.constraintLayout)
        constraintLayout2 = findViewById(R.id.constraintLayout2)
        constraintLayout3 = findViewById(R.id.constraintLayout3)
        constraintLayout4 = findViewById(R.id.constraintLayout4)

        button1.setOnClickListener {
            R1.visibility = View.GONE
            constraintLayout.visibility = View.GONE
            val userQuery = queryEditText.text.toString().trim()
            progressBar.visibility = View.VISIBLE // Show progress bar

            // Simulate a delay for demonstration purposes
            Handler().postDelayed({
                analyzeQuery(userQuery)
                progressBar.visibility = View.GONE // Hide progress bar
            }, 5000) // Adjust this delay as needed

            analyzeQuery(userQuery)

            // Create an intent and pass the user query to the next activity
//            val intent = Intent(this@NutritionalAnalysis, NA1::class.java)
//            intent.putExtra("userQuery", userQuery)
//            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this@NutritionalAnalysis, NA2::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this@NutritionalAnalysis, NA3::class.java)
            startActivity(intent)
        }

        // Set click listeners for each View
        textViewa.setOnClickListener {
            // Handle the click for Layout1
            updateLayoutBackground(layout1, R.drawable.round_b)
            updateTextColor(textView1, R.color.white)

            // Hide existing views
            constraintLayout.visibility = View.GONE
            constraintLayout2.visibility = View.VISIBLE
        }

        textViewb.setOnClickListener {
            // Handle the click for Layout1
            updateLayoutBackground(layout2, R.drawable.round_b)
            updateTextColor(textView2, R.color.white)

            // Hide existing views
            constraintLayout.visibility = View.GONE
            constraintLayout4.visibility = View.VISIBLE
            button6.visibility = View.VISIBLE
        }

        textViewc.setOnClickListener {
            // Handle the click for Layout1
            updateLayoutBackground(layout3, R.drawable.round_b)
            updateTextColor(textView3, R.color.white)

            // Hide existing views
            constraintLayout.visibility = View.GONE
            constraintLayout3.visibility = View.VISIBLE
            button5.visibility = View.VISIBLE
        }

        textView1.setOnClickListener {
            // Handle the click for textView1
            updateLayoutBackground(layout1, R.drawable.round_b)
            updateTextColor(textView1, R.color.white)

            // Reset other layouts and text colors to default state
            updateLayoutBackground(layout2, R.drawable.round)
            updateLayoutBackground(layout3, R.drawable.round)
            updateTextColor(textView2, R.color.black)
            updateTextColor(textView3, R.color.black)

            // Hide existing views
            constraintLayout.visibility = View.GONE
            constraintLayout2.visibility = View.VISIBLE
            constraintLayout3.visibility = View.GONE
            constraintLayout4.visibility = View.GONE
        }

        textView2.setOnClickListener {
            // Handle the click for textView2
            updateLayoutBackground(layout2, R.drawable.round_b)
            updateTextColor(textView2, R.color.white)

            // Reset other layouts and text colors to default state
            updateLayoutBackground(layout1, R.drawable.round)
            updateLayoutBackground(layout3, R.drawable.round)
            updateTextColor(textView1, R.color.black)
            updateTextColor(textView3, R.color.black)

            // Hide existing views
            constraintLayout.visibility = View.GONE
            constraintLayout4.visibility = View.VISIBLE
            constraintLayout2.visibility = View.GONE
            constraintLayout3.visibility = View.GONE
        }

        textView3.setOnClickListener {
            // Handle the click for textView3
            updateLayoutBackground(layout3, R.drawable.round_b)
            updateTextColor(textView3, R.color.white)

            // Reset other layouts and text colors to default state
            updateLayoutBackground(layout1, R.drawable.round)
            updateLayoutBackground(layout2, R.drawable.round)
            updateTextColor(textView1, R.color.black)
            updateTextColor(textView2, R.color.black)

            // Hide existing views
            constraintLayout.visibility = View.GONE
            constraintLayout3.visibility = View.VISIBLE
            constraintLayout2.visibility = View.GONE
            constraintLayout4.visibility = View.GONE
        }

        button4.setOnClickListener {
            constraintLayout.visibility = View.VISIBLE
            constraintLayout3.visibility = View.GONE
            constraintLayout2.visibility = View.GONE
            constraintLayout4.visibility = View.GONE
        }

        button5.setOnClickListener {
            constraintLayout.visibility = View.VISIBLE
            constraintLayout3.visibility = View.GONE
            constraintLayout2.visibility = View.GONE
            constraintLayout4.visibility = View.GONE
        }

        button6.setOnClickListener {
            constraintLayout.visibility = View.VISIBLE
            constraintLayout3.visibility = View.GONE
            constraintLayout2.visibility = View.GONE
            constraintLayout4.visibility = View.GONE
        }
    }

    private fun updateLayoutBackground(@NonNull layout: ConstraintLayout, bgDrawableResId: Int) {
        layout.setBackgroundResource(bgDrawableResId)
    }

    private fun updateTextColor(@NonNull textView: TextView, textColorResId: Int) {
        textView.setTextColor(ContextCompat.getColor(this, textColorResId))
    }

    private fun analyzeQuery(userQuery: String) {
        Log.d(TAG, "User Query: $userQuery")

        if (!userQuery.isEmpty()) {
            if (userQuery.contains(",")) {
                // Show an error message for using commas in the query
                Toast.makeText(this, "Do not use commas between items instead use spaces", Toast.LENGTH_SHORT).show()
            } else if (userQuery.length > 1500) {
                // Show an error message if query exceeds character limit
                Toast.makeText(this, "Query cannot exceed 1500 characters", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
