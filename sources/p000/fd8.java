package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fd8 */
public final class fd8 {

    /* renamed from: b */
    public static final Class<?> f28814b = m44258a();

    /* renamed from: c */
    public static final fd8 f28815c = new fd8(true);

    /* renamed from: a */
    public final Map<Object, Object> f28816a;

    public fd8() {
        this.f28816a = new HashMap();
    }

    public fd8(boolean z) {
        this.f28816a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static Class<?> m44258a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static fd8 m44259b() {
        return cd8.m32954b();
    }
}
