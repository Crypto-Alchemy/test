package p000;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: c33 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c33 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JobInfoSchedulerService f21591a;

    /* renamed from: d */
    public final /* synthetic */ JobParameters f21592d;

    public /* synthetic */ c33(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f21591a = jobInfoSchedulerService;
        this.f21592d = jobParameters;
    }

    public final void run() {
        this.f21591a.m33181b(this.f21592d);
    }
}
