package com.example.auth.presentation.phone

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.auth.network.useCase.AuthPhoneUseCase
import com.example.core_utils.DataState
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AuthPhoneViewModel @Inject constructor(
    private val useCase: AuthPhoneUseCase
) : ViewModel() {

    var data = MutableLiveData<DataState<Boolean>>()

    fun authCheck(phone: String) {
        useCase.authCheck(phone)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                
            )
    }

}