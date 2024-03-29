package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FeedProfessor : AppCompatActivity() {

    private var btn_create : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_professor)

        initialise()

    }

    private fun initialise() {

        btn_create = findViewById(R.id.btn_create)

        btn_create?.setOnClickListener { startActivity(Intent(this@FeedProfessor, AdicionarModulo::class.java)) }

    }
}