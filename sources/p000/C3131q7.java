package p000;

import androidx.media3.common.C0792h;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C3182r7;
import p000.iy6;
import p000.zs6;

/* renamed from: q7 */
/* compiled from: Ac3Reader */
public final class C3131q7 implements yn1 {

    /* renamed from: a */
    public final fm4 f16821a;

    /* renamed from: b */
    public final gm4 f16822b;

    /* renamed from: c */
    public final String f16823c;

    /* renamed from: d */
    public String f16824d;

    /* renamed from: e */
    public zs6 f16825e;

    /* renamed from: f */
    public int f16826f;

    /* renamed from: g */
    public int f16827g;

    /* renamed from: h */
    public boolean f16828h;

    /* renamed from: i */
    public long f16829i;

    /* renamed from: j */
    public C0792h f16830j;

    /* renamed from: k */
    public int f16831k;

    /* renamed from: l */
    public long f16832l;

    public C3131q7() {
        this((String) null);
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        C2725kr.m20989i(this.f16825e);
        while (gm4.mo20676a() > 0) {
            int i = this.f16826f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(gm4.mo20676a(), this.f16831k - this.f16827g);
                        this.f16825e.mo7300a(gm4, min);
                        int i2 = this.f16827g + min;
                        this.f16827g = i2;
                        int i3 = this.f16831k;
                        if (i2 == i3) {
                            long j = this.f16832l;
                            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                                this.f16825e.mo7301b(j, 1, i3, 0, (zs6.C3758a) null);
                                this.f16832l += this.f16829i;
                            }
                            this.f16826f = 0;
                        }
                    }
                } else if (mo24953b(gm4, this.f16822b.mo20679d(), 128)) {
                    mo24954g();
                    this.f16822b.mo20674P(0);
                    this.f16825e.mo7300a(this.f16822b, 128);
                    this.f16826f = 2;
                }
            } else if (mo24955h(gm4)) {
                this.f16826f = 1;
                this.f16822b.mo20679d()[0] = 11;
                this.f16822b.mo20679d()[1] = 119;
                this.f16827g = 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo24953b(gm4 gm4, byte[] bArr, int i) {
        int min = Math.min(gm4.mo20676a(), i - this.f16827g);
        gm4.mo20685j(bArr, this.f16827g, min);
        int i2 = this.f16827g + min;
        this.f16827g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f16826f = 0;
        this.f16827g = 0;
        this.f16828h = false;
        this.f16832l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f16824d = dVar.mo21671b();
        this.f16825e = jy1.mo7713f(dVar.mo21672c(), 1);
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f16832l = j;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void mo24954g() {
        this.f16821a.mo20012p(0);
        C3182r7.C3184b e = C3182r7.m26083e(this.f16821a);
        C0792h hVar = this.f16830j;
        if (hVar == null || e.f17146d != hVar.f4202v0 || e.f17145c != hVar.f4187b1 || !w67.m29346c(e.f17143a, hVar.f4175C)) {
            C0792h E = new C0792h.C0794b().mo6658S(this.f16824d).mo6670e0(e.f17143a).mo6647H(e.f17146d).mo6671f0(e.f17145c).mo6661V(this.f16823c).mo6644E();
            this.f16830j = E;
            this.f16825e.mo7303d(E);
        }
        this.f16831k = e.f17147e;
        this.f16829i = (((long) e.f17148f) * 1000000) / ((long) this.f16830j.f4187b1);
    }

    /* renamed from: h */
    public final boolean mo24955h(gm4 gm4) {
        while (true) {
            boolean z = false;
            if (gm4.mo20676a() <= 0) {
                return false;
            }
            if (!this.f16828h) {
                if (gm4.mo20662D() == 11) {
                    z = true;
                }
                this.f16828h = z;
            } else {
                int D = gm4.mo20662D();
                if (D == 119) {
                    this.f16828h = false;
                    return true;
                }
                if (D == 11) {
                    z = true;
                }
                this.f16828h = z;
            }
        }
    }

    public C3131q7(String str) {
        fm4 fm4 = new fm4(new byte[128]);
        this.f16821a = fm4;
        this.f16822b = new gm4(fm4.f11939a);
        this.f16826f = 0;
        this.f16832l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f16823c = str;
    }
}
