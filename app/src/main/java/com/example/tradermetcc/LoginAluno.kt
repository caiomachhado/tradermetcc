package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginAluno : AppCompatActivity() {

    private var btn_loginCreateAccountStudent : Button? = null
    private var btn_loginAluno : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_aluno)

        initialise()

    }

    private fun initialise() {

        btn_loginCreateAccountStudent = findViewById(R.id.btn_loginCreateAccountStudent)
        btn_loginAluno = findViewById(R.id.angry_btn)

        btn_loginAluno?.setOnClickListener { startActivity(Intent(this@LoginAluno, PDIStart::class.java)) }
        btn_loginCreateAccountStudent?.setOnClickListener { startActivity(Intent(this@LoginAluno, CadastroAluno::class.java)) }

    }
}