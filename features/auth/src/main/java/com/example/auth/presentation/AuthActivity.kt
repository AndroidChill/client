package com.example.auth.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.auth.R
import com.example.core_navigation.Router
import com.example.core_utils.BaseActivity
import javax.inject.Inject

class AuthActivity : BaseActivity() {

    @Inject
    lateinit var router: Router

    override fun initData() {
        setContentView(R.layout.activity_auth)
        router.bind(this)
    }
}