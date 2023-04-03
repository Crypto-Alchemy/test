package p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: q30 */
/* compiled from: BoltsExecutors */
public final class q30 {

    /* renamed from: d */
    public static final q30 f16751d = new q30();

    /* renamed from: a */
    public final ExecutorService f16752a;

    /* renamed from: b */
    public final ScheduledExecutorService f16753b;

    /* renamed from: c */
    public final Executor f16754c;

    /* renamed from: q30$b */
    /* compiled from: BoltsExecutors */
    public static class C3110b implements Executor {

        /* renamed from: a */
        public ThreadLocal<Integer> f16755a;

        public C3110b() {
            this.f16755a = new ThreadLocal<>();
        }

        /* renamed from: a */
        public final int mo24904a() {
            Integer num = this.f16755a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f16755a.remove();
            } else {
                this.f16755a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        public final int mo24905b() {
            Integer num = this.f16755a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f16755a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (mo24905b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    mo24904a();
                    throw th;
                }
            } else {
                q30.m25352a().execute(runnable);
            }
            mo24904a();
        }
    }

    public q30() {
        ExecutorService executorService;
        if (!m25354c()) {
            executorService = Executors.newCachedThreadPool();
        } else {
            executorService = C2543ii.m19633b();
        }
        this.f16752a = executorService;
        this.f16753b = Executors.newSingleThreadScheduledExecutor();
        this.f16754c = new C3110b();
    }

    /* renamed from: a */
    public static ExecutorService m25352a() {
        return f16751d.f16752a;
    }

    /* renamed from: b */
    public static Executor m25353b() {
        return f16751d.f16754c;
    }

    /* renamed from: c */
    public static boolean m25354c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
