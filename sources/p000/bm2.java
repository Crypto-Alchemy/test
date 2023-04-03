package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bm2 */
public class bm2 implements mp1 {

    /* renamed from: a */
    public final byte[] f36904a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    public final byte[] f36905b = new byte[128];

    public bm2() {
        mo50658g();
    }

    /* renamed from: f */
    public static boolean m56070f(char c) {
        return c == 10 || c == 13 || c == 9 || c == ' ';
    }

    /* renamed from: a */
    public int mo50653a(int i) {
        return i * 2;
    }

    /* renamed from: b */
    public int mo50654b(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(36, i3);
            outputStream.write(bArr2, 0, mo50657e(bArr, i, min, bArr2, 0));
            i += min;
            i3 -= min;
        }
        return i2 * 2;
    }

    /* renamed from: c */
    public int mo50655c(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && m56070f(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length && m56070f(str.charAt(i))) {
                i++;
            }
            int i4 = i + 1;
            byte b = this.f36905b[str.charAt(i)];
            while (i4 < length && m56070f(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = this.f36905b[str.charAt(i4)];
            if ((b | b2) >= 0) {
                int i6 = i2 + 1;
                bArr[i2] = (byte) ((b << 4) | b2);
                if (i6 == 36) {
                    outputStream.write(bArr);
                    i2 = 0;
                } else {
                    i2 = i6;
                }
                i3++;
                i = i5;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        if (i2 > 0) {
            outputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    /* renamed from: d */
    public byte[] mo50656d(String str, int i, int i2) throws IOException {
        if (str == null) {
            throw new NullPointerException("'str' cannot be null");
        } else if (i < 0 || i2 < 0 || i > str.length() - i2) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        } else if ((i2 & 1) == 0) {
            int i3 = i2 >>> 1;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i + 1;
                int i6 = i5 + 1;
                byte b = (this.f36905b[str.charAt(i)] << 4) | this.f36905b[str.charAt(i5)];
                if (b >= 0) {
                    bArr[i4] = (byte) b;
                    i4++;
                    i = i6;
                } else {
                    throw new IOException("invalid characters encountered in Hex string");
                }
            }
            return bArr;
        } else {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
    }

    /* renamed from: e */
    public int mo50657e(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i4 = i2 + i;
        int i5 = i3;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i] & 255;
            int i7 = i5 + 1;
            byte[] bArr3 = this.f36904a;
            bArr2[i5] = bArr3[b >>> 4];
            i5 = i7 + 1;
            bArr2[i7] = bArr3[b & 15];
            i = i6;
        }
        return i5 - i3;
    }

    /* renamed from: g */
    public void mo50658g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f36905b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f36904a;
            if (i < bArr2.length) {
                this.f36905b[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.f36905b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }
}
