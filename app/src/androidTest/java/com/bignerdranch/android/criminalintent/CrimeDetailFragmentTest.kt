package com.bignerdranch.android.criminalintent

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.jupiter.api.Test

class CrimeDetailFragmentTest {
    private lateinit var scenario :FragmentScenario<CrimeDetailFragment>

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
        // launch fragment
        launchFragmentInContainer<CrimeDetailFragment>(themeResId = R.style.Theme_CriminalIntent)
        scenario.moveToState(Lifecycle.State.STARTED)


    }

    @Test
    fun testTitleEditText(){
        // test title edit text
        val testText ="Test Title"
        scenario.onFragment { fragment ->
            fragment.binding.crimeTitle.setText(testText)
        }
        onView(withId(R.id.crime_title)).check(matches(withText(testText)))


    }

}