package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PDI_Setimo : AppCompatActivity() {

    private var next07 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdi_setimo)
    }

    private fun initialise() {

        next07 = findViewById(R.id.next07)

        next07?.setOnClickListener { startActivity(Intent(this@PDI_Setimo, PDI_Oitava::class.java)) }

    }

}