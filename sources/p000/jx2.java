package p000;

/* renamed from: jx2 */
public class jx2 {
    /* renamed from: a */
    public static long m59600a(int i) {
        int a = d30.m56727a(d30.m56727a(d30.m56727a(d30.m56727a(i, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return ((((long) (a >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) a));
    }

    /* renamed from: b */
    public static void m59601b(long j, long[] jArr, int i) {
        long b = d30.m56728b(d30.m56728b(d30.m56728b(d30.m56728b(d30.m56728b(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = b & 6148914691236517205L;
        jArr[i + 1] = (b >>> 1) & 6148914691236517205L;
    }

    /* renamed from: c */
    public static void m59602c(long[] jArr, int i, int i2, long[] jArr2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            m59601b(jArr[i + i4], jArr2, i3);
            i3 += 2;
        }
    }

    /* renamed from: d */
    public static int m59603d(int i) {
        int i2 = i & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }

    /* renamed from: e */
    public static int m59604e(int i) {
        return d30.m56727a(d30.m56727a(d30.m56727a(d30.m56727a(i, 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
    }

    /* renamed from: f */
    public static long m59605f(long j) {
        return d30.m56728b(d30.m56728b(d30.m56728b(d30.m56728b(d30.m56728b(j, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }
}
