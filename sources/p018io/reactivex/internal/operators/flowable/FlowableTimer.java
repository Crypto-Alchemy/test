package p018io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.disposables.DisposableHelper;
import p018io.reactivex.internal.disposables.EmptyDisposable;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTimer */
public final class FlowableTimer extends g52<Long> {

    /* renamed from: d */
    public final nm5 f30038d;

    /* renamed from: e */
    public final long f30039e;

    /* renamed from: g */
    public final TimeUnit f30040g;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTimer$TimerSubscriber */
    public static final class TimerSubscriber extends AtomicReference<th1> implements pc6, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final nc6<? super Long> downstream;
        public volatile boolean requested;

        public TimerSubscriber(nc6<? super Long> nc6) {
            this.downstream = nc6;
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.requested = true;
            }
        }

        public void run() {
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (this.requested) {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
                return;
            }
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }

        public void setResource(th1 th1) {
            DisposableHelper.trySet(this, th1);
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, nm5 nm5) {
        this.f30039e = j;
        this.f30040g = timeUnit;
        this.f30038d = nm5;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super Long> nc6) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(nc6);
        nc6.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.f30038d.mo42928c(timerSubscriber, this.f30039e, this.f30040g));
    }
}
