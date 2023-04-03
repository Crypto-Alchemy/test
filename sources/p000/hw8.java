package p000;

/* renamed from: hw8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class hw8 {

    /* renamed from: a */
    public static final Class<?> f29748a = m45398a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f29749b;

    static {
        boolean z;
        if (m45398a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f29749b = z;
    }

    /* renamed from: a */
    public static <T> Class<T> m45398a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m45399b() {
        if (f29748a == null || f29749b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Class<?> m45400c() {
        return f29748a;
    }
}
