package p000;

/* renamed from: bh */
/* compiled from: Android */
public final class C3894bh {

    /* renamed from: a */
    public static boolean f21301a;

    /* renamed from: b */
    public static final Class<?> f21302b = m32520a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f21303c;

    static {
        boolean z;
        if (f21301a || m32520a("org.robolectric.Robolectric") == null) {
            z = false;
        } else {
            z = true;
        }
        f21303c = z;
    }

    /* renamed from: a */
    public static <T> Class<T> m32520a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m32521b() {
        return f21302b;
    }

    /* renamed from: c */
    public static boolean m32522c() {
        if (f21301a || (f21302b != null && !f21303c)) {
            return true;
        }
        return false;
    }
}
