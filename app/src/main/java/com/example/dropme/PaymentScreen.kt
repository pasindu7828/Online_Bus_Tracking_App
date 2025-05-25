package com.example.dropme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment_screen)

        //Pay now button

        val payButton = findViewById<Button>(R.id.button15)
        payButton.setOnClickListener {
            val intent = Intent(this, SuccessScreen::class.java)
            startActivity(intent)
        }

        //cansel button

        val canselButton = findViewById<Button>(R.id.button14)
        canselButton.setOnClickListener {
            val intent = Intent(this, BookingScreen1::class.java)
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