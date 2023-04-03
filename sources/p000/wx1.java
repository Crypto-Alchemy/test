package p000;

import com.google.protobuf.C4987l;

/* renamed from: wx1 */
/* compiled from: ExtensionRegistryFactory */
public final class wx1 {

    /* renamed from: a */
    public static final Class<?> f35464a = m54100c();

    /* renamed from: a */
    public static C4987l m54098a() {
        C4987l b = m54099b("getEmptyRegistry");
        if (b != null) {
            return b;
        }
        return C4987l.f25702d;
    }

    /* renamed from: b */
    public static final C4987l m54099b(String str) {
        Class<?> cls = f35464a;
        if (cls == null) {
            return null;
        }
        try {
            return (C4987l) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class<?> m54100c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
