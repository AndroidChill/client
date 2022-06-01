package com.example.githubclient.di.module

import android.app.Application
import android.content.ContentResolver
import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: Application): Context = application.applicationContext

    @Provides
    fun provideTheme(context: Context): Resources.Theme = context.theme

    @Provides
    fun provideContentResolver(context: Context): ContentResolver =
        context.contentResolver

    @Provides
    fun provideDataPreferences(context: Context): SharedPreferences =
        context.getSharedPreferences("quiz_preferences", Context.MODE_PRIVATE)
}