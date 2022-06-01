package com.example.githubclient

import android.app.Application
import com.example.githubclient.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TestApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
         DaggerAppComponent.factory().create(this)



}