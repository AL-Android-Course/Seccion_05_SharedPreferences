package com.alejandro.mylogin.App;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Alejandro on 4/12/16.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SystemClock.sleep(3000);
    }
}
