package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: rx0 */
public class rx0 {

    /* renamed from: a */
    public static final int[] f44490a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b */
    public static final int[] f44491b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    /* renamed from: a */
    public static void m71695a(int[] iArr, int[] iArr2, int[] iArr3) {
        j34.m59216a(iArr, iArr2, iArr3);
        if (j34.m59234s(iArr3, f44490a)) {
            m71711q(iArr3);
        }
    }

    /* renamed from: b */
    public static void m71696b(int[] iArr, int[] iArr2) {
        p34.m70898v(8, iArr, iArr2);
        if (j34.m59234s(iArr2, f44490a)) {
            m71711q(iArr2);
        }
    }

    /* renamed from: c */
    public static int m71697c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) p34.m70889m(7, iArr, 1);
        }
        long j3 = j2 + (4294967295L & ((long) iArr[7])) + 2147483648L;
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    /* renamed from: d */
    public static int[] m71698d(BigInteger bigInteger) {
        int[] p = j34.m59231p(bigInteger);
        while (true) {
            int[] iArr = f44490a;
            if (!j34.m59234s(p, iArr)) {
                return p;
            }
            j34.m59213I(iArr, p);
        }
    }

    /* renamed from: e */
    public static void m71699e(int[] iArr, int[] iArr2) {
        hw3.m58708b(f44490a, iArr, iArr2);
    }

    /* renamed from: f */
    public static int m71700f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: g */
    public static void m71701g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k = j34.m59226k();
        j34.m59240y(iArr, iArr2, k);
        m71706l(k, iArr3);
    }

    /* renamed from: h */
    public static void m71702h(int[] iArr, int[] iArr2, int[] iArr3) {
        j34.m59207C(iArr, iArr2, iArr3);
        if (p34.m70896t(16, iArr3, f44491b)) {
            m71710p(iArr3);
        }
    }

    /* renamed from: i */
    public static void m71703i(int[] iArr, int[] iArr2) {
        if (m71700f(iArr) != 0) {
            int[] iArr3 = f44490a;
            j34.m59212H(iArr3, iArr3, iArr2);
            return;
        }
        j34.m59212H(f44490a, iArr, iArr2);
    }

    /* renamed from: j */
    public static void m71704j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 8);
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (p34.m70857A(8, iArr, f44490a) == 0);
    }

    /* renamed from: k */
    public static void m71705k(SecureRandom secureRandom, int[] iArr) {
        do {
            m71704j(secureRandom, iArr);
        } while (m71700f(iArr) != 0);
    }

    /* renamed from: l */
    public static void m71706l(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        p34.m70862F(8, iArr, 8, i, iArr2, 0);
        int i2 = iArr2[7];
        iArr2[7] = (i2 & Integer.MAX_VALUE) + p34.m70883g(7, ((j34.m59208D(19, iArr, iArr2) << 1) + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (j34.m59234s(iArr2, f44490a)) {
            m71711q(iArr2);
        }
    }

    /* renamed from: m */
    public static void m71707m(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + p34.m70883g(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (j34.m59234s(iArr, f44490a)) {
            m71711q(iArr);
        }
    }

    /* renamed from: n */
    public static void m71708n(int[] iArr, int[] iArr2) {
        int[] k = j34.m59226k();
        j34.m59210F(iArr, k);
        m71706l(k, iArr2);
    }

    /* renamed from: o */
    public static void m71709o(int[] iArr, int i, int[] iArr2) {
        int[] k = j34.m59226k();
        j34.m59210F(iArr, k);
        while (true) {
            m71706l(k, iArr2);
            i--;
            if (i > 0) {
                j34.m59210F(iArr2, k);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public static int m71710p(int[] iArr) {
        int[] iArr2 = f44491b;
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) p34.m70889m(8, iArr, 1);
        }
        long j3 = j2 + (((long) iArr[8]) & 4294967295L) + 19;
        iArr[8] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            j4 = (long) p34.m70899w(15, iArr, 9);
        }
        long j5 = j4 + ((((long) iArr[15]) & 4294967295L) - (4294967295L & ((long) (iArr2[15] + 1))));
        iArr[15] = (int) j5;
        return (int) (j5 >> 32);
    }

    /* renamed from: q */
    public static int m71711q(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) p34.m70899w(7, iArr, 1);
        }
        long j3 = j2 + ((4294967295L & ((long) iArr[7])) - 2147483648L);
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    /* renamed from: r */
    public static void m71712r(int[] iArr, int[] iArr2, int[] iArr3) {
        if (j34.m59212H(iArr, iArr2, iArr3) != 0) {
            m71697c(iArr3);
        }
    }

    /* renamed from: s */
    public static void m71713s(int[] iArr, int[] iArr2) {
        p34.m70863G(8, iArr, 0, iArr2);
        if (j34.m59234s(iArr2, f44490a)) {
            m71711q(iArr2);
        }
    }
}
