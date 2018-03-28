package com.mytaxi.android_demo.tests;


import com.mytaxi.android_demo.data.MemberType;

import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validUserTest() {
        loginSteps
                .GivenIAmLoggedInAs(MemberType.VALID_MEMBER)
                .ThenIAbleToLoginSuccessfully();
    }

    @Test
    public void inValidUserNameTest() {
        loginSteps
                .GivenIAmLoggedInAs(MemberType.WRONG_USERNAME)
                .ThenISeeLoginFailureSnackBar();
    }

    @Test
    public void inValidPasswordTest() {
        loginSteps
                .GivenIAmLoggedInAs(MemberType.WRONG_PASSWORD)
                .ThenISeeLoginFailureSnackBar();
    }

    @Test
    public void inValidLoginDetailsTest() {
        loginSteps
                .GivenIAmLoggedInAs(MemberType.WRONG_USERNAMEANDPWD)
                .ThenISeeLoginFailureSnackBar();
    }
}