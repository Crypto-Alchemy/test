package com.onesignal;

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

public abstract class JobIntentService extends Service {

    /* renamed from: x */
    public static final Object f25872x = new Object();

    /* renamed from: y */
    public static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> f25873y = new HashMap<>();

    /* renamed from: a */
    public CompatJobEngine f25874a;

    /* renamed from: d */
    public WorkEnqueuer f25875d;

    /* renamed from: e */
    public CommandProcessor f25876e;

    /* renamed from: g */
    public boolean f25877g = false;

    /* renamed from: k */
    public boolean f25878k = false;

    /* renamed from: r */
    public boolean f25879r = false;

    /* renamed from: s */
    public final ArrayList<CompatWorkItem> f25880s = new ArrayList<>();

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem a = JobIntentService.this.mo38416a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.mo38383g(a.getIntent());
                a.complete();
            }
        }

        public void onCancelled(Void voidR) {
            JobIntentService.this.mo38419i();
        }

        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo38419i();
        }
    }

    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        public boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        public boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000);
                        }
                    }
                }
            }
        }

        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {
        public final Intent mIntent;
        public final int mStartId;

        public CompatWorkItem(Intent intent, int i) {
            this.mIntent = intent;
            this.mStartId = i;
        }

        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        public Intent getIntent() {
            return this.mIntent;
        }
    }

    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName2, boolean z) {
            this.componentName = componentName2;
            this.useWakefulService = z;
        }
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        public static final boolean DEBUG = false;
        public static final String TAG = "JobServiceEngineImpl";
        public final Object mLock = new Object();
        public JobParameters mParams;
        public final JobIntentService mService;

        public final class WrapperWorkItem implements GenericWorkItem {
            public final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void complete() {
                /*
                    r3 = this;
                    com.onesignal.JobIntentService$JobServiceEngineImpl r0 = com.onesignal.JobIntentService.JobServiceEngineImpl.this
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    com.onesignal.JobIntentService$JobServiceEngineImpl r1 = com.onesignal.JobIntentService.JobServiceEngineImpl.this     // Catch:{ all -> 0x0012 }
                    android.app.job.JobParameters r1 = r1.mParams     // Catch:{ all -> 0x0012 }
                    if (r1 == 0) goto L_0x0010
                    android.app.job.JobWorkItem r2 = r3.mJobWork     // Catch:{ IllegalArgumentException | SecurityException -> 0x0010 }
                    r1.completeWork(r2)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0010 }
                L_0x0010:
                    monitor-exit(r0)     // Catch:{ all -> 0x0012 }
                    return
                L_0x0012:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0012 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onesignal.JobIntentService.JobServiceEngineImpl.WrapperWorkItem.complete():void");
            }

            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mService = jobIntentService;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|17) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.mService.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            return new com.onesignal.JobIntentService.JobServiceEngineImpl.WrapperWorkItem(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0025 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.onesignal.JobIntentService.GenericWorkItem dequeueWork() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.mParams     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ SecurityException -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                com.onesignal.JobIntentService r2 = r3.mService
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem r0 = new com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.JobIntentService.JobServiceEngineImpl.dequeueWork():com.onesignal.JobIntentService$GenericWorkItem");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.mo38418e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.mService.mo38417b();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return b;
        }
    }

    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(componentName);
            ensureJobId(i);
            this.mJobInfo = new JobInfo.Builder(i, this.mComponentName).setOverrideDeadline(0).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        public void enqueueWork(Intent intent) {
            int unused = this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    public static abstract class WorkEnqueuer {
        public final ComponentName mComponentName;
        public boolean mHasJobId;
        public int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i;
            } else if (this.mJobId != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.mJobId);
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    /* renamed from: c */
    public static void m40083c(Context context, ComponentName componentName, int i, Intent intent, boolean z) {
        if (intent != null) {
            synchronized (f25872x) {
                WorkEnqueuer f = m40085f(context, componentName, true, i, z);
                f.ensureJobId(i);
                try {
                    f.enqueueWork(intent);
                } catch (IllegalStateException e) {
                    if (z) {
                        m40085f(context, componentName, true, i, false).enqueueWork(intent);
                    } else {
                        throw e;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: d */
    public static void m40084d(Context context, Class cls, int i, Intent intent, boolean z) {
        m40083c(context, new ComponentName(context, cls), i, intent, z);
    }

    /* renamed from: f */
    public static WorkEnqueuer m40085f(Context context, ComponentName componentName, boolean z, int i, boolean z2) {
        WorkEnqueuer workEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z2);
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap = f25873y;
        WorkEnqueuer workEnqueuer2 = hashMap.get(componentNameWithWakeful);
        if (workEnqueuer2 != null) {
            return workEnqueuer2;
        }
        if (Build.VERSION.SDK_INT < 26 || z2) {
            workEnqueuer = new CompatWorkEnqueuer(context, componentName);
        } else if (z) {
            workEnqueuer = new JobWorkEnqueuer(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        WorkEnqueuer workEnqueuer3 = workEnqueuer;
        hashMap.put(componentNameWithWakeful, workEnqueuer3);
        return workEnqueuer3;
    }

    /* renamed from: a */
    public GenericWorkItem mo38416a() {
        GenericWorkItem dequeueWork;
        CompatJobEngine compatJobEngine = this.f25874a;
        if (compatJobEngine != null && (dequeueWork = compatJobEngine.dequeueWork()) != null) {
            return dequeueWork;
        }
        synchronized (this.f25880s) {
            if (this.f25880s.size() <= 0) {
                return null;
            }
            GenericWorkItem remove = this.f25880s.remove(0);
            return remove;
        }
    }

    /* renamed from: b */
    public boolean mo38417b() {
        CommandProcessor commandProcessor = this.f25876e;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.f25877g);
        }
        this.f25878k = true;
        return mo38384h();
    }

    /* renamed from: e */
    public void mo38418e(boolean z) {
        if (this.f25876e == null) {
            this.f25876e = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f25875d;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.f25876e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: g */
    public abstract void mo38383g(Intent intent);

    /* renamed from: h */
    public boolean mo38384h() {
        return true;
    }

    /* renamed from: i */
    public void mo38419i() {
        ArrayList<CompatWorkItem> arrayList = this.f25880s;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f25876e = null;
                ArrayList<CompatWorkItem> arrayList2 = this.f25880s;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo38418e(false);
                } else if (!this.f25879r) {
                    this.f25875d.serviceProcessingFinished();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.f25874a;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f25874a = new JobServiceEngineImpl(this);
            this.f25875d = null;
        }
        this.f25875d = m40085f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    public void onDestroy() {
        super.onDestroy();
        mo38417b();
        synchronized (this.f25880s) {
            this.f25879r = true;
            this.f25875d.serviceProcessingFinished();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f25875d.serviceStartReceived();
        synchronized (this.f25880s) {
            ArrayList<CompatWorkItem> arrayList = this.f25880s;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            mo38418e(true);
        }
        return 3;
    }
}
