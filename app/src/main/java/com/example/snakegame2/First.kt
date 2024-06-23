package com.example.snakegame2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class First : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)

        val start1 = findViewById<Button>(R.id.start1)

        start1.setOnClickListener {
            val explicitIntent = Intent(this,MainActivity::class.java)
            startActivity(explicitIntent)
            finish()
        }

    }
}