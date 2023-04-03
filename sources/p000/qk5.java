package p000;

import java.util.concurrent.Executor;

/* renamed from: qk5 */
/* compiled from: SafeLoggingExecutor */
public class qk5 implements Executor {

    /* renamed from: a */
    public final Executor f33147a;

    /* renamed from: qk5$a */
    /* compiled from: SafeLoggingExecutor */
    public static class C6414a implements Runnable {

        /* renamed from: a */
        public final Runnable f33148a;

        public C6414a(Runnable runnable) {
            this.f33148a = runnable;
        }

        public void run() {
            try {
                this.f33148a.run();
            } catch (Exception e) {
                xk3.m54422c("Executor", "Background execution failure.", e);
            }
        }
    }

    public qk5(Executor executor) {
        this.f33147a = executor;
    }

    public void execute(Runnable runnable) {
        this.f33147a.execute(new C6414a(runnable));
    }
}
