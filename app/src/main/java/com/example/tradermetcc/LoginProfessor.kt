package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginProfessor : AppCompatActivity() {

    private var btn_loginCreateAccountTeacher02 : Button? = null
    private var btn_loginTeacherFeed : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_professor)

        initialise()

    }

    private fun initialise() {

        btn_loginCreateAccountTeacher02 = findViewById(R.id.btn_loginCreateAccountTeacher02)
        btn_loginTeacherFeed = findViewById(R.id.btn_loginTeacherFeed)

        btn_loginTeacherFeed?.setOnClickListener { startActivity(Intent(this@LoginProfessor, FeedProfessor::class.java)) }

        btn_loginCreateAccountTeacher02?.setOnClickListener { startActivity(Intent(this@LoginProfessor, CadastroProfessor::class.java))}


    }
}