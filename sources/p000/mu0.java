package p000;

import java.util.LinkedHashMap;

/* renamed from: mu0 */
/* compiled from: CountingLruMap */
public class mu0<K, V> {

    /* renamed from: a */
    public final g87<V> f15250a;

    /* renamed from: b */
    public final LinkedHashMap<K, V> f15251b = new LinkedHashMap<>();

    /* renamed from: c */
    public int f15252c = 0;

    public mu0(g87<V> g87) {
        this.f15250a = g87;
    }

    /* renamed from: a */
    public synchronized boolean mo23385a(K k) {
        return this.f15251b.containsKey(k);
    }

    /* renamed from: b */
    public synchronized V mo23386b(K k) {
        return this.f15251b.get(k);
    }

    /* renamed from: c */
    public synchronized int mo23387c() {
        return this.f15251b.size();
    }

    /* renamed from: d */
    public synchronized K mo23388d() {
        K k;
        if (this.f15251b.isEmpty()) {
            k = null;
        } else {
            k = this.f15251b.keySet().iterator().next();
        }
        return k;
    }

    /* renamed from: e */
    public synchronized int mo23389e() {
        return this.f15252c;
    }

    /* renamed from: f */
    public final int mo23390f(V v) {
        if (v == null) {
            return 0;
        }
        return this.f15250a.mo19448a(v);
    }

    /* renamed from: g */
    public synchronized V mo23391g(K k, V v) {
        V remove;
        remove = this.f15251b.remove(k);
        this.f15252c -= mo23390f(remove);
        this.f15251b.put(k, v);
        this.f15252c += mo23390f(v);
        return remove;
    }

    /* renamed from: h */
    public synchronized V mo23392h(K k) {
        V remove;
        remove = this.f15251b.remove(k);
        this.f15252c -= mo23390f(remove);
        return remove;
    }

    /* renamed from: i */
    public synchronized void mo23393i() {
        if (this.f15251b.isEmpty()) {
            this.f15252c = 0;
        }
    }
}
