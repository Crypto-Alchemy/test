package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C1797a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: m60 */
/* compiled from: ByteBufferBitmapDecoder */
public class m60 implements gf5<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C1797a f14838a;

    public m60(C1797a aVar) {
        this.f14838a = aVar;
    }

    /* renamed from: c */
    public bf5<Bitmap> mo415b(ByteBuffer byteBuffer, int i, int i2, xi4 xi4) throws IOException {
        return this.f14838a.mo12620g(byteBuffer, i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo414a(ByteBuffer byteBuffer, xi4 xi4) {
        return this.f14838a.mo12624q(byteBuffer);
    }
}
