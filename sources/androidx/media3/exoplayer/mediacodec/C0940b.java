package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.C0937a;
import androidx.media3.exoplayer.mediacodec.C0941c;
import androidx.media3.exoplayer.mediacodec.C0947f;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.mediacodec.b */
/* compiled from: DefaultMediaCodecAdapterFactory */
public final class C0940b implements C0941c.C0943b {

    /* renamed from: a */
    public int f5116a = 0;

    /* renamed from: b */
    public boolean f5117b;

    /* renamed from: a */
    public C0941c mo7502a(C0941c.C0942a aVar) throws IOException {
        int i;
        int i2 = w67.f19021a;
        if (i2 < 23 || ((i = this.f5116a) != 1 && (i != 0 || i2 < 31))) {
            return new C0947f.C0949b().mo7502a(aVar);
        }
        int i3 = vv3.m29135i(aVar.f5120c.f4175C);
        gk3.m18129f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + w67.m29359i0(i3));
        return new C0937a.C0939b(i3, this.f5117b).mo7502a(aVar);
    }
}
