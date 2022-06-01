package com.example.githubclient.di.component

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.githubclient.TestApp
import com.example.githubclient.di.module.AppModule
import com.example.githubclient.di.module.NavigationModule
import com.example.githubclient.di.module.NetworkModule
import com.example.githubclient.di.module.ViewModelBuilder
import com.example.githubclient.di.module.navigation.NavigationScreenMapModule
import com.example.githubclient.di.module.uiBuilder.ActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ActivityBuilder::class,
        ViewModelBuilder::class,
        NetworkModule::class,
        NavigationModule::class,
        NavigationScreenMapModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface AppComponent : AndroidInjector<TestApp> {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance application: Application) : AppComponent
    }

}