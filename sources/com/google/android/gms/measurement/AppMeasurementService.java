package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class AppMeasurementService extends Service implements s29 {

    /* renamed from: a */
    public v29<AppMeasurementService> f23059a;

    /* renamed from: a */
    public final void mo31346a(Intent intent) {
        WakefulBroadcastReceiver.m5018b(intent);
    }

    /* renamed from: b */
    public final void mo31347b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final v29<AppMeasurementService> mo31358c() {
        if (this.f23059a == null) {
            this.f23059a = new v29<>(this);
        }
        return this.f23059a;
    }

    /* renamed from: d */
    public final boolean mo31349d(int i) {
        return stopSelfResult(i);
    }

    public IBinder onBind(Intent intent) {
        return mo31358c().mo48644e(intent);
    }

    public void onCreate() {
        super.onCreate();
        mo31358c().mo48640a();
    }

    public void onDestroy() {
        mo31358c().mo48641b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        mo31358c().mo48647h(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        mo31358c().mo48642c(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        mo31358c().mo48645f(intent);
        return true;
    }
}
