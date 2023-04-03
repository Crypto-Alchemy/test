package p018io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.subscriptions.SubscriptionArbiter */
public class SubscriptionArbiter extends AtomicInteger implements pc6 {
    private static final long serialVersionUID = -2189523197179400958L;
    public pc6 actual;
    public volatile boolean cancelled;
    public final AtomicLong missedProduced = new AtomicLong();
    public final AtomicLong missedRequested = new AtomicLong();
    public final AtomicReference<pc6> missedSubscription = new AtomicReference<>();
    public long requested;
    public boolean unbounded;

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    /* access modifiers changed from: package-private */
    public final void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    /* access modifiers changed from: package-private */
    public final void drainLoop() {
        int i = 1;
        pc6 pc6 = null;
        long j = 0;
        do {
            pc6 pc62 = this.missedSubscription.get();
            if (pc62 != null) {
                pc62 = this.missedSubscription.getAndSet((Object) null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            pc6 pc63 = this.actual;
            if (this.cancelled) {
                if (pc63 != null) {
                    pc63.cancel();
                    this.actual = null;
                }
                if (pc62 != null) {
                    pc62.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C3866ax.m32278c(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            SubscriptionHelper.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.requested = j4;
                }
                if (pc62 != null) {
                    if (pc63 != null) {
                        pc63.cancel();
                    }
                    this.actual = pc62;
                    if (j4 != 0) {
                        j = C3866ax.m32278c(j, j4);
                        pc6 = pc62;
                    }
                } else if (!(pc63 == null || j2 == 0)) {
                    j = C3866ax.m32278c(j, j2);
                    pc6 = pc63;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            pc6.request(j);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C3866ax.m32276a(this.missedProduced, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    SubscriptionHelper.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.requested = j3;
            }
            if (decrementAndGet() != 0) {
                drainLoop();
            }
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C3866ax.m32276a(this.missedRequested, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long c = C3866ax.m32278c(j2, j);
                this.requested = c;
                if (c == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            pc6 pc6 = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (pc6 != null) {
                pc6.request(j);
            }
        }
    }

    public final void setSubscription(pc6 pc6) {
        if (this.cancelled) {
            pc6.cancel();
            return;
        }
        af4.m31828d(pc6, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            pc6 andSet = this.missedSubscription.getAndSet(pc6);
            if (andSet != null) {
                andSet.cancel();
            }
            drain();
            return;
        }
        pc6 pc62 = this.actual;
        if (pc62 != null) {
            pc62.cancel();
        }
        this.actual = pc6;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j != 0) {
            pc6.request(j);
        }
    }
}
