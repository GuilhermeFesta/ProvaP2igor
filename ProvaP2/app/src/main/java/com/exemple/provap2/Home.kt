package com.exemple.provap2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_notificacao -> {
                val intent = Intent(this, notificacoes::class.java)
                startActivity(intent)
                true
            }

            R.id.menu_config -> {
                val intent = Intent(this, configuracoes::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun abrirCarrinho(view: View) {
        val intent = Intent(this, carrinho::class.java)
        intent.putExtra("nome", "GTA 6")
        intent.putExtra("preco", "R$499.99")
        intent.putExtra("imagem", R.mipmap.gta)
        startActivity(intent)
    }
}
