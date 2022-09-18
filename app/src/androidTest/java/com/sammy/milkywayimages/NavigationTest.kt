package com.sammy.milkywayimages

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
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

        // Verify recyclerview is displayed
        onView(ViewMatchers.withId(R.id.galaxyRecycler)).check(matches(isDisplayed()))
        //verify start destination is search fragment
        assertThat(navController.currentDestination?.id).isEqualTo(R.id.searchFragment)
    }
}