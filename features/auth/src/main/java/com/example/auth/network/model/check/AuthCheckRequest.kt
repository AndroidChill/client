package com.example.auth.network.model.check

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AuthCheckRequest(
    @SerializedName("phone")
    @Expose
    val phone: String
)