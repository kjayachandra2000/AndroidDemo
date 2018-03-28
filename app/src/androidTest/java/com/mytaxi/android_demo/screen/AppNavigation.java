package com.mytaxi.android_demo.screen;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;

public class AppNavigation extends BaseScreen {

    public AppNavigation openMenu() {
        tap(onView(allOf(withContentDescription("Open navigation drawer"))));
        return this;
    }

    public void logout() {
        waitABit(100);
        tap(onView(withId(R.id.design_menu_item_text)));
    }
}
