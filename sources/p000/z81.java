package p000;

import androidx.media3.common.C0820n;
import androidx.media3.exoplayer.ExoPlaybackException;

/* renamed from: z81 */
/* compiled from: DefaultMediaClock */
public final class z81 implements sq3 {

    /* renamed from: a */
    public final a86 f20493a;

    /* renamed from: d */
    public final C3720a f20494d;

    /* renamed from: e */
    public md5 f20495e;

    /* renamed from: g */
    public sq3 f20496g;

    /* renamed from: k */
    public boolean f20497k = true;

    /* renamed from: r */
    public boolean f20498r;

    /* renamed from: z81$a */
    /* compiled from: DefaultMediaClock */
    public interface C3720a {
        /* renamed from: k */
        void mo11249k(C0820n nVar);
    }

    public z81(C3720a aVar, dh0 dh0) {
        this.f20494d = aVar;
        this.f20493a = new a86(dh0);
    }

    /* renamed from: a */
    public void mo28373a(md5 md5) {
        if (md5 == this.f20495e) {
            this.f20496g = null;
            this.f20495e = null;
            this.f20497k = true;
        }
    }

    /* renamed from: b */
    public void mo106b(C0820n nVar) {
        sq3 sq3 = this.f20496g;
        if (sq3 != null) {
            sq3.mo106b(nVar);
            nVar = this.f20496g.mo108d();
        }
        this.f20493a.mo106b(nVar);
    }

    /* renamed from: c */
    public void mo28374c(md5 md5) throws ExoPlaybackException {
        sq3 sq3;
        sq3 x = md5.mo7162x();
        if (x != null && x != (sq3 = this.f20496g)) {
            if (sq3 == null) {
                this.f20496g = x;
                this.f20495e = md5;
                x.mo106b(this.f20493a.mo108d());
                return;
            }
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: d */
    public C0820n mo108d() {
        sq3 sq3 = this.f20496g;
        if (sq3 != null) {
            return sq3.mo108d();
        }
        return this.f20493a.mo108d();
    }

    /* renamed from: e */
    public void mo28375e(long j) {
        this.f20493a.mo105a(j);
    }

    /* renamed from: f */
    public final boolean mo28376f(boolean z) {
        md5 md5 = this.f20495e;
        if (md5 == null || md5.mo7149e() || (!this.f20495e.mo7150g() && (z || this.f20495e.mo21687i()))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo28377g() {
        this.f20498r = true;
        this.f20493a.mo107c();
    }

    /* renamed from: h */
    public void mo28378h() {
        this.f20498r = false;
        this.f20493a.mo109e();
    }

    /* renamed from: i */
    public long mo28379i(boolean z) {
        mo28380j(z);
        return mo110q();
    }

    /* renamed from: j */
    public final void mo28380j(boolean z) {
        if (mo28376f(z)) {
            this.f20497k = true;
            if (this.f20498r) {
                this.f20493a.mo107c();
                return;
            }
            return;
        }
        sq3 sq3 = (sq3) C2725kr.m20985e(this.f20496g);
        long q = sq3.mo110q();
        if (this.f20497k) {
            if (q < this.f20493a.mo110q()) {
                this.f20493a.mo109e();
                return;
            }
            this.f20497k = false;
            if (this.f20498r) {
                this.f20493a.mo107c();
            }
        }
        this.f20493a.mo105a(q);
        C0820n d = sq3.mo108d();
        if (!d.equals(this.f20493a.mo108d())) {
            this.f20493a.mo106b(d);
            this.f20494d.mo11249k(d);
        }
    }

    /* renamed from: q */
    public long mo110q() {
        if (this.f20497k) {
            return this.f20493a.mo110q();
        }
        return ((sq3) C2725kr.m20985e(this.f20496g)).mo110q();
    }
}
