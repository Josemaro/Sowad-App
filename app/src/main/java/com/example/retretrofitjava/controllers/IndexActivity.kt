package com.example.retretrofitjava.controllers


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.retretrofitjava.R


class IndexActivity : AppCompatActivity() {
    val context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        val btnDelivery = findViewById<Button>(R.id.btnDel)
        val btnProducto = findViewById<Button>(R.id.btnProd)

        btnDelivery.setOnClickListener(View.OnClickListener {

            val intent = Intent(context, DeliveryActivity::class.java)
            context.startActivity(intent)
        })

        btnProducto.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, ProductoActivity::class.java)
            context.startActivity(intent)
        })
    }


}
