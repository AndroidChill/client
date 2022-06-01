package com.example.auth.presentation.role

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.core_utils.BaseFragment
import com.example.auth.databinding.FragmentAuthRoleBinding as Binding

class AuthRoleFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

}