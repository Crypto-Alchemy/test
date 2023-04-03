package p018io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.AbstractDirectTask */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements th1 {
    public static final FutureTask<Void> DISPOSED;
    public static final FutureTask<Void> FINISHED;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable runnable;
    public Thread runner;

    static {
        Runnable runnable2 = ee2.f28594b;
        FINISHED = new FutureTask<>(runnable2, (Object) null);
        DISPOSED = new FutureTask<>(runnable2, (Object) null);
    }

    public AbstractDirectTask(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != FINISHED && future != (futureTask = DISPOSED) && compareAndSet(future, futureTask) && future != null) {
            if (this.runner != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == FINISHED || future == DISPOSED) {
            return true;
        }
        return false;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 != FINISHED) {
                if (future2 == DISPOSED) {
                    if (this.runner != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
