package p000;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzcl;
import p000.s29;

/* renamed from: v29 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class v29<T extends Context & s29> {

    /* renamed from: a */
    public final T f34824a;

    public v29(T t) {
        cu4.m43221k(t);
        this.f34824a = t;
    }

    /* renamed from: a */
    public final void mo48640a() {
        kr8 e = kr8.m47470e(this.f34824a, (zzcl) null, (Long) null);
        bn8 A = e.mo45237A();
        e.mo45257b();
        A.mo29678v().mo48769a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void mo48641b() {
        kr8 e = kr8.m47470e(this.f34824a, (zzcl) null, (Long) null);
        bn8 A = e.mo45237A();
        e.mo45257b();
        A.mo29678v().mo48769a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: c */
    public final int mo48642c(Intent intent, int i, int i2) {
        kr8 e = kr8.m47470e(this.f34824a, (zzcl) null, (Long) null);
        bn8 A = e.mo45237A();
        if (intent == null) {
            A.mo29673o().mo48769a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        e.mo45257b();
        A.mo29678v().mo48771c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo48643d(new k29(this, i2, A, intent));
        }
        return 2;
    }

    /* renamed from: d */
    public final void mo48643d(Runnable runnable) {
        s59 F = s59.m51547F(this.f34824a);
        F.mo45272s().mo41640o(new p29(this, F, runnable));
    }

    /* renamed from: e */
    public final IBinder mo48644e(Intent intent) {
        if (intent == null) {
            mo48650k().mo29670l().mo48769a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new rt8(s59.m51547F(this.f34824a), (String) null);
        }
        mo48650k().mo29673o().mo48770b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: f */
    public final boolean mo48645f(Intent intent) {
        if (intent == null) {
            mo48650k().mo29670l().mo48769a("onUnbind called with null intent");
            return true;
        }
        mo48650k().mo29678v().mo48770b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    /* renamed from: g */
    public final boolean mo48646g(JobParameters jobParameters) {
        kr8 e = kr8.m47470e(this.f34824a, (zzcl) null, (Long) null);
        bn8 A = e.mo45237A();
        String string = jobParameters.getExtras().getString("action");
        e.mo45257b();
        A.mo29678v().mo48770b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo48643d(new m29(this, A, jobParameters));
        return true;
    }

    /* renamed from: h */
    public final void mo48647h(Intent intent) {
        if (intent == null) {
            mo48650k().mo29670l().mo48769a("onRebind called with null intent");
            return;
        }
        mo48650k().mo29678v().mo48770b("onRebind called. action", intent.getAction());
    }

    /* renamed from: i */
    public final /* synthetic */ void mo48648i(bn8 bn8, JobParameters jobParameters) {
        bn8.mo29678v().mo48769a("AppMeasurementJobService processed last upload request.");
        ((s29) this.f34824a).mo31347b(jobParameters, false);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo48649j(int i, bn8 bn8, Intent intent) {
        if (((s29) this.f34824a).mo31349d(i)) {
            bn8.mo29678v().mo48770b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            mo48650k().mo29678v().mo48769a("Completed wakeful intent.");
            ((s29) this.f34824a).mo31346a(intent);
        }
    }

    /* renamed from: k */
    public final bn8 mo48650k() {
        return kr8.m47470e(this.f34824a, (zzcl) null, (Long) null).mo45237A();
    }
}
