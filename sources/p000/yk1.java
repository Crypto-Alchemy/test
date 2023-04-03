package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.iy6;
import p000.zs6;

/* renamed from: yk1 */
/* compiled from: DtsReader */
public final class yk1 implements yn1 {

    /* renamed from: a */
    public final gm4 f20248a = new gm4(new byte[18]);

    /* renamed from: b */
    public final String f20249b;

    /* renamed from: c */
    public String f20250c;

    /* renamed from: d */
    public zs6 f20251d;

    /* renamed from: e */
    public int f20252e = 0;

    /* renamed from: f */
    public int f20253f;

    /* renamed from: g */
    public int f20254g;

    /* renamed from: h */
    public long f20255h;

    /* renamed from: i */
    public C0792h f20256i;

    /* renamed from: j */
    public int f20257j;

    /* renamed from: k */
    public long f20258k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    public yk1(String str) {
        this.f20249b = str;
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        C2725kr.m20989i(this.f20251d);
        while (gm4.mo20676a() > 0) {
            int i = this.f20252e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(gm4.mo20676a(), this.f20257j - this.f20253f);
                        this.f20251d.mo7300a(gm4, min);
                        int i2 = this.f20253f + min;
                        this.f20253f = i2;
                        int i3 = this.f20257j;
                        if (i2 == i3) {
                            long j = this.f20258k;
                            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                                this.f20251d.mo7301b(j, 1, i3, 0, (zs6.C3758a) null);
                                this.f20258k += this.f20255h;
                            }
                            this.f20252e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (mo28139b(gm4, this.f20248a.mo20679d(), 18)) {
                    mo28140g();
                    this.f20248a.mo20674P(0);
                    this.f20251d.mo7300a(this.f20248a, 18);
                    this.f20252e = 2;
                }
            } else if (mo28141h(gm4)) {
                this.f20252e = 1;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo28139b(gm4 gm4, byte[] bArr, int i) {
        int min = Math.min(gm4.mo20676a(), i - this.f20253f);
        gm4.mo20685j(bArr, this.f20253f, min);
        int i2 = this.f20253f + min;
        this.f20253f = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f20252e = 0;
        this.f20253f = 0;
        this.f20254g = 0;
        this.f20258k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f20250c = dVar.mo21671b();
        this.f20251d = jy1.mo7713f(dVar.mo21672c(), 1);
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f20258k = j;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void mo28140g() {
        byte[] d = this.f20248a.mo20679d();
        if (this.f20256i == null) {
            C0792h g = zk1.m31354g(d, this.f20250c, this.f20249b, (DrmInitData) null);
            this.f20256i = g;
            this.f20251d.mo7303d(g);
        }
        this.f20257j = zk1.m31348a(d);
        this.f20255h = (long) ((int) ((((long) zk1.m31353f(d)) * 1000000) / ((long) this.f20256i.f4187b1)));
    }

    /* renamed from: h */
    public final boolean mo28141h(gm4 gm4) {
        while (gm4.mo20676a() > 0) {
            int i = this.f20254g << 8;
            this.f20254g = i;
            int D = i | gm4.mo20662D();
            this.f20254g = D;
            if (zk1.m31351d(D)) {
                byte[] d = this.f20248a.mo20679d();
                int i2 = this.f20254g;
                d[0] = (byte) ((i2 >> 24) & 255);
                d[1] = (byte) ((i2 >> 16) & 255);
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                this.f20253f = 4;
                this.f20254g = 0;
                return true;
            }
        }
        return false;
    }
}
