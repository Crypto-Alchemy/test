package p000;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00020@B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0003J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tJ+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u0018\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\tH\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0002J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010#J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001eH\u0016J\u0006\u0010-\u001a\u00020\u0003R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u00107R$\u0010=\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001e8\u0016@RX\u000e¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010<\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, mo44877d2 = {"Lem2;", "T", "", "Lr37;", "B", "Lfi1;", "r", "()J", "q", "", "t", "e", "", "distanceFromEdge", "isInLayer", "A", "node", "Lkotlin/Function0;", "childHitTest", "u", "(Ljava/lang/Object;ZLpc2;)V", "w", "(Ljava/lang/Object;FZLpc2;)V", "D", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "clear", "", "", "a", "[Ljava/lang/Object;", "values", "", "d", "[J", "distanceFromEdgeAndInLayer", "I", "hitDepth", "<set-?>", "g", "s", "()I", "size", "<init>", "()V", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: em2 */
/* compiled from: HitTestResult.kt */
public final class em2<T> implements List<T>, a93 {

    /* renamed from: a */
    public Object[] f11253a = new Object[16];

    /* renamed from: d */
    public long[] f11254d = new long[16];

    /* renamed from: e */
    public int f11255e = -1;

    /* renamed from: g */
    public int f11256g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0011\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010!\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b¨\u0006$"}, mo44877d2 = {"Lem2$b;", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "a", "I", "getMinIndex", "()I", "minIndex", "d", "getMaxIndex", "maxIndex", "e", "size", "<init>", "(Lem2;II)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: em2$b */
    /* compiled from: HitTestResult.kt */
    public final class C2238b implements List<T>, a93 {

        /* renamed from: a */
        public final int f11261a;

        /* renamed from: d */
        public final int f11262d;

        public C2238b(int i, int i2) {
            this.f11261a = i;
            this.f11262d = i2;
        }

