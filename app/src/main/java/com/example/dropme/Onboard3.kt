package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)

        //Back button
        val backButton = findViewById<Button>(R.id.backButton)
        // Set OnClickListener for the Back button
        backButton.setOnClickListener {
            val intent = Intent(this, Onboard2::class.java) // Navigate to Welcome screen
            startActivity(intent)
            finish() // Close the current activity
        }

        //Next Button

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}