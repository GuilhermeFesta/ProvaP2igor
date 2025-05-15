package com.example.prova

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class ConfirmarTransferenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_transferencia)

        val valor = intent.getStringExtra("valor_transferencia")
        val nome = intent.getStringExtra("nome_destinatario") ?: "Contato"
        val cpf = intent.getStringExtra("cpf_destinatario") ?: "***.123.456.**"
        val instituicao = intent.getStringExtra("instituicao") ?: "NU PAGAMENTOS - IP"

        val txtValor = findViewById<TextView>(R.id.valor_transferencia)
        val txtNome = findViewById<TextView>(R.id.nome_destinatario)
        val txtCPF = findViewById<TextView>(R.id.numero_cpf)
        val txtInstituicao = findViewById<TextView>(R.id.nome_instituicao)

        txtValor.text = "R$$valor?"
        txtNome.text = "Para $nome"
        txtCPF.text = cpf
        txtInstituicao.text = instituicao

            val botaoEscolher = findViewById<Button>(R.id.btn_escolher_transferencia)
            botaoEscolher.setOnClickListener {
                val intent = Intent(this, activity_metodo_transferencia::class.java)
                intent.putExtra("valor_transferencia", valor)
                startActivity(intent)
        }
    }
}
