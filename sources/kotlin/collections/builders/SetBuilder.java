package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001b\b\u0000\u0012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b!\u0010\"B\t\b\u0016¢\u0006\u0004\b!\u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u001d¢\u0006\u0004\b!\u0010%J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0018\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016R\u001e\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, mo44877d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lr6;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "build", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lr37;", "clear", "add", "remove", "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "backing", "Lkotlin/collections/builders/MapBuilder;", "", "getSize", "()I", "size", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "()V", "initialCapacity", "(I)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SetBuilder.kt */
public final class SetBuilder<E> extends C6430r6<E> implements Serializable {
    private final MapBuilder<E, ?> backing;

    public SetBuilder(MapBuilder<E, ?> mapBuilder) {
        vx2.m53591g(mapBuilder, "backing");
        this.backing = mapBuilder;
    }

    private final Object writeReplace() {
        if (this.backing.isReadOnly$kotlin_stdlib()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(E e) {
        if (this.backing.addKey$kotlin_stdlib(e) >= 0) {
            return true;
        }
        return false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        vx2.m53591g(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.addAll(collection);
    }

    public final Set<E> build() {
        this.backing.build();
        return this;
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    public int getSize() {
        return this.backing.size();
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.backing.keysIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        if (this.backing.removeKey$kotlin_stdlib(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i) {
        this(new MapBuilder(i));
    }
}
