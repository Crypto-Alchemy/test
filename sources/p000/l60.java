package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: l60 */
/* compiled from: ByteBufferBackedOutputStream */
public class l60 extends OutputStream {

    /* renamed from: a */
    public final ByteBuffer f14422a;

    public l60(ByteBuffer byteBuffer) {
        this.f14422a = byteBuffer;
    }

    public void write(int i) throws IOException {
        this.f14422a.put((byte) i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f14422a.put(bArr, i, i2);
    }
}
