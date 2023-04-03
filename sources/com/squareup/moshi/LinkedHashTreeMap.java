package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: a */
    public static final Comparator<Comparable> f26672a = new C5373a();
    public final Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.C6956d entrySet;
    public final C5381g<K, V> header;
    private LinkedHashTreeMap<K, V>.C7006e keySet;
    public int modCount;
    public int size;
    public C5381g<K, V>[] table;
    public int threshold;

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$a */
    public class C5373a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$b */
    public static final class C5374b<K, V> {

        /* renamed from: a */
        public C5381g<K, V> f26673a;

        /* renamed from: b */
        public int f26674b;

        /* renamed from: c */
        public int f26675c;

        /* renamed from: d */
        public int f26676d;

        /* renamed from: a */
        public void mo39317a(C5381g<K, V> gVar) {
            gVar.f26688e = null;
            gVar.f26686a = null;
            gVar.f26687d = null;
            gVar.f26694y = 1;
            int i = this.f26674b;
            if (i > 0) {
                int i2 = this.f26676d;
                if ((i2 & 1) == 0) {
                    this.f26676d = i2 + 1;
                    this.f26674b = i - 1;
                    this.f26675c++;
                }
            }
            gVar.f26686a = this.f26673a;
            this.f26673a = gVar;
            int i3 = this.f26676d + 1;
            this.f26676d = i3;
            int i4 = this.f26674b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f26676d = i3 + 1;
                this.f26674b = i4 - 1;
                this.f26675c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f26676d & i6) == i6) {
                    int i7 = this.f26675c;
                    if (i7 == 0) {
                        C5381g<K, V> gVar2 = this.f26673a;
                        C5381g<K, V> gVar3 = gVar2.f26686a;
                        C5381g<K, V> gVar4 = gVar3.f26686a;
                        gVar3.f26686a = gVar4.f26686a;
                        this.f26673a = gVar3;
                        gVar3.f26687d = gVar4;
                        gVar3.f26688e = gVar2;
                        gVar3.f26694y = gVar2.f26694y + 1;
                        gVar4.f26686a = gVar3;
                        gVar2.f26686a = gVar3;
                    } else if (i7 == 1) {
                        C5381g<K, V> gVar5 = this.f26673a;
                        C5381g<K, V> gVar6 = gVar5.f26686a;
                        this.f26673a = gVar6;
                        gVar6.f26688e = gVar5;
                        gVar6.f26694y = gVar5.f26694y + 1;
                        gVar5.f26686a = gVar6;
                        this.f26675c = 0;
                    } else if (i7 == 2) {
                        this.f26675c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo39318b(int i) {
            this.f26674b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f26676d = 0;
            this.f26675c = 0;
            this.f26673a = null;
        }

        /* renamed from: c */
        public C5381g<K, V> mo39319c() {
            C5381g<K, V> gVar = this.f26673a;
            if (gVar.f26686a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c */
    public static class C5375c<K, V> {

        /* renamed from: a */
        public C5381g<K, V> f26677a;

        /* renamed from: a */
        public C5381g<K, V> mo39320a() {
            C5381g<K, V> gVar = this.f26677a;
            if (gVar == null) {
                return null;
            }
            C5381g<K, V> gVar2 = gVar.f26686a;
            gVar.f26686a = null;
            C5381g<K, V> gVar3 = gVar.f26688e;
            while (true) {
                C5381g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C5381g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f26686a = gVar5;
                    gVar3 = gVar2.f26687d;
                } else {
                    this.f26677a = gVar5;
                    return gVar;
                }
            }
        }

        /* renamed from: b */
        public void mo39321b(C5381g<K, V> gVar) {
            C5381g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f26686a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f26687d;
            }
            this.f26677a = gVar2;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d */
    public final class C5376d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d$a */
        public class C5377a extends LinkedHashTreeMap<K, V>.C7059f<Map.Entry<K, V>> {
            public C5377a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo39335a();
            }
        }

        public C5376d() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5377a();
        }

        public boolean remove(Object obj) {
            C5381g findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$e */
    public final class C5378e extends AbstractSet<K> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$e$a */
        public class C5379a extends LinkedHashTreeMap<K, V>.C7059f<K> {
            public C5379a() {
                super();
            }

            public K next() {
                return mo39335a().f26691r;
            }
        }

        public C5378e() {
        }

        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C5379a();
        }

        public boolean remove(Object obj) {
            if (LinkedHashTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }

        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$f */
    public abstract class C5380f<T> implements Iterator<T> {

        /* renamed from: a */
        public C5381g<K, V> f26682a;

        /* renamed from: d */
        public C5381g<K, V> f26683d = null;

        /* renamed from: e */
        public int f26684e;

        public C5380f() {
            this.f26682a = LinkedHashTreeMap.this.header.f26689g;
            this.f26684e = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: a */
        public final C5381g<K, V> mo39335a() {
            C5381g<K, V> gVar = this.f26682a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.modCount == this.f26684e) {
                this.f26682a = gVar.f26689g;
                this.f26683d = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            if (this.f26682a != LinkedHashTreeMap.this.header) {
                return true;
            }
            return false;
        }

        public final void remove() {
            C5381g<K, V> gVar = this.f26683d;
            if (gVar != null) {
                LinkedHashTreeMap.this.removeInternal(gVar, true);
                this.f26683d = null;
                this.f26684e = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<LinkedHashTreeMap> cls = LinkedHashTreeMap.class;
    }

    public LinkedHashTreeMap() {
        this((Comparator) null);
    }

    public static <K, V> C5381g<K, V>[] doubleCapacity(C5381g<K, V>[] gVarArr) {
        C5381g<K, V> gVar;
        int length = gVarArr.length;
        C5381g<K, V>[] gVarArr2 = new C5381g[(length * 2)];
        C5375c cVar = new C5375c();
        C5374b bVar = new C5374b();
        C5374b bVar2 = new C5374b();
        for (int i = 0; i < length; i++) {
            C5381g<K, V> gVar2 = gVarArr[i];
            if (gVar2 != null) {
                cVar.mo39321b(gVar2);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C5381g a = cVar.mo39320a();
                    if (a == null) {
                        break;
                    } else if ((a.f26692s & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo39318b(i2);
                bVar2.mo39318b(i3);
                cVar.mo39321b(gVar2);
                while (true) {
                    C5381g a2 = cVar.mo39320a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f26692s & length) == 0) {
                        bVar.mo39317a(a2);
                    } else {
                        bVar2.mo39317a(a2);
                    }
                }
                C5381g<K, V> gVar3 = null;
                if (i2 > 0) {
                    gVar = bVar.mo39319c();
                } else {
                    gVar = null;
                }
                gVarArr2[i] = gVar;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar3 = bVar2.mo39319c();
                }
                gVarArr2[i4] = gVar3;
            }
        }
        return gVarArr2;
    }

    /* renamed from: g */
    public static int m41531g(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final void mo39296a() {
        C5381g<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    /* renamed from: b */
    public final boolean mo39297b(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo39298c(C5381g<K, V> gVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (gVar != null) {
            C5381g<K, V> gVar2 = gVar.f26687d;
            C5381g<K, V> gVar3 = gVar.f26688e;
            int i5 = 0;
            if (gVar2 != null) {
                i = gVar2.f26694y;
            } else {
                i = 0;
            }
            if (gVar3 != null) {
                i2 = gVar3.f26694y;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C5381g<K, V> gVar4 = gVar3.f26687d;
                C5381g<K, V> gVar5 = gVar3.f26688e;
                if (gVar5 != null) {
                    i4 = gVar5.f26694y;
                } else {
                    i4 = 0;
                }
                if (gVar4 != null) {
                    i5 = gVar4.f26694y;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    mo39304f(gVar3);
                }
                mo39302e(gVar);
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C5381g<K, V> gVar6 = gVar2.f26687d;
                C5381g<K, V> gVar7 = gVar2.f26688e;
                if (gVar7 != null) {
                    i3 = gVar7.f26694y;
                } else {
                    i3 = 0;
                }
                if (gVar6 != null) {
                    i5 = gVar6.f26694y;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo39302e(gVar2);
                }
                mo39304f(gVar);
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                gVar.f26694y = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f26694y = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f26686a;
        }
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C5381g<K, V> gVar = this.header;
        C5381g<K, V> gVar2 = gVar.f26689g;
        while (gVar2 != gVar) {
            C5381g<K, V> gVar3 = gVar2.f26689g;
            gVar2.f26690k = null;
            gVar2.f26689g = null;
            gVar2 = gVar3;
        }
        gVar.f26690k = gVar;
        gVar.f26689g = gVar;
    }

    public boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo39301d(C5381g<K, V> gVar, C5381g<K, V> gVar2) {
        C5381g<K, V> gVar3 = gVar.f26686a;
        gVar.f26686a = null;
        if (gVar2 != null) {
            gVar2.f26686a = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f26692s;
            C5381g<K, V>[] gVarArr = this.table;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f26687d == gVar) {
            gVar3.f26687d = gVar2;
        } else {
            gVar3.f26688e = gVar2;
        }
    }

    /* renamed from: e */
    public final void mo39302e(C5381g<K, V> gVar) {
        int i;
        int i2;
        C5381g<K, V> gVar2 = gVar.f26687d;
        C5381g<K, V> gVar3 = gVar.f26688e;
        C5381g<K, V> gVar4 = gVar3.f26687d;
        C5381g<K, V> gVar5 = gVar3.f26688e;
        gVar.f26688e = gVar4;
        if (gVar4 != null) {
            gVar4.f26686a = gVar;
        }
        mo39301d(gVar, gVar3);
        gVar3.f26687d = gVar;
        gVar.f26686a = gVar3;
        int i3 = 0;
        if (gVar2 != null) {
            i = gVar2.f26694y;
        } else {
            i = 0;
        }
        if (gVar4 != null) {
            i2 = gVar4.f26694y;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.f26694y = max;
        if (gVar5 != null) {
            i3 = gVar5.f26694y;
        }
        gVar3.f26694y = Math.max(max, i3) + 1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.C6956d dVar = this.entrySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.C6956d dVar2 = new C5376d();
        this.entrySet = dVar2;
        return dVar2;
    }

    /* renamed from: f */
    public final void mo39304f(C5381g<K, V> gVar) {
        int i;
        int i2;
        C5381g<K, V> gVar2 = gVar.f26687d;
        C5381g<K, V> gVar3 = gVar.f26688e;
        C5381g<K, V> gVar4 = gVar2.f26687d;
        C5381g<K, V> gVar5 = gVar2.f26688e;
        gVar.f26687d = gVar5;
        if (gVar5 != null) {
            gVar5.f26686a = gVar;
        }
        mo39301d(gVar, gVar2);
        gVar2.f26688e = gVar;
        gVar.f26686a = gVar2;
        int i3 = 0;
        if (gVar3 != null) {
            i = gVar3.f26694y;
        } else {
            i = 0;
        }
        if (gVar5 != null) {
            i2 = gVar5.f26694y;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.f26694y = max;
        if (gVar4 != null) {
            i3 = gVar4.f26694y;
        }
        gVar2.f26694y = Math.max(max, i3) + 1;
    }

    public C5381g<K, V> find(K k, boolean z) {
        int i;
        C5381g<K, V> gVar;
        Comparable comparable;
        C5381g<K, V> gVar2;
        Comparator<? super K> comparator2 = this.comparator;
        C5381g<K, V>[] gVarArr = this.table;
        int g = m41531g(k.hashCode());
        int length = (gVarArr.length - 1) & g;
        C5381g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            if (comparator2 == f26672a) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(gVar3.f26691r);
                } else {
                    i = comparator2.compare(k, gVar3.f26691r);
                }
                if (i == 0) {
                    return gVar3;
                }
                if (i < 0) {
                    gVar2 = gVar3.f26687d;
                } else {
                    gVar2 = gVar3.f26688e;
                }
                if (gVar2 == null) {
                    break;
                }
                gVar3 = gVar2;
            }
        } else {
            i = 0;
        }
        C5381g<K, V> gVar4 = gVar3;
        int i2 = i;
        if (!z) {
            return null;
        }
        C5381g<K, V> gVar5 = this.header;
        if (gVar4 != null) {
            gVar = new C5381g<>(gVar4, k, g, gVar5, gVar5.f26690k);
            if (i2 < 0) {
                gVar4.f26687d = gVar;
            } else {
                gVar4.f26688e = gVar;
            }
            mo39298c(gVar4, true);
        } else if (comparator2 != f26672a || (k instanceof Comparable)) {
            gVar = new C5381g<>(gVar4, k, g, gVar5, gVar5.f26690k);
            gVarArr[length] = gVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            mo39296a();
        }
        this.modCount++;
        return gVar;
    }

    public C5381g<K, V> findByEntry(Map.Entry<?, ?> entry) {
        boolean z;
        C5381g<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !mo39297b(findByObject.f26693x, entry.getValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return findByObject;
        }
        return null;
    }

    public C5381g<K, V> findByObject(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C5381g findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f26693x;
        }
        return null;
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.C7006e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.C7006e eVar2 = new C5378e();
        this.keySet = eVar2;
        return eVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C5381g find = find(k, true);
            V v2 = find.f26693x;
            find.f26693x = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C5381g removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f26693x;
        }
        return null;
    }

    public void removeInternal(C5381g<K, V> gVar, boolean z) {
        C5381g<K, V> gVar2;
        int i;
        if (z) {
            C5381g<K, V> gVar3 = gVar.f26690k;
            gVar3.f26689g = gVar.f26689g;
            gVar.f26689g.f26690k = gVar3;
            gVar.f26690k = null;
            gVar.f26689g = null;
        }
        C5381g<K, V> gVar4 = gVar.f26687d;
        C5381g<K, V> gVar5 = gVar.f26688e;
        C5381g<K, V> gVar6 = gVar.f26686a;
        int i2 = 0;
        if (gVar4 == null || gVar5 == null) {
            if (gVar4 != null) {
                mo39301d(gVar, gVar4);
                gVar.f26687d = null;
            } else if (gVar5 != null) {
                mo39301d(gVar, gVar5);
                gVar.f26688e = null;
            } else {
                mo39301d(gVar, (C5381g<K, V>) null);
            }
            mo39298c(gVar6, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (gVar4.f26694y > gVar5.f26694y) {
            gVar2 = gVar4.mo39339b();
        } else {
            gVar2 = gVar5.mo39338a();
        }
        removeInternal(gVar2, false);
        C5381g<K, V> gVar7 = gVar.f26687d;
        if (gVar7 != null) {
            i = gVar7.f26694y;
            gVar2.f26687d = gVar7;
            gVar7.f26686a = gVar2;
            gVar.f26687d = null;
        } else {
            i = 0;
        }
        C5381g<K, V> gVar8 = gVar.f26688e;
        if (gVar8 != null) {
            i2 = gVar8.f26694y;
            gVar2.f26688e = gVar8;
            gVar8.f26686a = gVar2;
            gVar.f26688e = null;
        }
        gVar2.f26694y = Math.max(i, i2) + 1;
        mo39301d(gVar, gVar2);
    }

    public C5381g<K, V> removeInternalByKey(Object obj) {
        C5381g<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? f26672a : comparator2;
        this.header = new C5381g<>();
        C5381g<K, V>[] gVarArr = new C5381g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$g */
    public static final class C5381g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C5381g<K, V> f26686a;

        /* renamed from: d */
        public C5381g<K, V> f26687d;

        /* renamed from: e */
        public C5381g<K, V> f26688e;

        /* renamed from: g */
        public C5381g<K, V> f26689g;

        /* renamed from: k */
        public C5381g<K, V> f26690k;

        /* renamed from: r */
        public final K f26691r;

        /* renamed from: s */
        public final int f26692s;

        /* renamed from: x */
        public V f26693x;

        /* renamed from: y */
        public int f26694y;

        public C5381g() {
            this.f26691r = null;
            this.f26692s = -1;
            this.f26690k = this;
            this.f26689g = this;
        }

        /* renamed from: a */
        public C5381g<K, V> mo39338a() {
            C5381g<K, V> gVar = this;
            for (C5381g<K, V> gVar2 = this.f26687d; gVar2 != null; gVar2 = gVar2.f26687d) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C5381g<K, V> mo39339b() {
            C5381g<K, V> gVar = this;
            for (C5381g<K, V> gVar2 = this.f26688e; gVar2 != null; gVar2 = gVar2.f26688e) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f26691r
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f26693x
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.C5381g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f26691r;
        }

        public V getValue() {
            return this.f26693x;
        }

        public int hashCode() {
            int i;
            K k = this.f26691r;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f26693x;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f26693x;
            this.f26693x = v;
            return v2;
        }

        public String toString() {
            return this.f26691r + "=" + this.f26693x;
        }

        public C5381g(C5381g<K, V> gVar, K k, int i, C5381g<K, V> gVar2, C5381g<K, V> gVar3) {
            this.f26686a = gVar;
            this.f26691r = k;
            this.f26692s = i;
            this.f26694y = 1;
            this.f26689g = gVar2;
            this.f26690k = gVar3;
            gVar3.f26689g = this;
            gVar2.f26690k = this;
        }
    }
}
