package com.mytaxi.android_demo.screen;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginScreen extends BaseScreen {

    public boolean isDisplayed() {
        return isElemDisplayed(onView(withId(R.id.edt_username)));
    }


    public LoginScreen enterUserName(String userName) {
        type(onView(withId(R.id.edt_username)), userName);
        return this;
    }

    public LoginScreen enterPassword(String password) {
        type(onView(withId(R.id.edt_password)), password);
        return this;

    }

    public void confirm() {
        tap(onView(withId(R.id.btn_login)));
    }

    public boolean snackbarDisplayed() {
        return isElemDisplayed(onView(withId(R.id.snackbar_text)));
    }
}
