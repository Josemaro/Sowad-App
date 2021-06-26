package com.example.retretrofitjava.models.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Delivery {
    @SerializedName("id")
    @Expose
    var id = 0

    @SerializedName("nombreProducto")
    @Expose
    var nombreProducto: String?=null

    @SerializedName("cantidad")
    @Expose
    var cantidad: String?=null

    @SerializedName("importeTotal")
    @Expose
    var importeTotal: String?=null

    @SerializedName("nombreCliente")
    @Expose
    var nombreCliente: String?=null

    @SerializedName("direccion")
    @Expose
    var direccion: String?=null

    @SerializedName("telefono")
    @Expose
    var telefono: String?=null

    @SerializedName("fechaEntrega")
    @Expose
    var fechaEntrega: String?=null

    constructor(
        id: Int,
        nombreProducto: String?,
        cantidad: String?,
        importeTotal: String?,
        nombreCliente: String?,
        direccion: String?,
        telefono: String?,
        fechaEntrega: String?
    ) {
        this.id = id
        this.nombreProducto = nombreProducto
        this.cantidad = cantidad
        this.importeTotal = importeTotal
        this.nombreCliente = nombreCliente
        this.direccion = direccion
        this.telefono = telefono
        this.fechaEntrega = fechaEntrega
    }
}