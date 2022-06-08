package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Sexto : AppCompatActivity() {

    private var next06 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_sexto)
    }

    private fun initialise() {

        next06 = findViewById(R.id.next06)

        next06?.setOnClickListener { startActivity(Intent(this@PDI_Sexto, PDI_Setimo::class.java)) }

    }

}