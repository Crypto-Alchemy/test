package p000;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: b37 */
/* compiled from: UTF32Reader */
public class b37 extends Reader {

    /* renamed from: A */
    public final boolean f7925A;

    /* renamed from: B */
    public char[] f7926B;

    /* renamed from: a */
    public final po2 f7927a;

    /* renamed from: d */
    public InputStream f7928d;

    /* renamed from: e */
    public byte[] f7929e;

    /* renamed from: g */
    public int f7930g;

    /* renamed from: k */
    public int f7931k;

    /* renamed from: r */
    public final boolean f7932r;

    /* renamed from: s */
    public char f7933s = 0;

    /* renamed from: x */
    public int f7934x;

    /* renamed from: y */
    public int f7935y;

    public b37(po2 po2, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this.f7927a = po2;
        this.f7928d = inputStream;
        this.f7929e = bArr;
        this.f7930g = i;
        this.f7931k = i2;
        this.f7932r = z;
        this.f7925A = inputStream != null ? true : z2;
    }

    /* renamed from: a */
    public final void mo11341a() {
        byte[] bArr = this.f7929e;
        if (bArr != null) {
            this.f7929e = null;
            po2 po2 = this.f7927a;
            if (po2 != null) {
                po2.mo24748r(bArr);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo11342b(int i) throws IOException {
        byte[] bArr;
        InputStream inputStream = this.f7928d;
        if (inputStream == null || (bArr = this.f7929e) == null) {
            return false;
        }
        this.f7935y += this.f7931k - i;
        if (i > 0) {
            int i2 = this.f7930g;
            if (i2 > 0) {
                System.arraycopy(bArr, i2, bArr, 0, i);
                this.f7930g = 0;
            }
            this.f7931k = i;
        } else {
            this.f7930g = 0;
            int read = inputStream.read(bArr);
            if (read < 1) {
                this.f7931k = 0;
                if (read < 0) {
                    if (this.f7925A) {
                        mo11341a();
                    }
                    return false;
                }
                mo11346e();
            }
            this.f7931k = read;
        }
        while (true) {
            int i3 = this.f7931k;
            if (i3 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f7928d;
            byte[] bArr2 = this.f7929e;
            int read2 = inputStream2.read(bArr2, i3, bArr2.length - i3);
            if (read2 < 1) {
                if (read2 < 0) {
                    if (this.f7925A) {
                        mo11341a();
                    }
                    mo11347f(this.f7931k, 4);
                }
                mo11346e();
            }
            this.f7931k += read2;
        }
    }

    /* renamed from: c */
    public final void mo11343c(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)}));
    }

    public void close() throws IOException {
        InputStream inputStream = this.f7928d;
        if (inputStream != null) {
            this.f7928d = null;
            mo11341a();
            inputStream.close();
        }
    }

    /* renamed from: d */
    public final void mo11345d(int i, int i2, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(this.f7934x + i2);
        sb.append(", byte #");
        sb.append((this.f7935y + this.f7930g) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    /* renamed from: e */
    public final void mo11346e() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    /* renamed from: f */
    public final void mo11347f(int i, int i2) throws IOException {
        int i3 = this.f7934x;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i3 + ", byte #" + (this.f7935y + i) + ")");
    }

    public int read() throws IOException {
        if (this.f7926B == null) {
            this.f7926B = new char[1];
        }
        if (read(this.f7926B, 0, 1) < 1) {
            return -1;
        }
        return this.f7926B[0];
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        byte b;
        byte b2;
        if (this.f7929e == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            mo11343c(cArr, i, i2);
        }
        int i4 = i2 + i;
        char c = this.f7933s;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.f7933s = 0;
        } else {
            int i5 = this.f7931k - this.f7930g;
            if (i5 < 4 && !mo11342b(i5)) {
                if (i5 == 0) {
                    return -1;
                }
                mo11347f(this.f7931k - this.f7930g, 4);
            }
            i3 = i;
        }
        int i6 = this.f7931k - 4;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int i7 = this.f7930g;
            if (i7 > i6) {
                break;
            }
            if (this.f7932r) {
                byte[] bArr = this.f7929e;
                b = (bArr[i7] << 8) | (bArr[i7 + 1] & 255);
                b2 = (bArr[i7 + 3] & 255) | ((bArr[i7 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.f7929e;
                byte b3 = (bArr2[i7] & 255) | ((bArr2[i7 + 1] & 255) << 8);
                b = (bArr2[i7 + 3] << 8) | (bArr2[i7 + 2] & 255);
                b2 = b3;
            }
            this.f7930g = i7 + 4;
            if (b != 0) {
                byte b4 = 65535 & b;
                byte b5 = b2 | ((b4 - 1) << 16);
                if (b4 > 16) {
                    mo11345d(b5, i3 - i, String.format(" (above 0x%08x)", new Object[]{1114111}));
                }
                int i8 = i3 + 1;
                cArr[i3] = (char) ((b5 >> 10) + 55296);
                byte b6 = 56320 | (b5 & 1023);
                if (i8 >= i4) {
                    this.f7933s = (char) b5;
                    i3 = i8;
                    break;
                }
                b2 = b6;
                i3 = i8;
            }
            cArr[i3] = (char) b2;
            i3++;
        }
        int i9 = i3 - i;
        this.f7934x += i9;
        return i9;
    }
}
