package com.example.examen_cesar_oswaldo_ponce_chavez.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.examen_cesar_oswaldo_ponce_chavez.R
import com.example.examen_cesar_oswaldo_ponce_chavez.model.Planeta

class PlanetaAdapter (

    private val activity: Activity,
            private val listaPlanetas: ArrayList<Planeta>
):BaseAdapter(){

    class ViewHolder {
        lateinit var tvNombre: TextView
        lateinit var ivImagen: ImageView
        lateinit var tvTipo : TextView

    }

    override fun getCount(): Int {
       return listaPlanetas.size
    }

    override fun getItem(position: Int): Planeta {
        return listaPlanetas.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var myView = convertView
        var viewHolder = ViewHolder()

        if (myView == null) {
            var inflater = activity.layoutInflater
            myView = inflater.inflate(R.layout.segundo_layout, null)
//////////

            viewHolder.tvNombre = myView.findViewById(R.id.adapterNombre)
            viewHolder.ivImagen = myView.findViewById(R.id.adapterImagen)
            viewHolder.tvTipo = myView.findViewById(R.id.adapterTipo)
            myView.setTag(viewHolder)//Asociamos el tag al vueHolder

        }else{
            viewHolder = myView.tag as ViewHolder
        }
        //Les asigno el valor que deben tener es decir actualizamos los datos por si desde fuera han cambiado los valores
        viewHolder.tvNombre.text = listaPlanetas[position].nombre
        viewHolder.tvTipo = listaPlanetas[position].tipo
        viewHolder.ivImagen =listaPlanetas[position].imagen


        return myView!!//Devov
    }
}