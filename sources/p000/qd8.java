package p000;

import com.google.android.gms.internal.clearcut.C4054c;

/* renamed from: qd8 */
public final class qd8 {

    /* renamed from: a */
    public static final id8<?> f33065a = new C4054c();

    /* renamed from: b */
    public static final id8<?> f33066b = m50525a();

    /* renamed from: a */
    public static id8<?> m50525a() {
        try {
            return (id8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static id8<?> m50526b() {
        return f33065a;
    }

    /* renamed from: c */
    public static id8<?> m50527c() {
        id8<?> id8 = f33066b;
        if (id8 != null) {
            return id8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
