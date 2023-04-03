package p000;

import androidx.media3.common.C0792h;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.iy6;
import p000.zs6;

/* renamed from: gk2 */
/* compiled from: H265Reader */
public final class gk2 implements yn1 {

    /* renamed from: a */
    public final gt5 f12376a;

    /* renamed from: b */
    public String f12377b;

    /* renamed from: c */
    public zs6 f12378c;

    /* renamed from: d */
    public C2389a f12379d;

    /* renamed from: e */
    public boolean f12380e;

    /* renamed from: f */
    public final boolean[] f12381f = new boolean[3];

    /* renamed from: g */
    public final p24 f12382g = new p24(32, 128);

    /* renamed from: h */
    public final p24 f12383h = new p24(33, 128);

    /* renamed from: i */
    public final p24 f12384i = new p24(34, 128);

    /* renamed from: j */
    public final p24 f12385j = new p24(39, 128);

    /* renamed from: k */
    public final p24 f12386k = new p24(40, 128);

    /* renamed from: l */
    public long f12387l;

    /* renamed from: m */
    public long f12388m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: n */
    public final gm4 f12389n = new gm4();

    /* renamed from: gk2$a */
    /* compiled from: H265Reader */
    public static final class C2389a {

        /* renamed from: a */
        public final zs6 f12390a;

        /* renamed from: b */
        public long f12391b;

        /* renamed from: c */
        public boolean f12392c;

        /* renamed from: d */
        public int f12393d;

        /* renamed from: e */
        public long f12394e;

        /* renamed from: f */
        public boolean f12395f;

        /* renamed from: g */
        public boolean f12396g;

        /* renamed from: h */
        public boolean f12397h;

        /* renamed from: i */
        public boolean f12398i;

        /* renamed from: j */
        public boolean f12399j;

        /* renamed from: k */
        public long f12400k;

        /* renamed from: l */
        public long f12401l;

        /* renamed from: m */
        public boolean f12402m;

        public C2389a(zs6 zs6) {
            this.f12390a = zs6;
        }

        /* renamed from: b */
        public static boolean m18117b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* renamed from: c */
        public static boolean m18118c(int i) {
            return i < 32 || i == 40;
        }

        /* renamed from: a */
        public void mo20620a(long j, int i, boolean z) {
            if (this.f12399j && this.f12396g) {
                this.f12402m = this.f12392c;
                this.f12399j = false;
            } else if (this.f12397h || this.f12396g) {
                if (z && this.f12398i) {
                    mo20621d(i + ((int) (j - this.f12391b)));
                }
                this.f12400k = this.f12391b;
                this.f12401l = this.f12394e;
                this.f12402m = this.f12392c;
                this.f12398i = true;
            }
        }

        /* renamed from: d */
        public final void mo20621d(int i) {
            long j = this.f12401l;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                boolean z = this.f12402m;
                this.f12390a.mo7301b(j, z ? 1 : 0, (int) (this.f12391b - this.f12400k), i, (zs6.C3758a) null);
            }
        }

        /* renamed from: e */
        public void mo20622e(byte[] bArr, int i, int i2) {
            boolean z;
            if (this.f12395f) {
                int i3 = this.f12393d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    if ((bArr[i4] & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f12396g = z;
                    this.f12395f = false;
                    return;
                }
                this.f12393d = i3 + (i2 - i);
            }
        }

        /* renamed from: f */
        public void mo20623f() {
            this.f12395f = false;
            this.f12396g = false;
            this.f12397h = false;
            this.f12398i = false;
            this.f12399j = false;
        }

        /* renamed from: g */
        public void mo20624g(long j, int i, int i2, long j2, boolean z) {
            boolean z2;
            boolean z3 = false;
            this.f12396g = false;
            this.f12397h = false;
            this.f12394e = j2;
            this.f12393d = 0;
            this.f12391b = j;
            if (!m18118c(i2)) {
                if (this.f12398i && !this.f12399j) {
                    if (z) {
                        mo20621d(i);
                    }
                    this.f12398i = false;
                }
                if (m18117b(i2)) {
                    this.f12397h = !this.f12399j;
                    this.f12399j = true;
                }
            }
            if (i2 < 16 || i2 > 21) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f12392c = z2;
            if (z2 || i2 <= 9) {
                z3 = true;
            }
            this.f12395f = z3;
        }
    }

    public gk2(gt5 gt5) {
        this.f12376a = gt5;
    }

