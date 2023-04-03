package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ra0 */
/* compiled from: locks.kt */
public final class ra0 extends y91 {

    /* renamed from: c */
    public final Runnable f44314c;

    /* renamed from: d */
    public final rc2<InterruptedException, r37> f44315d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ra0(Lock lock, Runnable runnable, rc2<? super InterruptedException, r37> rc2) {
        super(lock);
        vx2.m53591g(lock, "lock");
        vx2.m53591g(runnable, "checkCancelled");
        vx2.m53591g(rc2, "interruptedExceptionHandler");
        this.f44314c = runnable;
        this.f44315d = rc2;
    }

    public void lock() {
        while (!mo67048a().tryLock(50, TimeUnit.MILLISECONDS)) {
            try {
                this.f44314c.run();
            } catch (InterruptedException e) {
                this.f44315d.invoke(e);
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ra0(Runnable runnable, rc2<? super InterruptedException, r37> rc2) {
        this(new ReentrantLock(), runnable, rc2);
        vx2.m53591g(runnable, "checkCancelled");
        vx2.m53591g(rc2, "interruptedExceptionHandler");
    }
}
