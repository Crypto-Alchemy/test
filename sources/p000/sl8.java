package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: sl8 */
public final class sl8 {

    /* renamed from: c */
    public static final sl8 f33931c = new sl8();

    /* renamed from: a */
    public final km8 f33932a;

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, hm8<?>> f33933b = new ConcurrentHashMap();

    public sl8() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        km8 km8 = null;
        for (int i = 0; i <= 0; i++) {
            km8 = m51830c(strArr[0]);
            if (km8 != null) {
                break;
            }
        }
        this.f33932a = km8 == null ? new si8() : km8;
    }

    /* renamed from: a */
    public static sl8 m51829a() {
        return f33931c;
    }

    /* renamed from: c */
    public static km8 m51830c(String str) {
        try {
            return (km8) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final <T> hm8<T> mo47813b(Class<T> cls) {
        vf8.m53379e(cls, "messageType");
        hm8<T> hm8 = this.f33933b.get(cls);
        if (hm8 != null) {
            return hm8;
        }
        hm8<T> a = this.f33932a.mo44844a(cls);
        vf8.m53379e(cls, "messageType");
        vf8.m53379e(a, "schema");
        hm8<T> putIfAbsent = this.f33933b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: d */
    public final <T> hm8<T> mo47814d(T t) {
        return mo47813b(t.getClass());
    }
}
