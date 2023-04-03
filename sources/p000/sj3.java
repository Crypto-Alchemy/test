package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lsj3;", "", "Lqj3;", "", "i", "j", "element", "", "e", "elements", "containsAll", "isEmpty", "", "iterator", "", "other", "equals", "hashCode", "", "toString", "", "a", "Ljava/util/List;", "k", "()Ljava/util/List;", "localeList", "d", "I", "n", "()I", "size", "<init>", "(Ljava/util/List;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sj3 */
/* compiled from: LocaleList.kt */
public final class sj3 implements Collection<qj3>, a93 {

    /* renamed from: e */
    public static final C3272a f17680e = new C3272a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final List<qj3> f17681a;

    /* renamed from: d */
    public final int f17682d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lsj3$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sj3$a */
    /* compiled from: LocaleList.kt */
    public static final class C3272a {
        public C3272a() {
        }

        public /* synthetic */ C3272a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public sj3(List<qj3> list) {
        vx2.m53591g(list, "localeList");
        this.f17681a = list;
        this.f17682d = list.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends qj3> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof qj3)) {
            return false;
        }
        return mo25795e((qj3) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        return this.f17681a.containsAll(collection);
    }

    /* renamed from: e */
    public boolean mo25795e(qj3 qj3) {
        vx2.m53591g(qj3, "element");
        return this.f17681a.contains(qj3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sj3) && vx2.m53586b(this.f17681a, ((sj3) obj).f17681a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f17681a.hashCode();
    }

    public boolean isEmpty() {
        return this.f17681a.isEmpty();
    }

    public Iterator<qj3> iterator() {
        return this.f17681a.iterator();
    }

    /* renamed from: j */
    public final qj3 mo25800j(int i) {
        return this.f17681a.get(i);
    }

    /* renamed from: k */
    public final List<qj3> mo25801k() {
        return this.f17681a;
    }

    /* renamed from: n */
    public int mo25802n() {
        return this.f17682d;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super qj3> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo25802n();
    }

    public Object[] toArray() {
        return jj0.m46524a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "array");
        return jj0.m46525b(this, tArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f17681a + ')';
    }
}
