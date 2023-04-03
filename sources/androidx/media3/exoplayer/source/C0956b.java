package androidx.media3.exoplayer.source;

import androidx.media3.common.C0792h;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.source.b */
/* compiled from: ClippingMediaPeriod */
public final class C0956b implements C0971h, C0971h.C0972a {

    /* renamed from: a */
    public final C0971h f5195a;

    /* renamed from: d */
    public C0971h.C0972a f5196d;

    /* renamed from: e */
    public C0957a[] f5197e = new C0957a[0];

    /* renamed from: g */
    public long f5198g;

    /* renamed from: k */
    public long f5199k;

    /* renamed from: r */
    public long f5200r;

    /* renamed from: s */
    public ClippingMediaSource.IllegalClippingException f5201s;

    /* renamed from: androidx.media3.exoplayer.source.b$a */
    /* compiled from: ClippingMediaPeriod */
    public final class C0957a implements yk5 {

        /* renamed from: a */
        public final yk5 f5202a;

        /* renamed from: d */
        public boolean f5203d;

        public C0957a(yk5 yk5) {
            this.f5202a = yk5;
        }

        /* renamed from: a */
        public void mo7592a() {
            this.f5203d = false;
        }

        /* renamed from: b */
        public void mo7593b() throws IOException {
            this.f5202a.mo7593b();
        }

        /* renamed from: f */
        public int mo7594f(long j) {
            if (C0956b.this.mo7588k()) {
                return -3;
            }
            return this.f5202a.mo7594f(j);
        }

        /* renamed from: g */
        public boolean mo7595g() {
            if (C0956b.this.mo7588k() || !this.f5202a.mo7595g()) {
                return false;
            }
            return true;
        }

        /* renamed from: p */
        public int mo7596p(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
            if (C0956b.this.mo7588k()) {
                return -3;
            }
            if (this.f5203d) {
                decoderInputBuffer.mo23896u(4);
                return -4;
            }
            int p = this.f5202a.mo7596p(c82, decoderInputBuffer, i);
            if (p == -5) {
                C0792h hVar = (C0792h) C2725kr.m20985e(c82.f8368b);
                int i2 = hVar.f4195o1;
                if (!(i2 == 0 && hVar.f4196p1 == 0)) {
                    C0956b bVar = C0956b.this;
                    int i3 = 0;
                    if (bVar.f5199k != 0) {
                        i2 = 0;
                    }
                    if (bVar.f5200r == Long.MIN_VALUE) {
                        i3 = hVar.f4196p1;
                    }
                    c82.f8368b = hVar.mo6636b().mo6653N(i2).mo6654O(i3).mo6644E();
                }
                return -5;
            }
            C0956b bVar2 = C0956b.this;
            long j = bVar2.f5200r;
            if (j == Long.MIN_VALUE || ((p != -4 || decoderInputBuffer.f4594k < j) && (p != -3 || bVar2.mo7247h() != Long.MIN_VALUE || decoderInputBuffer.f4593g))) {
                return p;
            }
            decoderInputBuffer.mo6968h();
            decoderInputBuffer.mo23896u(4);
            this.f5203d = true;
            return -4;
        }
    }

