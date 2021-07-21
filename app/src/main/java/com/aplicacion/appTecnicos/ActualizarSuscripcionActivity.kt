package com.aplicacion.appTecnicos
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActualizarSuscripcionActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.datos_suscripcion_tecnico)

        val btnGuardar: Button = findViewById(R.id.btnActualizar)
        btnGuardar.setOnClickListener {
            val intent= Intent(this,BienvenidaTecnicoActivity::class.java)
            startActivity(intent)
        }

        val btnCancelar: Button = findViewById(R.id.btnCancelar)
        btnCancelar.setOnClickListener {
            val intent= Intent(this,BienvenidaTecnicoActivity::class.java)
            startActivity(intent)
        }
    }
}