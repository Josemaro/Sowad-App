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
import com.example.retretrofitjava.services.ServiceProducto.ResponseApiServiceProducto


class ProductoActivity : AppCompatActivity(){
    val rascP = ResponseApiServiceProducto()
    val context : Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.producto_main)

        val et_nombreProd = findViewById<EditText>(R.id.et_nombreProducto)
        val et_precio = findViewById<EditText>(R.id.et_precio)
        val et_tipo = findViewById<EditText>(R.id.et_tipo)
        val btn_grabar = findViewById<Button>(R.id.btn_submit)
        val btn_listar = findViewById<Button>(R.id.btn_listarP)

        val listarproducto = findViewById<ListView>(R.id.lst_productos)

        val toast : Toast = Toast.makeText(context, "-" ,Toast.LENGTH_SHORT)

        btn_grabar.setOnClickListener(View.OnClickListener {
            rascP.grabaProducto(0,et_nombreProd.text.toString(),
                et_precio.text.toString(),
                et_tipo.text.toString(),toast)

            //rasc.listarCliente(applicationContext, lst_cliente)
        })

        btn_listar.setOnClickListener(View.OnClickListener {
            rascP.listaProducto(applicationContext, listarproducto)
        })

        //rasc.listarCliente(applicationContext, lst_cliente)
    }
}