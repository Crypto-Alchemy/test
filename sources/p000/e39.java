package p000;

import android.os.Bundle;

/* renamed from: e39 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final /* synthetic */ class e39 implements Runnable {

    /* renamed from: a */
    public final h39 f28376a;

    public e39(h39 h39) {
        this.f28376a = h39;
    }

    public final void run() {
        h39 h39 = this.f28376a;
        j39 j39 = h39.f29431e;
        long j = h39.f29429a;
        long j2 = h39.f29430d;
        j39.f30213b.mo29006e();
        j39.f30213b.f34342a.mo45237A().mo29677u().mo48769a("Application going to the background");
        boolean z = true;
        if (j39.f30213b.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0)) {
            j39.f30213b.f34342a.mo45275z().f31368q.mo41989b(true);
        }
        Bundle bundle = new Bundle();
        if (!j39.f30213b.f34342a.mo45274y().mo45978C()) {
            j39.f30213b.f34829e.mo46624b(j2);
            if (j39.f30213b.f34342a.mo45274y().mo45997v((String) null, rl8.f33507l0)) {
                p39 p39 = j39.f30213b.f34829e;
                long j3 = p39.f32549b;
                p39.f32549b = j2;
                bundle.putLong("_et", j2 - j3);
                jz8.m46827w(j39.f30213b.f34342a.mo45253Q().mo44640p(true), bundle, true);
            } else {
                z = false;
            }
            j39.f30213b.f34829e.mo46626d(false, z, j2);
        }
        j39.f30213b.f34342a.mo45242F().mo47917Y("auto", "_ab", j, bundle);
    }
}
