package p018io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.internal.operators.flowable.C5985a;
import p018io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p018io.reactivex.internal.subscriptions.EmptySubscription;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.ExceptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCombineLatest */
public final class FlowableCombineLatest<T, R> extends g52<R> {

    /* renamed from: d */
    public final vy4<? extends T>[] f30002d = null;

    /* renamed from: e */
    public final Iterable<? extends vy4<? extends T>> f30003e;

    /* renamed from: g */
    public final jd2<? super Object[], ? extends R> f30004g;

    /* renamed from: k */
    public final int f30005k;

    /* renamed from: r */
    public final boolean f30006r;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator */
    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        public volatile boolean cancelled;
        public final jd2<? super Object[], ? extends R> combiner;
        public int completedSources;
        public final boolean delayErrors;
        public volatile boolean done;
        public final nc6<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public final Object[] latest;
        public int nonEmptySources;
        public boolean outputFused;
        public final k76<Object> queue;
        public final AtomicLong requested;
        public final CombineLatestInnerSubscriber<T>[] subscribers;

        public CombineLatestCoordinator(nc6<? super R> nc6, jd2<? super Object[], ? extends R> jd2, int i, int i2, boolean z) {
            this.downstream = nc6;
            this.combiner = jd2;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new CombineLatestInnerSubscriber<>(this, i3, i2);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i];
            this.queue = new k76<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z;
        }

        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (CombineLatestInnerSubscriber<T> cancel : this.subscribers) {
                cancel.cancel();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, nc6<?> nc6, k76<?> k76) {
            if (this.cancelled) {
                cancelAll();
                k76.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayErrors) {
                    Throwable b = ExceptionHelper.m45875b(this.error);
                    if (b != null && b != ExceptionHelper.f30070a) {
                        cancelAll();
                        k76.clear();
                        nc6.onError(b);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cancelAll();
                        nc6.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    cancelAll();
                    Throwable b2 = ExceptionHelper.m45875b(this.error);
                    if (b2 == null || b2 == ExceptionHelper.f30070a) {
                        nc6.onComplete();
                    } else {
                        nc6.onError(b2);
                    }
                    return true;
                }
            }
        }

        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                if (this.outputFused) {
                    drainOutput();
                } else {
                    drainAsync();
                }
            }
        }

        public void drainAsync() {
            int i;
            boolean z;
            nc6<? super R> nc6 = this.downstream;
            k76<Object> k76 = this.queue;
            int i2 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.done;
                    Object poll = k76.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!checkTerminated(z2, z, nc6, k76)) {
                        if (z) {
                            break;
                        }
                        try {
                            nc6.onNext(af4.m31828d(this.combiner.apply((Object[]) k76.poll()), "The combiner returned a null value"));
                            ((CombineLatestInnerSubscriber) poll).requestOne();
                            j2++;
                        } catch (Throwable th) {
                            ou1.m49570a(th);
                            cancelAll();
                            ExceptionHelper.m45874a(this.error, th);
                            nc6.onError(ExceptionHelper.m45875b(this.error));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, k76.isEmpty(), nc6, k76)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.requested.addAndGet(-j2);
                    }
                    i2 = addAndGet(-i2);
                } else {
                    return;
                }
            } while (i2 != 0);
        }

        public void drainOutput() {
            nc6<? super R> nc6 = this.downstream;
            k76<Object> k76 = this.queue;
            int i = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    k76.clear();
                    nc6.onError(th);
                    return;
                }
                boolean z = this.done;
                boolean isEmpty = k76.isEmpty();
                if (!isEmpty) {
                    nc6.onNext(null);
                }
                if (!z || !isEmpty) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    nc6.onComplete();
                    return;
                }
            }
            k76.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void innerComplete(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.lang.Object[] r0 = r2.latest     // Catch:{ all -> 0x001c }
                r3 = r0[r3]     // Catch:{ all -> 0x001c }
                r1 = 1
                if (r3 == 0) goto L_0x0015
                int r3 = r2.completedSources     // Catch:{ all -> 0x001c }
                int r3 = r3 + r1
                int r0 = r0.length     // Catch:{ all -> 0x001c }
                if (r3 != r0) goto L_0x0011
                r2.done = r1     // Catch:{ all -> 0x001c }
                goto L_0x0017
            L_0x0011:
                r2.completedSources = r3     // Catch:{ all -> 0x001c }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                return
            L_0x0015:
                r2.done = r1     // Catch:{ all -> 0x001c }
            L_0x0017:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                r2.drain()
                return
            L_0x001c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator.innerComplete(int):void");
        }

        public void innerError(int i, Throwable th) {
            if (!ExceptionHelper.m45874a(this.error, th)) {
                ti5.m52312m(th);
            } else if (!this.delayErrors) {
                cancelAll();
                this.done = true;
                drain();
            } else {
                innerComplete(i);
            }
        }

        public void innerValue(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.latest;
                int i2 = this.nonEmptySources;
                if (objArr[i] == null) {
                    i2++;
                    this.nonEmptySources = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.queue.mo44693k(this.subscribers[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.subscribers[i].requestOne();
            } else {
                drain();
            }
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public R poll() throws Exception {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R d = af4.m31828d(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).requestOne();
            return d;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this.requested, j);
                drain();
            }
        }

        public int requestFusion(int i) {
            boolean z = false;
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            if (i2 != 0) {
                z = true;
            }
            this.outputFused = z;
            return i2;
        }

        public void subscribe(vy4<? extends T>[] vy4Arr, int i) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
                vy4Arr[i2].mo40232a(combineLatestInnerSubscriberArr[i2]);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber */
    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<pc6> implements y52<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        public final int index;
        public final int limit;
        public final CombineLatestCoordinator<T, ?> parent;
        public final int prefetch;
        public int produced;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i, int i2) {
            this.parent = combineLatestCoordinator;
            this.index = i;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        public void onNext(T t) {
            this.parent.innerValue(this.index, t);
        }

        public void onSubscribe(pc6 pc6) {
            SubscriptionHelper.setOnce(this, pc6, (long) this.prefetch);
        }

        public void requestOne() {
            int i = this.produced + 1;
            if (i == this.limit) {
                this.produced = 0;
                ((pc6) get()).request((long) i);
                return;
            }
            this.produced = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCombineLatest$a */
    public final class C5982a implements jd2<T, R> {
        public C5982a() {
        }

        public R apply(T t) throws Exception {
            return FlowableCombineLatest.this.f30004g.apply(new Object[]{t});
        }
    }

    public FlowableCombineLatest(Iterable<? extends vy4<? extends T>> iterable, jd2<? super Object[], ? extends R> jd2, int i, boolean z) {
        this.f30003e = iterable;
        this.f30004g = jd2;
        this.f30005k = i;
        this.f30006r = z;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super R> nc6) {
        int i;
        vy4<? extends T>[] vy4Arr = this.f30002d;
        if (vy4Arr == null) {
            vy4Arr = new vy4[8];
            try {
                Iterator it = (Iterator) af4.m31828d(this.f30003e.iterator(), "The iterator returned is null");
                i = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            vy4<? extends T> vy4 = (vy4) af4.m31828d(it.next(), "The publisher returned by the iterator is null");
                            if (i == vy4Arr.length) {
                                vy4<? extends T>[] vy4Arr2 = new vy4[((i >> 2) + i)];
                                System.arraycopy(vy4Arr, 0, vy4Arr2, 0, i);
                                vy4Arr = vy4Arr2;
                            }
                            vy4Arr[i] = vy4;
                            i++;
                        } catch (Throwable th) {
                            ou1.m49570a(th);
                            EmptySubscription.error(th, nc6);
                            return;
                        }
                    } catch (Throwable th2) {
                        ou1.m49570a(th2);
                        EmptySubscription.error(th2, nc6);
                        return;
                    }
                }
            } catch (Throwable th3) {
                ou1.m49570a(th3);
                EmptySubscription.error(th3, nc6);
                return;
            }
        } else {
            i = vy4Arr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            EmptySubscription.complete(nc6);
        } else if (i2 == 1) {
            vy4Arr[0].mo40232a(new C5985a.C5987b(nc6, new C5982a()));
        } else {
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(nc6, this.f30004g, i2, this.f30005k, this.f30006r);
            nc6.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(vy4Arr, i2);
        }
    }
}
