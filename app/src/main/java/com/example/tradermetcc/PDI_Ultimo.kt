package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Ultimo : AppCompatActivity() {

    private var next11 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_ultimo)

        initiliase()

    }

    private fun initiliase() {

        next11 = findViewById(R.id.next11)

        next11?.setOnClickListener { startActivity(Intent(this@PDI_Ultimo, FeedAluno::class.java))}

    }
}