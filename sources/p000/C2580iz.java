package p000;

import androidx.media3.common.C0792h;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;

/* renamed from: iz */
/* compiled from: BaseRenderer */
public abstract class C2580iz implements md5, od5 {

    /* renamed from: A */
    public long f13456A;

    /* renamed from: B */
    public long f13457B = Long.MIN_VALUE;

    /* renamed from: C */
    public boolean f13458C;

    /* renamed from: H */
    public boolean f13459H;

    /* renamed from: a */
    public final int f13460a;

    /* renamed from: d */
    public final c82 f13461d = new c82();

    /* renamed from: e */
    public pd5 f13462e;

    /* renamed from: g */
    public int f13463g;

    /* renamed from: k */
    public br4 f13464k;

    /* renamed from: r */
    public int f13465r;

    /* renamed from: s */
    public yk5 f13466s;

    /* renamed from: x */
    public C0792h[] f13467x;

    /* renamed from: y */
    public long f13468y;

    public C2580iz(int i) {
        this.f13460a = i;
    }

    /* renamed from: A */
    public final pd5 mo21674A() {
        return (pd5) C2725kr.m20985e(this.f13462e);
    }

    /* renamed from: B */
    public final c82 mo21675B() {
        this.f13461d.mo12018a();
        return this.f13461d;
    }

    /* renamed from: C */
    public final int mo21676C() {
        return this.f13463g;
    }

    /* renamed from: D */
    public final br4 mo21677D() {
        return (br4) C2725kr.m20985e(this.f13464k);
    }

    /* renamed from: E */
    public final C0792h[] mo21678E() {
        return (C0792h[]) C2725kr.m20985e(this.f13467x);
    }

    /* renamed from: F */
    public final boolean mo21679F() {
        if (mo21687i()) {
            return this.f13458C;
        }
        return ((yk5) C2725kr.m20985e(this.f13466s)).mo7595g();
    }

    /* renamed from: G */
    public abstract void mo7133G();

    /* renamed from: H */
    public void mo7134H(boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* renamed from: I */
    public abstract void mo7135I(long j, boolean z) throws ExoPlaybackException;

    /* renamed from: J */
    public void mo7137J() {
    }

    /* renamed from: K */
    public void mo7139K() throws ExoPlaybackException {
    }

    /* renamed from: L */
    public void mo7141L() {
    }

    /* renamed from: M */
    public abstract void mo7425M(C0792h[] hVarArr, long j, long j2) throws ExoPlaybackException;

    /* renamed from: N */
    public final int mo21680N(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
        int p = ((yk5) C2725kr.m20985e(this.f13466s)).mo7596p(c82, decoderInputBuffer, i);
        if (p == -4) {
            if (decoderInputBuffer.mo23893p()) {
                this.f13457B = Long.MIN_VALUE;
                if (this.f13458C) {
                    return -4;
                }
                return -3;
            }
            long j = decoderInputBuffer.f4594k + this.f13468y;
            decoderInputBuffer.f4594k = j;
            this.f13457B = Math.max(this.f13457B, j);
        } else if (p == -5) {
            C0792h hVar = (C0792h) C2725kr.m20985e(c82.f8368b);
            if (hVar.f4179M != Long.MAX_VALUE) {
                c82.f8368b = hVar.mo6636b().mo6674i0(hVar.f4179M + this.f13468y).mo6644E();
            }
        }
        return p;
    }

    /* renamed from: O */
    public final void mo21681O(long j, boolean z) throws ExoPlaybackException {
        this.f13458C = false;
        this.f13456A = j;
        this.f13457B = j;
        mo7135I(j, z);
    }

    /* renamed from: P */
    public int mo21682P(long j) {
        return ((yk5) C2725kr.m20985e(this.f13466s)).mo7594f(j - this.f13468y);
    }

    /* renamed from: c */
    public final void mo21683c() {
        boolean z = true;
        if (this.f13465r != 1) {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f13461d.mo12018a();
        this.f13465r = 0;
        this.f13466s = null;
        this.f13467x = null;
        this.f13458C = false;
        mo7133G();
    }

    /* renamed from: f */
    public final int mo21684f() {
        return this.f13460a;
    }

    public final int getState() {
        return this.f13465r;
    }

    /* renamed from: h */
    public final yk5 mo21686h() {
        return this.f13466s;
    }

    /* renamed from: i */
    public final boolean mo21687i() {
        if (this.f13457B == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo21688j() {
        this.f13458C = true;
    }

    /* renamed from: k */
    public void mo7154k(int i, Object obj) throws ExoPlaybackException {
    }

    /* renamed from: l */
    public final void mo21689l(pd5 pd5, C0792h[] hVarArr, yk5 yk5, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        boolean z3;
        boolean z4 = z;
        if (this.f13465r == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C2725kr.m20987g(z3);
        this.f13462e = pd5;
        this.f13465r = 1;
        mo7134H(z, z2);
        mo21692o(hVarArr, yk5, j2, j3);
        long j4 = j;
        mo21681O(j, z);
    }

    /* renamed from: m */
    public final void mo21690m() throws IOException {
        ((yk5) C2725kr.m20985e(this.f13466s)).mo7593b();
    }

    /* renamed from: n */
    public final boolean mo21691n() {
        return this.f13458C;
    }

    /* renamed from: o */
    public final void mo21692o(C0792h[] hVarArr, yk5 yk5, long j, long j2) throws ExoPlaybackException {
        C2725kr.m20987g(!this.f13458C);
        this.f13466s = yk5;
        if (this.f13457B == Long.MIN_VALUE) {
            this.f13457B = j;
        }
        this.f13467x = hVarArr;
        this.f13468y = j2;
        mo7425M(hVarArr, j, j2);
    }

    /* renamed from: p */
    public final od5 mo21693p() {
        return this;
    }

    /* renamed from: r */
    public /* synthetic */ void mo7465r(float f, float f2) {
        ld5.m21403a(this, f, f2);
    }

    public final void reset() {
        boolean z;
        if (this.f13465r == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f13461d.mo12018a();
        mo7137J();
    }

    /* renamed from: s */
    public final void mo21695s(int i, br4 br4) {
        this.f13463g = i;
        this.f13464k = br4;
    }

    public final void start() throws ExoPlaybackException {
        boolean z = true;
        if (this.f13465r != 1) {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f13465r = 2;
        mo7139K();
    }

    public final void stop() {
        boolean z;
        if (this.f13465r == 2) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f13465r = 1;
        mo7141L();
    }

    /* renamed from: t */
    public int mo7467t() throws ExoPlaybackException {
        return 0;
    }

    /* renamed from: v */
    public final long mo21698v() {
        return this.f13457B;
    }

    /* renamed from: w */
    public final void mo21699w(long j) throws ExoPlaybackException {
        mo21681O(j, false);
    }

    /* renamed from: x */
    public sq3 mo7162x() {
        return null;
    }

    /* renamed from: y */
    public final ExoPlaybackException mo21700y(Throwable th, C0792h hVar, int i) {
        return mo21701z(th, hVar, false, i);
    }

    /* renamed from: z */
    public final ExoPlaybackException mo21701z(Throwable th, C0792h hVar, boolean z, int i) {
        int i2;
        if (hVar != null && !this.f13459H) {
            this.f13459H = true;
            try {
                i2 = nd5.m23118f(mo7438a(hVar));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f13459H = false;
            }
            return ExoPlaybackException.createForRenderer(th, getName(), mo21676C(), hVar, i2, z, i);
        }
        i2 = 4;
        return ExoPlaybackException.createForRenderer(th, getName(), mo21676C(), hVar, i2, z, i);
    }
}
