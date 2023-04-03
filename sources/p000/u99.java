package p000;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: u99 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public class u99<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f34492a;

    /* renamed from: d */
    public List<m99> f34493d = Collections.emptyList();

    /* renamed from: e */
    public Map<K, V> f34494e = Collections.emptyMap();

    /* renamed from: g */
    public boolean f34495g;

    /* renamed from: k */
    public volatile s99 f34496k;

    /* renamed from: r */
    public Map<K, V> f34497r = Collections.emptyMap();

    public /* synthetic */ u99(int i, s89 s89) {
        this.f34492a = i;
    }

    /* renamed from: a */
    public void mo47701a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f34495g) {
            if (this.f34494e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f34494e);
            }
            this.f34494e = map;
            if (this.f34497r.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f34497r);
            }
            this.f34497r = map2;
            this.f34495g = true;
        }
    }

    /* renamed from: b */
    public final boolean mo48350b() {
        return this.f34495g;
    }

    /* renamed from: c */
    public final int mo48351c() {
        return this.f34493d.size();
    }

    public final void clear() {
        mo48363m();
        if (!this.f34493d.isEmpty()) {
            this.f34493d.clear();
        }
        if (!this.f34494e.isEmpty()) {
            this.f34494e.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo48362l(comparable) >= 0 || this.f34494e.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Map.Entry<K, V> mo48354d(int i) {
        return this.f34493d.get(i);
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> mo48355e() {
        if (this.f34494e.isEmpty()) {
            return y89.m54656a();
        }
        return this.f34494e.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f34496k == null) {
            this.f34496k = new s99(this, (s89) null);
        }
        return this.f34496k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u99)) {
            return super.equals(obj);
        }
        u99 u99 = (u99) obj;
        int size = size();
        if (size != u99.size()) {
            return false;
        }
        int c = mo48351c();
        if (c != u99.mo48351c()) {
            return entrySet().equals(u99.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo48354d(i).equals(u99.mo48354d(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f34494e.equals(u99.f34494e);
        }
        return true;
    }

    /* renamed from: f */
    public final V put(K k, V v) {
        mo48363m();
        int l = mo48362l(k);
        if (l >= 0) {
            return this.f34493d.get(l).setValue(v);
        }
        mo48363m();
        if (this.f34493d.isEmpty() && !(this.f34493d instanceof ArrayList)) {
            this.f34493d = new ArrayList(this.f34492a);
        }
        int i = -(l + 1);
        if (i >= this.f34492a) {
            return mo48364n().put(k, v);
        }
        int size = this.f34493d.size();
        int i2 = this.f34492a;
        if (size == i2) {
            m99 remove = this.f34493d.remove(i2 - 1);
            mo48364n().put(remove.mo45721a(), remove.getValue());
        }
        this.f34493d.add(i, new m99(this, k, v));
        return null;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = mo48362l(comparable);
        if (l >= 0) {
            return this.f34493d.get(l).getValue();
        }
        return this.f34494e.get(comparable);
    }

    public final int hashCode() {
        int c = mo48351c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f34493d.get(i2).hashCode();
        }
        if (this.f34494e.size() > 0) {
            return i + this.f34494e.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final V mo48361k(int i) {
        mo48363m();
        V value = this.f34493d.remove(i).getValue();
        if (!this.f34494e.isEmpty()) {
            Iterator it = mo48364n().entrySet().iterator();
            List<m99> list = this.f34493d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new m99(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: l */
    public final int mo48362l(K k) {
        int size = this.f34493d.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f34493d.get(size).mo45721a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f34493d.get(i2).mo45721a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: m */
    public final void mo48363m() {
        if (this.f34495g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public final SortedMap<K, V> mo48364n() {
        mo48363m();
        if (this.f34494e.isEmpty() && !(this.f34494e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f34494e = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f34497r = treeMap.descendingMap();
        }
        return (SortedMap) this.f34494e;
    }

    public final V remove(Object obj) {
        mo48363m();
        Comparable comparable = (Comparable) obj;
        int l = mo48362l(comparable);
        if (l >= 0) {
            return mo48361k(l);
        }
        if (this.f34494e.isEmpty()) {
            return null;
        }
        return this.f34494e.remove(comparable);
    }

    public final int size() {
        return this.f34493d.size() + this.f34494e.size();
    }
}
