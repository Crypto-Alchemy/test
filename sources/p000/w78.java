package p000;

/* renamed from: w78 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class w78 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ xt8 f35246a;

    /* renamed from: d */
    public final /* synthetic */ b88 f35247d;

    public w78(b88 b88, xt8 xt8) {
        this.f35247d = b88;
        this.f35246a = xt8;
    }

    public final void run() {
        this.f35246a.mo45257b();
        if (rk9.m51151a()) {
            this.f35246a.mo45272s().mo41640o(this);
            return;
        }
        boolean c = this.f35247d.mo29495c();
        long unused = this.f35247d.f21174c = 0;
        if (c) {
            this.f35247d.mo29493a();
        }
    }
}
