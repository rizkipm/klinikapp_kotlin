package com.rizki.appklinik_mi2b

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //splash screen
        //untuk delay beberapa detik, kemudian pindah otomatis ke page berikutnya
        Handler(Looper.getMainLooper()).postDelayed({
            //untuk pindah ke page berikutnya
            val intent = Intent(this, StaterPageActivity::class.java )
            startActivity(intent)
            finish() // kill the activity
        }, 3000)

        //TASK :
        //Splash Screen
        //PADA PAGE START SCREEN 2 --> klik button Get Started akan pindah ke page login
        //Paga page login, ketika klik tulisan did not have account --> pindah ke page signup
        //page page signup, ketika klik tulisan have account --> pindah ke page login

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}