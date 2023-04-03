package p000;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u001e\u0010\u0017\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lnn3;", "E", "", "Lr6;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lr37;", "clear", "add", "", "elements", "addAll", "remove", "", "iterator", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "a", "Lkotlin/collections/builders/MapBuilder;", "backing", "", "getSize", "()I", "size", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nn3 */
/* compiled from: MapBuilder.kt */
public final class nn3<E> extends C6430r6<E> {

    /* renamed from: a */
    public final MapBuilder<E, ?> f32158a;

    public nn3(MapBuilder<E, ?> mapBuilder) {
        vx2.m53591g(mapBuilder, "backing");
        this.f32158a = mapBuilder;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        vx2.m53591g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f32158a.clear();
    }

    public boolean contains(Object obj) {
        return this.f32158a.containsKey(obj);
    }

    public int getSize() {
        return this.f32158a.size();
    }

    public boolean isEmpty() {
        return this.f32158a.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f32158a.keysIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        if (this.f32158a.removeKey$kotlin_stdlib(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.f32158a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.f32158a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
