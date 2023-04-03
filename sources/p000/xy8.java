package p000;

import android.os.Bundle;

/* renamed from: xy8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class xy8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ty8 f35731a;

    /* renamed from: d */
    public final /* synthetic */ ty8 f35732d;

    /* renamed from: e */
    public final /* synthetic */ long f35733e;

    /* renamed from: g */
    public final /* synthetic */ boolean f35734g;

    /* renamed from: k */
    public final /* synthetic */ jz8 f35735k;

    public xy8(jz8 jz8, ty8 ty8, ty8 ty82, long j, boolean z) {
        this.f35735k = jz8;
        this.f35731a = ty8;
        this.f35732d = ty82;
        this.f35733e = j;
        this.f35734g = z;
    }

    public final void run() {
        this.f35735k.mo44637m(this.f35731a, this.f35732d, this.f35733e, this.f35734g, (Bundle) null);
    }
}
