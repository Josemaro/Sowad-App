package com.example.retretrofitjava.models.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Producto {
    @SerializedName("id")
    @Expose

    var id = 0

    @SerializedName("nombreProducto")
    @Expose
    var nombreProducto: String?=null

    @SerializedName("precio")
    @Expose
    var precio: String?=null

    @SerializedName("tipo")
    @Expose
    var tipo: String?=null


    constructor( id: Int,nombreProducto: String?, precio: String?, tipo: String?) {
        this.id = id
        this.nombreProducto = nombreProducto
        this.precio = precio
        this.tipo = tipo
    }


}