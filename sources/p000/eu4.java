package p000;

/* renamed from: eu4 */
/* compiled from: Preconditions */
public final class eu4 {
    /* renamed from: a */
    public static void m44085a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m44086b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m44087c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m44088d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
