package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: tx */
public class C9371tx implements mp1 {

    /* renamed from: a */
    public final byte[] f44825a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    public byte f44826b = 61;

    /* renamed from: c */
    public final byte[] f44827c = new byte[128];

    public C9371tx() {
        mo66137g();
    }

    /* renamed from: a */
    public int mo50653a(int i) {
        return ((i + 2) / 3) * 4;
    }

    /* renamed from: b */
    public int mo50654b(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(54, i3);
            outputStream.write(bArr2, 0, mo66135e(bArr, i, min, bArr2, 0));
            i += min;
            i3 -= min;
        }
        return ((i2 + 2) / 3) * 4;
    }

    /* renamed from: c */
    public int mo50655c(String str, OutputStream outputStream) throws IOException {
        String str2 = str;
        OutputStream outputStream2 = outputStream;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && mo66136f(str2.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i2 = 0;
        while (i > 0 && i2 != 4) {
            if (!mo66136f(str2.charAt(i - 1))) {
                i2++;
            }
            i--;
        }
        int h = mo66138h(str2, 0, i);
        int i3 = 0;
        int i4 = 0;
        while (h < i) {
            int i5 = h + 1;
            byte b = this.f44827c[str2.charAt(h)];
            int h2 = mo66138h(str2, i5, i);
            int i6 = h2 + 1;
            byte b2 = this.f44827c[str2.charAt(h2)];
            int h3 = mo66138h(str2, i6, i);
            int i7 = h3 + 1;
            byte b3 = this.f44827c[str2.charAt(h3)];
            int h4 = mo66138h(str2, i7, i);
            int i8 = h4 + 1;
            byte b4 = this.f44827c[str2.charAt(h4)];
            if ((b | b2 | b3 | b4) >= 0) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((b << 2) | (b2 >> 4));
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((b2 << 4) | (b3 >> 2));
                i3 = i10 + 1;
                bArr[i10] = (byte) ((b3 << 6) | b4);
                i4 += 3;
                if (i3 == 54) {
                    outputStream2.write(bArr);
                    i3 = 0;
                }
                h = mo66138h(str2, i8, i);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        if (i3 > 0) {
            outputStream2.write(bArr, 0, i3);
        }
        int h5 = mo66138h(str2, h, length);
        int h6 = mo66138h(str2, h5 + 1, length);
        int h7 = mo66138h(str2, h6 + 1, length);
        return i4 + mo66134d(outputStream, str2.charAt(h5), str2.charAt(h6), str2.charAt(h7), str2.charAt(mo66138h(str2, h7 + 1, length)));
    }

    /* renamed from: d */
    public final int mo66134d(OutputStream outputStream, char c, char c2, char c3, char c4) throws IOException {
        byte b = this.f44826b;
        if (c3 == b) {
            if (c4 == b) {
                byte[] bArr = this.f44827c;
                byte b2 = bArr[c];
                byte b3 = bArr[c2];
                if ((b2 | b3) >= 0) {
                    outputStream.write((b2 << 2) | (b3 >> 4));
                    return 1;
                }
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else if (c4 == b) {
            byte[] bArr2 = this.f44827c;
            byte b4 = bArr2[c];
            byte b5 = bArr2[c2];
            byte b6 = bArr2[c3];
            if ((b4 | b5 | b6) >= 0) {
                outputStream.write((b4 << 2) | (b5 >> 4));
                outputStream.write((b5 << 4) | (b6 >> 2));
                return 2;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else {
            byte[] bArr3 = this.f44827c;
            byte b7 = bArr3[c];
            byte b8 = bArr3[c2];
            byte b9 = bArr3[c3];
            byte b10 = bArr3[c4];
            if ((b7 | b8 | b9 | b10) >= 0) {
                outputStream.write((b7 << 2) | (b8 >> 4));
                outputStream.write((b8 << 4) | (b9 >> 2));
                outputStream.write((b9 << 6) | b10);
                return 3;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        }
    }

    /* renamed from: e */
    public int mo66135e(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i4 = (i + i2) - 2;
        int i5 = i;
        int i6 = i3;
        while (i5 < i4) {
            int i7 = i5 + 1;
            byte b = bArr[i5];
            int i8 = i7 + 1;
            byte b2 = bArr[i7] & 255;
            int i9 = i8 + 1;
            byte b3 = bArr[i8] & 255;
            int i10 = i6 + 1;
            byte[] bArr3 = this.f44825a;
            bArr2[i6] = bArr3[(b >>> 2) & 63];
            int i11 = i10 + 1;
            bArr2[i10] = bArr3[((b << 4) | (b2 >>> 4)) & 63];
            int i12 = i11 + 1;
            bArr2[i11] = bArr3[((b2 << 2) | (b3 >>> 6)) & 63];
            i6 = i12 + 1;
            bArr2[i12] = bArr3[b3 & 63];
            i5 = i9;
        }
        int i13 = i2 - (i5 - i);
        if (i13 == 1) {
            byte b4 = bArr[i5] & 255;
            int i14 = i6 + 1;
            byte[] bArr4 = this.f44825a;
            bArr2[i6] = bArr4[(b4 >>> 2) & 63];
            int i15 = i14 + 1;
            bArr2[i14] = bArr4[(b4 << 4) & 63];
            int i16 = i15 + 1;
            byte b5 = this.f44826b;
            bArr2[i15] = b5;
            i6 = i16 + 1;
            bArr2[i16] = b5;
        } else if (i13 == 2) {
            byte b6 = bArr[i5] & 255;
            byte b7 = bArr[i5 + 1] & 255;
            int i17 = i6 + 1;
            byte[] bArr5 = this.f44825a;
            bArr2[i6] = bArr5[(b6 >>> 2) & 63];
            int i18 = i17 + 1;
            bArr2[i17] = bArr5[((b6 << 4) | (b7 >>> 4)) & 63];
            int i19 = i18 + 1;
            bArr2[i18] = bArr5[(b7 << 2) & 63];
            i6 = i19 + 1;
            bArr2[i19] = this.f44826b;
        }
        return i6 - i3;
    }

    /* renamed from: f */
    public final boolean mo66136f(char c) {
        return c == 10 || c == 13 || c == 9 || c == ' ';
    }

    /* renamed from: g */
    public void mo66137g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f44827c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f44825a;
            if (i < bArr2.length) {
                this.f44827c[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final int mo66138h(String str, int i, int i2) {
        while (i < i2 && mo66136f(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
