package com.exemple.provap2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class carrinho : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrinho)

        val nome = intent.getStringExtra("nome")
        val preco = intent.getStringExtra("preco")
        val imagem = intent.getIntExtra("imagem", R.mipmap.ic_launcher)

        val imgJogo = findViewById<ImageView>(R.id.imgJogo)
        val txtNome = findViewById<TextView>(R.id.txtNomeJogo)
        val txtPreco = findViewById<TextView>(R.id.txtPrecoJogo)
        val btnFinalizar = findViewById<Button>(R.id.btnFinalizarCompra)

        imgJogo.setImageResource(imagem)
        txtNome.text = nome
        txtPreco.text = preco

        btnFinalizar.setOnClickListener {
            Toast.makeText(this, "Compra Finalizada com Sucesso!", Toast.LENGTH_SHORT).show()
        }
    }
}
