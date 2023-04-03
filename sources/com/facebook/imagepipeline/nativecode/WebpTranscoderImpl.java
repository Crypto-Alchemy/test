package com.facebook.imagepipeline.nativecode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ii1
public class WebpTranscoderImpl implements hk7 {
    @ii1
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    @ii1
    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;

    /* renamed from: a */
    public void mo13382a(InputStream inputStream, OutputStream outputStream) throws IOException {
        l96.m21339a();
        nativeTranscodeWebpToPng((InputStream) au4.m10792g(inputStream), (OutputStream) au4.m10792g(outputStream));
    }

    /* renamed from: b */
    public boolean mo13383b(rq2 rq2) {
        if (rq2 == r81.f17202f) {
            return true;
        }
        if (rq2 == r81.f17203g || rq2 == r81.f17204h || rq2 == r81.f17205i) {
            return fk7.f11900c;
        }
        if (rq2 == r81.f17206j) {
            return false;
        }
        throw new IllegalArgumentException("Image format is not a WebP.");
    }

    /* renamed from: c */
    public void mo13384c(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        l96.m21339a();
        nativeTranscodeWebpToJpeg((InputStream) au4.m10792g(inputStream), (OutputStream) au4.m10792g(outputStream), i);
    }
}
