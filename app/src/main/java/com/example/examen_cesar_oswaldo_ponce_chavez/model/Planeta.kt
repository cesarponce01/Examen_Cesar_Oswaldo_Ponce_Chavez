package com.example.examen_cesar_oswaldo_ponce_chavez.model

import android.media.Image
import android.os.Bundle

class Planeta {

    var nombre=""
    var descubrimiento=""
    var satelite=0
    var anillo=0
    var tipo=""
    lateinit var imagen: Image

    constructor(
        nombre: ArrayList<Planeta>,
        descubrimiento: String,
        satelite: Int,
        anillo: Int,
        tipo: String,
        imagen: Image
    ) {
        this.nombre = nombre.toString()
        this.descubrimiento = descubrimiento
        this.satelite = satelite
        this.anillo = anillo
        this.tipo = tipo
        this.imagen = imagen
    }

    constructor(bundle: Bundle) {
        this.nombre = bundle.getString("nombre")!!
        this.tipo = bundle.getString("tipo")!!
        this.descubrimiento = bundle.getString("descubrimiento")!!
    }


    fun getBundle(): Bundle? {
        var bundle = Bundle()

        bundle.putString("nombre", this.nombre)
        bundle.putString("tipo", this.tipo)

        return bundle
    }


}