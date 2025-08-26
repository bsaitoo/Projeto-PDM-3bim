package com.example.projeto3bim

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton

class MainActivityP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_p)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets -> val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } val btnPlay = findViewById<ImageButton>(R.id.btnPlay)
        btnPlay.setOnClickListener { val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } }
}