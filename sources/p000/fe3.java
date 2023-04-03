package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C2740l5;
import p000.iy6;
import p000.zs6;

/* renamed from: fe3 */
/* compiled from: LatmReader */
public final class fe3 implements yn1 {

    /* renamed from: a */
    public final String f11790a;

    /* renamed from: b */
    public final gm4 f11791b;

    /* renamed from: c */
    public final fm4 f11792c;

    /* renamed from: d */
    public zs6 f11793d;

    /* renamed from: e */
    public String f11794e;

    /* renamed from: f */
    public C0792h f11795f;

    /* renamed from: g */
    public int f11796g;

    /* renamed from: h */
    public int f11797h;

    /* renamed from: i */
    public int f11798i;

    /* renamed from: j */
    public int f11799j;

    /* renamed from: k */
    public long f11800k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: l */
    public boolean f11801l;

    /* renamed from: m */
    public int f11802m;

    /* renamed from: n */
    public int f11803n;

    /* renamed from: o */
    public int f11804o;

    /* renamed from: p */
    public boolean f11805p;

    /* renamed from: q */
    public long f11806q;

    /* renamed from: r */
    public int f11807r;

    /* renamed from: s */
    public long f11808s;

    /* renamed from: t */
    public int f11809t;

    /* renamed from: u */
    public String f11810u;

    public fe3(String str) {
        this.f11790a = str;
        gm4 gm4 = new gm4((int) RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
        this.f11791b = gm4;
        this.f11792c = new fm4(gm4.mo20679d());
    }

    /* renamed from: b */
    public static long m16954b(fm4 fm4) {
        return (long) fm4.mo20004h((fm4.mo20004h(2) + 1) * 8);
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) throws ParserException {
        C2725kr.m20989i(this.f11793d);
        while (gm4.mo20676a() > 0) {
            int i = this.f11796g;
            if (i != 0) {
                if (i == 1) {
                    int D = gm4.mo20662D();
                    if ((D & 224) == 224) {
                        this.f11799j = D;
                        this.f11796g = 2;
                    } else if (D != 86) {
                        this.f11796g = 0;
                    }
                } else if (i == 2) {
                    int D2 = ((this.f11799j & -225) << 8) | gm4.mo20662D();
                    this.f11798i = D2;
                    if (D2 > this.f11791b.mo20679d().length) {
                        mo19893m(this.f11798i);
                    }
                    this.f11797h = 0;
                    this.f11796g = 3;
                } else if (i == 3) {
                    int min = Math.min(gm4.mo20676a(), this.f11798i - this.f11797h);
                    gm4.mo20685j(this.f11792c.f11939a, this.f11797h, min);
                    int i2 = this.f11797h + min;
                    this.f11797h = i2;
                    if (i2 == this.f11798i) {
                        this.f11792c.mo20012p(0);
                        mo19887g(this.f11792c);
                        this.f11796g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (gm4.mo20662D() == 86) {
                this.f11796g = 1;
            }
        }
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f11796g = 0;
        this.f11800k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f11801l = false;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f11793d = jy1.mo7713f(dVar.mo21672c(), 1);
        this.f11794e = dVar.mo21671b();
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f11800k = j;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void mo19887g(fm4 fm4) throws ParserException {
        if (!fm4.mo20003g()) {
            this.f11801l = true;
            mo19892l(fm4);
        } else if (!this.f11801l) {
            return;
        }
        if (this.f11802m != 0) {
            throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
        } else if (this.f11803n == 0) {
            mo19891k(fm4, mo19890j(fm4));
            if (this.f11805p) {
                fm4.mo20014r((int) this.f11806q);
            }
        } else {
            throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
        }
    }

    /* renamed from: h */
    public final int mo19888h(fm4 fm4) throws ParserException {
        int b = fm4.mo19998b();
        C2740l5.C2742b d = C2740l5.m21230d(fm4, true);
        this.f11810u = d.f14416c;
        this.f11807r = d.f14414a;
        this.f11809t = d.f14415b;
        return b - fm4.mo19998b();
    }

    /* renamed from: i */
    public final void mo19889i(fm4 fm4) {
        int h = fm4.mo20004h(3);
        this.f11804o = h;
        if (h == 0) {
            fm4.mo20014r(8);
        } else if (h == 1) {
            fm4.mo20014r(9);
        } else if (h == 3 || h == 4 || h == 5) {
            fm4.mo20014r(6);
        } else if (h == 6 || h == 7) {
            fm4.mo20014r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    public final int mo19890j(fm4 fm4) throws ParserException {
        int h;
        if (this.f11804o == 0) {
            int i = 0;
            do {
                h = fm4.mo20004h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
    }

    @RequiresNonNull({"output"})
    /* renamed from: k */
    public final void mo19891k(fm4 fm4, int i) {
        int e = fm4.mo20001e();
        if ((e & 7) == 0) {
            this.f11791b.mo20674P(e >> 3);
        } else {
            fm4.mo20005i(this.f11791b.mo20679d(), 0, i * 8);
            this.f11791b.mo20674P(0);
        }
        this.f11793d.mo7300a(this.f11791b, i);
        long j = this.f11800k;
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f11793d.mo7301b(j, 1, i, 0, (zs6.C3758a) null);
            this.f11800k += this.f11808s;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: l */
    public final void mo19892l(fm4 fm4) throws ParserException {
        int i;
        boolean g;
        int h = fm4.mo20004h(1);
        if (h == 1) {
            i = fm4.mo20004h(1);
        } else {
            i = 0;
        }
        this.f11802m = i;
        if (i == 0) {
            if (h == 1) {
                m16954b(fm4);
            }
            if (fm4.mo20003g()) {
                this.f11803n = fm4.mo20004h(6);
                int h2 = fm4.mo20004h(4);
                int h3 = fm4.mo20004h(3);
                if (h2 == 0 && h3 == 0) {
                    if (h == 0) {
                        int e = fm4.mo20001e();
                        int h4 = mo19888h(fm4);
                        fm4.mo20012p(e);
                        byte[] bArr = new byte[((h4 + 7) / 8)];
                        fm4.mo20005i(bArr, 0, h4);
                        C0792h E = new C0792h.C0794b().mo6658S(this.f11794e).mo6670e0("audio/mp4a-latm").mo6648I(this.f11810u).mo6647H(this.f11809t).mo6671f0(this.f11807r).mo6659T(Collections.singletonList(bArr)).mo6661V(this.f11790a).mo6644E();
                        if (!E.equals(this.f11795f)) {
                            this.f11795f = E;
                            this.f11808s = 1024000000 / ((long) E.f4187b1);
                            this.f11793d.mo7303d(E);
                        }
                    } else {
                        fm4.mo20014r(((int) m16954b(fm4)) - mo19888h(fm4));
                    }
                    mo19889i(fm4);
                    boolean g2 = fm4.mo20003g();
                    this.f11805p = g2;
                    this.f11806q = 0;
                    if (g2) {
                        if (h == 1) {
                            this.f11806q = m16954b(fm4);
                        } else {
                            do {
                                g = fm4.mo20003g();
                                this.f11806q = (this.f11806q << 8) + ((long) fm4.mo20004h(8));
                            } while (g);
                        }
                    }
                    if (fm4.mo20003g()) {
                        fm4.mo20014r(8);
                        return;
                    }
                    return;
                }
                throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
            }
            throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
        }
        throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
    }

    /* renamed from: m */
    public final void mo19893m(int i) {
        this.f11791b.mo20670L(i);
        this.f11792c.mo20010n(this.f11791b.mo20679d());
    }
}
