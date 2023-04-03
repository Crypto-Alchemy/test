package p000;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cg5 */
/* compiled from: RestrictedComponentContainer */
public final class cg5 extends C6641w5 {

    /* renamed from: a */
    public final Set<Class<?>> f21737a;

    /* renamed from: b */
    public final Set<Class<?>> f21738b;

    /* renamed from: c */
    public final Set<Class<?>> f21739c;

    /* renamed from: d */
    public final Set<Class<?>> f21740d;

    /* renamed from: e */
    public final Set<Class<?>> f21741e;

    /* renamed from: f */
    public final Set<Class<?>> f21742f;

    /* renamed from: g */
    public final xm0 f21743g;

    /* renamed from: cg5$a */
    /* compiled from: RestrictedComponentContainer */
    public static class C3937a implements wy4 {

        /* renamed from: a */
        public final Set<Class<?>> f21744a;

        /* renamed from: b */
        public final wy4 f21745b;

        public C3937a(Set<Class<?>> set, wy4 wy4) {
            this.f21744a = set;
            this.f21745b = wy4;
        }
    }

    public cg5(sm0<?> sm0, xm0 xm0) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (ic1 next : sm0.mo47815e()) {
            if (next.mo43544e()) {
                if (next.mo43547g()) {
                    hashSet4.add(next.mo43542c());
                } else {
                    hashSet.add(next.mo43542c());
                }
            } else if (next.mo43543d()) {
                hashSet3.add(next.mo43542c());
            } else if (next.mo43547g()) {
                hashSet5.add(next.mo43542c());
            } else {
                hashSet2.add(next.mo43542c());
            }
        }
        if (!sm0.mo47818h().isEmpty()) {
            hashSet.add(wy4.class);
        }
        this.f21737a = Collections.unmodifiableSet(hashSet);
        this.f21738b = Collections.unmodifiableSet(hashSet2);
        this.f21739c = Collections.unmodifiableSet(hashSet3);
        this.f21740d = Collections.unmodifiableSet(hashSet4);
        this.f21741e = Collections.unmodifiableSet(hashSet5);
        this.f21742f = sm0.mo47818h();
        this.f21743g = xm0;
    }

    /* renamed from: a */
    public <T> ly4<Set<T>> mo29967a(Class<T> cls) {
        if (this.f21741e.contains(cls)) {
            return this.f21743g.mo29967a(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> Set<T> mo29968b(Class<T> cls) {
        if (this.f21740d.contains(cls)) {
            return this.f21743g.mo29968b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> ly4<T> mo29969c(Class<T> cls) {
        if (this.f21738b.contains(cls)) {
            return this.f21743g.mo29969c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> ya1<T> mo29970d(Class<T> cls) {
        if (this.f21739c.contains(cls)) {
            return this.f21743g.mo29970d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }

    public <T> T get(Class<T> cls) {
        if (this.f21737a.contains(cls)) {
            T t = this.f21743g.get(cls);
            if (!cls.equals(wy4.class)) {
                return t;
            }
            return new C3937a(this.f21742f, (wy4) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }
}
