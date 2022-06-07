package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CadastroAlunoTwo : AppCompatActivity() {

    private var btn_endCreateAccount : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_aluno_two)

        initialise()

    }

    private fun initialise() {

        btn_endCreateAccount = findViewById(R.id.btn_endCreateAccount)

        btn_endCreateAccount?.setOnClickListener { startActivity(Intent(this@CadastroAlunoTwo, PDIStart::class.java)) }

    }
}