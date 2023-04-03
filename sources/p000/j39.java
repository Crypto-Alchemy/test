package p000;

/* renamed from: j39 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class j39 {

    /* renamed from: a */
    public h39 f30212a;

    /* renamed from: b */
    public final /* synthetic */ v39 f30213b;

    public j39(v39 v39) {
        this.f30213b = v39;
    }

    /* renamed from: a */
    public final void mo44048a() {
        this.f30213b.mo29006e();
        if (this.f30212a != null) {
            this.f30213b.f34827c.removeCallbacks(this.f30212a);
        }
        if (this.f30213b.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0)) {
            this.f30213b.f34342a.mo45275z().f31368q.mo41989b(false);
        }
    }

    /* renamed from: b */
    public final void mo44049b(long j) {
        this.f30212a = new h39(this, this.f30213b.f34342a.mo45256a().mo29580a(), j);
        this.f30213b.f34827c.postDelayed(this.f30212a, 2000);
    }
}
