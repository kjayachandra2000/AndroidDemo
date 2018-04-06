package com.mytaxi.android_demo.tests;


import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;


public class SearchTest extends BaseTest {

    private final static String DRIVER_START_NAME = "sa";
    private final static String DRIVER_FULL_NAME = "Sarah Friedrich";

    @Rule
    public ClearCacheActivityAndStorePrefTestRule<MainActivity> mActivityTestRule =
            new ClearCacheActivityAndStorePrefTestRule<>(MainActivity.class);

    @Test
    public void search() {
        searchDriverSteps
                .GivenISearchBy(DRIVER_START_NAME)
                .ThenISelectDriverByName(mActivityTestRule.getActivity(), DRIVER_FULL_NAME)
                .ThenIamOnDriverInformation(DRIVER_FULL_NAME);
    }
}