package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.C4566h;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class MapMakerInternalMap<K, V, E extends C4566h<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final long CLEANUP_EXECUTOR_DELAY_SECS = 60;
    public static final int CONTAINS_VALUE_RETRIES = 3;
    public static final int DRAIN_MAX = 16;
    public static final int DRAIN_THRESHOLD = 63;
    public static final int MAXIMUM_CAPACITY = 1073741824;
    public static final int MAX_SEGMENTS = 65536;
    public static final C4586v<Object, Object, C4562d> UNSET_WEAK_VALUE_REFERENCE = new C4559a();
    private static final long serialVersionUID = 5;
    public final int concurrencyLevel;
    public final transient C4567i<K, V, E, S> entryHelper;
    @NullableDecl
    public transient Set<Map.Entry<K, V>> entrySet;
    public final Equivalence<Object> keyEquivalence;
    @NullableDecl
    public transient Set<K> keySet;
    public final transient int segmentMask;
    public final transient int segmentShift;
    public final transient Segment<K, V, E, S>[] segments;
    @NullableDecl
    public transient Collection<V> values;

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).mo34855i();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }
    }

    public enum Strength {
        STRONG {
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        WEAK {
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C4571m<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C4571m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public StrongKeyDummyValueSegment<K> self() {
            return this;
        }

        public C4571m<K> castForTesting(C4566h<K, MapMaker.Dummy, ?> hVar) {
            return (C4571m) hVar;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, C4573n<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, C4573n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }

        public C4573n<K, V> castForTesting(C4566h<K, V, ?> hVar) {
            return (C4573n) hVar;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, C4575o<K, V>, StrongKeyWeakValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, C4575o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        public C4586v<K, V, C4575o<K, V>> getWeakValueReferenceForTesting(C4566h<K, V, ?> hVar) {
            return castForTesting((C4566h) hVar).mo34994a();
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForValues);
        }

        public void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        public C4586v<K, V, C4575o<K, V>> newWeakValueReferenceForTesting(C4566h<K, V, ?> hVar, V v) {
            return new C4587w(this.queueForValues, v, castForTesting((C4566h) hVar));
        }

        public StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }

        public void setWeakValueReferenceForTesting(C4566h<K, V, ?> hVar, C4586v<K, V, ? extends C4566h<K, V, ?>> vVar) {
            C4575o castForTesting = castForTesting((C4566h) hVar);
            C4586v c = castForTesting.f24944d;
            C4586v unused = castForTesting.f24944d = vVar;
            c.clear();
        }

        public C4575o<K, V> castForTesting(C4566h<K, V, ?> hVar) {
            return (C4575o) hVar;
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C4579r<K>, WeakKeyDummyValueSegment<K>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C4579r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        public WeakKeyDummyValueSegment<K> self() {
            return this;
        }

        public C4579r<K> castForTesting(C4566h<K, MapMaker.Dummy, ?> hVar) {
            return (C4579r) hVar;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, C4581s<K, V>, WeakKeyStrongValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, C4581s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        public WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }

        public C4581s<K, V> castForTesting(C4566h<K, V, ?> hVar) {
            return (C4581s) hVar;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, C4583t<K, V>, WeakKeyWeakValueSegment<K, V>> {
        /* access modifiers changed from: private */
        public final ReferenceQueue<K> queueForKeys = new ReferenceQueue<>();
        /* access modifiers changed from: private */
        public final ReferenceQueue<V> queueForValues = new ReferenceQueue<>();

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, C4583t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        public C4586v<K, V, C4583t<K, V>> getWeakValueReferenceForTesting(C4566h<K, V, ?> hVar) {
            return castForTesting((C4566h) hVar).mo34994a();
        }

        public void maybeClearReferenceQueues() {
            clearReferenceQueue(this.queueForKeys);
        }

        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        public C4586v<K, V, C4583t<K, V>> newWeakValueReferenceForTesting(C4566h<K, V, ?> hVar, V v) {
            return new C4587w(this.queueForValues, v, castForTesting((C4566h) hVar));
        }

        public WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }

        public void setWeakValueReferenceForTesting(C4566h<K, V, ?> hVar, C4586v<K, V, ? extends C4566h<K, V, ?>> vVar) {
            C4583t castForTesting = castForTesting((C4566h) hVar);
            C4586v c = castForTesting.f24950c;
            C4586v unused = castForTesting.f24950c = vVar;
            c.clear();
        }

        public C4583t<K, V> castForTesting(C4566h<K, V, ?> hVar) {
            return (C4583t) hVar;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$a */
    public class C4559a implements C4586v<Object, Object, C4562d> {
        /* renamed from: c */
        public C4586v<Object, Object, C4562d> mo34942b(ReferenceQueue<Object> referenceQueue, C4562d dVar) {
            return this;
        }

        public void clear() {
        }

        /* renamed from: d */
        public C4562d mo34941a() {
            return null;
        }

        public Object get() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$b */
    public static abstract class C4560b<K, V, E extends C4566h<K, V, E>> implements C4566h<K, V, E> {

        /* renamed from: a */
        public final K f24926a;

        /* renamed from: b */
        public final int f24927b;
        @NullableDecl

        /* renamed from: c */
        public final E f24928c;

        public C4560b(K k, int i, @NullableDecl E e) {
            this.f24926a = k;
            this.f24927b = i;
            this.f24928c = e;
        }

        /* renamed from: b */
        public E mo34947b() {
            return this.f24928c;
        }

        public int getHash() {
            return this.f24927b;
        }

        public K getKey() {
            return this.f24926a;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$c */
    public static abstract class C4561c<K, V, E extends C4566h<K, V, E>> extends WeakReference<K> implements C4566h<K, V, E> {

        /* renamed from: a */
        public final int f24929a;
        @NullableDecl

        /* renamed from: b */
        public final E f24930b;

        public C4561c(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl E e) {
            super(k, referenceQueue);
            this.f24929a = i;
            this.f24930b = e;
        }

        /* renamed from: b */
        public E mo34947b() {
            return this.f24930b;
        }

        public int getHash() {
            return this.f24929a;
        }

        public K getKey() {
            return get();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$d */
    public static final class C4562d implements C4566h<Object, Object, C4562d> {
        public C4562d() {
            throw new AssertionError();
        }

        /* renamed from: c */
        public C4562d mo34947b() {
            throw new AssertionError();
        }

        public int getHash() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$e */
    public final class C4563e extends MapMakerInternalMap<K, V, E, S>.C7109g<Map.Entry<K, V>> {
        public C4563e(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return mo34962c();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$f */
    public final class C4564f extends C4570l<Map.Entry<K, V>> {
        public C4564f() {
            super((C4559a) null);
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0028
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                com.google.common.base.Equivalence r2 = r2.valueEquivalence()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L_0x0028
                r1 = 1
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.C4564f.contains(java.lang.Object):boolean");
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4563e(MapMakerInternalMap.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.google.common.collect.MapMakerInternalMap r2 = com.google.common.collect.MapMakerInternalMap.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.C4564f.remove(java.lang.Object):boolean");
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$g */
    public abstract class C4565g<T> implements Iterator<T> {

        /* renamed from: a */
        public int f24932a;

        /* renamed from: d */
        public int f24933d = -1;
        @NullableDecl

        /* renamed from: e */
        public Segment<K, V, E, S> f24934e;
        @NullableDecl

        /* renamed from: g */
        public AtomicReferenceArray<E> f24935g;
        @NullableDecl

        /* renamed from: k */
        public E f24936k;
        @NullableDecl

        /* renamed from: r */
        public MapMakerInternalMap<K, V, E, S>.C9576x f24937r;
        @NullableDecl

        /* renamed from: s */
        public MapMakerInternalMap<K, V, E, S>.C9576x f24938s;

        public C4565g() {
            this.f24932a = MapMakerInternalMap.this.segments.length - 1;
            mo34960a();
        }

        /* renamed from: a */
        public final void mo34960a() {
            this.f24937r = null;
            if (!mo34963d() && !mo34964f()) {
                while (true) {
                    int i = this.f24932a;
                    if (i >= 0) {
                        Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.segments;
                        this.f24932a = i - 1;
                        Segment<K, V, E, S> segment = segmentArr[i];
                        this.f24934e = segment;
                        if (segment.count != 0) {
                            AtomicReferenceArray<E> atomicReferenceArray = this.f24934e.table;
                            this.f24935g = atomicReferenceArray;
                            this.f24933d = atomicReferenceArray.length() - 1;
                            if (mo34964f()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean mo34961b(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object liveValue = MapMakerInternalMap.this.getLiveValue(e);
                if (liveValue != null) {
                    this.f24937r = new C4588x(key, liveValue);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f24934e.postReadCleanup();
            }
        }

        /* renamed from: c */
        public MapMakerInternalMap<K, V, E, S>.C9576x mo34962c() {
            MapMakerInternalMap<K, V, E, S>.C9576x xVar = this.f24937r;
            if (xVar != null) {
                this.f24938s = xVar;
                mo34960a();
                return this.f24938s;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public boolean mo34963d() {
            E e = this.f24936k;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f24936k = e.mo34947b();
                E e2 = this.f24936k;
                if (e2 == null) {
                    return false;
                }
                if (mo34961b(e2)) {
                    return true;
                }
                e = this.f24936k;
            }
        }

        /* renamed from: f */
        public boolean mo34964f() {
            while (true) {
                int i = this.f24933d;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f24935g;
                this.f24933d = i - 1;
                E e = (C4566h) atomicReferenceArray.get(i);
                this.f24936k = e;
                if (e != null && (mo34961b(e) || mo34963d())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            if (this.f24937r != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            boolean z;
            if (this.f24938s != null) {
                z = true;
            } else {
                z = false;
            }
            ki0.m47102d(z);
            MapMakerInternalMap.this.remove(this.f24938s.getKey());
            this.f24938s = null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$h */
    public interface C4566h<K, V, E extends C4566h<K, V, E>> {
        /* renamed from: b */
        E mo34947b();

        int getHash();

        K getKey();

        V getValue();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$i */
    public interface C4567i<K, V, E extends C4566h<K, V, E>, S extends Segment<K, V, E, S>> {
        /* renamed from: a */
        E mo34967a(S s, E e, @NullableDecl E e2);

        /* renamed from: b */
        Strength mo34968b();

        /* renamed from: c */
        void mo34969c(S s, E e, V v);

        /* renamed from: d */
        E mo34970d(S s, K k, int i, @NullableDecl E e);

        /* renamed from: e */
        Strength mo34971e();

        /* renamed from: f */
        S mo34972f(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$j */
    public final class C4568j extends MapMakerInternalMap<K, V, E, S>.C7109g<K> {
        public C4568j(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public K next() {
            return mo34962c().getKey();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$k */
    public final class C4569k extends C4570l<K> {
        public C4569k() {
            super((C4559a) null);
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new C4568j(MapMakerInternalMap.this);
        }

        public boolean remove(Object obj) {
            if (MapMakerInternalMap.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$l */
    public static abstract class C4570l<E> extends AbstractSet<E> {
        public C4570l() {
        }

        public Object[] toArray() {
            return MapMakerInternalMap.m36808a(this).toArray();
        }

        public /* synthetic */ C4570l(C4559a aVar) {
            this();
        }

        public <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.m36808a(this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$m */
    public static final class C4571m<K> extends C4560b<K, MapMaker.Dummy, C4571m<K>> {

        /* renamed from: com.google.common.collect.MapMakerInternalMap$m$a */
        public static final class C4572a<K> implements C4567i<K, MapMaker.Dummy, C4571m<K>, StrongKeyDummyValueSegment<K>> {

            /* renamed from: a */
            public static final C4572a<?> f24941a = new C4572a<>();

            /* renamed from: h */
            public static <K> C4572a<K> m36833h() {
                return f24941a;
            }

            /* renamed from: b */
            public Strength mo34968b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo34971e() {
                return Strength.STRONG;
            }

            /* renamed from: g */
            public C4571m<K> mo34967a(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, C4571m<K> mVar, @NullableDecl C4571m<K> mVar2) {
                return mVar.mo34982c(mVar2);
            }

            /* renamed from: i */
            public C4571m<K> mo34970d(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, @NullableDecl C4571m<K> mVar) {
                return new C4571m<>(k, i, mVar);
            }

            /* renamed from: j */
            public StrongKeyDummyValueSegment<K> mo34972f(MapMakerInternalMap<K, MapMaker.Dummy, C4571m<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo34969c(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, C4571m<K> mVar, MapMaker.Dummy dummy) {
            }
        }

        public C4571m(K k, int i, @NullableDecl C4571m<K> mVar) {
            super(k, i, mVar);
        }

        /* renamed from: c */
        public C4571m<K> mo34982c(C4571m<K> mVar) {
            return new C4571m<>(this.f24926a, this.f24927b, mVar);
        }

        /* renamed from: d */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$n */
    public static final class C4573n<K, V> extends C4560b<K, V, C4573n<K, V>> {
        @NullableDecl

        /* renamed from: d */
        public volatile V f24942d = null;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$n$a */
        public static final class C4574a<K, V> implements C4567i<K, V, C4573n<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            public static final C4574a<?, ?> f24943a = new C4574a<>();

            /* renamed from: h */
            public static <K, V> C4574a<K, V> m36846h() {
                return f24943a;
            }

            /* renamed from: b */
            public Strength mo34968b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo34971e() {
                return Strength.STRONG;
            }

            /* renamed from: g */
            public C4573n<K, V> mo34967a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, C4573n<K, V> nVar, @NullableDecl C4573n<K, V> nVar2) {
                return nVar.mo34988c(nVar2);
            }

            /* renamed from: i */
            public C4573n<K, V> mo34970d(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, @NullableDecl C4573n<K, V> nVar) {
                return new C4573n<>(k, i, nVar);
            }

            /* renamed from: j */
            public StrongKeyStrongValueSegment<K, V> mo34972f(MapMakerInternalMap<K, V, C4573n<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo34969c(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, C4573n<K, V> nVar, V v) {
                nVar.mo34989d(v);
            }
        }

        public C4573n(K k, int i, @NullableDecl C4573n<K, V> nVar) {
            super(k, i, nVar);
        }

        /* renamed from: c */
        public C4573n<K, V> mo34988c(C4573n<K, V> nVar) {
            C4573n<K, V> nVar2 = new C4573n<>(this.f24926a, this.f24927b, nVar);
            nVar2.f24942d = this.f24942d;
            return nVar2;
        }

        /* renamed from: d */
        public void mo34989d(V v) {
            this.f24942d = v;
        }

        @NullableDecl
        public V getValue() {
            return this.f24942d;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$o */
    public static final class C4575o<K, V> extends C4560b<K, V, C4575o<K, V>> implements C4585u<K, V, C4575o<K, V>> {

        /* renamed from: d */
        public volatile C4586v<K, V, C4575o<K, V>> f24944d = MapMakerInternalMap.unsetWeakValueReference();

        /* renamed from: com.google.common.collect.MapMakerInternalMap$o$a */
        public static final class C4576a<K, V> implements C4567i<K, V, C4575o<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            public static final C4576a<?, ?> f24945a = new C4576a<>();

            /* renamed from: h */
            public static <K, V> C4576a<K, V> m36862h() {
                return f24945a;
            }

            /* renamed from: b */
            public Strength mo34968b() {
                return Strength.WEAK;
            }

            /* renamed from: e */
            public Strength mo34971e() {
                return Strength.STRONG;
            }

            /* renamed from: g */
            public C4575o<K, V> mo34967a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, C4575o<K, V> oVar, @NullableDecl C4575o<K, V> oVar2) {
                if (Segment.isCollected(oVar)) {
                    return null;
                }
                return oVar.mo34995e(strongKeyWeakValueSegment.queueForValues, oVar2);
            }

            /* renamed from: i */
            public C4575o<K, V> mo34970d(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, @NullableDecl C4575o<K, V> oVar) {
                return new C4575o<>(k, i, oVar);
            }

            /* renamed from: j */
            public StrongKeyWeakValueSegment<K, V> mo34972f(MapMakerInternalMap<K, V, C4575o<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo34969c(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, C4575o<K, V> oVar, V v) {
                oVar.mo34996f(v, strongKeyWeakValueSegment.queueForValues);
            }
        }

        public C4575o(K k, int i, @NullableDecl C4575o<K, V> oVar) {
            super(k, i, oVar);
        }

        /* renamed from: a */
        public C4586v<K, V, C4575o<K, V>> mo34994a() {
            return this.f24944d;
        }

        /* renamed from: e */
        public C4575o<K, V> mo34995e(ReferenceQueue<V> referenceQueue, C4575o<K, V> oVar) {
            C4575o<K, V> oVar2 = new C4575o<>(this.f24926a, this.f24927b, oVar);
            oVar2.f24944d = this.f24944d.mo34942b(referenceQueue, oVar2);
            return oVar2;
        }

        /* renamed from: f */
        public void mo34996f(V v, ReferenceQueue<V> referenceQueue) {
            C4586v<K, V, C4575o<K, V>> vVar = this.f24944d;
            this.f24944d = new C4587w(referenceQueue, v, this);
            vVar.clear();
        }

        public V getValue() {
            return this.f24944d.get();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$p */
    public final class C4577p extends MapMakerInternalMap<K, V, E, S>.C7109g<V> {
        public C4577p(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        public V next() {
            return mo34962c().getValue();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$q */
    public final class C4578q extends AbstractCollection<V> {
        public C4578q() {
        }

        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new C4577p(MapMakerInternalMap.this);
        }

        public int size() {
            return MapMakerInternalMap.this.size();
        }

        public Object[] toArray() {
            return MapMakerInternalMap.m36808a(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return MapMakerInternalMap.m36808a(this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$r */
    public static final class C4579r<K> extends C4561c<K, MapMaker.Dummy, C4579r<K>> {

        /* renamed from: com.google.common.collect.MapMakerInternalMap$r$a */
        public static final class C4580a<K> implements C4567i<K, MapMaker.Dummy, C4579r<K>, WeakKeyDummyValueSegment<K>> {

            /* renamed from: a */
            public static final C4580a<?> f24947a = new C4580a<>();

            /* renamed from: h */
            public static <K> C4580a<K> m36875h() {
                return f24947a;
            }

            /* renamed from: b */
            public Strength mo34968b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo34971e() {
                return Strength.WEAK;
            }

            /* renamed from: g */
            public C4579r<K> mo34967a(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, C4579r<K> rVar, @NullableDecl C4579r<K> rVar2) {
                if (rVar.getKey() == null) {
                    return null;
                }
                return rVar.mo35009c(weakKeyDummyValueSegment.queueForKeys, rVar2);
            }

            /* renamed from: i */
            public C4579r<K> mo34970d(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, @NullableDecl C4579r<K> rVar) {
                return new C4579r<>(weakKeyDummyValueSegment.queueForKeys, k, i, rVar);
            }

            /* renamed from: j */
            public WeakKeyDummyValueSegment<K> mo34972f(MapMakerInternalMap<K, MapMaker.Dummy, C4579r<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo34969c(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, C4579r<K> rVar, MapMaker.Dummy dummy) {
            }
        }

        public C4579r(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl C4579r<K> rVar) {
            super(referenceQueue, k, i, rVar);
        }

        /* renamed from: c */
        public C4579r<K> mo35009c(ReferenceQueue<K> referenceQueue, C4579r<K> rVar) {
            return new C4579r<>(referenceQueue, getKey(), this.f24929a, rVar);
        }

        /* renamed from: d */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$s */
    public static final class C4581s<K, V> extends C4561c<K, V, C4581s<K, V>> {
        @NullableDecl

        /* renamed from: c */
        public volatile V f24948c = null;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$s$a */
        public static final class C4582a<K, V> implements C4567i<K, V, C4581s<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            public static final C4582a<?, ?> f24949a = new C4582a<>();

            /* renamed from: h */
            public static <K, V> C4582a<K, V> m36888h() {
                return f24949a;
            }

            /* renamed from: b */
            public Strength mo34968b() {
                return Strength.STRONG;
            }

            /* renamed from: e */
            public Strength mo34971e() {
                return Strength.WEAK;
            }

            /* renamed from: g */
            public C4581s<K, V> mo34967a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, C4581s<K, V> sVar, @NullableDecl C4581s<K, V> sVar2) {
                if (sVar.getKey() == null) {
                    return null;
                }
                return sVar.mo35015c(weakKeyStrongValueSegment.queueForKeys, sVar2);
            }

            /* renamed from: i */
            public C4581s<K, V> mo34970d(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, @NullableDecl C4581s<K, V> sVar) {
                return new C4581s<>(weakKeyStrongValueSegment.queueForKeys, k, i, sVar);
            }

            /* renamed from: j */
            public WeakKeyStrongValueSegment<K, V> mo34972f(MapMakerInternalMap<K, V, C4581s<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo34969c(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, C4581s<K, V> sVar, V v) {
                sVar.mo35016d(v);
            }
        }

        public C4581s(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl C4581s<K, V> sVar) {
            super(referenceQueue, k, i, sVar);
        }

        /* renamed from: c */
        public C4581s<K, V> mo35015c(ReferenceQueue<K> referenceQueue, C4581s<K, V> sVar) {
            C4581s<K, V> sVar2 = new C4581s<>(referenceQueue, getKey(), this.f24929a, sVar);
            sVar2.mo35016d(this.f24948c);
            return sVar2;
        }

        /* renamed from: d */
        public void mo35016d(V v) {
            this.f24948c = v;
        }

        @NullableDecl
        public V getValue() {
            return this.f24948c;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$t */
    public static final class C4583t<K, V> extends C4561c<K, V, C4583t<K, V>> implements C4585u<K, V, C4583t<K, V>> {

        /* renamed from: c */
        public volatile C4586v<K, V, C4583t<K, V>> f24950c = MapMakerInternalMap.unsetWeakValueReference();

        /* renamed from: com.google.common.collect.MapMakerInternalMap$t$a */
        public static final class C4584a<K, V> implements C4567i<K, V, C4583t<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            public static final C4584a<?, ?> f24951a = new C4584a<>();

            /* renamed from: h */
            public static <K, V> C4584a<K, V> m36904h() {
                return f24951a;
            }

            /* renamed from: b */
            public Strength mo34968b() {
                return Strength.WEAK;
            }

            /* renamed from: e */
            public Strength mo34971e() {
                return Strength.WEAK;
            }

            /* renamed from: g */
            public C4583t<K, V> mo34967a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, C4583t<K, V> tVar, @NullableDecl C4583t<K, V> tVar2) {
                if (tVar.getKey() != null && !Segment.isCollected(tVar)) {
                    return tVar.mo35021e(weakKeyWeakValueSegment.queueForKeys, weakKeyWeakValueSegment.queueForValues, tVar2);
                }
                return null;
            }

            /* renamed from: i */
            public C4583t<K, V> mo34970d(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, @NullableDecl C4583t<K, V> tVar) {
                return new C4583t<>(weakKeyWeakValueSegment.queueForKeys, k, i, tVar);
            }

            /* renamed from: j */
            public WeakKeyWeakValueSegment<K, V> mo34972f(MapMakerInternalMap<K, V, C4583t<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            /* renamed from: k */
            public void mo34969c(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, C4583t<K, V> tVar, V v) {
                tVar.mo35022f(v, weakKeyWeakValueSegment.queueForValues);
            }
        }

        public C4583t(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl C4583t<K, V> tVar) {
            super(referenceQueue, k, i, tVar);
        }

        /* renamed from: a */
        public C4586v<K, V, C4583t<K, V>> mo34994a() {
            return this.f24950c;
        }

        /* renamed from: e */
        public C4583t<K, V> mo35021e(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C4583t<K, V> tVar) {
            C4583t<K, V> tVar2 = new C4583t<>(referenceQueue, getKey(), this.f24929a, tVar);
            tVar2.f24950c = this.f24950c.mo34942b(referenceQueue2, tVar2);
            return tVar2;
        }

        /* renamed from: f */
        public void mo35022f(V v, ReferenceQueue<V> referenceQueue) {
            C4586v<K, V, C4583t<K, V>> vVar = this.f24950c;
            this.f24950c = new C4587w(referenceQueue, v, this);
            vVar.clear();
        }

        public V getValue() {
            return this.f24950c.get();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$u */
    public interface C4585u<K, V, E extends C4566h<K, V, E>> extends C4566h<K, V, E> {
        /* renamed from: a */
        C4586v<K, V, E> mo34994a();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$v */
    public interface C4586v<K, V, E extends C4566h<K, V, E>> {
        /* renamed from: a */
        E mo34941a();

        /* renamed from: b */
        C4586v<K, V, E> mo34942b(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        @NullableDecl
        V get();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$w */
    public static final class C4587w<K, V, E extends C4566h<K, V, E>> extends WeakReference<V> implements C4586v<K, V, E> {
        @Weak

        /* renamed from: a */
        public final E f24952a;

        public C4587w(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f24952a = e;
        }

        /* renamed from: a */
        public E mo34941a() {
            return this.f24952a;
        }

        /* renamed from: b */
        public C4586v<K, V, E> mo34942b(ReferenceQueue<V> referenceQueue, E e) {
            return new C4587w(referenceQueue, get(), e);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$x */
    public final class C4588x extends C6207l6<K, V> {

        /* renamed from: a */
        public final K f24953a;

        /* renamed from: d */
        public V f24954d;

        public C4588x(K k, V v) {
            this.f24953a = k;
            this.f24954d = v;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f24953a.equals(entry.getKey()) || !this.f24954d.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f24953a;
        }

        public V getValue() {
            return this.f24954d;
        }

        public int hashCode() {
            return this.f24953a.hashCode() ^ this.f24954d.hashCode();
        }

        public V setValue(V v) {
            V put = MapMakerInternalMap.this.put(this.f24953a, v);
            this.f24954d = v;
            return put;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, C4567i<K, V, E, S> iVar) {
        this.concurrencyLevel = Math.min(mapMaker.mo34848b(), 65536);
        this.keyEquivalence = mapMaker.mo34850d();
        this.entryHelper = iVar;
        int min = Math.min(mapMaker.mo34849c(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.concurrencyLevel) {
            i3++;
            i4 <<= 1;
        }
        this.segmentShift = 32 - i3;
        this.segmentMask = i4 - 1;
        this.segments = newSegmentArray(i4);
        int i5 = min / i4;
        while (i2 < (i4 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i < segmentArr.length) {
                segmentArr[i] = createSegment(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m36808a(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.m36764a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V> MapMakerInternalMap<K, V, ? extends C4566h<K, V, ?>, ?> create(MapMaker mapMaker) {
        Strength e = mapMaker.mo34851e();
        Strength strength = Strength.STRONG;
        if (e == strength && mapMaker.mo34852f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C4573n.C4574a.m36846h());
        }
        if (mapMaker.mo34851e() == strength && mapMaker.mo34852f() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, C4575o.C4576a.m36862h());
        }
        Strength e2 = mapMaker.mo34851e();
        Strength strength2 = Strength.WEAK;
        if (e2 == strength2 && mapMaker.mo34852f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C4581s.C4582a.m36888h());
        }
        if (mapMaker.mo34851e() == strength2 && mapMaker.mo34852f() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, C4583t.C4584a.m36904h());
        }
        throw new AssertionError();
    }

    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends C4566h<K, MapMaker.Dummy, ?>, ?> createWithDummyValues(MapMaker mapMaker) {
        Strength e = mapMaker.mo34851e();
        Strength strength = Strength.STRONG;
        if (e == strength && mapMaker.mo34852f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C4571m.C4572a.m36833h());
        }
        Strength e2 = mapMaker.mo34851e();
        Strength strength2 = Strength.WEAK;
        if (e2 == strength2 && mapMaker.mo34852f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C4579r.C4580a.m36875h());
        }
        if (mapMaker.mo34852f() == strength2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    public static int rehash(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public static <K, V, E extends C4566h<K, V, E>> C4586v<K, V, E> unsetWeakValueReference() {
        return UNSET_WEAK_VALUE_REFERENCE;
    }

    public void clear() {
        for (Segment<K, V, E, S> clear : this.segments) {
            clear.clear();
        }
    }

    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).containsKey(obj, hash);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        Object obj2 = obj;
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            int length = segmentArr.length;
            int i2 = z;
            while (i2 < length) {
                Segment<K, V, E, S> segment = segmentArr[i2];
                int i3 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    for (C4566h hVar = (C4566h) atomicReferenceArray.get(i4); hVar != null; hVar = hVar.mo34947b()) {
                        V liveValue = segment.getLiveValue(hVar);
                        if (liveValue != null && valueEquivalence().equivalent(obj2, liveValue)) {
                            return true;
                        }
                    }
                }
                j2 += (long) segment.modCount;
                i2++;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    public E copyEntry(E e, E e2) {
        return segmentFor(e.getHash()).copyEntry(e, e2);
    }

    public Segment<K, V, E, S> createSegment(int i, int i2) {
        return this.entryHelper.mo34972f(this, i, i2);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C4564f fVar = new C4564f();
        this.entrySet = fVar;
        return fVar;
    }

    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    public E getEntry(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).getEntry(obj, hash);
    }

    public V getLiveValue(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return e.getValue();
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    public boolean isLiveForTesting(C4566h<K, V, ?> hVar) {
        if (segmentFor(hVar.getHash()).getLiveValueForTesting(hVar) != null) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C4569k kVar = new C4569k();
        this.keySet = kVar;
        return kVar;
    }

    public Strength keyStrength() {
        return this.entryHelper.mo34971e();
    }

    public final Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    @CanIgnoreReturnValue
    public V put(K k, V v) {
        du4.m43691k(k);
        du4.m43691k(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    @CanIgnoreReturnValue
    public V putIfAbsent(K k, V v) {
        du4.m43691k(k);
        du4.m43691k(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    public void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    public void reclaimValue(C4586v<K, V, E> vVar) {
        E a = vVar.mo34941a();
        int hash = a.getHash();
        segmentFor(hash).reclaimValue(a.getKey(), hash, vVar);
    }

    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash);
    }

    @CanIgnoreReturnValue
    public boolean replace(K k, @NullableDecl V v, V v2) {
        du4.m43691k(k);
        du4.m43691k(v2);
        if (v == null) {
            return false;
        }
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v, v2);
    }

    public Segment<K, V, E, S> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    public int size() {
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (Segment<K, V, E, S> segment : segmentArr) {
            j += (long) segment.count;
        }
        return Ints.m37051j(j);
    }

    public Equivalence<Object> valueEquivalence() {
        return this.entryHelper.mo34968b().defaultEquivalence();
    }

    public Strength valueStrength() {
        return this.entryHelper.mo34968b();
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        C4578q qVar = new C4578q();
        this.values = qVar;
        return qVar;
    }

    public Object writeReplace() {
        return new SerializationProxy(this.entryHelper.mo34971e(), this.entryHelper.mo34968b(), this.keyEquivalence, this.entryHelper.mo34968b().defaultEquivalence(), this.concurrencyLevel, this);
    }

    public static abstract class AbstractSerializationProxy<K, V> extends e82<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public final int concurrencyLevel;
        public transient ConcurrentMap<K, V> delegate;
        public final Equivalence<Object> keyEquivalence;
        public final Strength keyStrength;
        public final Equivalence<Object> valueEquivalence;
        public final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }

        public void readEntries(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.delegate.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().mo34853g(objectInputStream.readInt()).mo34856j(this.keyStrength).mo34857k(this.valueStrength).mo34854h(this.keyEquivalence).mo34847a(this.concurrencyLevel);
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry next : this.delegate.entrySet()) {
                objectOutputStream.writeObject(next.getKey());
                objectOutputStream.writeObject(next.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }

        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }
    }

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash, obj2);
    }

    @CanIgnoreReturnValue
    public V replace(K k, V v) {
        du4.m43691k(k);
        du4.m43691k(v);
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v);
    }

    public static abstract class Segment<K, V, E extends C4566h<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public volatile int count;
        @Weak
        public final MapMakerInternalMap<K, V, E, S> map;
        public final int maxSegmentSize;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        @NullableDecl
        public volatile AtomicReferenceArray<E> table;
        public int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2) {
            this.map = mapMakerInternalMap;
            this.maxSegmentSize = i2;
            initTable(newEntryArray(i));
        }

        public static <K, V, E extends C4566h<K, V, E>> boolean isCollected(E e) {
            if (e.getValue() == null) {
                return true;
            }
            return false;
        }

        public abstract E castForTesting(C4566h<K, V, ?> hVar);

        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, (Object) null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        @CanIgnoreReturnValue
        public boolean clearValueForTesting(K k, int i, C4586v<K, V, ? extends C4566h<K, V, ?>> vVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4566h hVar = (C4566h) atomicReferenceArray.get(length);
                C4566h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.mo34947b();
                    } else if (((C4585u) hVar2).mo34994a() == vVar) {
                        atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count != 0) {
                    C4566h liveEntry = getLiveEntry(obj, i);
                    if (!(liveEntry == null || liveEntry.getValue() == null)) {
                        z = true;
                    }
                    return z;
                }
                postReadCleanup();
                return false;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (C4566h hVar = (C4566h) atomicReferenceArray.get(i); hVar != null; hVar = hVar.mo34947b()) {
                            Object liveValue = getLiveValue(hVar);
                            if (liveValue != null) {
                                if (this.map.valueEquivalence().equivalent(obj, liveValue)) {
                                    postReadCleanup();
                                    return true;
                                }
                            }
                        }
                    }
                }
                postReadCleanup();
                return false;
            } catch (Throwable th) {
                postReadCleanup();
                throw th;
            }
        }

        public E copyEntry(E e, E e2) {
            return this.map.entryHelper.mo34967a(self(), e, e2);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: type inference failed for: r4v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E copyForTesting(com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r4) {
            /*
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$i<K, V, E, S> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$h r3 = r2.castForTesting(r3)
                com.google.common.collect.MapMakerInternalMap$h r4 = r2.castForTesting(r4)
                com.google.common.collect.MapMakerInternalMap$h r3 = r0.mo34967a(r1, r3, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.copyForTesting(com.google.common.collect.MapMakerInternalMap$h, com.google.common.collect.MapMakerInternalMap$h):com.google.common.collect.MapMakerInternalMap$h");
        }

        @GuardedBy("this")
        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimKey((C4566h) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimValue((C4586v) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<E> newEntryArray = newEntryArray(length << 1);
                this.threshold = (newEntryArray.length() * 3) / 4;
                int length2 = newEntryArray.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C4566h hVar = (C4566h) atomicReferenceArray.get(i2);
                    if (hVar != null) {
                        C4566h b = hVar.mo34947b();
                        int hash = hVar.getHash() & length2;
                        if (b == null) {
                            newEntryArray.set(hash, hVar);
                        } else {
                            C4566h hVar2 = hVar;
                            while (b != null) {
                                int hash2 = b.getHash() & length2;
                                if (hash2 != hash) {
                                    hVar2 = b;
                                    hash = hash2;
                                }
                                b = b.mo34947b();
                            }
                            newEntryArray.set(hash, hVar2);
                            while (hVar != hVar2) {
                                int hash3 = hVar.getHash() & length2;
                                C4566h copyEntry = copyEntry(hVar, (C4566h) newEntryArray.get(hash3));
                                if (copyEntry != null) {
                                    newEntryArray.set(hash3, copyEntry);
                                } else {
                                    i--;
                                }
                                hVar = hVar.mo34947b();
                            }
                        }
                    }
                }
                this.table = newEntryArray;
                this.count = i;
            }
        }

        public V get(Object obj, int i) {
            try {
                C4566h liveEntry = getLiveEntry(obj, i);
                if (liveEntry == null) {
                    return null;
                }
                V value = liveEntry.getValue();
                if (value == null) {
                    tryDrainReferenceQueues();
                }
                postReadCleanup();
                return value;
            } finally {
                postReadCleanup();
            }
        }

        public E getEntry(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E first = getFirst(i); first != null; first = first.mo34947b()) {
                if (first.getHash() == i) {
                    Object key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public E getFirst(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            return (C4566h) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public E getLiveEntry(Object obj, int i) {
            return getEntry(obj, i);
        }

        @NullableDecl
        public V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V value = e.getValue();
            if (value != null) {
                return value;
            }
            tryDrainReferenceQueues();
            return null;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V getLiveValueForTesting(com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r1) {
            /*
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.castForTesting(r1)
                java.lang.Object r1 = r0.getLiveValue(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.getLiveValueForTesting(com.google.common.collect.MapMakerInternalMap$h):java.lang.Object");
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public C4586v<K, V, E> getWeakValueReferenceForTesting(C4566h<K, V, ?> hVar) {
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (length == this.maxSegmentSize) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        public void maybeClearReferenceQueues() {
        }

        @GuardedBy("this")
        public void maybeDrainReferenceQueues() {
        }

        public AtomicReferenceArray<E> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E newEntryForTesting(K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r5) {
            /*
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$i<K, V, E, S> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$h r5 = r2.castForTesting(r5)
                com.google.common.collect.MapMakerInternalMap$h r3 = r0.mo34970d(r1, r3, r4, r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.newEntryForTesting(java.lang.Object, int, com.google.common.collect.MapMakerInternalMap$h):com.google.common.collect.MapMakerInternalMap$h");
        }

        public C4586v<K, V, E> newWeakValueReferenceForTesting(C4566h<K, V, ?> hVar, V v) {
            throw new AssertionError();
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        @GuardedBy("this")
        public void preWriteCleanup() {
            runLockedCleanup();
        }

        public V put(K k, int i, V v, boolean z) {
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4566h hVar = (C4566h) atomicReferenceArray.get(length);
                C4566h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.mo34947b();
                    } else {
                        V value = hVar2.getValue();
                        if (value == null) {
                            this.modCount++;
                            setValue(hVar2, v);
                            this.count = this.count;
                            return null;
                        } else if (z) {
                            unlock();
                            return value;
                        } else {
                            this.modCount++;
                            setValue(hVar2, v);
                            unlock();
                            return value;
                        }
                    }
                }
                this.modCount++;
                E d = this.map.entryHelper.mo34970d(self(), k, i, hVar);
                setValue(d, v);
                atomicReferenceArray.set(length, d);
                this.count = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public boolean reclaimKey(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = (C4566h) atomicReferenceArray.get(length);
                for (E e3 = e2; e3 != null; e3 = e3.mo34947b()) {
                    if (e3 == e) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(e2, e3));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public boolean reclaimValue(K k, int i, C4586v<K, V, E> vVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4566h hVar = (C4566h) atomicReferenceArray.get(length);
                C4566h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.mo34947b();
                    } else if (((C4585u) hVar2).mo34994a() == vVar) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                        this.count--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public V remove(Object obj, int i) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4566h hVar = (C4566h) atomicReferenceArray.get(length);
                C4566h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(obj, key)) {
                        hVar2 = hVar2.mo34947b();
                    } else {
                        V value = hVar2.getValue();
                        if (value == null) {
                            if (!isCollected(hVar2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                        this.count--;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        @GuardedBy("this")
        public boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e2 = (C4566h) atomicReferenceArray.get(length);
            for (E e3 = e2; e3 != null; e3 = e3.mo34947b()) {
                if (e3 == e) {
                    this.modCount++;
                    atomicReferenceArray.set(length, removeFromChain(e2, e3));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("this")
        public E removeFromChain(E e, E e2) {
            int i = this.count;
            E b = e2.mo34947b();
            while (e != e2) {
                E copyEntry = copyEntry(e, b);
                if (copyEntry != null) {
                    b = copyEntry;
                } else {
                    i--;
                }
                e = e.mo34947b();
            }
            this.count = i;
            return b;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E removeFromChainForTesting(com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r1, com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r2) {
            /*
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.castForTesting(r1)
                com.google.common.collect.MapMakerInternalMap$h r2 = r0.castForTesting(r2)
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.removeFromChain(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.removeFromChainForTesting(com.google.common.collect.MapMakerInternalMap$h, com.google.common.collect.MapMakerInternalMap$h):com.google.common.collect.MapMakerInternalMap$h");
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean removeTableEntryForTesting(com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r1) {
            /*
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$h r1 = r0.castForTesting(r1)
                boolean r1 = r0.removeEntryForTesting(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.removeTableEntryForTesting(com.google.common.collect.MapMakerInternalMap$h):boolean");
        }

        public boolean replace(K k, int i, V v, V v2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4566h hVar = (C4566h) atomicReferenceArray.get(length);
                C4566h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.mo34947b();
                    } else {
                        Object value = hVar2.getValue();
                        if (value == null) {
                            if (isCollected(hVar2)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.valueEquivalence().equivalent(v, value)) {
                            this.modCount++;
                            setValue(hVar2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public void runCleanup() {
            runLockedCleanup();
        }

        public void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S self();

        public void setTableEntryForTesting(int i, C4566h<K, V, ?> hVar) {
            this.table.set(i, castForTesting(hVar));
        }

        public void setValue(E e, V v) {
            this.map.entryHelper.mo34969c(self(), e, v);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.common.collect.MapMakerInternalMap$h<K, V, ?>, com.google.common.collect.MapMakerInternalMap$h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setValueForTesting(com.google.common.collect.MapMakerInternalMap.C4566h<K, V, ?> r3, V r4) {
            /*
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$i<K, V, E, S> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                com.google.common.collect.MapMakerInternalMap$h r3 = r2.castForTesting(r3)
                r0.mo34969c(r1, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.setValueForTesting(com.google.common.collect.MapMakerInternalMap$h, java.lang.Object):void");
        }

        public void setWeakValueReferenceForTesting(C4566h<K, V, ?> hVar, C4586v<K, V, ? extends C4566h<K, V, ?>> vVar) {
            throw new AssertionError();
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public boolean remove(Object obj, int i, Object obj2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4566h hVar = (C4566h) atomicReferenceArray.get(length);
                C4566h hVar2 = hVar;
                while (true) {
                    boolean z = false;
                    if (hVar2 != null) {
                        Object key = hVar2.getKey();
                        if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(obj, key)) {
                            hVar2 = hVar2.mo34947b();
                        } else {
                            if (this.map.valueEquivalence().equivalent(obj2, hVar2.getValue())) {
                                z = true;
                            } else if (!isCollected(hVar2)) {
                                unlock();
                                return false;
                            }
                            this.modCount++;
                            atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                            this.count--;
                            return z;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }

        public V replace(K k, int i, V v) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4566h hVar = (C4566h) atomicReferenceArray.get(length);
                C4566h hVar2 = hVar;
                while (hVar2 != null) {
                    Object key = hVar2.getKey();
                    if (hVar2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        hVar2 = hVar2.mo34947b();
                    } else {
                        V value = hVar2.getValue();
                        if (value == null) {
                            if (isCollected(hVar2)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, removeFromChain(hVar, hVar2));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(hVar2, v);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }
    }
}
