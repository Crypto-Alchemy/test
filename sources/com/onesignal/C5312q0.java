package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.onesignal.q0 */
/* compiled from: OSSyncService */
public class C5312q0 extends C5322s {

    /* renamed from: e */
    public static final Object f26508e = new Object();

    /* renamed from: f */
    public static C5312q0 f26509f;

    /* renamed from: d */
    public Long f26510d = 0L;

    /* renamed from: com.onesignal.q0$a */
    /* compiled from: OSSyncService */
    public static class C5313a extends C5315c {

        /* renamed from: a */
        public WeakReference<Service> f26511a;

        public C5313a(Service service) {
            this.f26511a = new WeakReference<>(service);
        }

        /* renamed from: a */
        public void mo39084a() {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.f26511a.get() != null) {
                this.f26511a.get().stopSelf();
            }
        }
    }

    /* renamed from: com.onesignal.q0$b */
    /* compiled from: OSSyncService */
    public static class C5314b extends C5315c {

        /* renamed from: a */
        public WeakReference<JobService> f26512a;

        /* renamed from: d */
        public JobParameters f26513d;

        public C5314b(JobService jobService, JobParameters jobParameters) {
            this.f26512a = new WeakReference<>(jobService);
            this.f26513d = jobParameters;
        }

        /* renamed from: a */
        public void mo39084a() {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + C5312q0.m41240q().f26521a);
            boolean z = C5312q0.m41240q().f26521a;
            C5312q0.m41240q().f26521a = false;
            if (this.f26512a.get() != null) {
                this.f26512a.get().jobFinished(this.f26513d, z);
            }
        }
    }

    /* renamed from: com.onesignal.q0$c */
    /* compiled from: OSSyncService */
    public static abstract class C5315c implements Runnable {

        /* renamed from: com.onesignal.q0$c$a */
        /* compiled from: OSSyncService */
        public class C5316a implements LocationController.C5103b {

            /* renamed from: a */
            public final /* synthetic */ BlockingQueue f26514a;

            public C5316a(BlockingQueue blockingQueue) {
                this.f26514a = blockingQueue;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.onesignal.LocationController$d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.onesignal.LocationController$d} */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo38437a(com.onesignal.LocationController.C5105d r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L_0x0003
                    goto L_0x0008
                L_0x0003:
                    java.lang.Object r2 = new java.lang.Object
                    r2.<init>()
                L_0x0008:
                    java.util.concurrent.BlockingQueue r0 = r1.f26514a
                    r0.offer(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5312q0.C5315c.C5316a.mo38437a(com.onesignal.LocationController$d):void");
            }

            public LocationController.PermissionType getType() {
                return LocationController.PermissionType.SYNC_SERVICE;
            }
        }

        /* renamed from: a */
        public abstract void mo39084a();

        public final void run() {
            synchronized (C5322s.f26520c) {
                Long unused = C5312q0.m41240q().f26510d = 0L;
            }
            if (OneSignal.m40452z0() == null) {
                mo39084a();
                return;
            }
            OneSignal.f26034g = OneSignal.m40419o0();
            OneSignalStateSynchronizer.m40486k();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                LocationController.m40098g(OneSignal.f26030e, false, false, new C5316a(arrayBlockingQueue));
                Object take = arrayBlockingQueue.take();
                if (take instanceof LocationController.C5105d) {
                    OneSignalStateSynchronizer.m40498w((LocationController.C5105d) take);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            OneSignalStateSynchronizer.m40496u(true);
            OneSignal.m40380b0().mo38393d();
            mo39084a();
        }
    }

    /* renamed from: q */
    public static C5312q0 m41240q() {
        if (f26509f == null) {
            synchronized (f26508e) {
                if (f26509f == null) {
                    f26509f = new C5312q0();
                }
            }
        }
        return f26509f;
    }

    /* renamed from: c */
    public Class mo39076c() {
        return SyncJobService.class;
    }

    /* renamed from: d */
    public Class mo39077d() {
        return SyncService.class;
    }

    /* renamed from: e */
    public int mo39078e() {
        return 2071862118;
    }

    /* renamed from: f */
    public String mo39079f() {
        return "OS_SYNCSRV_BG_SYNC";
    }

    /* renamed from: p */
    public void mo39080p(Context context) {
        synchronized (C5322s.f26520c) {
            this.f26510d = 0L;
            if (!LocationController.m40104m(context)) {
                mo39089a(context);
            }
        }
    }

    /* renamed from: r */
    public void mo39081r(Context context, long j) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        OneSignal.m40376a(log_level, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j);
        mo39083t(context, j);
    }

    /* renamed from: s */
    public void mo39082s(Context context) {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        mo39083t(context, 30000);
    }

    /* renamed from: t */
    public void mo39083t(Context context, long j) {
        synchronized (C5322s.f26520c) {
            if (this.f26510d.longValue() == 0 || OneSignal.m40443w0().mo46064a() + j <= this.f26510d.longValue()) {
                if (j < 5000) {
                    j = 5000;
                }
                mo39093i(context, j);
                this.f26510d = Long.valueOf(OneSignal.m40443w0().mo46064a() + j);
                return;
            }
            OneSignal.m40376a(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f26510d);
        }
    }
}
