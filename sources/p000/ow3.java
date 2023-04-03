package p000;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ow3 */
/* compiled from: ModelLoaderRegistry */
public class ow3 {

    /* renamed from: a */
    public final vz3 f16166a;

    /* renamed from: b */
    public final C3002a f16167b;

    /* renamed from: ow3$a */
    /* compiled from: ModelLoaderRegistry */
    public static class C3002a {

        /* renamed from: a */
        public final Map<Class<?>, C3003a<?>> f16168a = new HashMap();

        /* renamed from: ow3$a$a */
        /* compiled from: ModelLoaderRegistry */
        public static class C3003a<Model> {

            /* renamed from: a */
            public final List<mw3<Model, ?>> f16169a;

            public C3003a(List<mw3<Model, ?>> list) {
                this.f16169a = list;
            }
        }

        /* renamed from: a */
        public void mo24198a() {
            this.f16168a.clear();
        }

        /* renamed from: b */
        public <Model> List<mw3<Model, ?>> mo24199b(Class<Model> cls) {
            C3003a aVar = this.f16168a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f16169a;
        }

        /* renamed from: c */
        public <Model> void mo24200c(Class<Model> cls, List<mw3<Model, ?>> list) {
            if (this.f16168a.put(cls, new C3003a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public ow3(ys4<List<Throwable>> ys4) {
        this(new vz3(ys4));
    }

    /* renamed from: b */
    public static <A> Class<A> m24295b(A a) {
        return a.getClass();
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo24192a(Class<Model> cls, Class<Data> cls2, nw3<? extends Model, ? extends Data> nw3) {
        this.f16166a.mo27395b(cls, cls2, nw3);
        this.f16167b.mo24198a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> mo24193c(Class<?> cls) {
        return this.f16166a.mo27399g(cls);
    }

    /* renamed from: d */
    public <A> List<mw3<A, ?>> mo24194d(A a) {
        List e = mo24195e(m24295b(a));
        if (!e.isEmpty()) {
            int size = e.size();
            List<mw3<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                mw3 mw3 = (mw3) e.get(i);
                if (mw3.mo11933a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(mw3);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a, e);
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    /* renamed from: e */
    public final synchronized <A> List<mw3<A, ?>> mo24195e(Class<A> cls) {
        List<mw3<A, ?>> b;
        b = this.f16167b.mo24199b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f16166a.mo27398e(cls));
            this.f16167b.mo24200c(cls, b);
        }
        return b;
    }

    /* renamed from: f */
    public synchronized <Model, Data> void mo24196f(Class<Model> cls, Class<Data> cls2, nw3<? extends Model, ? extends Data> nw3) {
        mo24197g(this.f16166a.mo27402j(cls, cls2, nw3));
        this.f16167b.mo24198a();
    }

    /* renamed from: g */
    public final <Model, Data> void mo24197g(List<nw3<? extends Model, ? extends Data>> list) {
        for (nw3<? extends Model, ? extends Data> a : list) {
            a.mo11937a();
        }
    }

    public ow3(vz3 vz3) {
        this.f16167b = new C3002a();
        this.f16166a = vz3;
    }
}
