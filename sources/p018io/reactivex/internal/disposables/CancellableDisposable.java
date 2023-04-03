package p018io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.disposables.CancellableDisposable */
public final class CancellableDisposable extends AtomicReference<ka0> implements th1 {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(ka0 ka0) {
        super(ka0);
    }

    public void dispose() {
        ka0 ka0;
        if (get() != null && (ka0 = (ka0) getAndSet((Object) null)) != null) {
            try {
                ka0.cancel();
            } catch (Exception e) {
                ou1.m49570a(e);
                ti5.m52312m(e);
            }
        }
    }

    public boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
