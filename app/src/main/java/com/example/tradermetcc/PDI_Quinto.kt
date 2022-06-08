package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Quinto : AppCompatActivity() {

    private var next05 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_quinto)

        initialise()

    }


    private fun initialise() {

        next05 = findViewById(R.id.next05)

        next05?.setOnClickListener { startActivity(Intent(this@PDI_Quinto, PDI_Sexto::class.java)) }

    }

}