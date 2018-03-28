package com.mytaxi.android_demo.tests;


import com.mytaxi.android_demo.data.MemberType;

import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logout() {

        loginSteps
                .GivenIAmLoggedInAs(MemberType.VALID_MEMBER);

        logoutSteps
                .WhenILogOut()
                .ThenIAmLoggedOutOfTheApp();

        loginSteps
                .isDisplayed();
    }
}