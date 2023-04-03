package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: v39 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class v39 extends qo8 {

    /* renamed from: c */
    public Handler f34827c;

    /* renamed from: d */
    public final s39 f34828d = new s39(this);

    /* renamed from: e */
    public final p39 f34829e = new p39(this);

    /* renamed from: f */
    public final j39 f34830f = new j39(this);

    public v39(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: l */
    public static /* synthetic */ void m53207l(v39 v39, long j) {
        v39.mo29006e();
        v39.mo48656p();
        v39.f34342a.mo45237A().mo29678v().mo48770b("Activity resumed, time", Long.valueOf(j));
        n68 y = v39.f34342a.mo45274y();
        uk8<Boolean> uk8 = rl8.f33523t0;
        if (y.mo45997v((String) null, uk8)) {
            if (v39.f34342a.mo45274y().mo45978C() || v39.f34342a.mo45275z().f31368q.mo41988a()) {
                v39.f34829e.mo46623a(j);
            }
            v39.f34830f.mo44048a();
        } else {
            v39.f34830f.mo44048a();
            if (v39.f34342a.mo45274y().mo45978C()) {
                v39.f34829e.mo46623a(j);
            }
        }
        s39 s39 = v39.f34828d;
        s39.f33710a.mo29006e();
        if (s39.f33710a.f34342a.mo45262h()) {
            if (!s39.f33710a.f34342a.mo45274y().mo45997v((String) null, uk8)) {
                s39.f33710a.f34342a.mo45275z().f31368q.mo41989b(false);
            }
            s39.mo47626b(s39.f33710a.f34342a.mo45256a().mo29580a(), false);
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m53208m(v39 v39, long j) {
        v39.mo29006e();
        v39.mo48656p();
        v39.f34342a.mo45237A().mo29678v().mo48770b("Activity paused, time", Long.valueOf(j));
        v39.f34830f.mo44049b(j);
        if (v39.f34342a.mo45274y().mo45978C()) {
            v39.f34829e.mo46624b(j);
        }
        s39 s39 = v39.f34828d;
        if (!s39.f33710a.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0)) {
            s39.f33710a.f34342a.mo45275z().f31368q.mo41989b(true);
        }
    }

    /* renamed from: j */
    public final boolean mo41976j() {
        return false;
    }

    /* renamed from: p */
    public final void mo48656p() {
        mo29006e();
        if (this.f34827c == null) {
            this.f34827c = new rd8(Looper.getMainLooper());
        }
    }
}
