package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CadastroProfessor : AppCompatActivity() {

    private var btn_createAccountStudent : Button? = null
    private var btn_feedTeacher : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_professor)

        initialise()

    }

    private fun initialise() {

        btn_createAccountStudent = findViewById(R.id.btn_createAccountStudent)
        btn_feedTeacher = findViewById(R.id.btn_feedTeacher)

        btn_feedTeacher?.setOnClickListener { startActivity(Intent(this@CadastroProfessor, FeedProfessor::class.java)) }

        btn_createAccountStudent?.setOnClickListener { startActivity(Intent(this@CadastroProfessor, CadastroAluno::class.java)) }

    }
}