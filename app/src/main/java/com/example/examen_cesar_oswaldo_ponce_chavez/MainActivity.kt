package com.example.examen_cesar_oswaldo_ponce_chavez

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.examen_cesar_oswaldo_ponce_chavez.adapter.PlanetaAdapter
import com.example.examen_cesar_oswaldo_ponce_chavez.model.Planeta

class MainActivity : AppCompatActivity() {

    lateinit var tvNombre: TextView
    lateinit var ivImagen: ImageView
    lateinit var tvDescubrimiento: TextView
    lateinit var tvSatelite : TextView
    lateinit var tvAnillo : TextView
    lateinit var tvTipo : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNombre=findViewById(R.id.tvNombre)
        tvTipo=findViewById(R.id.tvTipo)
        ivImagen=findViewById(R.id.ivImagen)
        tvDescubrimiento =findViewById(R.id.tvDescubrimiento)
        tvAnillo =findViewById(R.id.tvAnillo)
        tvSatelite =findViewById(R.id.tvSatelite)


        var listViewItems : ListView =findViewById(R.id.lvLista)
        var listaPlanetas= leerPlanetas()

        
        //Estamos creando el adaptador y lo enlazamos con los datos a la vez
        var planetaAdapter= PlanetaAdapter(this, listaPlanetas)
        
        listViewItems.adapter=planetaAdapter


        listViewItems.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->

        }



    }

    private fun leerPlanetas(): ArrayList<Planeta> {

        var lista = ArrayList<Planeta>()

        for (indice in (0..8)){

                var planeta = Planeta (

                )
            lista.add(planeta)
        }
    }


}