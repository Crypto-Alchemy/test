package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lol6;", "T", "Lhw5;", "", "iterator", "a", "Lhw5;", "sequence", "Lkotlin/Function1;", "", "b", "Lrc2;", "predicate", "<init>", "(Lhw5;Lrc2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ol6 */
/* compiled from: Sequences.kt */
public final class ol6<T> implements hw5<T> {

    /* renamed from: a */
    public final hw5<T> f43735a;

    /* renamed from: b */
    public final rc2<T, Boolean> f43736b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, mo44877d2 = {"ol6$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lr37;", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "d", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "e", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ol6$a */
    /* compiled from: Sequences.kt */
    public static final class C9035a implements Iterator<T>, a93 {

        /* renamed from: a */
        public final Iterator<T> f43737a;

        /* renamed from: d */
        public int f43738d = -1;

        /* renamed from: e */
        public T f43739e;

        /* renamed from: g */
        public final /* synthetic */ ol6<T> f43740g;

        public C9035a(ol6<T> ol6) {
            this.f43740g = ol6;
            this.f43737a = ol6.f43735a.iterator();
        }

        /* renamed from: a */
        public final void mo64491a() {
            if (this.f43737a.hasNext()) {
                T next = this.f43737a.next();
                if (((Boolean) this.f43740g.f43736b.invoke(next)).booleanValue()) {
                    this.f43738d = 1;
                    this.f43739e = next;
                    return;
                }
            }
            this.f43738d = 0;
        }

        public boolean hasNext() {
            if (this.f43738d == -1) {
                mo64491a();
            }
            if (this.f43738d == 1) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f43738d == -1) {
                mo64491a();
            }
            if (this.f43738d != 0) {
                T t = this.f43739e;
                this.f43739e = null;
                this.f43738d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ol6(hw5<? extends T> hw5, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(hw5, "sequence");
        vx2.m53591g(rc2, "predicate");
        this.f43735a = hw5;
        this.f43736b = rc2;
    }

    public Iterator<T> iterator() {
        return new C9035a(this);
    }
}
