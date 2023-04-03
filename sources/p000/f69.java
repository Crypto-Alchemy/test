package p000;

import com.google.android.gms.internal.vision.C4120h0;

/* renamed from: f69 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class f69 {

    /* renamed from: a */
    public static final z59 f28772a = m44208c();

    /* renamed from: b */
    public static final z59 f28773b = new C4120h0();

    /* renamed from: a */
    public static z59 m44206a() {
        return f28772a;
    }

    /* renamed from: b */
    public static z59 m44207b() {
        return f28773b;
    }

    /* renamed from: c */
    public static z59 m44208c() {
        try {
            return (z59) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
