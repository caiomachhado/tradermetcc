package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDIStart : AppCompatActivity() {

    private var btn_start_PDI : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdistart)

        initialise()

    }

    private fun initialise() {
        btn_start_PDI = findViewById(R.id.btn_start_PDI)

        btn_start_PDI?.setOnClickListener { startActivity(Intent(this@PDIStart, PDI_Primeiro::class.java)) }

    }
}