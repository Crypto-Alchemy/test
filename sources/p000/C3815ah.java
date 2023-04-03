package p000;

/* renamed from: ah */
/* compiled from: Android */
public final class C3815ah {

    /* renamed from: a */
    public static boolean f20945a;

    /* renamed from: b */
    public static final Class<?> f20946b = m31839a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f20947c;

    static {
        boolean z;
        if (f20945a || m31839a("org.robolectric.Robolectric") == null) {
            z = false;
        } else {
            z = true;
        }
        f20947c = z;
    }

    /* renamed from: a */
    public static <T> Class<T> m31839a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m31840b() {
        return f20946b;
    }

    /* renamed from: c */
    public static boolean m31841c() {
        if (f20945a || (f20946b != null && !f20947c)) {
            return true;
        }
        return false;
    }
}
