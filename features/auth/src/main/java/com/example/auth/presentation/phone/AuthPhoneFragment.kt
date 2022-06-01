package com.example.auth.presentation.phone

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.core_utils.BaseFragment
import com.example.auth.databinding.FragmentAuthPhoneBinding as Binding

class AuthPhoneFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

//    val viewModel by lazy {
//        viewModelFactory.create(AuthPhoneViewModel::class.java)
//    }

}