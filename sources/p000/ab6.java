package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: ab6 */
/* compiled from: StrictLineReader */
public class ab6 implements Closeable {

    /* renamed from: a */
    public final InputStream f20887a;

    /* renamed from: d */
    public final Charset f20888d;

    /* renamed from: e */
    public byte[] f20889e;

    /* renamed from: g */
    public int f20890g;

    /* renamed from: k */
    public int f20891k;

    /* renamed from: ab6$a */
    /* compiled from: StrictLineReader */
    public class C3806a extends ByteArrayOutputStream {
        public C3806a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, ab6.this.f20888d.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public ab6(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void mo28907b() throws IOException {
        InputStream inputStream = this.f20887a;
        byte[] bArr = this.f20889e;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f20890g = 0;
            this.f20891k = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public String mo28908c() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f20887a) {
            if (this.f20889e != null) {
                if (this.f20890g >= this.f20891k) {
                    mo28907b();
                }
                for (int i3 = this.f20890g; i3 != this.f20891k; i3++) {
                    byte[] bArr2 = this.f20889e;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f20890g;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f20888d.name());
                                this.f20890g = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f20888d.name());
                        this.f20890g = i3 + 1;
                        return str2;
                    }
                }
                C3806a aVar = new C3806a((this.f20891k - this.f20890g) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f20889e;
                    int i5 = this.f20890g;
                    aVar.write(bArr3, i5, this.f20891k - i5);
                    this.f20891k = -1;
                    mo28907b();
                    i = this.f20890g;
                    while (true) {
                        if (i != this.f20891k) {
                            bArr = this.f20889e;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f20890g;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f20890g = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f20887a) {
            if (this.f20889e != null) {
                this.f20889e = null;
                this.f20887a.close();
            }
        }
    }

    public ab6(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(s67.f33754a)) {
            this.f20887a = inputStream;
            this.f20888d = charset;
            this.f20889e = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
