package p000;

import androidx.media3.common.C0792h;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C3467v7;
import p000.iy6;
import p000.zs6;

/* renamed from: u7 */
/* compiled from: Ac4Reader */
public final class C3396u7 implements yn1 {

    /* renamed from: a */
    public final fm4 f18395a;

    /* renamed from: b */
    public final gm4 f18396b;

    /* renamed from: c */
    public final String f18397c;

    /* renamed from: d */
    public String f18398d;

    /* renamed from: e */
    public zs6 f18399e;

    /* renamed from: f */
    public int f18400f;

    /* renamed from: g */
    public int f18401g;

    /* renamed from: h */
    public boolean f18402h;

    /* renamed from: i */
    public boolean f18403i;

    /* renamed from: j */
    public long f18404j;

    /* renamed from: k */
    public C0792h f18405k;

    /* renamed from: l */
    public int f18406l;

    /* renamed from: m */
    public long f18407m;

    public C3396u7() {
        this((String) null);
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        int i;
        C2725kr.m20989i(this.f18399e);
        while (gm4.mo20676a() > 0) {
            int i2 = this.f18400f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(gm4.mo20676a(), this.f18406l - this.f18401g);
                        this.f18399e.mo7300a(gm4, min);
                        int i3 = this.f18401g + min;
                        this.f18401g = i3;
                        int i4 = this.f18406l;
                        if (i3 == i4) {
                            long j = this.f18407m;
                            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                                this.f18399e.mo7301b(j, 1, i4, 0, (zs6.C3758a) null);
                                this.f18407m += this.f18404j;
                            }
                            this.f18400f = 0;
                        }
                    }
                } else if (mo26667b(gm4, this.f18396b.mo20679d(), 16)) {
                    mo26668g();
                    this.f18396b.mo20674P(0);
                    this.f18399e.mo7300a(this.f18396b, 16);
                    this.f18400f = 2;
                }
            } else if (mo26669h(gm4)) {
                this.f18400f = 1;
                this.f18396b.mo20679d()[0] = -84;
                byte[] d = this.f18396b.mo20679d();
                if (this.f18403i) {
                    i = 65;
                } else {
                    i = 64;
                }
                d[1] = (byte) i;
                this.f18401g = 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo26667b(gm4 gm4, byte[] bArr, int i) {
        int min = Math.min(gm4.mo20676a(), i - this.f18401g);
        gm4.mo20685j(bArr, this.f18401g, min);
        int i2 = this.f18401g + min;
        this.f18401g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f18400f = 0;
        this.f18401g = 0;
        this.f18402h = false;
        this.f18403i = false;
        this.f18407m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f18398d = dVar.mo21671b();
        this.f18399e = jy1.mo7713f(dVar.mo21672c(), 1);
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f18407m = j;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void mo26668g() {
        this.f18395a.mo20012p(0);
        C3467v7.C3469b d = C3467v7.m28678d(this.f18395a);
        C0792h hVar = this.f18405k;
        if (hVar == null || d.f18698c != hVar.f4202v0 || d.f18697b != hVar.f4187b1 || !"audio/ac4".equals(hVar.f4175C)) {
            C0792h E = new C0792h.C0794b().mo6658S(this.f18398d).mo6670e0("audio/ac4").mo6647H(d.f18698c).mo6671f0(d.f18697b).mo6661V(this.f18397c).mo6644E();
            this.f18405k = E;
            this.f18399e.mo7303d(E);
        }
        this.f18406l = d.f18699d;
        this.f18404j = (((long) d.f18700e) * 1000000) / ((long) this.f18405k.f4187b1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26669h(p000.gm4 r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.mo20676a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f18402h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.mo20662D()
            if (r0 != r2) goto L_0x0015
            r1 = r3
        L_0x0015:
            r5.f18402h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.mo20662D()
            if (r0 != r2) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r5.f18402h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = r3
        L_0x002e:
            r5.f18403i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3396u7.mo26669h(gm4):boolean");
    }

    public C3396u7(String str) {
        fm4 fm4 = new fm4(new byte[16]);
        this.f18395a = fm4;
        this.f18396b = new gm4(fm4.f11939a);
        this.f18400f = 0;
        this.f18401g = 0;
        this.f18402h = false;
        this.f18403i = false;
        this.f18407m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f18397c = str;
    }
}
