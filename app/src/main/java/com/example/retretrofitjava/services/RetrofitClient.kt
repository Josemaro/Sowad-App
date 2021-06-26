package com.example.retretrofitjava.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.retretrofitjava.utils.ApiUtils

object RetrofitClient {
    val client = OkHttpClient.Builder().build()
//delivery
    private val retrofitD = Retrofit.Builder()
        .baseUrl(ApiUtils.BASE_URL + "deliveries/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun<T> buildServiceD(service: Class<T>): T{
        return retrofitD.create(service)
    }
//productos
    private val retrofitP = Retrofit.Builder()
        .baseUrl(ApiUtils.BASE_URL + "productos/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun<T> buildServiceL(service: Class<T>): T{
        return retrofitP.create(service)
    }
//login
    private val retrofitL = Retrofit.Builder()
        .baseUrl(ApiUtils.BASE_URL + "login/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun<T> buildServiceP(service: Class<T>): T{
        return retrofitL.create(service)
    }
}