package p000;

import com.google.crypto.tink.shaded.protobuf.C4701a0;
import com.google.crypto.tink.shaded.protobuf.C4703b0;

/* renamed from: sn3 */
/* compiled from: MapFieldSchemas */
public final class sn3 {

    /* renamed from: a */
    public static final C4701a0 f33972a = m51872c();

    /* renamed from: b */
    public static final C4701a0 f33973b = new C4703b0();

    /* renamed from: a */
    public static C4701a0 m51870a() {
        return f33972a;
    }

    /* renamed from: b */
    public static C4701a0 m51871b() {
        return f33973b;
    }

    /* renamed from: c */
    public static C4701a0 m51872c() {
        try {
            return (C4701a0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
