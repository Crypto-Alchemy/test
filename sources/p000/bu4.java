package p000;

/* renamed from: bu4 */
/* compiled from: Preconditions */
public final class bu4 {
    /* renamed from: a */
    public static <T> void m32725a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m32726b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m32727c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
