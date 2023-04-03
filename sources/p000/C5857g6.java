package p000;

import java.util.NoSuchElementException;

/* renamed from: g6 */
/* compiled from: AbstractIndexedListIterator */
public abstract class C5857g6<E> extends g47<E> {

    /* renamed from: a */
    public final int f29095a;

    /* renamed from: d */
    public int f29096d;

    public C5857g6(int i, int i2) {
        du4.m43693m(i2, i);
        this.f29095a = i;
        this.f29096d = i2;
    }

    /* renamed from: a */
    public abstract E mo34693a(int i);

    public final boolean hasNext() {
        if (this.f29096d < this.f29095a) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.f29096d > 0) {
            return true;
        }
        return false;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f29096d;
            this.f29096d = i + 1;
            return mo34693a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f29096d;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f29096d - 1;
            this.f29096d = i;
            return mo34693a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f29096d - 1;
    }
}
