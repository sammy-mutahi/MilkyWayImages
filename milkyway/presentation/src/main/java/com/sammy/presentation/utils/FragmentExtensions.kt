package com.sammy.presentation.utils

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.google.android.material.appbar.MaterialToolbar
import java.lang.ref.WeakReference

fun MaterialToolbar.handleNavigationUp(fragment: WeakReference<Fragment>) {
    this.setNavigationOnClickListener {
        fragment.get()?.let {
            findNavController(it).navigateUp()
        }
    }
}