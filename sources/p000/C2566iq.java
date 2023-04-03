package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: iq */
/* compiled from: ArrayIterator */
public class C2566iq<T> implements Iterator<T>, Iterable<T> {

    /* renamed from: a */
    public final T[] f13367a;

    /* renamed from: d */
    public int f13368d = 0;

    public C2566iq(T[] tArr) {
        this.f13367a = tArr;
    }

    public boolean hasNext() {
        if (this.f13368d < this.f13367a.length) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return this;
    }

    public T next() {
        int i = this.f13368d;
        T[] tArr = this.f13367a;
        if (i < tArr.length) {
            this.f13368d = i + 1;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
