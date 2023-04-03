package p000;

/* renamed from: kf4 */
/* compiled from: Objects */
public final class kf4 {
    /* renamed from: a */
    public static int m47053a(int i, int i2) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(String.format("Index %d out-of-bounds for length %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: b */
    public static boolean m47054b(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m47055c(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m47056d(Object obj) {
        return obj != null;
    }

    /* renamed from: e */
    public static <T> T m47057e(T t) {
        t.getClass();
        return t;
    }
}
