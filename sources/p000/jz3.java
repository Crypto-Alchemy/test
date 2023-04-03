package p000;

import androidx.media3.common.C0792h;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.iy6;
import p000.kz3;
import p000.zs6;

/* renamed from: jz3 */
/* compiled from: MpegAudioReader */
public final class jz3 implements yn1 {

    /* renamed from: a */
    public final gm4 f13943a;

    /* renamed from: b */
    public final kz3.C2735a f13944b;

    /* renamed from: c */
    public final String f13945c;

    /* renamed from: d */
    public zs6 f13946d;

    /* renamed from: e */
    public String f13947e;

    /* renamed from: f */
    public int f13948f;

    /* renamed from: g */
    public int f13949g;

    /* renamed from: h */
    public boolean f13950h;

    /* renamed from: i */
    public boolean f13951i;

    /* renamed from: j */
    public long f13952j;

    /* renamed from: k */
    public int f13953k;

    /* renamed from: l */
    public long f13954l;

    public jz3() {
        this((String) null);
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        C2725kr.m20989i(this.f13946d);
        while (gm4.mo20676a() > 0) {
            int i = this.f13948f;
            if (i == 0) {
                mo22142b(gm4);
            } else if (i == 1) {
                mo22144h(gm4);
            } else if (i == 2) {
                mo22143g(gm4);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: b */
    public final void mo22142b(gm4 gm4) {
        boolean z;
        boolean z2;
        byte[] d = gm4.mo20679d();
        int f = gm4.mo20681f();
        for (int e = gm4.mo20680e(); e < f; e++) {
            byte b = d[e];
            if ((b & 255) == 255) {
                z = true;
            } else {
                z = false;
            }
            if (!this.f13951i || (b & 224) != 224) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f13951i = z;
            if (z2) {
                gm4.mo20674P(e + 1);
                this.f13951i = false;
                this.f13943a.mo20679d()[1] = d[e];
                this.f13949g = 2;
                this.f13948f = 1;
                return;
            }
        }
        gm4.mo20674P(f);
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f13948f = 0;
        this.f13949g = 0;
        this.f13951i = false;
        this.f13954l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f13947e = dVar.mo21671b();
        this.f13946d = jy1.mo7713f(dVar.mo21672c(), 1);
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f13954l = j;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void mo22143g(gm4 gm4) {
        int min = Math.min(gm4.mo20676a(), this.f13953k - this.f13949g);
        this.f13946d.mo7300a(gm4, min);
        int i = this.f13949g + min;
        this.f13949g = i;
        int i2 = this.f13953k;
        if (i >= i2) {
            long j = this.f13954l;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                this.f13946d.mo7301b(j, 1, i2, 0, (zs6.C3758a) null);
                this.f13954l += this.f13952j;
            }
            this.f13949g = 0;
            this.f13948f = 0;
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: h */
    public final void mo22144h(gm4 gm4) {
        int min = Math.min(gm4.mo20676a(), 4 - this.f13949g);
        gm4.mo20685j(this.f13943a.mo20679d(), this.f13949g, min);
        int i = this.f13949g + min;
        this.f13949g = i;
        if (i >= 4) {
            this.f13943a.mo20674P(0);
            if (!this.f13944b.mo22612a(this.f13943a.mo20689n())) {
                this.f13949g = 0;
                this.f13948f = 1;
                return;
            }
            kz3.C2735a aVar = this.f13944b;
            this.f13953k = aVar.f14389c;
            if (!this.f13950h) {
                this.f13952j = (((long) aVar.f14393g) * 1000000) / ((long) aVar.f14390d);
                this.f13946d.mo7303d(new C0792h.C0794b().mo6658S(this.f13947e).mo6670e0(this.f13944b.f14388b).mo6662W(4096).mo6647H(this.f13944b.f14391e).mo6671f0(this.f13944b.f14390d).mo6661V(this.f13945c).mo6644E());
                this.f13950h = true;
            }
            this.f13943a.mo20674P(0);
            this.f13946d.mo7300a(this.f13943a, 4);
            this.f13948f = 2;
        }
    }

    public jz3(String str) {
        this.f13948f = 0;
        gm4 gm4 = new gm4(4);
        this.f13943a = gm4;
        gm4.mo20679d()[0] = -1;
        this.f13944b = new kz3.C2735a();
        this.f13954l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f13945c = str;
    }
}
