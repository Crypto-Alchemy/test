package p000;

/* renamed from: fx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class fx8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ u68 f29017a;

    /* renamed from: d */
    public final /* synthetic */ long f29018d;

    /* renamed from: e */
    public final /* synthetic */ int f29019e;

    /* renamed from: g */
    public final /* synthetic */ long f29020g;

    /* renamed from: k */
    public final /* synthetic */ boolean f29021k;

    /* renamed from: r */
    public final /* synthetic */ sx8 f29022r;

    public fx8(sx8 sx8, u68 u68, long j, int i, long j2, boolean z) {
        this.f29022r = sx8;
        this.f29017a = u68;
        this.f29018d = j;
        this.f29019e = i;
        this.f29020g = j2;
        this.f29021k = z;
    }

    public final void run() {
        this.f29022r.mo47915W(this.f29017a);
        this.f29022r.mo47928r(this.f29018d, false);
        sx8.m51956J(this.f29022r, this.f29017a, this.f29019e, this.f29020g, true, this.f29021k);
    }
}
