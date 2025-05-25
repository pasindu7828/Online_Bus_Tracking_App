package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Delay of 3 seconds (3000ms) before moving to MainActivity2
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, welcome::class.java))
            finish() // Closes MainActivity so the user can't go back to it
        }, 3000)
    }
}