package p000;

/* renamed from: mj8 */
public final class mj8 {

    /* renamed from: a */
    public static final ij8 f31716a = m48327c();

    /* renamed from: b */
    public static final ij8 f31717b = new kj8();

    /* renamed from: a */
    public static ij8 m48325a() {
        return f31716a;
    }

    /* renamed from: b */
    public static ij8 m48326b() {
        return f31717b;
    }

    /* renamed from: c */
    public static ij8 m48327c() {
        try {
            return (ij8) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
