package com.example.navigation

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.R

object NavigationManager {

    private lateinit var navController: NavController

    fun initialize(context: Context) {
        val navHostFragment = (context as MainActivity).supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    fun navigateUp(): Boolean {
        return navController.navigateUp()
    }

    // Add more navigation functions as needed

}
