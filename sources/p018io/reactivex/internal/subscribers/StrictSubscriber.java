package p018io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.AtomicThrowable;

/* renamed from: io.reactivex.internal.subscribers.StrictSubscriber */
public class StrictSubscriber<T> extends AtomicInteger implements y52<T>, pc6 {
    private static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final nc6<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicBoolean once = new AtomicBoolean();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<pc6> upstream = new AtomicReference<>();

    public StrictSubscriber(nc6<? super T> nc6) {
        this.downstream = nc6;
    }

    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    public void onComplete() {
        this.done = true;
        qk2.m50613a(this.downstream, this, this.error);
    }

    public void onError(Throwable th) {
        this.done = true;
        qk2.m50614b(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        qk2.m50615c(this.downstream, t, this, this.error);
    }

    public void onSubscribe(pc6 pc6) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, pc6);
            return;
        }
        pc6.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }
}
