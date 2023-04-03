package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: dv1 */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class dv1 implements ImageHeaderParser {
    /* renamed from: a */
    public int mo12389a(InputStream inputStream, C2982oq oqVar) throws IOException {
        int f = new cv1(inputStream).mo18309f("Orientation", 1);
        if (f == 0) {
            return -1;
        }
        return f;
    }

    /* renamed from: b */
    public ImageHeaderParser.ImageType mo12390b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public ImageHeaderParser.ImageType mo12391c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: d */
    public int mo12392d(ByteBuffer byteBuffer, C2982oq oqVar) throws IOException {
        return mo12389a(s60.m26659g(byteBuffer), oqVar);
    }
}
