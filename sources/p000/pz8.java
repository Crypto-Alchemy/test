package p000;

import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: pz8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class pz8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f32893a;

    /* renamed from: d */
    public final /* synthetic */ boolean f32894d;

    /* renamed from: e */
    public final /* synthetic */ zzkq f32895e;

    /* renamed from: g */
    public final /* synthetic */ g29 f32896g;

    public pz8(g29 g29, zzp zzp, boolean z, zzkq zzkq) {
        this.f32896g = g29;
        this.f32893a = zzp;
        this.f32894d = z;
        this.f32895e = zzkq;
    }

    public final void run() {
        zzkq zzkq;
        am8 z = this.f32896g.f29060d;
        if (z == null) {
            this.f32896g.f34342a.mo45237A().mo29670l().mo48769a("Discarding data. Failed to set user property");
            return;
        }
        cu4.m43221k(this.f32893a);
        g29 g29 = this.f32896g;
        if (this.f32894d) {
            zzkq = null;
        } else {
            zzkq = this.f32895e;
        }
        g29.mo42717K(z, zzkq, this.f32893a);
        this.f32896g.mo42710D();
    }
}
