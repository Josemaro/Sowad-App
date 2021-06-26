package com.example.retretrofitjava.services.ServiceUser


import com.example.retretrofitjava.models.entity.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiServiceUser {
    @POST( ".")

    fun iniciarSesion(@Body user: User): Call<User>
}