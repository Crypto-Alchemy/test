package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ArrayMapOwner.kt */
public abstract class TypeRegistry<K, V> {

    /* renamed from: a */
    public final ConcurrentHashMap<q83<? extends K>, Integer> f40320a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final AtomicInteger f40321b = new AtomicInteger(0);

    /* renamed from: b */
    public abstract <T extends K> int mo55398b(ConcurrentHashMap<q83<? extends K>, Integer> concurrentHashMap, q83<T> q83, rc2<? super q83<? extends K>, Integer> rc2);

    /* renamed from: c */
    public final <T extends V, KK extends K> fc4<K, V, T> mo55399c(q83<KK> q83) {
        vx2.m53591g(q83, "kClass");
        return new fc4<>(q83, mo55400d(q83));
    }

    /* renamed from: d */
    public final <T extends K> int mo55400d(q83<T> q83) {
        vx2.m53591g(q83, "kClass");
        return mo55398b(this.f40320a, q83, new TypeRegistry$getId$1(this));
    }

    /* renamed from: e */
    public final Collection<Integer> mo55401e() {
        Collection<Integer> values = this.f40320a.values();
        vx2.m53590f(values, "idPerType.values");
        return values;
    }
}
