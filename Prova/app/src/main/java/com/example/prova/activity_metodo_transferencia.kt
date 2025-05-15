package com.example.prova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class activity_metodo_transferencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metodo_transferencia)

        val valor = intent.getStringExtra("valor_transferencia") ?: "0,00"
        val nome = intent.getStringExtra("nome_destinatario") ?: "Contato"

        val txtValor = findViewById<TextView>(R.id.txtValorRecebido)
        txtValor.text = "Como você gostaria de transferir R$ $valor?"

        val btnContinuar = findViewById<Button>(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, ReviseTransferenciaActivity::class.java)
            intent.putExtra("valor_transferencia", valor)
            intent.putExtra("nome_destinatario", nome)
            startActivity(intent)
        }
    }
}
