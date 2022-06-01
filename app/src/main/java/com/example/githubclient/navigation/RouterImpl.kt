package com.example.githubclient.navigation

import android.app.Activity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.core_navigation.Router
import com.example.core_navigation.ScreenResolver
import com.example.core_navigation.params.ScreenParams
import com.example.githubclient.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RouterImpl @Inject constructor(
    private val screenResolver: ScreenResolver
) : Router {

    private var navController: NavController? = null
    private var activity: Activity? = null

    override fun bind(activity: Activity) {
        this.activity = activity
        this.navController = activity.findNavController(R.id.container)
    }

    override fun navigate(data: ScreenParams, sharedElements: Map<Any, String>) {
        screenResolver.navigate(navController, data, sharedElements)
    }

    override fun back() {
        navController?.navigateUp()
    }
}