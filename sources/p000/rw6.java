package p000;

import java.util.Iterator;

/* renamed from: rw6 */
/* compiled from: TransformedIterator */
public abstract class rw6<F, T> implements Iterator<T> {

    /* renamed from: a */
    public final Iterator<? extends F> f33623a;

    public rw6(Iterator<? extends F> it) {
        this.f33623a = (Iterator) du4.m43691k(it);
    }

    /* renamed from: a */
    public abstract T mo35031a(F f);

    public final boolean hasNext() {
        return this.f33623a.hasNext();
    }

    public final T next() {
        return mo35031a(this.f33623a.next());
    }

    public final void remove() {
        this.f33623a.remove();
    }
}
