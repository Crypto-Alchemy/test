package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: x */
    public static final Object f3368x = new Object();

    /* renamed from: y */
    public static final HashMap<ComponentName, C0559h> f3369y = new HashMap<>();

    /* renamed from: a */
    public C0552b f3370a;

    /* renamed from: d */
    public C0559h f3371d;

    /* renamed from: e */
    public C0551a f3372e;

    /* renamed from: g */
    public boolean f3373g = false;

    /* renamed from: k */
    public boolean f3374k = false;

    /* renamed from: r */
    public boolean f3375r = false;

    /* renamed from: s */
    public final ArrayList<C0554d> f3376s;

    /* renamed from: androidx.core.app.JobIntentService$a */
    public final class C0551a extends AsyncTask<Void, Void, Void> {
        public C0551a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0555e a = JobIntentService.this.mo5318a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.mo5321e(a.getIntent());
                a.complete();
            }
        }

        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.mo5323g();
        }

        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo5323g();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    public interface C0552b {
        IBinder compatGetBinder();

        C0555e dequeueWork();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    public static final class C0553c extends C0559h {

        /* renamed from: d */
        public final Context f3378d;

        /* renamed from: e */
        public final PowerManager.WakeLock f3379e;

        /* renamed from: f */
        public final PowerManager.WakeLock f3380f;

        /* renamed from: g */
        public boolean f3381g;

        /* renamed from: h */
        public boolean f3382h;

        public C0553c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3378d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3379e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3380f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: b */
        public void mo5336b() {
            synchronized (this) {
                if (this.f3382h) {
                    if (this.f3381g) {
                        this.f3379e.acquire(60000);
                    }
                    this.f3382h = false;
                    this.f3380f.release();
                }
            }
        }

        /* renamed from: c */
        public void mo5337c() {
            synchronized (this) {
                if (!this.f3382h) {
                    this.f3382h = true;
                    this.f3380f.acquire(600000);
                    this.f3379e.release();
                }
            }
        }

        /* renamed from: d */
        public void mo5338d() {
            synchronized (this) {
                this.f3381g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    public final class C0554d implements C0555e {

        /* renamed from: a */
        public final Intent f3383a;

        /* renamed from: b */
        public final int f3384b;

        public C0554d(Intent intent, int i) {
            this.f3383a = intent;
            this.f3384b = i;
        }

        public void complete() {
            JobIntentService.this.stopSelf(this.f3384b);
        }

        public Intent getIntent() {
            return this.f3383a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    public interface C0555e {
        void complete();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    public static final class C0556f extends JobServiceEngine implements C0552b {

        /* renamed from: a */
        public final JobIntentService f3386a;

        /* renamed from: b */
        public final Object f3387b = new Object();

        /* renamed from: c */
        public JobParameters f3388c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        public final class C0557a implements C0555e {

            /* renamed from: a */
            public final JobWorkItem f3389a;

            public C0557a(JobWorkItem jobWorkItem) {
                this.f3389a = jobWorkItem;
            }

            public void complete() {
                synchronized (C0556f.this.f3387b) {
                    JobParameters jobParameters = C0556f.this.f3388c;
                    if (jobParameters != null) {
                        e33.m15655a(jobParameters, this.f3389a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f3389a.getIntent();
            }
        }

        public C0556f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3386a = jobIntentService;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f3386a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.C0556f.C0557a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.C0555e dequeueWork() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f3387b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f3388c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f3386a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.C0556f.dequeueWork():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f3388c = jobParameters;
            this.f3386a.mo5320c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f3386a.mo5319b();
            synchronized (this.f3387b) {
                this.f3388c = null;
            }
            return b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    public static final class C0558g extends C0559h {

        /* renamed from: d */
        public final JobInfo f3391d;

        /* renamed from: e */
        public final JobScheduler f3392e;

        public C0558g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo5343a(i);
            this.f3391d = new JobInfo.Builder(i, this.f3393a).setOverrideDeadline(0).build();
            this.f3392e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    public static abstract class C0559h {

        /* renamed from: a */
        public final ComponentName f3393a;

        /* renamed from: b */
        public boolean f3394b;

        /* renamed from: c */
        public int f3395c;

        public C0559h(ComponentName componentName) {
            this.f3393a = componentName;
        }

        /* renamed from: a */
        public void mo5343a(int i) {
            if (!this.f3394b) {
                this.f3394b = true;
                this.f3395c = i;
            } else if (this.f3395c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f3395c);
            }
        }

        /* renamed from: b */
        public void mo5336b() {
        }

        /* renamed from: c */
        public void mo5337c() {
        }

        /* renamed from: d */
        public void mo5338d() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3376s = null;
        } else {
            this.f3376s = new ArrayList<>();
        }
    }

    /* renamed from: d */
    public static C0559h m4284d(Context context, ComponentName componentName, boolean z, int i) {
        C0559h hVar;
        HashMap<ComponentName, C0559h> hashMap = f3369y;
        C0559h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C0553c(context, componentName);
        } else if (z) {
            hVar = new C0558g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0559h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* renamed from: a */
    public C0555e mo5318a() {
        C0552b bVar = this.f3370a;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.f3376s) {
            if (this.f3376s.size() <= 0) {
                return null;
            }
            C0555e remove = this.f3376s.remove(0);
            return remove;
        }
    }

    /* renamed from: b */
    public boolean mo5319b() {
        C0551a aVar = this.f3372e;
        if (aVar != null) {
            aVar.cancel(this.f3373g);
        }
        this.f3374k = true;
        return mo5322f();
    }

    /* renamed from: c */
    public void mo5320c(boolean z) {
        if (this.f3372e == null) {
            this.f3372e = new C0551a();
            C0559h hVar = this.f3371d;
            if (hVar != null && z) {
                hVar.mo5337c();
            }
            this.f3372e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: e */
    public abstract void mo5321e(Intent intent);

    /* renamed from: f */
    public boolean mo5322f() {
        return true;
    }

    /* renamed from: g */
    public void mo5323g() {
        ArrayList<C0554d> arrayList = this.f3376s;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3372e = null;
                ArrayList<C0554d> arrayList2 = this.f3376s;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo5320c(false);
                } else if (!this.f3375r) {
                    this.f3371d.mo5336b();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C0552b bVar = this.f3370a;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3370a = new C0556f(this);
            this.f3371d = null;
            return;
        }
        this.f3370a = null;
        this.f3371d = m4284d(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0554d> arrayList = this.f3376s;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3375r = true;
                this.f3371d.mo5336b();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f3376s == null) {
            return 2;
        }
        this.f3371d.mo5338d();
        synchronized (this.f3376s) {
            ArrayList<C0554d> arrayList = this.f3376s;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0554d(intent, i2));
            mo5320c(true);
        }
        return 3;
    }
}
