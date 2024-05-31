package com.example.aplikasiberita.secondActivty

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.aplikasiberita.MainActivity
import com.example.aplikasiberita.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val cvLink : CardView = findViewById(R.id.cvGroup)

        cvLink.setOnClickListener() {
            openUrl("https://news.google.com/articles/CBMibmh0dHBzOi8vd3d3LmNoYW5uZWxuZXdzYXNpYS5jb20vYXNpYS9pbmRvbmVzaWEtdGFwZXJhLXB1YmxpYy1ob3VzaW5nLXNhdmluZ3MtZnVuZC1qb2tvd2ktMy1jZW50LXNhbGFyeS00MzcwODg20gEA?hl=en-ID&gl=ID&ceid=ID%3Aen")
        }

        /*
            | Kode Ini Untuk Memberikan Logika Ketika Di Klik Salah Satu Item
            | Akan Mengarahkan Ke Activity Lainnya
        */
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

    /*
        | Kode Ini Untuk Mengkonversi URL / Link Berita Ke Halaman WEB Terkait
    */
    private fun openUrl(link: String) {
        val uri = Uri.parse (link)
        val intent = Intent(Intent.ACTION_VIEW, uri)

        startActivity(intent)
    }
}