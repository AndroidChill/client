package com.example.githubclient.di.module

import com.example.core_navigation.Router
import com.example.core_navigation.ScreenResolver
import com.example.githubclient.navigation.RouterImpl
import com.example.githubclient.navigation.ScreenResolverImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface NavigationModule {

    @Binds
    @Singleton
    fun ScreenResolverImpl.bindScreenResolver(): ScreenResolver

    @Binds
    @Singleton
    fun RouterImpl.bindRouter(): Router
}