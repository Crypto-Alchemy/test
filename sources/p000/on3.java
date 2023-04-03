package p000;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016R!\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Lon3;", "V", "", "Lo6;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "Lr37;", "clear", "", "iterator", "remove", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "a", "Lkotlin/collections/builders/MapBuilder;", "getBacking", "()Lkotlin/collections/builders/MapBuilder;", "backing", "", "e", "()I", "size", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: on3 */
/* compiled from: MapBuilder.kt */
public final class on3<V> extends C6305o6<V> {

    /* renamed from: a */
    public final MapBuilder<?, V> f32414a;

    public on3(MapBuilder<?, V> mapBuilder) {
        vx2.m53591g(mapBuilder, "backing");
        this.f32414a = mapBuilder;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        vx2.m53591g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f32414a.clear();
    }

    public boolean contains(Object obj) {
        return this.f32414a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo27578e() {
        return this.f32414a.size();
    }

    public boolean isEmpty() {
        return this.f32414a.isEmpty();
    }

    public Iterator<V> iterator() {
        return this.f32414a.valuesIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        return this.f32414a.removeValue$kotlin_stdlib(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.f32414a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.f32414a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
