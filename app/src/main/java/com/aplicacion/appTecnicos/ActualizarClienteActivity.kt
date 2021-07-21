package com.aplicacion.appTecnicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_actualizar_cliente.*

class ActualizarClienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar_cliente)

        btnActualizar.setOnClickListener{
            val intent= Intent(this,BienvenidaClienteActivity::class.java)
            startActivity(intent)
        }

        btnCancelar.setOnClickListener {
            val intent= Intent(this,BienvenidaClienteActivity::class.java)
            startActivity(intent)
        }
    }
}