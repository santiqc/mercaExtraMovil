package com.tatiana.mercaextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnLogin(view: View) {

        Log.i("Ingresa","Ingresa desde el main")
        Toast.makeText(this, "presiona en el main", Toast.LENGTH_SHORT).show()

        var miIntent: Intent=Intent(this,Home::class.java)
        startActivity(miIntent)
      }




    fun btnCrear(view: View) {

        Log.i("Ingresa","Ingresa desde el main")
        Toast.makeText(this, "presiona en el main", Toast.LENGTH_SHORT).show()

        var miIntent: Intent=Intent(this,Registro::class.java)
        startActivity(miIntent)

    }




}
