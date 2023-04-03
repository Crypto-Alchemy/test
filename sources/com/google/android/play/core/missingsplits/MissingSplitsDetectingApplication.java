package com.google.android.play.core.missingsplits;

import android.app.Application;

@Deprecated
public class MissingSplitsDetectingApplication extends Application {

    /* renamed from: a */
    public boolean f24777a = false;

    @Deprecated
    /* renamed from: a */
    public void mo34278a() {
    }

    public final void onCreate() {
        if (!this.f24777a) {
            this.f24777a = true;
            if (!aw3.m32273a(this).mo29045a()) {
                super.onCreate();
                mo34278a();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}