    /* renamed from: i */
    public static C0792h m18105i(String str, p24 p24, p24 p242, p24 p243) {
        int i;
        int i2;
        int i3;
        p24 p244 = p24;
        p24 p245 = p242;
        p24 p246 = p243;
        int i4 = p244.f16265e;
        byte[] bArr = new byte[(p245.f16265e + i4 + p246.f16265e)];
        System.arraycopy(p244.f16264d, 0, bArr, 0, i4);
        System.arraycopy(p245.f16264d, 0, bArr, p244.f16265e, p245.f16265e);
        System.arraycopy(p246.f16264d, 0, bArr, p244.f16265e + p245.f16265e, p246.f16265e);
        hm4 hm4 = new hm4(p245.f16264d, 0, p245.f16265e);
        hm4.mo21299l(44);
        int e = hm4.mo21292e(3);
        hm4.mo21298k();
        int e2 = hm4.mo21292e(2);
        boolean d = hm4.mo21291d();
        int e3 = hm4.mo21292e(5);
        int i5 = 0;
        for (int i6 = 0; i6 < 32; i6++) {
            if (hm4.mo21291d()) {
                i5 |= 1 << i6;
            }
        }
        int[] iArr = new int[6];
        for (int i7 = 0; i7 < 6; i7++) {
            iArr[i7] = hm4.mo21292e(8);
        }
        int e4 = hm4.mo21292e(8);
        int i8 = 0;
        for (int i9 = 0; i9 < e; i9++) {
            if (hm4.mo21291d()) {
                i8 += 89;
            }
            if (hm4.mo21291d()) {
                i8 += 8;
            }
        }
        hm4.mo21299l(i8);
        if (e > 0) {
            hm4.mo21299l((8 - e) * 2);
        }
        hm4.mo21295h();
        int h = hm4.mo21295h();
        if (h == 3) {
            hm4.mo21298k();
        }
        int h2 = hm4.mo21295h();
        int h3 = hm4.mo21295h();
        if (hm4.mo21291d()) {
            int h4 = hm4.mo21295h();
            int h5 = hm4.mo21295h();
            int h6 = hm4.mo21295h();
            int h7 = hm4.mo21295h();
            if (h == 1 || h == 2) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            if (h == 1) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            h2 -= i2 * (h4 + h5);
            h3 -= i3 * (h6 + h7);
        }
        hm4.mo21295h();
        hm4.mo21295h();
        int h8 = hm4.mo21295h();
        if (hm4.mo21291d()) {
            i = 0;
        } else {
            i = e;
        }
        for (int i10 = i; i10 <= e; i10++) {
            hm4.mo21295h();
            hm4.mo21295h();
            hm4.mo21295h();
        }
        hm4.mo21295h();
        hm4.mo21295h();
        hm4.mo21295h();
        hm4.mo21295h();
        hm4.mo21295h();
        hm4.mo21295h();
        if (hm4.mo21291d() && hm4.mo21291d()) {
            m18106j(hm4);
        }
        hm4.mo21299l(2);
        if (hm4.mo21291d()) {
            hm4.mo21299l(8);
            hm4.mo21295h();
            hm4.mo21295h();
            hm4.mo21298k();
        }
        m18107k(hm4);
        if (hm4.mo21291d()) {
            for (int i11 = 0; i11 < hm4.mo21295h(); i11++) {
                hm4.mo21299l(h8 + 4 + 1);
            }
        }
        hm4.mo21299l(2);
        float f = 1.0f;
        if (hm4.mo21291d()) {
            if (hm4.mo21291d()) {
                int e5 = hm4.mo21292e(8);
                if (e5 == 255) {
                    int e6 = hm4.mo21292e(16);
                    int e7 = hm4.mo21292e(16);
                    if (!(e6 == 0 || e7 == 0)) {
                        f = ((float) e6) / ((float) e7);
                    }
                } else {
                    float[] fArr = q24.f16720b;
                    if (e5 < fArr.length) {
                        f = fArr[e5];
                    } else {
                        gk3.m18132i("H265Reader", "Unexpected aspect_ratio_idc value: " + e5);
                    }
                }
            }
            if (hm4.mo21291d()) {
                hm4.mo21298k();
            }
            if (hm4.mo21291d()) {
                hm4.mo21299l(4);
                if (hm4.mo21291d()) {
                    hm4.mo21299l(24);
                }
            }
            if (hm4.mo21291d()) {
                hm4.mo21295h();
                hm4.mo21295h();
            }
            hm4.mo21298k();
            if (hm4.mo21291d()) {
                h3 *= 2;
            }
        }
        return new C0792h.C0794b().mo6658S(str).mo6670e0("video/hevc").mo6648I(yh0.m30586c(e2, d, e3, i5, iArr, e4)).mo6675j0(h2).mo6656Q(h3).mo6666a0(f).mo6659T(Collections.singletonList(bArr)).mo6644E();
    }

