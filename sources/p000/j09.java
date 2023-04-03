package p000;

/* renamed from: j09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class j09 extends b88 {

    /* renamed from: e */
    public final /* synthetic */ g29 f30197e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j09(g29 g29, xt8 xt8) {
        super(xt8);
        this.f30197e = g29;
    }

    /* renamed from: a */
    public final void mo29493a() {
        g29 g29 = this.f30197e;
        g29.mo29006e();
        if (g29.mo42714H()) {
            g29.f34342a.mo45237A().mo29678v().mo48769a("Inactivity, disconnecting from the service");
            g29.mo42735r();
        }
    }
}
