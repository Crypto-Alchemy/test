package p000;

import java.util.Arrays;
import p000.iy6;

/* renamed from: dk2 */
/* compiled from: H262Reader */
public final class dk2 implements yn1 {

    /* renamed from: q */
    public static final double[] f10733q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f10734a;

    /* renamed from: b */
    public zs6 f10735b;

    /* renamed from: c */
    public final r57 f10736c;

    /* renamed from: d */
    public final gm4 f10737d;

    /* renamed from: e */
    public final p24 f10738e;

    /* renamed from: f */
    public final boolean[] f10739f;

    /* renamed from: g */
    public final C2170a f10740g;

    /* renamed from: h */
    public long f10741h;

    /* renamed from: i */
    public boolean f10742i;

    /* renamed from: j */
    public boolean f10743j;

    /* renamed from: k */
    public long f10744k;

    /* renamed from: l */
    public long f10745l;

    /* renamed from: m */
    public long f10746m;

    /* renamed from: n */
    public long f10747n;

    /* renamed from: o */
    public boolean f10748o;

    /* renamed from: p */
    public boolean f10749p;

    /* renamed from: dk2$a */
    /* compiled from: H262Reader */
    public static final class C2170a {

        /* renamed from: e */
        public static final byte[] f10750e = {0, 0, 1};

        /* renamed from: a */
        public boolean f10751a;

        /* renamed from: b */
        public int f10752b;

        /* renamed from: c */
        public int f10753c;

        /* renamed from: d */
        public byte[] f10754d;

        public C2170a(int i) {
            this.f10754d = new byte[i];
        }

        /* renamed from: a */
        public void mo18803a(byte[] bArr, int i, int i2) {
            if (this.f10751a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f10754d;
                int length = bArr2.length;
                int i4 = this.f10752b;
                if (length < i4 + i3) {
                    this.f10754d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f10754d, this.f10752b, i3);
                this.f10752b += i3;
            }
        }

