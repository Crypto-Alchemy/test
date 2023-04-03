package p000;

/* renamed from: gs4 */
public final class gs4 {
    /* renamed from: a */
    public static int m58236a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m58237b(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = m58240e(i4, i);
        }
    }

    /* renamed from: c */
    public static boolean m58238c(int i) {
        if (i == 0) {
            return false;
        }
        int a = m58236a(i) >>> 1;
        int i2 = 2;
        for (int i3 = 0; i3 < a; i3++) {
            i2 = m58239d(i2, i2, i);
            if (m58237b(i2 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static int m58239d(int i, int i2, int i3) {
        int e = m58240e(i, i3);
        int e2 = m58240e(i2, i3);
        int i4 = 0;
        if (e2 != 0) {
            int a = 1 << m58236a(i3);
            while (e != 0) {
                if (((byte) (e & 1)) == 1) {
                    i4 ^= e2;
                }
                e >>>= 1;
                e2 <<= 1;
                if (e2 >= a) {
                    e2 ^= i3;
                }
            }
        }
        return i4;
    }

    /* renamed from: e */
    public static int m58240e(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (m58236a(i) >= m58236a(i2)) {
            i ^= i2 << (m58236a(i) - m58236a(i2));
        }
        return i;
    }
}
