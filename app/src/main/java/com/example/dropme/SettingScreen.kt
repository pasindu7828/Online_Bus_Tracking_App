package com.example.dropme

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_setting_screen)

        val facebookButton: ImageButton = findViewById(R.id.imageButton) // Replace with your actual ImageButton ID
        facebookButton.setOnClickListener {
            val facebookPageUrl = "https://www.facebook.com/share/16DTdvpMax/"  // Replace with your page link
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookPageUrl))
            startActivity(intent)
        }

        val googleButton: ImageButton = findViewById(R.id.imageButton2) // Replace with your actual ImageButton ID
        googleButton.setOnClickListener {
            val googleUrl = "https://ncgexpress.lk/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(googleUrl))
            startActivity(intent)
        }

        //Home image button

        val imageButton = findViewById<ImageButton>(R.id.imageButton7)

        imageButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        //Location & Bus Details image button

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton8)

        imageButton1.setOnClickListener {
            val intent = Intent(this, BusScreen::class.java)
            startActivity(intent)
        }


        //Notification image button

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton13)

        imageButton3.setOnClickListener {
            val intent = Intent(this, NotificationScreen::class.java)
            startActivity(intent)
        }


        //profile image button

        val imageButton4 = findViewById<ImageButton>(R.id.imageButton15)

        imageButton4.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}