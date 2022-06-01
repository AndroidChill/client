package com.example.core_navigation

import android.app.Activity
import com.example.core_navigation.params.ScreenParams

interface Router {

    fun bind(activity: Activity)

    fun navigate(data: ScreenParams, sharedElements: Map<Any, String>)

    fun back()

}