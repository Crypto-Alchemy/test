package com.google.common.collect;

import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;

    /* renamed from: s */
    public static final Object f24831s = new Object();

    /* renamed from: a */
    public transient Object f24832a;

    /* renamed from: d */
    public transient int f24833d;

    /* renamed from: e */
    public transient int f24834e;
    public transient int[] entries;

    /* renamed from: g */
    public transient Set<K> f24835g;

    /* renamed from: k */
    public transient Set<Map.Entry<K, V>> f24836k;
    public transient Object[] keys;

    /* renamed from: r */
    public transient Collection<V> f24837r;
    public transient Object[] values;

    /* renamed from: com.google.common.collect.CompactHashMap$a */
    public class C4523a extends CompactHashMap<K, V>.C7006e<K> {
        public C4523a() {
            super(CompactHashMap.this, (C4523a) null);
        }

        /* renamed from: b */
        public K mo34571b(int i) {
            return CompactHashMap.this.mo34537d(i);
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$b */
    public class C4524b extends CompactHashMap<K, V>.C7006e<Map.Entry<K, V>> {
        public C4524b() {
            super(CompactHashMap.this, (C4523a) null);
        }

        /* renamed from: d */
        public Map.Entry<K, V> mo34571b(int i) {
            return new C4529g(i);
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$c */
    public class C4525c extends CompactHashMap<K, V>.C7006e<V> {
        public C4525c() {
            super(CompactHashMap.this, (C4523a) null);
        }

        /* renamed from: b */
        public V mo34571b(int i) {
            return CompactHashMap.this.mo34564q(i);
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$d */
    public class C4526d extends AbstractSet<Map.Entry<K, V>> {
        public C4526d() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            Map delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int access$500 = CompactHashMap.this.mo34528c(entry.getKey());
            if (access$500 == -1 || !jf4.m46496a(CompactHashMap.this.mo34564q(access$500), entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = com.google.common.collect.CompactHashMap.access$700(r9.f24841a);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                java.util.Map r0 = r0.delegateOrNull()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                boolean r0 = r0.needsAllocArrays()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.this
                int r0 = r0.mo34527b()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object r5 = r10.mo34547h()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                int[] r6 = r10.mo34542f()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object[] r7 = r10.mo34544g()
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                java.lang.Object[] r8 = r10.mo34548i()
                r4 = r0
                int r10 = p000.tl0.m52349f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.this
                r1.moveLastEntry(r10, r0)
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                com.google.common.collect.CompactHashMap.access$1210(r10)
                com.google.common.collect.CompactHashMap r10 = com.google.common.collect.CompactHashMap.this
                r10.incrementModCount()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.C4526d.remove(java.lang.Object):boolean");
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$f */
    public class C4528f extends AbstractSet<K> {
        public C4528f() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        public boolean remove(Object obj) {
            Map delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.keySet().remove(obj);
            }
            if (CompactHashMap.this.mo34539e(obj) != CompactHashMap.f24831s) {
                return true;
            }
            return false;
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$g */
    public final class C4529g extends C6207l6<K, V> {

        /* renamed from: a */
        public final K f24847a;

        /* renamed from: d */
        public int f24848d;

        public C4529g(int i) {
            this.f24847a = CompactHashMap.this.mo34537d(i);
            this.f24848d = i;
        }

        /* renamed from: a */
        public final void mo34588a() {
            int i = this.f24848d;
            if (i == -1 || i >= CompactHashMap.this.size() || !jf4.m46496a(this.f24847a, CompactHashMap.this.mo34537d(this.f24848d))) {
                this.f24848d = CompactHashMap.this.mo34528c(this.f24847a);
            }
        }

        public K getKey() {
            return this.f24847a;
        }

        public V getValue() {
            Map delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return ic4.m45613a(delegateOrNull.get(this.f24847a));
            }
            mo34588a();
            int i = this.f24848d;
            if (i == -1) {
                return ic4.m45614b();
            }
            return CompactHashMap.this.mo34564q(i);
        }

        public V setValue(V v) {
            Map delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return ic4.m45613a(delegateOrNull.put(this.f24847a, v));
            }
            mo34588a();
            int i = this.f24848d;
            if (i == -1) {
                CompactHashMap.this.put(this.f24847a, v);
                return ic4.m45614b();
            }
            V access$600 = CompactHashMap.this.mo34564q(i);
            CompactHashMap.this.mo34562p(this.f24848d, v);
            return access$600;
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$h */
    public class C4530h extends AbstractCollection<V> {
        public C4530h() {
        }

        public void clear() {
            CompactHashMap.this.clear();
        }

        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i = compactHashMap.f24834e;
        compactHashMap.f24834e = i - 1;
        return i;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap<>(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) entrySetIterator.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    public final int mo34523a(int i) {
        return mo34542f()[i];
    }

    public void accessEntry(int i) {
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        du4.m43697q(needsAllocArrays(), "Arrays already allocated");
        int i = this.f24833d;
        int j = tl0.m52353j(i);
        this.f24832a = tl0.m52344a(j);
        mo34558m(j - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    /* renamed from: b */
    public final int mo34527b() {
        return (1 << (this.f24833d & 31)) - 1;
    }

    /* renamed from: c */
    public final int mo34528c(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int c = ml2.m48362c(obj);
        int b = mo34527b();
        int h = tl0.m52351h(mo34547h(), c & b);
        if (h == 0) {
            return -1;
        }
        int b2 = tl0.m52345b(c, b);
        do {
            int i = h - 1;
            int a = mo34523a(i);
            if (tl0.m52345b(a, b) == b2 && jf4.m46496a(obj, mo34537d(i))) {
                return i;
            }
            h = tl0.m52346c(a, b);
        } while (h != 0);
        return -1;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Map delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.f24833d = Ints.m37047f(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.f24832a = null;
                this.f24834e = 0;
                return;
            }
            Arrays.fill(mo34544g(), 0, this.f24834e, (Object) null);
            Arrays.fill(mo34548i(), 0, this.f24834e, (Object) null);
            tl0.m52350g(mo34547h());
            Arrays.fill(mo34542f(), 0, this.f24834e, 0);
            this.f24834e = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsKey(obj);
        }
        if (mo34528c(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.f24834e; i++) {
            if (jf4.m46496a(obj, mo34564q(i))) {
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(mo34527b() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.put(mo34537d(firstEntryIndex), mo34564q(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.f24832a = createHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new C4526d();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<K> createKeySet() {
        return new C4528f();
    }

    public Collection<V> createValues() {
        return new C4530h();
    }

    /* renamed from: d */
    public final K mo34537d(int i) {
        return mo34544g()[i];
    }

    public Map<K, V> delegateOrNull() {
        Object obj = this.f24832a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: e */
    public final Object mo34539e(Object obj) {
        if (needsAllocArrays()) {
            return f24831s;
        }
        int b = mo34527b();
        int f = tl0.m52349f(obj, (Object) null, b, mo34547h(), mo34542f(), mo34544g(), (Object[]) null);
        if (f == -1) {
            return f24831s;
        }
        Object q = mo34564q(f);
        moveLastEntry(f, b);
        this.f24834e--;
        incrementModCount();
        return q;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f24836k;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.f24836k = createEntrySet;
        return createEntrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().iterator();
        }
        return new C4524b();
    }

    /* renamed from: f */
    public final int[] mo34542f() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* renamed from: g */
    public final Object[] mo34544g() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public V get(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int c = mo34528c(obj);
        if (c == -1) {
            return null;
        }
        accessEntry(c);
        return mo34564q(c);
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.f24834e) {
            return i2;
        }
        return -1;
    }

    /* renamed from: h */
    public final Object mo34547h() {
        Object obj = this.f24832a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: i */
    public final Object[] mo34548i() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void incrementModCount() {
        this.f24833d += 32;
    }

    public void init(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        du4.m43685e(z, "Expected size must be >= 0");
        this.f24833d = Ints.m37047f(i, 1, 1073741823);
    }

    public void insertEntry(int i, K k, V v, int i2, int i3) {
        mo34557l(i, tl0.m52347d(i2, 0, i3));
        mo34560n(i, k);
        mo34562p(i, v);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo34553j(int i) {
        int min;
        int length = mo34542f().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: k */
    public final int mo34554k(int i, int i2, int i3, int i4) {
        Object a = tl0.m52344a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            tl0.m52352i(a, i3 & i5, i4 + 1);
        }
        Object h = mo34547h();
        int[] f = mo34542f();
        for (int i6 = 0; i6 <= i; i6++) {
            int h2 = tl0.m52351h(h, i6);
            while (h2 != 0) {
                int i7 = h2 - 1;
                int i8 = f[i7];
                int b = tl0.m52345b(i8, i) | i6;
                int i9 = b & i5;
                int h3 = tl0.m52351h(a, i9);
                tl0.m52352i(a, i9, h2);
                f[i7] = tl0.m52347d(b, h3, i5);
                h2 = tl0.m52346c(i8, i);
            }
        }
        this.f24832a = a;
        mo34558m(i5);
        return i5;
    }

    public Set<K> keySet() {
        Set<K> set = this.f24835g;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.f24835g = createKeySet;
        return createKeySet;
    }

    public Iterator<K> keySetIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.keySet().iterator();
        }
        return new C4523a();
    }

    /* renamed from: l */
    public final void mo34557l(int i, int i2) {
        mo34542f()[i] = i2;
    }

    /* renamed from: m */
    public final void mo34558m(int i) {
        this.f24833d = tl0.m52347d(this.f24833d, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public void moveLastEntry(int i, int i2) {
        Object h = mo34547h();
        int[] f = mo34542f();
        Object[] g = mo34544g();
        Object[] i3 = mo34548i();
        int size = size() - 1;
        if (i < size) {
            Object obj = g[size];
            g[i] = obj;
            i3[i] = i3[size];
            g[size] = null;
            i3[size] = null;
            f[i] = f[size];
            f[size] = 0;
            int c = ml2.m48362c(obj) & i2;
            int h2 = tl0.m52351h(h, c);
            int i4 = size + 1;
            if (h2 == i4) {
                tl0.m52352i(h, c, i + 1);
                return;
            }
            while (true) {
                int i5 = h2 - 1;
                int i6 = f[i5];
                int c2 = tl0.m52346c(i6, i2);
                if (c2 == i4) {
                    f[i5] = tl0.m52347d(i6, i + 1, i2);
                    return;
                }
                h2 = c2;
            }
        } else {
            g[i] = null;
            i3[i] = null;
            f[i] = 0;
        }
    }

    /* renamed from: n */
    public final void mo34560n(int i, K k) {
        mo34544g()[i] = k;
    }

    public boolean needsAllocArrays() {
        if (this.f24832a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void mo34562p(int i, V v) {
        mo34548i()[i] = v;
    }

    @CanIgnoreReturnValue
    public V put(K k, V v) {
        int i;
        int k2;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(k, v);
        }
        int[] f = mo34542f();
        Object[] g = mo34544g();
        V[] i2 = mo34548i();
        int i3 = this.f24834e;
        int i4 = i3 + 1;
        int c = ml2.m48362c(k);
        int b = mo34527b();
        int i5 = c & b;
        int h = tl0.m52351h(mo34547h(), i5);
        if (h != 0) {
            int b2 = tl0.m52345b(c, b);
            int i6 = 0;
            while (true) {
                int i7 = h - 1;
                int i8 = f[i7];
                if (tl0.m52345b(i8, b) != b2 || !jf4.m46496a(k, g[i7])) {
                    int c2 = tl0.m52346c(i8, b);
                    i6++;
                    if (c2 != 0) {
                        h = c2;
                    } else if (i6 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k, v);
                    } else {
                        if (i4 > b) {
                            k2 = mo34554k(b, tl0.m52348e(b), c, i3);
                        } else {
                            f[i7] = tl0.m52347d(i8, i4, b);
                        }
                    }
                } else {
                    V v2 = i2[i7];
                    i2[i7] = v;
                    accessEntry(i7);
                    return v2;
                }
            }
            i = b;
            mo34553j(i4);
            insertEntry(i3, k, v, c, i);
            this.f24834e = i4;
            incrementModCount();
            return null;
        } else if (i4 > b) {
            k2 = mo34554k(b, tl0.m52348e(b), c, i3);
        } else {
            tl0.m52352i(mo34547h(), i5, i4);
            i = b;
            mo34553j(i4);
            insertEntry(i3, k, v, c, i);
            this.f24834e = i4;
            incrementModCount();
            return null;
        }
        i = k2;
        mo34553j(i4);
        insertEntry(i3, k, v, c, i);
        this.f24834e = i4;
        incrementModCount();
        return null;
    }

    /* renamed from: q */
    public final V mo34564q(int i) {
        return mo34548i()[i];
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        V e = mo34539e(obj);
        if (e == f24831s) {
            return null;
        }
        return e;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(mo34542f(), i);
        this.keys = Arrays.copyOf(mo34544g(), i);
        this.values = Arrays.copyOf(mo34548i(), i);
    }

    public int size() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.f24834e;
    }

    public void trimToSize() {
        if (!needsAllocArrays()) {
            Map delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                Map createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
                createHashFloodingResistantDelegate.putAll(delegateOrNull);
                this.f24832a = createHashFloodingResistantDelegate;
                return;
            }
            int i = this.f24834e;
            if (i < mo34542f().length) {
                resizeEntries(i);
            }
            int j = tl0.m52353j(i);
            int b = mo34527b();
            if (j < b) {
                mo34554k(b, j, 0, 0);
            }
        }
    }

    public Collection<V> values() {
        Collection<V> collection = this.f24837r;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.f24837r = createValues;
        return createValues;
    }

    public Iterator<V> valuesIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.values().iterator();
        }
        return new C4525c();
    }

    public CompactHashMap(int i) {
        init(i);
    }

    /* renamed from: com.google.common.collect.CompactHashMap$e */
    public abstract class C4527e<T> implements Iterator<T> {

        /* renamed from: a */
        public int f24842a;

        /* renamed from: d */
        public int f24843d;

        /* renamed from: e */
        public int f24844e;

        public C4527e() {
            this.f24842a = CompactHashMap.this.f24833d;
            this.f24843d = CompactHashMap.this.firstEntryIndex();
            this.f24844e = -1;
        }

        /* renamed from: a */
        public final void mo34578a() {
            if (CompactHashMap.this.f24833d != this.f24842a) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public abstract T mo34571b(int i);

        /* renamed from: c */
        public void mo34579c() {
            this.f24842a += 32;
        }

        public boolean hasNext() {
            if (this.f24843d >= 0) {
                return true;
            }
            return false;
        }

        public T next() {
            mo34578a();
            if (hasNext()) {
                int i = this.f24843d;
                this.f24844e = i;
                T b = mo34571b(i);
                this.f24843d = CompactHashMap.this.getSuccessor(this.f24843d);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            mo34578a();
            if (this.f24844e >= 0) {
                z = true;
            } else {
                z = false;
            }
            ki0.m47102d(z);
            mo34579c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.mo34537d(this.f24844e));
            this.f24843d = CompactHashMap.this.adjustAfterRemove(this.f24843d, this.f24844e);
            this.f24844e = -1;
        }

        public /* synthetic */ C4527e(CompactHashMap compactHashMap, C4523a aVar) {
            this();
        }
    }
}
