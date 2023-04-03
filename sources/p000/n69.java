package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: n69 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class n69 {

    /* renamed from: c */
    public static final n69 f31977c = new n69();

    /* renamed from: a */
    public final k79 f31978a = new l49();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, g79<?>> f31979b = new ConcurrentHashMap();

    /* renamed from: a */
    public static n69 m48643a() {
        return f31977c;
    }

    /* renamed from: b */
    public final <T> g79<T> mo46002b(Class<T> cls) {
        t19.m52049f(cls, "messageType");
        g79<T> g79 = this.f31979b.get(cls);
        if (g79 != null) {
            return g79;
        }
        g79<T> a = this.f31978a.mo44699a(cls);
        t19.m52049f(cls, "messageType");
        t19.m52049f(a, "schema");
        g79<T> putIfAbsent = this.f31979b.putIfAbsent(cls, a);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return a;
    }

    /* renamed from: c */
    public final <T> g79<T> mo46003c(T t) {
        return mo46002b(t.getClass());
    }
}
