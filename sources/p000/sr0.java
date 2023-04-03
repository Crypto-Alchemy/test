package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: sr0 */
/* compiled from: ContentLengthInputStream */
public final class sr0 extends FilterInputStream {

    /* renamed from: a */
    public final long f17779a;

    /* renamed from: d */
    public int f17780d;

    public sr0(InputStream inputStream, long j) {
        super(inputStream);
        this.f17779a = j;
    }

    /* renamed from: b */
    public static InputStream m27081b(InputStream inputStream, long j) {
        return new sr0(inputStream, j);
    }

    /* renamed from: a */
    public final int mo25938a(int i) throws IOException {
        if (i >= 0) {
            this.f17780d += i;
        } else if (this.f17779a - ((long) this.f17780d) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f17779a + ", but read: " + this.f17780d);
        }
        return i;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f17779a - ((long) this.f17780d), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        mo25938a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return mo25938a(super.read(bArr, i, i2));
    }
}
