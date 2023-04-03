package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lef2;", "", "T", "Lhw5;", "", "iterator", "Lkotlin/Function0;", "a", "Lpc2;", "getInitialValue", "Lkotlin/Function1;", "b", "Lrc2;", "getNextValue", "<init>", "(Lpc2;Lrc2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ef2 */
/* compiled from: Sequences.kt */
public final class ef2<T> implements hw5<T> {

    /* renamed from: a */
    public final pc2<T> f37528a;

    /* renamed from: b */
    public final rc2<T, T> f37529b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R$\u0010\f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0003\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, mo44877d2 = {"ef2$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "Lr37;", "a", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "d", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ef2$a */
    /* compiled from: Sequences.kt */
    public static final class C7045a implements Iterator<T>, a93 {

        /* renamed from: a */
        public T f37530a;

        /* renamed from: d */
        public int f37531d = -2;

        /* renamed from: e */
        public final /* synthetic */ ef2<T> f37532e;

        public C7045a(ef2<T> ef2) {
            this.f37532e = ef2;
        }

        /* renamed from: a */
        public final void mo51455a() {
            T t;
            int i;
            if (this.f37531d == -2) {
                t = this.f37532e.f37528a.invoke();
            } else {
                rc2 c = this.f37532e.f37529b;
                T t2 = this.f37530a;
                vx2.m53588d(t2);
                t = c.invoke(t2);
            }
            this.f37530a = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f37531d = i;
        }

        public boolean hasNext() {
            if (this.f37531d < 0) {
                mo51455a();
            }
            if (this.f37531d == 1) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f37531d < 0) {
                mo51455a();
            }
            if (this.f37531d != 0) {
                T t = this.f37530a;
                vx2.m53589e(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f37531d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ef2(pc2<? extends T> pc2, rc2<? super T, ? extends T> rc2) {
        vx2.m53591g(pc2, "getInitialValue");
        vx2.m53591g(rc2, "getNextValue");
        this.f37528a = pc2;
        this.f37529b = rc2;
    }

    public Iterator<T> iterator() {
        return new C7045a(this);
    }
}
