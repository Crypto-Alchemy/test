package p000;

/* renamed from: tl3 */
/* compiled from: LookupCache */
public interface tl3<K, V> {
    void clear();

    V get(Object obj);

    V putIfAbsent(K k, V v);
}
