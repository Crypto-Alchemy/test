package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* renamed from: b33 */
/* compiled from: JobInfoScheduler */
public class b33 implements ym7 {

    /* renamed from: a */
    public final Context f21120a;

    /* renamed from: b */
    public final du1 f21121b;

    /* renamed from: c */
    public final SchedulerConfig f21122c;

    public b33(Context context, du1 du1, SchedulerConfig schedulerConfig) {
        this.f21120a = context;
        this.f21121b = du1;
        this.f21122c = schedulerConfig;
    }

    /* renamed from: a */
    public void mo29439a(hx6 hx6, int i) {
        mo29440b(hx6, i, false);
    }

    /* renamed from: b */
    public void mo29440b(hx6 hx6, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f21120a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f21120a.getSystemService("jobscheduler");
        int c = mo29441c(hx6);
        if (z || !mo29442d(jobScheduler, c, i)) {
            long K0 = this.f21121b.mo42054K0(hx6);
            JobInfo.Builder c2 = this.f21122c.mo30151c(new JobInfo.Builder(c, componentName), hx6.mo43418d(), K0, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", hx6.mo43416b());
            persistableBundle.putInt("priority", fv4.m44432a(hx6.mo43418d()));
            if (hx6.mo43417c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(hx6.mo43417c(), 0));
            }
            c2.setExtras(persistableBundle);
            xk3.m54421b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", hx6, Integer.valueOf(c), Long.valueOf(this.f21122c.mo30153g(hx6.mo43418d(), K0, i)), Long.valueOf(K0), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        xk3.m54420a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", hx6);
    }

    /* renamed from: c */
    public int mo29441c(hx6 hx6) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f21120a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(hx6.mo43416b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(fv4.m44432a(hx6.mo43418d())).array());
        if (hx6.mo43417c() != null) {
            adler32.update(hx6.mo43417c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean mo29442d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
