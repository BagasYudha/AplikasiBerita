package com.example.aplikasiberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.aplikasiberita.secondActivty.SecondActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.for_you -> {
                    val intent = Intent(this, MainActivity::class.java)
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                    true
                }
                R.id.trending -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                    true
                }
                // ini untuk berpindha ke activity kategori
//                R.id.account -> {
//                    val intent = Intent(this, AccountActivity::class.java)
//                    startActivity(intent)
//                    true
//                }
                else -> {
                    false
                }
            }
        }
    }
}
