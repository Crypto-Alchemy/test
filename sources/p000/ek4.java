package p000;

/* renamed from: ek4 */
public abstract class ek4 {
    /* renamed from: a */
    public static int m57381a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    /* renamed from: b */
    public static long m57382b(byte[] bArr, int i) {
        int a = m57381a(bArr, i);
        return (((long) m57381a(bArr, i + 4)) & 4294967295L) | ((((long) a) & 4294967295L) << 32);
    }

    /* renamed from: c */
    public static void m57383c(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* renamed from: d */
    public static void m57384d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: e */
    public static void m57385e(int[] iArr, byte[] bArr, int i) {
        for (int d : iArr) {
            m57384d(d, bArr, i);
            i += 4;
        }
    }

    /* renamed from: f */
    public static int m57386f(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: g */
    public static void m57387g(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m57386f(bArr, i);
            i += 4;
        }
    }

    /* renamed from: h */
    public static void m57388h(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = m57386f(bArr, i);
            i += 4;
        }
    }

    /* renamed from: i */
    public static int[] m57389i(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = m57386f(bArr, i);
            i += 4;
        }
        return iArr;
    }

    /* renamed from: j */
    public static long m57390j(byte[] bArr, int i) {
        return ((((long) m57386f(bArr, i + 4)) & 4294967295L) << 32) | (((long) m57386f(bArr, i)) & 4294967295L);
    }

    /* renamed from: k */
    public static short m57391k(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: l */
    public static void m57392l(long j, byte[] bArr, int i) {
        m57383c((int) (j >>> 32), bArr, i);
        m57383c((int) (j & 4294967295L), bArr, i + 4);
    }

    /* renamed from: m */
    public static void m57393m(long j, byte[] bArr, int i) {
        m57384d((int) (4294967295L & j), bArr, i);
        m57384d((int) (j >>> 32), bArr, i + 4);
    }

    /* renamed from: n */
    public static void m57394n(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            m57393m(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    /* renamed from: o */
    public static byte[] m57395o(long j) {
        byte[] bArr = new byte[8];
        m57393m(j, bArr, 0);
        return bArr;
    }

    /* renamed from: p */
    public static void m57396p(short s, byte[] bArr, int i) {
        bArr[i] = (byte) (s >>> 8);
        bArr[i + 1] = (byte) s;
    }

    /* renamed from: q */
    public static void m57397q(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }
}
