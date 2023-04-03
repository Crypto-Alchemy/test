package p000;

import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: bi1 */
/* compiled from: DisposableSubscriber */
public abstract class bi1<T> implements y52<T>, th1 {

    /* renamed from: a */
    public final AtomicReference<pc6> f21323a = new AtomicReference<>();

    /* renamed from: a */
    public void mo28971a() {
        this.f21323a.get().request(Long.MAX_VALUE);
    }

    /* renamed from: c */
    public final void mo29590c(long j) {
        this.f21323a.get().request(j);
    }

    public final void dispose() {
        SubscriptionHelper.cancel(this.f21323a);
    }

    public final void onSubscribe(pc6 pc6) {
        if (vp1.m53448c(this.f21323a, pc6, getClass())) {
            mo28971a();
        }
    }
}
