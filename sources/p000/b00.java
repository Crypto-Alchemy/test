package p000;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* renamed from: b00 */
/* compiled from: BatchBuffer */
public final class b00 extends DecoderInputBuffer {

    /* renamed from: A */
    public int f7913A;

    /* renamed from: B */
    public int f7914B = 32;

    /* renamed from: y */
    public long f7915y;

    public b00() {
        super(2);
    }

    /* renamed from: C */
    public boolean mo11325C(DecoderInputBuffer decoderInputBuffer) {
        C2725kr.m20981a(!decoderInputBuffer.mo6972y());
        C2725kr.m20981a(!decoderInputBuffer.mo23891m());
        C2725kr.m20981a(!decoderInputBuffer.mo23893p());
        if (!mo11326D(decoderInputBuffer)) {
            return false;
        }
        int i = this.f7913A;
        this.f7913A = i + 1;
        if (i == 0) {
            this.f4594k = decoderInputBuffer.f4594k;
            if (decoderInputBuffer.mo23895t()) {
                mo23896u(1);
            }
        }
        if (decoderInputBuffer.mo23892o()) {
            mo23896u(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f4592e;
        if (byteBuffer != null) {
            mo6970w(byteBuffer.remaining());
            this.f4592e.put(byteBuffer);
        }
        this.f7915y = decoderInputBuffer.f4594k;
        return true;
    }

    /* renamed from: D */
    public final boolean mo11326D(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!mo11330H()) {
            return true;
        }
        if (this.f7913A >= this.f7914B || decoderInputBuffer.mo23892o() != mo23892o()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f4592e;
        if (byteBuffer2 == null || (byteBuffer = this.f4592e) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public long mo11327E() {
        return this.f4594k;
    }

    /* renamed from: F */
    public long mo11328F() {
        return this.f7915y;
    }

    /* renamed from: G */
    public int mo11329G() {
        return this.f7913A;
    }

    /* renamed from: H */
    public boolean mo11330H() {
        if (this.f7913A > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public void mo11331I(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        this.f7914B = i;
    }

    /* renamed from: h */
    public void mo6968h() {
        super.mo6968h();
        this.f7913A = 0;
    }
}
