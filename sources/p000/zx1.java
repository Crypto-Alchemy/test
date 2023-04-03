package p000;

import com.google.crypto.tink.shaded.protobuf.C4746m;
import com.google.crypto.tink.shaded.protobuf.C4748n;

/* renamed from: zx1 */
/* compiled from: ExtensionSchemas */
public final class zx1 {

    /* renamed from: a */
    public static final C4746m<?> f36290a = new C4748n();

    /* renamed from: b */
    public static final C4746m<?> f36291b = m55286c();

    /* renamed from: a */
    public static C4746m<?> m55284a() {
        C4746m<?> mVar = f36291b;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C4746m<?> m55285b() {
        return f36290a;
    }

    /* renamed from: c */
    public static C4746m<?> m55286c() {
        try {
            return (C4746m) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
