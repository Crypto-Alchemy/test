package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p000.hx6;

public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m33181b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        ox6.m49601f(getApplicationContext());
        hx6.C5942a d = hx6.m45404a().mo43422b(string).mo43424d(fv4.m44433b(i));
        if (string2 != null) {
            d.mo43423c(Base64.decode(string2, 0));
        }
        ox6.m49599c().mo46562e().mo41851k(d.mo43421a(), i2, new c33(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
