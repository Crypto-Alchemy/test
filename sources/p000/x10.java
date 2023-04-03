package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: x10 */
/* compiled from: BitmapBytesTranscoder */
public class x10 implements sf5<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f19272a;

    /* renamed from: b */
    public final int f19273b;

    public x10() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public bf5<byte[]> mo18396a(bf5<Bitmap> bf5, xi4 xi4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bf5.get().compress(this.f19272a, this.f19273b, byteArrayOutputStream);
        bf5.mo11634a();
        return new j70(byteArrayOutputStream.toByteArray());
    }

    public x10(Bitmap.CompressFormat compressFormat, int i) {
        this.f19272a = compressFormat;
        this.f19273b = i;
    }
}
