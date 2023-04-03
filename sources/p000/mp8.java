package p000;

import java.util.ListIterator;

/* renamed from: mp8 */
public final class mp8 implements ListIterator<String> {

    /* renamed from: a */
    public ListIterator<String> f31754a;

    /* renamed from: d */
    public final /* synthetic */ int f31755d;

    /* renamed from: e */
    public final /* synthetic */ jp8 f31756e;

    public mp8(jp8 jp8, int i) {
        this.f31756e = jp8;
        this.f31755d = i;
        this.f31754a = jp8.f30559a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f31754a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f31754a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f31754a.next();
    }

    public final int nextIndex() {
        return this.f31754a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f31754a.previous();
    }

    public final int previousIndex() {
        return this.f31754a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
