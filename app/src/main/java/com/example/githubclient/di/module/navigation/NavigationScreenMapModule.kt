package com.example.githubclient.di.module.navigation

import com.example.core_navigation.NavigationData
import com.example.core_navigation.bundle.BundleCreator
import com.example.core_navigation.params.AuthRoleScreenParams
import com.example.githubclient.R
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class NavigationScreenMapModule {

    @IntoMap
    @Provides
    @ScreenKey(AuthRoleScreenParams::class)
    fun introFragmentToSignInFragment() : NavigationData = NavigationData(
        navId = com.example.auth.R.id.action_fragment_auth_phone_to_fragment_auth_role,
        bundleCreator = BundleCreator.empty()
    )

}