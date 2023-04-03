package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: qt2 */
public class qt2 extends fh3 {

    /* renamed from: e */
    public int f44236e;

    /* renamed from: g */
    public int f44237g;

    /* renamed from: k */
    public boolean f44238k = false;

    /* renamed from: r */
    public boolean f44239r = true;

    public qt2(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f44236e = inputStream.read();
        int read = inputStream.read();
        this.f44237g = read;
        if (read >= 0) {
            mo65516c();
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public final boolean mo65516c() {
        if (!this.f44238k && this.f44239r && this.f44236e == 0 && this.f44237g == 0) {
            this.f44238k = true;
            mo51672b(true);
        }
        return this.f44238k;
    }

    /* renamed from: d */
    public void mo65517d(boolean z) {
        this.f44239r = z;
        mo65516c();
    }

    public int read() throws IOException {
        if (mo65516c()) {
            return -1;
        }
        int read = this.f37795a.read();
        if (read >= 0) {
            int i = this.f44236e;
            this.f44236e = this.f44237g;
            this.f44237g = read;
            return i;
        }
        throw new EOFException();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f44239r || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f44238k) {
            return -1;
        }
        int read = this.f37795a.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f44236e;
            bArr[i + 1] = (byte) this.f44237g;
            this.f44236e = this.f37795a.read();
            int read2 = this.f37795a.read();
            this.f44237g = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
