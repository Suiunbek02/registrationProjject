package com.example.registrationprojject.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

abstract class BaseFlowFragment(@LayoutRes layoutId: Int,
    val idFlowFragment: Int,
) : Fragment(layoutId){


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFragment =
            childFragmentManager.findFragmentById(idFlowFragment) as NavHostFragment
        val navController = navHostFragment.navController
    }


}