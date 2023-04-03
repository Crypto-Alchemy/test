package p000;

/* renamed from: j49 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class j49 {

    /* renamed from: a */
    public final bh0 f30215a;

    /* renamed from: b */
    public long f30216b;

    public j49(bh0 bh0) {
        cu4.m43221k(bh0);
        this.f30215a = bh0;
    }

    /* renamed from: a */
    public final void mo44051a() {
        this.f30216b = this.f30215a.mo29581b();
    }

    /* renamed from: b */
    public final void mo44052b() {
        this.f30216b = 0;
    }

    /* renamed from: c */
    public final boolean mo44053c(long j) {
        if (this.f30216b != 0 && this.f30215a.mo29581b() - this.f30216b < 3600000) {
            return false;
        }
        return true;
    }
}
