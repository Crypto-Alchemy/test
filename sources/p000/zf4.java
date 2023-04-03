package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: zf4 */
/* compiled from: OggPacket */
public final class zf4 {

    /* renamed from: a */
    public final ag4 f20531a = new ag4();

    /* renamed from: b */
    public final gm4 f20532b = new gm4(new byte[65025], 0);

    /* renamed from: c */
    public int f20533c = -1;

    /* renamed from: d */
    public int f20534d;

    /* renamed from: e */
    public boolean f20535e;

    /* renamed from: a */
    public final int mo28422a(int i) {
        int i2;
        int i3 = 0;
        this.f20534d = 0;
        do {
            int i4 = this.f20534d;
            int i5 = i + i4;
            ag4 ag4 = this.f20531a;
            if (i5 >= ag4.f134g) {
                break;
            }
            int[] iArr = ag4.f137j;
            this.f20534d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public ag4 mo28423b() {
        return this.f20531a;
    }

    /* renamed from: c */
    public gm4 mo28424c() {
        return this.f20532b;
    }

    /* renamed from: d */
    public boolean mo28425d(iy1 iy1) throws IOException {
        boolean z;
        boolean z2;
        int i;
        if (iy1 != null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (this.f20535e) {
            this.f20535e = false;
            this.f20532b.mo20670L(0);
        }
        while (!this.f20535e) {
            if (this.f20533c < 0) {
                if (!this.f20531a.mo306c(iy1) || !this.f20531a.mo304a(iy1, true)) {
                    return false;
                }
                ag4 ag4 = this.f20531a;
                int i2 = ag4.f135h;
                if ((ag4.f129b & 1) == 1 && this.f20532b.mo20681f() == 0) {
                    i2 += mo28422a(0);
                    i = this.f20534d + 0;
                } else {
                    i = 0;
                }
                if (!ky1.m21103e(iy1, i2)) {
                    return false;
                }
                this.f20533c = i;
            }
            int a = mo28422a(this.f20533c);
            int i3 = this.f20533c + this.f20534d;
            if (a > 0) {
                gm4 gm4 = this.f20532b;
                gm4.mo20678c(gm4.mo20681f() + a);
                if (!ky1.m21102d(iy1, this.f20532b.mo20679d(), this.f20532b.mo20681f(), a)) {
                    return false;
                }
                gm4 gm42 = this.f20532b;
                gm42.mo20673O(gm42.mo20681f() + a);
                if (this.f20531a.f137j[i3 - 1] != 255) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f20535e = z2;
            }
            if (i3 == this.f20531a.f134g) {
                i3 = -1;
            }
            this.f20533c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void mo28426e() {
        this.f20531a.mo305b();
        this.f20532b.mo20670L(0);
        this.f20533c = -1;
        this.f20535e = false;
    }

    /* renamed from: f */
    public void mo28427f() {
        if (this.f20532b.mo20679d().length != 65025) {
            gm4 gm4 = this.f20532b;
            gm4.mo20672N(Arrays.copyOf(gm4.mo20679d(), Math.max(65025, this.f20532b.mo20681f())), this.f20532b.mo20681f());
        }
    }
}
