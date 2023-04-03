package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.nm5;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn */
public final class FlowableSubscribeOn<T> extends C5753e6<T, T> {

    /* renamed from: e */
    public final nm5 f30034e;

    /* renamed from: g */
    public final boolean f30035g;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber */
    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements y52<T>, pc6, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        public final nc6<? super T> downstream;
        public final boolean nonScheduledRequests;
        public final AtomicLong requested = new AtomicLong();
        public vy4<T> source;
        public final AtomicReference<pc6> upstream = new AtomicReference<>();
        public final nm5.C6288b worker;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$a */
        public static final class C5984a implements Runnable {

            /* renamed from: a */
            public final pc6 f30036a;

            /* renamed from: d */
            public final long f30037d;

            public C5984a(pc6 pc6, long j) {
                this.f30036a = pc6;
                this.f30037d = j;
            }

            public void run() {
                this.f30036a.request(this.f30037d);
            }
        }

        public SubscribeOnSubscriber(nc6<? super T> nc6, nm5.C6288b bVar, vy4<T> vy4, boolean z) {
            this.downstream = nc6;
            this.worker = bVar;
            this.source = vy4;
            this.nonScheduledRequests = !z;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onSubscribe(pc6 pc6) {
            if (SubscriptionHelper.setOnce(this.upstream, pc6)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    requestUpstream(andSet, pc6);
                }
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                pc6 pc6 = this.upstream.get();
                if (pc6 != null) {
                    requestUpstream(j, pc6);
                    return;
                }
                C3866ax.m32276a(this.requested, j);
                pc6 pc62 = this.upstream.get();
                if (pc62 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        requestUpstream(andSet, pc62);
                    }
                }
            }
        }

        public void requestUpstream(long j, pc6 pc6) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                pc6.request(j);
            } else {
                this.worker.mo42930b(new C5984a(pc6, j));
            }
        }

        public void run() {
            lazySet(Thread.currentThread());
            vy4<T> vy4 = this.source;
            this.source = null;
            vy4.mo40232a(this);
        }
    }

    public FlowableSubscribeOn(g52<T> g52, nm5 nm5, boolean z) {
        super(g52);
        this.f30034e = nm5;
        this.f30035g = z;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        nm5.C6288b a = this.f30034e.mo42927a();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(nc6, a, this.f28406d, this.f30035g);
        nc6.onSubscribe(subscribeOnSubscriber);
        a.mo42930b(subscribeOnSubscriber);
    }
}
