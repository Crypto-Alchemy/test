package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lwk1;", "T", "Lhw5;", "Lxk1;", "", "n", "a", "", "iterator", "Lhw5;", "sequence", "b", "I", "count", "<init>", "(Lhw5;I)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wk1 */
/* compiled from: Sequences.kt */
public final class wk1<T> implements hw5<T>, xk1<T> {

    /* renamed from: a */
    public final hw5<T> f45725a;

    /* renamed from: b */
    public final int f45726b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, mo44877d2 = {"wk1$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lr37;", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "d", "I", "getLeft", "()I", "setLeft", "(I)V", "left", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: wk1$a */
    /* compiled from: Sequences.kt */
    public static final class C9553a implements Iterator<T>, a93 {

        /* renamed from: a */
        public final Iterator<T> f45727a;

        /* renamed from: d */
        public int f45728d;

        public C9553a(wk1<T> wk1) {
            this.f45727a = wk1.f45725a.iterator();
            this.f45728d = wk1.f45726b;
        }

        /* renamed from: a */
        public final void mo66724a() {
            while (this.f45728d > 0 && this.f45727a.hasNext()) {
                this.f45727a.next();
                this.f45728d--;
            }
        }

        public boolean hasNext() {
            mo66724a();
            return this.f45727a.hasNext();
        }

        public T next() {
            mo66724a();
            return this.f45727a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public wk1(hw5<? extends T> hw5, int i) {
        boolean z;
        vx2.m53591g(hw5, "sequence");
        this.f45725a = hw5;
        this.f45726b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public hw5<T> mo66723a(int i) {
        int i2 = this.f45726b + i;
        if (i2 < 0) {
            return new wk1(this, i);
        }
        return new wk1(this.f45725a, i2);
    }

    public Iterator<T> iterator() {
        return new C9553a(this);
    }
}
