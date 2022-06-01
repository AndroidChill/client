package com.example.core_navigation

import androidx.navigation.NavController
import com.example.core_navigation.params.ScreenParams

interface ScreenResolver {

    fun navigate(
        navController: NavController?,
        data: ScreenParams,
        sharedElements: Map<Any, String>?
    )

}