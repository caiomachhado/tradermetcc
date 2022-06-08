package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Quarto : AppCompatActivity() {

    private var next04 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_quarto)

        initialise()

    }

    private fun initialise() {

        next04 = findViewById(R.id.next04)

        next04?.setOnClickListener { startActivity(Intent(this@PDI_Quarto, PDI_Quinto::class.java)) }

    }


}