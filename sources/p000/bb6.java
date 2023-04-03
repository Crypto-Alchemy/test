package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: bb6 */
/* compiled from: StrictLineReader */
public class bb6 implements Closeable {

    /* renamed from: a */
    public final InputStream f8036a;

    /* renamed from: d */
    public final Charset f8037d;

    /* renamed from: e */
    public byte[] f8038e;

    /* renamed from: g */
    public int f8039g;

    /* renamed from: k */
    public int f8040k;

    /* renamed from: bb6$a */
    /* compiled from: StrictLineReader */
    public class C1619a extends ByteArrayOutputStream {
        public C1619a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, bb6.this.f8037d.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public bb6(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void mo11470b() throws IOException {
        InputStream inputStream = this.f8036a;
        byte[] bArr = this.f8038e;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f8039g = 0;
            this.f8040k = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean mo11471c() {
        if (this.f8040k == -1) {
            return true;
        }
        return false;
    }

    public void close() throws IOException {
        synchronized (this.f8036a) {
            if (this.f8038e != null) {
                this.f8038e = null;
                this.f8036a.close();
            }
        }
    }

    /* renamed from: d */
    public String mo11473d() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f8036a) {
            if (this.f8038e != null) {
                if (this.f8039g >= this.f8040k) {
                    mo11470b();
                }
                for (int i3 = this.f8039g; i3 != this.f8040k; i3++) {
                    byte[] bArr2 = this.f8038e;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f8039g;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f8037d.name());
                                this.f8039g = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f8037d.name());
                        this.f8039g = i3 + 1;
                        return str2;
                    }
                }
                C1619a aVar = new C1619a((this.f8040k - this.f8039g) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f8038e;
                    int i5 = this.f8039g;
                    aVar.write(bArr3, i5, this.f8040k - i5);
                    this.f8040k = -1;
                    mo11470b();
                    i = this.f8039g;
                    while (true) {
                        if (i != this.f8040k) {
                            bArr = this.f8038e;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f8039g;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f8039g = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public bb6(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(o67.f15824a)) {
            this.f8036a = inputStream;
            this.f8037d = charset;
            this.f8038e = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
