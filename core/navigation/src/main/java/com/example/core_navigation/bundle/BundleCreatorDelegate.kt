package com.example.core_navigation.bundle

import android.os.Bundle
import com.example.core_navigation.params.ScreenParams

inline fun <T: ScreenParams> bundleCreatorDelegate(
    crossinline bundleCreator: ((T) -> Bundle)
) = object : BundleCreator() {

        @Suppress("UNCHECKED_CAST")
        override fun createBundle(data: Any): Bundle {
            return bundleCreator(data as T)
        }

}