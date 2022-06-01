package com.example.githubclient.di.module.navigation

import com.example.core_navigation.params.ScreenParams
import dagger.MapKey
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ScreenKey(
    val value: KClass<out ScreenParams>
)