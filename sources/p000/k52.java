package p000;

import p018io.reactivex.internal.subscriptions.EmptySubscription;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: k52 */
/* compiled from: FlowableDoOnLifecycle */
public final class k52<T> extends C5753e6<T, T> {

    /* renamed from: e */
    public final wq0<? super pc6> f30708e;

    /* renamed from: g */
    public final el3 f30709g;

    /* renamed from: k */
    public final C3803a9 f30710k;

    /* renamed from: k52$a */
    /* compiled from: FlowableDoOnLifecycle */
    public static final class C6135a<T> implements y52<T>, pc6 {

        /* renamed from: a */
        public final nc6<? super T> f30711a;

        /* renamed from: d */
        public final wq0<? super pc6> f30712d;

        /* renamed from: e */
        public final el3 f30713e;

        /* renamed from: g */
        public final C3803a9 f30714g;

        /* renamed from: k */
        public pc6 f30715k;

        public C6135a(nc6<? super T> nc6, wq0<? super pc6> wq0, el3 el3, C3803a9 a9Var) {
            this.f30711a = nc6;
            this.f30712d = wq0;
            this.f30714g = a9Var;
            this.f30713e = el3;
        }

        public void cancel() {
            try {
                this.f30714g.run();
            } catch (Throwable th) {
                ou1.m49570a(th);
                ti5.m52312m(th);
            }
            this.f30715k.cancel();
        }

        public void onComplete() {
            if (this.f30715k != SubscriptionHelper.CANCELLED) {
                this.f30711a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f30715k != SubscriptionHelper.CANCELLED) {
                this.f30711a.onError(th);
            } else {
                ti5.m52312m(th);
            }
        }

        public void onNext(T t) {
            this.f30711a.onNext(t);
        }

        public void onSubscribe(pc6 pc6) {
            try {
                this.f30712d.accept(pc6);
                if (SubscriptionHelper.validate(this.f30715k, pc6)) {
                    this.f30715k = pc6;
                    this.f30711a.onSubscribe(this);
                }
            } catch (Throwable th) {
                ou1.m49570a(th);
                pc6.cancel();
                this.f30715k = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.f30711a);
            }
        }

        public void request(long j) {
            try {
                this.f30713e.accept(j);
            } catch (Throwable th) {
                ou1.m49570a(th);
                ti5.m52312m(th);
            }
            this.f30715k.request(j);
        }
    }

    public k52(g52<T> g52, wq0<? super pc6> wq0, el3 el3, C3803a9 a9Var) {
        super(g52);
        this.f30708e = wq0;
        this.f30709g = el3;
        this.f30710k = a9Var;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        this.f28406d.mo42759J(new C6135a(nc6, this.f30708e, this.f30709g, this.f30710k));
    }
}
