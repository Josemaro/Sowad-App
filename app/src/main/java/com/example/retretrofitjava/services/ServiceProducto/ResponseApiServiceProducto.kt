package com.example.retretrofitjava.services.ServiceProducto

import android.content.Context
import android.widget.ListView
import android.widget.Toast
import com.example.retretrofitjava.models.entity.Producto
import com.example.retretrofitjava.services.RetrofitClient
import com.example.retretrofitjava.utils.AdaptadorProducto
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResponseApiServiceProducto {
    val r = RetrofitClient.buildServiceP(ApiServiceProducto::class.java)
    val call= r.listaProducto()

    fun listaProducto(context: Context, listView: ListView){
        call!!.enqueue(object : Callback<List<Producto>> {
            override fun onResponse(call: Call<List<Producto>>, response: Response<List<Producto>>) {
                if (response.isSuccessful){
                    val rptaP = response.body()!!
                    val adap = AdaptadorProducto(context,rptaP)
                    listView.adapter = adap
                }
            }

            override fun onFailure(call: Call<List<Producto>>, t: Throwable) {
                println(t.toString())
            }
        })
    }

    fun grabaProducto(id: Int, nombreProducto: String?, precio: String?, tipo: String?, toast: Toast){

        val p = Producto(0, nombreProducto, precio, tipo)
        val r = RetrofitClient.buildServiceP(ApiServiceProducto::class.java)
        val call = r.grabaProducto(p)
        var mensaje : String = ""

        call!!.enqueue(object : Callback<Producto> {
            override fun onResponse(call: Call<Producto>, response: Response<Producto>){
                if (response.isSuccessful) mensaje = "Producto Grabado"
                else mensaje = "Reintente nuevamente"
                toast.setText(mensaje)
                toast.show()
            }

            override fun onFailure(call: Call<Producto>, t: Throwable) {
                mensaje = "Reintente nuevamente"
                toast.setText(mensaje)
                toast.show()
            }
        })
    }
}