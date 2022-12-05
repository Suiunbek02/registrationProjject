package com.example.registrationprojject.ui.fragments.sign.`in`

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.registrationprojject.R
import com.example.registrationprojject.data.locale.preferences.UserPreferencesData
import com.example.registrationprojject.databinding.FragmentSignInBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class SignUpFragment : Fragment(R.layout.fragment_sign_in) {

    private val binding by viewBinding(FragmentSignInBinding::bind)

    @Inject
    lateinit var userPreferencesData: UserPreferencesData

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        clickSignIn()
        clickSignUp()
    }

    private fun clickSignIn() {
        binding.signInBottom.setOnClickListener {
            userPreferencesData.isAuthorized = true
            requireActivity().findNavController(R.id.nav_host_fragment)
                .navigate(R.id.action_global_mainFlowFragment)
        }
    }

    private fun clickSignUp() {
        binding.signUpBottom.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment1_to_signUpFragment2)
        }
    }
}