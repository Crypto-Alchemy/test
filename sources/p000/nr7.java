package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: nr7 */
public final class nr7 extends InputStream {

    /* renamed from: a */
    public final InputStream f32173a;

    /* renamed from: d */
    public long f32174d;

    public nr7(InputStream inputStream, long j) {
        this.f32173a = inputStream;
        this.f32174d = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f32173a.close();
        this.f32174d = 0;
    }

    public final int read() throws IOException {
        long j = this.f32174d;
        if (j <= 0) {
            return -1;
        }
        this.f32174d = j - 1;
        return this.f32173a.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f32174d;
        if (j <= 0) {
            return -1;
        }
        int read = this.f32173a.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f32174d -= (long) read;
        }
        return read;
    }
}
