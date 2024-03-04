package com.example.mediclick

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
//import com.chaquo.python.Python
//import com.chaquo.python.android.AndroidPlatform

open class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.main_activity)

                val containerLayout: RelativeLayout = findViewById(R.id.containerLayout)
                containerLayout.setOnClickListener {
                        // Handle the click action here, navigate to HealthTipsActivity
                        val intent = Intent(this@MainActivity, Page0Activity::class.java)
                        startActivity(intent)
                }
        }
}
