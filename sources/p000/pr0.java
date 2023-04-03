package p000;

import androidx.media3.common.C0792h;
import java.io.IOException;
import p000.qe0;

/* renamed from: pr0 */
/* compiled from: ContainerMediaChunk */
public class pr0 extends C3515vy {

    /* renamed from: o */
    public final int f16610o;

    /* renamed from: p */
    public final long f16611p;

    /* renamed from: q */
    public final qe0 f16612q;

    /* renamed from: r */
    public long f16613r;

    /* renamed from: s */
    public volatile boolean f16614s;

    /* renamed from: t */
    public boolean f16615t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pr0(x11 x11, d21 d21, C0792h hVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, qe0 qe0) {
        super(x11, d21, hVar, i, obj, j, j2, j3, j4, j5);
        this.f16610o = i2;
        this.f16611p = j6;
        this.f16612q = qe0;
    }

    /* renamed from: a */
    public final void mo7723a() throws IOException {
        a81 a81;
        long j;
        long j2;
        if (this.f16613r == 0) {
            C3648xy i = mo27375i();
            i.mo27892b(this.f16611p);
            qe0 qe0 = this.f16612q;
            qe0.C3139b k = mo24760k(i);
            long j3 = this.f18926k;
            if (j3 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                j = -9223372036854775807L;
            } else {
                j = j3 - this.f16611p;
            }
            long j4 = this.f18927l;
            if (j4 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                j2 = -9223372036854775807L;
            } else {
                j2 = j4 - this.f16611p;
            }
            qe0.mo18526c(k, j, j2);
        }
        try {
            d21 e = this.f16393b.mo18400e(this.f16613r);
            n96 n96 = this.f16400i;
            a81 = new a81(n96, e.f10443g, n96.mo6964b(e));
            do {
                if (this.f16614s || !this.f16612q.mo18525b(a81)) {
                    break;
                }
                break;
                break;
            } while (!this.f16612q.mo18525b(a81));
            break;
            this.f16613r = a81.getPosition() - this.f16393b.f10443g;
            b21.m11033a(this.f16400i);
            this.f16615t = !this.f16614s;
        } catch (Throwable th) {
            b21.m11033a(this.f16400i);
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo7724c() {
        this.f16614s = true;
    }

    /* renamed from: f */
    public long mo24759f() {
        return this.f17016j + ((long) this.f16610o);
    }

    /* renamed from: g */
    public boolean mo23490g() {
        return this.f16615t;
    }

    /* renamed from: k */
    public qe0.C3139b mo24760k(C3648xy xyVar) {
        return xyVar;
    }
}
