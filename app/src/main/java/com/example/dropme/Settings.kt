package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        //settings button

        //Book button

        val bookButton = findViewById<Button>(R.id.button7)
        bookButton.setOnClickListener {
            val intent = Intent(this, PaymentScreen::class.java)
            startActivity(intent)
        }
    }
}