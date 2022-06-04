package com.example.auth.network.repository

import com.example.auth.network.dataSource.AuthNetworkDataSource
import com.example.auth.network.model.check.AuthCheckRequest
import io.reactivex.Single
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val authNetworkDataSource: AuthNetworkDataSource
) {

    fun authCheck(phone: String) : Single<Boolean> {
        return authNetworkDataSource.authCheck(AuthCheckRequest(phone))
            .map { it.id != 0 }
    }

}