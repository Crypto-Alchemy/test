package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: gp6 */
/* compiled from: ThreadHandoffProducerQueueImpl */
public class gp6 implements fp6 {

    /* renamed from: a */
    public boolean f12537a = false;

    /* renamed from: b */
    public final Deque<Runnable> f12538b;

    /* renamed from: c */
    public final Executor f12539c;

    public gp6(Executor executor) {
        this.f12539c = (Executor) au4.m10792g(executor);
        this.f12538b = new ArrayDeque();
    }

    /* renamed from: a */
    public synchronized void mo20038a(Runnable runnable) {
        this.f12538b.remove(runnable);
    }

    /* renamed from: b */
    public synchronized void mo20039b(Runnable runnable) {
        if (this.f12537a) {
            this.f12538b.add(runnable);
        } else {
            this.f12539c.execute(runnable);
        }
    }
}
