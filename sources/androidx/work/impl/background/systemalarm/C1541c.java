package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C1542d;
import java.util.Collections;
import java.util.List;
import p000.gn7;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* compiled from: DelayMetCommandHandler */
public class C1541c implements bm7, tu1, gn7.C2411b {

    /* renamed from: A */
    public static final String f7577A = qk3.m25728f("DelayMetCommandHandler");

    /* renamed from: a */
    public final Context f7578a;

    /* renamed from: d */
    public final int f7579d;

    /* renamed from: e */
    public final String f7580e;

    /* renamed from: g */
    public final C1542d f7581g;

    /* renamed from: k */
    public final cm7 f7582k;

    /* renamed from: r */
    public final Object f7583r = new Object();

    /* renamed from: s */
    public int f7584s = 0;

    /* renamed from: x */
    public PowerManager.WakeLock f7585x;

    /* renamed from: y */
    public boolean f7586y = false;

    public C1541c(Context context, int i, String str, C1542d dVar) {
        this.f7578a = context;
        this.f7579d = i;
        this.f7581g = dVar;
        this.f7580e = str;
        this.f7582k = new cm7(context, dVar.mo10991f(), this);
    }

    /* renamed from: a */
    public void mo10981a(String str) {
        qk3.m25726c().mo25135a(f7577A, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        mo10986g();
    }

    /* renamed from: b */
    public void mo10982b(List<String> list) {
        mo10986g();
    }

    /* renamed from: c */
    public final void mo10983c() {
        synchronized (this.f7583r) {
            this.f7582k.mo12129e();
            this.f7581g.mo10993h().mo20712c(this.f7580e);
            PowerManager.WakeLock wakeLock = this.f7585x;
            if (wakeLock != null && wakeLock.isHeld()) {
                qk3.m25726c().mo25135a(f7577A, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f7585x, this.f7580e}), new Throwable[0]);
                this.f7585x.release();
            }
        }
    }

    /* renamed from: d */
    public void mo10984d() {
        this.f7585x = fg7.m16992b(this.f7578a, String.format("%s (%s)", new Object[]{this.f7580e, Integer.valueOf(this.f7579d)}));
        qk3 c = qk3.m25726c();
        String str = f7577A;
        c.mo25135a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f7585x, this.f7580e}), new Throwable[0]);
        this.f7585x.acquire();
        an7 f = this.f7581g.mo10992g().mo23743q().mo10955N().mo11715f(this.f7580e);
        if (f == null) {
            mo10986g();
            return;
        }
        boolean b = f.mo432b();
        this.f7586y = b;
        if (!b) {
            qk3.m25726c().mo25135a(str, String.format("No constraints for %s", new Object[]{this.f7580e}), new Throwable[0]);
            mo10985f(Collections.singletonList(this.f7580e));
            return;
        }
        this.f7582k.mo12128d(Collections.singletonList(f));
    }

    /* renamed from: e */
    public void mo10971e(String str, boolean z) {
        qk3.m25726c().mo25135a(f7577A, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        mo10983c();
        if (z) {
            Intent d = C1539a.m10557d(this.f7578a, this.f7580e);
            C1542d dVar = this.f7581g;
            dVar.mo10996k(new C1542d.C1544b(dVar, d, this.f7579d));
        }
        if (this.f7586y) {
            Intent a = C1539a.m10554a(this.f7578a);
            C1542d dVar2 = this.f7581g;
            dVar2.mo10996k(new C1542d.C1544b(dVar2, a, this.f7579d));
        }
    }

    /* renamed from: f */
    public void mo10985f(List<String> list) {
        if (list.contains(this.f7580e)) {
            synchronized (this.f7583r) {
                if (this.f7584s == 0) {
                    this.f7584s = 1;
                    qk3.m25726c().mo25135a(f7577A, String.format("onAllConstraintsMet for %s", new Object[]{this.f7580e}), new Throwable[0]);
                    if (this.f7581g.mo10990d().mo26581j(this.f7580e)) {
                        this.f7581g.mo10993h().mo20711b(this.f7580e, 600000, this);
                    } else {
                        mo10983c();
                    }
                } else {
                    qk3.m25726c().mo25135a(f7577A, String.format("Already started work for %s", new Object[]{this.f7580e}), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo10986g() {
        synchronized (this.f7583r) {
            if (this.f7584s < 2) {
                this.f7584s = 2;
                qk3 c = qk3.m25726c();
                String str = f7577A;
                c.mo25135a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f7580e}), new Throwable[0]);
                Intent f = C1539a.m10558f(this.f7578a, this.f7580e);
                C1542d dVar = this.f7581g;
                dVar.mo10996k(new C1542d.C1544b(dVar, f, this.f7579d));
                if (this.f7581g.mo10990d().mo26578g(this.f7580e)) {
                    qk3.m25726c().mo25135a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f7580e}), new Throwable[0]);
                    Intent d = C1539a.m10557d(this.f7578a, this.f7580e);
                    C1542d dVar2 = this.f7581g;
                    dVar2.mo10996k(new C1542d.C1544b(dVar2, d, this.f7579d));
                } else {
                    qk3.m25726c().mo25135a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f7580e}), new Throwable[0]);
                }
            } else {
                qk3.m25726c().mo25135a(f7577A, String.format("Already stopped work for %s", new Object[]{this.f7580e}), new Throwable[0]);
            }
        }
    }
}
