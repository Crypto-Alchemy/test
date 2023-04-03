package p000;

import com.google.protobuf.C4976g0;

/* renamed from: i64 */
/* compiled from: NewInstanceSchemas */
public final class i64 {

    /* renamed from: a */
    public static final g64 f29827a = m45483c();

    /* renamed from: b */
    public static final g64 f29828b = new C4976g0();

    /* renamed from: a */
    public static g64 m45481a() {
        return f29827a;
    }

    /* renamed from: b */
    public static g64 m45482b() {
        return f29828b;
    }

    /* renamed from: c */
    public static g64 m45483c() {
        try {
            return (g64) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
