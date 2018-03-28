package com.mytaxi.android_demo.steps;

import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.data.MemberType;

import static org.junit.Assert.assertTrue;

public class SearchDriverSteps extends BaseSteps {

    public SearchDriverSteps GivenISearchBy(String driverStartName) {
        landingScreen
                .enterDriverStartName(driverStartName);
        return this;
    }

    public SearchDriverSteps ThenISelectDriverByName(MainActivity mActivity, String fullName) {
        landingScreen
                .selectDriverByName(mActivity, fullName);
        return this;
    }

    public void ThenIamOnDriverInformation(String driverName) {
        driverInfoScreen
                .isDisplayed()
                .checkDriverFullName(driverName);
    }
}
