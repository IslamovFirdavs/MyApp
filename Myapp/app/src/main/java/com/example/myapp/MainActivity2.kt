package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val secondActivity2 = findViewById<Button>(R.id.ProfileBtn)
        secondActivity2.setOnClickListener {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}