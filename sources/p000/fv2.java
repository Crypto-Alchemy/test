package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fv2 */
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class fv2 implements gf5<InputStream, Bitmap> {

    /* renamed from: a */
    public final j20 f12086a = new j20();

    /* renamed from: c */
    public bf5<Bitmap> mo415b(InputStream inputStream, int i, int i2, xi4 xi4) throws IOException {
        return this.f12086a.mo415b(ImageDecoder.createSource(s60.m26654b(inputStream)), i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo414a(InputStream inputStream, xi4 xi4) throws IOException {
        return true;
    }
}
