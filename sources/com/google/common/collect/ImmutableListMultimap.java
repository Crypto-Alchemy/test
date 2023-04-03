package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements zh3<K, V> {
    private static final long serialVersionUID = 0;
    @RetainedWith
    @LazyInit

    /* renamed from: r */
    public transient ImmutableListMultimap<V, K> f24866r;

    /* renamed from: com.google.common.collect.ImmutableListMultimap$a */
    public static final class C4536a<K, V> extends ImmutableMultimap.C4545c<K, V> {
        /* renamed from: f */
        public ImmutableListMultimap<K, V> mo34698f() {
            return (ImmutableListMultimap) super.mo34774a();
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public C4536a<K, V> mo34696c(K k, V v) {
            super.mo34696c(k, v);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public C4536a<K, V> mo34697d(Map.Entry<? extends K, ? extends V> entry) {
            super.mo34697d(entry);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public C4536a<K, V> mo34701i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo34776e(iterable);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> C4536a<K, V> builder() {
        return new C4536a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(c04<? extends K, ? extends V> c04) {
        if (c04.isEmpty()) {
            return m36648of();
        }
        if (c04 instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) c04;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(c04.asMap().entrySet(), (Comparator) null);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        ImmutableList<E> immutableList;
        if (collection.isEmpty()) {
            return m36648of();
        }
        ImmutableMap.C4540b bVar = new ImmutableMap.C4540b(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                immutableList = ImmutableList.copyOf(collection2);
            } else {
                immutableList = ImmutableList.sortedCopyOf(comparator, collection2);
            }
            if (!immutableList.isEmpty()) {
                bVar.mo34740d(key, immutableList);
                i += immutableList.size();
            }
        }
        return new ImmutableListMultimap<>(bVar.mo34737a(), i);
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m36648of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.C4540b builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.C4534a builder2 = ImmutableList.builder();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        builder2.mo34667a(objectInputStream.readObject());
                    }
                    builder.mo34740d(readObject, builder2.mo34692l());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                ImmutableMultimap.C4546d.f24891a.mo35209b(this, builder.mo34737a());
                ImmutableMultimap.C4546d.f24892b.mo35208a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C4628g.m37026d(this, objectOutputStream);
    }

    /* renamed from: a */
    public final ImmutableListMultimap<V, K> mo34694a() {
        C4536a builder = builder();
        c47 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo34696c(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> f = builder.mo34698f();
        f.f24866r = this;
        return f;
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m36649of(K k, V v) {
        C4536a builder = builder();
        builder.mo34696c(k, v);
        return builder.mo34698f();
    }

    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.f24866r;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> a = mo34694a();
        this.f24866r = a;
        return a;
    }

    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.m36627of() : immutableList;
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m36650of(K k, V v, K k2, V v2) {
        C4536a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        return builder.mo34698f();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C4536a().mo34701i(iterable).mo34698f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m36651of(K k, V v, K k2, V v2, K k3, V v3) {
        C4536a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        builder.mo34696c(k3, v3);
        return builder.mo34698f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m36652of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C4536a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        builder.mo34696c(k3, v3);
        builder.mo34696c(k4, v4);
        return builder.mo34698f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m36653of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C4536a builder = builder();
        builder.mo34696c(k, v);
        builder.mo34696c(k2, v2);
        builder.mo34696c(k3, v3);
        builder.mo34696c(k4, v4);
        builder.mo34696c(k5, v5);
        return builder.mo34698f();
    }
}
