package p000;

import com.google.android.gms.measurement.internal.zzp;

/* renamed from: bt8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class bt8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f21467a;

    /* renamed from: d */
    public final /* synthetic */ rt8 f21468d;

    public bt8(rt8 rt8, zzp zzp) {
        this.f21468d = rt8;
        this.f21467a = zzp;
    }

    public final void run() {
        this.f21468d.f33579a.mo47670i();
        s59 w1 = this.f21468d.f33579a;
        zzp zzp = this.f21467a;
        w1.mo45272s().mo29006e();
        w1.mo47661d0();
        cu4.m43217g(zzp.f23098a);
        u68 c = u68.m52648c(zzp.f23097Z);
        u68 f0 = w1.mo47665f0(zzp.f23098a);
        w1.mo45237A().mo29678v().mo48771c("Setting consent, package, consent", zzp.f23098a, c);
        w1.mo47663e0(zzp.f23098a, c);
        if (c.mo48333i(f0)) {
            w1.mo47674k(zzp);
        }
    }
}
