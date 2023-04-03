package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: k60 */
/* compiled from: ByteBufferBackedInputStream */
public class k60 extends InputStream {

    /* renamed from: a */
    public final ByteBuffer f13979a;

    public k60(ByteBuffer byteBuffer) {
        this.f13979a = byteBuffer;
    }

    public int available() {
        return this.f13979a.remaining();
    }

    public int read() throws IOException {
        if (this.f13979a.hasRemaining()) {
            return this.f13979a.get() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f13979a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.f13979a.remaining());
        this.f13979a.get(bArr, i, min);
        return min;
    }
}
