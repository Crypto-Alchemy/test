package p000;

/* renamed from: ix8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ix8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ u68 f30161a;

    /* renamed from: d */
    public final /* synthetic */ int f30162d;

    /* renamed from: e */
    public final /* synthetic */ long f30163e;

    /* renamed from: g */
    public final /* synthetic */ boolean f30164g;

    /* renamed from: k */
    public final /* synthetic */ sx8 f30165k;

    public ix8(sx8 sx8, u68 u68, int i, long j, boolean z) {
        this.f30165k = sx8;
        this.f30161a = u68;
        this.f30162d = i;
        this.f30163e = j;
        this.f30164g = z;
    }

    public final void run() {
        this.f30165k.mo47915W(this.f30161a);
        sx8.m51956J(this.f30165k, this.f30161a, this.f30162d, this.f30163e, false, this.f30164g);
    }
}
