package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ok5 */
/* compiled from: SafeIterableMap */
public class ok5<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    public C2962c<K, V> f15920a;

    /* renamed from: d */
    public C2962c<K, V> f15921d;

    /* renamed from: e */
    public WeakHashMap<C2965f<K, V>, Boolean> f15922e = new WeakHashMap<>();

    /* renamed from: g */
    public int f15923g = 0;

    /* renamed from: ok5$a */
    /* compiled from: SafeIterableMap */
    public static class C2960a<K, V> extends C2964e<K, V> {
        public C2960a(C2962c<K, V> cVar, C2962c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C2962c<K, V> mo23975b(C2962c<K, V> cVar) {
            return cVar.f15927g;
        }

        /* renamed from: c */
        public C2962c<K, V> mo23976c(C2962c<K, V> cVar) {
            return cVar.f15926e;
        }
    }

    /* renamed from: ok5$b */
    /* compiled from: SafeIterableMap */
    public static class C2961b<K, V> extends C2964e<K, V> {
        public C2961b(C2962c<K, V> cVar, C2962c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C2962c<K, V> mo23975b(C2962c<K, V> cVar) {
            return cVar.f15926e;
        }

        /* renamed from: c */
        public C2962c<K, V> mo23976c(C2962c<K, V> cVar) {
            return cVar.f15927g;
        }
    }

    /* renamed from: ok5$c */
    /* compiled from: SafeIterableMap */
    public static class C2962c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public final K f15924a;

        /* renamed from: d */
        public final V f15925d;

        /* renamed from: e */
        public C2962c<K, V> f15926e;

        /* renamed from: g */
        public C2962c<K, V> f15927g;

        public C2962c(K k, V v) {
            this.f15924a = k;
            this.f15925d = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2962c)) {
                return false;
            }
            C2962c cVar = (C2962c) obj;
            if (!this.f15924a.equals(cVar.f15924a) || !this.f15925d.equals(cVar.f15925d)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f15924a;
        }

        public V getValue() {
            return this.f15925d;
        }

        public int hashCode() {
            return this.f15924a.hashCode() ^ this.f15925d.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f15924a + "=" + this.f15925d;
        }
    }

    /* renamed from: ok5$d */
    /* compiled from: SafeIterableMap */
    public class C2963d implements Iterator<Map.Entry<K, V>>, C2965f<K, V> {

        /* renamed from: a */
        public C2962c<K, V> f15928a;

        /* renamed from: d */
        public boolean f15929d = true;

        public C2963d() {
        }

        /* renamed from: a */
        public void mo23983a(C2962c<K, V> cVar) {
            boolean z;
            C2962c<K, V> cVar2 = this.f15928a;
            if (cVar == cVar2) {
                C2962c<K, V> cVar3 = cVar2.f15927g;
                this.f15928a = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f15929d = z;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C2962c<K, V> cVar;
            if (this.f15929d) {
                this.f15929d = false;
                this.f15928a = ok5.this.f15920a;
            } else {
                C2962c<K, V> cVar2 = this.f15928a;
                if (cVar2 != null) {
                    cVar = cVar2.f15926e;
                } else {
                    cVar = null;
                }
                this.f15928a = cVar;
            }
            return this.f15928a;
        }

        public boolean hasNext() {
            if (!this.f15929d) {
                C2962c<K, V> cVar = this.f15928a;
                if (cVar == null || cVar.f15926e == null) {
                    return false;
                }
                return true;
            } else if (ok5.this.f15920a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: ok5$e */
    /* compiled from: SafeIterableMap */
    public static abstract class C2964e<K, V> implements Iterator<Map.Entry<K, V>>, C2965f<K, V> {

        /* renamed from: a */
        public C2962c<K, V> f15931a;

        /* renamed from: d */
        public C2962c<K, V> f15932d;

        public C2964e(C2962c<K, V> cVar, C2962c<K, V> cVar2) {
            this.f15931a = cVar2;
            this.f15932d = cVar;
        }

        /* renamed from: a */
        public void mo23983a(C2962c<K, V> cVar) {
            if (this.f15931a == cVar && cVar == this.f15932d) {
                this.f15932d = null;
                this.f15931a = null;
            }
            C2962c<K, V> cVar2 = this.f15931a;
            if (cVar2 == cVar) {
                this.f15931a = mo23975b(cVar2);
            }
            if (this.f15932d == cVar) {
                this.f15932d = mo23988f();
            }
        }

        /* renamed from: b */
        public abstract C2962c<K, V> mo23975b(C2962c<K, V> cVar);

        /* renamed from: c */
        public abstract C2962c<K, V> mo23976c(C2962c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C2962c<K, V> cVar = this.f15932d;
            this.f15932d = mo23988f();
            return cVar;
        }

        /* renamed from: f */
        public final C2962c<K, V> mo23988f() {
            C2962c<K, V> cVar = this.f15932d;
            C2962c<K, V> cVar2 = this.f15931a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo23976c(cVar);
        }

        public boolean hasNext() {
            if (this.f15932d != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ok5$f */
    /* compiled from: SafeIterableMap */
    public interface C2965f<K, V> {
        /* renamed from: a */
        void mo23983a(C2962c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C2961b bVar = new C2961b(this.f15921d, this.f15920a);
        this.f15922e.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo23966e() {
        return this.f15920a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ok5)) {
            return false;
        }
        ok5 ok5 = (ok5) obj;
        if (size() != ok5.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = ok5.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C2960a aVar = new C2960a(this.f15920a, this.f15921d);
        this.f15922e.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public C2962c<K, V> mo18385j(K k) {
        C2962c<K, V> cVar = this.f15920a;
        while (cVar != null && !cVar.f15924a.equals(k)) {
            cVar = cVar.f15926e;
        }
        return cVar;
    }

    /* renamed from: k */
    public ok5<K, V>.C6956d mo23970k() {
        ok5<K, V>.C6956d dVar = new C2963d();
        this.f15922e.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: n */
    public Map.Entry<K, V> mo23971n() {
        return this.f15921d;
    }

    /* renamed from: o */
    public C2962c<K, V> mo23972o(K k, V v) {
        C2962c<K, V> cVar = new C2962c<>(k, v);
        this.f15923g++;
        C2962c<K, V> cVar2 = this.f15921d;
        if (cVar2 == null) {
            this.f15920a = cVar;
            this.f15921d = cVar;
            return cVar;
        }
        cVar2.f15926e = cVar;
        cVar.f15927g = cVar2;
        this.f15921d = cVar;
        return cVar;
    }

    /* renamed from: q */
    public V mo18386q(K k, V v) {
        C2962c j = mo18385j(k);
        if (j != null) {
            return j.f15925d;
        }
        mo23972o(k, v);
        return null;
    }

    /* renamed from: r */
    public V mo18387r(K k) {
        C2962c j = mo18385j(k);
        if (j == null) {
            return null;
        }
        this.f15923g--;
        if (!this.f15922e.isEmpty()) {
            for (C2965f<K, V> a : this.f15922e.keySet()) {
                a.mo23983a(j);
            }
        }
        C2962c<K, V> cVar = j.f15927g;
        if (cVar != null) {
            cVar.f15926e = j.f15926e;
        } else {
            this.f15920a = j.f15926e;
        }
        C2962c<K, V> cVar2 = j.f15926e;
        if (cVar2 != null) {
            cVar2.f15927g = cVar;
        } else {
            this.f15921d = cVar;
        }
        j.f15926e = null;
        j.f15927g = null;
        return j.f15925d;
    }

    public int size() {
        return this.f15923g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
