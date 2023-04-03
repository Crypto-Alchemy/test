package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest */
public final class FlowableOnBackpressureLatest<T> extends C5753e6<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest$BackpressureLatestSubscriber */
    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements y52<T>, pc6 {
        private static final long serialVersionUID = 163080509307634843L;
        public volatile boolean cancelled;
        public final AtomicReference<T> current = new AtomicReference<>();
        public volatile boolean done;
        public final nc6<? super T> downstream;
        public Throwable error;
        public final AtomicLong requested = new AtomicLong();
        public pc6 upstream;

        public BackpressureLatestSubscriber(nc6<? super T> nc6) {
            this.downstream = nc6;
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet((Object) null);
                }
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, nc6<?> nc6, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    nc6.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    nc6.onComplete();
                    return true;
                }
            }
        }

        public void drain() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                nc6<? super T> nc6 = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.done;
                        T andSet = atomicReference.getAndSet((Object) null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!checkTerminated(z3, z2, nc6, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            nc6.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (checkTerminated(z4, z, nc6, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C3866ax.m32279d(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            this.current.lazySet(t);
            drain();
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.validate(this.upstream, pc6)) {
                this.upstream = pc6;
                this.downstream.onSubscribe(this);
                pc6.request(Long.MAX_VALUE);
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this.requested, j);
                drain();
            }
        }
    }

    public FlowableOnBackpressureLatest(g52<T> g52) {
        super(g52);
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        this.f28406d.mo42759J(new BackpressureLatestSubscriber(nc6));
    }
}
