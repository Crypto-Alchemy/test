package p000;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* renamed from: o49 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class o49 extends t49 {

    /* renamed from: d */
    public final AlarmManager f32277d = ((AlarmManager) this.f34342a.mo45271q().getSystemService("alarm"));

    /* renamed from: e */
    public b88 f32278e;

    /* renamed from: f */
    public Integer f32279f;

    public o49(s59 s59) {
        super(s59);
    }

    /* renamed from: h */
    public final boolean mo43450h() {
        AlarmManager alarmManager = this.f32277d;
        if (alarmManager != null) {
            alarmManager.cancel(mo46313o());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        mo46311m();
        return false;
    }

    /* renamed from: j */
    public final void mo46308j(long j) {
        mo47982g();
        this.f34342a.mo45257b();
        Context q = this.f34342a.mo45271q();
        if (!g69.m44581a0(q)) {
            this.f34342a.mo45237A().mo29677u().mo48769a("Receiver not registered/enabled");
        }
        if (!g69.m44576D(q, false)) {
            this.f34342a.mo45237A().mo29677u().mo48769a("Service not registered/enabled");
        }
        mo46309k();
        this.f34342a.mo45237A().mo29678v().mo48770b("Scheduling upload, millis", Long.valueOf(j));
        long b = this.f34342a.mo45256a().mo29581b() + j;
        this.f34342a.mo45274y();
        if (j < Math.max(0, rl8.f33532y.mo48412b(null).longValue()) && !mo46310l().mo29495c()) {
            mo46310l().mo29494b(j);
        }
        this.f34342a.mo45257b();
        if (Build.VERSION.SDK_INT >= 24) {
            Context q2 = this.f34342a.mo45271q();
            ComponentName componentName = new ComponentName(q2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int n = mo46312n();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            dd8.m43456a(q2, new JobInfo.Builder(n, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f32277d;
        if (alarmManager != null) {
            this.f34342a.mo45274y();
            alarmManager.setInexactRepeating(2, b, Math.max(rl8.f33522t.mo48412b(null).longValue(), j), mo46313o());
        }
    }

    /* renamed from: k */
    public final void mo46309k() {
        mo47982g();
        this.f34342a.mo45237A().mo29678v().mo48769a("Unscheduling upload");
        AlarmManager alarmManager = this.f32277d;
        if (alarmManager != null) {
            alarmManager.cancel(mo46313o());
        }
        mo46310l().mo29496d();
        if (Build.VERSION.SDK_INT >= 24) {
            mo46311m();
        }
    }

    /* renamed from: l */
    public final b88 mo46310l() {
        if (this.f32278e == null) {
            this.f32278e = new m49(this, this.f33321b.mo47680p());
        }
        return this.f32278e;
    }

    @TargetApi(24)
    /* renamed from: m */
    public final void mo46311m() {
        JobScheduler jobScheduler = (JobScheduler) this.f34342a.mo45271q().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo46312n());
        }
    }

    /* renamed from: n */
    public final int mo46312n() {
        String str;
        if (this.f32279f == null) {
            String valueOf = String.valueOf(this.f34342a.mo45271q().getPackageName());
            if (valueOf.length() != 0) {
                str = "measurement".concat(valueOf);
            } else {
                str = new String("measurement");
            }
            this.f32279f = Integer.valueOf(str.hashCode());
        }
        return this.f32279f.intValue();
    }

    /* renamed from: o */
    public final PendingIntent mo46313o() {
        Context q = this.f34342a.mo45271q();
        return ad8.m31778a(q, 0, new Intent().setClassName(q, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), ad8.f20915a);
    }
}
