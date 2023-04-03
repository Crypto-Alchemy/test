package p000;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.C0937a;
import androidx.media3.exoplayer.mediacodec.C0941c;

/* renamed from: as */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1578as implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C0937a f7729a;

    /* renamed from: b */
    public final /* synthetic */ C0941c.C0944c f7730b;

    public /* synthetic */ C1578as(C0937a aVar, C0941c.C0944c cVar) {
        this.f7729a = aVar;
        this.f7730b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f7729a.m6862x(this.f7730b, mediaCodec, j, j2);
    }
}
