package com.example.android.testing.espresso.BasicSample.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object ChangeTextPageViewMatcher {

    val TextInputField: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val ChangeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val TextViewField: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
}