package com.mytaxi.android_demo.steps;

import com.mytaxi.android_demo.screen.DriverInfoScreen;
import com.mytaxi.android_demo.screen.LandingScreen;
import com.mytaxi.android_demo.screen.LoginScreen;
import com.mytaxi.android_demo.screen.AppNavigation;

public class BaseSteps {
    LoginScreen loginScreen = new LoginScreen();
    LandingScreen landingScreen = new LandingScreen();
    AppNavigation appNavigation = new AppNavigation();
    DriverInfoScreen driverInfoScreen = new DriverInfoScreen();
}
