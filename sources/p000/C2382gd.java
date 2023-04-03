package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C2740l5;
import p000.iy6;
import p000.zs6;

/* renamed from: gd */
/* compiled from: AdtsReader */
public final class C2382gd implements yn1 {

    /* renamed from: v */
    public static final byte[] f12280v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f12281a;

    /* renamed from: b */
    public final fm4 f12282b;

    /* renamed from: c */
    public final gm4 f12283c;

    /* renamed from: d */
    public final String f12284d;

    /* renamed from: e */
    public String f12285e;

    /* renamed from: f */
    public zs6 f12286f;

    /* renamed from: g */
    public zs6 f12287g;

    /* renamed from: h */
    public int f12288h;

    /* renamed from: i */
    public int f12289i;

    /* renamed from: j */
    public int f12290j;

    /* renamed from: k */
    public boolean f12291k;

    /* renamed from: l */
    public boolean f12292l;

    /* renamed from: m */
    public int f12293m;

    /* renamed from: n */
    public int f12294n;

    /* renamed from: o */
    public int f12295o;

    /* renamed from: p */
    public boolean f12296p;

    /* renamed from: q */
    public long f12297q;

    /* renamed from: r */
    public int f12298r;

    /* renamed from: s */
    public long f12299s;

    /* renamed from: t */
    public zs6 f12300t;

    /* renamed from: u */
    public long f12301u;

    public C2382gd(boolean z) {
        this(z, (String) null);
    }

