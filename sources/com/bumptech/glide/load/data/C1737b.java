package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C1735a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.b */
/* compiled from: DataRewinderRegistry */
public class C1737b {

    /* renamed from: b */
    public static final C1735a.C1736a<?> f8729b = new C1738a();

    /* renamed from: a */
    public final Map<Class<?>, C1735a.C1736a<?>> f8730a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.b$a */
    /* compiled from: DataRewinderRegistry */
    public class C1738a implements C1735a.C1736a<Object> {
        /* renamed from: a */
        public Class<Object> mo12401a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: b */
        public C1735a<Object> mo12402b(Object obj) {
            return new C1739b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.b$b */
    /* compiled from: DataRewinderRegistry */
    public static final class C1739b implements C1735a<Object> {

        /* renamed from: a */
        public final Object f8731a;

        public C1739b(Object obj) {
            this.f8731a = obj;
        }

        /* renamed from: a */
        public Object mo12397a() {
            return this.f8731a;
        }

        /* renamed from: b */
        public void mo12398b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> C1735a<T> mo12404a(T t) {
        C1735a.C1736a<?> aVar;
        zt4.m31500d(t);
        aVar = this.f8730a.get(t.getClass());
        if (aVar == null) {
            Iterator<C1735a.C1736a<?>> it = this.f8730a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1735a.C1736a<?> next = it.next();
                if (next.mo12401a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f8729b;
        }
        return aVar.mo12402b(t);
    }

    /* renamed from: b */
    public synchronized void mo12405b(C1735a.C1736a<?> aVar) {
        this.f8730a.put(aVar.mo12401a(), aVar);
    }
}
