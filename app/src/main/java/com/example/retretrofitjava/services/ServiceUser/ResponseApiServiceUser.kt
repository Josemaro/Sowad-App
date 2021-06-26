package com.example.retretrofitjava.services.ServiceUser

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.retretrofitjava.controllers.IndexActivity
import com.example.retretrofitjava.models.entity.User
import com.example.retretrofitjava.services.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResponseApiServiceUser {
    val r = RetrofitClient.buildServiceL(ApiServiceUser::class.java)

    fun iniciarSesion(
        id: Int,
        username: String?,
        password: String?,
        toast: Toast,
        context: Context
    ) {
        val l = User(0, username, password)
        val r = RetrofitClient.buildServiceL(ApiServiceUser::class.java)
        val call = r.iniciarSesion(l)
        var mensaje: String = ""

        call!!.enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.isSuccessful) {
                    mensaje = "Ha iniciado Sesion";
                    val intent = Intent(context, IndexActivity::class.java)
                    context.startActivity(intent)
                } else
                    mensaje = "Reintente nuevamente";
                toast.setText(mensaje)
                toast.show()
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                mensaje = "Reintente nuevamente"
                toast.setText(mensaje)
                toast.show()
            }
        })
    }
}