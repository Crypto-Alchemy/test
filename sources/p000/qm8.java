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

/* renamed from: qm8 */
public class qm8<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f33179a;

    /* renamed from: d */
    public List<kn8> f33180d;

    /* renamed from: e */
    public Map<K, V> f33181e;

    /* renamed from: g */
    public boolean f33182g;

    /* renamed from: k */
    public volatile qn8 f33183k;

    /* renamed from: r */
    public Map<K, V> f33184r;

    /* renamed from: s */
    public volatile zm8 f33185s;

    public qm8(int i) {
        this.f33179a = i;
        this.f33180d = Collections.emptyList();
        this.f33181e = Collections.emptyMap();
        this.f33184r = Collections.emptyMap();
    }

    public /* synthetic */ qm8(int i, tm8 tm8) {
        this(i);
    }

    /* renamed from: f */
    public static <FieldDescriptorType extends af8<FieldDescriptorType>> qm8<FieldDescriptorType, Object> m50646f(int i) {
        return new tm8(i);
    }

    /* renamed from: a */
    public final boolean mo47132a() {
        return this.f33182g;
    }

    /* renamed from: b */
    public final int mo47133b(K k) {
        int size = this.f33180d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f33180d.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f33180d.get(i2).getKey());
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

    /* renamed from: c */
    public final V put(K k, V v) {
        mo47146p();
        int b = mo47133b(k);
        if (b >= 0) {
            return this.f33180d.get(b).setValue(v);
        }
        mo47146p();
        if (this.f33180d.isEmpty() && !(this.f33180d instanceof ArrayList)) {
            this.f33180d = new ArrayList(this.f33179a);
        }
        int i = -(b + 1);
        if (i >= this.f33179a) {
            return mo47148q().put(k, v);
        }
        int size = this.f33180d.size();
        int i2 = this.f33179a;
        if (size == i2) {
            kn8 remove = this.f33180d.remove(i2 - 1);
            mo47148q().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f33180d.add(i, new kn8(this, k, v));
        return null;
    }

    public void clear() {
        mo47146p();
        if (!this.f33180d.isEmpty()) {
            this.f33180d.clear();
        }
        if (!this.f33181e.isEmpty()) {
            this.f33181e.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo47133b(comparable) >= 0 || this.f33181e.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f33183k == null) {
            this.f33183k = new qn8(this, (tm8) null);
        }
        return this.f33183k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm8)) {
            return super.equals(obj);
        }
        qm8 qm8 = (qm8) obj;
        int size = size();
        if (size != qm8.size()) {
            return false;
        }
        int l = mo47143l();
        if (l != qm8.mo47143l()) {
            return entrySet().equals(qm8.entrySet());
        }
        for (int i = 0; i < l; i++) {
            if (!mo47139g(i).equals(qm8.mo47139g(i))) {
                return false;
            }
        }
        if (l != size) {
            return this.f33181e.equals(qm8.f33181e);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry<K, V> mo47139g(int i) {
        return this.f33180d.get(i);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b = mo47133b(comparable);
        return b >= 0 ? this.f33180d.get(b).getValue() : this.f33181e.get(comparable);
    }

    /* renamed from: h */
    public final V mo47141h(int i) {
        mo47146p();
        V value = this.f33180d.remove(i).getValue();
        if (!this.f33181e.isEmpty()) {
            Iterator it = mo47148q().entrySet().iterator();
            this.f33180d.add(new kn8(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public int hashCode() {
        int l = mo47143l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            i += this.f33180d.get(i2).hashCode();
        }
        return this.f33181e.size() > 0 ? i + this.f33181e.hashCode() : i;
    }

    /* renamed from: l */
    public final int mo47143l() {
        return this.f33180d.size();
    }

    /* renamed from: m */
    public final Iterable<Map.Entry<K, V>> mo47144m() {
        return this.f33181e.isEmpty() ? cn8.m33127a() : this.f33181e.entrySet();
    }

    /* renamed from: n */
    public final Set<Map.Entry<K, V>> mo47145n() {
        if (this.f33185s == null) {
            this.f33185s = new zm8(this, (tm8) null);
        }
        return this.f33185s;
    }

    /* renamed from: p */
    public final void mo47146p() {
        if (this.f33182g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: q */
    public final SortedMap<K, V> mo47148q() {
        mo47146p();
        if (this.f33181e.isEmpty() && !(this.f33181e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f33181e = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f33184r = treeMap.descendingMap();
        }
        return (SortedMap) this.f33181e;
    }

    /* renamed from: r */
    public void mo47149r() {
        if (!this.f33182g) {
            this.f33181e = this.f33181e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f33181e);
            this.f33184r = this.f33184r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f33184r);
            this.f33182g = true;
        }
    }

    public V remove(Object obj) {
        mo47146p();
        Comparable comparable = (Comparable) obj;
        int b = mo47133b(comparable);
        if (b >= 0) {
            return mo47141h(b);
        }
        if (this.f33181e.isEmpty()) {
            return null;
        }
        return this.f33181e.remove(comparable);
    }

    public int size() {
        return this.f33180d.size() + this.f33181e.size();
    }
}
