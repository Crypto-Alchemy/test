package p000;

import android.os.Handler;

/* renamed from: b88 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public abstract class b88 {

    /* renamed from: d */
    public static volatile Handler f21171d;

    /* renamed from: a */
    public final xt8 f21172a;

    /* renamed from: b */
    public final Runnable f21173b;

    /* renamed from: c */
    public volatile long f21174c;

    public b88(xt8 xt8) {
        cu4.m43221k(xt8);
        this.f21172a = xt8;
        this.f21173b = new w78(this, xt8);
    }

    /* renamed from: a */
    public abstract void mo29493a();

    /* renamed from: b */
    public final void mo29494b(long j) {
        mo29496d();
        if (j >= 0) {
            this.f21174c = this.f21172a.mo45256a().mo29580a();
            if (!mo29497f().postDelayed(this.f21173b, j)) {
                this.f21172a.mo45237A().mo29670l().mo48770b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: c */
    public final boolean mo29495c() {
        return this.f21174c != 0;
    }

    /* renamed from: d */
    public final void mo29496d() {
        this.f21174c = 0;
        mo29497f().removeCallbacks(this.f21173b);
    }

    /* renamed from: f */
    public final Handler mo29497f() {
        Handler handler;
        if (f21171d != null) {
            return f21171d;
        }
        synchronized (b88.class) {
            if (f21171d == null) {
                f21171d = new rd8(this.f21172a.mo45271q().getMainLooper());
            }
            handler = f21171d;
        }
        return handler;
    }
}
