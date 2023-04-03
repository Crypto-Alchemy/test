package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.internal.disposables.DisposableHelper;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.AtomicThrowable;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe */
public final class FlowableFlatMapMaybe<T, R> extends C5753e6<T, R> {

    /* renamed from: e */
    public final jd2<? super T, ? extends up3<? extends R>> f30021e;

    /* renamed from: g */
    public final boolean f30022g;

    /* renamed from: k */
    public final int f30023k;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe$FlatMapMaybeSubscriber */
    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements y52<T>, pc6 {
        private static final long serialVersionUID = 8600231336733376951L;
        public final AtomicInteger active = new AtomicInteger(1);
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final nc6<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final jd2<? super T, ? extends up3<? extends R>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<k76<R>> queue = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();
        public final pn0 set = new pn0();
        public pc6 upstream;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe$FlatMapMaybeSubscriber$InnerObserver */
        public final class InnerObserver extends AtomicReference<th1> implements tp3<R>, th1 {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((th1) get());
            }

            public void onComplete() {
                FlatMapMaybeSubscriber.this.innerComplete(this);
            }

            public void onError(Throwable th) {
                FlatMapMaybeSubscriber.this.innerError(this, th);
            }

            public void onSubscribe(th1 th1) {
                DisposableHelper.setOnce(this, th1);
            }

            public void onSuccess(R r) {
                FlatMapMaybeSubscriber.this.innerSuccess(this, r);
            }
        }

        public FlatMapMaybeSubscriber(nc6<? super R> nc6, jd2<? super T, ? extends up3<? extends R>> jd2, boolean z, int i) {
            this.downstream = nc6;
            this.mapper = jd2;
            this.delayErrors = z;
            this.maxConcurrency = i;
        }

        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        public void clear() {
            k76 k76 = this.queue.get();
            if (k76 != null) {
                k76.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            int i;
            boolean z;
            boolean z2;
            boolean z3;
            Object obj;
            boolean z4;
            nc6<? super R> nc6 = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<k76<R>> atomicReference = this.queue;
            int i2 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    z = false;
                    if (i == 0) {
                        break;
                    } else if (this.cancelled) {
                        clear();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        if (atomicInteger.get() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        k76 k76 = atomicReference.get();
                        if (k76 != null) {
                            obj = k76.poll();
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 && z4) {
                            Throwable terminate = this.errors.terminate();
                            if (terminate != null) {
                                nc6.onError(terminate);
                                return;
                            } else {
                                nc6.onComplete();
                                return;
                            }
                        } else if (z4) {
                            break;
                        } else {
                            nc6.onNext(obj);
                            j2++;
                        }
                    } else {
                        Throwable terminate2 = this.errors.terminate();
                        clear();
                        nc6.onError(terminate2);
                        return;
                    }
                }
                if (i == 0) {
                    if (this.cancelled) {
                        clear();
                        return;
                    } else if (this.delayErrors || ((Throwable) this.errors.get()) == null) {
                        if (atomicInteger.get() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        k76 k762 = atomicReference.get();
                        if (k762 == null || k762.isEmpty()) {
                            z = true;
                        }
                        if (z2 && z) {
                            Throwable terminate3 = this.errors.terminate();
                            if (terminate3 != null) {
                                nc6.onError(terminate3);
                                return;
                            } else {
                                nc6.onComplete();
                                return;
                            }
                        }
                    } else {
                        Throwable terminate4 = this.errors.terminate();
                        clear();
                        nc6.onError(terminate4);
                        return;
                    }
                }
                if (j2 != 0) {
                    C3866ax.m32279d(this.requested, j2);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(j2);
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        public k76<R> getOrCreateQueue() {
            k76<R> k76;
            do {
                k76<R> k762 = this.queue.get();
                if (k762 != null) {
                    return k762;
                }
                k76 = new k76<>(g52.m44527c());
            } while (!ao0.m10672a(this.queue, (Object) null, k76));
            return k76;
        }

        public void innerComplete(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver) {
            this.set.mo46789c(innerObserver);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() == 0) {
                        z = true;
                    }
                    k76 k76 = this.queue.get();
                    if (!z || (k76 != null && !k76.isEmpty())) {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            this.upstream.request(1);
                        }
                        if (decrementAndGet() != 0) {
                            drainLoop();
                            return;
                        }
                        return;
                    }
                    Throwable terminate = this.errors.terminate();
                    if (terminate != null) {
                        this.downstream.onError(terminate);
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
            }
            this.active.decrementAndGet();
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1);
            }
            drain();
        }

        public void innerError(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, Throwable th) {
            this.set.mo46789c(innerObserver);
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    this.set.dispose();
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1);
                }
                this.active.decrementAndGet();
                drain();
                return;
            }
            ti5.m52312m(th);
        }

        public void innerSuccess(FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, R r) {
            this.set.mo46789c(innerObserver);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.active.decrementAndGet() == 0) {
                        z = true;
                    }
                    if (this.requested.get() != 0) {
                        this.downstream.onNext(r);
                        k76 k76 = this.queue.get();
                        if (!z || (k76 != null && !k76.isEmpty())) {
                            C3866ax.m32279d(this.requested, 1);
                            if (this.maxConcurrency != Integer.MAX_VALUE) {
                                this.upstream.request(1);
                            }
                        } else {
                            Throwable terminate = this.errors.terminate();
                            if (terminate != null) {
                                this.downstream.onError(terminate);
                                return;
                            } else {
                                this.downstream.onComplete();
                                return;
                            }
                        }
                    } else {
                        k76 orCreateQueue = getOrCreateQueue();
                        synchronized (orCreateQueue) {
                            orCreateQueue.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    drainLoop();
                }
            }
            k76 orCreateQueue2 = getOrCreateQueue();
            synchronized (orCreateQueue2) {
                orCreateQueue2.offer(r);
            }
            this.active.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        public void onError(Throwable th) {
            this.active.decrementAndGet();
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.set.dispose();
                }
                drain();
                return;
            }
            ti5.m52312m(th);
        }

        public void onNext(T t) {
            try {
                up3 up3 = (up3) af4.m31828d(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.cancelled && this.set.mo46787a(innerObserver)) {
                    up3.mo46446a(innerObserver);
                }
            } catch (Throwable th) {
                ou1.m49570a(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.validate(this.upstream, pc6)) {
                this.upstream = pc6;
                this.downstream.onSubscribe(this);
                int i = this.maxConcurrency;
                if (i == Integer.MAX_VALUE) {
                    pc6.request(Long.MAX_VALUE);
                } else {
                    pc6.request((long) i);
                }
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this.requested, j);
                drain();
            }
        }
    }

    public FlowableFlatMapMaybe(g52<T> g52, jd2<? super T, ? extends up3<? extends R>> jd2, boolean z, int i) {
        super(g52);
        this.f30021e = jd2;
        this.f30022g = z;
        this.f30023k = i;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super R> nc6) {
        this.f28406d.mo42759J(new FlatMapMaybeSubscriber(nc6, this.f30021e, this.f30022g, this.f30023k));
    }
}
