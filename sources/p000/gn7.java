package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: gn7 */
/* compiled from: WorkTimer */
public class gn7 {

    /* renamed from: f */
    public static final String f12504f = qk3.m25728f("WorkTimer");

    /* renamed from: a */
    public final ThreadFactory f12505a;

    /* renamed from: b */
    public final ScheduledExecutorService f12506b;

    /* renamed from: c */
    public final Map<String, C2412c> f12507c = new HashMap();

    /* renamed from: d */
    public final Map<String, C2411b> f12508d = new HashMap();

    /* renamed from: e */
    public final Object f12509e = new Object();

    /* renamed from: gn7$a */
    /* compiled from: WorkTimer */
    public class C2410a implements ThreadFactory {

        /* renamed from: a */
        public int f12510a = 0;

        public C2410a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f12510a);
            this.f12510a = this.f12510a + 1;
            return newThread;
        }
    }

    /* renamed from: gn7$b */
    /* compiled from: WorkTimer */
    public interface C2411b {
        /* renamed from: a */
        void mo10981a(String str);
    }

    /* renamed from: gn7$c */
    /* compiled from: WorkTimer */
    public static class C2412c implements Runnable {

        /* renamed from: a */
        public final gn7 f12512a;

        /* renamed from: d */
        public final String f12513d;

        public C2412c(gn7 gn7, String str) {
            this.f12512a = gn7;
            this.f12513d = str;
        }

        public void run() {
            synchronized (this.f12512a.f12509e) {
                if (this.f12512a.f12507c.remove(this.f12513d) != null) {
                    C2411b remove = this.f12512a.f12508d.remove(this.f12513d);
                    if (remove != null) {
                        remove.mo10981a(this.f12513d);
                    }
                } else {
                    qk3.m25726c().mo25135a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f12513d}), new Throwable[0]);
                }
            }
        }
    }

    public gn7() {
        C2410a aVar = new C2410a();
        this.f12505a = aVar;
        this.f12506b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void mo20710a() {
        if (!this.f12506b.isShutdown()) {
            this.f12506b.shutdownNow();
        }
    }

    /* renamed from: b */
    public void mo20711b(String str, long j, C2411b bVar) {
        synchronized (this.f12509e) {
            qk3.m25726c().mo25135a(f12504f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo20712c(str);
            C2412c cVar = new C2412c(this, str);
            this.f12507c.put(str, cVar);
            this.f12508d.put(str, bVar);
            this.f12506b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void mo20712c(String str) {
        synchronized (this.f12509e) {
            if (this.f12507c.remove(str) != null) {
                qk3.m25726c().mo25135a(f12504f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f12508d.remove(str);
            }
        }
    }
}
