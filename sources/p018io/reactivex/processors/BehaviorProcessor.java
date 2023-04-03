package p018io.reactivex.processors;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.C5927ho;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.ExceptionHelper;
import p018io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.processors.BehaviorProcessor */
public final class BehaviorProcessor<T> extends v52<T> {

    /* renamed from: A */
    public static final BehaviorSubscription[] f30073A = new BehaviorSubscription[0];

    /* renamed from: B */
    public static final BehaviorSubscription[] f30074B = new BehaviorSubscription[0];

    /* renamed from: y */
    public static final Object[] f30075y = new Object[0];

    /* renamed from: d */
    public final AtomicReference<BehaviorSubscription<T>[]> f30076d;

    /* renamed from: e */
    public final ReadWriteLock f30077e;

    /* renamed from: g */
    public final Lock f30078g;

    /* renamed from: k */
    public final Lock f30079k;

    /* renamed from: r */
    public final AtomicReference<Object> f30080r = new AtomicReference<>();

    /* renamed from: s */
    public final AtomicReference<Throwable> f30081s;

    /* renamed from: x */
    public long f30082x;

    /* renamed from: io.reactivex.processors.BehaviorProcessor$BehaviorSubscription */
    public static final class BehaviorSubscription<T> extends AtomicLong implements pc6, C5927ho.C5928a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        public volatile boolean cancelled;
        public final nc6<? super T> downstream;
        public boolean emitting;
        public boolean fastPath;
        public long index;
        public boolean next;
        public C5927ho<Object> queue;
        public final BehaviorProcessor<T> state;

