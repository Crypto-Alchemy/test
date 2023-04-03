package p000;

import com.google.crypto.tink.shaded.protobuf.C4724g0;

/* renamed from: j64 */
/* compiled from: NewInstanceSchemas */
public final class j64 {

    /* renamed from: a */
    public static final h64 f30229a = m46159c();

    /* renamed from: b */
    public static final h64 f30230b = new C4724g0();

    /* renamed from: a */
    public static h64 m46157a() {
        return f30229a;
    }

    /* renamed from: b */
    public static h64 m46158b() {
        return f30230b;
    }

    /* renamed from: c */
    public static h64 m46159c() {
        try {
            return (h64) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
