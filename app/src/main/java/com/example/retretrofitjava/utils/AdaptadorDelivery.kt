package com.example.retretrofitjava.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.retretrofitjava.R
import com.example.retretrofitjava.models.entity.Delivery


class AdaptadorDelivery(
    context: Context,
    private val datDel: List<Delivery>
    ) : ArrayAdapter<Delivery>(context, R.layout.listadeliveries, datDel){

        override fun getView(position: Int, view: View?, parent: ViewGroup): View {
            val inflater = LayoutInflater.from(context)
            val vista = inflater.inflate(R.layout.listadeliveries, null, true)

            val tv_nameProd = vista.findViewById<TextView>(R.id.tv_prod)
            val tv_nameCli = vista.findViewById<TextView>(R.id.tv_nomcli)
            val tv_direccion = vista.findViewById<TextView>(R.id.tv_direc)
            val tv_telefono = vista.findViewById<TextView>(R.id.tv_telf)
            val tv_fecEntrega = vista.findViewById<TextView>(R.id.tv_fecEnt)


            tv_nameProd.text = datDel.get(position).nombreProducto
            tv_nameCli.text = datDel.get(position).nombreCliente
            tv_direccion.text = datDel.get(position).direccion
            tv_telefono.text = datDel.get(position).telefono
            tv_fecEntrega.text = datDel.get(position).fechaEntrega


            return vista
        }
    }