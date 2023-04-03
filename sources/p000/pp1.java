package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pp1 */
/* compiled from: EncoderRegistry */
public class pp1 {

    /* renamed from: a */
    public final List<C3096a<?>> f16600a = new ArrayList();

    /* renamed from: pp1$a */
    /* compiled from: EncoderRegistry */
    public static final class C3096a<T> {

        /* renamed from: a */
        public final Class<T> f16601a;

        /* renamed from: b */
        public final np1<T> f16602b;

        public C3096a(Class<T> cls, np1<T> np1) {
            this.f16601a = cls;
            this.f16602b = np1;
        }

        /* renamed from: a */
        public boolean mo24756a(Class<?> cls) {
            return this.f16601a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo24754a(Class<T> cls, np1<T> np1) {
        this.f16600a.add(new C3096a(cls, np1));
    }

    /* renamed from: b */
    public synchronized <T> np1<T> mo24755b(Class<T> cls) {
        for (C3096a next : this.f16600a) {
            if (next.mo24756a(cls)) {
                return next.f16602b;
            }
        }
        return null;
    }
}
