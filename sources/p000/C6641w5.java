package p000;

import java.util.Set;

/* renamed from: w5 */
/* compiled from: AbstractComponentContainer */
public abstract class C6641w5 implements xm0 {
    /* renamed from: b */
    public <T> Set<T> mo29968b(Class<T> cls) {
        return mo29967a(cls).get();
    }

    public <T> T get(Class<T> cls) {
        ly4<T> c = mo29969c(cls);
        if (c == null) {
            return null;
        }
        return c.get();
    }
}
