package p018io.reactivex.processors;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.exceptions.MissingBackpressureException;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.processors.PublishProcessor */
public final class PublishProcessor<T> extends v52<T> {

    /* renamed from: g */
    public static final PublishSubscription[] f30083g = new PublishSubscription[0];

    /* renamed from: k */
    public static final PublishSubscription[] f30084k = new PublishSubscription[0];

    /* renamed from: d */
    public final AtomicReference<PublishSubscription<T>[]> f30085d = new AtomicReference<>(f30084k);

    /* renamed from: e */
    public Throwable f30086e;

    /* renamed from: io.reactivex.processors.PublishProcessor$PublishSubscription */
    public static final class PublishSubscription<T> extends AtomicLong implements pc6 {
        private static final long serialVersionUID = 3562861878281475070L;
        public final nc6<? super T> downstream;
        public final PublishProcessor<T> parent;

        public PublishSubscription(nc6<? super T> nc6, PublishProcessor<T> publishProcessor) {
            this.downstream = nc6;
            this.parent = publishProcessor;
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.mo43876U(this);
            }
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if (get() == 0) {
                return true;
            }
            return false;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                ti5.m52312m(th);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.downstream.onNext(t);
                    C3866ax.m32280e(this, 1);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C3866ax.m32277b(this, j);
            }
        }
    }

    /* renamed from: T */
    public static <T> PublishProcessor<T> m45884T() {
        return new PublishProcessor<>();
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        PublishSubscription publishSubscription = new PublishSubscription(nc6, this);
        nc6.onSubscribe(publishSubscription);
        if (!mo43875S(publishSubscription)) {
            Throwable th = this.f30086e;
            if (th != null) {
                nc6.onError(th);
            } else {
                nc6.onComplete();
            }
        } else if (publishSubscription.isCancelled()) {
            mo43876U(publishSubscription);
        }
    }

    /* renamed from: S */
    public boolean mo43875S(PublishSubscription<T> publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.f30085d.get();
            if (publishSubscriptionArr == f30083g) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[(length + 1)];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!ao0.m10672a(this.f30085d, publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    /* renamed from: U */
    public void mo43876U(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = (PublishSubscription[]) this.f30085d.get();
            if (publishSubscriptionArr != f30083g && publishSubscriptionArr != f30084k) {
                int length = publishSubscriptionArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (publishSubscriptionArr[i2] == publishSubscription) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishSubscriptionArr2 = f30084k;
                    } else {
                        PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[(length - 1)];
                        System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i);
                        System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr3, i, (length - i) - 1);
                        publishSubscriptionArr2 = publishSubscriptionArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!ao0.m10672a(this.f30085d, publishSubscriptionArr, publishSubscriptionArr2));
    }

    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.f30085d.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f30083g;
        if (publishSubscriptionArr != publishSubscriptionArr2) {
            for (PublishSubscription onComplete : (PublishSubscription[]) this.f30085d.getAndSet(publishSubscriptionArr2)) {
                onComplete.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        af4.m31828d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubscription<T>[] publishSubscriptionArr = this.f30085d.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f30083g;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            ti5.m52312m(th);
            return;
        }
        this.f30086e = th;
        for (PublishSubscription onError : (PublishSubscription[]) this.f30085d.getAndSet(publishSubscriptionArr2)) {
            onError.onError(th);
        }
    }

    public void onNext(T t) {
        af4.m31828d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription onNext : (PublishSubscription[]) this.f30085d.get()) {
            onNext.onNext(t);
        }
    }

    public void onSubscribe(pc6 pc6) {
        if (this.f30085d.get() == f30083g) {
            pc6.cancel();
        } else {
            pc6.request(Long.MAX_VALUE);
        }
    }
}
