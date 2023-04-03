package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c49 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class c49 extends FilterInputStream {

    /* renamed from: a */
    public long f21601a;

    /* renamed from: d */
    public long f21602d = -1;

    public c49(InputStream inputStream, long j) {
        super(inputStream);
        inputStream.getClass();
        this.f21601a = 1048577;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f21601a);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f21602d = this.f21601a;
    }

    public final int read() throws IOException {
        if (this.f21601a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f21601a--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f21602d != -1) {
            this.in.reset();
            this.f21601a = this.f21602d;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f21601a));
        this.f21601a -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f21601a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f21601a -= (long) read;
        }
        return read;
    }
}
