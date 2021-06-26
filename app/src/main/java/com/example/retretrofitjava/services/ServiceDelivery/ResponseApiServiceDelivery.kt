package com.example.retretrofitjava.services.ServiceDelivery

import android.content.Context
import android.widget.ListView
import android.widget.Toast
import com.example.retretrofitjava.models.entity.Delivery
import com.example.retretrofitjava.services.RetrofitClient
import com.example.retretrofitjava.utils.AdaptadorDelivery
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResponseApiServiceDelivery {
    val r = RetrofitClient.buildServiceD(ApiServiceDelivery::class.java)
    val call= r.listaDelivery()

    fun listaDelivery(context: Context, listView: ListView){
        call!!.enqueue(object : Callback<List<Delivery>> {
            override fun onResponse(call: Call<List<Delivery>>, response: Response<List<Delivery>>) {
                if (response.isSuccessful){
                    val rptaD = response.body()!!
                    val adap = AdaptadorDelivery(context,rptaD)
                    listView.adapter = adap
                }
            }

            override fun onFailure(call: Call<List<Delivery>>, t: Throwable) {
                println(t.toString())
            }
        })
    }

    fun grabaDelivery(id: Int, nombreProducto: String?, cantidad: String?, importeTotal: String?, nombreCliente: String?,
                     direccion: String?, telefono: String?,fechaEntrega: String?, toast: Toast){

        val d = Delivery( 0, nombreProducto, cantidad, importeTotal, nombreCliente, direccion, telefono, fechaEntrega)
        val r = RetrofitClient.buildServiceD(ApiServiceDelivery::class.java)
        val call = r.grabaDelivery(d)
        var mensaje : String = ""

        call!!.enqueue(object : Callback<Delivery> {
            override fun onResponse(call: Call<Delivery>, response: Response<Delivery>){
                if (response.isSuccessful) mensaje = "Delivery Grabado"
                else mensaje = "Reintente nuevamente"
                toast.setText(mensaje)
                toast.show()
            }

            override fun onFailure(call: Call<Delivery>, t: Throwable) {
                mensaje = "Reintente nuevamente"
                toast.setText(mensaje)
                toast.show()
            }
        })
    }
}