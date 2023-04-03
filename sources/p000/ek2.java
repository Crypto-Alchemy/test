package p000;

import androidx.media3.common.C0792h;
import java.util.Arrays;
import java.util.Collections;
import p000.iy6;
import p000.zs6;

/* renamed from: ek2 */
/* compiled from: H263Reader */
public final class ek2 implements yn1 {

    /* renamed from: l */
    public static final float[] f11209l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final r57 f11210a;

    /* renamed from: b */
    public final gm4 f11211b;

    /* renamed from: c */
    public final boolean[] f11212c = new boolean[4];

    /* renamed from: d */
    public final C2233a f11213d = new C2233a(128);

    /* renamed from: e */
    public final p24 f11214e;

    /* renamed from: f */
    public C2234b f11215f;

    /* renamed from: g */
    public long f11216g;

    /* renamed from: h */
    public String f11217h;

    /* renamed from: i */
    public zs6 f11218i;

    /* renamed from: j */
    public boolean f11219j;

    /* renamed from: k */
    public long f11220k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: ek2$a */
    /* compiled from: H263Reader */
    public static final class C2233a {

        /* renamed from: f */
        public static final byte[] f11221f = {0, 0, 1};

        /* renamed from: a */
        public boolean f11222a;

        /* renamed from: b */
        public int f11223b;

        /* renamed from: c */
        public int f11224c;

        /* renamed from: d */
        public int f11225d;

        /* renamed from: e */
        public byte[] f11226e;

        public C2233a(int i) {
            this.f11226e = new byte[i];
        }

        /* renamed from: a */
        public void mo19282a(byte[] bArr, int i, int i2) {
            if (this.f11222a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f11226e;
                int length = bArr2.length;
                int i4 = this.f11224c;
                if (length < i4 + i3) {
                    this.f11226e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f11226e, this.f11224c, i3);
                this.f11224c += i3;
            }
        }

