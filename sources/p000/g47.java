package p000;

import com.google.errorprone.annotations.DoNotCall;
import java.util.ListIterator;

/* renamed from: g47 */
/* compiled from: UnmodifiableListIterator */
public abstract class g47<E> extends c47<E> implements ListIterator<E> {
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
