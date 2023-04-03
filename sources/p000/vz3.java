package p000;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.mw3;

/* renamed from: vz3 */
/* compiled from: MultiModelLoaderFactory */
public class vz3 {

    /* renamed from: e */
    public static final C3518c f18946e = new C3518c();

    /* renamed from: f */
    public static final mw3<Object, Object> f18947f = new C3516a();

    /* renamed from: a */
    public final List<C3517b<?, ?>> f18948a;

    /* renamed from: b */
    public final C3518c f18949b;

    /* renamed from: c */
    public final Set<C3517b<?, ?>> f18950c;

    /* renamed from: d */
    public final ys4<List<Throwable>> f18951d;

    /* renamed from: vz3$a */
    /* compiled from: MultiModelLoaderFactory */
    public static class C3516a implements mw3<Object, Object> {
        /* renamed from: a */
        public boolean mo11933a(Object obj) {
            return false;
        }

        /* renamed from: b */
        public mw3.C2853a<Object> mo11934b(Object obj, int i, int i2, xi4 xi4) {
            return null;
        }
    }

    /* renamed from: vz3$b */
    /* compiled from: MultiModelLoaderFactory */
    public static class C3517b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f18952a;

        /* renamed from: b */
        public final Class<Data> f18953b;

        /* renamed from: c */
        public final nw3<? extends Model, ? extends Data> f18954c;

        public C3517b(Class<Model> cls, Class<Data> cls2, nw3<? extends Model, ? extends Data> nw3) {
            this.f18952a = cls;
            this.f18953b = cls2;
            this.f18954c = nw3;
        }

        /* renamed from: a */
        public boolean mo27403a(Class<?> cls) {
            return this.f18952a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo27404b(Class<?> cls, Class<?> cls2) {
            if (!mo27403a(cls) || !this.f18953b.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: vz3$c */
    /* compiled from: MultiModelLoaderFactory */
    public static class C3518c {
        /* renamed from: a */
        public <Model, Data> uz3<Model, Data> mo27405a(List<mw3<Model, Data>> list, ys4<List<Throwable>> ys4) {
            return new uz3<>(list, ys4);
        }
    }

    public vz3(ys4<List<Throwable>> ys4) {
        this(ys4, f18946e);
    }

    /* renamed from: f */
    public static <Model, Data> mw3<Model, Data> m29192f() {
        return f18947f;
    }

    /* renamed from: a */
    public final <Model, Data> void mo27394a(Class<Model> cls, Class<Data> cls2, nw3<? extends Model, ? extends Data> nw3, boolean z) {
        int i;
        C3517b bVar = new C3517b(cls, cls2, nw3);
        List<C3517b<?, ?>> list = this.f18948a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, bVar);
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo27395b(Class<Model> cls, Class<Data> cls2, nw3<? extends Model, ? extends Data> nw3) {
        mo27394a(cls, cls2, nw3, true);
    }

    /* renamed from: c */
    public final <Model, Data> mw3<Model, Data> mo27396c(C3517b<?, ?> bVar) {
        return (mw3) zt4.m31500d(bVar.f18954c.mo11938c(this));
    }

    /* renamed from: d */
    public synchronized <Model, Data> mw3<Model, Data> mo27397d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C3517b next : this.f18948a) {
                if (this.f18950c.contains(next)) {
                    z = true;
                } else if (next.mo27404b(cls, cls2)) {
                    this.f18950c.add(next);
                    arrayList.add(mo27396c(next));
                    this.f18950c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f18949b.mo27405a(arrayList, this.f18951d);
            } else if (arrayList.size() == 1) {
                return (mw3) arrayList.get(0);
            } else if (z) {
                return m29192f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f18950c.clear();
            throw th;
        }
    }

    /* renamed from: e */
    public synchronized <Model> List<mw3<Model, ?>> mo27398e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C3517b next : this.f18948a) {
                if (!this.f18950c.contains(next)) {
                    if (next.mo27403a(cls)) {
                        this.f18950c.add(next);
                        arrayList.add(mo27396c(next));
                        this.f18950c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f18950c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: g */
    public synchronized List<Class<?>> mo27399g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C3517b next : this.f18948a) {
            if (!arrayList.contains(next.f18953b) && next.mo27403a(cls)) {
                arrayList.add(next.f18953b);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final <Model, Data> nw3<Model, Data> mo27400h(C3517b<?, ?> bVar) {
        return bVar.f18954c;
    }

    /* renamed from: i */
    public synchronized <Model, Data> List<nw3<? extends Model, ? extends Data>> mo27401i(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<C3517b<?, ?>> it = this.f18948a.iterator();
        while (it.hasNext()) {
            C3517b next = it.next();
            if (next.mo27404b(cls, cls2)) {
                it.remove();
                arrayList.add(mo27400h(next));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public synchronized <Model, Data> List<nw3<? extends Model, ? extends Data>> mo27402j(Class<Model> cls, Class<Data> cls2, nw3<? extends Model, ? extends Data> nw3) {
        List<nw3<? extends Model, ? extends Data>> i;
        i = mo27401i(cls, cls2);
        mo27395b(cls, cls2, nw3);
        return i;
    }

    public vz3(ys4<List<Throwable>> ys4, C3518c cVar) {
        this.f18948a = new ArrayList();
        this.f18950c = new HashSet();
        this.f18951d = ys4;
        this.f18949b = cVar;
    }
}
