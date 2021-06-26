package com.example.retretrofitjava.utils

import android.content.Context
import android.widget.ArrayAdapter
import com.example.retretrofitjava.R
import com.example.retretrofitjava.models.entity.Producto
import com.example.retretrofitjava.models.entity.User

class AdaptadorUser (
    context: Context,
    private val datUser: List<User>
) : ArrayAdapter<User>(context, R.layout.inicio, datUser)
