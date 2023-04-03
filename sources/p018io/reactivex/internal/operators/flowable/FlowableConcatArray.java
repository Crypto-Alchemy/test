package p018io.reactivex.internal.operators.flowable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p018io.reactivex.exceptions.CompositeException;
import p018io.reactivex.internal.subscriptions.SubscriptionArbiter;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatArray */
public final class FlowableConcatArray<T> extends g52<T> {

    /* renamed from: d */
    public final vy4<? extends T>[] f30008d;

    /* renamed from: e */
    public final boolean f30009e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatArray$ConcatArraySubscriber */
    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements y52<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        public final boolean delayError;
        public final nc6<? super T> downstream;
        public List<Throwable> errors;
        public int index;
        public long produced;
        public final vy4<? extends T>[] sources;
        public final AtomicInteger wip = new AtomicInteger();

        public ConcatArraySubscriber(vy4<? extends T>[] vy4Arr, boolean z, nc6<? super T> nc6) {
            this.downstream = nc6;
            this.sources = vy4Arr;
            this.delayError = z;
        }

        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                vy4<? extends T>[] vy4Arr = this.sources;
                int length = vy4Arr.length;
                int i = this.index;
                while (i != length) {
                    vy4<? extends T> vy4 = vy4Arr[i];
                    if (vy4 == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0;
                            produced(j);
                        }
                        vy4.mo40232a(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 == null) {
                    this.downstream.onComplete();
                } else if (list2.size() == 1) {
                    this.downstream.onError(list2.get(0));
                } else {
                    this.downstream.onError(new CompositeException((Iterable<? extends Throwable>) list2));
                }
            }
        }

        public void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        public void onSubscribe(pc6 pc6) {
            setSubscription(pc6);
        }
    }

    public FlowableConcatArray(vy4<? extends T>[] vy4Arr, boolean z) {
        this.f30008d = vy4Arr;
        this.f30009e = z;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.f30008d, this.f30009e, nc6);
        nc6.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
