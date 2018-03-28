package com.mytaxi.android_demo.tests;

import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.steps.LoginSteps;
import com.mytaxi.android_demo.steps.LogoutSteps;
import com.mytaxi.android_demo.steps.SearchDriverSteps;

import org.junit.Before;
import org.junit.Rule;

public class BaseTest {

    @Rule
    public ClearCacheActivityTestRule<MainActivity> mActivityTestRule = new ClearCacheActivityTestRule<>(MainActivity.class);

    @Before
    public void before() {
        loginSteps = new LoginSteps();
        logoutSteps = new LogoutSteps();
        searchDriverSteps = new SearchDriverSteps();
    }

    LoginSteps loginSteps;
    LogoutSteps logoutSteps;
    SearchDriverSteps searchDriverSteps;
}

