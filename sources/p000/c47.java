package p000;

import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;

/* renamed from: c47 */
/* compiled from: UnmodifiableIterator */
public abstract class c47<E> implements Iterator<E> {
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
