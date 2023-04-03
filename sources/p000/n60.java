package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: n60 */
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class n60 implements gf5<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final j20 f15363a = new j20();

    /* renamed from: c */
    public bf5<Bitmap> mo415b(ByteBuffer byteBuffer, int i, int i2, xi4 xi4) throws IOException {
        return this.f15363a.mo415b(ImageDecoder.createSource(byteBuffer), i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo414a(ByteBuffer byteBuffer, xi4 xi4) throws IOException {
        return true;
    }
}
