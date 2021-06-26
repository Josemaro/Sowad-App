package com.example.retretrofitjava.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.retretrofitjava.R
import com.example.retretrofitjava.models.entity.Producto

class AdaptadorProducto (
        context: Context,
        private val datProd: List<Producto>
    ) : ArrayAdapter<Producto>(context, R.layout.listaproductos, datProd){

        override fun getView(position: Int, view: View?, parent: ViewGroup): View {
            val inflater = LayoutInflater.from(context)
            val vista = inflater.inflate(R.layout.listaproductos, null, true)

            val tv_Prod = vista.findViewById<TextView>(R.id.tv_Prod)
            val tv_price = vista.findViewById<TextView>(R.id.tv_price)

            tv_Prod.text = datProd.get(position).nombreProducto+" "+datProd.get(position).tipo
            tv_price.text = datProd.get(position).precio

            return vista
        }
}