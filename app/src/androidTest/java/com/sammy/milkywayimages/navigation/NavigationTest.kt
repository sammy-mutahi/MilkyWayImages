package com.sammy.milkywayimages.navigation

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.runner.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import com.sammy.presentation.R
import com.sammy.presentation.ui.SearchFragment
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test
import org.junit.runner.RunWith

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @Test
    fun navigationControllerTest() {
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )

        // Create a graphical FragmentScenario for the SearchFragment
        val fragmentScenario = launchFragmentInContainer<SearchFragment>()

        fragmentScenario.onFragment { fragment ->
            // Set the graph on the TestNavHostController
            navController.setGraph(R.navigation.core_navigation_graph)

            // Make the NavController available via the findNavController() APIs
            Navigation.setViewNavController(fragment.requireView(), navController)
        }
        //verify start destination is search fragment
        assertThat(navController.currentDestination?.id).isEqualTo(R.id.searchFragment)
    }
}