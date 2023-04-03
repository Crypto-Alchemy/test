package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b \u0010!J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0002J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo44877d2 = {"Lmn3;", "K", "V", "Lk6;", "", "", "isEmpty", "", "element", "j", "Lr37;", "clear", "n", "", "elements", "addAll", "k", "", "iterator", "containsAll", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "a", "Lkotlin/collections/builders/MapBuilder;", "getBacking", "()Lkotlin/collections/builders/MapBuilder;", "backing", "", "getSize", "()I", "size", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mn3 */
/* compiled from: MapBuilder.kt */
public final class mn3<K, V> extends C6136k6<Map.Entry<K, V>, K, V> {

    /* renamed from: a */
    public final MapBuilder<K, V> f31741a;

    public mn3(MapBuilder<K, V> mapBuilder) {
        vx2.m53591g(mapBuilder, "backing");
        this.f31741a = mapBuilder;
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        vx2.m53591g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f31741a.clear();
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        return this.f31741a.containsAllEntries$kotlin_stdlib(collection);
    }

    public int getSize() {
        return this.f31741a.size();
    }

    public boolean isEmpty() {
        return this.f31741a.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f31741a.entriesIterator$kotlin_stdlib();
    }

    /* renamed from: j */
    public boolean mo44667j(Map.Entry<? extends K, ? extends V> entry) {
        vx2.m53591g(entry, "element");
        return this.f31741a.containsEntry$kotlin_stdlib(entry);
    }

    /* renamed from: k */
    public boolean mo44668k(Map.Entry entry) {
        vx2.m53591g(entry, "element");
        return this.f31741a.removeEntry$kotlin_stdlib(entry);
    }

    /* renamed from: n */
    public boolean add(Map.Entry<K, V> entry) {
        vx2.m53591g(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.f31741a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.f31741a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
