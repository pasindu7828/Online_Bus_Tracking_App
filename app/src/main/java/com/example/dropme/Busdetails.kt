package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Busdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_busdetails)

        //home image button

        val imageButton = findViewById<ImageButton>(R.id.imageButton9)

        imageButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        //see more button

        val seeButton = findViewById<Button>(R.id.button11)
        seeButton.setOnClickListener {
            val intent = Intent(this, Viewbus::class.java)
            startActivity(intent)
        }

    }
}