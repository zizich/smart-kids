package ru.surgut.smartkid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStartTracking)
        btnStart.setOnClickListener {
            // Запускаем сервис геолокации
            startService(Intent(this, LocationService::class.java))
        }
    }
}