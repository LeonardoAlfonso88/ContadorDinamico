package com.example.contadordinamico

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textViewMessage : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewMessage = findViewById<TextView>(R.id.textView)
    }

    fun toastMe(view: View)
    {
        val mensajeFlotante = Toast.makeText(this, "Oprimiste este Botón", Toast.LENGTH_SHORT)
        mensajeFlotante.show()
    }

    fun countMe(view: View)
    {
        val textoContador = findViewById<TextView>(R.id.textView)
        val contadorActual = textoContador.text.toString()
        var contador: Int = Integer.parseInt(contadorActual)
        contador++
        textoContador.text = contador.toString()
    }

    fun randomMe(view: View)
    {
        val randomIntent = Intent(this, SecondActivity::class.java)
        val textoContador = findViewById<TextView>(R.id.textView)
        val countString = textoContador.text.toString()
        var contador: Int = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, contador)
        startActivity(randomIntent)
    }

}
