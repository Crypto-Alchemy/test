package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nl6 */
/* compiled from: TailAppendingInputStream */
public class nl6 extends FilterInputStream {

    /* renamed from: a */
    public final byte[] f15610a;

    /* renamed from: d */
    public int f15611d;

    /* renamed from: e */
    public int f15612e;

    public nl6(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f15610a = bArr;
    }

    /* renamed from: a */
    public final int mo23730a() {
        int i = this.f15611d;
        byte[] bArr = this.f15610a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f15611d = i + 1;
        return bArr[i] & 255;
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f15612e = this.f15611d;
        }
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        return mo23730a();
    }

    public void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f15611d = this.f15612e;
            return;
        }
        throw new IOException("mark is not supported");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a = mo23730a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
