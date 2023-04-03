package p000;

/* renamed from: ct3 */
/* compiled from: MemoryChunkUtil */
public class ct3 {
    /* renamed from: a */
    public static int m14491a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* renamed from: b */
    public static void m14492b(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        au4.m10787b(Boolean.valueOf(z3));
        if (i + i4 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        au4.m10787b(Boolean.valueOf(z4));
        if (i3 + i4 > i2) {
            z5 = false;
        }
        au4.m10787b(Boolean.valueOf(z5));
    }
}
