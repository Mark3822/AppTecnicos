package com.aplicacion.appTecnicos
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_tecnicos_cercanos.*

class TecnicosCercanosActivity : AppCompatActivity() {

    private val BASE_URL ="https://maps.google.com"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecnicos_cercanos)
        val spinner=findViewById<Spinner>(R.id.spinnerDist)
        val lista=resources.getStringArray(R.array.opciones)
        val adapatador= ArrayAdapter(this, android.R.layout.simple_spinner_item,lista)
        spinner.adapter=adapatador

        //WebView
        webView.webChromeClient = object : WebChromeClient(){
        }
        webView.webViewClient = object : WebViewClient(){
        }
        val settings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl(BASE_URL)

        //boton
        val boton:Button = findViewById(R.id.btnRegresar)
        boton.setOnClickListener {
            val intent = Intent(this, BienvenidaClienteActivity::class.java)
            startActivity(intent)
        }

    }

}
