package com.example.examen_cesar_oswaldo_ponce_chavez

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class segundaActividad: AppCompatActivity() {

    lateinit var tvNombre: TextView
    lateinit var ivImagen: ImageView
    lateinit var tvDescubrimiento: TextView
    lateinit var tvSatelite : TextView
    lateinit var tvAnillo : TextView
    lateinit var tvTipo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segundo_layout)

        tvNombre=findViewById(R.id.tvNombre)

        tvDescubrimiento=findViewById(R.id.tvDescubrimiento)

        tvTipo=findViewById(R.id.tvTipo)

        tvSatelite=findViewById(R.id.tvSatelite)

        tvAnillo=findViewById(R.id.tvAnillo)

        var bundleUsuario=intent.getBundleExtra("claseplaneta")
        var usuario= Planeta(bundleUsuario!!)

        textView2.text=usuario.nombre+" "+usuario.apellido
    }
}