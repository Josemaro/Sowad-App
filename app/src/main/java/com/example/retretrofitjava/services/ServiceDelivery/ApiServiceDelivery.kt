package com.example.retretrofitjava.services.ServiceDelivery

import com.example.retretrofitjava.models.entity.Delivery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiceDelivery {

    @POST( ".")
    fun grabaDelivery(@Body delivery: Delivery): Call<Delivery>

    @GET(".")
    fun listaDelivery(): Call<List<Delivery>>

}