package p000;

import com.google.protobuf.C4952a0;
import com.google.protobuf.C4954b0;

/* renamed from: rn3 */
/* compiled from: MapFieldSchemas */
public final class rn3 {

    /* renamed from: a */
    public static final C4952a0 f33550a = m51179c();

    /* renamed from: b */
    public static final C4952a0 f33551b = new C4954b0();

    /* renamed from: a */
    public static C4952a0 m51177a() {
        return f33550a;
    }

    /* renamed from: b */
    public static C4952a0 m51178b() {
        return f33551b;
    }

    /* renamed from: c */
    public static C4952a0 m51179c() {
        try {
            return (C4952a0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
