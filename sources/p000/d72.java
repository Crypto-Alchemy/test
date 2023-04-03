package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\u0017\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001J\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0003J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0001J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0003J\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0001J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0001J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, mo44877d2 = {"Ld72;", "Ll02;", "", "Ly62;", "element", "", "e", "", "elements", "containsAll", "", "index", "j", "q", "isEmpty", "", "iterator", "r", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "equals", "hashCode", "", "toString", "y", "Ljava/util/List;", "k", "()Ljava/util/List;", "fonts", "n", "()I", "size", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: d72 */
/* compiled from: FontFamily.kt */
public final class d72 extends l02 implements List<y62>, a93 {

    /* renamed from: x */
    public final /* synthetic */ List<y62> f10523x;

    /* renamed from: y */
    public final List<y62> f10524y;

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends y62> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends y62> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof y62)) {
            return false;
        }
        return mo18537e((y62) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        return this.f10523x.containsAll(collection);
    }

    /* renamed from: e */
    public boolean mo18537e(y62 y62) {
        vx2.m53591g(y62, "element");
        return this.f10523x.contains(y62);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d72) && vx2.m53586b(this.f10524y, ((d72) obj).f10524y)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f10524y.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof y62)) {
            return -1;
        }
        return mo18550q((y62) obj);
    }

    public boolean isEmpty() {
        return this.f10523x.isEmpty();
    }

    public Iterator<y62> iterator() {
        return this.f10523x.iterator();
    }

    /* renamed from: j */
    public y62 get(int i) {
        return this.f10523x.get(i);
    }

    /* renamed from: k */
    public final List<y62> mo18545k() {
        return this.f10524y;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof y62)) {
            return -1;
        }
        return mo18551r((y62) obj);
    }

    public ListIterator<y62> listIterator() {
        return this.f10523x.listIterator();
    }

    public ListIterator<y62> listIterator(int i) {
        return this.f10523x.listIterator(i);
    }

    /* renamed from: n */
    public int mo18549n() {
        return this.f10523x.size();
    }

    /* renamed from: q */
    public int mo18550q(y62 y62) {
        vx2.m53591g(y62, "element");
        return this.f10523x.indexOf(y62);
    }

    /* renamed from: r */
    public int mo18551r(y62 y62) {
        vx2.m53591g(y62, "element");
        return this.f10523x.lastIndexOf(y62);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<y62> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo18549n();
    }

    public void sort(Comparator<? super y62> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<y62> subList(int i, int i2) {
        return this.f10523x.subList(i, i2);
    }

    public Object[] toArray() {
        return jj0.m46524a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "array");
        return jj0.m46525b(this, tArr);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f10524y + ')';
    }
}
