package com.example.mediclick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

open class WT1 : HealthTipsActivity() {

    private lateinit var editTextTextMultiLine2: EditText
    private lateinit var buttonz: Button

    protected lateinit var userCity: String // Declare the variable at the class level

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.w_t_1)

        editTextTextMultiLine2 = findViewById(R.id.editTextTextMultiLine2)
        buttonz = findViewById(R.id.buttonz)

        buttonz.setOnClickListener {
            userCity = editTextTextMultiLine2.text.toString().trim()

            if (userCity.isNotEmpty()) {
                // Navigate to WT2
                val intent = Intent(this@WT1, WT2::class.java)
                intent.putExtra("userCity", userCity) // Pass userCity to WT2
                startActivity(intent)
            } else {
                Toast.makeText(this@WT1, "Please enter a city", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
