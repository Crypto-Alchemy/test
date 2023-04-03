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

/* renamed from: o79 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class o79<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f32291a;

    /* renamed from: d */
    public List<y79> f32292d;

    /* renamed from: e */
    public Map<K, V> f32293e;

    /* renamed from: g */
    public boolean f32294g;

    /* renamed from: k */
    public volatile c89 f32295k;

    /* renamed from: r */
    public Map<K, V> f32296r;

    /* renamed from: s */
    public volatile q79 f32297s;

    public o79(int i) {
        this.f32291a = i;
        this.f32292d = Collections.emptyList();
        this.f32293e = Collections.emptyMap();
        this.f32296r = Collections.emptyMap();
    }

    /* renamed from: d */
    public static <FieldDescriptorType extends n09<FieldDescriptorType>> o79<FieldDescriptorType, Object> m49187d(int i) {
        return new m79(i);
    }

    /* renamed from: a */
    public final int mo46324a(K k) {
        int size = this.f32292d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f32292d.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f32292d.get(i2).getKey());
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

    /* renamed from: b */
    public final V put(K k, V v) {
        mo46339q();
        int a = mo46324a(k);
        if (a >= 0) {
            return this.f32292d.get(a).setValue(v);
        }
        mo46339q();
        if (this.f32292d.isEmpty() && !(this.f32292d instanceof ArrayList)) {
            this.f32292d = new ArrayList(this.f32291a);
        }
        int i = -(a + 1);
        if (i >= this.f32291a) {
            return mo46340r().put(k, v);
        }
        int size = this.f32292d.size();
        int i2 = this.f32291a;
        if (size == i2) {
            y79 remove = this.f32292d.remove(i2 - 1);
            mo46340r().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f32292d.add(i, new y79(this, k, v));
        return null;
    }

    public void clear() {
        mo46339q();
        if (!this.f32292d.isEmpty()) {
            this.f32292d.clear();
        }
        if (!this.f32293e.isEmpty()) {
            this.f32293e.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo46324a(comparable) >= 0 || this.f32293e.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo45694e() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f32294g) {
            if (this.f32293e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f32293e);
            }
            this.f32293e = map;
            if (this.f32296r.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f32296r);
            }
            this.f32296r = map2;
            this.f32294g = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f32295k == null) {
            this.f32295k = new c89(this, (m79) null);
        }
        return this.f32295k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o79)) {
            return super.equals(obj);
        }
        o79 o79 = (o79) obj;
        int size = size();
        if (size != o79.size()) {
            return false;
        }
        int j = mo46334j();
        if (j != o79.mo46334j()) {
            return entrySet().equals(o79.entrySet());
        }
        for (int i = 0; i < j; i++) {
            if (!mo46331h(i).equals(o79.mo46331h(i))) {
                return false;
            }
        }
        if (j != size) {
            return this.f32293e.equals(o79.f32293e);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo46324a(comparable);
        if (a >= 0) {
            return this.f32292d.get(a).getValue();
        }
        return this.f32293e.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo46331h(int i) {
        return this.f32292d.get(i);
    }

    public int hashCode() {
        int j = mo46334j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += this.f32292d.get(i2).hashCode();
        }
        if (this.f32293e.size() > 0) {
            return i + this.f32293e.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo46333i() {
        return this.f32294g;
    }

    /* renamed from: j */
    public final int mo46334j() {
        return this.f32292d.size();
    }

    /* renamed from: k */
    public final V mo46335k(int i) {
        mo46339q();
        V value = this.f32292d.remove(i).getValue();
        if (!this.f32293e.isEmpty()) {
            Iterator it = mo46340r().entrySet().iterator();
            this.f32292d.add(new y79(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final Iterable<Map.Entry<K, V>> mo46336m() {
        if (this.f32293e.isEmpty()) {
            return w79.m53754a();
        }
        return this.f32293e.entrySet();
    }

    /* renamed from: p */
    public final Set<Map.Entry<K, V>> mo46337p() {
        if (this.f32297s == null) {
            this.f32297s = new q79(this, (m79) null);
        }
        return this.f32297s;
    }

    /* renamed from: q */
    public final void mo46339q() {
        if (this.f32294g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: r */
    public final SortedMap<K, V> mo46340r() {
        mo46339q();
        if (this.f32293e.isEmpty() && !(this.f32293e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f32293e = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f32296r = treeMap.descendingMap();
        }
        return (SortedMap) this.f32293e;
    }

    public V remove(Object obj) {
        mo46339q();
        Comparable comparable = (Comparable) obj;
        int a = mo46324a(comparable);
        if (a >= 0) {
            return mo46335k(a);
        }
        if (this.f32293e.isEmpty()) {
            return null;
        }
        return this.f32293e.remove(comparable);
    }

    public int size() {
        return this.f32292d.size() + this.f32293e.size();
    }

    public /* synthetic */ o79(int i, m79 m79) {
        this(i);
    }
}
