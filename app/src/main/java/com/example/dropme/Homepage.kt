package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)


        //After click submit button

        val submitButton = findViewById<Button>(R.id.subhomebutton)
        submitButton.setOnClickListener {
            val intent = Intent(this, Busdetails::class.java)
            startActivity(intent)
        }
    }
}