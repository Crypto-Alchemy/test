package com.facebook.imagepipeline.nativecode;

@ii1
public class NativeJpegTranscoderFactory implements zr2 {

    /* renamed from: a */
    public final int f9641a;

    /* renamed from: b */
    public final boolean f9642b;

    /* renamed from: c */
    public final boolean f9643c;

    @ii1
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f9641a = i;
        this.f9642b = z;
        this.f9643c = z2;
    }

    @ii1
    public yr2 createImageTranscoder(rq2 rq2, boolean z) {
        if (rq2 != r81.f17197a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f9641a, this.f9642b, this.f9643c);
    }
}
