package com.example.prova

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SelecionarContatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecionar_contato)

        val valorRecebido = intent.getStringExtra("valor_transferencia") ?: "0,00"
        val textoValor = findViewById<TextView>(R.id.textoValorTransferencia)
        textoValor.text = "Para quem você quer transferir R$$valorRecebido?"

        val contatoJair = findViewById<LinearLayout>(R.id.contato_jair)

        contatoJair.setOnClickListener {
            val intent = Intent(this, ConfirmarTransferenciaActivity::class.java)
            intent.putExtra("valor_transferencia", valorRecebido)
            intent.putExtra("nome_destinatario", "Jair.M.Bolsonaro")
            intent.putExtra("cpf_destinatario", "***.123.456.**")
            intent.putExtra("instituicao", "NU PAGAMENTOS - IP")
            startActivity(intent)
        }
    }
}
