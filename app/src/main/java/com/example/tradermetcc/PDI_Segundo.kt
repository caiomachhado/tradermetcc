package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Segundo : AppCompatActivity() {

    private var next02 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_segundo)

        initialise()
    }

    private fun initialise() {

        next02 = findViewById(R.id.next02)

        next02?.setOnClickListener { startActivity(Intent(this@PDI_Segundo, PDI_Terceiro::class.java)) }

    }


}