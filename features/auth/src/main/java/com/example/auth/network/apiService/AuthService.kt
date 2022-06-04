package com.example.auth.network.apiService

import com.example.auth.network.model.check.AuthCheckRequest
import com.example.auth.network.model.check.AuthCheckResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("auth/check")
    fun authCheck(@Body request: AuthCheckRequest) : Single<AuthCheckResponse>

}