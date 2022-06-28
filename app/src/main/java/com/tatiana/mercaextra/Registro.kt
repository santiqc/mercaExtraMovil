package com.tatiana.mercaextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }

    fun btnInciar(view: View) {

        Log.i("Ingresa", "Ingresa desde el main")
        Toast.makeText(this, "presiona en el main", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this, MainActivity::class.java)
        startActivity(miIntent)
    }

    fun btnRegistar(view: View) {

        Log.i("Ingresa", "Ingresa desde el main")
        Toast.makeText(this, "presiona en el main", Toast.LENGTH_SHORT).show()

        var miIntent: Intent = Intent(this, MainActivity::class.java)
        startActivity(miIntent)
    }
}