package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.queue.SpscArrayQueue;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.AtomicThrowable;
import p018io.reactivex.internal.util.ExceptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMap */
public final class FlowableFlatMap<T, U> extends C5753e6<T, U> {

    /* renamed from: e */
    public final jd2<? super T, ? extends vy4<? extends U>> f30016e;

    /* renamed from: g */
    public final boolean f30017g;

    /* renamed from: k */
    public final int f30018k;

    /* renamed from: r */
    public final int f30019r;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber */
    public static final class InnerSubscriber<T, U> extends AtomicReference<pc6> implements y52<U>, th1 {
        private static final long serialVersionUID = -4606175640614850599L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;

        /* renamed from: id */
        public final long f30020id;
        public final int limit;
        public final MergeSubscriber<T, U> parent;
        public long produced;
        public volatile w26<U> queue;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.f30020id = j;
            this.parent = mergeSubscriber;
            int i = mergeSubscriber.bufferSize;
            this.bufferSize = i;
            this.limit = i >> 2;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        public boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        public void onNext(U u) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.setOnce(this, pc6)) {
                if (pc6 instanceof r05) {
                    r05 r05 = (r05) pc6;
                    int requestFusion = r05.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = r05;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = r05;
                    }
                }
                pc6.request((long) this.bufferSize);
            }
        }

        public void requestMore(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((pc6) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber */
    public static final class MergeSubscriber<T, U> extends AtomicInteger implements y52<T>, pc6 {
        public static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];
        public static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final nc6<? super U> downstream;
        public final AtomicThrowable errs = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final jd2<? super T, ? extends vy4<? extends U>> mapper;
        public final int maxConcurrency;
        public volatile r26<U> queue;
        public final AtomicLong requested;
        public int scalarEmitted;
        public final int scalarLimit;
        public final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        public long uniqueId;
        public pc6 upstream;

        public MergeSubscriber(nc6<? super U> nc6, jd2<? super T, ? extends vy4<? extends U>> jd2, boolean z, int i, int i2) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = nc6;
            this.mapper = jd2;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            atomicReference.lazySet(EMPTY);
        }

        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!ao0.m10672a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        public void cancel() {
            r26<U> r26;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeAll();
                if (getAndIncrement() == 0 && (r26 = this.queue) != null) {
                    r26.clear();
                }
            }
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                clearScalarQueue();
                Throwable terminate = this.errs.terminate();
                if (terminate != ExceptionHelper.f30070a) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
        }

        public void clearScalarQueue() {
            r26<U> r26 = this.queue;
            if (r26 != null) {
                r26.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = (InnerSubscriber[]) this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr3 = CANCELLED;
            if (innerSubscriberArr2 != innerSubscriberArr3 && (innerSubscriberArr = (InnerSubscriber[]) this.subscribers.getAndSet(innerSubscriberArr3)) != innerSubscriberArr3) {
                for (InnerSubscriber<?, ?> dispose : innerSubscriberArr) {
                    dispose.dispose();
                }
                Throwable terminate = this.errs.terminate();
                if (terminate != null && terminate != ExceptionHelper.f30070a) {
                    ti5.m52312m(terminate);
                }
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            boolean z;
            long j;
            boolean z2;
            long j2;
            long j3;
            int i;
            int i2;
            long j4;
            nc6<? super U> nc6 = this.downstream;
            int i3 = 1;
            while (!checkTerminate()) {
                r26<U> r26 = this.queue;
                long j5 = this.requested.get();
                if (j5 == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                long j6 = 0;
                long j7 = 0;
                if (r26 != null) {
                    while (true) {
                        long j8 = 0;
                        U u = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            U poll = r26.poll();
                            if (!checkTerminate()) {
                                if (poll == null) {
                                    u = poll;
                                    break;
                                }
                                nc6.onNext(poll);
                                j7++;
                                j8++;
                                j5--;
                                u = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            if (z) {
                                j5 = Long.MAX_VALUE;
                            } else {
                                j5 = this.requested.addAndGet(-j8);
                            }
                        }
                        if (j5 == 0 || u == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.done;
                r26<U> r262 = this.queue;
                InnerSubscriber[] innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (!z3 || ((r262 != null && !r262.isEmpty()) || length != 0)) {
                    int i4 = i3;
                    if (length != 0) {
                        long j9 = this.lastId;
                        int i5 = this.lastIndex;
                        if (length <= i5 || innerSubscriberArr[i5].f30020id != j9) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && innerSubscriberArr[i5].f30020id != j9; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.lastIndex = i5;
                            this.lastId = innerSubscriberArr[i5].f30020id;
                        }
                        int i7 = i5;
                        boolean z4 = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                z2 = z4;
                                break;
                            } else if (!checkTerminate()) {
                                InnerSubscriber innerSubscriber = innerSubscriberArr[i7];
                                U u2 = null;
                                while (!checkTerminate()) {
                                    w26<U> w26 = innerSubscriber.queue;
                                    if (w26 == null) {
                                        i = length;
                                    } else {
                                        i = length;
                                        U u3 = u2;
                                        long j10 = j6;
                                        while (true) {
                                            if (j == j6) {
                                                break;
                                            }
                                            try {
                                                U poll2 = w26.poll();
                                                if (poll2 == null) {
                                                    u3 = poll2;
                                                    j6 = 0;
                                                    break;
                                                }
                                                nc6.onNext(poll2);
                                                if (!checkTerminate()) {
                                                    j--;
                                                    j10++;
                                                    u3 = poll2;
                                                    j6 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                ou1.m49570a(th2);
                                                innerSubscriber.dispose();
                                                this.errs.addThrowable(th2);
                                                if (!this.delayErrors) {
                                                    this.upstream.cancel();
                                                }
                                                if (!checkTerminate()) {
                                                    removeInner(innerSubscriber);
                                                    i8++;
                                                    z4 = true;
                                                    i2 = 1;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            if (!z) {
                                                j = this.requested.addAndGet(-j10);
                                            } else {
                                                j = Long.MAX_VALUE;
                                            }
                                            innerSubscriber.requestMore(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || u3 == null)) {
                                            length = i;
                                            u2 = u3;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z5 = innerSubscriber.done;
                                    w26<U> w262 = innerSubscriber.queue;
                                    if (z5 && (w262 == null || w262.isEmpty())) {
                                        removeInner(innerSubscriber);
                                        if (!checkTerminate()) {
                                            j7++;
                                            z4 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        z2 = z4;
                                        break;
                                    }
                                    i7++;
                                    if (i7 == i) {
                                        i7 = 0;
                                    }
                                    i2 = 1;
                                    i8 += i2;
                                    length = i;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i7;
                        this.lastId = innerSubscriberArr[i7].f30020id;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z2 = false;
                    }
                    if (j3 != j2 && !this.cancelled) {
                        this.upstream.request(j3);
                    }
                    if (z2) {
                        i3 = i4;
                    } else {
                        i3 = addAndGet(-i4);
                        if (i3 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable terminate = this.errs.terminate();
                    if (terminate == ExceptionHelper.f30070a) {
                        return;
                    }
                    if (terminate == null) {
                        nc6.onComplete();
                        return;
                    } else {
                        nc6.onError(terminate);
                        return;
                    }
                }
            }
        }

        public w26<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            w26<U> w26 = innerSubscriber.queue;
            if (w26 != null) {
                return w26;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        public w26<U> getMainQueue() {
            r26<U> r26 = this.queue;
            if (r26 == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    r26 = new k76<>(this.bufferSize);
                } else {
                    r26 = new SpscArrayQueue<>(this.maxConcurrency);
                }
                this.queue = r26;
            }
            return r26;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (this.errs.addThrowable(th)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (InnerSubscriber dispose : (InnerSubscriber[]) this.subscribers.getAndSet(CANCELLED)) {
                        dispose.dispose();
                    }
                }
                drain();
                return;
            }
            ti5.m52312m(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                ti5.m52312m(th);
            } else if (this.errs.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                ti5.m52312m(th);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    vy4 vy4 = (vy4) af4.m31828d(this.mapper.apply(t), "The mapper returned a null Publisher");
                    if (vy4 instanceof Callable) {
                        try {
                            Object call = ((Callable) vy4).call();
                            if (call != null) {
                                tryEmitScalar(call);
                            } else if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                int i = this.scalarEmitted + 1;
                                this.scalarEmitted = i;
                                int i2 = this.scalarLimit;
                                if (i == i2) {
                                    this.scalarEmitted = 0;
                                    this.upstream.request((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            ou1.m49570a(th);
                            this.errs.addThrowable(th);
                            drain();
                        }
                    } else {
                        long j = this.uniqueId;
                        this.uniqueId = 1 + j;
                        InnerSubscriber innerSubscriber = new InnerSubscriber(this, j);
                        if (addInner(innerSubscriber)) {
                            vy4.mo40232a(innerSubscriber);
                        }
                    }
                } catch (Throwable th2) {
                    ou1.m49570a(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.validate(this.upstream, pc6)) {
                this.upstream = pc6;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    int i = this.maxConcurrency;
                    if (i == Integer.MAX_VALUE) {
                        pc6.request(Long.MAX_VALUE);
                    } else {
                        pc6.request((long) i);
                    }
                }
            }
        }

        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<T, U>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = (InnerSubscriber[]) this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerSubscriberArr[i2] == innerSubscriber) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriberArr2 = EMPTY;
                        } else {
                            InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[(length - 1)];
                            System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                            System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                            innerSubscriberArr2 = innerSubscriberArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!ao0.m10672a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this.requested, j);
                drain();
            }
        }

        public void tryEmit(U u, InnerSubscriber<T, U> innerSubscriber) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                w26 w26 = innerSubscriber.queue;
                if (w26 == null) {
                    w26 = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = w26;
                }
                if (!w26.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.requested.get();
                w26<U> w262 = innerSubscriber.queue;
                if (j == 0 || (w262 != null && !w262.isEmpty())) {
                    if (w262 == null) {
                        w262 = getInnerQueue(innerSubscriber);
                    }
                    if (!w262.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void tryEmitScalar(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                w26 w26 = this.queue;
                if (j == 0 || (w26 != null && !w26.isEmpty())) {
                    if (w26 == null) {
                        w26 = getMainQueue();
                    }
                    if (!w26.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public FlowableFlatMap(g52<T> g52, jd2<? super T, ? extends vy4<? extends U>> jd2, boolean z, int i, int i2) {
        super(g52);
        this.f30016e = jd2;
        this.f30017g = z;
        this.f30018k = i;
        this.f30019r = i2;
    }

    /* renamed from: R */
    public static <T, U> y52<T> m45843R(nc6<? super U> nc6, jd2<? super T, ? extends vy4<? extends U>> jd2, boolean z, int i, int i2) {
        return new MergeSubscriber(nc6, jd2, z, i, i2);
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super U> nc6) {
        if (!w52.m53704b(this.f28406d, nc6, this.f30016e)) {
            this.f28406d.mo42759J(m45843R(nc6, this.f30016e, this.f30017g, this.f30018k, this.f30019r));
        }
    }
}
