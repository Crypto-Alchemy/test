package p000;

/* renamed from: w95 */
/* compiled from: ReflectJavaClassFinder.kt */
public final class w95 {
    /* renamed from: a */
    public static final Class<?> m73523a(ClassLoader classLoader, String str) {
        vx2.m53591g(classLoader, "<this>");
        vx2.m53591g(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
