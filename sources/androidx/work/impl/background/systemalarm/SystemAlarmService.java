package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.C1542d;

public class SystemAlarmService extends LifecycleService implements C1542d.C1545c {

    /* renamed from: g */
    public static final String f7565g = qk3.m25728f("SystemAlarmService");

    /* renamed from: d */
    public C1542d f7566d;

    /* renamed from: e */
    public boolean f7567e;

    /* renamed from: b */
    public void mo10969b() {
        this.f7567e = true;
        qk3.m25726c().mo25135a(f7565g, "All commands completed in dispatcher", new Throwable[0]);
        fg7.m16991a();
        stopSelf();
    }

    /* renamed from: e */
    public final void mo10970e() {
        C1542d dVar = new C1542d(this);
        this.f7566d = dVar;
        dVar.mo10998m(this);
    }

    public void onCreate() {
        super.onCreate();
        mo10970e();
        this.f7567e = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7567e = true;
        this.f7566d.mo10995j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f7567e) {
            qk3.m25726c().mo25137d(f7565g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f7566d.mo10995j();
            mo10970e();
            this.f7567e = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7566d.mo10987a(intent, i2);
        return 3;
    }
}
