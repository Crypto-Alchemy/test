package p000;

import java.math.BigInteger;

/* renamed from: vf7 */
public abstract class vf7 {

    /* renamed from: a */
    public static final int[] f45288a = {13, 41, 121, 337, 897, 2305};

    /* renamed from: b */
    public static final byte[] f45289b = new byte[0];

    /* renamed from: c */
    public static final int[] f45290c = new int[0];

    /* renamed from: d */
    public static final nm1[] f45291d = new nm1[0];

    /* renamed from: vf7$a */
    public static class C9452a implements ut4 {

        /* renamed from: a */
        public final /* synthetic */ int f45292a;

        public C9452a(int i) {
            this.f45292a = i;
        }

        /* renamed from: a */
        public vt4 mo56012a(vt4 vt4) {
            uf7 uf7 = vt4 instanceof uf7 ? (uf7) vt4 : null;
            if (uf7 == null || uf7.mo66269b() != this.f45292a) {
                uf7 uf72 = new uf7();
                uf72.mo66279l(0);
                uf72.mo66276i(this.f45292a);
                if (uf7 != null) {
                    uf72.mo66277j(uf7.mo66270c());
                    uf72.mo66278k(uf7.mo66271d());
                    uf72.mo66280m(uf7.mo66273f());
                    uf72.mo66281n(uf7.mo66274g());
                }
                return uf72;
            }
            uf7.mo66279l(0);
            return uf7;
        }
    }

    /* renamed from: vf7$b */
    public static class C9453b implements ut4 {

        /* renamed from: a */
        public final /* synthetic */ int f45293a;

        /* renamed from: b */
        public final /* synthetic */ boolean f45294b;

        /* renamed from: c */
        public final /* synthetic */ nm1 f45295c;

        /* renamed from: d */
        public final /* synthetic */ ul1 f45296d;

