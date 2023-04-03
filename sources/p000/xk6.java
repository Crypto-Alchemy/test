package p000;

import android.app.job.JobInfo;
import android.app.job.JobInfo$TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import p000.vr0;

/* renamed from: xk6 */
/* compiled from: SystemJobInfoConverter */
public class xk6 {

    /* renamed from: b */
    public static final String f19860b = qk3.m25728f("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f19861a;

    /* renamed from: xk6$a */
    /* compiled from: SystemJobInfoConverter */
    public static /* synthetic */ class C3611a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19862a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19862a = r0
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19862a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19862a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19862a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19862a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.xk6.C3611a.<clinit>():void");
        }
    }

    public xk6(Context context) {
        this.f19861a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    public static JobInfo$TriggerContentUri m30155b(vr0.C3506a aVar) {
        return new JobInfo$TriggerContentUri(aVar.mo27309a(), aVar.mo27310b() ? 1 : 0);
    }

    /* renamed from: c */
    public static int m30156c(NetworkType networkType) {
        int i = C3611a.f19862a[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        qk3.m25726c().mo25135a(f19860b, String.format("API version too low. Cannot convert network type value %s", new Object[]{networkType}), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    public static void m30157d(JobInfo.Builder builder, NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m30156c(networkType));
        } else {
            JobInfo.Builder unused = builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* renamed from: a */
    public JobInfo mo27775a(an7 an7, int i) {
        boolean z;
        int i2;
        nq0 nq0 = an7.f213j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", an7.f204a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", an7.mo434d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f19861a).setRequiresCharging(nq0.mo23765g()).setRequiresDeviceIdle(nq0.mo23766h()).setExtras(persistableBundle);
        m30157d(extras, nq0.mo23759b());
        boolean z2 = false;
        if (!nq0.mo23766h()) {
            if (an7.f215l == BackoffPolicy.LINEAR) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(an7.f216m, i2);
        }
        long max = Math.max(an7.mo431a() - System.currentTimeMillis(), 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!an7.f220q) {
            JobInfo.Builder unused = extras.setImportantWhileForeground(true);
        }
        if (i3 >= 24 && nq0.mo23762e()) {
            for (vr0.C3506a b : nq0.mo23758a().mo27305b()) {
                JobInfo.Builder unused2 = extras.addTriggerContentUri(m30155b(b));
            }
            JobInfo.Builder unused3 = extras.setTriggerContentUpdateDelay(nq0.mo23760c());
            JobInfo.Builder unused4 = extras.setTriggerContentMaxDelay(nq0.mo23761d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            JobInfo.Builder unused5 = extras.setRequiresBatteryNotLow(nq0.mo23764f());
            JobInfo.Builder unused6 = extras.setRequiresStorageNotLow(nq0.mo23768i());
        }
        if (an7.f214k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        }
        if (x40.m29874c() && an7.f220q && !z && !z2) {
            JobInfo.Builder unused7 = extras.setExpedited(true);
        }
        return extras.build();
    }
}
