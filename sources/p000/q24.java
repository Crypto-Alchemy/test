package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: q24 */
/* compiled from: NalUnitUtil */
public final class q24 {

    /* renamed from: a */
    public static final byte[] f16719a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f16720b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f16721c = new Object();

    /* renamed from: d */
    public static int[] f16722d = new int[10];

    /* renamed from: q24$a */
    /* compiled from: NalUnitUtil */
    public static final class C3106a {

        /* renamed from: a */
        public final int f16723a;

        /* renamed from: b */
        public final boolean f16724b;

        /* renamed from: c */
        public final int f16725c;

        /* renamed from: d */
        public final int f16726d;

        /* renamed from: e */
        public final int[] f16727e;

        /* renamed from: f */
        public final int f16728f;

        /* renamed from: g */
        public final int f16729g;

        /* renamed from: h */
        public final int f16730h;

        /* renamed from: i */
        public final int f16731i;

        /* renamed from: j */
        public final float f16732j;

        public C3106a(int i, boolean z, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, float f) {
            this.f16723a = i;
            this.f16724b = z;
            this.f16725c = i2;
            this.f16726d = i3;
            this.f16727e = iArr;
            this.f16728f = i4;
            this.f16729g = i5;
            this.f16730h = i6;
            this.f16731i = i7;
            this.f16732j = f;
        }
    }

    /* renamed from: q24$b */
    /* compiled from: NalUnitUtil */
    public static final class C3107b {

        /* renamed from: a */
        public final int f16733a;

        /* renamed from: b */
        public final int f16734b;

        /* renamed from: c */
        public final boolean f16735c;

        public C3107b(int i, int i2, boolean z) {
            this.f16733a = i;
            this.f16734b = i2;
            this.f16735c = z;
        }
    }

    /* renamed from: q24$c */
    /* compiled from: NalUnitUtil */
    public static final class C3108c {

        /* renamed from: a */
        public final int f16736a;

        /* renamed from: b */
        public final int f16737b;

        /* renamed from: c */
        public final int f16738c;

        /* renamed from: d */
        public final int f16739d;

        /* renamed from: e */
        public final int f16740e;

        /* renamed from: f */
        public final int f16741f;

        /* renamed from: g */
        public final int f16742g;

        /* renamed from: h */
        public final float f16743h;

        /* renamed from: i */
        public final boolean f16744i;

        /* renamed from: j */
        public final boolean f16745j;

        /* renamed from: k */
        public final int f16746k;

        /* renamed from: l */
        public final int f16747l;

        /* renamed from: m */
        public final int f16748m;

        /* renamed from: n */
        public final boolean f16749n;

