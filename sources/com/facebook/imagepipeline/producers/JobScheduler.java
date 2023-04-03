package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JobScheduler {

    /* renamed from: a */
    public final Executor f9652a;

    /* renamed from: b */
    public final C1952d f9653b;

    /* renamed from: c */
    public final Runnable f9654c = new C1949a();

    /* renamed from: d */
    public final Runnable f9655d = new C1950b();

    /* renamed from: e */
    public final int f9656e;

    /* renamed from: f */
    public gp1 f9657f = null;

    /* renamed from: g */
    public int f9658g = 0;

    /* renamed from: h */
    public JobState f9659h = JobState.IDLE;

    /* renamed from: i */
    public long f9660i = 0;

    /* renamed from: j */
    public long f9661j = 0;

    public enum JobState {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$a */
    public class C1949a implements Runnable {
        public C1949a() {
        }

        public void run() {
            JobScheduler.this.mo13391d();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$b */
    public class C1950b implements Runnable {
        public C1950b() {
        }

        public void run() {
            JobScheduler.this.mo13396j();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$c */
    public static /* synthetic */ class C1951c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9665a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.imagepipeline.producers.JobScheduler$JobState[] r0 = com.facebook.imagepipeline.producers.JobScheduler.JobState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9665a = r0
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9665a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.QUEUED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9665a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.RUNNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9665a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.RUNNING_AND_PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.JobScheduler.C1951c.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$d */
    public interface C1952d {
        /* renamed from: a */
        void mo13400a(gp1 gp1, int i);
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$e */
    public static class C1953e {

        /* renamed from: a */
        public static ScheduledExecutorService f9666a;

        /* renamed from: a */
        public static ScheduledExecutorService m13560a() {
            if (f9666a == null) {
                f9666a = Executors.newSingleThreadScheduledExecutor();
            }
            return f9666a;
        }
    }

    public JobScheduler(Executor executor, C1952d dVar, int i) {
        this.f9652a = executor;
        this.f9653b = dVar;
        this.f9656e = i;
    }

    /* renamed from: i */
    public static boolean m13550i(gp1 gp1, int i) {
        if (C3766zx.m31566e(i) || C3766zx.m31570n(i, 4) || gp1.m18283C(gp1)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo13390c() {
        gp1 gp1;
        synchronized (this) {
            gp1 = this.f9657f;
            this.f9657f = null;
            this.f9658g = 0;
        }
        gp1.m18285c(gp1);
    }

    /* renamed from: d */
    public final void mo13391d() {
        gp1 gp1;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            gp1 = this.f9657f;
            i = this.f9658g;
            this.f9657f = null;
            this.f9658g = 0;
            this.f9659h = JobState.RUNNING;
            this.f9661j = uptimeMillis;
        }
        try {
            if (m13550i(gp1, i)) {
                this.f9653b.mo13400a(gp1, i);
            }
        } finally {
            gp1.m18285c(gp1);
            mo13394g();
        }
    }

    /* renamed from: e */
    public final void mo13392e(long j) {
        Runnable a = kc2.m20626a(this.f9655d, "JobScheduler_enqueueJob");
        if (j > 0) {
            C1953e.m13560a().schedule(a, j, TimeUnit.MILLISECONDS);
        } else {
            a.run();
        }
    }

    /* renamed from: f */
    public synchronized long mo13393f() {
        return this.f9661j - this.f9660i;
    }

    /* renamed from: g */
    public final void mo13394g() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f9659h == JobState.RUNNING_AND_PENDING) {
                j = Math.max(this.f9661j + ((long) this.f9656e), uptimeMillis);
                z = true;
                this.f9660i = uptimeMillis;
                this.f9659h = JobState.QUEUED;
            } else {
                this.f9659h = JobState.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            mo13392e(j - uptimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        mo13392e(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        return true;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13395h() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            gp1 r2 = r7.f9657f     // Catch:{ all -> 0x0043 }
            int r3 = r7.f9658g     // Catch:{ all -> 0x0043 }
            boolean r2 = m13550i(r2, r3)     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0012:
            int[] r2 = com.facebook.imagepipeline.producers.JobScheduler.C1951c.f9665a     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.JobScheduler$JobState r4 = r7.f9659h     // Catch:{ all -> 0x0043 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0043 }
            r2 = r2[r4]     // Catch:{ all -> 0x0043 }
            r4 = 1
            if (r2 == r4) goto L_0x002a
            r5 = 3
            if (r2 == r5) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            com.facebook.imagepipeline.producers.JobScheduler$JobState r2 = com.facebook.imagepipeline.producers.JobScheduler.JobState.RUNNING_AND_PENDING     // Catch:{ all -> 0x0043 }
            r7.f9659h = r2     // Catch:{ all -> 0x0043 }
        L_0x0027:
            r5 = 0
            goto L_0x003b
        L_0x002a:
            long r2 = r7.f9661j     // Catch:{ all -> 0x0043 }
            int r5 = r7.f9656e     // Catch:{ all -> 0x0043 }
            long r5 = (long) r5     // Catch:{ all -> 0x0043 }
            long r2 = r2 + r5
            long r5 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0043 }
            r7.f9660i = r0     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.JobScheduler$JobState r2 = com.facebook.imagepipeline.producers.JobScheduler.JobState.QUEUED     // Catch:{ all -> 0x0043 }
            r7.f9659h = r2     // Catch:{ all -> 0x0043 }
            r3 = r4
        L_0x003b:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0042
            long r5 = r5 - r0
            r7.mo13392e(r5)
        L_0x0042:
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.JobScheduler.mo13395h():boolean");
    }

    /* renamed from: j */
    public final void mo13396j() {
        this.f9652a.execute(kc2.m20626a(this.f9654c, "JobScheduler_submitJob"));
    }

    /* renamed from: k */
    public boolean mo13397k(gp1 gp1, int i) {
        gp1 gp12;
        if (!m13550i(gp1, i)) {
            return false;
        }
        synchronized (this) {
            gp12 = this.f9657f;
            this.f9657f = gp1.m18284b(gp1);
            this.f9658g = i;
        }
        gp1.m18285c(gp12);
        return true;
    }
}
