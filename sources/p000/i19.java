package p000;

import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: i19 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class i19 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f29783a;

    /* renamed from: d */
    public final /* synthetic */ boolean f29784d;

    /* renamed from: e */
    public final /* synthetic */ zzaa f29785e;

    /* renamed from: g */
    public final /* synthetic */ zzaa f29786g;

    /* renamed from: k */
    public final /* synthetic */ g29 f29787k;

    public i19(g29 g29, boolean z, zzp zzp, boolean z2, zzaa zzaa, zzaa zzaa2) {
        this.f29787k = g29;
        this.f29783a = zzp;
        this.f29784d = z2;
        this.f29785e = zzaa;
        this.f29786g = zzaa2;
    }

    public final void run() {
        zzaa zzaa;
        am8 z = this.f29787k.f29060d;
        if (z == null) {
            this.f29787k.f34342a.mo45237A().mo29670l().mo48769a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        cu4.m43221k(this.f29783a);
        g29 g29 = this.f29787k;
        if (this.f29784d) {
            zzaa = null;
        } else {
            zzaa = this.f29785e;
        }
        g29.mo42717K(z, zzaa, this.f29783a);
        this.f29787k.mo42710D();
    }
}
