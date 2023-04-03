package p000;

import android.os.Bundle;

/* renamed from: sv8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class sv8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f34019a;

    /* renamed from: d */
    public final /* synthetic */ String f34020d;

    /* renamed from: e */
    public final /* synthetic */ long f34021e;

    /* renamed from: g */
    public final /* synthetic */ Bundle f34022g;

    /* renamed from: k */
    public final /* synthetic */ boolean f34023k;

    /* renamed from: r */
    public final /* synthetic */ boolean f34024r;

    /* renamed from: s */
    public final /* synthetic */ boolean f34025s;

    /* renamed from: x */
    public final /* synthetic */ String f34026x;

    /* renamed from: y */
    public final /* synthetic */ sx8 f34027y;

    public sv8(sx8 sx8, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f34027y = sx8;
        this.f34019a = str;
        this.f34020d = str2;
        this.f34021e = j;
        this.f34022g = bundle;
        this.f34023k = z;
        this.f34024r = z2;
        this.f34025s = z3;
        this.f34026x = str3;
    }

    public final void run() {
        this.f34027y.mo47918Z(this.f34019a, this.f34020d, this.f34021e, this.f34022g, this.f34023k, this.f34024r, this.f34025s, this.f34026x);
    }
}
