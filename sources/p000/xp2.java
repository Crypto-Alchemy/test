package p000;

import androidx.media3.common.C0792h;
import p000.iy6;
import p000.zs6;

/* renamed from: xp2 */
/* compiled from: Id3Reader */
public final class xp2 implements yn1 {

    /* renamed from: a */
    public final gm4 f19949a = new gm4(10);

    /* renamed from: b */
    public zs6 f19950b;

    /* renamed from: c */
    public boolean f19951c;

    /* renamed from: d */
    public long f19952d = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: e */
    public int f19953e;

    /* renamed from: f */
    public int f19954f;

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        C2725kr.m20989i(this.f19950b);
        if (this.f19951c) {
            int a = gm4.mo20676a();
            int i = this.f19954f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(gm4.mo20679d(), gm4.mo20680e(), this.f19949a.mo20679d(), this.f19954f, min);
                if (this.f19954f + min == 10) {
                    this.f19949a.mo20674P(0);
                    if (73 == this.f19949a.mo20662D() && 68 == this.f19949a.mo20662D() && 51 == this.f19949a.mo20662D()) {
                        this.f19949a.mo20675Q(3);
                        this.f19953e = this.f19949a.mo20661C() + 10;
                    } else {
                        gk3.m18132i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f19951c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f19953e - this.f19954f);
            this.f19950b.mo7300a(gm4, min2);
            this.f19954f += min2;
        }
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f19951c = false;
        this.f19952d = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        zs6 f = jy1.mo7713f(dVar.mo21672c(), 5);
        this.f19950b = f;
        f.mo7303d(new C0792h.C0794b().mo6658S(dVar.mo21671b()).mo6670e0("application/id3").mo6644E());
    }

    /* renamed from: e */
    public void mo18801e() {
        int i;
        C2725kr.m20989i(this.f19950b);
        if (this.f19951c && (i = this.f19953e) != 0 && this.f19954f == i) {
            long j = this.f19952d;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                this.f19950b.mo7301b(j, 1, i, 0, (zs6.C3758a) null);
            }
            this.f19951c = false;
        }
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if ((i & 4) != 0) {
            this.f19951c = true;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                this.f19952d = j;
            }
            this.f19953e = 0;
            this.f19954f = 0;
        }
    }
}