        public C9453b(int i, boolean z, nm1 nm1, ul1 ul1) {
            this.f45293a = i;
            this.f45294b = z;
            this.f45295c = nm1;
            this.f45296d = ul1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2 A[LOOP:0: B:43:0x00f0->B:44:0x00f2, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0117 A[LOOP:1: B:54:0x0115->B:55:0x0117, LOOP_END] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.vt4 mo56012a(p000.vt4 r14) {
            /*
                r13 = this;
                boolean r0 = r14 instanceof p000.uf7
                r1 = 0
                if (r0 == 0) goto L_0x0008
                uf7 r14 = (p000.uf7) r14
                goto L_0x0009
            L_0x0008:
                r14 = r1
            L_0x0009:
                int r0 = r13.f45293a
                r2 = 16
                int r0 = java.lang.Math.min(r2, r0)
                r3 = 2
                int r0 = java.lang.Math.max(r3, r0)
                int r4 = r0 + -2
                r5 = 1
                int r4 = r5 << r4
                boolean r6 = r13.f45294b
                boolean r4 = r13.mo66506b(r14, r0, r4, r6)
                if (r4 == 0) goto L_0x0027
                r14.mo66268a()
                return r14
            L_0x0027:
                uf7 r4 = new uf7
                r4.<init>()
                if (r14 == 0) goto L_0x0049
                int r6 = r14.mo66268a()
                r4.mo66279l(r6)
                int r6 = r14.mo66269b()
                r4.mo66276i(r6)
                nm1[] r6 = r14.mo66270c()
                nm1[] r7 = r14.mo66271d()
                nm1 r14 = r14.mo66273f()
                goto L_0x004c
            L_0x0049:
                r14 = r1
                r6 = r14
                r7 = r6
            L_0x004c:
                int r8 = r4.mo66269b()
                int r0 = java.lang.Math.max(r8, r0)
                int r0 = java.lang.Math.min(r2, r0)
                int r2 = r0 + -2
                int r2 = r5 << r2
                r8 = 0
                if (r6 != 0) goto L_0x0065
                nm1[] r6 = p000.vf7.f45291d
                r9 = r8
                goto L_0x0066
            L_0x0065:
                int r9 = r6.length
            L_0x0066:
                if (r9 >= r2) goto L_0x0103
                nm1[] r6 = p000.vf7.m73229m(r6, r2)
                if (r2 != r5) goto L_0x0078
                nm1 r1 = r13.f45295c
                nm1 r1 = r1.mo62725A()
                r6[r8] = r1
                goto L_0x0103
            L_0x0078:
                if (r9 != 0) goto L_0x0080
                nm1 r10 = r13.f45295c
                r6[r8] = r10
                r10 = r5
                goto L_0x0081
            L_0x0080:
                r10 = r9
            L_0x0081:
                if (r2 != r3) goto L_0x008d
                nm1 r3 = r13.f45295c
                nm1 r3 = r3.mo50273H()
                r6[r5] = r3
                goto L_0x00fc
            L_0x008d:
                int r5 = r10 + -1
                r5 = r6[r5]
                if (r14 != 0) goto L_0x00ef
                r14 = r6[r8]
                nm1 r14 = r14.mo50274J()
                boolean r11 = r14.mo62751u()
                if (r11 != 0) goto L_0x00ef
                ul1 r11 = r13.f45296d
                boolean r11 = p000.sl1.m71974m(r11)
                if (r11 == 0) goto L_0x00ef
                ul1 r11 = r13.f45296d
                int r11 = r11.mo50667t()
                r12 = 64
                if (r11 < r12) goto L_0x00ef
                ul1 r11 = r13.f45296d
                int r11 = r11.mo66319q()
                if (r11 == r3) goto L_0x00c0
                r3 = 3
                if (r11 == r3) goto L_0x00c0
                r3 = 4
                if (r11 == r3) goto L_0x00c0
                goto L_0x00ef
            L_0x00c0:
                zl1 r1 = r14.mo62748s(r8)
                ul1 r3 = r13.f45296d
                zl1 r11 = r14.mo62747q()
                java.math.BigInteger r11 = r11.mo50994t()
                zl1 r12 = r14.mo50310r()
                java.math.BigInteger r12 = r12.mo50994t()
                nm1 r3 = r3.mo66311g(r11, r12)
                zl1 r11 = r1.mo50989o()
                zl1 r12 = r11.mo50984j(r1)
                nm1 r5 = r5.mo62729E(r11)
                nm1 r5 = r5.mo62730F(r12)
                if (r9 != 0) goto L_0x00f0
                r6[r8] = r5
                goto L_0x00f0
            L_0x00ef:
                r3 = r14
            L_0x00f0:
                if (r10 >= r2) goto L_0x00fc
                int r11 = r10 + 1
                nm1 r5 = r5.mo50276a(r3)
                r6[r10] = r5
                r10 = r11
                goto L_0x00f0
            L_0x00fc:
                ul1 r3 = r13.f45296d
                int r5 = r2 - r9
                r3.mo66326z(r6, r9, r5, r1)
            L_0x0103:
                boolean r1 = r13.f45294b
                if (r1 == 0) goto L_0x0122
                if (r7 != 0) goto L_0x010d
                nm1[] r1 = new p000.nm1[r2]
            L_0x010b:
                r7 = r1
                goto L_0x0115
            L_0x010d:
                int r8 = r7.length
                if (r8 >= r2) goto L_0x0115
                nm1[] r1 = p000.vf7.m73229m(r7, r2)
                goto L_0x010b
            L_0x0115:
                if (r8 >= r2) goto L_0x0122
                r1 = r6[r8]
                nm1 r1 = r1.mo50278z()
                r7[r8] = r1
                int r8 = r8 + 1
                goto L_0x0115
            L_0x0122:
                r4.mo66277j(r6)
                r4.mo66278k(r7)
                r4.mo66280m(r14)
                r4.mo66281n(r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vf7.C9453b.mo56012a(vt4):vt4");
        }

        /* renamed from: b */
        public final boolean mo66506b(uf7 uf7, int i, int i2, boolean z) {
            return uf7 != null && uf7.mo66274g() >= Math.max(uf7.mo66269b(), i) && mo66507c(uf7.mo66270c(), i2) && (!z || mo66507c(uf7.mo66271d(), i2));
        }

        /* renamed from: c */
        public final boolean mo66507c(nm1[] nm1Arr, int i) {
            return nm1Arr != null && nm1Arr.length >= i;
        }
    }

    /* renamed from: vf7$c */
    public static class C9454c implements ut4 {

        /* renamed from: a */
        public final /* synthetic */ uf7 f45297a;

        /* renamed from: b */
        public final /* synthetic */ boolean f45298b;

        /* renamed from: c */
        public final /* synthetic */ om1 f45299c;

        public C9454c(uf7 uf7, boolean z, om1 om1) {
            this.f45297a = uf7;
            this.f45298b = z;
            this.f45299c = om1;
        }

        /* renamed from: a */
        public vt4 mo56012a(vt4 vt4) {
            uf7 uf7 = vt4 instanceof uf7 ? (uf7) vt4 : null;
            int g = this.f45297a.mo66274g();
            if (mo66508b(uf7, g, this.f45297a.mo66270c().length, this.f45298b)) {
                uf7.mo66268a();
                return uf7;
            }
            uf7 uf72 = new uf7();
            uf72.mo66279l(this.f45297a.mo66272e());
            nm1 f = this.f45297a.mo66273f();
            if (f != null) {
                uf72.mo66280m(this.f45299c.mo64495a(f));
            }
            nm1[] c = this.f45297a.mo66270c();
            int length = c.length;
            nm1[] nm1Arr = new nm1[length];
            for (int i = 0; i < c.length; i++) {
                nm1Arr[i] = this.f45299c.mo64495a(c[i]);
            }
            uf72.mo66277j(nm1Arr);
            uf72.mo66281n(g);
            if (this.f45298b) {
                nm1[] nm1Arr2 = new nm1[length];
                for (int i2 = 0; i2 < length; i2++) {
                    nm1Arr2[i2] = nm1Arr[i2].mo50278z();
                }
                uf72.mo66278k(nm1Arr2);
            }
            return uf72;
        }

        /* renamed from: b */
        public final boolean mo66508b(uf7 uf7, int i, int i2, boolean z) {
            return uf7 != null && uf7.mo66274g() >= i && mo66509c(uf7.mo66270c(), i2) && (!z || mo66509c(uf7.mo66271d(), i2));
        }

        /* renamed from: c */
        public final boolean mo66509c(nm1[] nm1Arr, int i) {
            return nm1Arr != null && nm1Arr.length >= i;
        }
    }

    /* renamed from: c */
    public static void m73219c(nm1 nm1) {
        ul1 i = nm1.mo62740i();
        if (i != null) {
            BigInteger w = i.mo66323w();
            i.mo66305A(nm1, "bc_wnaf", new C9452a(Math.min(16, m73224h(w == null ? i.mo50667t() + 1 : w.bitLength()) + 3)));
        }
    }

    /* renamed from: d */
    public static int[] m73220d(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            return f45290c;
        } else {
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength();
            int i = bitLength >> 1;
            int[] iArr = new int[i];
            BigInteger xor = add.xor(bigInteger);
            int i2 = bitLength - 1;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            while (i4 < i2) {
                if (!xor.testBit(i4)) {
                    i5++;
                } else {
                    iArr[i3] = i5 | ((bigInteger.testBit(i4) ? -1 : 1) << 16);
                    i4++;
                    i5 = 1;
                    i3++;
                }
                i4++;
            }
            int i6 = i3 + 1;
            iArr[i3] = 65536 | i5;
            return i > i6 ? m73231o(iArr, i6) : iArr;
        }
    }

    /* renamed from: e */
    public static int[] m73221e(int i, BigInteger bigInteger) {
        if (i == 2) {
            return m73220d(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            return f45290c;
        } else {
            int bitLength = (bigInteger.bitLength() / i) + 1;
            int[] iArr = new int[bitLength];
            int i2 = 1 << i;
            int i3 = i2 - 1;
            int i4 = i2 >>> 1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i5) == z) {
                    i5++;
                } else {
                    bigInteger = bigInteger.shiftRight(i5);
                    int intValue = bigInteger.intValue() & i3;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i4) != 0;
                    if (z) {
                        intValue -= i2;
                    }
                    if (i6 > 0) {
                        i5--;
                    }
                    iArr[i6] = i5 | (intValue << 16);
                    i5 = i;
                    i6++;
                }
            }
            return bitLength > i6 ? m73231o(iArr, i6) : iArr;
        }
    }

    /* renamed from: f */
    public static byte[] m73222f(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return f45289b;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength() - 1;
        byte[] bArr = new byte[bitLength];
        BigInteger xor = add.xor(bigInteger);
        int i = 1;
        while (i < bitLength) {
            if (xor.testBit(i)) {
                bArr[i - 1] = (byte) (bigInteger.testBit(i) ? -1 : 1);
                i++;
            }
            i++;
        }
        bArr[bitLength - 1] = 1;
        return bArr;
    }

    /* renamed from: g */
    public static byte[] m73223g(int i, BigInteger bigInteger) {
        if (i == 2) {
            return m73222f(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (bigInteger.signum() == 0) {
            return f45289b;
        } else {
            int bitLength = bigInteger.bitLength() + 1;
            byte[] bArr = new byte[bitLength];
            int i2 = 1 << i;
            int i3 = i2 - 1;
            int i4 = i2 >>> 1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i5) == z) {
                    i5++;
                } else {
                    bigInteger = bigInteger.shiftRight(i5);
                    int intValue = bigInteger.intValue() & i3;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i4) != 0;
                    if (z) {
                        intValue -= i2;
                    }
                    if (i6 > 0) {
                        i5--;
                    }
                    int i7 = i6 + i5;
                    bArr[i7] = (byte) intValue;
                    i6 = i7 + 1;
                    i5 = i;
                }
            }
            return bitLength > i6 ? m73230n(bArr, i6) : bArr;
        }
    }

    /* renamed from: h */
    public static int m73224h(int i) {
        return m73226j(i, f45288a, 16);
    }

    /* renamed from: i */
    public static int m73225i(int i, int i2) {
        return m73226j(i, f45288a, i2);
    }

    /* renamed from: j */
    public static int m73226j(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < iArr.length && i >= iArr[i3]) {
            i3++;
        }
        return Math.max(2, Math.min(i2, i3 + 2));
    }

    /* renamed from: k */
    public static uf7 m73227k(nm1 nm1, int i, boolean z) {
        ul1 i2 = nm1.mo62740i();
        return (uf7) i2.mo66305A(nm1, "bc_wnaf", new C9453b(i, z, nm1, i2));
    }

    /* renamed from: l */
    public static uf7 m73228l(nm1 nm1, om1 om1, uf7 uf7, boolean z) {
        return (uf7) nm1.mo62740i().mo66305A(nm1, "bc_wnaf", new C9454c(uf7, z, om1));
    }

    /* renamed from: m */
    public static nm1[] m73229m(nm1[] nm1Arr, int i) {
        nm1[] nm1Arr2 = new nm1[i];
        System.arraycopy(nm1Arr, 0, nm1Arr2, 0, nm1Arr.length);
        return nm1Arr2;
    }

    /* renamed from: n */
    public static byte[] m73230n(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: o */
    public static int[] m73231o(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }
}
