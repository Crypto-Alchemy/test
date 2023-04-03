package p000;

import java.util.concurrent.Callable;
import p018io.reactivex.internal.subscriptions.EmptySubscription;

/* renamed from: n52 */
/* compiled from: FlowableError */
public final class n52<T> extends g52<T> {

    /* renamed from: d */
    public final Callable<? extends Throwable> f31970d;

    public n52(Callable<? extends Throwable> callable) {
        this.f31970d = callable;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        try {
            th = (Throwable) af4.m31828d(this.f31970d.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            ou1.m49570a(th);
        }
        EmptySubscription.error(th, nc6);
    }
}
