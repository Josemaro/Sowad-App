package com.example.retretrofitjava.controllers

import android.content.Context

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.retretrofitjava.R

import com.example.retretrofitjava.services.ServiceUser.ResponseApiServiceUser
import kotlinx.android.synthetic.main.login_main.*

class LoginActivity : AppCompatActivity() {
    val rascL = ResponseApiServiceUser()
    val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)

        val et_usuario = findViewById<EditText>(R.id.et_username)
        val et_contraseña = findViewById<EditText>(R.id.et_password)
        val btn_login = findViewById<Button>(R.id.btn_login)
        val toast: Toast = Toast.makeText(context, "-", Toast.LENGTH_SHORT)


        btn_login.setOnClickListener(View.OnClickListener {
            rascL.iniciarSesion(0,et_usuario.text.toString(),
                    et_contraseña.text.toString(), toast, this);
        })
    }
}
