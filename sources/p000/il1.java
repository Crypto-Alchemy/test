package p000;

import androidx.media3.common.C0792h;
import java.util.Collections;
import java.util.List;
import p000.iy6;
import p000.zs6;

/* renamed from: il1 */
/* compiled from: DvbSubtitleReader */
public final class il1 implements yn1 {

    /* renamed from: a */
    public final List<iy6.C2576a> f13308a;

    /* renamed from: b */
    public final zs6[] f13309b;

    /* renamed from: c */
    public boolean f13310c;

    /* renamed from: d */
    public int f13311d;

    /* renamed from: e */
    public int f13312e;

    /* renamed from: f */
    public long f13313f = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    public il1(List<iy6.C2576a> list) {
        this.f13308a = list;
        this.f13309b = new zs6[list.size()];
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        if (!this.f13310c) {
            return;
        }
        if (this.f13311d != 2 || mo21568b(gm4, 32)) {
            if (this.f13311d != 1 || mo21568b(gm4, 0)) {
                int e = gm4.mo20680e();
                int a = gm4.mo20676a();
                for (zs6 a2 : this.f13309b) {
                    gm4.mo20674P(e);
                    a2.mo7300a(gm4, a);
                }
                this.f13312e += a;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo21568b(gm4 gm4, int i) {
        if (gm4.mo20676a() == 0) {
            return false;
        }
        if (gm4.mo20662D() != i) {
            this.f13310c = false;
        }
        this.f13311d--;
        return this.f13310c;
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f13310c = false;
        this.f13313f = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        for (int i = 0; i < this.f13309b.length; i++) {
            iy6.C2576a aVar = this.f13308a.get(i);
            dVar.mo21670a();
            zs6 f = jy1.mo7713f(dVar.mo21672c(), 3);
            f.mo7303d(new C0792h.C0794b().mo6658S(dVar.mo21671b()).mo6670e0("application/dvbsubs").mo6659T(Collections.singletonList(aVar.f13446c)).mo6661V(aVar.f13444a).mo6644E());
            this.f13309b[i] = f;
        }
    }

    /* renamed from: e */
    public void mo18801e() {
        if (this.f13310c) {
            if (this.f13313f != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                for (zs6 b : this.f13309b) {
                    b.mo7301b(this.f13313f, 1, this.f13312e, 0, (zs6.C3758a) null);
                }
            }
            this.f13310c = false;
        }
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if ((i & 4) != 0) {
            this.f13310c = true;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                this.f13313f = j;
            }
            this.f13312e = 0;
            this.f13311d = 2;
        }
    }
}
