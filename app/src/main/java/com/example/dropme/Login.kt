package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        //sign up Button

        val nextButton = findViewById<Button>(R.id.sbutton)
        nextButton.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        //login button

        val loginButton = findViewById<Button>(R.id.lbutton)

        loginButton.setOnClickListener {
            // Navigate to HomeActivity
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)

            // Finish LoginActivity so user can't go back
            finish()

        }
    }
}