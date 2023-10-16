package com.example.gamer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class registrePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registre_page)

        val btnPolicy = findViewById<View>(R.id.btnPolicy)
        btnPolicy.setOnClickListener(){
            val snack = Snackbar.make(it,"Comming soon :)",Snackbar.LENGTH_LONG)
            snack.show()
        }
    }
}
