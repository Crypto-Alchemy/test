package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: g68 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class g68<T> implements o68<T> {

    /* renamed from: a */
    public final CountDownLatch f29097a = new CountDownLatch(1);

    public /* synthetic */ g68(z58 z58) {
    }

    /* renamed from: a */
    public final void mo42787a(Exception exc) {
        this.f29097a.countDown();
    }

    /* renamed from: b */
    public final void mo42788b() throws InterruptedException {
        this.f29097a.await();
    }

    /* renamed from: c */
    public final void mo28978c() {
        this.f29097a.countDown();
    }

    /* renamed from: d */
    public final boolean mo42789d(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f29097a.await(j, timeUnit);
    }

    public final void onSuccess(T t) {
        this.f29097a.countDown();
    }
}
