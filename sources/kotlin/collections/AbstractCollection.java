package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lkotlin/collections/AbstractCollection;", "E", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "isEmpty", "", "toString", "", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "e", "()I", "size", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AbstractCollection.kt */
public abstract class AbstractCollection<E> implements Collection<E>, a93 {
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object b : this) {
            if (vx2.m53586b(b, e)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public abstract int mo11067e();

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo11067e();
    }

    public Object[] toArray() {
        return jj0.m46524a(this);
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.m47338i0(this, ", ", "[", "]", 0, (CharSequence) null, new AbstractCollection$toString$1(this), 24, (Object) null);
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "array");
        return jj0.m46525b(this, tArr);
    }
}
