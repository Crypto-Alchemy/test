package p000;

/* renamed from: kx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class kx8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ u68 f31119a;

    /* renamed from: d */
    public final /* synthetic */ int f31120d;

    /* renamed from: e */
    public final /* synthetic */ long f31121e;

    /* renamed from: g */
    public final /* synthetic */ boolean f31122g;

    /* renamed from: k */
    public final /* synthetic */ sx8 f31123k;

    public kx8(sx8 sx8, u68 u68, int i, long j, boolean z) {
        this.f31123k = sx8;
        this.f31119a = u68;
        this.f31120d = i;
        this.f31121e = j;
        this.f31122g = z;
    }

    public final void run() {
        this.f31123k.mo47915W(this.f31119a);
        sx8.m51956J(this.f31123k, this.f31119a, this.f31120d, this.f31121e, false, this.f31122g);
    }
}
