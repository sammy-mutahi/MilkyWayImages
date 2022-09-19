package com.sammy.milkywayimages.ui

import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.sammy.domain.model.SearchResult
import com.sammy.presentation.R
import com.sammy.presentation.ui.SearchFragment
import com.sammy.presentation.ui.SearchResultAdapter
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.mockk.mockkClass
import io.mockk.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class SearchFragmentTest {

    private lateinit var mockNavController: NavController

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
        mockNavController = mockkClass(NavController::class, relaxed = true)
    }

    @Test
    fun galaxyImagesAreDisplayed() {
        launchFragmentInContainer<SearchFragment>()
        onView(withId(R.id.galaxyRecycler)).check(matches(isDisplayed()))
    }

    @Test
    fun clickGalaxyInfoOpenDetailsScreen() {
        val bundle = bundleOf(
            "selectedItem" to SearchResult(
                nasaId = "1",
                title = "Galaxy Test",
                center = "Kenya",
                description = "Something somthing test",
                imagePath = "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001362/GSFC_20171208_Archive_e001362~thumb.jpg",
                dateCreated = "2022-09-19T00:00:00Z"
            )
        )
        val searchFragment = launchFragmentInContainer<SearchFragment>()
        searchFragment.onFragment { fragment ->
            Navigation.setViewNavController(fragment.requireView(), mockNavController)
        }
        onView(withId(R.id.galaxyRecycler)).check(matches(isDisplayed()))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<SearchResultAdapter.ViewHolder>(0, click())
            )
        verify {
            mockNavController.navigate(
                R.id.action_searchFragment_to_searchItemDetailsFragment,
                bundle
            )
        }
        //verify details screen is opened
        onView(withId(R.id.contentScrolling)).check(matches(isDisplayed()))
    }
}