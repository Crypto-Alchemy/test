package p000;

import androidx.media3.common.C0792h;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.nio.ByteBuffer;

/* renamed from: ca0 */
/* compiled from: CameraMotionRenderer */
public final class ca0 extends C2580iz {

    /* renamed from: I */
    public final DecoderInputBuffer f8375I = new DecoderInputBuffer(1);

    /* renamed from: L */
    public final gm4 f8376L = new gm4();

    /* renamed from: M */
    public long f8377M;

    /* renamed from: P */
    public ba0 f8378P;

    /* renamed from: Q */
    public long f8379Q;

    public ca0() {
        super(6);
    }

    /* renamed from: G */
    public void mo7133G() {
        mo12025R();
    }

    /* renamed from: I */
    public void mo7135I(long j, boolean z) {
        this.f8379Q = Long.MIN_VALUE;
        mo12025R();
    }

    /* renamed from: M */
    public void mo7425M(C0792h[] hVarArr, long j, long j2) {
        this.f8377M = j2;
    }

    /* renamed from: Q */
    public final float[] mo12024Q(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f8376L.mo20672N(byteBuffer.array(), byteBuffer.limit());
        this.f8376L.mo20674P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f8376L.mo20692q());
        }
        return fArr;
    }

    /* renamed from: R */
    public final void mo12025R() {
        ba0 ba0 = this.f8378P;
        if (ba0 != null) {
            ba0.mo11461b();
        }
    }

    /* renamed from: a */
    public int mo7438a(C0792h hVar) {
        if ("application/x-camera-motion".equals(hVar.f4175C)) {
            return nd5.m23113a(4);
        }
        return nd5.m23113a(0);
    }

    /* renamed from: e */
    public boolean mo7149e() {
        return mo21687i();
    }

    /* renamed from: g */
    public boolean mo7150g() {
        return true;
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    /* renamed from: k */
    public void mo7154k(int i, Object obj) throws ExoPlaybackException {
        if (i == 8) {
            this.f8378P = (ba0) obj;
        } else {
            super.mo7154k(i, obj);
        }
    }

    /* renamed from: u */
    public void mo7468u(long j, long j2) {
        while (!mo21687i() && this.f8379Q < 100000 + j) {
            this.f8375I.mo6968h();
            if (mo21680N(mo21675B(), this.f8375I, 0) == -4 && !this.f8375I.mo23893p()) {
                DecoderInputBuffer decoderInputBuffer = this.f8375I;
                this.f8379Q = decoderInputBuffer.f4594k;
                if (this.f8378P != null && !decoderInputBuffer.mo23892o()) {
                    this.f8375I.mo6971x();
                    float[] Q = mo12024Q((ByteBuffer) w67.m29360j(this.f8375I.f4592e));
                    if (Q != null) {
                        ((ba0) w67.m29360j(this.f8378P)).mo11460a(this.f8379Q - this.f8377M, Q);
                    }
                }
            } else {
                return;
            }
        }
    }
}
