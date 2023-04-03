package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, mo44877d2 = {"Le42;", "T", "R", "E", "Lhw5;", "", "iterator", "a", "Lhw5;", "sequence", "Lkotlin/Function1;", "b", "Lrc2;", "transformer", "c", "<init>", "(Lhw5;Lrc2;Lrc2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: e42 */
/* compiled from: Sequences.kt */
public final class e42<T, R, E> implements hw5<E> {

    /* renamed from: a */
    public final hw5<T> f37459a;

    /* renamed from: b */
    public final rc2<T, R> f37460b;

    /* renamed from: c */
    public final rc2<R, Iterator<E>> f37461c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo44877d2 = {"e42$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "d", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: e42$a */
    /* compiled from: Sequences.kt */
    public static final class C7015a implements Iterator<E>, a93 {

        /* renamed from: a */
        public final Iterator<T> f37462a;

        /* renamed from: d */
        public Iterator<? extends E> f37463d;

        /* renamed from: e */
        public final /* synthetic */ e42<T, R, E> f37464e;

        public C7015a(e42<T, R, E> e42) {
            this.f37464e = e42;
            this.f37462a = e42.f37459a.iterator();
        }

        /* renamed from: a */
        public final boolean mo51362a() {
            boolean z;
            Iterator<? extends E> it = this.f37463d;
            if (it == null || it.hasNext()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f37463d = null;
            }
            while (true) {
                if (this.f37463d == null) {
                    if (this.f37462a.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f37464e.f37461c.invoke(this.f37464e.f37460b.invoke(this.f37462a.next()));
                        if (it2.hasNext()) {
                            this.f37463d = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return mo51362a();
        }

        public E next() {
            if (mo51362a()) {
                Iterator<? extends E> it = this.f37463d;
                vx2.m53588d(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e42(hw5<? extends T> hw5, rc2<? super T, ? extends R> rc2, rc2<? super R, ? extends Iterator<? extends E>> rc22) {
        vx2.m53591g(hw5, "sequence");
        vx2.m53591g(rc2, "transformer");
        vx2.m53591g(rc22, "iterator");
        this.f37459a = hw5;
        this.f37460b = rc2;
        this.f37461c = rc22;
    }

    public Iterator<E> iterator() {
        return new C7015a(this);
    }
}
