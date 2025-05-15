package com.example.prova

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class PixActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pix)

        val botaoTransferir = findViewById<Button>(R.id.btn_transferir)
        botaoTransferir.setOnClickListener {
            val intent = Intent(this, ValorTransferenciaActivity::class.java)
            startActivity(intent)
        }
    }
}
