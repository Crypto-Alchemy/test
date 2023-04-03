package p018io.reactivex.internal.subscriptions;

/* renamed from: io.reactivex.internal.subscriptions.DeferredScalarSubscription */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    public static final int CANCELLED = 4;
    public static final int FUSED_CONSUMED = 32;
    public static final int FUSED_EMPTY = 8;
    public static final int FUSED_READY = 16;
    public static final int HAS_REQUEST_HAS_VALUE = 3;
    public static final int HAS_REQUEST_NO_VALUE = 2;
    public static final int NO_REQUEST_HAS_VALUE = 1;
    public static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    public final nc6<? super T> downstream;
    public T value;

    public DeferredScalarSubscription(nc6<? super T> nc6) {
        this.downstream = nc6;
    }

    public void cancel() {
        set(4);
        this.value = null;
    }

    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    nc6<? super T> nc6 = this.downstream;
                    nc6.onNext(t);
                    if (get() != 4) {
                        nc6.onComplete();
                        return;
                    }
                    return;
                }
                this.value = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.value = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t;
        lazySet(16);
        nc6<? super T> nc62 = this.downstream;
        nc62.onNext(t);
        if (get() != 4) {
            nc62.onComplete();
        }
    }

    public final boolean isCancelled() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    public final void request(long j) {
        T t;
        if (SubscriptionHelper.validate(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (t = this.value) != null) {
                            this.value = null;
                            nc6<? super T> nc6 = this.downstream;
                            nc6.onNext(t);
                            if (get() != 4) {
                                nc6.onComplete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }
}
