package p000;

import androidx.media3.common.C0792h;

/* renamed from: qq3 */
/* compiled from: MediaChunk */
public abstract class qq3 extends pe0 {

    /* renamed from: j */
    public final long f17016j;

    public qq3(x11 x11, d21 d21, C0792h hVar, int i, Object obj, long j, long j2, long j3) {
        super(x11, d21, 1, hVar, i, obj, j, j2);
        C2725kr.m20985e(hVar);
        this.f17016j = j3;
    }

    /* renamed from: f */
    public long mo24759f() {
        long j = this.f17016j;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    /* renamed from: g */
    public abstract boolean mo23490g();
}
