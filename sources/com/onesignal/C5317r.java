package com.onesignal;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo44877d2 = {"Lcom/onesignal/r;", "", "Ljava/lang/Runnable;", "runnable", "", "threadName", "Lr37;", "d", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: com.onesignal.r */
/* compiled from: OSBackgroundManager.kt */
public class C5317r {
    /* renamed from: d */
    public final void mo39086d(Runnable runnable, String str) {
        vx2.m53591g(runnable, "runnable");
        vx2.m53591g(str, "threadName");
        if (OSUtils.m40259H()) {
            new Thread(runnable, str).start();
        } else {
            runnable.run();
        }
    }
}
