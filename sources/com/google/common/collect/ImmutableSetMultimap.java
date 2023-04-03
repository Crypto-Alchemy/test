package com.google.common.collect;

import com.google.common.collect.C4628g;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements fy5<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: r */
    public final transient ImmutableSet<V> f24904r;
    @RetainedWith
    @LazyInit

    /* renamed from: s */
    public transient ImmutableSetMultimap<V, K> f24905s;
    @RetainedWith
    @LazyInit

    /* renamed from: x */
    public transient ImmutableSet<Map.Entry<K, V>> f24906x;

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        @Weak

        /* renamed from: e */
        public final transient ImmutableSetMultimap<K, V> f24907e;

        public EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f24907e = immutableSetMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f24907e.containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean isPartialView() {
            return false;
        }

        public int size() {
            return this.f24907e.size();
        }

        public c47<Map.Entry<K, V>> iterator() {
            return this.f24907e.entryIterator();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$a */
    public static final class C4550a<K, V> extends ImmutableMultimap.C4545c<K, V> {
        /* renamed from: b */
        public Collection<V> mo34775b() {
            return C4627f.m37020d();
        }

        /* renamed from: f */
        public ImmutableSetMultimap<K, V> mo34802f() {
            Collection entrySet = this.f24888a.entrySet();
            Comparator comparator = this.f24889b;
            if (comparator != null) {
                entrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(entrySet);
            }
            return ImmutableSetMultimap.fromMapEntries(entrySet, this.f24890c);
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public C4550a<K, V> mo34696c(K k, V v) {
            super.mo34696c(k, v);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public C4550a<K, V> mo34697d(Map.Entry<? extends K, ? extends V> entry) {
            super.mo34697d(entry);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public C4550a<K, V> mo34805i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo34776e(iterable);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$b */
    public static final class C4551b {

        /* renamed from: a */
        public static final C4628g.C4630b<ImmutableSetMultimap> f24908a = C4628g.m37023a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.f24904r = m36726b(comparator);
    }

    /* renamed from: a */
    public static <K, V> ImmutableSetMultimap<K, V> m36725a(c04<? extends K, ? extends V> c04, Comparator<? super V> comparator) {
        du4.m43691k(c04);
        if (c04.isEmpty() && comparator == null) {
            return m36729of();
        }
        if (c04 instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) c04;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(c04.asMap().entrySet(), comparator);
    }

    /* renamed from: b */
    public static <V> ImmutableSet<V> m36726b(Comparator<? super V> comparator) {
        if (comparator == null) {
            return ImmutableSet.m36712of();
        }
        return ImmutableSortedSet.emptySet(comparator);
    }

    public static <K, V> C4550a<K, V> builder() {
        return new C4550a<>();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(c04<? extends K, ? extends V> c04) {
        return m36725a(c04, (Comparator) null);
    }

    /* renamed from: d */
    public static <V> ImmutableSet<V> m36727d(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return ImmutableSet.copyOf(collection);
        }
        return ImmutableSortedSet.copyOf(comparator, collection);
    }

    /* renamed from: e */
    public static <V> ImmutableSet.C4549a<V> m36728e(Comparator<? super V> comparator) {
        if (comparator == null) {
            return new ImmutableSet.C4549a<>();
        }
        return new ImmutableSortedSet.C4552a(comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m36729of();
        }
        ImmutableMap.C4540b bVar = new ImmutableMap.C4540b(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            ImmutableSet<V> d = m36727d(comparator, (Collection) entry.getValue());
            if (!d.isEmpty()) {
                bVar.mo34740d(key, d);
                i += d.size();
            }
        }
        return new ImmutableSetMultimap<>(bVar.mo34737a(), i, comparator);
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m36729of() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.C4540b builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableSet.C4549a e = m36728e(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        e.mo34667a(objectInputStream.readObject());
                    }
                    ImmutableSet m = e.mo34798m();
                    if (m.size() == readInt2) {
                        builder.mo34740d(readObject, m);
                        i2 += readInt2;
                        i++;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                ImmutableMultimap.C4546d.f24891a.mo35209b(this, builder.mo34737a());
                ImmutableMultimap.C4546d.f24892b.mo35208a(this, i2);
                C4551b.f24908a.mo35209b(this, m36726b(comparator));
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        } else {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C4628g.m37026d(this, objectOutputStream);
    }

    /* renamed from: c */
    public final ImmutableSetMultimap<V, K> mo34799c() {
        C4550a builder = builder();
        c47 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo34696c(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> f = builder.mo34802f();
        f.f24905s = this;
        return f;
    }

    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.f24904r;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C4550a().mo34805i(iterable).mo34802f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m36730of(K k, V v) {
        C4550a builder = builder();
        builder.mo34696c(k, v);
        return builder.mo34802f();
    }

    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.f24905s;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> c = mo34799c();
        this.f24905s = c;
        return c;
    }

    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f24906x;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.f24906x = entrySet;
        return entrySet;
    }

    public ImmutableSet<V> get(K k) {
        return (ImmutableSet) dy3.m43720a((ImmutableSet) this.map.get(k), this.f24904r);
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m36731of(K k, V v, K k2, V v2) {
        C4550a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        return builder.mo34802f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m36732of(K k, V v, K k2, V v2, K k3, V v3) {
        C4550a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        builder.mo34696c(k3, v3);
        return builder.mo34802f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m36733of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C4550a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        builder.mo34696c(k3, v3);
        builder.mo34696c(k4, v4);
        return builder.mo34802f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m36734of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C4550a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        builder.mo34696c(k3, v3);
        builder.mo34696c(k4, v4);
        builder.mo34696c(k5, v5);
        return builder.mo34802f();
    }
}
