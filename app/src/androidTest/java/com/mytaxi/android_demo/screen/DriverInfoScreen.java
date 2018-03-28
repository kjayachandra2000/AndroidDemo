package com.mytaxi.android_demo.screen;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class DriverInfoScreen extends BaseScreen {

    public DriverInfoScreen isDisplayed() {
        assert isElemDisplayed(onView(withId(R.id.textViewDriverName)));
        return this;
    }

    public void checkDriverFullName(String driverName) {
        onView(withId(R.id.textViewDriverName))
                .check(matches(withText(driverName)));
    }
}
