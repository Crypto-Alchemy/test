package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class LifecycleCallback {

    /* renamed from: a */
    public final qg3 f22232a;

    public LifecycleCallback(qg3 qg3) {
        this.f22232a = qg3;
    }

    /* renamed from: c */
    public static qg3 m33663c(mg3 mg3) {
        if (mg3.mo45787d()) {
            return xh8.m54398j(mg3.mo45785b());
        }
        if (mg3.mo45786c()) {
            return zzb.m33685e(mg3.mo45784a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    /* renamed from: d */
    public static qg3 m33664d(Activity activity) {
        return m33663c(new mg3(activity));
    }

    @Keep
    private static qg3 getChimeraLifecycleFragmentImpl(mg3 mg3) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo30588a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity mo30589b() {
        Activity g = this.f22232a.mo30610g();
        cu4.m43221k(g);
        return g;
    }

    /* renamed from: e */
    public void mo30590e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo30591f(Bundle bundle) {
    }

    /* renamed from: g */
    public void mo30592g() {
    }

    /* renamed from: h */
    public void mo30593h() {
    }

    /* renamed from: i */
    public void mo30594i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo30595j() {
    }

    /* renamed from: k */
    public void mo30596k() {
    }
}
