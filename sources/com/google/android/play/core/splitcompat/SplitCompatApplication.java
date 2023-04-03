package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;

public class SplitCompatApplication extends Application {
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        w66.m53746g(this);
    }
}
