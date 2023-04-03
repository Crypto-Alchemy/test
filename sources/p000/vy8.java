package p000;

import android.os.Bundle;

/* renamed from: vy8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class vy8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f35214a;

    /* renamed from: d */
    public final /* synthetic */ ty8 f35215d;

    /* renamed from: e */
    public final /* synthetic */ ty8 f35216e;

    /* renamed from: g */
    public final /* synthetic */ long f35217g;

    /* renamed from: k */
    public final /* synthetic */ jz8 f35218k;

    public vy8(jz8 jz8, Bundle bundle, ty8 ty8, ty8 ty82, long j) {
        this.f35218k = jz8;
        this.f35214a = bundle;
        this.f35215d = ty8;
        this.f35216e = ty82;
        this.f35217g = j;
    }

    public final void run() {
        jz8.m46822E(this.f35218k, this.f35214a, this.f35215d, this.f35216e, this.f35217g);
    }
}
