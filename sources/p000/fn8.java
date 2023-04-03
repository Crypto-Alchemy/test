package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fn8 */
public final class fn8 implements Iterator<Object> {
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
