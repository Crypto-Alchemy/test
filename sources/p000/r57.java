package p000;

import androidx.media3.common.C0792h;
import java.util.List;
import p000.iy6;

/* renamed from: r57 */
/* compiled from: UserDataReader */
public final class r57 {

    /* renamed from: a */
    public final List<C0792h> f17132a;

    /* renamed from: b */
    public final zs6[] f17133b;

    public r57(List<C0792h> list) {
        this.f17132a = list;
        this.f17133b = new zs6[list.size()];
    }

    /* renamed from: a */
    public void mo25336a(long j, gm4 gm4) {
        if (gm4.mo20676a() >= 9) {
            int n = gm4.mo20689n();
            int n2 = gm4.mo20689n();
            int D = gm4.mo20662D();
            if (n == 434 && n2 == 1195456820 && D == 3) {
                jc0.m20069b(j, gm4, this.f17133b);
            }
        }
    }

    /* renamed from: b */
    public void mo25337b(jy1 jy1, iy6.C2579d dVar) {
        boolean z;
        for (int i = 0; i < this.f17133b.length; i++) {
            dVar.mo21670a();
            zs6 f = jy1.mo7713f(dVar.mo21672c(), 3);
            C0792h hVar = this.f17132a.get(i);
            String str = hVar.f4175C;
            if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20982b(z, "Invalid closed caption mime type provided: " + str);
            f.mo7303d(new C0792h.C0794b().mo6658S(dVar.mo21671b()).mo6670e0(str).mo6672g0(hVar.f4192g).mo6661V(hVar.f4189e).mo6645F(hVar.f4197q1).mo6659T(hVar.f4177I).mo6644E());
            this.f17133b[i] = f;
        }
    }
}
