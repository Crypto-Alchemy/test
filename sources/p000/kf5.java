package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kf5 */
/* compiled from: ResourceEncoderRegistry */
public class kf5 {

    /* renamed from: a */
    public final List<C2679a<?>> f14068a = new ArrayList();

    /* renamed from: kf5$a */
    /* compiled from: ResourceEncoderRegistry */
    public static final class C2679a<T> {

        /* renamed from: a */
        public final Class<T> f14069a;

        /* renamed from: b */
        public final jf5<T> f14070b;

        public C2679a(Class<T> cls, jf5<T> jf5) {
            this.f14069a = cls;
            this.f14070b = jf5;
        }

        /* renamed from: a */
        public boolean mo22288a(Class<?> cls) {
            return this.f14069a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo22286a(Class<Z> cls, jf5<Z> jf5) {
        this.f14068a.add(new C2679a(cls, jf5));
    }

    /* renamed from: b */
    public synchronized <Z> jf5<Z> mo22287b(Class<Z> cls) {
        int size = this.f14068a.size();
        for (int i = 0; i < size; i++) {
            C2679a aVar = this.f14068a.get(i);
            if (aVar.mo22288a(cls)) {
                return aVar.f14070b;
            }
        }
        return null;
    }
}
