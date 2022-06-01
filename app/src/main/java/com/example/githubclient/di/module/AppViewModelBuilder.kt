package com.example.githubclient.di.module

import androidx.lifecycle.ViewModel
import com.example.auth.presentation.phone.AuthPhoneViewModel
//import com.example.auth_phone.AuthPhoneViewModel
import com.example.githubclient.di.qualifier.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AppViewModelBuilder {

    @Binds
    @IntoMap
    @ViewModelKey(AuthPhoneViewModel::class)
    abstract fun bindAuthPhoneViewModel(authPhoneViewModel: AuthPhoneViewModel) : ViewModel

}