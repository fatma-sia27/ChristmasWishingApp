package com.example.christmaswishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createChristmasWish(view: android.view.View) {

        val intent = Intent(this, XmasGreeting::class.java)
        startActivity(intent)
    }
}