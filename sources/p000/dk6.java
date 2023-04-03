package p000;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.C0941c;
import androidx.media3.exoplayer.mediacodec.C0947f;

/* renamed from: dk6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class dk6 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C0947f f10755a;

    /* renamed from: b */
    public final /* synthetic */ C0941c.C0944c f10756b;

    public /* synthetic */ dk6(C0947f fVar, C0941c.C0944c cVar) {
        this.f10755a = fVar;
        this.f10756b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f10755a.m6937q(this.f10756b, mediaCodec, j, j2);
    }
}
