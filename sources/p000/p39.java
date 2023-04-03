package p000;

import android.os.Bundle;

/* renamed from: p39 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class p39 {

    /* renamed from: a */
    public long f32548a;

    /* renamed from: b */
    public long f32549b;

    /* renamed from: c */
    public final b88 f32550c;

    /* renamed from: d */
    public final /* synthetic */ v39 f32551d;

    public p39(v39 v39) {
        this.f32551d = v39;
        this.f32550c = new m39(this, v39.f34342a);
        long b = v39.f34342a.mo45256a().mo29581b();
        this.f32548a = b;
        this.f32549b = b;
    }

    /* renamed from: a */
    public final void mo46623a(long j) {
        this.f32551d.mo29006e();
        this.f32550c.mo29496d();
        this.f32548a = j;
        this.f32549b = j;
    }

    /* renamed from: b */
    public final void mo46624b(long j) {
        this.f32550c.mo29496d();
    }

    /* renamed from: c */
    public final void mo46625c() {
        this.f32550c.mo29496d();
        this.f32548a = 0;
        this.f32549b = 0;
    }

    /* renamed from: d */
    public final boolean mo46626d(boolean z, boolean z2, long j) {
        this.f32551d.mo29006e();
        this.f32551d.mo47219g();
        xd9.m54379a();
        if (!this.f32551d.f34342a.mo45274y().mo45997v((String) null, rl8.f33515p0)) {
            this.f32551d.f34342a.mo45275z().f31366o.mo43883b(this.f32551d.f34342a.mo45256a().mo29580a());
        } else if (this.f32551d.f34342a.mo45262h()) {
            this.f32551d.f34342a.mo45275z().f31366o.mo43883b(this.f32551d.f34342a.mo45256a().mo29580a());
        }
        long j2 = j - this.f32548a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f32549b;
                this.f32549b = j;
            }
            this.f32551d.f34342a.mo45237A().mo29678v().mo48770b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            jz8.m46827w(this.f32551d.f34342a.mo45253Q().mo44640p(!this.f32551d.f34342a.mo45274y().mo45978C()), bundle, true);
            n68 y = this.f32551d.f34342a.mo45274y();
            uk8<Boolean> uk8 = rl8.f33479V;
            if (!y.mo45997v((String) null, uk8) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f32551d.f34342a.mo45274y().mo45997v((String) null, uk8) || !z2) {
                this.f32551d.f34342a.mo45242F().mo47916X("auto", "_e", bundle);
            }
            this.f32548a = j;
            this.f32550c.mo29496d();
            this.f32550c.mo29494b(3600000);
            return true;
        }
        this.f32551d.f34342a.mo45237A().mo29678v().mo48770b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
