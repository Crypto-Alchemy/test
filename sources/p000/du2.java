package p000;

import androidx.media3.common.C0792h;
import java.io.IOException;
import p000.qe0;

/* renamed from: du2 */
/* compiled from: InitializationChunk */
public final class du2 extends pe0 {

    /* renamed from: j */
    public final qe0 f10872j;

    /* renamed from: k */
    public qe0.C3139b f10873k;

    /* renamed from: l */
    public long f10874l;

    /* renamed from: m */
    public volatile boolean f10875m;

    public du2(x11 x11, d21 d21, C0792h hVar, int i, Object obj, qe0 qe0) {
        super(x11, d21, 2, hVar, i, obj, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        this.f10872j = qe0;
    }

    /* renamed from: a */
    public void mo7723a() throws IOException {
        a81 a81;
        if (this.f10874l == 0) {
            this.f10872j.mo18526c(this.f10873k, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }
        try {
            d21 e = this.f16393b.mo18400e(this.f10874l);
            n96 n96 = this.f16400i;
            a81 = new a81(n96, e.f10443g, n96.mo6964b(e));
            do {
                if (this.f10875m || !this.f10872j.mo18525b(a81)) {
                    break;
                }
                break;
                break;
            } while (!this.f10872j.mo18525b(a81));
            break;
            this.f10874l = a81.getPosition() - this.f16393b.f10443g;
            b21.m11033a(this.f16400i);
        } catch (Throwable th) {
            b21.m11033a(this.f16400i);
            throw th;
        }
    }

    /* renamed from: c */
    public void mo7724c() {
        this.f10875m = true;
    }

    /* renamed from: f */
    public void mo18944f(qe0.C3139b bVar) {
        this.f10873k = bVar;
    }
}
