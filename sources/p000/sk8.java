package p000;

import com.google.android.gms.internal.clearcut.C4063g;

/* renamed from: sk8 */
public final class sk8 {

    /* renamed from: a */
    public static final nk8 f33926a = m51826c();

    /* renamed from: b */
    public static final nk8 f33927b = new C4063g();

    /* renamed from: a */
    public static nk8 m51824a() {
        return f33926a;
    }

    /* renamed from: b */
    public static nk8 m51825b() {
        return f33927b;
    }

    /* renamed from: c */
    public static nk8 m51826c() {
        try {
            return (nk8) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
