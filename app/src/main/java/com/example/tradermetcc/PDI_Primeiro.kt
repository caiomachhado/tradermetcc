package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Primeiro : AppCompatActivity() {

    private var next01 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_primeiro)

        initialise()

    }

    private fun initialise() {

        next01 = findViewById(R.id.next01)

        next01?.setOnClickListener { startActivity(Intent(this@PDI_Primeiro, PDI_Segundo::class.java)) }

    }
}