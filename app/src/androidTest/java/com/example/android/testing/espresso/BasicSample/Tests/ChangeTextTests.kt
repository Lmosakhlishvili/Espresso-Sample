package com.example.android.testing.espresso.BasicSample.Tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.Helper.typeText
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPageViewMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkSecondActivity(){
        with(ChangeTextPageViewMatcher){
            TextInputField.typeText("My name is Lasha")

        }

    }

}