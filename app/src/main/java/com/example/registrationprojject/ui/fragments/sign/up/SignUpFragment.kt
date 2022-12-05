package com.example.registrationprojject.ui.fragments.sign.up

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.registrationprojject.R
import com.example.registrationprojject.data.locale.preferences.UserPreferencesData
import com.example.registrationprojject.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    @Inject
    lateinit var userPreferencesData: UserPreferencesData
    private val binding by viewBinding(FragmentSignUpBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        migrationToHomeFragment()
    }

    private fun migrationToHomeFragment() = with(binding) {

        btnRegistration.setOnClickListener {
            if (editRegistration.text.length >= 8) {
                userPreferencesData.isAuthorized = true
                requireActivity().findNavController(R.id.nav_host_fragment)
                    .navigate(R.id.action_global_mainFlowFragment)

            } else {
                Toast.makeText(
                    requireContext(),
                    "Text have to be more then 8 symbols",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}