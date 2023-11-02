package com.example.myapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActivity = findViewById<Button>(R.id.RegBtn)
        secondActivity.setOnClickListener {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}