        /* renamed from: b */
        public boolean mo18804b(int i, int i2) {
            if (this.f10751a) {
                int i3 = this.f10752b - i2;
                this.f10752b = i3;
                if (this.f10753c == 0 && i == 181) {
                    this.f10753c = i3;
                } else {
                    this.f10751a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f10751a = true;
            }
            byte[] bArr = f10750e;
            mo18803a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo18805c() {
            this.f10751a = false;
            this.f10752b = 0;
            this.f10753c = 0;
        }
    }

    public dk2() {
        this((r57) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<androidx.media3.common.C0792h, java.lang.Long> m15141b(p000.dk2.C2170a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f10754d
            int r1 = r8.f10752b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            androidx.media3.common.h$b r6 = new androidx.media3.common.h$b
            r6.<init>()
            androidx.media3.common.h$b r9 = r6.mo6658S(r9)
            java.lang.String r6 = "video/mpeg2"
            androidx.media3.common.h$b r9 = r9.mo6670e0(r6)
            androidx.media3.common.h$b r9 = r9.mo6675j0(r2)
            androidx.media3.common.h$b r9 = r9.mo6656Q(r4)
            androidx.media3.common.h$b r9 = r9.mo6666a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            androidx.media3.common.h$b r9 = r9.mo6659T(r1)
            androidx.media3.common.h r9 = r9.mo6644E()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0099
            double[] r5 = f10733q
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0099
            r1 = r5[r4]
            int r8 = r8.f10753c
            int r8 = r8 + 9
            byte r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L_0x0092
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0092:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x0099:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk2.m15141b(dk2$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18798a(p000.gm4 r21) {
        /*
            r20 = this;
            r0 = r20
            zs6 r1 = r0.f10735b
            p000.C2725kr.m20989i(r1)
            int r1 = r21.mo20680e()
            int r2 = r21.mo20681f()
            byte[] r3 = r21.mo20679d()
            long r4 = r0.f10741h
            int r6 = r21.mo20676a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f10741h = r4
            zs6 r4 = r0.f10735b
            int r5 = r21.mo20676a()
            r6 = r21
            r4.mo7300a(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f10739f
            int r4 = p000.q24.m25334c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f10743j
            if (r4 != 0) goto L_0x0039
            dk2$a r4 = r0.f10740g
            r4.mo18803a(r3, r1, r2)
        L_0x0039:
            p24 r4 = r0.f10738e
            if (r4 == 0) goto L_0x0040
            r4.mo24321a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.mo20679d()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f10743j
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            dk2$a r9 = r0.f10740g
            r9.mo18803a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = r10
        L_0x005f:
            dk2$a r12 = r0.f10740g
            boolean r9 = r12.mo18804b(r5, r9)
            if (r9 == 0) goto L_0x008a
            dk2$a r9 = r0.f10740g
            java.lang.String r12 = r0.f10734a
            java.lang.Object r12 = p000.C2725kr.m20985e(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = m15141b(r9, r12)
            zs6 r12 = r0.f10735b
            java.lang.Object r13 = r9.first
            androidx.media3.common.h r13 = (androidx.media3.common.C0792h) r13
            r12.mo7303d(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f10744k = r12
            r0.f10743j = r11
        L_0x008a:
            p24 r9 = r0.f10738e
            if (r9 == 0) goto L_0x00d9
            if (r8 <= 0) goto L_0x0095
            r9.mo24321a(r3, r1, r4)
            r1 = r10
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            p24 r8 = r0.f10738e
            boolean r1 = r8.mo24322b(r1)
            if (r1 == 0) goto L_0x00c6
            p24 r1 = r0.f10738e
            byte[] r8 = r1.f16264d
            int r1 = r1.f16265e
            int r1 = p000.q24.m25348q(r8, r1)
            gm4 r8 = r0.f10737d
            java.lang.Object r8 = p000.w67.m29360j(r8)
            gm4 r8 = (p000.gm4) r8
            p24 r9 = r0.f10738e
            byte[] r9 = r9.f16264d
            r8.mo20672N(r9, r1)
            r57 r1 = r0.f10736c
            java.lang.Object r1 = p000.w67.m29360j(r1)
            r57 r1 = (p000.r57) r1
            long r8 = r0.f10747n
            gm4 r12 = r0.f10737d
            r1.mo25336a(r8, r12)
        L_0x00c6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00d9
            byte[] r1 = r21.mo20679d()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00d9
            p24 r1 = r0.f10738e
            r1.mo24325e(r5)
        L_0x00d9:
            if (r5 == 0) goto L_0x00e7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0145
            r0.f10748o = r11
            goto L_0x0145
        L_0x00e7:
            int r1 = r2 - r4
            boolean r4 = r0.f10749p
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r0.f10743j
            if (r4 == 0) goto L_0x0112
            long r13 = r0.f10747n
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            boolean r15 = r0.f10748o
            long r11 = r0.f10741h
            r19 = r5
            long r4 = r0.f10746m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            zs6 r12 = r0.f10735b
            r18 = 0
            r17 = r1
            r12.mo7301b(r13, r15, r16, r17, r18)
            goto L_0x0114
        L_0x0112:
            r19 = r5
        L_0x0114:
            boolean r4 = r0.f10742i
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.f10749p
            if (r4 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1 = 1
            goto L_0x0140
        L_0x011f:
            long r4 = r0.f10741h
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f10746m = r4
            long r4 = r0.f10745l
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012c
            goto L_0x0137
        L_0x012c:
            long r4 = r0.f10747n
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0136
            long r11 = r0.f10744k
            long r4 = r4 + r11
            goto L_0x0137
        L_0x0136:
            r4 = r8
        L_0x0137:
            r0.f10747n = r4
            r0.f10748o = r10
            r0.f10745l = r8
            r1 = 1
            r0.f10742i = r1
        L_0x0140:
            if (r19 != 0) goto L_0x0143
            r10 = r1
        L_0x0143:
            r0.f10749p = r10
        L_0x0145:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk2.mo18798a(gm4):void");
    }

    /* renamed from: c */
    public void mo18799c() {
        q24.m25332a(this.f10739f);
        this.f10740g.mo18805c();
        p24 p24 = this.f10738e;
        if (p24 != null) {
            p24.mo24324d();
        }
        this.f10741h = 0;
        this.f10742i = false;
        this.f10745l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f10747n = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f10734a = dVar.mo21671b();
        this.f10735b = jy1.mo7713f(dVar.mo21672c(), 2);
        r57 r57 = this.f10736c;
        if (r57 != null) {
            r57.mo25337b(jy1, dVar);
        }
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        this.f10745l = j;
    }

    public dk2(r57 r57) {
        this.f10736c = r57;
        this.f10739f = new boolean[4];
        this.f10740g = new C2170a(128);
        if (r57 != null) {
            this.f10738e = new p24(178, 128);
            this.f10737d = new gm4();
        } else {
            this.f10738e = null;
            this.f10737d = null;
        }
        this.f10745l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f10747n = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
