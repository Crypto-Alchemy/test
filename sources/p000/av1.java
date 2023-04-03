package p000;

import java.util.concurrent.Executor;

/* renamed from: av1 */
/* compiled from: Executors */
public final class av1 {

    /* renamed from: a */
    public static final Executor f7763a = new C1581a();

    /* renamed from: b */
    public static final Executor f7764b = new C1582b();

    /* renamed from: av1$a */
    /* compiled from: Executors */
    public class C1581a implements Executor {
        public void execute(Runnable runnable) {
            p67.m24693u(runnable);
        }
    }

    /* renamed from: av1$b */
    /* compiled from: Executors */
    public class C1582b implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m10809a() {
        return f7764b;
    }

    /* renamed from: b */
    public static Executor m10810b() {
        return f7763a;
    }
}
