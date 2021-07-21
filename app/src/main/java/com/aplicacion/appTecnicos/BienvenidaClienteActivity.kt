package com.aplicacion.appTecnicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_bienvenida_cliente.*

class BienvenidaClienteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida_cliente)

        btnTecn.setOnClickListener {
            val intent:Intent = Intent(this, TecnicosCercanosActivity::class.java)
            startActivity(intent)
        }

        val btn: Button=findViewById(R.id.btnCerrar)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        imgActualizar.setOnClickListener {
            val intent:Intent = Intent(this, ActualizarClienteActivity::class.java)
            startActivity(intent)
        }

        btnCerrar.setOnClickListener {
            val intent:Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}