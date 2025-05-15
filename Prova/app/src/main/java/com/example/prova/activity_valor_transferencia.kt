package com.example.prova

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class ValorTransferenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valor_transferencia)

        val editText = findViewById<EditText>(R.id.et_valor)
        val botaoAvancar = findViewById<Button>(R.id.btn_avancar)

        botaoAvancar.setOnClickListener {
            val valor = editText.text.toString()
            if (valor.isBlank()) {
                Toast.makeText(this, "Insira um valor", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SelecionarContatoActivity::class.java)
                intent.putExtra("valor_transferencia", valor)
                startActivity(intent)
            }
        }
    }
}

