package com.example.gamer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class authPage : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth_page)
        val resendcode = findViewById<View>(R.id.resendCode)
        resendcode.setOnClickListener(){
            val snack = Snackbar.make(it,"Comming soon :)", Snackbar.LENGTH_LONG)
            snack.show()
        }

        val bntVerify=  findViewById<Button>(R.id.bntVerify)
        bntVerify.setOnClickListener(){
        val digit1 = findViewById<EditText>(R.id.digit1)
            val digit2 = findViewById<EditText>(R.id.digit2)
            val digit3 = findViewById<EditText>(R.id.digit3)
            val digit4 = findViewById<EditText>(R.id.digit4)

        val enteredText1 = digit1.text.toString()
            val enteredText2 = digit2.text.toString()
            val enteredText3 = digit3.text.toString()
            val enteredText4 = digit4.text.toString()

            if (enteredText1 == "1" && enteredText2 =="3" && enteredText3 == "3" && enteredText4 == "7")
                startActivity(Intent(this, HomeActivity::class.java))

        }
}
}