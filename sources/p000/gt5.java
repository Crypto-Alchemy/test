package p000;

import androidx.media3.common.C0792h;
import java.util.List;
import p000.iy6;

/* renamed from: gt5 */
/* compiled from: SeiReader */
public final class gt5 {

    /* renamed from: a */
    public final List<C0792h> f12607a;

    /* renamed from: b */
    public final zs6[] f12608b;

    public gt5(List<C0792h> list) {
        this.f12607a = list;
        this.f12608b = new zs6[list.size()];
    }

    /* renamed from: a */
    public void mo20843a(long j, gm4 gm4) {
        jc0.m20068a(j, gm4, this.f12608b);
    }

    /* renamed from: b */
    public void mo20844b(jy1 jy1, iy6.C2579d dVar) {
        boolean z;
        for (int i = 0; i < this.f12608b.length; i++) {
            dVar.mo21670a();
            zs6 f = jy1.mo7713f(dVar.mo21672c(), 3);
            C0792h hVar = this.f12607a.get(i);
            String str = hVar.f4175C;
            if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20982b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = hVar.f4186a;
            if (str2 == null) {
                str2 = dVar.mo21671b();
            }
            f.mo7303d(new C0792h.C0794b().mo6658S(str2).mo6670e0(str).mo6672g0(hVar.f4192g).mo6661V(hVar.f4189e).mo6645F(hVar.f4197q1).mo6659T(hVar.f4177I).mo6644E());
            this.f12608b[i] = f;
        }
    }
}
