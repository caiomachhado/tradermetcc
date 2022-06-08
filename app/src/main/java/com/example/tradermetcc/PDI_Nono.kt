package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Nono : AppCompatActivity() {

    private var next09 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_nono)

        initialise()

    }

    private fun initialise() {

        next09 = findViewById(R.id.next09)

        next09?.setOnClickListener { startActivity(Intent(this@PDI_Nono, PDI_Decimo::class.java)) }

    }
}