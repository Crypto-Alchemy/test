package p018io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.disposables.SequentialDisposable */
public final class SequentialDisposable extends AtomicReference<th1> implements th1 {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((th1) get());
    }

    public boolean replace(th1 th1) {
        return DisposableHelper.replace(this, th1);
    }

    public boolean update(th1 th1) {
        return DisposableHelper.set(this, th1);
    }

    public SequentialDisposable(th1 th1) {
        lazySet(th1);
    }
}
