package p000;

import androidx.media3.common.C0820n;

/* renamed from: a86 */
/* compiled from: StandaloneMediaClock */
public final class a86 implements sq3 {

    /* renamed from: a */
    public final dh0 f64a;

    /* renamed from: d */
    public boolean f65d;

    /* renamed from: e */
    public long f66e;

    /* renamed from: g */
    public long f67g;

    /* renamed from: k */
    public C0820n f68k = C0820n.f4404g;

    public a86(dh0 dh0) {
        this.f64a = dh0;
    }

    /* renamed from: a */
    public void mo105a(long j) {
        this.f66e = j;
        if (this.f65d) {
            this.f67g = this.f64a.mo18770b();
        }
    }

    /* renamed from: b */
    public void mo106b(C0820n nVar) {
        if (this.f65d) {
            mo105a(mo110q());
        }
        this.f68k = nVar;
    }

    /* renamed from: c */
    public void mo107c() {
        if (!this.f65d) {
            this.f67g = this.f64a.mo18770b();
            this.f65d = true;
        }
    }

    /* renamed from: d */
    public C0820n mo108d() {
        return this.f68k;
    }

    /* renamed from: e */
    public void mo109e() {
        if (this.f65d) {
            mo105a(mo110q());
            this.f65d = false;
        }
    }

    /* renamed from: q */
    public long mo110q() {
        long j;
        long j2 = this.f66e;
        if (!this.f65d) {
            return j2;
        }
        long b = this.f64a.mo18770b() - this.f67g;
        C0820n nVar = this.f68k;
        if (nVar.f4406a == 1.0f) {
            j = w67.m29391y0(b);
        } else {
            j = nVar.mo6837b(b);
        }
        return j2 + j;
    }
}
