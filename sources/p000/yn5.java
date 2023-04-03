package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: yn5 */
public class yn5 {

    /* renamed from: a */
    public static final int[] f46225a = {-1, -1, -1, -3};

    /* renamed from: b */
    public static final int[] f46226b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* renamed from: c */
    public static final int[] f46227c = {-1, -1, -1, -5, 1, 0, -4, 3};

    /* renamed from: a */
    public static void m74480a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (f34.m57562a(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && f34.m57575n(iArr3, f46225a))) {
            m74482c(iArr3);
        }
    }

    /* renamed from: b */
    public static void m74481b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && f34.m57575n(iArr2, f46225a))) {
            m74482c(iArr2);
        }
    }

    /* renamed from: c */
    public static void m74482c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (4294967295L & ((long) iArr[3])) + 2);
    }

    /* renamed from: d */
    public static int[] m74483d(BigInteger bigInteger) {
        int[] l = f34.m57573l(bigInteger);
        if ((l[3] >>> 1) >= 2147483646) {
            int[] iArr = f46225a;
            if (f34.m57575n(l, iArr)) {
                f34.m57584w(iArr, l);
            }
        }
        return l;
    }

    /* renamed from: e */
    public static void m74484e(int[] iArr, int[] iArr2) {
        hw3.m58708b(f46225a, iArr, iArr2);
    }

    /* renamed from: f */
    public static int m74485f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: g */
    public static void m74486g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h = f34.m57569h();
        f34.m57580s(iArr, iArr2, h);
        m74491l(h, iArr3);
    }

    /* renamed from: h */
    public static void m74487h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (f34.m57581t(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && j34.m59234s(iArr3, f46226b))) {
            int[] iArr4 = f46227c;
            p34.m70881e(iArr4.length, iArr4, iArr3);
        }
    }

    /* renamed from: i */
    public static void m74488i(int[] iArr, int[] iArr2) {
        if (m74485f(iArr) != 0) {
            int[] iArr3 = f46225a;
            f34.m57583v(iArr3, iArr3, iArr2);
            return;
        }
        f34.m57583v(f46225a, iArr, iArr2);
    }

    /* renamed from: j */
    public static void m74489j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 4);
        } while (p34.m70857A(4, iArr, f46225a) == 0);
    }

    /* renamed from: k */
    public static void m74490k(SecureRandom secureRandom, int[] iArr) {
        do {
            m74489j(secureRandom, iArr);
        } while (m74485f(iArr) != 0);
    }

    /* renamed from: l */
    public static void m74491l(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[7]) & 4294967295L;
        long j2 = (((long) iArr[3]) & 4294967295L) + j;
        long j3 = (((long) iArr[6]) & 4294967295L) + (j << 1);
        long j4 = (((long) iArr[2]) & 4294967295L) + j3;
        long j5 = (((long) iArr[5]) & 4294967295L) + (j3 << 1);
        long j6 = (((long) iArr[1]) & 4294967295L) + j5;
        long j7 = (((long) iArr[4]) & 4294967295L) + (j5 << 1);
        long j8 = (((long) iArr[0]) & 4294967295L) + j7;
        iArr3[0] = (int) j8;
        long j9 = j6 + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = j4 + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = j2 + (j7 << 1) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        m74492m((int) (j11 >>> 32), iArr3);
    }

    /* renamed from: m */
    public static void m74492m(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (4294967295L & ((long) iArr[3])) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
        if ((iArr[3] >>> 1) >= 2147483646 && f34.m57575n(iArr, f46225a)) {
            m74482c(iArr);
        }
    }

    /* renamed from: n */
    public static void m74493n(int[] iArr, int[] iArr2) {
        int[] h = f34.m57569h();
        f34.m57582u(iArr, h);
        m74491l(h, iArr2);
    }

    /* renamed from: o */
    public static void m74494o(int[] iArr, int i, int[] iArr2) {
        int[] h = f34.m57569h();
        f34.m57582u(iArr, h);
        while (true) {
            m74491l(h, iArr2);
            i--;
            if (i > 0) {
                f34.m57582u(iArr2, h);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public static void m74495p(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + ((4294967295L & ((long) iArr[3])) - 2));
    }

    /* renamed from: q */
    public static void m74496q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (f34.m57583v(iArr, iArr2, iArr3) != 0) {
            m74495p(iArr3);
        }
    }

    /* renamed from: r */
    public static void m74497r(int[] iArr, int[] iArr2) {
        if (p34.m70863G(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && f34.m57575n(iArr2, f46225a))) {
            m74482c(iArr2);
        }
    }
}
