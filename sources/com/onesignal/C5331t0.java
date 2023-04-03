package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.OneSignal;

/* renamed from: com.onesignal.t0 */
/* compiled from: OSTimeoutHandler */
public class C5331t0 extends HandlerThread {

    /* renamed from: d */
    public static final String f26546d = C5331t0.class.getCanonicalName();

    /* renamed from: e */
    public static final Object f26547e = new Object();

    /* renamed from: g */
    public static C5331t0 f26548g;

    /* renamed from: a */
    public final Handler f26549a = new Handler(getLooper());

    public C5331t0() {
        super(f26546d);
        start();
    }

    /* renamed from: b */
    public static C5331t0 m41330b() {
        if (f26548g == null) {
            synchronized (f26547e) {
                if (f26548g == null) {
                    f26548g = new C5331t0();
                }
            }
        }
        return f26548g;
    }

    /* renamed from: a */
    public void mo39118a(Runnable runnable) {
        synchronized (f26547e) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "Running destroyTimeout with runnable: " + runnable.toString());
            this.f26549a.removeCallbacks(runnable);
        }
    }

    /* renamed from: c */
    public void mo39119c(long j, Runnable runnable) {
        synchronized (f26547e) {
            mo39118a(runnable);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "Running startTimeout with timeout: " + j + " and runnable: " + runnable.toString());
            this.f26549a.postDelayed(runnable, j);
        }
    }
}
