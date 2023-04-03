package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lu12;", "T", "Lhw5;", "", "iterator", "a", "Lhw5;", "sequence", "", "b", "Z", "sendWhen", "Lkotlin/Function1;", "c", "Lrc2;", "predicate", "<init>", "(Lhw5;ZLrc2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: u12 */
/* compiled from: Sequences.kt */
public final class u12<T> implements hw5<T> {

    /* renamed from: a */
    public final hw5<T> f44839a;

    /* renamed from: b */
    public final boolean f44840b;

    /* renamed from: c */
    public final rc2<T, Boolean> f44841c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, mo44877d2 = {"u12$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lr37;", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "d", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "e", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: u12$a */
    /* compiled from: Sequences.kt */
    public static final class C9380a implements Iterator<T>, a93 {

        /* renamed from: a */
        public final Iterator<T> f44842a;

        /* renamed from: d */
        public int f44843d = -1;

        /* renamed from: e */
        public T f44844e;

        /* renamed from: g */
        public final /* synthetic */ u12<T> f44845g;

        public C9380a(u12<T> u12) {
            this.f44845g = u12;
            this.f44842a = u12.f44839a.iterator();
        }

        /* renamed from: a */
        public final void mo66162a() {
            while (this.f44842a.hasNext()) {
                T next = this.f44842a.next();
                if (((Boolean) this.f44845g.f44841c.invoke(next)).booleanValue() == this.f44845g.f44840b) {
                    this.f44844e = next;
                    this.f44843d = 1;
                    return;
                }
            }
            this.f44843d = 0;
        }

        public boolean hasNext() {
            if (this.f44843d == -1) {
                mo66162a();
            }
            if (this.f44843d == 1) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f44843d == -1) {
                mo66162a();
            }
            if (this.f44843d != 0) {
                T t = this.f44844e;
                this.f44844e = null;
                this.f44843d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u12(hw5<? extends T> hw5, boolean z, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(hw5, "sequence");
        vx2.m53591g(rc2, "predicate");
        this.f44839a = hw5;
        this.f44840b = z;
        this.f44841c = rc2;
    }

    public Iterator<T> iterator() {
        return new C9380a(this);
    }
}
