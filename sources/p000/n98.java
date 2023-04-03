package p000;

/* renamed from: n98 */
public final class n98 {

    /* renamed from: a */
    public static final Class<?> f32014a = m48704a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f32015b = (m48704a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    public static <T> Class<T> m48704a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m48705b() {
        return f32014a != null && !f32015b;
    }

    /* renamed from: c */
    public static Class<?> m48706c() {
        return f32014a;
    }
}
