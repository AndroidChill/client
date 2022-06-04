package com.example.auth.network.model.check

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AuthCheckResponse(
    @SerializedName("id")
    @Expose
    val id: Int
)