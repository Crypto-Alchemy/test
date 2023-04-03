package p000;

/* renamed from: td5 */
/* compiled from: RepeatModeUtil */
public final class td5 {
    /* renamed from: a */
    public static int m27677a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m27678b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m27678b(int i, int i2) {
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return (i2 & 1) != 0;
        }
        if (i != 2) {
            return false;
        }
        return (i2 & 2) != 0;
    }
}
