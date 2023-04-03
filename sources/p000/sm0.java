package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: sm0 */
/* compiled from: Component */
public final class sm0<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f33934a;

    /* renamed from: b */
    public final Set<ic1> f33935b;

    /* renamed from: c */
    public final int f33936c;

    /* renamed from: d */
    public final int f33937d;

    /* renamed from: e */
    public final cn0<T> f33938e;

    /* renamed from: f */
    public final Set<Class<?>> f33939f;

    /* renamed from: sm0$b */
    /* compiled from: Component */
    public static class C6489b<T> {

        /* renamed from: a */
        public final Set<Class<? super T>> f33940a;

        /* renamed from: b */
        public final Set<ic1> f33941b;

        /* renamed from: c */
        public int f33942c;

        /* renamed from: d */
        public int f33943d;

        /* renamed from: e */
        public cn0<T> f33944e;

        /* renamed from: f */
        public Set<Class<?>> f33945f;

        /* renamed from: b */
        public C6489b<T> mo47823b(ic1 ic1) {
            eu4.m44087c(ic1, "Null dependency");
            mo47830i(ic1.mo43542c());
            this.f33941b.add(ic1);
            return this;
        }

        /* renamed from: c */
        public C6489b<T> mo47824c() {
            return mo47829h(1);
        }

        /* renamed from: d */
        public sm0<T> mo47825d() {
            boolean z;
            if (this.f33944e != null) {
                z = true;
            } else {
                z = false;
            }
            eu4.m44088d(z, "Missing required property: factory.");
            return new sm0(new HashSet(this.f33940a), new HashSet(this.f33941b), this.f33942c, this.f33943d, this.f33944e, this.f33945f);
        }

        /* renamed from: e */
        public C6489b<T> mo47826e() {
            return mo47829h(2);
        }

        /* renamed from: f */
        public C6489b<T> mo47827f(cn0<T> cn0) {
            this.f33944e = (cn0) eu4.m44087c(cn0, "Null factory");
            return this;
        }

        /* renamed from: g */
        public final C6489b<T> mo47828g() {
            this.f33943d = 1;
            return this;
        }

        /* renamed from: h */
        public final C6489b<T> mo47829h(int i) {
            boolean z;
            if (this.f33942c == 0) {
                z = true;
            } else {
                z = false;
            }
            eu4.m44088d(z, "Instantiation type has already been set.");
            this.f33942c = i;
            return this;
        }

        /* renamed from: i */
        public final void mo47830i(Class<?> cls) {
            eu4.m44085a(!this.f33940a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public C6489b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f33940a = hashSet;
            this.f33941b = new HashSet();
            this.f33942c = 0;
            this.f33943d = 0;
            this.f33945f = new HashSet();
            eu4.m44087c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c : clsArr) {
                eu4.m44087c(c, "Null interface");
            }
            Collections.addAll(this.f33940a, clsArr);
        }
    }

    /* renamed from: c */
    public static <T> C6489b<T> m51835c(Class<T> cls) {
        return new C6489b<>(cls, new Class[0]);
    }

    /* renamed from: d */
    public static <T> C6489b<T> m51836d(Class<T> cls, Class<? super T>... clsArr) {
        return new C6489b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> sm0<T> m51837i(T t, Class<T> cls) {
        return m51838j(cls).mo47827f(new rm0(t)).mo47825d();
    }

    /* renamed from: j */
    public static <T> C6489b<T> m51838j(Class<T> cls) {
        return m51835c(cls).mo47828g();
    }

    /* renamed from: n */
    public static /* synthetic */ Object m51839n(Object obj, xm0 xm0) {
        return obj;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m51840o(Object obj, xm0 xm0) {
        return obj;
    }

    /* renamed from: p */
    public static <T> sm0<T> m51841p(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m51836d(cls, clsArr).mo47827f(new qm0(t)).mo47825d();
    }

    /* renamed from: e */
    public Set<ic1> mo47815e() {
        return this.f33935b;
    }

    /* renamed from: f */
    public cn0<T> mo47816f() {
        return this.f33938e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> mo47817g() {
        return this.f33934a;
    }

    /* renamed from: h */
    public Set<Class<?>> mo47818h() {
        return this.f33939f;
    }

    /* renamed from: k */
    public boolean mo47819k() {
        if (this.f33936c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo47820l() {
        if (this.f33936c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo47821m() {
        if (this.f33937d == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f33934a.toArray()) + ">{" + this.f33936c + ", type=" + this.f33937d + ", deps=" + Arrays.toString(this.f33935b.toArray()) + "}";
    }

    public sm0(Set<Class<? super T>> set, Set<ic1> set2, int i, int i2, cn0<T> cn0, Set<Class<?>> set3) {
        this.f33934a = Collections.unmodifiableSet(set);
        this.f33935b = Collections.unmodifiableSet(set2);
        this.f33936c = i;
        this.f33937d = i2;
        this.f33938e = cn0;
        this.f33939f = Collections.unmodifiableSet(set3);
    }
}
