package p000;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: a29 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class a29 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ e29 f20793a;

    public a29(e29 e29) {
        this.f20793a = e29;
    }

    public final void run() {
        g29 g29 = this.f20793a.f28374e;
        Context q = g29.f34342a.mo45271q();
        this.f20793a.f28374e.f34342a.mo45257b();
        g29.m44472w(g29, new ComponentName(q, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
