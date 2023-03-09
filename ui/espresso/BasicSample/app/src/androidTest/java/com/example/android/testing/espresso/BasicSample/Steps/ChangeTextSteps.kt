package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPageMatchers
import com.example.android.testing.espresso.BasicSample.typeText

object ChangeTextSteps {
    fun typeText(text: String){
        ChangeTextPageMatchers.textInputField.typeText(text)
    }
}