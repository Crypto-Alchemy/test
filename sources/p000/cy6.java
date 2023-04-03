package p000;

import java.io.IOException;
import p000.zs6;

/* renamed from: cy6 */
/* compiled from: TrueHdSampleRechunker */
public final class cy6 {

    /* renamed from: a */
    public final byte[] f10407a = new byte[10];

    /* renamed from: b */
    public boolean f10408b;

    /* renamed from: c */
    public int f10409c;

    /* renamed from: d */
    public long f10410d;

    /* renamed from: e */
    public int f10411e;

    /* renamed from: f */
    public int f10412f;

    /* renamed from: g */
    public int f10413g;

    /* renamed from: a */
    public void mo18379a(zs6 zs6, zs6.C3758a aVar) {
        if (this.f10409c > 0) {
            zs6.mo7301b(this.f10410d, this.f10411e, this.f10412f, this.f10413g, aVar);
            this.f10409c = 0;
        }
    }

    /* renamed from: b */
    public void mo18380b() {
        this.f10408b = false;
        this.f10409c = 0;
    }

    /* renamed from: c */
    public void mo18381c(zs6 zs6, long j, int i, int i2, int i3, zs6.C3758a aVar) {
        boolean z;
        if (this.f10413g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20988h(z, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f10408b) {
            int i4 = this.f10409c;
            int i5 = i4 + 1;
            this.f10409c = i5;
            if (i4 == 0) {
                this.f10410d = j;
                this.f10411e = i;
                this.f10412f = 0;
            }
            this.f10412f += i2;
            this.f10413g = i3;
            if (i5 >= 16) {
                mo18379a(zs6, aVar);
            }
        }
    }

    /* renamed from: d */
    public void mo18382d(iy1 iy1) throws IOException {
        if (!this.f10408b) {
            iy1.mo94n(this.f10407a, 0, 10);
            iy1.mo85e();
            if (C3182r7.m26087i(this.f10407a) != 0) {
                this.f10408b = true;
            }
        }
    }
}
