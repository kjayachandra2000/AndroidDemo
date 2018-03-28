package com.mytaxi.android_demo.screen;

import android.support.test.espresso.ViewInteraction;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;

import org.hamcrest.Matchers;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;

public class LandingScreen extends BaseScreen {

    public boolean isDisplayed() {
        return isElemDisplayed(onView(withId(R.id.searchContainer)));
    }

    public void enterDriverStartName(String driverStartName) {
        ViewInteraction searchText = onView(withId(R.id.textSearch));
        type(searchText, driverStartName);
        waitABit(500);
    }

    public void selectDriverByName(MainActivity mActivity, String fullName) {
        onView(withText(fullName))
                .inRoot(withDecorView(not(Matchers.is(mActivity.getWindow().getDecorView()))))
                .perform(click());
    }
}
