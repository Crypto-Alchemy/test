package p000;

/* renamed from: d30 */
public abstract class d30 {
    /* renamed from: a */
    public static int m56727a(int i, int i2, int i3) {
        int i4 = i2 & ((i >>> i3) ^ i);
        return i ^ (i4 ^ (i4 << i3));
    }

    /* renamed from: b */
    public static long m56728b(long j, long j2, int i) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }
}
