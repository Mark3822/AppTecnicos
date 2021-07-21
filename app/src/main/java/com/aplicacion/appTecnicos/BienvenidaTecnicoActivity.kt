package com.aplicacion.appTecnicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_bienvenida_tecnico.*


class BienvenidaTecnicoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida_tecnico)

        val boton: Button = findViewById(R.id.btnCerrar)
        boton.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val btnSuscripcion: Button = findViewById(R.id.btnSuscripcion)
        btnSuscripcion.setOnClickListener {
            val intent= Intent(this,ActualizarSuscripcionActivity::class.java)
            startActivity(intent)
        }

        imgAjustes.setOnClickListener(){
            val intent = Intent(this, ActualizarTecnicoActivity::class.java)
            startActivity(intent)
        }

    }
}