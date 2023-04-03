package p000;

import p000.iy6;

/* renamed from: wr5 */
/* compiled from: SectionReader */
public final class wr5 implements iy6 {

    /* renamed from: a */
    public final vr5 f19224a;

    /* renamed from: b */
    public final gm4 f19225b = new gm4(32);

    /* renamed from: c */
    public int f19226c;

    /* renamed from: d */
    public int f19227d;

    /* renamed from: e */
    public boolean f19228e;

    /* renamed from: f */
    public boolean f19229f;

    public wr5(vr5 vr5) {
        this.f19224a = vr5;
    }

    /* renamed from: a */
    public void mo21665a(gm4 gm4, int i) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = gm4.mo20680e() + gm4.mo20662D();
        } else {
            i2 = -1;
        }
        if (this.f19229f) {
            if (z) {
                this.f19229f = false;
                gm4.mo20674P(i2);
                this.f19227d = 0;
            } else {
                return;
            }
        }
        while (gm4.mo20676a() > 0) {
            int i3 = this.f19227d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int D = gm4.mo20662D();
                    gm4.mo20674P(gm4.mo20680e() - 1);
                    if (D == 255) {
                        this.f19229f = true;
                        return;
                    }
                }
                int min = Math.min(gm4.mo20676a(), 3 - this.f19227d);
                gm4.mo20685j(this.f19225b.mo20679d(), this.f19227d, min);
                int i4 = this.f19227d + min;
                this.f19227d = i4;
                if (i4 == 3) {
                    this.f19225b.mo20674P(0);
                    this.f19225b.mo20673O(3);
                    this.f19225b.mo20675Q(1);
                    int D2 = this.f19225b.mo20662D();
                    int D3 = this.f19225b.mo20662D();
                    if ((D2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f19228e = z2;
                    this.f19226c = (((D2 & 15) << 8) | D3) + 3;
                    int b = this.f19225b.mo20677b();
                    int i5 = this.f19226c;
                    if (b < i5) {
                        this.f19225b.mo20678c(Math.min(4098, Math.max(i5, this.f19225b.mo20677b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(gm4.mo20676a(), this.f19226c - this.f19227d);
                gm4.mo20685j(this.f19225b.mo20679d(), this.f19227d, min2);
                int i6 = this.f19227d + min2;
                this.f19227d = i6;
                int i7 = this.f19226c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f19228e) {
                        this.f19225b.mo20673O(i7);
                    } else if (w67.m29378s(this.f19225b.mo20679d(), 0, this.f19226c, -1) != 0) {
                        this.f19229f = true;
                        return;
                    } else {
                        this.f19225b.mo20673O(this.f19226c - 4);
                    }
                    this.f19225b.mo20674P(0);
                    this.f19224a.mo21424a(this.f19225b);
                    this.f19227d = 0;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo21666b(sq6 sq6, jy1 jy1, iy6.C2579d dVar) {
        this.f19224a.mo21425b(sq6, jy1, dVar);
        this.f19229f = true;
    }

    /* renamed from: c */
    public void mo21667c() {
        this.f19229f = true;
    }
}
