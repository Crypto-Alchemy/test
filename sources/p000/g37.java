package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* renamed from: g37 */
/* compiled from: UTF8Writer */
public final class g37 extends Writer {

    /* renamed from: a */
    public final po2 f12166a;

    /* renamed from: d */
    public OutputStream f12167d;

    /* renamed from: e */
    public byte[] f12168e;

    /* renamed from: g */
    public final int f12169g;

    /* renamed from: k */
    public int f12170k = 0;

    /* renamed from: r */
    public int f12171r;

    public g37(po2 po2, OutputStream outputStream) {
        this.f12166a = po2;
        this.f12167d = outputStream;
        byte[] j = po2.mo24740j();
        this.f12168e = j;
        this.f12169g = j.length - 4;
    }

    /* renamed from: b */
    public static void m17582b(int i) throws IOException {
        throw new IOException(m17583c(i));
    }

    /* renamed from: c */
    public static String m17583c(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        } else if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
    }

    /* renamed from: a */
    public int mo20337a(int i) throws IOException {
        int i2 = this.f12171r;
        this.f12171r = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    public void close() throws IOException {
        OutputStream outputStream = this.f12167d;
        if (outputStream != null) {
            int i = this.f12170k;
            if (i > 0) {
                outputStream.write(this.f12168e, 0, i);
                this.f12170k = 0;
            }
            OutputStream outputStream2 = this.f12167d;
            this.f12167d = null;
            byte[] bArr = this.f12168e;
            if (bArr != null) {
                this.f12168e = null;
                this.f12166a.mo24750t(bArr);
            }
            outputStream2.close();
            int i2 = this.f12171r;
            this.f12171r = 0;
            if (i2 > 0) {
                m17582b(i2);
            }
        }
    }

    public void flush() throws IOException {
        OutputStream outputStream = this.f12167d;
        if (outputStream != null) {
            int i = this.f12170k;
            if (i > 0) {
                outputStream.write(this.f12168e, 0, i);
                this.f12170k = 0;
            }
            this.f12167d.flush();
        }
    }

    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    public Writer append(char c) throws IOException {
        write((int) c);
        return this;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 >= 2) {
            if (this.f12171r > 0) {
                i2--;
                write(mo20337a(cArr[i]));
                i++;
            }
            int i3 = this.f12170k;
            byte[] bArr = this.f12168e;
            int i4 = this.f12169g;
            int i5 = i2 + r9;
            while (r9 < i5) {
                if (i3 >= i4) {
                    this.f12167d.write(bArr, 0, i3);
                    i3 = 0;
                }
                int i6 = r9 + 1;
                char c = cArr[r9];
                if (c < 128) {
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) c;
                    int i8 = i5 - i6;
                    int i9 = i4 - i7;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    int i10 = i8 + i6;
                    while (true) {
                        r9 = i6;
                        i3 = i7;
                        if (r9 >= i10) {
                            continue;
                            break;
                        }
                        i6 = r9 + 1;
                        c = cArr[r9];
                        if (c >= 128) {
                            break;
                        }
                        i7 = i3 + 1;
                        bArr[i3] = (byte) c;
                    }
                }
                if (c < 2048) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i11 + 1;
                    bArr[i11] = (byte) ((c & '?') | 128);
                    r9 = i6;
                } else if (c < 55296 || c > 57343) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 12) | 224);
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (((c >> 6) & 63) | 128);
                    bArr[i13] = (byte) ((c & '?') | 128);
                    r9 = i6;
                    i3 = i13 + 1;
                } else {
                    if (c > 56319) {
                        this.f12170k = i3;
                        m17582b(c);
                    }
                    this.f12171r = c;
                    if (i6 >= i5) {
                        break;
                    }
                    r9 = i6 + 1;
                    int a = mo20337a(cArr[i6]);
                    if (a > 1114111) {
                        this.f12170k = i3;
                        m17582b(a);
                    }
                    int i14 = i3 + 1;
                    bArr[i3] = (byte) ((a >> 18) | 240);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((a >> 12) & 63) | 128);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((a >> 6) & 63) | 128);
                    i3 = i16 + 1;
                    bArr[i16] = (byte) ((a & 63) | 128);
                }
            }
            this.f12170k = i3;
        } else if (i2 == 1) {
            write((int) cArr[i]);
        }
    }

    public void write(int i) throws IOException {
        int i2;
        if (this.f12171r > 0) {
            i = mo20337a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                m17582b(i);
            }
            this.f12171r = i;
            return;
        }
        int i3 = this.f12170k;
        if (i3 >= this.f12169g) {
            this.f12167d.write(this.f12168e, 0, i3);
            this.f12170k = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f12168e;
            int i4 = this.f12170k;
            this.f12170k = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f12170k;
        if (i < 2048) {
            byte[] bArr2 = this.f12168e;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i6 + 1;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.f12168e;
            int i7 = i5 + 1;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i8 = i7 + 1;
            bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i8] = (byte) ((i & 63) | 128);
            i2 = i8 + 1;
        } else {
            if (i > 1114111) {
                m17582b(i);
            }
            byte[] bArr4 = this.f12168e;
            int i9 = i5 + 1;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            int i10 = i9 + 1;
            bArr4[i9] = (byte) (((i >> 12) & 63) | 128);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i >> 6) & 63) | 128);
            i2 = i11 + 1;
            bArr4[i11] = (byte) ((i & 63) | 128);
        }
        this.f12170k = i2;
    }

    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    public void write(String str, int i, int i2) throws IOException {
        if (i2 >= 2) {
            if (this.f12171r > 0) {
                i2--;
                write(mo20337a(str.charAt(i)));
                i++;
            }
            int i3 = this.f12170k;
            byte[] bArr = this.f12168e;
            int i4 = this.f12169g;
            int i5 = i2 + r9;
            while (r9 < i5) {
                if (i3 >= i4) {
                    this.f12167d.write(bArr, 0, i3);
                    i3 = 0;
                }
                int i6 = r9 + 1;
                char charAt = str.charAt(r9);
                if (charAt < 128) {
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    int i8 = i5 - i6;
                    int i9 = i4 - i7;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    int i10 = i8 + i6;
                    while (true) {
                        r9 = i6;
                        i3 = i7;
                        if (r9 >= i10) {
                            continue;
                            break;
                        }
                        i6 = r9 + 1;
                        charAt = str.charAt(r9);
                        if (charAt >= 128) {
                            break;
                        }
                        i7 = i3 + 1;
                        bArr[i3] = (byte) charAt;
                    }
                }
                if (charAt < 2048) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    i3 = i11 + 1;
                    bArr[i11] = (byte) ((charAt & '?') | 128);
                    r9 = i6;
                } else if (charAt < 55296 || charAt > 57343) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 12) | 224);
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i13] = (byte) ((charAt & '?') | 128);
                    r9 = i6;
                    i3 = i13 + 1;
                } else {
                    if (charAt > 56319) {
                        this.f12170k = i3;
                        m17582b(charAt);
                    }
                    this.f12171r = charAt;
                    if (i6 >= i5) {
                        break;
                    }
                    r9 = i6 + 1;
                    int a = mo20337a(str.charAt(i6));
                    if (a > 1114111) {
                        this.f12170k = i3;
                        m17582b(a);
                    }
                    int i14 = i3 + 1;
                    bArr[i3] = (byte) ((a >> 18) | 240);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((a >> 12) & 63) | 128);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((a >> 6) & 63) | 128);
                    i3 = i16 + 1;
                    bArr[i16] = (byte) ((a & 63) | 128);
                }
            }
            this.f12170k = i3;
        } else if (i2 == 1) {
            write((int) str.charAt(i));
        }
    }
}
