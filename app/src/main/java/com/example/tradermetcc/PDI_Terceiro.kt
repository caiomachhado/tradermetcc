package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Terceiro : AppCompatActivity() {

    private var next03 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_terceiro)

        initialise()

    }

    private fun initialise() {

        next03?.setOnClickListener { startActivity(Intent(this@PDI_Terceiro, PDI_Quarto::class.java)) }

    }


}