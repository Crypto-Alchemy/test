package p000;

import com.bumptech.glide.load.C1725a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* renamed from: oa6 */
/* compiled from: StreamGifDecoder */
public class oa6 implements gf5<InputStream, jg2> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f15834a;

    /* renamed from: b */
    public final gf5<ByteBuffer, jg2> f15835b;

    /* renamed from: c */
    public final C2982oq f15836c;

    public oa6(List<ImageHeaderParser> list, gf5<ByteBuffer, jg2> gf5, C2982oq oqVar) {
        this.f15834a = list;
        this.f15835b = gf5;
        this.f15836c = oqVar;
    }

    /* renamed from: e */
    public static byte[] m23733e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public bf5<jg2> mo415b(InputStream inputStream, int i, int i2, xi4 xi4) throws IOException {
        byte[] e = m23733e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f15835b.mo415b(ByteBuffer.wrap(e), i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo414a(InputStream inputStream, xi4 xi4) throws IOException {
        if (((Boolean) xi4.mo27760c(tg2.f18151b)).booleanValue() || C1725a.m12273f(this.f15834a, inputStream, this.f15836c) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }
}
