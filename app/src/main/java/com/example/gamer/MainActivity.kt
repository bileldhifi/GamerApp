package com.example.gamer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking {
            installSplashScreen()
            delay(2000)
        }
       setContentView(R.layout.activity_loginpage)

        val btn = findViewById<View>(R.id.buttongoogle)
        val btn1 = findViewById<View>(R.id.buttonfacebook)


        btn.setOnClickListener {
            val snack = Snackbar.make(it,"Comming soon :)",Snackbar.LENGTH_LONG)
            snack.show()
        }
        btn1.setOnClickListener {
            val snack = Snackbar.make(it,"Comming soon :)",Snackbar.LENGTH_LONG)
            snack.show()
        }

        val btnLogin = findViewById<View>(R.id.btnForgetPass)
        btnLogin.setOnClickListener() {
            val intent = Intent(this, forgetPassPage::class.java)
            startActivity(intent)
            showToast("Button clicked !")
        }

        val btnregistre = findViewById<View>(R.id.btnregistre)
        btnregistre.setOnClickListener() {
            val intent = Intent(this, registrePage::class.java)
            startActivity(intent)
            showToast("Button clicked !")
        }

      /*  val btnSubmit = findViewById<View>(R.id.btnSubmit)
        btnSubmit.setOnClickListener() {
            val intent = Intent(this, loginPage::class.java)
            startActivity(intent)
        }*/

}
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

class Register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registre_page)

    }
}}