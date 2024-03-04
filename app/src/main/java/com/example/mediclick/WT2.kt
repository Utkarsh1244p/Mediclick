package com.example.mediclick

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import okhttp3.Call
import java.io.IOException

open class WT2 : WT1() {

    private lateinit var butt: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var editText: EditText
    private lateinit var textInputEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.w_t_2)

        butt = findViewById(R.id.butt)
        progressBar = findViewById(R.id.progressBar1)
        editText = findViewById(R.id.editText)
        textInputEditText = findViewById(R.id.textInputEditText)

        butt.setOnClickListener {
            showProgressBar()
            // Perform any additional logic or validation here before navigating

            // Example: Get values from EditText fields
            val longitude = editText.text.toString()
            val latitude = textInputEditText.text.toString()
            val userCity = intent.getStringExtra("userCity")

            // Example: Pass data to the next activity (WT3)
//            val intent = Intent(this, WT3::class.java)
            intent.putExtra("userCity", userCity) // Pass userCity to WT2
            intent.putExtra("longitude", longitude)
            intent.putExtra("latitude", latitude)

            // Start the next activity
            startActivity(intent)
        }
    }

    private fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
        // You can add additional logic for ProgressBar customization or handling
    }

    open fun onFailure(call: Call, e: IOException) {}
}