        public void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Object obj) {
            if (indexOf(obj) != -1) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            vx2.m53591g(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public int mo19351e() {
            return this.f11262d - this.f11261a;
        }

        public T get(int i) {
            return em2.this.f11253a[i + this.f11261a];
        }

        public int indexOf(Object obj) {
            int i = this.f11261a;
            int i2 = this.f11262d;
            if (i > i2) {
                return -1;
            }
            while (!vx2.m53586b(em2.this.f11253a[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.f11261a;
        }

        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        public Iterator<T> iterator() {
            em2<T> em2 = em2.this;
            int i = this.f11261a;
            return new C2237a(i, i, this.f11262d);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f11262d;
            int i2 = this.f11261a;
            if (i2 > i) {
                return -1;
            }
            while (!vx2.m53586b(em2.this.f11253a[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f11261a;
        }

        public ListIterator<T> listIterator() {
            em2<T> em2 = em2.this;
            int i = this.f11261a;
            return new C2237a(i, i, this.f11262d);
        }

        public T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return mo19351e();
        }

        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List<T> subList(int i, int i2) {
            em2<T> em2 = em2.this;
            int i3 = this.f11261a;
            return new C2238b(i + i3, i3 + i2);
        }

        public Object[] toArray() {
            return jj0.m46524a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            vx2.m53591g(tArr, "array");
            return jj0.m46525b(this, tArr);
        }

        public ListIterator<T> listIterator(int i) {
            em2<T> em2 = em2.this;
            int i2 = this.f11261a;
            return new C2237a(i + i2, i2, this.f11262d);
        }
    }

    /* renamed from: A */
    public final boolean mo19300A(float f, boolean z) {
        if (this.f11255e == ck0.m33064l(this)) {
            return true;
        }
        if (fi1.m17003a(mo19319r(), fm2.m17080a(f, z)) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final void mo19301B() {
        int i = this.f11255e + 1;
        int l = ck0.m33064l(this);
        if (i <= l) {
            while (true) {
                this.f11253a[i] = null;
                if (i == l) {
                    break;
                }
                i++;
            }
        }
        this.f11256g = this.f11255e + 1;
    }

    /* renamed from: D */
    public final void mo19302D(T t, float f, boolean z, pc2<r37> pc2) {
        vx2.m53591g(pc2, "childHitTest");
        if (this.f11255e == ck0.m33064l(this)) {
            mo19334w(t, f, z, pc2);
            if (this.f11255e + 1 == ck0.m33064l(this)) {
                mo19301B();
                return;
            }
            return;
        }
        long r = mo19319r();
        int i = this.f11255e;
        this.f11255e = ck0.m33064l(this);
        mo19334w(t, f, z, pc2);
        if (this.f11255e + 1 < ck0.m33064l(this) && fi1.m17003a(r, mo19319r()) > 0) {
            int i2 = this.f11255e + 1;
            int i3 = i + 1;
            Object[] objArr = this.f11253a;
            C6706xq.m54495i(objArr, objArr, i3, i2, size());
            long[] jArr = this.f11254d;
            C6706xq.m54494h(jArr, jArr, i3, i2, size());
            this.f11255e = ((size() + i) - this.f11255e) - 1;
        }
        mo19301B();
        this.f11255e = i;
    }

    public void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.f11255e = -1;
        mo19301B();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        vx2.m53591g(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo19310e() {
        this.f11255e = size() - 1;
    }

    public T get(int i) {
        return this.f11253a[i];
    }

    public int indexOf(Object obj) {
        int l = ck0.m33064l(this);
        if (l < 0) {
            return -1;
        }
        int i = 0;
        while (!vx2.m53586b(this.f11253a[i], obj)) {
            if (i == l) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new C2237a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public int lastIndexOf(Object obj) {
        for (int l = ck0.m33064l(this); -1 < l; l--) {
            if (vx2.m53586b(this.f11253a[l], obj)) {
                return l;
            }
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        return new C2237a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: q */
    public final void mo19318q() {
        int i = this.f11255e;
        Object[] objArr = this.f11253a;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            vx2.m53590f(copyOf, "copyOf(this, newSize)");
            this.f11253a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f11254d, length);
            vx2.m53590f(copyOf2, "copyOf(this, newSize)");
            this.f11254d = copyOf2;
        }
    }

    /* renamed from: r */
    public final long mo19319r() {
        long b = fm2.m17080a(Float.POSITIVE_INFINITY, false);
        int i = this.f11255e + 1;
        int l = ck0.m33064l(this);
        if (i <= l) {
            while (true) {
                long b2 = fi1.m17004b(this.f11254d[i]);
                if (fi1.m17003a(b2, b) < 0) {
                    b = b2;
                }
                if (fi1.m17005c(b) >= Utils.FLOAT_EPSILON || !fi1.m17006d(b)) {
                    if (i == l) {
                        break;
                    }
                    i++;
                } else {
                    return b;
                }
            }
        }
        return b;
    }

    public T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: s */
    public int mo19325s() {
        return this.f11256g;
    }

    public T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo19325s();
    }

    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<T> subList(int i, int i2) {
        return new C2238b(i, i2);
    }

    /* renamed from: t */
    public final boolean mo19330t() {
        long r = mo19319r();
        if (fi1.m17005c(r) >= Utils.FLOAT_EPSILON || !fi1.m17006d(r)) {
            return false;
        }
        return true;
    }

    public Object[] toArray() {
        return jj0.m46524a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        vx2.m53591g(tArr, "array");
        return jj0.m46525b(this, tArr);
    }

    /* renamed from: u */
    public final void mo19333u(T t, boolean z, pc2<r37> pc2) {
        vx2.m53591g(pc2, "childHitTest");
        mo19334w(t, -1.0f, z, pc2);
    }

    /* renamed from: w */
    public final void mo19334w(T t, float f, boolean z, pc2<r37> pc2) {
        vx2.m53591g(pc2, "childHitTest");
        int i = this.f11255e;
        this.f11255e = i + 1;
        mo19318q();
        Object[] objArr = this.f11253a;
        int i2 = this.f11255e;
        objArr[i2] = t;
        this.f11254d[i2] = fm2.m17080a(f, z);
        mo19301B();
        pc2.invoke();
        this.f11255e = i;
    }

    public ListIterator<T> listIterator(int i) {
        return new C2237a(this, i, 0, 0, 6, (DefaultConstructorMarker) null);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0006J\b\u0010\n\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, mo44877d2 = {"Lem2$a;", "", "", "hasNext", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "previous", "previousIndex", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "d", "getMinIndex", "minIndex", "e", "getMaxIndex", "maxIndex", "<init>", "(Lem2;III)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: em2$a */
    /* compiled from: HitTestResult.kt */
    public final class C2237a implements ListIterator<T>, a93 {

        /* renamed from: a */
        public int f11257a;

        /* renamed from: d */
        public final int f11258d;

        /* renamed from: e */
        public final int f11259e;

        public C2237a(int i, int i2, int i3) {
            this.f11257a = i;
            this.f11258d = i2;
            this.f11259e = i3;
        }

        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f11257a < this.f11259e) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f11257a > this.f11258d) {
                return true;
            }
            return false;
        }

        public T next() {
            T[] k = em2.this.f11253a;
            int i = this.f11257a;
            this.f11257a = i + 1;
            return k[i];
        }

        public int nextIndex() {
            return this.f11257a - this.f11258d;
        }

        public T previous() {
            T[] k = em2.this.f11253a;
            int i = this.f11257a - 1;
            this.f11257a = i;
            return k[i];
        }

        public int previousIndex() {
            return (this.f11257a - this.f11258d) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2237a(em2 em2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? em2.size() : i3);
        }
    }
}
