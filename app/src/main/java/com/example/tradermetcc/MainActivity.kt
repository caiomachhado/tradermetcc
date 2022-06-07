package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var btn_login: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialise()

    }

    private fun initialise() {

        btn_login = findViewById(R.id.btn_cadastro)

        btn_login?.setOnClickListener { startActivity(Intent(this@MainActivity, CadastroAluno::class.java)) }

    }
}