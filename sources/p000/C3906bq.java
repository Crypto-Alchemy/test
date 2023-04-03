package p000;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\u0017\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lbq;", "T", "", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "", "iterator", "", "", "toArray", "()[Ljava/lang/Object;", "a", "[Ljava/lang/Object;", "getValues", "values", "d", "Z", "isVarargs", "()Z", "", "e", "()I", "size", "<init>", "([Ljava/lang/Object;Z)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bq */
/* compiled from: Collections.kt */
public final class C3906bq<T> implements Collection<T>, a93 {

    /* renamed from: a */
    public final T[] f21437a;

    /* renamed from: d */
    public final boolean f21438d;

    public C3906bq(T[] tArr, boolean z) {
        vx2.m53591g(tArr, "values");
        this.f21437a = tArr;
        this.f21438d = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return ArraysKt___ArraysKt.m47249D(this.f21437a, obj);
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
    public int mo29687e() {
        return this.f21437a.length;
    }

    public boolean isEmpty() {
        if (this.f21437a.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return C6118jq.m46703a(this.f21437a);
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
        return mo29687e();
    }

    public final Object[] toArray() {
        return bk0.m32595b(this.f21437a, this.f21438d);
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "array");
        return jj0.m46525b(this, tArr);
    }
}
