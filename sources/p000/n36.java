package p000;

import androidx.media3.common.C0792h;
import java.io.IOException;
import p000.zs6;

/* renamed from: n36 */
/* compiled from: SingleSampleMediaChunk */
public final class n36 extends C3515vy {

    /* renamed from: o */
    public final int f15326o;

    /* renamed from: p */
    public final C0792h f15327p;

    /* renamed from: q */
    public long f15328q;

    /* renamed from: r */
    public boolean f15329r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n36(x11 x11, d21 d21, C0792h hVar, int i, Object obj, long j, long j2, long j3, int i2, C0792h hVar2) {
        super(x11, d21, hVar, i, obj, j, j2, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, j3);
        this.f15326o = i2;
        this.f15327p = hVar2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo7723a() throws IOException {
        C3648xy i = mo27375i();
        i.mo27892b(0);
        zs6 f = i.mo25075f(0, this.f15326o);
        f.mo7303d(this.f15327p);
        try {
            long b = this.f16400i.mo6964b(this.f16393b.mo18400e(this.f15328q));
            if (b != -1) {
                b += this.f15328q;
            }
            a81 a81 = new a81(this.f16400i, this.f15328q, b);
            for (int i2 = 0; i2 != -1; i2 = f.mo7304e(a81, Integer.MAX_VALUE, true)) {
                this.f15328q += (long) i2;
            }
            f.mo7301b(this.f16398g, 1, (int) this.f15328q, 0, (zs6.C3758a) null);
            b21.m11033a(this.f16400i);
            this.f15329r = true;
        } catch (Throwable th) {
            b21.m11033a(this.f16400i);
            throw th;
        }
    }

    /* renamed from: c */
    public void mo7724c() {
    }

    /* renamed from: g */
    public boolean mo23490g() {
        return this.f15329r;
    }
}
