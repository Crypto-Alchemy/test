package p000;

import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jn0 */
/* compiled from: ComponentRuntime */
public class jn0 extends C6641w5 implements dn0 {

    /* renamed from: g */
    public static final ly4<Set<Object>> f30530g = new gn0();

    /* renamed from: a */
    public final Map<sm0<?>, ly4<?>> f30531a;

    /* renamed from: b */
    public final Map<Class<?>, ly4<?>> f30532b;

    /* renamed from: c */
    public final Map<Class<?>, tf3<?>> f30533c;

    /* renamed from: d */
    public final List<ly4<en0>> f30534d;

    /* renamed from: e */
    public final it1 f30535e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f30536f;

    /* renamed from: jn0$b */
    /* compiled from: ComponentRuntime */
    public static final class C6113b {

        /* renamed from: a */
        public final Executor f30537a;

        /* renamed from: b */
        public final List<ly4<en0>> f30538b = new ArrayList();

        /* renamed from: c */
        public final List<sm0<?>> f30539c = new ArrayList();

        public C6113b(Executor executor) {
            this.f30537a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ en0 m46655f(en0 en0) {
            return en0;
        }

        /* renamed from: b */
        public C6113b mo44531b(sm0<?> sm0) {
            this.f30539c.add(sm0);
            return this;
        }

        /* renamed from: c */
        public C6113b mo44532c(en0 en0) {
            this.f30538b.add(new kn0(en0));
            return this;
        }

        /* renamed from: d */
        public C6113b mo44533d(Collection<ly4<en0>> collection) {
            this.f30538b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public jn0 mo44534e() {
            return new jn0(this.f30537a, this.f30538b, this.f30539c);
        }
    }

    /* renamed from: h */
    public static C6113b m46638h(Executor executor) {
        return new C6113b(executor);
    }

    /* renamed from: l */
    public static <T> List<T> m46639l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m46640m(sm0 sm0) {
        return sm0.mo47816f().mo29438a(new cg5(sm0, this));
    }

    /* renamed from: a */
    public synchronized <T> ly4<Set<T>> mo29967a(Class<T> cls) {
        tf3 tf3 = this.f30533c.get(cls);
        if (tf3 != null) {
            return tf3;
        }
        return f30530g;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Set mo29968b(Class cls) {
        return super.mo29968b(cls);
    }

    /* renamed from: c */
    public synchronized <T> ly4<T> mo29969c(Class<T> cls) {
        eu4.m44087c(cls, "Null interface requested.");
        return this.f30532b.get(cls);
    }

    /* renamed from: d */
    public <T> ya1<T> mo29970d(Class<T> cls) {
        ly4<T> c = mo29969c(cls);
        if (c == null) {
            return vi4.m53398e();
        }
        if (c instanceof vi4) {
            return (vi4) c;
        }
        return vi4.m53402i(c);
    }

    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44524i(java.util.List<p000.sm0<?>> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r5)
            java.util.List<ly4<en0>> r1 = r5.f30534d     // Catch:{ all -> 0x0096 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0096 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0096 }
            ly4 r2 = (p000.ly4) r2     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r2.get()     // Catch:{ InvalidRegistrarException -> 0x002b }
            en0 r2 = (p000.en0) r2     // Catch:{ InvalidRegistrarException -> 0x002b }
            if (r2 == 0) goto L_0x000c
            java.util.List r2 = r2.getComponents()     // Catch:{ InvalidRegistrarException -> 0x002b }
            r6.addAll(r2)     // Catch:{ InvalidRegistrarException -> 0x002b }
            r1.remove()     // Catch:{ InvalidRegistrarException -> 0x002b }
            goto L_0x000c
        L_0x002b:
            r1.remove()     // Catch:{ all -> 0x0096 }
            goto L_0x000c
        L_0x002f:
            java.util.Map<sm0<?>, ly4<?>> r1 = r5.f30531a     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x003b
            p000.cz0.m43299a(r6)     // Catch:{ all -> 0x0096 }
            goto L_0x004c
        L_0x003b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0096 }
            java.util.Map<sm0<?>, ly4<?>> r2 = r5.f30531a     // Catch:{ all -> 0x0096 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0096 }
            r1.<init>(r2)     // Catch:{ all -> 0x0096 }
            r1.addAll(r6)     // Catch:{ all -> 0x0096 }
            p000.cz0.m43299a(r1)     // Catch:{ all -> 0x0096 }
        L_0x004c:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0096 }
        L_0x0050:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0096 }
            sm0 r2 = (p000.sm0) r2     // Catch:{ all -> 0x0096 }
            ff3 r3 = new ff3     // Catch:{ all -> 0x0096 }
            fn0 r4 = new fn0     // Catch:{ all -> 0x0096 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0096 }
            r3.<init>(r4)     // Catch:{ all -> 0x0096 }
            java.util.Map<sm0<?>, ly4<?>> r4 = r5.f30531a     // Catch:{ all -> 0x0096 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x0050
        L_0x006c:
            java.util.List r6 = r5.mo44529r(r6)     // Catch:{ all -> 0x0096 }
            r0.addAll(r6)     // Catch:{ all -> 0x0096 }
            java.util.List r6 = r5.mo44530s()     // Catch:{ all -> 0x0096 }
            r0.addAll(r6)     // Catch:{ all -> 0x0096 }
            r5.mo44528q()     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            java.util.Iterator r6 = r0.iterator()
        L_0x0082:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r6.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0082
        L_0x0092:
            r5.mo44527p()
            return
        L_0x0096:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jn0.mo44524i(java.util.List):void");
    }

    /* renamed from: j */
    public final void mo44525j(Map<sm0<?>, ly4<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            sm0 sm0 = (sm0) next.getKey();
            ly4 ly4 = (ly4) next.getValue();
            if (sm0.mo47819k() || (sm0.mo47820l() && z)) {
                ly4.get();
            }
        }
        this.f30535e.mo43920d();
    }

    /* renamed from: k */
    public void mo44526k(boolean z) {
        HashMap hashMap;
        if (ao0.m10672a(this.f30536f, (Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f30531a);
            }
            mo44525j(hashMap, z);
        }
    }

    /* renamed from: p */
    public final void mo44527p() {
        Boolean bool = this.f30536f.get();
        if (bool != null) {
            mo44525j(this.f30531a, bool.booleanValue());
        }
    }

    /* renamed from: q */
    public final void mo44528q() {
        for (sm0 next : this.f30531a.keySet()) {
            Iterator<ic1> it = next.mo47815e().iterator();
            while (true) {
                if (it.hasNext()) {
                    ic1 next2 = it.next();
                    if (next2.mo43547g() && !this.f30533c.containsKey(next2.mo43542c())) {
                        this.f30533c.put(next2.mo43542c(), tf3.m52277b(Collections.emptySet()));
                    } else if (this.f30532b.containsKey(next2.mo43542c())) {
                        continue;
                    } else if (next2.mo43546f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo43542c()}));
                    } else if (!next2.mo43547g()) {
                        this.f30532b.put(next2.mo43542c(), vi4.m53398e());
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final List<Runnable> mo44529r(List<sm0<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (sm0 next : list) {
            if (next.mo47821m()) {
                ly4 ly4 = this.f30531a.get(next);
                for (Class cls : next.mo47817g()) {
                    if (!this.f30532b.containsKey(cls)) {
                        this.f30532b.put(cls, ly4);
                    } else {
                        arrayList.add(new hn0((vi4) this.f30532b.get(cls), ly4));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public final List<Runnable> mo44530s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f30531a.entrySet()) {
            sm0 sm0 = (sm0) next.getKey();
            if (!sm0.mo47821m()) {
                ly4 ly4 = (ly4) next.getValue();
                for (Class cls : sm0.mo47817g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(ly4);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f30533c.containsKey(entry.getKey())) {
                this.f30533c.put((Class) entry.getKey(), tf3.m52277b((Collection) entry.getValue()));
            } else {
                tf3 tf3 = this.f30533c.get(entry.getKey());
                for (ly4 in0 : (Set) entry.getValue()) {
                    arrayList.add(new in0(tf3, in0));
                }
            }
        }
        return arrayList;
    }

    public jn0(Executor executor, Iterable<ly4<en0>> iterable, Collection<sm0<?>> collection) {
        this.f30531a = new HashMap();
        this.f30532b = new HashMap();
        this.f30533c = new HashMap();
        this.f30536f = new AtomicReference<>();
        it1 it1 = new it1(executor);
        this.f30535e = it1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(sm0.m51841p(it1, it1.class, oc6.class, wy4.class));
        arrayList.add(sm0.m51841p(this, dn0.class, new Class[0]));
        for (sm0 next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f30534d = m46639l(iterable);
        mo44524i(arrayList);
    }
}
