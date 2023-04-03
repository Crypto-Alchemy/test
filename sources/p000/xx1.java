package p000;

import com.google.crypto.tink.shaded.protobuf.C4734l;

/* renamed from: xx1 */
/* compiled from: ExtensionRegistryFactory */
public final class xx1 {

    /* renamed from: a */
    public static final Class<?> f35716a = m54586c();

    /* renamed from: a */
    public static C4734l m54584a() {
        C4734l b = m54585b("getEmptyRegistry");
        if (b != null) {
            return b;
        }
        return C4734l.f25246d;
    }

    /* renamed from: b */
    public static final C4734l m54585b(String str) {
        Class<?> cls = f35716a;
        if (cls == null) {
            return null;
        }
        try {
            return (C4734l) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class<?> m54586c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
