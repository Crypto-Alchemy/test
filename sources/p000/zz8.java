package p000;

import com.google.android.gms.internal.vision.C4099c0;

/* renamed from: zz8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zz8 {

    /* renamed from: a */
    public static final wz8<?> f36325a = new C4099c0();

    /* renamed from: b */
    public static final wz8<?> f36326b = m55319c();

    /* renamed from: a */
    public static wz8<?> m55317a() {
        return f36325a;
    }

    /* renamed from: b */
    public static wz8<?> m55318b() {
        wz8<?> wz8 = f36326b;
        if (wz8 != null) {
            return wz8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    public static wz8<?> m55319c() {
        try {
            return (wz8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
