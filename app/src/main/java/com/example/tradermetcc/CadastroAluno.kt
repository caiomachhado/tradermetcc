package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CadastroAluno : AppCompatActivity() {

    private var btn_continueCreateAccount : Button? = null
    private var btn_createAccountTeacher : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_aluno)

        initialise()

    }

    private fun initialise() {

        btn_continueCreateAccount = findViewById(R.id.btn_continueCreateAccount)
        btn_createAccountTeacher = findViewById(R.id.btn_createAccountTeacher)


        btn_continueCreateAccount?.setOnClickListener { startActivity(Intent(this@CadastroAluno, CadastroAlunoTwo::class.java)) }
        btn_createAccountTeacher?.setOnClickListener { startActivity(Intent(this@CadastroAluno, CadastroProfessor::class.java)) }

    }
}