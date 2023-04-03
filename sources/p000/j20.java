package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* renamed from: j20 */
/* compiled from: BitmapImageDecoderResourceDecoder */
public final class j20 implements gf5<ImageDecoder.Source, Bitmap> {

    /* renamed from: a */
    public final t20 f13478a = new u20();

    /* renamed from: c */
    public bf5<Bitmap> mo415b(ImageDecoder.Source source, int i, int i2, xi4 xi4) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new i91(i, i2, xi4));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(decodeBitmap.getWidth());
            sb.append("x");
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
        }
        return new y20(decodeBitmap, this.f13478a);
    }

    /* renamed from: d */
    public boolean mo414a(ImageDecoder.Source source, xi4 xi4) throws IOException {
        return true;
    }
}
