package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var btn_login: Button? = null
    private var textView_login: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialise()

    }

    private fun initialise() {

        btn_login = findViewById(R.id.btn_cadastro)
        textView_login = findViewById(R.id.textView_startNow)



        textView_login?.setOnClickListener { startActivity(Intent(this@MainActivity, LoginAluno::class.java)) }
        btn_login?.setOnClickListener { startActivity(Intent(this@MainActivity, CadastroAlunoo::class.java)) }

    }
}