package com.example.android.testing.espresso.BasicSample.Tests

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPageMatchers
import com.example.android.testing.espresso.BasicSample.Steps.ChangeTextSteps
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test

    fun checkedChangeText() {
        with(ChangeTextPageMatchers) {
            val typedText = "Giga Janiashvili"
            ChangeTextSteps.typeText(typedText)
            changedTxtBtn.tap()

            Assert.assertEquals(typedText, changedTextField.getText(5))
        }


    }
    @Test
    fun checkPrintedText(){
        with(ChangeTextPageMatchers) {
            val typedText = "Giga Janiashvili"
            ChangeTextSteps.typeText(typedText)
            openAndChangedTxtBtn.tap()

            Assert.assertEquals(typedText, newTextField.getText(5))



    }
}}