package p000;

/* renamed from: pp6 */
/* compiled from: Throwables */
public final class pp6 {
    /* renamed from: a */
    public static RuntimeException m25127a(Throwable th) {
        m25129c((Throwable) au4.m10792g(th));
        throw new RuntimeException(th);
    }

    /* renamed from: b */
    public static <X extends Throwable> void m25128b(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: c */
    public static void m25129c(Throwable th) {
        m25128b(th, Error.class);
        m25128b(th, RuntimeException.class);
    }
}
