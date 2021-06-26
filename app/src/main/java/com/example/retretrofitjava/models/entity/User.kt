package com.example.retretrofitjava.models.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class User {
    @SerializedName("id")
    @Expose
    var id = 0

    @SerializedName("username")
    @Expose
    var username: String?=null

    @SerializedName("password")
    @Expose
    var password: String?=null

    constructor(id: Int, username: String?, password: String?) {
        this.id = id
        this.username = username
        this.password = password
    }
}