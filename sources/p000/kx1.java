package p000;

import java.util.concurrent.Executor;

/* renamed from: kx1 */
/* compiled from: ExperimentalThreadHandoffProducerQueueImpl */
public class kx1 implements fp6 {

    /* renamed from: a */
    public final Executor f14351a;

    public kx1(Executor executor) {
        this.f14351a = (Executor) au4.m10792g(executor);
    }

    /* renamed from: a */
    public void mo20038a(Runnable runnable) {
    }

    /* renamed from: b */
    public void mo20039b(Runnable runnable) {
        this.f14351a.execute(runnable);
    }
}
