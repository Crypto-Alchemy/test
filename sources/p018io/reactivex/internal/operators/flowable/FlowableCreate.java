package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.BackpressureStrategy;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.disposables.CancellableDisposable;
import p018io.reactivex.internal.disposables.SequentialDisposable;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.AtomicThrowable;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate */
public final class FlowableCreate<T> extends g52<T> {

    /* renamed from: d */
    public final u52<T> f30010d;

    /* renamed from: e */
    public final BackpressureStrategy f30011e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter */
    public static abstract class BaseEmitter<T> extends AtomicLong implements l52<T>, pc6 {
        private static final long serialVersionUID = 7326289992464377023L;
        public final nc6<? super T> downstream;
        public final SequentialDisposable serial = new SequentialDisposable();

        public BaseEmitter(nc6<? super T> nc6) {
            this.downstream = nc6;
        }

        public final void cancel() {
            this.serial.dispose();
            onUnsubscribed();
        }

        public void complete() {
            if (!isCancelled()) {
                try {
                    this.downstream.onComplete();
                } finally {
                    this.serial.dispose();
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean error(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                this.serial.dispose();
                return true;
            } catch (Throwable th2) {
                this.serial.dispose();
                throw th2;
            }
        }

        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }

        public void onComplete() {
            complete();
        }

        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                ti5.m52312m(th);
            }
        }

        public abstract /* synthetic */ void onNext(T t);

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this, j);
                onRequested();
            }
        }

        public final long requested() {
            return get();
        }

        public final l52<T> serialize() {
            return new SerializedEmitter(this);
        }

        public final void setCancellable(ka0 ka0) {
            setDisposable(new CancellableDisposable(ka0));
        }

        public final void setDisposable(th1 th1) {
            this.serial.update(th1);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        public boolean tryOnError(Throwable th) {
            return error(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter */
    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        public volatile boolean done;
        public Throwable error;
        public final k76<T> queue;
        public final AtomicInteger wip = new AtomicInteger();

        public BufferAsyncEmitter(nc6<? super T> nc6, int i) {
            super(nc6);
            this.queue = new k76<>(i);
        }

        public void drain() {
            int i;
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                nc6<? super T> nc6 = this.downstream;
                k76<T> k76 = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            k76.clear();
                            return;
                        } else {
                            boolean z2 = this.done;
                            T poll = k76.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                Throwable th = this.error;
                                if (th != null) {
                                    error(th);
                                    return;
                                } else {
                                    complete();
                                    return;
                                }
                            } else if (z) {
                                break;
                            } else {
                                nc6.onNext(poll);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            k76.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = k76.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                error(th2);
                                return;
                            } else {
                                complete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C3866ax.m32279d(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.offer(t);
                drain();
            }
        }

        public void onRequested() {
            drain();
        }

        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$DropAsyncEmitter */
    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropAsyncEmitter(nc6<? super T> nc6) {
            super(nc6);
        }

        public void onOverflow() {
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter */
    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public ErrorAsyncEmitter(nc6<? super T> nc6) {
            super(nc6);
        }

        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter */
    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        public volatile boolean done;
        public Throwable error;
        public final AtomicReference<T> queue = new AtomicReference<>();
        public final AtomicInteger wip = new AtomicInteger();

        public LatestAsyncEmitter(nc6<? super T> nc6) {
            super(nc6);
        }

        public void drain() {
            int i;
            boolean z;
            boolean z2;
            if (this.wip.getAndIncrement() == 0) {
                nc6<? super T> nc6 = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        z = false;
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        } else {
                            boolean z3 = this.done;
                            T andSet = atomicReference.getAndSet((Object) null);
                            if (andSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z3 && z2) {
                                Throwable th = this.error;
                                if (th != null) {
                                    error(th);
                                    return;
                                } else {
                                    complete();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                nc6.onNext(andSet);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                error(th2);
                                return;
                            } else {
                                complete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C3866ax.m32279d(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.set(t);
                drain();
            }
        }

        public void onRequested() {
            drain();
        }

        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet((Object) null);
            }
        }

        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter */
    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public MissingEmitter(nc6<? super T> nc6) {
            super(nc6);
        }

        public void onNext(T t) {
            long j;
            if (!isCancelled()) {
                if (t != null) {
                    this.downstream.onNext(t);
                    do {
                        j = get();
                        if (j == 0 || compareAndSet(j, j - 1)) {
                            return;
                        }
                        j = get();
                        return;
                    } while (compareAndSet(j, j - 1));
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$NoOverflowBaseAsyncEmitter */
    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public NoOverflowBaseAsyncEmitter(nc6<? super T> nc6) {
            super(nc6);
        }

        public final void onNext(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.downstream.onNext(t);
                    C3866ax.m32279d(this, 1);
                } else {
                    onOverflow();
                }
            }
        }

        public abstract void onOverflow();
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter */
    public static final class SerializedEmitter<T> extends AtomicInteger implements l52<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final BaseEmitter<T> emitter;
        public final AtomicThrowable error = new AtomicThrowable();
        public final r26<T> queue = new k76(16);

        public SerializedEmitter(BaseEmitter<T> baseEmitter) {
            this.emitter = baseEmitter;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            boolean z;
            BaseEmitter<T> baseEmitter = this.emitter;
            r26<T> r26 = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int i = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    r26.clear();
                    baseEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z2 = this.done;
                T poll = r26.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    baseEmitter.onComplete();
                    return;
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    baseEmitter.onNext(poll);
                }
            }
            r26.clear();
        }

        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }

        public void onComplete() {
            if (!this.emitter.isCancelled() && !this.done) {
                this.done = true;
                drain();
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                ti5.m52312m(th);
            }
        }

        public void onNext(T t) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    r26<T> r26 = this.queue;
                    synchronized (r26) {
                        r26.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.emitter.onNext(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        public long requested() {
            return this.emitter.requested();
        }

        public l52<T> serialize() {
            return this;
        }

        public void setCancellable(ka0 ka0) {
            this.emitter.setCancellable(ka0);
        }

        public void setDisposable(th1 th1) {
            this.emitter.setDisposable(th1);
        }

        public String toString() {
            return this.emitter.toString();
        }

        public boolean tryOnError(Throwable th) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$a */
    public static /* synthetic */ class C5983a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30012a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = p018io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30012a = r0
                io.reactivex.BackpressureStrategy r1 = p018io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30012a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.reactivex.BackpressureStrategy r1 = p018io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30012a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.reactivex.BackpressureStrategy r1 = p018io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30012a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.reactivex.BackpressureStrategy r1 = p018io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.internal.operators.flowable.FlowableCreate.C5983a.<clinit>():void");
        }
    }

    public FlowableCreate(u52<T> u52, BackpressureStrategy backpressureStrategy) {
        this.f30010d = u52;
        this.f30011e = backpressureStrategy;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        BaseEmitter baseEmitter;
        int i = C5983a.f30012a[this.f30011e.ordinal()];
        if (i == 1) {
            baseEmitter = new MissingEmitter(nc6);
        } else if (i == 2) {
            baseEmitter = new ErrorAsyncEmitter(nc6);
        } else if (i == 3) {
            baseEmitter = new DropAsyncEmitter(nc6);
        } else if (i != 4) {
            baseEmitter = new BufferAsyncEmitter(nc6, g52.m44527c());
        } else {
            baseEmitter = new LatestAsyncEmitter(nc6);
        }
        nc6.onSubscribe(baseEmitter);
        try {
            this.f30010d.mo48320a(baseEmitter);
        } catch (Throwable th) {
            ou1.m49570a(th);
            baseEmitter.onError(th);
        }
    }
}
