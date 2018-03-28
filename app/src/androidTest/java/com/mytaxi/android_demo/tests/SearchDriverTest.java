package com.mytaxi.android_demo.tests;


import com.mytaxi.android_demo.data.MemberType;

import org.junit.Test;


public class SearchDriverTest extends BaseTest {

    private final static String DRIVER_START_NAME = "sa";
    private final static String DRIVER_FULL_NAME = "Sarah Friedrich";

    @Test
    public void searchByDriverNameTest() {
        loginSteps
                .GivenIAmLoggedInAs(MemberType.VALID_MEMBER);

        searchDriverSteps
                .GivenISearchBy(DRIVER_START_NAME)
                .ThenISelectDriverByName(mActivityTestRule.getActivity(), DRIVER_FULL_NAME)
                .ThenIamOnDriverInformation(DRIVER_FULL_NAME);

    }
}