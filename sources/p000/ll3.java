package p000;

/* renamed from: ll3 */
/* compiled from: Longs */
public final class ll3 {
    /* renamed from: a */
    public static int m47833a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m47834b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static long m47835c(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        du4.m43684d(z);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }
}
