package com.onesignal;

import com.onesignal.OneSignal;

/* renamed from: com.onesignal.c0 */
/* compiled from: OSLogWrapper */
public class C5203c0 implements ld4 {
    /* renamed from: a */
    public void mo38716a(String str) {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.VERBOSE, str);
    }

    /* renamed from: b */
    public void mo38717b(String str) {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.WARN, str);
    }

    public void debug(String str) {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, str);
    }

    public void error(String str) {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.ERROR, str);
    }

    public void info(String str) {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.INFO, str);
    }

    public void error(String str, Throwable th) {
        OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, str, th);
    }
}
