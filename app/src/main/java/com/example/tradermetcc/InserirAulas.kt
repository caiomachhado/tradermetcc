package com.example.tradermetcc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class InserirAulas : AppCompatActivity() {

    private var selectVideo : Button? = null

    private val REQUEST_GALERIA = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inserir_aulas)

        initialise()

        selectVideo?.setOnClickListener { abreGaleria() }

    }

    private fun initialise() {
        selectVideo = findViewById(R.id.selectVideo)


    }

    private fun abreGaleria(){

        val intent = Intent(Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, REQUEST_GALERIA)

    }

}