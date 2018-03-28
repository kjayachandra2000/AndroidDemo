package com.mytaxi.android_demo.tests;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import java.io.File;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.InstrumentationRegistry.getTargetContext;


public class ClearCacheActivityTestRule<T extends Activity> extends ActivityTestRule<T> {

    ClearCacheActivityTestRule(Class<T> activityClass) {
        super(activityClass);
    }

    @Override
    protected void beforeActivityLaunched() {
        super.beforeActivityLaunched();
        File root = InstrumentationRegistry.getTargetContext()
                .getFilesDir()
                .getParentFile();
        String[] sharedPreferencesFileNames = new File(root, "shared_prefs").list();

        if (sharedPreferencesFileNames != null) {
            for (String fileName : sharedPreferencesFileNames) {
                InstrumentationRegistry.getTargetContext()
                        .getSharedPreferences(fileName.replace(".xml", ""), Context.MODE_PRIVATE)
                        .edit()
                        .clear()
                        .commit();
            }
        }
        grantPhonePermission();
    }

    private void grantPhonePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            getInstrumentation().getUiAutomation().executeShellCommand(
                    "pm grant " + getTargetContext().getPackageName()
                            + " android.permission.ACCESS_FINE_LOCATION");
    }
}
