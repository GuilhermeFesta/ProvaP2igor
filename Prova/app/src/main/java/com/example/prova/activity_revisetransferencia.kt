package com.example.prova

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ReviseTransferenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_revisetransferencia)

        val nome = intent.getStringExtra("nome_destinatario") ?: "Contato"
        val valor = intent.getStringExtra("valor_transferencia") ?: "0,00"

        val txtNome = findViewById<TextView>(R.id.nome_destinatario)
        val txtValor = findViewById<TextView>(R.id.txt_valor_total)

        txtNome.text = "Para $nome"
        txtValor.text = "R$ $valor"

        val botaoTransferir = findViewById<Button>(R.id.btn_transferir)
        botaoTransferir.setOnClickListener {
            val intent = Intent(this, SenhaTransferenciaActivity::class.java)
            intent.putExtra("nome_destinatario", nome)
            intent.putExtra("valor_transferencia", valor)
            startActivity(intent)
        }
    }
}
