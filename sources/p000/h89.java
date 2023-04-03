package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: h89 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class h89 {

    /* renamed from: c */
    public static final h89 f29463c = new h89();

    /* renamed from: a */
    public final p89 f29464a = new d79();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, n89<?>> f29465b = new ConcurrentHashMap();

    /* renamed from: a */
    public static h89 m45067a() {
        return f29463c;
    }

    /* renamed from: b */
    public final <T> n89<T> mo43106b(Class<T> cls) {
        p59.m49797b(cls, "messageType");
        n89<T> n89 = this.f29465b.get(cls);
        if (n89 == null) {
            n89 = this.f29464a.mo41858a(cls);
            p59.m49797b(cls, "messageType");
            p59.m49797b(n89, "schema");
            n89<T> putIfAbsent = this.f29465b.putIfAbsent(cls, n89);
            if (putIfAbsent == null) {
                return n89;
            }
            return putIfAbsent;
        }
        return n89;
    }
}
