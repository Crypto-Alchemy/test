package p000;

import java.math.BigInteger;

/* renamed from: p34 */
public abstract class p34 {
    /* renamed from: A */
    public static int m70857A(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j + ((((long) iArr[i2]) & 4294967295L) - (4294967295L & ((long) iArr2[i2])))) >> 32;
        }
        return (int) j;
    }

    /* renamed from: B */
    public static int m70858B(int i, int i2, int[] iArr, int i3, int[] iArr2, int[] iArr3, int i4) {
        long j = ((long) i2) & 4294967295L;
        long j2 = ((long) i3) & 4294967295L;
        long j3 = 0;
        int i5 = 0;
        do {
            int i6 = i4 + i5;
            long j4 = j3 + ((((long) iArr[i5]) & 4294967295L) * j) + ((((long) iArr2[i5]) & 4294967295L) * j2) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j4;
            j3 = j4 >>> 32;
            i5++;
        } while (i5 < i);
        return (int) j3;
    }

    /* renamed from: C */
    public static int m70859C(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j = ((long) i2) & 4294967295L;
        long j2 = 0;
        int i5 = 0;
        do {
            int i6 = i4 + i5;
            long j3 = j2 + ((((long) iArr[i3 + i5]) & 4294967295L) * j) + (((long) iArr2[i6]) & 4294967295L);
            iArr2[i6] = (int) j3;
            j2 = j3 >>> 32;
            i5++;
        } while (i5 < i);
        return (int) j2;
    }

    /* renamed from: D */
    public static int m70860D(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr[i] = (i2 << 31) | (i3 >>> 1);
            i2 = i3;
        }
    }

    /* renamed from: E */
    public static int m70861E(int i, int[] iArr, int i2, int i3, int i4, int[] iArr2, int i5) {
        while (true) {
            i--;
            if (i < 0) {
                return i4 << (-i3);
            }
            int i6 = iArr[i2 + i];
            iArr2[i5 + i] = (i4 << (-i3)) | (i6 >>> i3);
            i4 = i6;
        }
    }

    /* renamed from: F */
    public static int m70862F(int i, int[] iArr, int i2, int i3, int[] iArr2, int i4) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i2 + i5];
            iArr2[i4 + i5] = (i3 >>> 31) | (i6 << 1);
            i5++;
            i3 = i6;
        }
        return i3 >>> 31;
    }

    /* renamed from: G */
    public static int m70863G(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    /* renamed from: H */
    public static long m70864H(int i, long[] jArr, int i2, long j, long[] jArr2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            long j2 = jArr[i2 + i4];
            jArr2[i3 + i4] = (j >>> 63) | (j2 << 1);
            i4++;
            j = j2;
        }
        return j >>> 63;
    }

    /* renamed from: I */
    public static int m70865I(int i, int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = iArr[i4];
            iArr[i4] = (i3 >>> (-i2)) | (i5 << i2);
            i4++;
            i3 = i5;
        }
        return i3 >>> (-i2);
    }

    /* renamed from: J */
    public static int m70866J(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = iArr[i4];
            iArr2[i4] = (i3 >>> (-i2)) | (i5 << i2);
            i4++;
            i3 = i5;
        }
        return i3 >>> (-i2);
    }

    /* renamed from: K */
    public static long m70867K(int i, long[] jArr, int i2, int i3, long j) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = i2 + i4;
            long j2 = jArr[i5];
            jArr[i5] = (j >>> (-i3)) | (j2 << i3);
            i4++;
            j = j2;
        }
        return j >>> (-i3);
    }

    /* renamed from: L */
    public static long m70868L(int i, long[] jArr, int i2, int i3, long j, long[] jArr2, int i4) {
        int i5 = 0;
        while (i5 < i) {
            long j2 = jArr[i2 + i5];
            jArr2[i4 + i5] = (j >>> (-i3)) | (j2 << i3);
            i5++;
            j = j2;
        }
        return j >>> (-i3);
    }

    /* renamed from: M */
    public static int m70869M(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((((long) iArr[i2]) & 4294967295L) - (4294967295L & ((long) iArr2[i2])));
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* renamed from: N */
    public static int m70870N(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((4294967295L & ((long) iArr[1])) - 1);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return m70889m(i, iArr, 2);
    }

    /* renamed from: O */
    public static int m70871O(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + i4;
            long j2 = j + ((((long) iArr2[i5]) & 4294967295L) - (4294967295L & ((long) iArr[i2 + i4])));
            iArr2[i5] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* renamed from: P */
    public static int m70872P(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((((long) iArr2[i2]) & 4294967295L) - (4294967295L & ((long) iArr[i2])));
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* renamed from: Q */
    public static int m70873Q(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[0] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return m70889m(i, iArr, 1);
    }

    /* renamed from: R */
    public static BigInteger m70874R(int i, int[] iArr) {
        byte[] bArr = new byte[(i << 2)];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                ek4.m57383c(i3, bArr, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: S */
    public static void m70875S(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
    }

    /* renamed from: T */
    public static void m70876T(int i, long[] jArr) {
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = 0;
        }
    }

    /* renamed from: a */
    public static int m70877a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2]));
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: b */
    public static int m70878b(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[1])) + 1;
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return m70899w(i, iArr, 2);
    }

    /* renamed from: c */
    public static int m70879c(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (4294967295L & ((long) iArr3[i2]));
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static int m70880d(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + i4;
            long j2 = j + (((long) iArr[i2 + i4]) & 4294967295L) + (4294967295L & ((long) iArr2[i5]));
            iArr2[i5] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: e */
    public static int m70881e(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2]));
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: f */
    public static int m70882f(int i, int i2, int[] iArr, int i3) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i3]));
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return m70899w(i, iArr, i3 + 1);
    }

    /* renamed from: g */
    public static int m70883g(int i, int i2, int[] iArr) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return m70899w(i, iArr, 1);
    }

    /* renamed from: h */
    public static int m70884h(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) (-(i2 & 1))) & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = j2 + (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i3]) & j);
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    /* renamed from: i */
    public static void m70885i(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i3, i);
    }

    /* renamed from: j */
    public static int[] m70886j(int i) {
        return new int[i];
    }

    /* renamed from: k */
    public static long[] m70887k(int i) {
        return new long[i];
    }

    /* renamed from: l */
    public static int m70888l(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static int m70889m(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: n */
    public static boolean m70890n(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static int m70891o(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        for (int i4 = 1; i4 < i; i4++) {
            i3 |= iArr[i4];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    /* renamed from: p */
    public static int m70892p(int i, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= iArr[i3];
        }
        return (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
    }

    /* renamed from: q */
    public static int[] m70893q(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 31) >> 5;
        int[] j = m70886j(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            j[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return j;
    }

    /* renamed from: r */
    public static long[] m70894r(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 63) >> 6;
        long[] k = m70887k(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            k[i3] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return k;
    }

    /* renamed from: s */
    public static int m70895s(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= iArr.length) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: t */
    public static boolean m70896t(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static int m70897u(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: v */
    public static int m70898v(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: w */
    public static int m70899w(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    /* renamed from: x */
    public static int m70900x(int i, int[] iArr, int i2, int i3) {
        while (i3 < i) {
            int i4 = i2 + i3;
            int i5 = iArr[i4] + 1;
            iArr[i4] = i5;
            if (i5 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    /* renamed from: y */
    public static boolean m70901y(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m70902z(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }
}
