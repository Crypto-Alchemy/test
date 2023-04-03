package p000;

/* renamed from: xk3 */
/* compiled from: Logging */
public final class xk3 {
    /* renamed from: a */
    public static void m54420a(String str, String str2, Object obj) {
        m54423d(str);
        String.format(str2, new Object[]{obj});
    }

    /* renamed from: b */
    public static void m54421b(String str, String str2, Object... objArr) {
        m54423d(str);
        String.format(str2, objArr);
    }

    /* renamed from: c */
    public static void m54422c(String str, String str2, Throwable th) {
        m54423d(str);
    }

    /* renamed from: d */
    public static String m54423d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m54424e(String str, String str2) {
        m54423d(str);
    }

    /* renamed from: f */
    public static void m54425f(String str, String str2, Object obj) {
        m54423d(str);
        String.format(str2, new Object[]{obj});
    }
}
