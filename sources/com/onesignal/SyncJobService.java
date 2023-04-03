package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.C5312q0;
import com.onesignal.OneSignal;

public class SyncJobService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        C5312q0.m41240q().mo39090b(this, new C5312q0.C5314b(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean l = C5312q0.m41240q().mo39096l();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "SyncJobService onStopJob called, system conditions not available reschedule: " + l);
        return l;
    }
}
