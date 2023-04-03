package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import p000.nm5;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.queue.SpscArrayQueue;
import p018io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn */
public final class FlowableObserveOn<T> extends C5753e6<T, T> {

    /* renamed from: e */
    public final nm5 f30027e;

    /* renamed from: g */
    public final boolean f30028g;

    /* renamed from: k */
    public final int f30029k;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber */
    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements y52<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public boolean outputFused;
        public final int prefetch;
        public long produced;
        public w26<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public int sourceMode;
        public pc6 upstream;
        public final nm5.C6288b worker;

        public BaseObserveOnSubscriber(nm5.C6288b bVar, boolean z, int i) {
            this.worker = bVar;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final boolean checkTerminated(boolean z, boolean z2, nc6<?> nc6) {
            if (this.cancelled) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        clear();
                        nc6.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        nc6.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        nc6.onError(th2);
                    } else {
                        nc6.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
        }

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                trySchedule();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                ti5.m52312m(th);
                return;
            }
            this.error = th;
            this.done = true;
            trySchedule();
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    trySchedule();
                    return;
                }
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                trySchedule();
            }
        }

        public abstract /* synthetic */ void onSubscribe(pc6 pc6);

        public abstract /* synthetic */ T poll() throws Exception;

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this.requested, j);
                trySchedule();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
            if (getAndIncrement() == 0) {
                this.worker.mo42930b(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnConditionalSubscriber */
    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        public long consumed;
        public final mo0<? super T> downstream;

        public ObserveOnConditionalSubscriber(mo0<? super T> mo0, nm5.C6288b bVar, boolean z, int i) {
            super(bVar, z, i);
            this.downstream = mo0;
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.validate(this.upstream, pc6)) {
                this.upstream = pc6;
                if (pc6 instanceof r05) {
                    r05 r05 = (r05) pc6;
                    int requestFusion = r05.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = r05;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = r05;
                        this.downstream.onSubscribe(this);
                        pc6.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                pc6.request((long) this.prefetch);
            }
        }

        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.request(j);
                } else {
                    this.consumed = j;
                }
            }
            return poll;
        }

        public void runAsync() {
            int i;
            boolean z;
            mo0<? super T> mo0 = this.downstream;
            w26<T> w26 = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i2 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.done;
                    try {
                        T poll = w26.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, mo0)) {
                            if (z) {
                                break;
                            }
                            if (mo0.mo43464b(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                this.upstream.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        w26.clear();
                        mo0.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, w26.isEmpty(), mo0)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        this.consumed = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        public void runBackfused() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public void runSync() {
            mo0<? super T> mo0 = this.downstream;
            w26<T> w26 = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = w26.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                mo0.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (mo0.mo43464b(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        mo0.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (w26.isEmpty()) {
                        this.cancelled = true;
                        mo0.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableObserveOn$ObserveOnSubscriber */
    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        public final nc6<? super T> downstream;

        public ObserveOnSubscriber(nc6<? super T> nc6, nm5.C6288b bVar, boolean z, int i) {
            super(bVar, z, i);
            this.downstream = nc6;
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.validate(this.upstream, pc6)) {
                this.upstream = pc6;
                if (pc6 instanceof r05) {
                    r05 r05 = (r05) pc6;
                    int requestFusion = r05.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = 1;
                        this.queue = r05;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = 2;
                        this.queue = r05;
                        this.downstream.onSubscribe(this);
                        pc6.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                pc6.request((long) this.prefetch);
            }
        }

        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.request(j);
                } else {
                    this.produced = j;
                }
            }
            return poll;
        }

        public void runAsync() {
            int i;
            boolean z;
            nc6<? super T> nc6 = this.downstream;
            w26<T> w26 = this.queue;
            long j = this.produced;
            int i2 = 1;
            while (true) {
                long j2 = this.requested.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.done;
                    try {
                        T poll = w26.poll();
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
                            j++;
                            if (j == ((long) this.limit)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.requested.addAndGet(-j);
                                }
                                this.upstream.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        w26.clear();
                        nc6.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !checkTerminated(this.done, w26.isEmpty(), nc6)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        public void runBackfused() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public void runSync() {
            nc6<? super T> nc6 = this.downstream;
            w26<T> w26 = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = w26.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                nc6.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            nc6.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        nc6.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (w26.isEmpty()) {
                        this.cancelled = true;
                        nc6.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public FlowableObserveOn(g52<T> g52, nm5 nm5, boolean z, int i) {
        super(g52);
        this.f30027e = nm5;
        this.f30028g = z;
        this.f30029k = i;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        nm5.C6288b a = this.f30027e.mo42927a();
        if (nc6 instanceof mo0) {
            this.f28406d.mo42759J(new ObserveOnConditionalSubscriber((mo0) nc6, a, this.f30028g, this.f30029k));
        } else {
            this.f28406d.mo42759J(new ObserveOnSubscriber(nc6, a, this.f30028g, this.f30029k));
        }
    }
}
