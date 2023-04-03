package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Luw6;", "T", "R", "Lhw5;", "", "iterator", "E", "Lkotlin/Function1;", "d", "(Lrc2;)Lhw5;", "a", "Lhw5;", "sequence", "b", "Lrc2;", "transformer", "<init>", "(Lhw5;Lrc2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: uw6 */
/* compiled from: Sequences.kt */
public final class uw6<T, R> implements hw5<R> {

    /* renamed from: a */
    public final hw5<T> f45182a;

    /* renamed from: b */
    public final rc2<T, R> f45183b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo44877d2 = {"uw6$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: uw6$a */
    /* compiled from: Sequences.kt */
    public static final class C9415a implements Iterator<R>, a93 {

        /* renamed from: a */
        public final Iterator<T> f45184a;

        /* renamed from: d */
        public final /* synthetic */ uw6<T, R> f45185d;

        public C9415a(uw6<T, R> uw6) {
            this.f45185d = uw6;
            this.f45184a = uw6.f45182a.iterator();
        }

        public boolean hasNext() {
            return this.f45184a.hasNext();
        }

        public R next() {
            return this.f45185d.f45183b.invoke(this.f45184a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public uw6(hw5<? extends T> hw5, rc2<? super T, ? extends R> rc2) {
        vx2.m53591g(hw5, "sequence");
        vx2.m53591g(rc2, "transformer");
        this.f45182a = hw5;
        this.f45183b = rc2;
    }

    /* renamed from: d */
    public final <E> hw5<E> mo66359d(rc2<? super R, ? extends Iterator<? extends E>> rc2) {
        vx2.m53591g(rc2, "iterator");
        return new e42(this.f45182a, this.f45183b, rc2);
    }

    public Iterator<R> iterator() {
        return new C9415a(this);
    }
}
