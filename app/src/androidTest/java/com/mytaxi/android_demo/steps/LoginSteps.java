package com.mytaxi.android_demo.steps;

import com.mytaxi.android_demo.data.MemberType;

import static org.junit.Assert.assertTrue;

public class LoginSteps extends BaseSteps {

    public LoginSteps GivenIAmLoggedInAs(MemberType memberType) {
        loginScreen
                .enterUserName(memberType.getUserName())
                .enterPassword(memberType.getPassword())
                .confirm();
        return this;
    }

    public void ThenIAbleToLoginSuccessfully() {
        assertTrue(landingScreen
                .isDisplayed());
    }

    public void ThenISeeLoginFailureSnackBar() {
        assertTrue(loginScreen
                .snackbarDisplayed());
    }

    public void isDisplayed() {
        assertTrue(loginScreen
                .isDisplayed());
    }
}
