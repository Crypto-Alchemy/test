package p000;

/* renamed from: nu1 */
/* compiled from: exceptionUtils.kt */
public final class nu1 {
    /* renamed from: a */
    public static final boolean m70087a(Throwable th) {
        vx2.m53591g(th, "<this>");
        Class cls = th.getClass();
        while (!vx2.m53586b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m70088b(Throwable th) {
        vx2.m53591g(th, "e");
        throw th;
    }
}
