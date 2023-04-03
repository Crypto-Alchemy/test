package p000;

import com.google.protobuf.C4999m;
import com.google.protobuf.C5001n;

/* renamed from: yx1 */
/* compiled from: ExtensionSchemas */
public final class yx1 {

    /* renamed from: a */
    public static final C4999m<?> f35937a = new C5001n();

    /* renamed from: b */
    public static final C4999m<?> f35938b = m54890c();

    /* renamed from: a */
    public static C4999m<?> m54888a() {
        C4999m<?> mVar = f35938b;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C4999m<?> m54889b() {
        return f35937a;
    }

    /* renamed from: c */
    public static C4999m<?> m54890c() {
        try {
            return (C4999m) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
