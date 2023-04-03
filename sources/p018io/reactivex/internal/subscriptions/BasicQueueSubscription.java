package p018io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.internal.subscriptions.BasicQueueSubscription */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements r05<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ T poll() throws Exception;

    public abstract /* synthetic */ void request(long j);

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
