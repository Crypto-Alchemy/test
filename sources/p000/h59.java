package p000;

/* renamed from: h59 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class h59 {

    /* renamed from: a */
    public static final b59 f29457a = m45051c();

    /* renamed from: b */
    public static final b59 f29458b = new y49();

    /* renamed from: a */
    public static b59 m45049a() {
        return f29457a;
    }

    /* renamed from: b */
    public static b59 m45050b() {
        return f29458b;
    }

    /* renamed from: c */
    public static b59 m45051c() {
        try {
            return (b59) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
