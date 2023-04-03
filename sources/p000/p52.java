package p000;

import java.util.concurrent.Callable;
import p018io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* renamed from: p52 */
/* compiled from: FlowableFromCallable */
public final class p52<T> extends g52<T> implements Callable<T> {

    /* renamed from: d */
    public final Callable<? extends T> f32580d;

    public p52(Callable<? extends T> callable) {
        this.f32580d = callable;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(nc6);
        nc6.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.complete(af4.m31828d(this.f32580d.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            ou1.m49570a(th);
            if (deferredScalarSubscription.isCancelled()) {
                ti5.m52312m(th);
            } else {
                nc6.onError(th);
            }
        }
    }

    public T call() throws Exception {
        return af4.m31828d(this.f32580d.call(), "The callable returned a null value");
    }
}
