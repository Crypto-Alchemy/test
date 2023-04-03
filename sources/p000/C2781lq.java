package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: lq */
/* compiled from: ArrayMap */
public class C2781lq<K, V> extends y16<K, V> implements Map<K, V> {

    /* renamed from: x */
    public pn3<K, V> f14628x;

    /* renamed from: lq$a */
    /* compiled from: ArrayMap */
    public class C2782a extends pn3<K, V> {
        public C2782a() {
        }

        /* renamed from: a */
        public void mo22912a() {
            C2781lq.this.clear();
        }

        /* renamed from: b */
        public Object mo22913b(int i, int i2) {
            return C2781lq.this.f20018d[(i << 1) + i2];
        }

        /* renamed from: c */
        public Map<K, V> mo22914c() {
            return C2781lq.this;
        }

        /* renamed from: d */
        public int mo22915d() {
            return C2781lq.this.f20019e;
        }

        /* renamed from: e */
        public int mo22916e(Object obj) {
            return C2781lq.this.mo27914f(obj);
        }

        /* renamed from: f */
        public int mo22917f(Object obj) {
            return C2781lq.this.mo27918h(obj);
        }

        /* renamed from: g */
        public void mo22918g(K k, V v) {
            C2781lq.this.put(k, v);
        }

        /* renamed from: h */
        public void mo22919h(int i) {
            C2781lq.this.mo22211k(i);
        }

        /* renamed from: i */
        public V mo22920i(int i, V v) {
            return C2781lq.this.mo22212l(i, v);
        }
    }

    public C2781lq() {
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo22908n().mo24660l();
    }

    public Set<K> keySet() {
        return mo22908n().mo24661m();
    }

    /* renamed from: n */
    public final pn3<K, V> mo22908n() {
        if (this.f14628x == null) {
            this.f14628x = new C2782a();
        }
        return this.f14628x;
    }

    /* renamed from: p */
    public boolean mo22909p(Collection<?> collection) {
        return pn3.m25067p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo27909c(this.f20019e + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return mo22908n().mo24662n();
    }

    public C2781lq(int i) {
        super(i);
    }

    public C2781lq(y16 y16) {
        super(y16);
    }
}
