package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a21 */
/* compiled from: DataSourceInputStream */
public final class a21 extends InputStream {

    /* renamed from: a */
    public final x11 f22a;

    /* renamed from: d */
    public final d21 f23d;

    /* renamed from: e */
    public final byte[] f24e;

    /* renamed from: g */
    public boolean f25g = false;

    /* renamed from: k */
    public boolean f26k = false;

    /* renamed from: r */
    public long f27r;

    public a21(x11 x11, d21 d21) {
        this.f22a = x11;
        this.f23d = d21;
        this.f24e = new byte[1];
    }

    /* renamed from: a */
    public final void mo12a() throws IOException {
        if (!this.f25g) {
            this.f22a.mo6964b(this.f23d);
            this.f25g = true;
        }
    }

    /* renamed from: b */
    public void mo13b() throws IOException {
        mo12a();
    }

    public void close() throws IOException {
        if (!this.f26k) {
            this.f22a.close();
            this.f26k = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f24e) == -1) {
            return -1;
        }
        return this.f24e[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C2725kr.m20987g(!this.f26k);
        mo12a();
        int read = this.f22a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f27r += (long) read;
        return read;
    }
}
