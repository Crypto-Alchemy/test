package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eo5 */
public class eo5 {

    /* renamed from: a */
    public static final int[] f37577a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f37578b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f37579c = {-1, -1073741826, -1, -1, -1, 1, 1};

    /* renamed from: a */
    public static void m57411a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g34.m58017a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && g34.m58025i(iArr3, f37577a))) {
            p34.m70883g(5, CellBase.GROUP_ID_END_USER, iArr3);
        }
    }

    /* renamed from: b */
    public static void m57412b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && g34.m58025i(iArr2, f37577a))) {
            p34.m70883g(5, CellBase.GROUP_ID_END_USER, iArr2);
        }
    }

    /* renamed from: c */
    public static int[] m57413c(BigInteger bigInteger) {
        int[] g = g34.m58023g(bigInteger);
        if (g[4] == -1) {
            int[] iArr = f37577a;
            if (g34.m58025i(g, iArr)) {
                g34.m58036t(iArr, g);
            }
        }
        return g;
    }

    /* renamed from: d */
    public static void m57414d(int[] iArr, int[] iArr2) {
        hw3.m58708b(f37577a, iArr, iArr2);
    }

    /* renamed from: e */
    public static int m57415e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: f */
    public static void m57416f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e = g34.m58021e();
        g34.m58028l(iArr, iArr2, e);
        m57421k(e, iArr3);
    }

    /* renamed from: g */
    public static void m57417g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g34.m58032p(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && p34.m70896t(10, iArr3, f37578b))) {
            int[] iArr4 = f37579c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(10, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: h */
    public static void m57418h(int[] iArr, int[] iArr2) {
        if (m57415e(iArr) != 0) {
            int[] iArr3 = f37577a;
            g34.m58035s(iArr3, iArr3, iArr2);
            return;
        }
        g34.m58035s(f37577a, iArr, iArr2);
    }

    /* renamed from: i */
    public static void m57419i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 5);
        } while (p34.m70857A(5, iArr, f37577a) == 0);
    }

    /* renamed from: j */
    public static void m57420j(SecureRandom secureRandom, int[] iArr) {
        do {
            m57419i(secureRandom, iArr);
        } while (m57415e(iArr) != 0);
    }

    /* renamed from: k */
    public static void m57421k(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31) + 0;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31);
        iArr3[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31);
        iArr3[4] = (int) j10;
        m57422l((int) (j10 >>> 32), iArr3);
    }

    /* renamed from: l */
    public static void m57422l(int i, int[] iArr) {
        if ((i != 0 && g34.m58033q(CellBase.GROUP_ID_END_USER, i, iArr, 0) != 0) || (iArr[4] == -1 && g34.m58025i(iArr, f37577a))) {
            p34.m70883g(5, CellBase.GROUP_ID_END_USER, iArr);
        }
    }

    /* renamed from: m */
    public static void m57423m(int[] iArr, int[] iArr2) {
        int[] e = g34.m58021e();
        g34.m58034r(iArr, e);
        m57421k(e, iArr2);
    }

    /* renamed from: n */
    public static void m57424n(int[] iArr, int i, int[] iArr2) {
        int[] e = g34.m58021e();
        g34.m58034r(iArr, e);
        while (true) {
            m57421k(e, iArr2);
            i--;
            if (i > 0) {
                g34.m58034r(iArr2, e);
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    public static void m57425o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g34.m58035s(iArr, iArr2, iArr3) != 0) {
            p34.m70873Q(5, CellBase.GROUP_ID_END_USER, iArr3);
        }
    }

    /* renamed from: p */
    public static void m57426p(int[] iArr, int[] iArr2) {
        if (p34.m70863G(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && g34.m58025i(iArr2, f37577a))) {
            p34.m70883g(5, CellBase.GROUP_ID_END_USER, iArr2);
        }
    }
}
