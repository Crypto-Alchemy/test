package com.google.protobuf;

import com.google.protobuf.C5005p;
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

/* renamed from: com.google.protobuf.l0 */
/* compiled from: SmallSortedMap */
public class C4989l0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f25706a;

    /* renamed from: d */
    public List<C4989l0<K, V>.C7006e> f25707d;

    /* renamed from: e */
    public Map<K, V> f25708e;

    /* renamed from: g */
    public boolean f25709g;

    /* renamed from: k */
    public volatile C4989l0<K, V>.C7109g f25710k;

    /* renamed from: r */
    public Map<K, V> f25711r;

    /* renamed from: s */
    public volatile C4989l0<K, V>.C6913c f25712s;

    /* renamed from: com.google.protobuf.l0$a */
    /* compiled from: SmallSortedMap */
    public static class C4990a extends C4989l0<FieldDescriptorType, Object> {
        public C4990a(int i) {
            super(i, (C4990a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C4989l0.super.put((C5005p.C5007b) obj, obj2);
        }

        /* renamed from: q */
        public void mo37386q() {
            if (!mo37384p()) {
                for (int i = 0; i < mo37380k(); i++) {
                    Map.Entry j = mo37379j(i);
                    if (((C5005p.C5007b) j.getKey()).mo36922j()) {
                        j.setValue(Collections.unmodifiableList((List) j.getValue()));
                    }
                }
                for (Map.Entry entry : mo37382m()) {
                    if (((C5005p.C5007b) entry.getKey()).mo36922j()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C4989l0.super.mo37386q();
        }
    }

    /* renamed from: com.google.protobuf.l0$c */
    /* compiled from: SmallSortedMap */
    public class C4992c extends C4989l0<K, V>.C7109g {
        public C4992c() {
            super(C4989l0.this, (C4990a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4991b(C4989l0.this, (C4990a) null);
        }

        public /* synthetic */ C4992c(C4989l0 l0Var, C4990a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.l0$d */
    /* compiled from: SmallSortedMap */
    public static class C4993d {

        /* renamed from: a */
        public static final Iterator<Object> f25717a = new C4994a();

        /* renamed from: b */
        public static final Iterable<Object> f25718b = new C4995b();

        /* renamed from: com.google.protobuf.l0$d$a */
        /* compiled from: SmallSortedMap */
        public static class C4994a implements Iterator<Object> {
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

        /* renamed from: com.google.protobuf.l0$d$b */
        /* compiled from: SmallSortedMap */
        public static class C4995b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C4993d.f25717a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m39796b() {
            return f25718b;
        }
    }

    /* renamed from: com.google.protobuf.l0$e */
    /* compiled from: SmallSortedMap */
    public class C4996e implements Map.Entry<K, V>, Comparable<C4989l0<K, V>.C7006e> {

        /* renamed from: a */
        public final K f25719a;

        /* renamed from: d */
        public V f25720d;

        public C4996e(C4989l0 l0Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public int compareTo(C4989l0<K, V>.C7006e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public final boolean mo37403d(Object obj, Object obj2) {
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
            return this.f25719a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!mo37403d(this.f25719a, entry.getKey()) || !mo37403d(this.f25720d, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f25720d;
        }

        public int hashCode() {
            int i;
            K k = this.f25719a;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f25720d;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            C4989l0.this.mo37374g();
            V v2 = this.f25720d;
            this.f25720d = v;
            return v2;
        }

        public String toString() {
            return this.f25719a + "=" + this.f25720d;
        }

        public C4996e(K k, V v) {
            this.f25719a = k;
            this.f25720d = v;
        }
    }

    /* renamed from: com.google.protobuf.l0$g */
    /* compiled from: SmallSortedMap */
    public class C4998g extends AbstractSet<Map.Entry<K, V>> {
        public C4998g() {
        }

        public void clear() {
            C4989l0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C4989l0.this.get(entry.getKey());
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
            C4989l0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4997f(C4989l0.this, (C4990a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C4989l0.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C4989l0.this.size();
        }

        public /* synthetic */ C4998g(C4989l0 l0Var, C4990a aVar) {
            this();
        }
    }

    public /* synthetic */ C4989l0(int i, C4990a aVar) {
        this(i);
    }

    /* renamed from: r */
    public static <FieldDescriptorType extends C5005p.C5007b<FieldDescriptorType>> C4989l0<FieldDescriptorType, Object> m39778r(int i) {
        return new C4990a(i);
    }

    public void clear() {
        mo37374g();
        if (!this.f25707d.isEmpty()) {
            this.f25707d.clear();
        }
        if (!this.f25708e.isEmpty()) {
            this.f25708e.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo37373f(comparable) >= 0 || this.f25708e.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f25710k == null) {
            this.f25710k = new C4998g(this, (C4990a) null);
        }
        return this.f25710k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4989l0)) {
            return super.equals(obj);
        }
        C4989l0 l0Var = (C4989l0) obj;
        int size = size();
        if (size != l0Var.size()) {
            return false;
        }
        int k = mo37380k();
        if (k != l0Var.mo37380k()) {
            return entrySet().equals(l0Var.entrySet());
        }
        for (int i = 0; i < k; i++) {
            if (!mo37379j(i).equals(l0Var.mo37379j(i))) {
                return false;
            }
        }
        if (k != size) {
            return this.f25708e.equals(l0Var.f25708e);
        }
        return true;
    }

    /* renamed from: f */
    public final int mo37373f(K k) {
        int size = this.f25707d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f25707d.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f25707d.get(i2).getKey());
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
    public final void mo37374g() {
        if (this.f25709g) {
            throw new UnsupportedOperationException();
        }
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = mo37373f(comparable);
        if (f >= 0) {
            return this.f25707d.get(f).getValue();
        }
        return this.f25708e.get(comparable);
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo37376h() {
        if (this.f25712s == null) {
            this.f25712s = new C4992c(this, (C4990a) null);
        }
        return this.f25712s;
    }

    public int hashCode() {
        int k = mo37380k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            i += this.f25707d.get(i2).hashCode();
        }
        if (mo37381l() > 0) {
            return i + this.f25708e.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final void mo37378i() {
        mo37374g();
        if (this.f25707d.isEmpty() && !(this.f25707d instanceof ArrayList)) {
            this.f25707d = new ArrayList(this.f25706a);
        }
    }

    /* renamed from: j */
    public Map.Entry<K, V> mo37379j(int i) {
        return this.f25707d.get(i);
    }

    /* renamed from: k */
    public int mo37380k() {
        return this.f25707d.size();
    }

    /* renamed from: l */
    public int mo37381l() {
        return this.f25708e.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> mo37382m() {
        if (this.f25708e.isEmpty()) {
            return C4993d.m39796b();
        }
        return this.f25708e.entrySet();
    }

    /* renamed from: n */
    public final SortedMap<K, V> mo37383n() {
        mo37374g();
        if (this.f25708e.isEmpty() && !(this.f25708e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25708e = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f25711r = treeMap.descendingMap();
        }
        return (SortedMap) this.f25708e;
    }

    /* renamed from: p */
    public boolean mo37384p() {
        return this.f25709g;
    }

    /* renamed from: q */
    public void mo37386q() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f25709g) {
            if (this.f25708e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f25708e);
            }
            this.f25708e = map;
            if (this.f25711r.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f25711r);
            }
            this.f25711r = map2;
            this.f25709g = true;
        }
    }

    public V remove(Object obj) {
        mo37374g();
        Comparable comparable = (Comparable) obj;
        int f = mo37373f(comparable);
        if (f >= 0) {
            return mo37390t(f);
        }
        if (this.f25708e.isEmpty()) {
            return null;
        }
        return this.f25708e.remove(comparable);
    }

    /* renamed from: s */
    public V put(K k, V v) {
        mo37374g();
        int f = mo37373f(k);
        if (f >= 0) {
            return this.f25707d.get(f).setValue(v);
        }
        mo37378i();
        int i = -(f + 1);
        if (i >= this.f25706a) {
            return mo37383n().put(k, v);
        }
        int size = this.f25707d.size();
        int i2 = this.f25706a;
        if (size == i2) {
            C4996e remove = this.f25707d.remove(i2 - 1);
            mo37383n().put(remove.getKey(), remove.getValue());
        }
        this.f25707d.add(i, new C4996e(k, v));
        return null;
    }

    public int size() {
        return this.f25707d.size() + this.f25708e.size();
    }

    /* renamed from: t */
    public final V mo37390t(int i) {
        mo37374g();
        V value = this.f25707d.remove(i).getValue();
        if (!this.f25708e.isEmpty()) {
            Iterator it = mo37383n().entrySet().iterator();
            this.f25707d.add(new C4996e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: com.google.protobuf.l0$b */
    /* compiled from: SmallSortedMap */
    public class C4991b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f25713a;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f25714d;

        public C4991b() {
            this.f25713a = C4989l0.this.f25707d.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo37391a() {
            if (this.f25714d == null) {
                this.f25714d = C4989l0.this.f25711r.entrySet().iterator();
            }
            return this.f25714d;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (mo37391a().hasNext()) {
                return (Map.Entry) mo37391a().next();
            }
            List b = C4989l0.this.f25707d;
            int i = this.f25713a - 1;
            this.f25713a = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f25713a;
            if ((i <= 0 || i > C4989l0.this.f25707d.size()) && !mo37391a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C4991b(C4989l0 l0Var, C4990a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.l0$f */
    /* compiled from: SmallSortedMap */
    public class C4997f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f25722a;

        /* renamed from: d */
        public boolean f25723d;

        /* renamed from: e */
        public Iterator<Map.Entry<K, V>> f25724e;

        public C4997f() {
            this.f25722a = -1;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo37411a() {
            if (this.f25724e == null) {
                this.f25724e = C4989l0.this.f25708e.entrySet().iterator();
            }
            return this.f25724e;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f25723d = true;
            int i = this.f25722a + 1;
            this.f25722a = i;
            if (i < C4989l0.this.f25707d.size()) {
                return (Map.Entry) C4989l0.this.f25707d.get(this.f25722a);
            }
            return (Map.Entry) mo37411a().next();
        }

        public boolean hasNext() {
            if (this.f25722a + 1 < C4989l0.this.f25707d.size()) {
                return true;
            }
            if (C4989l0.this.f25708e.isEmpty() || !mo37411a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f25723d) {
                this.f25723d = false;
                C4989l0.this.mo37374g();
                if (this.f25722a < C4989l0.this.f25707d.size()) {
                    C4989l0 l0Var = C4989l0.this;
                    int i = this.f25722a;
                    this.f25722a = i - 1;
                    Object unused = l0Var.mo37390t(i);
                    return;
                }
                mo37411a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C4997f(C4989l0 l0Var, C4990a aVar) {
            this();
        }
    }

    public C4989l0(int i) {
        this.f25706a = i;
        this.f25707d = Collections.emptyList();
        this.f25708e = Collections.emptyMap();
        this.f25711r = Collections.emptyMap();
    }
}
