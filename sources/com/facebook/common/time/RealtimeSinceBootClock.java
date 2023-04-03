package com.facebook.common.time;

import android.os.SystemClock;

@ii1
public class RealtimeSinceBootClock implements vx3 {

    /* renamed from: a */
    public static final RealtimeSinceBootClock f9495a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @ii1
    public static RealtimeSinceBootClock get() {
        return f9495a;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
