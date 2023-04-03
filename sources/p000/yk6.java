package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: yk6 */
/* compiled from: SystemJobScheduler */
public class yk6 implements om5 {

    /* renamed from: k */
    public static final String f20268k = qk3.m25728f("SystemJobScheduler");

    /* renamed from: a */
    public final Context f20269a;

    /* renamed from: d */
    public final JobScheduler f20270d;

    /* renamed from: e */
    public final nm7 f20271e;

    /* renamed from: g */
    public final xk6 f20272g;

    public yk6(Context context, nm7 nm7) {
        this(context, nm7, (JobScheduler) context.getSystemService("jobscheduler"), new xk6(context));
    }

    /* renamed from: b */
    public static void m30661b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = m30664g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo id : g) {
                m30662e(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: e */
    public static void m30662e(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            qk3.m25726c().mo25136b(f20268k, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: f */
    public static List<Integer> m30663f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = m30664g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g) {
            if (str.equals(m30665h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<JobInfo> m30664g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            qk3.m25726c().mo25136b(f20268k, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static String m30665h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m30666i(Context context, nm7 nm7) {
        int i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m30664g(context, jobScheduler);
        List<String> b = nm7.mo23743q().mo10952K().mo23714b();
        boolean z = false;
        if (g != null) {
            i = g.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (g != null && !g.isEmpty()) {
            for (JobInfo next : g) {
                String h = m30665h(next);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    m30662e(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    qk3.m25726c().mo25135a(f20268k, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase q = nm7.mo23743q();
            q.mo10119e();
            try {
                bn7 N = q.mo10955N();
                for (String l : b) {
                    N.mo11721l(l, -1);
                }
                q.mo10115C();
            } finally {
                q.mo10124j();
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo24003a(String str) {
        List<Integer> f = m30663f(this.f20269a, this.f20270d, str);
        if (f != null && !f.isEmpty()) {
            for (Integer intValue : f) {
                m30662e(this.f20270d, intValue.intValue());
            }
            this.f20271e.mo23743q().mo10952K().mo23716d(str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo24004c(an7... an7Arr) {
        int i;
        List<Integer> f;
        int i2;
        WorkDatabase q = this.f20271e.mo23743q();
        yp2 yp2 = new yp2(q);
        int length = an7Arr.length;
        int i3 = 0;
        while (i3 < length) {
            an7 an7 = an7Arr[i3];
            q.mo10119e();
            try {
                an7 f2 = q.mo10955N().mo11715f(an7.f204a);
                if (f2 == null) {
                    qk3.m25726c().mo25139h(f20268k, "Skipping scheduling " + an7.f204a + " because it's no longer in the DB", new Throwable[0]);
                    q.mo10115C();
                } else if (f2.f205b != WorkInfo.State.ENQUEUED) {
                    qk3.m25726c().mo25139h(f20268k, "Skipping scheduling " + an7.f204a + " because it is no longer enqueued", new Throwable[0]);
                    q.mo10115C();
                } else {
                    mk6 a = q.mo10952K().mo23713a(an7.f204a);
                    if (a != null) {
                        i = a.f14998b;
                    } else {
                        i = yp2.mo28172d(this.f20271e.mo23739k().mo10913i(), this.f20271e.mo23739k().mo10911g());
                    }
                    if (a == null) {
                        this.f20271e.mo23743q().mo10952K().mo23715c(new mk6(an7.f204a, i));
                    }
                    mo28142j(an7, i);
                    if (Build.VERSION.SDK_INT == 23 && (f = m30663f(this.f20269a, this.f20270d, an7.f204a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            i2 = f.get(0).intValue();
                        } else {
                            i2 = yp2.mo28172d(this.f20271e.mo23739k().mo10913i(), this.f20271e.mo23739k().mo10911g());
                        }
                        mo28142j(an7, i2);
                    }
                    q.mo10115C();
                }
                q.mo10124j();
                i3++;
            } catch (Throwable th) {
                q.mo10124j();
                throw th;
            }
        }
    }

    /* renamed from: d */
    public boolean mo24005d() {
        return true;
    }

    /* renamed from: j */
    public void mo28142j(an7 an7, int i) {
        int i2;
        JobInfo a = this.f20272g.mo27775a(an7, i);
        qk3 c = qk3.m25726c();
        String str = f20268k;
        c.mo25135a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{an7.f204a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f20270d.schedule(a) == 0) {
                qk3.m25726c().mo25139h(str, String.format("Unable to schedule work ID %s", new Object[]{an7.f204a}), new Throwable[0]);
                if (an7.f220q && an7.f221r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    an7.f220q = false;
                    qk3.m25726c().mo25135a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{an7.f204a}), new Throwable[0]);
                    mo28142j(an7, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = m30664g(this.f20269a, this.f20270d);
            if (g != null) {
                i2 = g.size();
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f20271e.mo23743q().mo10955N().mo11711c().size()), Integer.valueOf(this.f20271e.mo23739k().mo10912h())});
            qk3.m25726c().mo25136b(f20268k, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            qk3.m25726c().mo25136b(f20268k, String.format("Unable to schedule %s", new Object[]{an7}), th);
        }
    }

    public yk6(Context context, nm7 nm7, JobScheduler jobScheduler, xk6 xk6) {
        this.f20269a = context;
        this.f20271e = nm7;
        this.f20270d = jobScheduler;
        this.f20272g = xk6;
    }
}
