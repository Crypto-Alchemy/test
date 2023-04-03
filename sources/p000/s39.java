package p000;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: s39 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class s39 {

    /* renamed from: a */
    public final /* synthetic */ v39 f33710a;

    public s39(v39 v39) {
        this.f33710a = v39;
    }

    /* renamed from: a */
    public final void mo47625a() {
        this.f33710a.mo29006e();
        if (this.f33710a.f34342a.mo45275z().mo45486v(this.f33710a.f34342a.mo45256a().mo29580a())) {
            this.f33710a.f34342a.mo45275z().f31363l.mo41989b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f33710a.f34342a.mo45237A().mo29678v().mo48769a("Detected application was in foreground");
                mo47627c(this.f33710a.f34342a.mo45256a().mo29580a(), false);
            }
        }
    }

    /* renamed from: b */
    public final void mo47626b(long j, boolean z) {
        this.f33710a.mo29006e();
        this.f33710a.mo48656p();
        if (this.f33710a.f34342a.mo45275z().mo45486v(j)) {
            this.f33710a.f34342a.mo45275z().f31363l.mo41989b(true);
        }
        this.f33710a.f34342a.mo45275z().f31366o.mo43883b(j);
        if (this.f33710a.f34342a.mo45275z().f31363l.mo41988a()) {
            mo47627c(j, z);
        }
    }

    /* renamed from: c */
    public final void mo47627c(long j, boolean z) {
        this.f33710a.mo29006e();
        if (this.f33710a.f34342a.mo45262h()) {
            this.f33710a.f34342a.mo45275z().f31366o.mo43883b(j);
            this.f33710a.f34342a.mo45237A().mo29678v().mo48770b("Session started, time", Long.valueOf(this.f33710a.f34342a.mo45256a().mo29581b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f33710a.f34342a.mo45242F().mo47924m("auto", "_sid", valueOf, j);
            this.f33710a.f34342a.mo45275z().f31363l.mo41989b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f33710a.f34342a.mo45274y().mo45997v((String) null, rl8.f33503j0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f33710a.f34342a.mo45242F().mo47917Y("auto", "_s", j, bundle);
            dd9.m43457a();
            if (this.f33710a.f34342a.mo45274y().mo45997v((String) null, rl8.f33513o0)) {
                String a = this.f33710a.f34342a.mo45275z().f31371t.mo43884a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f33710a.f34342a.mo45242F().mo47917Y("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
