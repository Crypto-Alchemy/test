package p000;

/* renamed from: n32 */
/* compiled from: FixedSampleSizeRechunker */
public final class n32 {

    /* renamed from: n32$b */
    /* compiled from: FixedSampleSizeRechunker */
    public static final class C2863b {

        /* renamed from: a */
        public final long[] f15318a;

        /* renamed from: b */
        public final int[] f15319b;

        /* renamed from: c */
        public final int f15320c;

        /* renamed from: d */
        public final long[] f15321d;

        /* renamed from: e */
        public final int[] f15322e;

        /* renamed from: f */
        public final long f15323f;

        public C2863b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f15318a = jArr;
            this.f15319b = iArr;
            this.f15320c = i;
            this.f15321d = jArr2;
            this.f15322e = iArr2;
            this.f15323f = j;
        }
    }

    /* renamed from: a */
    public static C2863b m22778a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int l : iArr2) {
            i3 += w67.m29364l(l, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                int i9 = i * min;
                iArr3[i5] = i9;
                i6 = Math.max(i6, i9);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new C2863b(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
    }
}
