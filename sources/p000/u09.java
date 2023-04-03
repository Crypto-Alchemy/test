package p000;

import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: u09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class u09 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f34435a;

    /* renamed from: d */
    public final /* synthetic */ boolean f34436d;

    /* renamed from: e */
    public final /* synthetic */ zzas f34437e;

    /* renamed from: g */
    public final /* synthetic */ String f34438g;

    /* renamed from: k */
    public final /* synthetic */ g29 f34439k;

    public u09(g29 g29, boolean z, zzp zzp, boolean z2, zzas zzas, String str) {
        this.f34439k = g29;
        this.f34435a = zzp;
        this.f34436d = z2;
        this.f34437e = zzas;
        this.f34438g = str;
    }

    public final void run() {
        zzas zzas;
        am8 z = this.f34439k.f29060d;
        if (z == null) {
            this.f34439k.f34342a.mo45237A().mo29670l().mo48769a("Discarding data. Failed to send event to service");
            return;
        }
        cu4.m43221k(this.f34435a);
        g29 g29 = this.f34439k;
        if (this.f34436d) {
            zzas = null;
        } else {
            zzas = this.f34437e;
        }
        g29.mo42717K(z, zzas, this.f34435a);
        this.f34439k.mo42710D();
    }
}
