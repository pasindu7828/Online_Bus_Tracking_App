package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Onboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1)

        //Back button
        val backButton = findViewById<Button>(R.id.backButton)
        // Set OnClickListener for the Back button
        backButton.setOnClickListener {
            val intent = Intent(this, welcome::class.java) // Navigate to Welcome screen
            startActivity(intent)
            finish() // Close the current activity
        }

        //Next Button

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(this, Onboard2::class.java)
            startActivity(intent)
        }





    }

}