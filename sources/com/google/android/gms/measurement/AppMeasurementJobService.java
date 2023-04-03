package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class AppMeasurementJobService extends JobService implements s29 {

    /* renamed from: a */
    public v29<AppMeasurementJobService> f23057a;

    /* renamed from: a */
    public final void mo31346a(Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: b */
    public final void mo31347b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: c */
    public final v29<AppMeasurementJobService> mo31348c() {
        if (this.f23057a == null) {
            this.f23057a = new v29<>(this);
        }
        return this.f23057a;
    }

    /* renamed from: d */
    public final boolean mo31349d(int i) {
        throw new UnsupportedOperationException();
    }

    public void onCreate() {
        super.onCreate();
        mo31348c().mo48640a();
    }

    public void onDestroy() {
        mo31348c().mo48641b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        mo31348c().mo48647h(intent);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        mo31348c().mo48646g(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        mo31348c().mo48645f(intent);
        return true;
    }
}