        public BehaviorSubscription(nc6<? super T> nc6, BehaviorProcessor<T> behaviorProcessor) {
            this.downstream = nc6;
            this.state = behaviorProcessor;
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.mo43868U(this);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            emitLoop();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void emitFirst() {
            /*
                r4 = this;
                boolean r0 = r4.cancelled
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.cancelled     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.next     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                io.reactivex.processors.BehaviorProcessor<T> r0 = r4.state     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f30078g     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f30082x     // Catch:{ all -> 0x003e }
                r4.index = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f30080r     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = r1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.emitting = r2     // Catch:{ all -> 0x003e }
                r4.next = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.emitLoop()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.emitFirst():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo43337c(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void emitLoop() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                ho<java.lang.Object> r0 = r2.queue     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.emitting = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.queue = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo43337c(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.emitLoop():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r2.fastPath = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void emitNext(java.lang.Object r3, long r4) {
            /*
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r2.fastPath
                if (r0 != 0) goto L_0x0037
                monitor-enter(r2)
                boolean r0 = r2.cancelled     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r2.index     // Catch:{ all -> 0x0034 }
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x0018
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r4 = r2.emitting     // Catch:{ all -> 0x0034 }
                if (r4 == 0) goto L_0x002d
                ho<java.lang.Object> r4 = r2.queue     // Catch:{ all -> 0x0034 }
                if (r4 != 0) goto L_0x0028
                ho r4 = new ho     // Catch:{ all -> 0x0034 }
                r5 = 4
                r4.<init>(r5)     // Catch:{ all -> 0x0034 }
                r2.queue = r4     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r4.mo43336b(r3)     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r4 = 1
                r2.next = r4     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                r2.fastPath = r4
                goto L_0x0037
            L_0x0034:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                throw r3
            L_0x0037:
                r2.test(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.processors.BehaviorProcessor.BehaviorSubscription.emitNext(java.lang.Object, long):void");
        }

        public boolean isFull() {
            if (get() == 0) {
                return true;
            }
            return false;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this, j);
            }
        }

        public boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.downstream.onComplete();
                return true;
            } else if (NotificationLite.isError(obj)) {
                this.downstream.onError(NotificationLite.getError(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.downstream.onNext(NotificationLite.getValue(obj));
                    if (j == Long.MAX_VALUE) {
                        return false;
                    }
                    decrementAndGet();
                    return false;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }
    }

    public BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f30077e = reentrantReadWriteLock;
        this.f30078g = reentrantReadWriteLock.readLock();
        this.f30079k = reentrantReadWriteLock.writeLock();
        this.f30076d = new AtomicReference<>(f30073A);
        this.f30081s = new AtomicReference<>();
    }

    /* renamed from: T */
    public static <T> BehaviorProcessor<T> m45878T() {
        return new BehaviorProcessor<>();
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        BehaviorSubscription behaviorSubscription = new BehaviorSubscription(nc6, this);
        nc6.onSubscribe(behaviorSubscription);
        if (!mo43867S(behaviorSubscription)) {
            Throwable th = this.f30081s.get();
            if (th == ExceptionHelper.f30070a) {
                nc6.onComplete();
            } else {
                nc6.onError(th);
            }
        } else if (behaviorSubscription.cancelled) {
            mo43868U(behaviorSubscription);
        } else {
            behaviorSubscription.emitFirst();
        }
    }

    /* renamed from: S */
    public boolean mo43867S(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = (BehaviorSubscription[]) this.f30076d.get();
            if (behaviorSubscriptionArr == f30074B) {
                return false;
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new BehaviorSubscription[(length + 1)];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!ao0.m10672a(this.f30076d, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        return true;
    }

    /* renamed from: U */
    public void mo43868U(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = (BehaviorSubscription[]) this.f30076d.get();
            int length = behaviorSubscriptionArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (behaviorSubscriptionArr[i2] == behaviorSubscription) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        behaviorSubscriptionArr2 = f30073A;
                    } else {
                        BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[(length - 1)];
                        System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i);
                        System.arraycopy(behaviorSubscriptionArr, i + 1, behaviorSubscriptionArr3, i, (length - i) - 1);
                        behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!ao0.m10672a(this.f30076d, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    /* renamed from: V */
    public void mo43869V(Object obj) {
        Lock lock = this.f30079k;
        lock.lock();
        this.f30082x++;
        this.f30080r.lazySet(obj);
        lock.unlock();
    }

    /* renamed from: W */
    public BehaviorSubscription<T>[] mo43870W(Object obj) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr = (BehaviorSubscription[]) this.f30076d.get();
        BehaviorSubscription<T>[] behaviorSubscriptionArr2 = f30074B;
        if (!(behaviorSubscriptionArr == behaviorSubscriptionArr2 || (behaviorSubscriptionArr = (BehaviorSubscription[]) this.f30076d.getAndSet(behaviorSubscriptionArr2)) == behaviorSubscriptionArr2)) {
            mo43869V(obj);
        }
        return behaviorSubscriptionArr;
    }

    public void onComplete() {
        if (ao0.m10672a(this.f30081s, (Object) null, ExceptionHelper.f30070a)) {
            Object complete = NotificationLite.complete();
            for (BehaviorSubscription emitNext : mo43870W(complete)) {
                emitNext.emitNext(complete, this.f30082x);
            }
        }
    }

    public void onError(Throwable th) {
        af4.m31828d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!ao0.m10672a(this.f30081s, (Object) null, th)) {
            ti5.m52312m(th);
            return;
        }
        Object error = NotificationLite.error(th);
        for (BehaviorSubscription emitNext : mo43870W(error)) {
            emitNext.emitNext(error, this.f30082x);
        }
    }

    public void onNext(T t) {
        af4.m31828d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f30081s.get() == null) {
            Object next = NotificationLite.next(t);
            mo43869V(next);
            for (BehaviorSubscription emitNext : (BehaviorSubscription[]) this.f30076d.get()) {
                emitNext.emitNext(next, this.f30082x);
            }
        }
    }

    public void onSubscribe(pc6 pc6) {
        if (this.f30081s.get() != null) {
            pc6.cancel();
        } else {
            pc6.request(Long.MAX_VALUE);
        }
    }
}
