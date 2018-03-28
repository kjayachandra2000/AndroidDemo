package com.mytaxi.android_demo.screen;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewInteraction;

import org.junit.Before;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class BaseScreen {

    void type(ViewInteraction viewInteraction, String text) {
        if (isElemDisplayed(viewInteraction)) {
            viewInteraction
                    .perform(typeText(text), closeSoftKeyboard());
        } else {
            throw new RuntimeException("Element Not Found");
        }
    }

    void tap(ViewInteraction viewInteraction) {
        if (isElemDisplayed(viewInteraction)) {
            viewInteraction.perform(click());
        } else {
            throw new RuntimeException("Element Not Found");
        }
    }

    boolean isElemDisplayed(ViewInteraction viewInteraction) {
        boolean elemDisplayed = false;
        int count = 1;
        while (!elemDisplayed) {
            try {
                viewInteraction.check(matches(isDisplayed()));
                elemDisplayed = true;
            } catch (NoMatchingViewException | AssertionError e) {
                elemDisplayed = false;
                waitABit(100);
            }
            count++;
            if (count++ > 1000) {
                break;
            }
        }
        return elemDisplayed;
    }

    boolean isElemNotDisplayed(ViewInteraction viewInteraction) {
        boolean elemNotDisplayed = false;
        int count = 1;
        while (!elemNotDisplayed) {
            try {
                viewInteraction.check(matches(isDisplayed()));
                elemNotDisplayed = false;
                waitABit(100);
            } catch (NoMatchingViewException | AssertionError e) {
                elemNotDisplayed = true;
            }
            count++;
            if (count++ > 1000) {
                break;
            }
        }
        return elemNotDisplayed;
    }

    void waitABit(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
