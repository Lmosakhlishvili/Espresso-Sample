package com.example.android.testing.espresso.BasicSample.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object ChangeTextPageMatchers {
    val textInputField: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val changedTxtBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val changedTextField: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
    val openAndChangedTxtBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }
    val newTextField: Matcher<View> by lazy { ViewMatchers.withId(R.id.show_text_view) }
}