        /* renamed from: b */
        public boolean mo19283b(int i, int i2) {
            int i3 = this.f11223b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            } else if (i == 179 || i == 181) {
                                this.f11224c -= i2;
                                this.f11222a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            gk3.m18132i("H263Reader", "Unexpected start code value");
                            mo19284c();
                        } else {
                            this.f11225d = this.f11224c;
                            this.f11223b = 4;
                        }
                    } else if (i > 31) {
                        gk3.m18132i("H263Reader", "Unexpected start code value");
                        mo19284c();
                    } else {
                        this.f11223b = 3;
                    }
                } else if (i != 181) {
                    gk3.m18132i("H263Reader", "Unexpected start code value");
                    mo19284c();
                } else {
                    this.f11223b = 2;
                }
            } else if (i == 176) {
                this.f11223b = 1;
                this.f11222a = true;
            }
            byte[] bArr = f11221f;
            mo19282a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo19284c() {
            this.f11222a = false;
            this.f11224c = 0;
            this.f11223b = 0;
        }
    }

    /* renamed from: ek2$b */
    /* compiled from: H263Reader */
    public static final class C2234b {

        /* renamed from: a */
        public final zs6 f11227a;

        /* renamed from: b */
        public boolean f11228b;

        /* renamed from: c */
        public boolean f11229c;

        /* renamed from: d */
        public boolean f11230d;

        /* renamed from: e */
        public int f11231e;

        /* renamed from: f */
        public int f11232f;

        /* renamed from: g */
        public long f11233g;

        /* renamed from: h */
        public long f11234h;

        public C2234b(zs6 zs6) {
            this.f11227a = zs6;
        }

        /* renamed from: a */
        public void mo19285a(byte[] bArr, int i, int i2) {
            boolean z;
            if (this.f11229c) {
                int i3 = this.f11232f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    if (((bArr[i4] & 192) >> 6) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f11230d = z;
                    this.f11229c = false;
                    return;
                }
                this.f11232f = i3 + (i2 - i);
            }
        }

        /* renamed from: b */
        public void mo19286b(long j, int i, boolean z) {
            if (this.f11231e == 182 && z && this.f11228b) {
                long j2 = this.f11234h;
                if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    int i2 = (int) (j - this.f11233g);
                    this.f11227a.mo7301b(j2, this.f11230d ? 1 : 0, i2, i, (zs6.C3758a) null);
                }
            }
            if (this.f11231e != 179) {
                this.f11233g = j;
            }
        }

        /* renamed from: c */
        public void mo19287c(int i, long j) {
            boolean z;
            this.f11231e = i;
            this.f11230d = false;
            boolean z2 = true;
            if (i == 182 || i == 179) {
                z = true;
            } else {
                z = false;
            }
            this.f11228b = z;
            if (i != 182) {
                z2 = false;
            }
            this.f11229c = z2;
            this.f11232f = 0;
            this.f11234h = j;
        }

        /* renamed from: d */
        public void mo19288d() {
            this.f11228b = false;
            this.f11229c = false;
            this.f11230d = false;
            this.f11231e = -1;
        }
    }

    public ek2(r57 r57) {
        this.f11210a = r57;
        if (r57 != null) {
            this.f11214e = new p24(178, 128);
            this.f11211b = new gm4();
            return;
        }
        this.f11214e = null;
        this.f11211b = null;
    }

    /* renamed from: b */
    public static C0792h m16147b(C2233a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f11226e, aVar.f11224c);
        fm4 fm4 = new fm4(copyOf);
        fm4.mo20015s(i);
        fm4.mo20015s(4);
        fm4.mo20013q();
        fm4.mo20014r(8);
        if (fm4.mo20003g()) {
            fm4.mo20014r(4);
            fm4.mo20014r(3);
        }
        int h = fm4.mo20004h(4);
        float f = 1.0f;
        if (h == 15) {
            int h2 = fm4.mo20004h(8);
            int h3 = fm4.mo20004h(8);
            if (h3 == 0) {
                gk3.m18132i("H263Reader", "Invalid aspect ratio");
            } else {
                f = ((float) h2) / ((float) h3);
            }
        } else {
            float[] fArr = f11209l;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                gk3.m18132i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (fm4.mo20003g()) {
            fm4.mo20014r(2);
            fm4.mo20014r(1);
            if (fm4.mo20003g()) {
                fm4.mo20014r(15);
                fm4.mo20013q();
                fm4.mo20014r(15);
                fm4.mo20013q();
                fm4.mo20014r(15);
                fm4.mo20013q();
                fm4.mo20014r(3);
                fm4.mo20014r(11);
                fm4.mo20013q();
                fm4.mo20014r(15);
                fm4.mo20013q();
            }
        }
        if (fm4.mo20004h(2) != 0) {
            gk3.m18132i("H263Reader", "Unhandled video object layer shape");
        }
        fm4.mo20013q();
        int h4 = fm4.mo20004h(16);
        fm4.mo20013q();
        if (fm4.mo20003g()) {
            if (h4 == 0) {
                gk3.m18132i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                fm4.mo20014r(i2);
            }
        }
        fm4.mo20013q();
        int h5 = fm4.mo20004h(13);
        fm4.mo20013q();
        int h6 = fm4.mo20004h(13);
        fm4.mo20013q();
        fm4.mo20013q();
        return new C0792h.C0794b().mo6658S(str).mo6670e0("video/mp4v-es").mo6675j0(h5).mo6656Q(h6).mo6666a0(f).mo6659T(Collections.singletonList(copyOf)).mo6644E();
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        int i;
        C2725kr.m20989i(this.f11215f);
        C2725kr.m20989i(this.f11218i);
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        byte[] d = gm4.mo20679d();
        this.f11216g += (long) gm4.mo20676a();
        this.f11218i.mo7300a(gm4, gm4.mo20676a());
        while (true) {
            int c = q24.m25334c(d, e, f, this.f11212c);
            if (c == f) {
                break;
            }
            int i2 = c + 3;
            byte b = gm4.mo20679d()[i2] & 255;
            int i3 = c - e;
            int i4 = 0;
            if (!this.f11219j) {
                if (i3 > 0) {
                    this.f11213d.mo19282a(d, e, c);
                }
                if (i3 < 0) {
                    i = -i3;
                } else {
                    i = 0;
                }
                if (this.f11213d.mo19283b(b, i)) {
                    zs6 zs6 = this.f11218i;
                    C2233a aVar = this.f11213d;
                    zs6.mo7303d(m16147b(aVar, aVar.f11225d, (String) C2725kr.m20985e(this.f11217h)));
                    this.f11219j = true;
                }
            }
            this.f11215f.mo19285a(d, e, c);
            p24 p24 = this.f11214e;
            if (p24 != null) {
                if (i3 > 0) {
                    p24.mo24321a(d, e, c);
                } else {
                    i4 = -i3;
                }
                if (this.f11214e.mo24322b(i4)) {
                    p24 p242 = this.f11214e;
                    ((gm4) w67.m29360j(this.f11211b)).mo20672N(this.f11214e.f16264d, q24.m25348q(p242.f16264d, p242.f16265e));
                    ((r57) w67.m29360j(this.f11210a)).mo25336a(this.f11220k, this.f11211b);
                }
                if (b == 178 && gm4.mo20679d()[c + 2] == 1) {
                    this.f11214e.mo24325e(b);
                }
            }
            int i5 = f - c;
            this.f11215f.mo19286b(this.f11216g - ((long) i5), i5, this.f11219j);
            this.f11215f.mo19287c(b, this.f11220k);
            e = i2;
        }
        if (!this.f11219j) {
            this.f11213d.mo19282a(d, e, f);
        }
        this.f11215f.mo19285a(d, e, f);
        p24 p243 = this.f11214e;
        if (p243 != null) {
            p243.mo24321a(d, e, f);
        }
    }

    /* renamed from: c */
    public void mo18799c() {
        q24.m25332a(this.f11212c);
        this.f11213d.mo19284c();
        C2234b bVar = this.f11215f;
        if (bVar != null) {
            bVar.mo19288d();
        }
        p24 p24 = this.f11214e;
        if (p24 != null) {
            p24.mo24324d();
        }
        this.f11216g = 0;
        this.f11220k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f11217h = dVar.mo21671b();
        zs6 f = jy1.mo7713f(dVar.mo21672c(), 2);
        this.f11218i = f;
        this.f11215f = new C2234b(f);
        r57 r57 = this.f11210a;
        if (r57 != null) {
            r57.mo25337b(jy1, dVar);
        }
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f11220k = j;
        }
    }
}
