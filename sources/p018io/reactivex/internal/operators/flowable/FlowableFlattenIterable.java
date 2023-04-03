package p018io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.queue.SpscArrayQueue;
import p018io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p018io.reactivex.internal.subscriptions.EmptySubscription;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.ExceptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFlattenIterable */
public final class FlowableFlattenIterable<T, R> extends C5753e6<T, R> {

    /* renamed from: e */
    public final jd2<? super T, ? extends Iterable<? extends R>> f30024e;

    /* renamed from: g */
    public final int f30025g;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlattenIterable$FlattenIterableSubscriber */
    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements y52<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        public volatile boolean cancelled;
        public int consumed;
        public Iterator<? extends R> current;
        public volatile boolean done;
        public final nc6<? super R> downstream;
        public final AtomicReference<Throwable> error = new AtomicReference<>();
        public int fusionMode;
        public final int limit;
        public final jd2<? super T, ? extends Iterable<? extends R>> mapper;
        public final int prefetch;
        public w26<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public pc6 upstream;

        public FlattenIterableSubscriber(nc6<? super R> nc6, jd2<? super T, ? extends Iterable<? extends R>> jd2, int i) {
            this.downstream = nc6;
            this.mapper = jd2;
            this.prefetch = i;
            this.limit = i - (i >> 2);
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

        public boolean checkTerminated(boolean z, boolean z2, nc6<?> nc6, w26<?> w26) {
            if (this.cancelled) {
                this.current = null;
                w26.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (this.error.get() != null) {
                    Throwable b = ExceptionHelper.m45875b(this.error);
                    this.current = null;
                    w26.clear();
                    nc6.onError(b);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    nc6.onComplete();
                    return true;
                }
            }
        }

        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        public void consumedOne(boolean z) {
            if (z) {
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    this.upstream.request((long) i);
                    return;
                }
                this.consumed = i;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0121, code lost:
            if (r6 == null) goto L_0x012c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void drain() {
            /*
                r18 = this;
                r1 = r18
                int r0 = r18.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                nc6<? super R> r2 = r1.downstream
                w26<T> r3 = r1.queue
                int r0 = r1.fusionMode
                r4 = 0
                r5 = 1
                if (r0 == r5) goto L_0x0015
                r0 = r5
                goto L_0x0016
            L_0x0015:
                r0 = r4
            L_0x0016:
                java.util.Iterator<? extends R> r6 = r1.current
                r7 = 0
                r8 = r5
            L_0x001a:
                if (r6 != 0) goto L_0x0080
                boolean r9 = r1.done
                java.lang.Object r10 = r3.poll()     // Catch:{ all -> 0x0062 }
                if (r10 != 0) goto L_0x0026
                r11 = r5
                goto L_0x0027
            L_0x0026:
                r11 = r4
            L_0x0027:
                boolean r9 = r1.checkTerminated(r9, r11, r2, r3)
                if (r9 == 0) goto L_0x002e
                return
            L_0x002e:
                if (r10 == 0) goto L_0x0080
                jd2<? super T, ? extends java.lang.Iterable<? extends R>> r6 = r1.mapper     // Catch:{ all -> 0x004a }
                java.lang.Object r6 = r6.apply(r10)     // Catch:{ all -> 0x004a }
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x004a }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x004a }
                boolean r9 = r6.hasNext()     // Catch:{ all -> 0x004a }
                if (r9 != 0) goto L_0x0047
                r1.consumedOne(r0)
                r6 = r7
                goto L_0x001a
            L_0x0047:
                r1.current = r6
                goto L_0x0080
            L_0x004a:
                r0 = move-exception
                p000.ou1.m49570a(r0)
                pc6 r3 = r1.upstream
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                p018io.reactivex.internal.util.ExceptionHelper.m45874a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = p018io.reactivex.internal.util.ExceptionHelper.m45875b(r0)
                r2.onError(r0)
                return
            L_0x0062:
                r0 = move-exception
                r4 = r0
                p000.ou1.m49570a(r4)
                pc6 r0 = r1.upstream
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                p018io.reactivex.internal.util.ExceptionHelper.m45874a(r0, r4)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = p018io.reactivex.internal.util.ExceptionHelper.m45875b(r0)
                r1.current = r7
                r3.clear()
                r2.onError(r0)
                return
            L_0x0080:
                if (r6 == 0) goto L_0x0124
                java.util.concurrent.atomic.AtomicLong r9 = r1.requested
                long r9 = r9.get()
                r11 = 0
                r13 = r11
            L_0x008b:
                int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r15 == 0) goto L_0x00f6
                boolean r15 = r1.done
                boolean r15 = r1.checkTerminated(r15, r4, r2, r3)
                if (r15 == 0) goto L_0x0098
                return
            L_0x0098:
                java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x00dc }
                java.lang.String r5 = "The iterator returned a null value"
                java.lang.Object r5 = p000.af4.m31828d(r15, r5)     // Catch:{ all -> 0x00dc }
                r2.onNext(r5)
                boolean r5 = r1.done
                boolean r5 = r1.checkTerminated(r5, r4, r2, r3)
                if (r5 == 0) goto L_0x00ae
                return
            L_0x00ae:
                r16 = 1
                long r13 = r13 + r16
                boolean r5 = r6.hasNext()     // Catch:{ all -> 0x00c1 }
                if (r5 != 0) goto L_0x00bf
                r1.consumedOne(r0)
                r1.current = r7
                r6 = r7
                goto L_0x00f6
            L_0x00bf:
                r5 = 1
                goto L_0x008b
            L_0x00c1:
                r0 = move-exception
                r3 = r0
                p000.ou1.m49570a(r3)
                r1.current = r7
                pc6 r0 = r1.upstream
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                p018io.reactivex.internal.util.ExceptionHelper.m45874a(r0, r3)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = p018io.reactivex.internal.util.ExceptionHelper.m45875b(r0)
                r2.onError(r0)
                return
            L_0x00dc:
                r0 = move-exception
                p000.ou1.m49570a(r0)
                r1.current = r7
                pc6 r3 = r1.upstream
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                p018io.reactivex.internal.util.ExceptionHelper.m45874a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = p018io.reactivex.internal.util.ExceptionHelper.m45875b(r0)
                r2.onError(r0)
                return
            L_0x00f6:
                int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r5 != 0) goto L_0x010e
                boolean r5 = r1.done
                boolean r15 = r3.isEmpty()
                if (r15 == 0) goto L_0x0106
                if (r6 != 0) goto L_0x0106
                r15 = 1
                goto L_0x0107
            L_0x0106:
                r15 = r4
            L_0x0107:
                boolean r5 = r1.checkTerminated(r5, r15, r2, r3)
                if (r5 == 0) goto L_0x010e
                return
            L_0x010e:
                int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r9 = -r13
                r5.addAndGet(r9)
            L_0x0121:
                if (r6 != 0) goto L_0x0124
                goto L_0x012c
            L_0x0124:
                int r5 = -r8
                int r8 = r1.addAndGet(r5)
                if (r8 != 0) goto L_0x012c
                return
            L_0x012c:
                r5 = 1
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.drain():void");
        }

        public boolean isEmpty() {
            if (this.current != null || !this.queue.isEmpty()) {
                return false;
            }
            return true;
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public void onError(Throwable th) {
            if (this.done || !ExceptionHelper.m45874a(this.error, th)) {
                ti5.m52312m(th);
                return;
            }
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode != 0 || this.queue.offer(t)) {
                    drain();
                } else {
                    onError(new MissingBackpressureException("Queue is full?!"));
                }
            }
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.validate(this.upstream, pc6)) {
                this.upstream = pc6;
                if (pc6 instanceof r05) {
                    r05 r05 = (r05) pc6;
                    int requestFusion = r05.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = r05;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
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

        public R poll() throws Exception {
            Iterator<? extends R> it = this.current;
            while (true) {
                if (it == null) {
                    T poll = this.queue.poll();
                    if (poll != null) {
                        it = ((Iterable) this.mapper.apply(poll)).iterator();
                        if (it.hasNext()) {
                            this.current = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R d = af4.m31828d(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return d;
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32276a(this.requested, j);
                drain();
            }
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0 || this.fusionMode != 1) {
                return 0;
            }
            return 1;
        }
    }

    public FlowableFlattenIterable(g52<T> g52, jd2<? super T, ? extends Iterable<? extends R>> jd2, int i) {
        super(g52);
        this.f30024e = jd2;
        this.f30025g = i;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super R> nc6) {
        g52<T> g52 = this.f28406d;
        if (g52 instanceof Callable) {
            try {
                Object call = ((Callable) g52).call();
                if (call == null) {
                    EmptySubscription.complete(nc6);
                    return;
                }
                try {
                    FlowableFromIterable.m45847R(nc6, ((Iterable) this.f30024e.apply(call)).iterator());
                } catch (Throwable th) {
                    ou1.m49570a(th);
                    EmptySubscription.error(th, nc6);
                }
            } catch (Throwable th2) {
                ou1.m49570a(th2);
                EmptySubscription.error(th2, nc6);
            }
        } else {
            g52.mo42759J(new FlattenIterableSubscriber(nc6, this.f30024e, this.f30025g));
        }
    }
}
