package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.nm5;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.disposables.DisposableHelper;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounceTimed */
public final class FlowableDebounceTimed<T> extends C5753e6<T, T> {

    /* renamed from: e */
    public final long f30013e;

    /* renamed from: g */
    public final TimeUnit f30014g;

    /* renamed from: k */
    public final nm5 f30015k;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter */
    public static final class DebounceEmitter<T> extends AtomicReference<th1> implements Runnable, th1 {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once = new AtomicBoolean();
        public final DebounceTimedSubscriber<T> parent;
        public final T value;

        public DebounceEmitter(T t, long j, DebounceTimedSubscriber<T> debounceTimedSubscriber) {
            this.value = t;
            this.idx = j;
            this.parent = debounceTimedSubscriber;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void emit() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.emit(this.idx, this.value, this);
            }
        }

        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public void run() {
            emit();
        }

        public void setResource(th1 th1) {
            DisposableHelper.replace(this, th1);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber */
    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements y52<T>, pc6 {
        private static final long serialVersionUID = -9102637559663639004L;
        public boolean done;
        public final nc6<? super T> downstream;
        public volatile long index;
        public final long timeout;
        public th1 timer;
        public final TimeUnit unit;
        public pc6 upstream;
        public final nm5.C6288b worker;

        public DebounceTimedSubscriber(nc6<? super T> nc6, long j, TimeUnit timeUnit, nm5.C6288b bVar) {
            this.downstream = nc6;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = bVar;
        }

        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        public void emit(long j, T t, DebounceEmitter<T> debounceEmitter) {
            if (j != this.index) {
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t);
                C3866ax.m32279d(this, 1);
                debounceEmitter.dispose();
                return;
            }
            cancel();
            this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                th1 th1 = this.timer;
                if (th1 != null) {
                    th1.dispose();
                }
                DebounceEmitter debounceEmitter = (DebounceEmitter) th1;
                if (debounceEmitter != null) {
                    debounceEmitter.emit();
                }
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                ti5.m52312m(th);
                return;
            }
            this.done = true;
            th1 th1 = this.timer;
            if (th1 != null) {
                th1.dispose();
            }
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public void onNext(T t) {
            if (!this.done) {
                long j = this.index + 1;
                this.index = j;
                th1 th1 = this.timer;
                if (th1 != null) {
                    th1.dispose();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                this.timer = debounceEmitter;
                debounceEmitter.setResource(this.worker.mo42931c(debounceEmitter, this.timeout, this.unit));
            }
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
                C3866ax.m32276a(this, j);
            }
        }
    }

    public FlowableDebounceTimed(g52<T> g52, long j, TimeUnit timeUnit, nm5 nm5) {
        super(g52);
        this.f30013e = j;
        this.f30014g = timeUnit;
        this.f30015k = nm5;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        this.f28406d.mo42759J(new DebounceTimedSubscriber(new uw5(nc6), this.f30013e, this.f30014g, this.f30015k.mo42927a()));
    }
}
