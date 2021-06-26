package com.example.retretrofitjava.services.ServiceProducto

import com.example.retretrofitjava.models.entity.Producto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServiceProducto {
    @POST( ".")
    fun grabaProducto(@Body producto: Producto): Call<Producto>

    @GET(".")
    fun listaProducto(): Call<List<Producto>>

    @GET("{nombreCliente}")
    fun buscaProducto(@Path("nombreCliente", encoded = true) nombre: String?): Call<List<Producto>>

}