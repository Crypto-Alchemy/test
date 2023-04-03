package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b-\u0010+J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0006\u0010\u0011\u001a\u00020\u0005J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0007J\u0016\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\bH\u0002R\"\u0010\"\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006."}, mo44877d2 = {"Lfq2;", "", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "value", "add", "Lr37;", "clear", "isEmpty", "q", "remove", "", "elements", "containsAll", "", "iterator", "e", "midIndex", "valueHash", "j", "a", "I", "k", "()I", "r", "(I)V", "size", "", "d", "[Ljava/lang/Object;", "n", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "getValues$annotations", "()V", "values", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fq2 */
/* compiled from: IdentityArraySet.kt */
public final class fq2<T> implements Set<T>, a93 {

    /* renamed from: a */
    public int f11966a;

    /* renamed from: d */
    public Object[] f11967d = new Object[16];

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo44877d2 = {"fq2$a", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: fq2$a */
    /* compiled from: IdentityArraySet.kt */
    public static final class C2317a implements Iterator<T>, a93 {

        /* renamed from: a */
        public int f11968a;

        /* renamed from: d */
        public final /* synthetic */ fq2<T> f11969d;

        public C2317a(fq2<T> fq2) {
            this.f11969d = fq2;
        }

        public boolean hasNext() {
            if (this.f11968a < this.f11969d.size()) {
                return true;
            }
            return false;
        }

        public T next() {
            T[] n = this.f11969d.mo20052n();
            int i = this.f11968a;
            this.f11968a = i + 1;
            T t = n[i];
            vx2.m53589e(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean add(T t) {
        int i;
        vx2.m53591g(t, "value");
        if (size() > 0) {
            i = mo20046e(t);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int size = size();
        Object[] objArr = this.f11967d;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            C6706xq.m54495i(objArr, objArr2, i2 + 1, i2, size());
            C6706xq.m54499m(this.f11967d, objArr2, 0, 0, i2, 6, (Object) null);
            this.f11967d = objArr2;
        } else {
            C6706xq.m54495i(objArr, objArr, i2 + 1, i2, size());
        }
        this.f11967d[i2] = t;
        mo20054r(size() + 1);
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        C6706xq.m54505s(this.f11967d, (Object) null, 0, 0, 6, (Object) null);
        mo20054r(0);
    }

    public boolean contains(Object obj) {
        if (obj != null && mo20046e(obj) >= 0) {
            return true;
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
    public final int mo20046e(Object obj) {
        int size = size() - 1;
        int a = C2283fb.m16819a(obj);
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = get(i2);
            int a2 = C2283fb.m16819a(obj2);
            if (a2 < a) {
                i = i2 + 1;
            } else if (a2 > a) {
                size = i2 - 1;
            } else if (obj2 == obj) {
                return i2;
            } else {
                return mo20050j(i2, obj, a);
            }
        }
        return -(i + 1);
    }

    public final T get(int i) {
        T t = this.f11967d[i];
        vx2.m53589e(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new C2317a(this);
    }

    /* renamed from: j */
    public final int mo20050j(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f11967d[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C2283fb.m16819a(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int size = size();
        while (true) {
            if (i4 >= size) {
                i4 = size();
                break;
            }
            Object obj3 = this.f11967d[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (C2283fb.m16819a(obj3) != i2) {
                break;
            }
            i4++;
        }
        return -(i4 + 1);
    }

    /* renamed from: k */
    public int mo20051k() {
        return this.f11966a;
    }

    /* renamed from: n */
    public final Object[] mo20052n() {
        return this.f11967d;
    }

    /* renamed from: q */
    public final boolean mo20053q() {
        if (size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo20054r(int i) {
        this.f11966a = i;
    }

    public final boolean remove(T t) {
        int e;
        if (t == null || (e = mo20046e(t)) < 0) {
            return false;
        }
        if (e < size() - 1) {
            Object[] objArr = this.f11967d;
            C6706xq.m54495i(objArr, objArr, e, e + 1, size());
        }
        mo20054r(size() - 1);
        this.f11967d[size()] = null;
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo20051k();
    }

    public Object[] toArray() {
        return jj0.m46524a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "array");
        return jj0.m46525b(this, tArr);
    }
}