    /* renamed from: m */
    public static boolean m17987m(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) throws ParserException {
        int i;
        mo20522b();
        while (gm4.mo20676a() > 0) {
            int i2 = this.f12288h;
            if (i2 == 0) {
                mo20526j(gm4);
            } else if (i2 == 1) {
                mo20523g(gm4);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (this.f12291k) {
                        i = 7;
                    } else {
                        i = 5;
                    }
                    if (mo20525i(gm4, this.f12282b.f11939a, i)) {
                        mo20529n();
                    }
                } else if (i2 == 4) {
                    mo20531p(gm4);
                } else {
                    throw new IllegalStateException();
                }
            } else if (mo20525i(gm4, this.f12283c.mo20679d(), 10)) {
                mo20530o();
            }
        }
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    /* renamed from: b */
    public final void mo20522b() {
        C2725kr.m20985e(this.f12286f);
        w67.m29360j(this.f12300t);
        w67.m29360j(this.f12287g);
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f12299s = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        mo20532q();
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f12285e = dVar.mo21671b();
        zs6 f = jy1.mo7713f(dVar.mo21672c(), 1);
        this.f12286f = f;
        this.f12300t = f;
        if (this.f12281a) {
            dVar.mo21670a();
            zs6 f2 = jy1.mo7713f(dVar.mo21672c(), 5);
            this.f12287g = f2;
            f2.mo7303d(new C0792h.C0794b().mo6658S(dVar.mo21671b()).mo6670e0("application/id3").mo6644E());
            return;
        }
        this.f12287g = new cl1();
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f12299s = j;
        }
    }

    /* renamed from: g */
    public final void mo20523g(gm4 gm4) {
        if (gm4.mo20676a() != 0) {
            this.f12282b.f11939a[0] = gm4.mo20679d()[gm4.mo20680e()];
            this.f12282b.mo20012p(2);
            int h = this.f12282b.mo20004h(4);
            int i = this.f12294n;
            if (i == -1 || h == i) {
                if (!this.f12292l) {
                    this.f12292l = true;
                    this.f12293m = this.f12295o;
                    this.f12294n = h;
                }
                mo20535t();
                return;
            }
            mo20532q();
        }
    }

    /* renamed from: h */
    public final boolean mo20524h(gm4 gm4, int i) {
        gm4.mo20674P(i + 1);
        if (!mo20538w(gm4, this.f12282b.f11939a, 1)) {
            return false;
        }
        this.f12282b.mo20012p(4);
        int h = this.f12282b.mo20004h(1);
        int i2 = this.f12293m;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.f12294n != -1) {
            if (!mo20538w(gm4, this.f12282b.f11939a, 1)) {
                return true;
            }
            this.f12282b.mo20012p(2);
            if (this.f12282b.mo20004h(4) != this.f12294n) {
                return false;
            }
            gm4.mo20674P(i + 2);
        }
        if (!mo20538w(gm4, this.f12282b.f11939a, 4)) {
            return true;
        }
        this.f12282b.mo20012p(14);
        int h2 = this.f12282b.mo20004h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] d = gm4.mo20679d();
        int f = gm4.mo20681f();
        int i3 = i + h2;
        if (i3 >= f) {
            return true;
        }
        byte b = d[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == f) {
                return true;
            }
            if (!mo20528l((byte) -1, d[i4]) || ((d[i4] & 8) >> 3) != h) {
                return false;
            }
            return true;
        } else if (b != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == f) {
                return true;
            }
            if (d[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            if (i6 == f || d[i6] == 51) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: i */
    public final boolean mo20525i(gm4 gm4, byte[] bArr, int i) {
        int min = Math.min(gm4.mo20676a(), i - this.f12289i);
        gm4.mo20685j(bArr, this.f12289i, min);
        int i2 = this.f12289i + min;
        this.f12289i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo20526j(gm4 gm4) {
        byte[] d = gm4.mo20679d();
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        while (e < f) {
            int i = e + 1;
            byte b = d[e] & 255;
            if (this.f12290j != 512 || !mo20528l((byte) -1, (byte) b) || (!this.f12292l && !mo20524h(gm4, i - 2))) {
                int i2 = this.f12290j;
                byte b2 = b | i2;
                if (b2 == 329) {
                    this.f12290j = 768;
                } else if (b2 == 511) {
                    this.f12290j = RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
                } else if (b2 == 836) {
                    this.f12290j = RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
                } else if (b2 == 1075) {
                    mo20536u();
                    gm4.mo20674P(i);
                    return;
                } else if (i2 != 256) {
                    this.f12290j = 256;
                    i--;
                }
                e = i;
            } else {
                this.f12295o = (b & 8) >> 3;
                boolean z = true;
                if ((b & 1) != 0) {
                    z = false;
                }
                this.f12291k = z;
                if (!this.f12292l) {
                    mo20533r();
                } else {
                    mo20535t();
                }
                gm4.mo20674P(i);
                return;
            }
        }
        gm4.mo20674P(e);
    }

    /* renamed from: k */
    public long mo20527k() {
        return this.f12297q;
    }

    /* renamed from: l */
    public final boolean mo20528l(byte b, byte b2) {
        return m17987m(((b & 255) << 8) | (b2 & 255));
    }

    @RequiresNonNull({"output"})
    /* renamed from: n */
    public final void mo20529n() throws ParserException {
        this.f12282b.mo20012p(0);
        if (!this.f12296p) {
            int h = this.f12282b.mo20004h(2) + 1;
            if (h != 2) {
                gk3.m18132i("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
                h = 2;
            }
            this.f12282b.mo20014r(5);
            byte[] a = C2740l5.m21227a(h, this.f12294n, this.f12282b.mo20004h(3));
            C2740l5.C2742b e = C2740l5.m21231e(a);
            C0792h E = new C0792h.C0794b().mo6658S(this.f12285e).mo6670e0("audio/mp4a-latm").mo6648I(e.f14416c).mo6647H(e.f14415b).mo6671f0(e.f14414a).mo6659T(Collections.singletonList(a)).mo6661V(this.f12284d).mo6644E();
            this.f12297q = 1024000000 / ((long) E.f4187b1);
            this.f12286f.mo7303d(E);
            this.f12296p = true;
        } else {
            this.f12282b.mo20014r(10);
        }
        this.f12282b.mo20014r(4);
        int h2 = (this.f12282b.mo20004h(13) - 2) - 5;
        if (this.f12291k) {
            h2 -= 2;
        }
        mo20537v(this.f12286f, this.f12297q, 0, h2);
    }

    @RequiresNonNull({"id3Output"})
    /* renamed from: o */
    public final void mo20530o() {
        this.f12287g.mo7300a(this.f12283c, 10);
        this.f12283c.mo20674P(6);
        mo20537v(this.f12287g, 0, 10, this.f12283c.mo20661C() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    /* renamed from: p */
    public final void mo20531p(gm4 gm4) {
        int min = Math.min(gm4.mo20676a(), this.f12298r - this.f12289i);
        this.f12300t.mo7300a(gm4, min);
        int i = this.f12289i + min;
        this.f12289i = i;
        int i2 = this.f12298r;
        if (i == i2) {
            long j = this.f12299s;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                this.f12300t.mo7301b(j, 1, i2, 0, (zs6.C3758a) null);
                this.f12299s += this.f12301u;
            }
            mo20534s();
        }
    }

    /* renamed from: q */
    public final void mo20532q() {
        this.f12292l = false;
        mo20534s();
    }

    /* renamed from: r */
    public final void mo20533r() {
        this.f12288h = 1;
        this.f12289i = 0;
    }

    /* renamed from: s */
    public final void mo20534s() {
        this.f12288h = 0;
        this.f12289i = 0;
        this.f12290j = 256;
    }

    /* renamed from: t */
    public final void mo20535t() {
        this.f12288h = 3;
        this.f12289i = 0;
    }

    /* renamed from: u */
    public final void mo20536u() {
        this.f12288h = 2;
        this.f12289i = f12280v.length;
        this.f12298r = 0;
        this.f12283c.mo20674P(0);
    }

    /* renamed from: v */
    public final void mo20537v(zs6 zs6, long j, int i, int i2) {
        this.f12288h = 4;
        this.f12289i = i;
        this.f12300t = zs6;
        this.f12301u = j;
        this.f12298r = i2;
    }

    /* renamed from: w */
    public final boolean mo20538w(gm4 gm4, byte[] bArr, int i) {
        if (gm4.mo20676a() < i) {
            return false;
        }
        gm4.mo20685j(bArr, 0, i);
        return true;
    }

    public C2382gd(boolean z, String str) {
        this.f12282b = new fm4(new byte[7]);
        this.f12283c = new gm4(Arrays.copyOf(f12280v, 10));
        mo20534s();
        this.f12293m = -1;
        this.f12294n = -1;
        this.f12297q = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f12299s = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f12281a = z;
        this.f12284d = str;
    }
}
