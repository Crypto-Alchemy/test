package p018io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.disposables.ReferenceDisposable */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements th1 {
    private static final long serialVersionUID = 6537757548749041217L;

    public ReferenceDisposable(T t) {
        super(af4.m31828d(t, "value is null"));
    }

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            onDisposed(andSet);
        }
    }

    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public abstract void onDisposed(T t);
}
