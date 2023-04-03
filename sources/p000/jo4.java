package p000;

import androidx.media3.common.ParserException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.iy6;

/* renamed from: jo4 */
/* compiled from: PesReader */
public final class jo4 implements iy6 {

    /* renamed from: a */
    public final yn1 f13767a;

    /* renamed from: b */
    public final fm4 f13768b = new fm4(new byte[10]);

    /* renamed from: c */
    public int f13769c = 0;

    /* renamed from: d */
    public int f13770d;

    /* renamed from: e */
    public sq6 f13771e;

    /* renamed from: f */
    public boolean f13772f;

    /* renamed from: g */
    public boolean f13773g;

    /* renamed from: h */
    public boolean f13774h;

    /* renamed from: i */
    public int f13775i;

    /* renamed from: j */
    public int f13776j;

    /* renamed from: k */
    public boolean f13777k;

    /* renamed from: l */
    public long f13778l;

    public jo4(yn1 yn1) {
        this.f13767a = yn1;
    }

    /* renamed from: a */
    public final void mo21665a(gm4 gm4, int i) throws ParserException {
        C2725kr.m20989i(this.f13771e);
        if ((i & 1) != 0) {
            int i2 = this.f13769c;
            if (!(i2 == 0 || i2 == 1)) {
                if (i2 == 2) {
                    gk3.m18132i("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.f13776j != -1) {
                        gk3.m18132i("PesReader", "Unexpected start indicator: expected " + this.f13776j + " more bytes");
                    }
                    this.f13767a.mo18801e();
                } else {
                    throw new IllegalStateException();
                }
            }
            mo22029g(1);
        }
        while (gm4.mo20676a() > 0) {
            int i3 = this.f13769c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (mo22026d(gm4, this.f13768b.f11939a, Math.min(10, this.f13775i)) && mo22026d(gm4, (byte[]) null, this.f13775i)) {
                            mo22028f();
                            if (this.f13777k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f13767a.mo18802f(this.f13778l, i);
                            mo22029g(3);
                        }
                    } else if (i3 == 3) {
                        int a = gm4.mo20676a();
                        int i5 = this.f13776j;
                        if (i5 != -1) {
                            i4 = a - i5;
                        }
                        if (i4 > 0) {
                            a -= i4;
                            gm4.mo20673O(gm4.mo20680e() + a);
                        }
                        this.f13767a.mo18798a(gm4);
                        int i6 = this.f13776j;
                        if (i6 != -1) {
                            int i7 = i6 - a;
                            this.f13776j = i7;
                            if (i7 == 0) {
                                this.f13767a.mo18801e();
                                mo22029g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (mo22026d(gm4, this.f13768b.f11939a, 9)) {
                    if (mo22027e()) {
                        i4 = 2;
                    }
                    mo22029g(i4);
                }
            } else {
                gm4.mo20675Q(gm4.mo20676a());
            }
        }
    }

    /* renamed from: b */
    public void mo21666b(sq6 sq6, jy1 jy1, iy6.C2579d dVar) {
        this.f13771e = sq6;
        this.f13767a.mo18800d(jy1, dVar);
    }

    /* renamed from: c */
    public final void mo21667c() {
        this.f13769c = 0;
        this.f13770d = 0;
        this.f13774h = false;
        this.f13767a.mo18799c();
    }

    /* renamed from: d */
    public final boolean mo22026d(gm4 gm4, byte[] bArr, int i) {
        int min = Math.min(gm4.mo20676a(), i - this.f13770d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            gm4.mo20675Q(min);
        } else {
            gm4.mo20685j(bArr, this.f13770d, min);
        }
        int i2 = this.f13770d + min;
        this.f13770d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo22027e() {
        this.f13768b.mo20012p(0);
        int h = this.f13768b.mo20004h(24);
        if (h != 1) {
            gk3.m18132i("PesReader", "Unexpected start code prefix: " + h);
            this.f13776j = -1;
            return false;
        }
        this.f13768b.mo20014r(8);
        int h2 = this.f13768b.mo20004h(16);
        this.f13768b.mo20014r(5);
        this.f13777k = this.f13768b.mo20003g();
        this.f13768b.mo20014r(2);
        this.f13772f = this.f13768b.mo20003g();
        this.f13773g = this.f13768b.mo20003g();
        this.f13768b.mo20014r(6);
        int h3 = this.f13768b.mo20004h(8);
        this.f13775i = h3;
        if (h2 == 0) {
            this.f13776j = -1;
        } else {
            int i = ((h2 + 6) - 9) - h3;
            this.f13776j = i;
            if (i < 0) {
                gk3.m18132i("PesReader", "Found negative packet payload size: " + this.f13776j);
                this.f13776j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    /* renamed from: f */
    public final void mo22028f() {
        this.f13768b.mo20012p(0);
        this.f13778l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        if (this.f13772f) {
            this.f13768b.mo20014r(4);
            this.f13768b.mo20014r(1);
            this.f13768b.mo20014r(1);
            long h = (((long) this.f13768b.mo20004h(3)) << 30) | ((long) (this.f13768b.mo20004h(15) << 15)) | ((long) this.f13768b.mo20004h(15));
            this.f13768b.mo20014r(1);
            if (!this.f13774h && this.f13773g) {
                this.f13768b.mo20014r(4);
                this.f13768b.mo20014r(1);
                this.f13768b.mo20014r(1);
                this.f13768b.mo20014r(1);
                this.f13771e.mo25933b((((long) this.f13768b.mo20004h(3)) << 30) | ((long) (this.f13768b.mo20004h(15) << 15)) | ((long) this.f13768b.mo20004h(15)));
                this.f13774h = true;
            }
            this.f13778l = this.f13771e.mo25933b(h);
        }
    }

    /* renamed from: g */
    public final void mo22029g(int i) {
        this.f13769c = i;
        this.f13770d = 0;
    }
}
