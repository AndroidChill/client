package com.example.githubclient.di.module.uiBuilder

import com.example.auth.presentation.phone.AuthPhoneFragment
import com.example.auth.presentation.role.AuthRoleFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AuthActivityProvider {

    @ContributesAndroidInjector
    fun injectPhoneFragment(): AuthPhoneFragment

    @ContributesAndroidInjector
    fun injectRoleFragment(): AuthRoleFragment
}