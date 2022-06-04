package com.example.auth.network.useCase

import com.example.auth.network.repository.AuthRepository
import io.reactivex.Single
import javax.inject.Inject

class AuthPhoneUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {

    fun authCheck(phone: String) : Single<Boolean> {
        return authRepository.authCheck(phone)
    }

}