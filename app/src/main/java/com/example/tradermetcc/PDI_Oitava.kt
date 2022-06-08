package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Oitava : AppCompatActivity() {

    private var next08 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_oitava)

        initialise()

    }

    private fun initialise() {

        next08 = findViewById(R.id.next08)

        next08?.setOnClickListener { startActivity(Intent(this@PDI_Oitava, PDI_Nono::class.java)) }

    }

}