package com.mytaxi.android_demo.steps;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class LogoutSteps extends BaseSteps {

    public LogoutSteps WhenILogOut() {
        appNavigation
                .openMenu()
                .logout();

        return this;
    }

    public void ThenIAmLoggedOutOfTheApp() {
        assertThat(loginScreen.isDisplayed(), is(true));
    }
}
