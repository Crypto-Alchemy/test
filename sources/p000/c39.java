package p000;

/* renamed from: c39 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class c39 {

    /* renamed from: a */
    public static final w29<?> f21598a = new z29();

    /* renamed from: b */
    public static final w29<?> f21599b;

    static {
        w29<?> w29;
        try {
            w29 = (w29) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w29 = null;
        }
        f21599b = w29;
    }

    /* renamed from: a */
    public static w29<?> m32850a() {
        return f21598a;
    }

    /* renamed from: b */
    public static w29<?> m32851b() {
        w29<?> w29 = f21599b;
        if (w29 != null) {
            return w29;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
