package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdicionarModulo : AppCompatActivity() {

    private var btn_insertClass : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_modulo)

        initialise()

    }

    private fun initialise() {
        btn_insertClass = findViewById(R.id.btn_insertClass)

        btn_insertClass?.setOnClickListener { startActivity(Intent(this@AdicionarModulo, InserirAulas::class.java)) }
    }
}