        public C3108c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.f16736a = i;
            this.f16737b = i2;
            this.f16738c = i3;
            this.f16739d = i4;
            this.f16740e = i5;
            this.f16741f = i6;
            this.f16742g = i7;
            this.f16743h = f;
            this.f16744i = z;
            this.f16745j = z2;
            this.f16746k = i8;
            this.f16747l = i9;
            this.f16748m = i10;
            this.f16749n = z3;
        }
    }

    /* renamed from: a */
    public static void m25332a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m25333b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: c */
    public static int m25334c(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - i;
        boolean z4 = false;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m25332a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m25332a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m25332a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            zArr[0] = z2;
            if (i3 <= 1 ? !zArr[2] || bArr[i4] != 0 : !(bArr[i2 - 2] == 0 && bArr[i4] == 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            zArr[1] = z3;
            if (bArr[i4] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i2;
        } else {
            m25332a(zArr);
            return i - 1;
        }
    }

    /* renamed from: d */
    public static int m25335d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m25336e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m25337f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m25338g(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static C3106a m25339h(byte[] bArr, int i, int i2) {
        return m25340i(bArr, i + 2, i2);
    }

    /* renamed from: i */
    public static C3106a m25340i(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        hm4 hm4 = new hm4(bArr, i, i2);
        hm4.mo21299l(4);
        int e = hm4.mo21292e(3);
        hm4.mo21298k();
        int e2 = hm4.mo21292e(2);
        boolean d = hm4.mo21291d();
        int e3 = hm4.mo21292e(5);
        int i6 = 0;
        for (int i7 = 0; i7 < 32; i7++) {
            if (hm4.mo21291d()) {
                i6 |= 1 << i7;
            }
        }
        int[] iArr = new int[6];
        for (int i8 = 0; i8 < 6; i8++) {
            iArr[i8] = hm4.mo21292e(8);
        }
        int e4 = hm4.mo21292e(8);
        int i9 = 0;
        for (int i10 = 0; i10 < e; i10++) {
            if (hm4.mo21291d()) {
                i9 += 89;
            }
            if (hm4.mo21291d()) {
                i9 += 8;
            }
        }
        hm4.mo21299l(i9);
        if (e > 0) {
            hm4.mo21299l((8 - e) * 2);
        }
        int h = hm4.mo21295h();
        int h2 = hm4.mo21295h();
        if (h2 == 3) {
            hm4.mo21298k();
        }
        int h3 = hm4.mo21295h();
        int h4 = hm4.mo21295h();
        if (hm4.mo21291d()) {
            int h5 = hm4.mo21295h();
            int h6 = hm4.mo21295h();
            int h7 = hm4.mo21295h();
            int h8 = hm4.mo21295h();
            if (h2 == 1 || h2 == 2) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            if (h2 == 1) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            h3 -= i4 * (h5 + h6);
            h4 -= i5 * (h7 + h8);
        }
        hm4.mo21295h();
        hm4.mo21295h();
        int h9 = hm4.mo21295h();
        if (hm4.mo21291d()) {
            i3 = 0;
        } else {
            i3 = e;
        }
        for (int i11 = i3; i11 <= e; i11++) {
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
            m25345n(hm4);
        }
        hm4.mo21299l(2);
        if (hm4.mo21291d()) {
            hm4.mo21299l(8);
            hm4.mo21295h();
            hm4.mo21295h();
            hm4.mo21298k();
        }
        m25347p(hm4);
        if (hm4.mo21291d()) {
            for (int i12 = 0; i12 < hm4.mo21295h(); i12++) {
                hm4.mo21299l(h9 + 4 + 1);
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
                    float[] fArr = f16720b;
                    if (e5 < fArr.length) {
                        f = fArr[e5];
                    } else {
                        gk3.m18132i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e5);
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
                h4 *= 2;
            }
        }
        return new C3106a(e2, d, e3, i6, iArr, e4, h, h3, h4, f);
    }

    /* renamed from: j */
    public static C3107b m25341j(byte[] bArr, int i, int i2) {
        return m25342k(bArr, i + 1, i2);
    }

    /* renamed from: k */
    public static C3107b m25342k(byte[] bArr, int i, int i2) {
        hm4 hm4 = new hm4(bArr, i, i2);
        int h = hm4.mo21295h();
        int h2 = hm4.mo21295h();
        hm4.mo21298k();
        return new C3107b(h, h2, hm4.mo21291d());
    }

    /* renamed from: l */
    public static C3108c m25343l(byte[] bArr, int i, int i2) {
        return m25344m(bArr, i + 1, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0145  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.q24.C3108c m25344m(byte[] r22, int r23, int r24) {
        /*
            hm4 r0 = new hm4
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r3 = r0.mo21292e(r1)
            int r4 = r0.mo21292e(r1)
            int r5 = r0.mo21292e(r1)
            int r6 = r0.mo21295h()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004b
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 44
            if (r3 == r10) goto L_0x004b
            r10 = 83
            if (r3 == r10) goto L_0x004b
            r10 = 86
            if (r3 == r10) goto L_0x004b
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r10 = r9
            r11 = 0
            goto L_0x0083
        L_0x004b:
            int r10 = r0.mo21295h()
            if (r10 != r2) goto L_0x0056
            boolean r11 = r0.mo21291d()
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            r0.mo21295h()
            r0.mo21295h()
            r0.mo21298k()
            boolean r12 = r0.mo21291d()
            if (r12 == 0) goto L_0x0083
            if (r10 == r2) goto L_0x006a
            r12 = r1
            goto L_0x006c
        L_0x006a:
            r12 = 12
        L_0x006c:
            r13 = 0
        L_0x006d:
            if (r13 >= r12) goto L_0x0083
            boolean r14 = r0.mo21291d()
            if (r14 == 0) goto L_0x0080
            r14 = 6
            if (r13 >= r14) goto L_0x007b
            r14 = 16
            goto L_0x007d
        L_0x007b:
            r14 = 64
        L_0x007d:
            m25346o(r0, r14)
        L_0x0080:
            int r13 = r13 + 1
            goto L_0x006d
        L_0x0083:
            int r12 = r0.mo21295h()
            int r13 = r12 + 4
            int r14 = r0.mo21295h()
            if (r14 != 0) goto L_0x0097
            int r12 = r0.mo21295h()
            int r12 = r12 + 4
            r15 = r12
            goto L_0x00b9
        L_0x0097:
            if (r14 != r9) goto L_0x00b8
            boolean r12 = r0.mo21291d()
            r0.mo21294g()
            r0.mo21294g()
            int r15 = r0.mo21295h()
            long r1 = (long) r15
            r15 = 0
        L_0x00a9:
            long r7 = (long) r15
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b4
            r0.mo21295h()
            int r15 = r15 + 1
            goto L_0x00a9
        L_0x00b4:
            r16 = r12
            r15 = 0
            goto L_0x00bb
        L_0x00b8:
            r15 = 0
        L_0x00b9:
            r16 = 0
        L_0x00bb:
            int r7 = r0.mo21295h()
            r0.mo21298k()
            int r1 = r0.mo21295h()
            int r1 = r1 + r9
            int r2 = r0.mo21295h()
            int r2 = r2 + r9
            boolean r12 = r0.mo21291d()
            int r8 = 2 - r12
            int r8 = r8 * r2
            if (r12 != 0) goto L_0x00d8
            r0.mo21298k()
        L_0x00d8:
            r0.mo21298k()
            r2 = 16
            int r1 = r1 * r2
            int r8 = r8 * r2
            boolean r2 = r0.mo21291d()
            if (r2 == 0) goto L_0x0119
            int r2 = r0.mo21295h()
            int r17 = r0.mo21295h()
            int r18 = r0.mo21295h()
            int r19 = r0.mo21295h()
            if (r10 != 0) goto L_0x00fa
            int r10 = 2 - r12
            goto L_0x010f
        L_0x00fa:
            r20 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0103
            r9 = 1
            r21 = 1
            goto L_0x0106
        L_0x0103:
            r21 = r20
            r9 = 1
        L_0x0106:
            if (r10 != r9) goto L_0x010a
            r9 = r20
        L_0x010a:
            int r10 = 2 - r12
            int r10 = r10 * r9
            r9 = r21
        L_0x010f:
            int r2 = r2 + r17
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r18 = r18 + r19
            int r18 = r18 * r10
            int r8 = r8 - r18
        L_0x0119:
            r9 = r8
            r8 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo21291d()
            if (r2 == 0) goto L_0x0164
            boolean r2 = r0.mo21291d()
            if (r2 == 0) goto L_0x0164
            r2 = 8
            int r2 = r0.mo21292e(r2)
            r10 = 255(0xff, float:3.57E-43)
            if (r2 != r10) goto L_0x0145
            r10 = 16
            int r2 = r0.mo21292e(r10)
            int r0 = r0.mo21292e(r10)
            if (r2 == 0) goto L_0x0164
            if (r0 == 0) goto L_0x0164
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x0164
        L_0x0145:
            float[] r0 = f16720b
            int r10 = r0.length
            if (r2 >= r10) goto L_0x014e
            r0 = r0[r2]
            r10 = r0
            goto L_0x0165
        L_0x014e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r0.append(r10)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            p000.gk3.m18132i(r2, r0)
        L_0x0164:
            r10 = r1
        L_0x0165:
            q24$c r0 = new q24$c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q24.m25344m(byte[], int, int):q24$c");
    }

    /* renamed from: n */
    public static void m25345n(hm4 hm4) {
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

    /* renamed from: o */
    public static void m25346o(hm4 hm4, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((hm4.mo21294g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: p */
    public static void m25347p(hm4 hm4) {
        boolean z;
        int h = hm4.mo21295h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < h; i3++) {
            if (i3 == 0 || !hm4.mo21291d()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i4 = i + i2;
                int h2 = (1 - ((hm4.mo21291d() ? 1 : 0) * true)) * (hm4.mo21295h() + 1);
                int i5 = i4 + 1;
                boolean[] zArr = new boolean[i5];
                for (int i6 = 0; i6 <= i4; i6++) {
                    if (!hm4.mo21291d()) {
                        zArr[i6] = hm4.mo21291d();
                    } else {
                        zArr[i6] = true;
                    }
                }
                int[] iArr3 = new int[i5];
                int[] iArr4 = new int[i5];
                int i7 = 0;
                for (int i8 = i2 - 1; i8 >= 0; i8--) {
                    int i9 = iArr2[i8] + h2;
                    if (i9 < 0 && zArr[i + i8]) {
                        iArr3[i7] = i9;
                        i7++;
                    }
                }
                if (h2 < 0 && zArr[i4]) {
                    iArr3[i7] = h2;
                    i7++;
                }
                for (int i10 = 0; i10 < i; i10++) {
                    int i11 = iArr[i10] + h2;
                    if (i11 < 0 && zArr[i10]) {
                        iArr3[i7] = i11;
                        i7++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i7);
                int i12 = 0;
                for (int i13 = i - 1; i13 >= 0; i13--) {
                    int i14 = iArr[i13] + h2;
                    if (i14 > 0 && zArr[i13]) {
                        iArr4[i12] = i14;
                        i12++;
                    }
                }
                if (h2 > 0 && zArr[i4]) {
                    iArr4[i12] = h2;
                    i12++;
                }
                for (int i15 = 0; i15 < i2; i15++) {
                    int i16 = iArr2[i15] + h2;
                    if (i16 > 0 && zArr[i + i15]) {
                        iArr4[i12] = i16;
                        i12++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i12);
                iArr = copyOf;
                i = i7;
                i2 = i12;
            } else {
                int h3 = hm4.mo21295h();
                int h4 = hm4.mo21295h();
                int[] iArr5 = new int[h3];
                for (int i17 = 0; i17 < h3; i17++) {
                    iArr5[i17] = hm4.mo21295h() + 1;
                    hm4.mo21298k();
                }
                int[] iArr6 = new int[h4];
                for (int i18 = 0; i18 < h4; i18++) {
                    iArr6[i18] = hm4.mo21295h() + 1;
                    hm4.mo21298k();
                }
                int[] iArr7 = iArr5;
                i = h3;
                iArr = iArr7;
                int[] iArr8 = iArr6;
                i2 = h4;
                iArr2 = iArr8;
            }
        }
    }

    /* renamed from: q */
    public static int m25348q(byte[] bArr, int i) {
        int i2;
        synchronized (f16721c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m25335d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f16722d;
                        if (iArr.length <= i4) {
                            f16722d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f16722d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f16722d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
