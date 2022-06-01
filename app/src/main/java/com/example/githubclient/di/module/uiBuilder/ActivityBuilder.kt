package com.example.githubclient.di.module.uiBuilder

import com.example.auth.presentation.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuilder {

    @ContributesAndroidInjector(modules = [AuthActivityProvider::class])
    fun injectAuthActivity(): AuthActivity

}