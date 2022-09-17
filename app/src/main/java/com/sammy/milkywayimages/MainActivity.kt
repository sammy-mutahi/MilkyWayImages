package com.sammy.milkywayimages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = NavHostFragment.create(
            com.sammy.presentation.R.navigation.core_navigation_graph
        )

        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host, navHostFragment)
            .setPrimaryNavigationFragment(navHostFragment)
            .commit()
    }
}