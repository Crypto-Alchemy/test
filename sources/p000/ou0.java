package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ou0 */
/* compiled from: CountingOutputStream */
public class ou0 extends FilterOutputStream {

    /* renamed from: a */
    public long f16077a = 0;

    public ou0(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public long mo24116a() {
        return this.f16077a;
    }

    public void close() throws IOException {
        this.out.close();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f16077a += (long) i2;
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        this.f16077a++;
    }
}
