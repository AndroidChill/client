package com.example.auth.network.dataSource

import com.example.auth.network.apiService.AuthService
import com.example.auth.network.model.check.AuthCheckRequest
import com.example.auth.network.model.check.AuthCheckResponse
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AuthNetworkDataSource @Inject constructor(
    private val authService: AuthService
) {

    fun authCheck(request: AuthCheckRequest) : Single<AuthCheckResponse> {
        return authService.authCheck(request)
    }

}