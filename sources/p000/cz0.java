package p000;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: cz0 */
/* compiled from: CycleDetector */
public class cz0 {

    /* renamed from: cz0$b */
    /* compiled from: CycleDetector */
    public static class C5722b {

        /* renamed from: a */
        public final sm0<?> f27996a;

        /* renamed from: b */
        public final Set<C5722b> f27997b = new HashSet();

        /* renamed from: c */
        public final Set<C5722b> f27998c = new HashSet();

        public C5722b(sm0<?> sm0) {
            this.f27996a = sm0;
        }

        /* renamed from: a */
        public void mo41781a(C5722b bVar) {
            this.f27997b.add(bVar);
        }

        /* renamed from: b */
        public void mo41782b(C5722b bVar) {
            this.f27998c.add(bVar);
        }

        /* renamed from: c */
        public sm0<?> mo41783c() {
            return this.f27996a;
        }

        /* renamed from: d */
        public Set<C5722b> mo41784d() {
            return this.f27997b;
        }

        /* renamed from: e */
        public boolean mo41785e() {
            return this.f27997b.isEmpty();
        }

        /* renamed from: f */
        public boolean mo41786f() {
            return this.f27998c.isEmpty();
        }

        /* renamed from: g */
        public void mo41787g(C5722b bVar) {
            this.f27998c.remove(bVar);
        }
    }

    /* renamed from: cz0$c */
    /* compiled from: CycleDetector */
    public static class C5723c {

        /* renamed from: a */
        public final Class<?> f27999a;

        /* renamed from: b */
        public final boolean f28000b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C5723c)) {
                return false;
            }
            C5723c cVar = (C5723c) obj;
            if (!cVar.f27999a.equals(this.f27999a) || cVar.f28000b != this.f28000b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f27999a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f28000b).hashCode();
        }

        public C5723c(Class<?> cls, boolean z) {
            this.f27999a = cls;
            this.f28000b = z;
        }
    }

    /* renamed from: a */
    public static void m43299a(List<sm0<?>> list) {
        Set<C5722b> c = m43301c(list);
        Set<C5722b> b = m43300b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C5722b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C5722b next2 : next.mo41784d()) {
                next2.mo41787g(next);
                if (next2.mo41786f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C5722b next3 : c) {
                if (!next3.mo41786f() && !next3.mo41785e()) {
                    arrayList.add(next3.mo41783c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    public static Set<C5722b> m43300b(Set<C5722b> set) {
        HashSet hashSet = new HashSet();
        for (C5722b next : set) {
            if (next.mo41786f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<C5722b> m43301c(List<sm0<?>> list) {
        Set<C5722b> set;
        HashMap hashMap = new HashMap(list.size());
        for (sm0 next : list) {
            C5722b bVar = new C5722b(next);
            Iterator it = next.mo47817g().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C5723c cVar = new C5723c(cls, !next.mo47821m());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f28000b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C5722b> it2 : hashMap.values()) {
            for (C5722b bVar2 : it2) {
                for (ic1 next2 : bVar2.mo41783c().mo47815e()) {
                    if (next2.mo43544e() && (set = (Set) hashMap.get(new C5723c(next2.mo43542c(), next2.mo43547g()))) != null) {
                        for (C5722b bVar3 : set) {
                            bVar2.mo41781a(bVar3);
                            bVar3.mo41782b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
