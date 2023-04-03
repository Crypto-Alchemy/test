package p000;

import androidx.media3.common.C0792h;

/* renamed from: vy */
/* compiled from: BaseMediaChunk */
public abstract class C3515vy extends qq3 {

    /* renamed from: k */
    public final long f18926k;

    /* renamed from: l */
    public final long f18927l;

    /* renamed from: m */
    public C3648xy f18928m;

    /* renamed from: n */
    public int[] f18929n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3515vy(x11 x11, d21 d21, C0792h hVar, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(x11, d21, hVar, i, obj, j, j2, j5);
        this.f18926k = j3;
        this.f18927l = j4;
    }

    /* renamed from: h */
    public final int mo27374h(int i) {
        return ((int[]) C2725kr.m20989i(this.f18929n))[i];
    }

    /* renamed from: i */
    public final C3648xy mo27375i() {
        return (C3648xy) C2725kr.m20989i(this.f18928m);
    }

    /* renamed from: j */
    public void mo27376j(C3648xy xyVar) {
        this.f18928m = xyVar;
        this.f18929n = xyVar.mo27891a();
    }
}
