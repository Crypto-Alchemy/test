package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.C7618e;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i */
/* compiled from: SmallSortedMap */
public class C7630i<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public final int f39970a;

    /* renamed from: d */
    public List<C7630i<K, V>.C6913c> f39971d;

    /* renamed from: e */
    public Map<K, V> f39972e;

    /* renamed from: g */
    public boolean f39973g;

    /* renamed from: k */
    public volatile C7630i<K, V>.C7006e f39974k;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$a */
    /* compiled from: SmallSortedMap */
    public static class C7631a extends C7630i<FieldDescriptorType, Object> {
        public C7631a(int i) {
            super(i, (C7631a) null);
        }

        /* renamed from: m */
        public void mo54776m() {
            if (!mo54775l()) {
                for (int i = 0; i < mo54772i(); i++) {
                    Map.Entry h = mo54771h(i);
                    if (((C7618e.C7620b) h.getKey()).mo54661j()) {
                        h.setValue(Collections.unmodifiableList((List) h.getValue()));
                    }
                }
                for (Map.Entry entry : mo54773j()) {
                    if (((C7618e.C7620b) entry.getKey()).mo54661j()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C7630i.super.mo54776m();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C7630i.super.mo54777p((C7618e.C7620b) obj, obj2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$b */
    /* compiled from: SmallSortedMap */
    public static class C7632b {

        /* renamed from: a */
        public static final Iterator<Object> f39975a = new C7633a();

        /* renamed from: b */
        public static final Iterable<Object> f39976b = new C7634b();

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$b$a */
        /* compiled from: SmallSortedMap */
        public static class C7633a implements Iterator<Object> {
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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$b$b */
        /* compiled from: SmallSortedMap */
        public static class C7634b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C7632b.f39975a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m62065b() {
            return f39976b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$c */
    /* compiled from: SmallSortedMap */
    public class C7635c implements Comparable<C7630i<K, V>.C6913c>, Map.Entry<K, V> {

        /* renamed from: a */
        public final K f39977a;

        /* renamed from: d */
        public V f39978d;

        public C7635c(C7630i iVar, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public int compareTo(C7630i<K, V>.C6913c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* renamed from: d */
        public final boolean mo54788d(Object obj, Object obj2) {
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
            return this.f39977a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!mo54788d(this.f39977a, entry.getKey()) || !mo54788d(this.f39978d, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f39978d;
        }

        public int hashCode() {
            int i;
            K k = this.f39977a;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f39978d;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            C7630i.this.mo54768f();
            V v2 = this.f39978d;
            this.f39978d = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39977a);
            String valueOf2 = String.valueOf(this.f39978d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        public C7635c(K k, V v) {
            this.f39977a = k;
            this.f39978d = v;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$e */
    /* compiled from: SmallSortedMap */
    public class C7637e extends AbstractSet<Map.Entry<K, V>> {
        public C7637e() {
        }

        public void clear() {
            C7630i.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C7630i.this.get(entry.getKey());
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
            C7630i.this.mo54777p((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7636d(C7630i.this, (C7631a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C7630i.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C7630i.this.size();
        }

        public /* synthetic */ C7637e(C7630i iVar, C7631a aVar) {
            this();
        }
    }

    public /* synthetic */ C7630i(int i, C7631a aVar) {
        this(i);
    }

    /* renamed from: n */
    public static <FieldDescriptorType extends C7618e.C7620b<FieldDescriptorType>> C7630i<FieldDescriptorType, Object> m62051n(int i) {
        return new C7631a(i);
    }

    public void clear() {
        mo54768f();
        if (!this.f39971d.isEmpty()) {
            this.f39971d.clear();
        }
        if (!this.f39972e.isEmpty()) {
            this.f39972e.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo54766e(comparable) >= 0 || this.f39972e.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo54766e(K k) {
        int size = this.f39971d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f39971d.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.f39971d.get(i2).getKey());
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

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f39974k == null) {
            this.f39974k = new C7637e(this, (C7631a) null);
        }
        return this.f39974k;
    }

    /* renamed from: f */
    public final void mo54768f() {
        if (this.f39973g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    public final void mo54769g() {
        mo54768f();
        if (this.f39971d.isEmpty() && !(this.f39971d instanceof ArrayList)) {
            this.f39971d = new ArrayList(this.f39970a);
        }
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = mo54766e(comparable);
        if (e >= 0) {
            return this.f39971d.get(e).getValue();
        }
        return this.f39972e.get(comparable);
    }

    /* renamed from: h */
    public Map.Entry<K, V> mo54771h(int i) {
        return this.f39971d.get(i);
    }

    /* renamed from: i */
    public int mo54772i() {
        return this.f39971d.size();
    }

    /* renamed from: j */
    public Iterable<Map.Entry<K, V>> mo54773j() {
        if (this.f39972e.isEmpty()) {
            return C7632b.m62065b();
        }
        return this.f39972e.entrySet();
    }

    /* renamed from: k */
    public final SortedMap<K, V> mo54774k() {
        mo54768f();
        if (this.f39972e.isEmpty() && !(this.f39972e instanceof TreeMap)) {
            this.f39972e = new TreeMap();
        }
        return (SortedMap) this.f39972e;
    }

    /* renamed from: l */
    public boolean mo54775l() {
        return this.f39973g;
    }

    /* renamed from: m */
    public void mo54776m() {
        Map<K, V> map;
        if (!this.f39973g) {
            if (this.f39972e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f39972e);
            }
            this.f39972e = map;
            this.f39973g = true;
        }
    }

    /* renamed from: p */
    public V mo54777p(K k, V v) {
        mo54768f();
        int e = mo54766e(k);
        if (e >= 0) {
            return this.f39971d.get(e).setValue(v);
        }
        mo54769g();
        int i = -(e + 1);
        if (i >= this.f39970a) {
            return mo54774k().put(k, v);
        }
        int size = this.f39971d.size();
        int i2 = this.f39970a;
        if (size == i2) {
            C7635c remove = this.f39971d.remove(i2 - 1);
            mo54774k().put(remove.getKey(), remove.getValue());
        }
        this.f39971d.add(i, new C7635c(k, v));
        return null;
    }

    /* renamed from: q */
    public final V mo54778q(int i) {
        mo54768f();
        V value = this.f39971d.remove(i).getValue();
        if (!this.f39972e.isEmpty()) {
            Iterator it = mo54774k().entrySet().iterator();
            this.f39971d.add(new C7635c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public V remove(Object obj) {
        mo54768f();
        Comparable comparable = (Comparable) obj;
        int e = mo54766e(comparable);
        if (e >= 0) {
            return mo54778q(e);
        }
        if (this.f39972e.isEmpty()) {
            return null;
        }
        return this.f39972e.remove(comparable);
    }

    public int size() {
        return this.f39971d.size() + this.f39972e.size();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$d */
    /* compiled from: SmallSortedMap */
    public class C7636d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f39980a;

        /* renamed from: d */
        public boolean f39981d;

        /* renamed from: e */
        public Iterator<Map.Entry<K, V>> f39982e;

        public C7636d() {
            this.f39980a = -1;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo54796a() {
            if (this.f39982e == null) {
                this.f39982e = C7630i.this.f39972e.entrySet().iterator();
            }
            return this.f39982e;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f39981d = true;
            int i = this.f39980a + 1;
            this.f39980a = i;
            if (i < C7630i.this.f39971d.size()) {
                return (Map.Entry) C7630i.this.f39971d.get(this.f39980a);
            }
            return (Map.Entry) mo54796a().next();
        }

        public boolean hasNext() {
            if (this.f39980a + 1 < C7630i.this.f39971d.size() || mo54796a().hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            if (this.f39981d) {
                this.f39981d = false;
                C7630i.this.mo54768f();
                if (this.f39980a < C7630i.this.f39971d.size()) {
                    C7630i iVar = C7630i.this;
                    int i = this.f39980a;
                    this.f39980a = i - 1;
                    Object unused = iVar.mo54778q(i);
                    return;
                }
                mo54796a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C7636d(C7630i iVar, C7631a aVar) {
            this();
        }
    }

    public C7630i(int i) {
        this.f39970a = i;
        this.f39971d = Collections.emptyList();
        this.f39972e = Collections.emptyMap();
    }
}
