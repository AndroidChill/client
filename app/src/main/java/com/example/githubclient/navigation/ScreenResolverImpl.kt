package com.example.githubclient.navigation

import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigator
import androidx.navigation.fragment.FragmentNavigator
import com.example.core_navigation.NavigationData
import com.example.core_navigation.ScreenResolver
import com.example.core_navigation.params.ScreenParams
import javax.inject.Inject

class ScreenResolverImpl @Inject constructor(
    private val navigationDataMap: Map<Class<out ScreenParams>, NavigationData>
) : ScreenResolver {

    override fun navigate(
        navController: NavController?,
        data: ScreenParams,
        sharedElements: Map<Any, String>?
    ) {
        val navExtras = toNavExtras(sharedElements)

        navigationDataMap[data::class.java]
            ?.let {
                navController?.navigate(
                    it.navId,
                    it.bundleCreator.createBundle(data),
                    null,
                    navExtras
                )
            }
            ?: run {
                Log.d("error", "Navigation error, unknown screen data: $data")
            }
    }

    private fun toNavExtras(sharedElements: Map<Any, String>?): Navigator.Extras {
        return FragmentNavigator.Extras.Builder().apply {
            sharedElements?.forEach { (key, value) ->
                (key as? View)?.let { view ->
                    addSharedElement(view, value)
                }
            }
        }.build()
    }
}