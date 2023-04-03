package p000;

import androidx.media3.common.C0792h;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p000.iy6;
import p000.zs6;

/* renamed from: rm4 */
/* compiled from: PassthroughSectionPayloadReader */
public final class rm4 implements vr5 {

    /* renamed from: a */
    public C0792h f17291a;

    /* renamed from: b */
    public sq6 f17292b;

    /* renamed from: c */
    public zs6 f17293c;

    public rm4(String str) {
        this.f17291a = new C0792h.C0794b().mo6670e0(str).mo6644E();
    }

    /* renamed from: a */
    public void mo21424a(gm4 gm4) {
        mo25456c();
        long d = this.f17292b.mo25935d();
        long e = this.f17292b.mo25936e();
        if (d != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && e != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            C0792h hVar = this.f17291a;
            if (e != hVar.f4179M) {
                C0792h E = hVar.mo6636b().mo6674i0(e).mo6644E();
                this.f17291a = E;
                this.f17293c.mo7303d(E);
            }
            int a = gm4.mo20676a();
            this.f17293c.mo7300a(gm4, a);
            this.f17293c.mo7301b(d, 1, a, 0, (zs6.C3758a) null);
        }
    }

    /* renamed from: b */
    public void mo21425b(sq6 sq6, jy1 jy1, iy6.C2579d dVar) {
        this.f17292b = sq6;
        dVar.mo21670a();
        zs6 f = jy1.mo7713f(dVar.mo21672c(), 5);
        this.f17293c = f;
        f.mo7303d(this.f17291a);
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    /* renamed from: c */
    public final void mo25456c() {
        C2725kr.m20989i(this.f17292b);
        w67.m29360j(this.f17293c);
    }
}
