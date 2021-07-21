package com.aplicacion.appTecnicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_actualizar_tecnico.*

class ActualizarTecnicoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar_tecnico)


        btnActualizar.setOnClickListener {
            val intent= Intent(this,BienvenidaTecnicoActivity::class.java)
            startActivity(intent)
        }

        btnCancelar.setOnClickListener {
            val intent= Intent(this,BienvenidaTecnicoActivity::class.java)
            startActivity(intent)
        }
    }
}