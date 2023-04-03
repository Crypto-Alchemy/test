package p018io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.subscriptions.ScalarSubscription */
public final class ScalarSubscription<T> extends AtomicInteger implements r05<T> {
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    public final nc6<? super T> subscriber;
    public final T value;

    public ScalarSubscription(nc6<? super T> nc6, T t) {
        this.subscriber = nc6;
        this.value = t;
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            nc6<? super T> nc6 = this.subscriber;
            nc6.onNext(this.value);
            if (get() != 2) {
                nc6.onComplete();
            }
        }
    }

    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
