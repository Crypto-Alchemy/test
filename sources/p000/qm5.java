package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p018io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: qm5 */
/* compiled from: SchedulerPoolFactory */
public final class qm5 {

    /* renamed from: a */
    public static final boolean f33173a;

    /* renamed from: b */
    public static final int f33174b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f33175c = new AtomicReference<>();

    /* renamed from: d */
    public static final Map<ScheduledThreadPoolExecutor, Object> f33176d = new ConcurrentHashMap();

    /* renamed from: qm5$a */
    /* compiled from: SchedulerPoolFactory */
    public static final class C6416a {

        /* renamed from: a */
        public boolean f33177a;

        /* renamed from: b */
        public int f33178b;

        /* renamed from: a */
        public void mo47130a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f33177a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f33177a = true;
            }
            if (!this.f33177a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f33178b = 1;
                return;
            }
            try {
                this.f33178b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f33178b = 1;
            }
        }
    }

    /* renamed from: qm5$b */
    /* compiled from: SchedulerPoolFactory */
    public static final class C6417b implements Runnable {
        public void run() {
            Iterator it = new ArrayList(qm5.f33176d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    qm5.f33176d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C6416a aVar = new C6416a();
        aVar.mo47130a(properties);
        f33173a = aVar.f33177a;
        f33174b = aVar.f33178b;
        m50640b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m50639a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m50641c(f33173a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m50640b() {
        m50642d(f33173a);
    }

    /* renamed from: c */
    public static void m50641c(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f33176d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    public static void m50642d(boolean z) {
        if (z) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f33175c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                    if (ao0.m10672a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                        C6417b bVar = new C6417b();
                        int i = f33174b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }
}
