package com.example.gamer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Store -> loadFragment(Store())
                R.id.User -> loadFragment(User())
                R.id.News -> loadFragment(News())
            }
            true
        }

        // Set the default fragment
        if (savedInstanceState == null) {
            loadFragment(News())
        }
    }
    private fun loadFragment(fragment : Fragment){
           supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
        // remove alert button from News fragment //
        val btncart = findViewById<ImageButton>(R.id.cart)
        if (fragment is News || fragment is User) {
            btncart.visibility = View.GONE
        } else {
            btncart.visibility = View.VISIBLE
        }
        //  END remove alert button from News fragment //
        // fragment title //
        val fragmentTitle = findViewById<TextView>(R.id.fragmentTitle)
        when (fragment) {
            is News -> fragmentTitle.text = "News"
            is User -> fragmentTitle.text = "Profile"
            else -> fragmentTitle.text = "Store"
        }

        // END fragment title //

    }

}
