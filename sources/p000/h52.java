package p000;

import java.util.concurrent.Callable;
import p018io.reactivex.internal.subscriptions.EmptySubscription;

/* renamed from: h52 */
/* compiled from: FlowableDefer */
public final class h52<T> extends g52<T> {

    /* renamed from: d */
    public final Callable<? extends vy4<? extends T>> f29453d;

    public h52(Callable<? extends vy4<? extends T>> callable) {
        this.f29453d = callable;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        try {
            ((vy4) af4.m31828d(this.f29453d.call(), "The publisher supplied is null")).mo40232a(nc6);
        } catch (Throwable th) {
            ou1.m49570a(th);
            EmptySubscription.error(th, nc6);
        }
    }
}
