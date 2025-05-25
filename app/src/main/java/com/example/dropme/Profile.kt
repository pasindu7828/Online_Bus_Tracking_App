package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        //Home image button

        val imageButton = findViewById<ImageButton>(R.id.imageButton9)

        imageButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        //Location & Bus Details image button

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton10)

        imageButton1.setOnClickListener {
            val intent = Intent(this, BusScreen::class.java)
            startActivity(intent)
        }


        //Notification image button

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton11)

        imageButton3.setOnClickListener {
            val intent = Intent(this, NotificationScreen::class.java)
            startActivity(intent)
        }


        //profile image button

        val imageButton4 = findViewById<ImageButton>(R.id.imageButton12)

        imageButton4.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        //settings button

        val settingButton = findViewById<Button>(R.id.button4)
        settingButton.setOnClickListener {
            val intent = Intent(this, SettingScreen::class.java)
            startActivity(intent)
        }

        //booking history

        val historyButton = findViewById<Button>(R.id.button5)
        historyButton.setOnClickListener {
            val intent = Intent(this, HistoryScreen::class.java)
            startActivity(intent)
        }


    }
}