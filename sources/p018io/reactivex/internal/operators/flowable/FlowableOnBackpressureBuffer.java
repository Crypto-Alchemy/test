package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.queue.SpscArrayQueue;
import p018io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer */
public final class FlowableOnBackpressureBuffer<T> extends C5753e6<T, T> {

    /* renamed from: e */
    public final int f30030e;

    /* renamed from: g */
    public final boolean f30031g;

    /* renamed from: k */
    public final boolean f30032k;

    /* renamed from: r */
    public final C3803a9 f30033r;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer$BackpressureBufferSubscriber */
    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements y52<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final nc6<? super T> downstream;
        public Throwable error;
        public final C3803a9 onOverflow;
        public boolean outputFused;
        public final r26<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public pc6 upstream;

        public BackpressureBufferSubscriber(nc6<? super T> nc6, int i, boolean z, boolean z2, C3803a9 a9Var) {
            r26<T> r26;
            this.downstream = nc6;
            this.onOverflow = a9Var;
            this.delayError = z2;
            if (z) {
                r26 = new k76<>(i);
            } else {
                r26 = new SpscArrayQueue<>(i);
            }
            this.queue = r26;
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, nc6<? super T> nc6) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        nc6.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        nc6.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        nc6.onError(th2);
                    } else {
                        nc6.onComplete();
                    }
                    return true;
                }
            }
        }

        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            int i;
            boolean z;
            if (getAndIncrement() == 0) {
                r26<T> r26 = this.queue;
                nc6<? super T> nc6 = this.downstream;
                int i2 = 1;
                while (!checkTerminated(this.done, r26.isEmpty(), nc6)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z2 = this.done;
                        T poll = r26.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, nc6)) {
                            if (z) {
                                break;
                            }
                            nc6.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !checkTerminated(this.done, r26.isEmpty(), nc6)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    ou1.m49570a(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                drain();
            }
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.validate(this.upstream, pc6)) {
                this.upstream = pc6;
                this.downstream.onSubscribe(this);
                pc6.request(Long.MAX_VALUE);
            }
        }

        public T poll() throws Exception {
            return this.queue.poll();
        }

        public void request(long j) {
            if (!this.outputFused && SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this.requested, j);
                drain();
            }
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(g52<T> g52, int i, boolean z, boolean z2, C3803a9 a9Var) {
        super(g52);
        this.f30030e = i;
        this.f30031g = z;
        this.f30032k = z2;
        this.f30033r = a9Var;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        this.f28406d.mo42759J(new BackpressureBufferSubscriber(nc6, this.f30030e, this.f30031g, this.f30032k, this.f30033r));
    }
}
