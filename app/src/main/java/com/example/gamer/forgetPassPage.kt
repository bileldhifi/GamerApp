package com.example.gamer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forgetPassPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_pass_page)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener() {
            val intent = Intent(this, authPage::class.java)
            startActivity(intent)

        }
        }
    }
