package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Decimo : AppCompatActivity() {

    private var next10 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_decimo)

        initialise()

    }

    private fun initialise() {

        next10 = findViewById(R.id.next10)

        next10?.setOnClickListener { startActivity(Intent(this@PDI_Decimo, PDI_Ultimo::class.java)) }

    }

}