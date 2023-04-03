package p000;

/* renamed from: af4 */
/* compiled from: ObjectHelper */
public final class af4 {

    /* renamed from: a */
    public static final e10<Object, Object> f20938a = new C3814a();

    /* renamed from: af4$a */
    /* compiled from: ObjectHelper */
    public static final class C3814a implements e10<Object, Object> {
        /* renamed from: a */
        public boolean mo28956a(Object obj, Object obj2) {
            return af4.m31827c(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m31825a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m31826b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static boolean m31827c(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static <T> T m31828d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static int m31829e(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
