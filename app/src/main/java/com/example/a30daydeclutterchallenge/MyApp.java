package com.example.a30daydeclutterchallenge;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by aashiamehta on 4/5/17.
 */

public class MyApp extends Application {
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(3000);
    }
}
