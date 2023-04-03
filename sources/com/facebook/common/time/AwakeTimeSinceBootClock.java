package com.facebook.common.time;

import android.os.SystemClock;

@ii1
public class AwakeTimeSinceBootClock implements vx3, ay3 {
    @ii1
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @ii1
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @ii1
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @ii1
    public long nowNanos() {
        return System.nanoTime();
    }
}
