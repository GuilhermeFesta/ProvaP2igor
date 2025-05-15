package com.example.prova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SenhaTransferenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senha_transferencia)

        val btnTransferir = findViewById<Button>(R.id.btnTransferir)

        val nome = intent.getStringExtra("nome_destinatario") ?: "Jair.M.Bolsonaro"
        val valor = intent.getStringExtra("valor_transferencia") ?: "0,00"

        btnTransferir.setOnClickListener {
            val intent = Intent(this, TransferenciaRealizadaActivity::class.java)
            intent.putExtra("nome_destinatario", nome)
            intent.putExtra("valor_transferencia", valor)
            intent.putExtra("horario_transferencia", "21h45")
            startActivity(intent)
        }
    }
}
