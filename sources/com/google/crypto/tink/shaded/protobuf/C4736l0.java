package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4752p;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l0 */
/* compiled from: SmallSortedMap */
public class C4736l0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f25250a;

    /* renamed from: d */
    public List<C4736l0<K, V>.C7006e> f25251d;

    /* renamed from: e */
    public Map<K, V> f25252e;

    /* renamed from: g */
    public boolean f25253g;

    /* renamed from: k */
    public volatile C4736l0<K, V>.C7109g f25254k;

    /* renamed from: r */
    public Map<K, V> f25255r;

    /* renamed from: s */
    public volatile C4736l0<K, V>.C6913c f25256s;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$a */
    /* compiled from: SmallSortedMap */
    public class C4737a extends C4736l0<FieldDescriptorType, Object> {
        public C4737a(int i) {
            super(i, (C4737a) null);
        }

        /* renamed from: q */
        public void mo35923q() {
            if (!mo35921p()) {
                for (int i = 0; i < mo35917k(); i++) {
                    Map.Entry j = mo35916j(i);
                    if (((C4752p.C4754b) j.getKey()).mo35482j()) {
                        j.setValue(Collections.unmodifiableList((List) j.getValue()));
                    }
                }
                for (Map.Entry entry : mo35919m()) {
                    if (((C4752p.C4754b) entry.getKey()).mo35482j()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C4736l0.super.mo35923q();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$c */
    /* compiled from: SmallSortedMap */
    public class C4739c extends C4736l0<K, V>.C7109g {
        public C4739c() {
            super(C4736l0.this, (C4737a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4738b(C4736l0.this, (C4737a) null);
        }

        public /* synthetic */ C4739c(C4736l0 l0Var, C4737a aVar) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$d */
    /* compiled from: SmallSortedMap */
    public static class C4740d {

        /* renamed from: a */
        public static final Iterator<Object> f25261a = new C4741a();

        /* renamed from: b */
        public static final Iterable<Object> f25262b = new C4742b();

        /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$d$a */
        /* compiled from: SmallSortedMap */
        public class C4741a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$d$b */
        /* compiled from: SmallSortedMap */
        public class C4742b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C4740d.f25261a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m38199b() {
            return f25262b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$e */
    /* compiled from: SmallSortedMap */
    public class C4743e implements Map.Entry<K, V>, Comparable<C4736l0<K, V>.C7006e> {

        /* renamed from: a */
        public final K f25263a;

        /* renamed from: d */
        public V f25264d;

        public C4743e(C4736l0 l0Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public int compareTo(C4736l0<K, V>.C7006e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public final boolean mo35940d(Object obj, Object obj2) {
            if (obj != null) {
                return obj.equals(obj2);
            }
            if (obj2 == null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public K getKey() {
            return this.f25263a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!mo35940d(this.f25263a, entry.getKey()) || !mo35940d(this.f25264d, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f25264d;
        }

        public int hashCode() {
            int i;
            K k = this.f25263a;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f25264d;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            C4736l0.this.mo35911g();
            V v2 = this.f25264d;
            this.f25264d = v;
            return v2;
        }

        public String toString() {
            return this.f25263a + "=" + this.f25264d;
        }

        public C4743e(K k, V v) {
            this.f25263a = k;
            this.f25264d = v;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$g */
    /* compiled from: SmallSortedMap */
    public class C4745g extends AbstractSet<Map.Entry<K, V>> {
        public C4745g() {
        }

        public void clear() {
            C4736l0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C4736l0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C4736l0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4744f(C4736l0.this, (C4737a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C4736l0.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C4736l0.this.size();
        }

        public /* synthetic */ C4745g(C4736l0 l0Var, C4737a aVar) {
            this();
        }
    }

    public /* synthetic */ C4736l0(int i, C4737a aVar) {
        this(i);
    }

    /* renamed from: r */
    public static <FieldDescriptorType extends C4752p.C4754b<FieldDescriptorType>> C4736l0<FieldDescriptorType, Object> m38181r(int i) {
        return new C4737a(i);
    }

    public void clear() {
        mo35911g();
        if (!this.f25251d.isEmpty()) {
            this.f25251d.clear();
        }
        if (!this.f25252e.isEmpty()) {
            this.f25252e.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo35910f(comparable) >= 0 || this.f25252e.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f25254k == null) {
            this.f25254k = new C4745g(this, (C4737a) null);
        }
        return this.f25254k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4736l0)) {
            return super.equals(obj);
        }
        C4736l0 l0Var = (C4736l0) obj;
        int size = size();
        if (size != l0Var.size()) {
            return false;
        }
        int k = mo35917k();
        if (k != l0Var.mo35917k()) {
            return entrySet().equals(l0Var.entrySet());
        }
        for (int i = 0; i < k; i++) {
            if (!mo35916j(i).equals(l0Var.mo35916j(i))) {
                return false;
            }
        }
        if (k != size) {
            return this.f25252e.equals(l0Var.f25252e);
        }
        return true;
    }

    /* renamed from: f */
    public final int mo35910f(K k) {
        int size = this.f25251d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f25251d.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f25251d.get(i2).getKey());
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

    /* renamed from: g */
    public final void mo35911g() {
        if (this.f25253g) {
            throw new UnsupportedOperationException();
        }
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = mo35910f(comparable);
        if (f >= 0) {
            return this.f25251d.get(f).getValue();
        }
        return this.f25252e.get(comparable);
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo35913h() {
        if (this.f25256s == null) {
            this.f25256s = new C4739c(this, (C4737a) null);
        }
        return this.f25256s;
    }

    public int hashCode() {
        int k = mo35917k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            i += this.f25251d.get(i2).hashCode();
        }
        if (mo35918l() > 0) {
            return i + this.f25252e.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final void mo35915i() {
        mo35911g();
        if (this.f25251d.isEmpty() && !(this.f25251d instanceof ArrayList)) {
            this.f25251d = new ArrayList(this.f25250a);
        }
    }

    /* renamed from: j */
    public Map.Entry<K, V> mo35916j(int i) {
        return this.f25251d.get(i);
    }

    /* renamed from: k */
    public int mo35917k() {
        return this.f25251d.size();
    }

    /* renamed from: l */
    public int mo35918l() {
        return this.f25252e.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> mo35919m() {
        if (this.f25252e.isEmpty()) {
            return C4740d.m38199b();
        }
        return this.f25252e.entrySet();
    }

    /* renamed from: n */
    public final SortedMap<K, V> mo35920n() {
        mo35911g();
        if (this.f25252e.isEmpty() && !(this.f25252e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25252e = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f25255r = treeMap.descendingMap();
        }
        return (SortedMap) this.f25252e;
    }

    /* renamed from: p */
    public boolean mo35921p() {
        return this.f25253g;
    }

    /* renamed from: q */
    public void mo35923q() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f25253g) {
            if (this.f25252e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f25252e);
            }
            this.f25252e = map;
            if (this.f25255r.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f25255r);
            }
            this.f25255r = map2;
            this.f25253g = true;
        }
    }

    public V remove(Object obj) {
        mo35911g();
        Comparable comparable = (Comparable) obj;
        int f = mo35910f(comparable);
        if (f >= 0) {
            return mo35927t(f);
        }
        if (this.f25252e.isEmpty()) {
            return null;
        }
        return this.f25252e.remove(comparable);
    }

    /* renamed from: s */
    public V put(K k, V v) {
        mo35911g();
        int f = mo35910f(k);
        if (f >= 0) {
            return this.f25251d.get(f).setValue(v);
        }
        mo35915i();
        int i = -(f + 1);
        if (i >= this.f25250a) {
            return mo35920n().put(k, v);
        }
        int size = this.f25251d.size();
        int i2 = this.f25250a;
        if (size == i2) {
            C4743e remove = this.f25251d.remove(i2 - 1);
            mo35920n().put(remove.getKey(), remove.getValue());
        }
        this.f25251d.add(i, new C4743e(k, v));
        return null;
    }

    public int size() {
        return this.f25251d.size() + this.f25252e.size();
    }

    /* renamed from: t */
    public final V mo35927t(int i) {
        mo35911g();
        V value = this.f25251d.remove(i).getValue();
        if (!this.f25252e.isEmpty()) {
            Iterator it = mo35920n().entrySet().iterator();
            this.f25251d.add(new C4743e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$b */
    /* compiled from: SmallSortedMap */
    public class C4738b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f25257a;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f25258d;

        public C4738b() {
            this.f25257a = C4736l0.this.f25251d.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo35928a() {
            if (this.f25258d == null) {
                this.f25258d = C4736l0.this.f25255r.entrySet().iterator();
            }
            return this.f25258d;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (mo35928a().hasNext()) {
                return (Map.Entry) mo35928a().next();
            }
            List b = C4736l0.this.f25251d;
            int i = this.f25257a - 1;
            this.f25257a = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f25257a;
            if ((i <= 0 || i > C4736l0.this.f25251d.size()) && !mo35928a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C4738b(C4736l0 l0Var, C4737a aVar) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l0$f */
    /* compiled from: SmallSortedMap */
    public class C4744f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f25266a;

        /* renamed from: d */
        public boolean f25267d;

        /* renamed from: e */
        public Iterator<Map.Entry<K, V>> f25268e;

        public C4744f() {
            this.f25266a = -1;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo35948a() {
            if (this.f25268e == null) {
                this.f25268e = C4736l0.this.f25252e.entrySet().iterator();
            }
            return this.f25268e;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f25267d = true;
            int i = this.f25266a + 1;
            this.f25266a = i;
            if (i < C4736l0.this.f25251d.size()) {
                return (Map.Entry) C4736l0.this.f25251d.get(this.f25266a);
            }
            return (Map.Entry) mo35948a().next();
        }

        public boolean hasNext() {
            if (this.f25266a + 1 < C4736l0.this.f25251d.size()) {
                return true;
            }
            if (C4736l0.this.f25252e.isEmpty() || !mo35948a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f25267d) {
                this.f25267d = false;
                C4736l0.this.mo35911g();
                if (this.f25266a < C4736l0.this.f25251d.size()) {
                    C4736l0 l0Var = C4736l0.this;
                    int i = this.f25266a;
                    this.f25266a = i - 1;
                    Object unused = l0Var.mo35927t(i);
                    return;
                }
                mo35948a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C4744f(C4736l0 l0Var, C4737a aVar) {
            this();
        }
    }

    public C4736l0(int i) {
        this.f25250a = i;
        this.f25251d = Collections.emptyList();
        this.f25252e = Collections.emptyMap();
        this.f25255r = Collections.emptyMap();
    }
}
