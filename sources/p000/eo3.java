package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: eo3 */
/* compiled from: MarkEnforcingInputStream */
public class eo3 extends FilterInputStream {

    /* renamed from: a */
    public int f11298a = Integer.MIN_VALUE;

    public eo3(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final long mo19438a(long j) {
        int i = this.f11298a;
        if (i == 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE || j <= ((long) i)) {
            return j;
        }
        return (long) i;
    }

    public int available() throws IOException {
        int i = this.f11298a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    /* renamed from: b */
    public final void mo19440b(long j) {
        int i = this.f11298a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f11298a = (int) (((long) i) - j);
        }
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f11298a = i;
    }

    public int read() throws IOException {
        if (mo19438a(1) == -1) {
            return -1;
        }
        int read = super.read();
        mo19440b(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f11298a = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long a = mo19438a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        mo19440b(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) mo19438a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        mo19440b((long) read);
        return read;
    }
}