    public C0956b(C0971h hVar, boolean z, long j, long j2) {
        long j3;
        this.f5195a = hVar;
        if (z) {
            j3 = j;
        } else {
            j3 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        this.f5198g = j3;
        this.f5199k = j;
        this.f5200r = j2;
    }

    /* renamed from: s */
    public static boolean m7022s(long j, dx1[] dx1Arr) {
        if (j != 0) {
            for (dx1 dx1 : dx1Arr) {
                if (dx1 != null) {
                    C0792h r = dx1.mo7682r();
                    if (!vv3.m29127a(r.f4175C, r.f4204y)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public long mo7241a() {
        long a = this.f5195a.mo7241a();
        if (a != Long.MIN_VALUE) {
            long j = this.f5200r;
            if (j == Long.MIN_VALUE || a < j) {
                return a;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final ys5 mo7586b(long j, ys5 ys5) {
        long j2;
        long r = w67.m29376r(ys5.f20336a, 0, j - this.f5199k);
        long j3 = ys5.f20337b;
        long j4 = this.f5200r;
        if (j4 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j4 - j;
        }
        long r2 = w67.m29376r(j3, 0, j2);
        if (r == ys5.f20336a && r2 == ys5.f20337b) {
            return ys5;
        }
        return new ys5(r, r2);
    }

    /* renamed from: c */
    public long mo7243c(long j, ys5 ys5) {
        long j2 = this.f5199k;
        if (j == j2) {
            return j2;
        }
        return this.f5195a.mo7243c(j, mo7586b(j, ys5));
    }

    /* renamed from: d */
    public boolean mo7244d() {
        return this.f5195a.mo7244d();
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        return this.f5195a.mo7245e(j);
    }

    /* renamed from: f */
    public void mo7587f(C0971h hVar) {
        if (this.f5201s == null) {
            ((C0971h.C0972a) C2725kr.m20985e(this.f5196d)).mo7587f(this);
        }
    }

    /* renamed from: h */
    public long mo7247h() {
        long h = this.f5195a.mo7247h();
        if (h != Long.MIN_VALUE) {
            long j = this.f5200r;
            if (j == Long.MIN_VALUE || h < j) {
                return h;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: i */
    public void mo7248i(long j) {
        this.f5195a.mo7248i(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2 > r4) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo7249j(p000.dx1[] r13, boolean[] r14, p000.yk5[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            androidx.media3.exoplayer.source.b$a[] r2 = new androidx.media3.exoplayer.source.C0956b.C0957a[r2]
            r0.f5197e = r2
            int r2 = r1.length
            yk5[] r9 = new p000.yk5[r2]
            r10 = 0
            r2 = r10
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0021
            androidx.media3.exoplayer.source.b$a[] r3 = r0.f5197e
            r4 = r1[r2]
            androidx.media3.exoplayer.source.b$a r4 = (androidx.media3.exoplayer.source.C0956b.C0957a) r4
            r3[r2] = r4
            if (r4 == 0) goto L_0x001c
            yk5 r11 = r4.f5202a
        L_0x001c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0021:
            androidx.media3.exoplayer.source.h r2 = r0.f5195a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo7249j(r3, r4, r5, r6, r7)
            boolean r4 = r12.mo7588k()
            if (r4 == 0) goto L_0x0043
            long r4 = r0.f5199k
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            r6 = r13
            boolean r4 = m7022s(r4, r13)
            if (r4 == 0) goto L_0x0043
            r4 = r2
            goto L_0x0048
        L_0x0043:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0048:
            r0.f5198g = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0063
            long r4 = r0.f5199k
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0061
            long r4 = r0.f5200r
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r4 = r10
            goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            p000.C2725kr.m20987g(r4)
        L_0x0067:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x008d
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0073
            androidx.media3.exoplayer.source.b$a[] r4 = r0.f5197e
            r4[r10] = r11
            goto L_0x0084
        L_0x0073:
            androidx.media3.exoplayer.source.b$a[] r5 = r0.f5197e
            r6 = r5[r10]
            if (r6 == 0) goto L_0x007d
            yk5 r6 = r6.f5202a
            if (r6 == r4) goto L_0x0084
        L_0x007d:
            androidx.media3.exoplayer.source.b$a r6 = new androidx.media3.exoplayer.source.b$a
            r6.<init>(r4)
            r5[r10] = r6
        L_0x0084:
            androidx.media3.exoplayer.source.b$a[] r4 = r0.f5197e
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x0067
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0956b.mo7249j(dx1[], boolean[], yk5[], boolean[], long):long");
    }

    /* renamed from: k */
    public boolean mo7588k() {
        if (this.f5198g != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r6) goto L_0x0035;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo7250l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f5198g = r0
            androidx.media3.exoplayer.source.b$a[] r0 = r5.f5197e
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo7592a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            androidx.media3.exoplayer.source.h r0 = r5.f5195a
            long r0 = r0.mo7250l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            long r6 = r5.f5199k
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            long r6 = r5.f5200r
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            p000.C2725kr.m20987g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0956b.mo7250l(long):long");
    }

    /* renamed from: m */
    public long mo7251m() {
        boolean z;
        if (mo7588k()) {
            long j = this.f5198g;
            this.f5198g = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            long m = mo7251m();
            if (m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return m;
            }
            return j;
        }
        long m2 = this.f5195a.mo7251m();
        if (m2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        boolean z2 = true;
        if (m2 >= this.f5199k) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        long j2 = this.f5200r;
        if (j2 != Long.MIN_VALUE && m2 > j2) {
            z2 = false;
        }
        C2725kr.m20987g(z2);
        return m2;
    }

    /* renamed from: n */
    public void mo7246g(C0971h hVar) {
        ((C0971h.C0972a) C2725kr.m20985e(this.f5196d)).mo7246g(this);
    }

    /* renamed from: o */
    public void mo7252o() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f5201s;
        if (illegalClippingException == null) {
            this.f5195a.mo7252o();
            return;
        }
        throw illegalClippingException;
    }

    /* renamed from: p */
    public void mo7590p(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f5201s = illegalClippingException;
    }

    /* renamed from: q */
    public void mo7254q(C0971h.C0972a aVar, long j) {
        this.f5196d = aVar;
        this.f5195a.mo7254q(this, j);
    }

    /* renamed from: r */
    public ws6 mo7255r() {
        return this.f5195a.mo7255r();
    }

    /* renamed from: t */
    public void mo7256t(long j, boolean z) {
        this.f5195a.mo7256t(j, z);
    }

    /* renamed from: u */
    public void mo7591u(long j, long j2) {
        this.f5199k = j;
        this.f5200r = j2;
    }
}
