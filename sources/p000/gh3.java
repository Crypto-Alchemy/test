package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: gh3 */
/* compiled from: LimitedInputStream */
public class gh3 extends FilterInputStream {

    /* renamed from: a */
    public int f12321a;

    /* renamed from: d */
    public int f12322d;

    public gh3(InputStream inputStream, int i) {
        super(inputStream);
        inputStream.getClass();
        if (i >= 0) {
            this.f12321a = i;
            this.f12322d = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    public int available() throws IOException {
        return Math.min(this.in.available(), this.f12321a);
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f12322d = this.f12321a;
        }
    }

    public int read() throws IOException {
        if (this.f12321a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f12321a--;
        }
        return read;
    }

    public void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f12322d != -1) {
            this.in.reset();
            this.f12321a = this.f12322d;
        } else {
            throw new IOException("mark not set");
        }
    }

    public long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, (long) this.f12321a));
        this.f12321a = (int) (((long) this.f12321a) - skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f12321a;
        if (i3 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f12321a -= read;
        }
        return read;
    }
}