    /* renamed from: j */
    public static void m18106j(hm4 hm4) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!hm4.mo21291d()) {
                    hm4.mo21295h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        hm4.mo21294g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        hm4.mo21294g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: k */
    public static void m18107k(hm4 hm4) {
        int h = hm4.mo21295h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = hm4.mo21291d();
            }
            if (z) {
                hm4.mo21298k();
                hm4.mo21295h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (hm4.mo21291d()) {
                        hm4.mo21298k();
                    }
                }
            } else {
                int h2 = hm4.mo21295h();
                int h3 = hm4.mo21295h();
                int i4 = h2 + h3;
                for (int i5 = 0; i5 < h2; i5++) {
                    hm4.mo21295h();
                    hm4.mo21298k();
                }
                for (int i6 = 0; i6 < h3; i6++) {
                    hm4.mo21295h();
                    hm4.mo21298k();
                }
                i = i4;
            }
        }
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        int i;
        mo20616b();
        while (gm4.mo20676a() > 0) {
            int e = gm4.mo20680e();
            int f = gm4.mo20681f();
            byte[] d = gm4.mo20679d();
            this.f12387l += (long) gm4.mo20676a();
            this.f12378c.mo7300a(gm4, gm4.mo20676a());
            while (true) {
                if (e < f) {
                    int c = q24.m25334c(d, e, f, this.f12381f);
                    if (c == f) {
                        mo20618h(d, e, f);
                        return;
                    }
                    int e2 = q24.m25336e(d, c);
                    int i2 = c - e;
                    if (i2 > 0) {
                        mo20618h(d, e, c);
                    }
                    int i3 = f - c;
                    long j = this.f12387l - ((long) i3);
                    if (i2 < 0) {
                        i = -i2;
                    } else {
                        i = 0;
                    }
                    long j2 = j;
                    int i4 = i3;
                    mo20617g(j2, i4, i, this.f12388m);
                    mo20619l(j2, i4, e2, this.f12388m);
                    e = c + 3;
                }
            }
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* renamed from: b */
    public final void mo20616b() {
        C2725kr.m20989i(this.f12378c);
        w67.m29360j(this.f12379d);
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f12387l = 0;
        this.f12388m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        q24.m25332a(this.f12381f);
        this.f12382g.mo24324d();
        this.f12383h.mo24324d();
        this.f12384i.mo24324d();
        this.f12385j.mo24324d();
        this.f12386k.mo24324d();
        C2389a aVar = this.f12379d;
        if (aVar != null) {
            aVar.mo20623f();
        }
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f12377b = dVar.mo21671b();
        zs6 f = jy1.mo7713f(dVar.mo21672c(), 2);
        this.f12378c = f;
        this.f12379d = new C2389a(f);
        this.f12376a.mo20844b(jy1, dVar);
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f12388m = j;
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* renamed from: g */
    public final void mo20617g(long j, int i, int i2, long j2) {
        this.f12379d.mo20620a(j, i, this.f12380e);
        if (!this.f12380e) {
            this.f12382g.mo24322b(i2);
            this.f12383h.mo24322b(i2);
            this.f12384i.mo24322b(i2);
            if (this.f12382g.mo24323c() && this.f12383h.mo24323c() && this.f12384i.mo24323c()) {
                this.f12378c.mo7303d(m18105i(this.f12377b, this.f12382g, this.f12383h, this.f12384i));
                this.f12380e = true;
            }
        }
        if (this.f12385j.mo24322b(i2)) {
            p24 p24 = this.f12385j;
            this.f12389n.mo20672N(this.f12385j.f16264d, q24.m25348q(p24.f16264d, p24.f16265e));
            this.f12389n.mo20675Q(5);
            this.f12376a.mo20843a(j2, this.f12389n);
        }
        if (this.f12386k.mo24322b(i2)) {
            p24 p242 = this.f12386k;
            this.f12389n.mo20672N(this.f12386k.f16264d, q24.m25348q(p242.f16264d, p242.f16265e));
            this.f12389n.mo20675Q(5);
            this.f12376a.mo20843a(j2, this.f12389n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: h */
    public final void mo20618h(byte[] bArr, int i, int i2) {
        this.f12379d.mo20622e(bArr, i, i2);
        if (!this.f12380e) {
            this.f12382g.mo24321a(bArr, i, i2);
            this.f12383h.mo24321a(bArr, i, i2);
            this.f12384i.mo24321a(bArr, i, i2);
        }
        this.f12385j.mo24321a(bArr, i, i2);
        this.f12386k.mo24321a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: l */
    public final void mo20619l(long j, int i, int i2, long j2) {
        this.f12379d.mo20624g(j, i, i2, j2, this.f12380e);
        if (!this.f12380e) {
            this.f12382g.mo24325e(i2);
            this.f12383h.mo24325e(i2);
            this.f12384i.mo24325e(i2);
        }
        this.f12385j.mo24325e(i2);
        this.f12386k.mo24325e(i2);
    }
}
