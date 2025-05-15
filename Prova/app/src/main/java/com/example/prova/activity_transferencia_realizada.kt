package com.example.prova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TransferenciaRealizadaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferencia_realizada)

        val txtValor = findViewById<TextView>(R.id.txt_valor_sucesso)
        val txtDestinatario = findViewById<TextView>(R.id.txt_destinatario_sucesso)
        val txtHorario = findViewById<TextView>(R.id.txt_horario_sucesso)
        val btnVoltarMenu = findViewById<Button>(R.id.btn_voltar_menu)

        val nome = intent.getStringExtra("nome_destinatario") ?: "Jair.M.Bolsonaro"
        val valor = intent.getStringExtra("valor_transferencia") ?: "0,00"
        val horario = intent.getStringExtra("horario_transferencia") ?: "21h45"


        txtValor.text = "R$ $valor"
        txtDestinatario.text = "para $nome"
        txtHorario.text = "Agora mesmo • $horario"

        btnVoltarMenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}