package p000;

import java.math.BigInteger;

/* renamed from: o34 */
public abstract class o34 {
    /* renamed from: a */
    public static void m70125a(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2 + 0] = jArr[i + 0];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
        jArr2[i2 + 3] = jArr[i + 3];
        jArr2[i2 + 4] = jArr[i + 4];
        jArr2[i2 + 5] = jArr[i + 5];
        jArr2[i2 + 6] = jArr[i + 6];
        jArr2[i2 + 7] = jArr[i + 7];
        jArr2[i2 + 8] = jArr[i + 8];
    }

    /* renamed from: b */
    public static void m70126b(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
        jArr2[8] = jArr[8];
    }

    /* renamed from: c */
    public static long[] m70127c() {
        return new long[9];
    }

    /* renamed from: d */
    public static long[] m70128d() {
        return new long[18];
    }

    /* renamed from: e */
    public static boolean m70129e(long[] jArr, long[] jArr2) {
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m70130f(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m70131g(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static BigInteger m70132h(long[] jArr) {
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                ek4.m57392l(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
