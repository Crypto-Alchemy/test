package p000;

/* renamed from: cd8 */
public final class cd8 {

    /* renamed from: a */
    public static final Class<?> f21695a = m32953a();

    /* renamed from: a */
    public static Class<?> m32953a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static fd8 m32954b() {
        Class<?> cls = f21695a;
        if (cls != null) {
            try {
                return (fd8) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return fd8.f28815c;
    }
}
