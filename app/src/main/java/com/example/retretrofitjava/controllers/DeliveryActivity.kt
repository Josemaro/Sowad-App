package com.example.retretrofitjava.controllers

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.retretrofitjava.R
import com.example.retretrofitjava.services.ServiceDelivery.ResponseApiServiceDelivery
import kotlinx.android.synthetic.main.delivery_main.*


class DeliveryActivity : AppCompatActivity() {
    val rascL = ResponseApiServiceDelivery()
    val context : Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.delivery_main)

        val et_nombreProd = findViewById<EditText>(R.id.et_nombreProducto)
        val et_cantidad = findViewById<EditText>(R.id.et_cantidad)
        val et_importeTotal = findViewById<EditText>(R.id.et_imptotal)
        val et_nombreCliente = findViewById<EditText>(R.id.et_nombreCliente)
        val et_direccion = findViewById<EditText>(R.id.et_direccion)
        val et_telefono = findViewById<EditText>(R.id.et_telefono)
        val et_fechaEntrega = findViewById<EditText>(R.id.et_fechaEntrega)

        val btn_grabar = findViewById<Button>(R.id.btn_submit)
        val btn_listar = findViewById<Button>(R.id.btn_listarD)

        val listardeliverie = findViewById<ListView>(R.id.lst_deliveries)

        val toast : Toast = Toast.makeText(context, "-" , Toast.LENGTH_SHORT)

        btn_grabar.setOnClickListener(View.OnClickListener {
            rascL.grabaDelivery( 0,et_nombreProd.text.toString(),
                et_cantidad.text.toString(),
                et_importeTotal.text.toString(),
                et_nombreCliente.text.toString(),
                et_direccion.text.toString(),
                et_telefono.text.toString(),
                et_fechaEntrega.text.toString(),toast)

            //rasc.listarCliente(applicationContext, lst_cliente)
        })

        btn_listar.setOnClickListener(View.OnClickListener {
            rascL.listaDelivery(applicationContext, listardeliverie)
        })

        //rasc.listarCliente(applicationContext, lst_cliente)
    }
}