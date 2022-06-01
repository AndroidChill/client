package com.example.githubclient.di.module

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        AppViewModelBuilder::class
    ]
)
interface ViewModelBuilder {

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory) : ViewModelProvider.Factory

}