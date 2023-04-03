package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p009io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: vn7 */
/* compiled from: WriterBasedJsonGenerator */
public class vn7 extends u43 {

    /* renamed from: o1 */
    public static final char[] f18858o1 = ud0.m28144d();

    /* renamed from: U */
    public final Writer f18859U;

    /* renamed from: X */
    public char f18860X;

    /* renamed from: Y */
    public char[] f18861Y;

    /* renamed from: Z */
    public int f18862Z;

    /* renamed from: b1 */
    public qw5 f18863b1;

    /* renamed from: e0 */
    public int f18864e0;

    /* renamed from: e1 */
    public char[] f18865e1;

    /* renamed from: k0 */
    public int f18866k0;

    /* renamed from: v0 */
    public char[] f18867v0;

    public vn7(po2 po2, int i, xe4 xe4, Writer writer, char c) {
        super(po2, i, xe4);
        this.f18859U = writer;
        char[] e = po2.mo24735e();
        this.f18861Y = e;
        this.f18866k0 = e.length;
        this.f18860X = c;
        if (c != '\"') {
            this.f18380C = ud0.m28146f(c);
        }
    }

    /* renamed from: A0 */
    public void mo13833A0(qw5 qw5) throws IOException {
        int appendUnquoted = qw5.appendUnquoted(this.f18861Y, this.f18864e0);
        if (appendUnquoted < 0) {
            mo13834B0(qw5.getValue());
        } else {
            this.f18864e0 += appendUnquoted;
        }
    }

    /* renamed from: A1 */
    public final int mo27239A1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int x1;
        int i2 = this.f18866k0 - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i5 > i4) {
                i6 = mo27269x1(inputStream, bArr, i5, i6, i);
                if (i6 < 3) {
                    i5 = 0;
                    break;
                }
                i4 = i6 - 3;
                i5 = 0;
            }
            if (this.f18864e0 > i2) {
                mo27266u1();
            }
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            i5 = i8 + 1;
            i -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i7] & 255) | (bArr[i5] << 8)) << 8) | (bArr[i8] & 255), this.f18861Y, this.f18864e0);
            this.f18864e0 = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.f18861Y;
                int i9 = encodeBase64Chunk + 1;
                cArr[encodeBase64Chunk] = '\\';
                this.f18864e0 = i9 + 1;
                cArr[i9] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0 || (x1 = mo27269x1(inputStream, bArr, i5, i6, i)) <= 0) {
            return i;
        }
        if (this.f18864e0 > i2) {
            mo27266u1();
        }
        int i10 = bArr[0] << 16;
        if (1 < x1) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.f18864e0 = base64Variant.encodeBase64Partial(i10, i3, this.f18861Y, this.f18864e0);
        return i - i3;
    }

    /* renamed from: B0 */
    public void mo13834B0(String str) throws IOException {
        int length = str.length();
        int i = this.f18866k0 - this.f18864e0;
        if (i == 0) {
            mo27266u1();
            i = this.f18866k0 - this.f18864e0;
        }
        if (i >= length) {
            str.getChars(0, length, this.f18861Y, this.f18864e0);
            this.f18864e0 += length;
            return;
        }
        mo27263Y1(str);
    }

    /* renamed from: B1 */
    public final void mo27240B1(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 - 3;
        int i4 = this.f18866k0 - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this.f18864e0 > i4) {
                mo27266u1();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f18861Y, this.f18864e0);
            this.f18864e0 = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.f18861Y;
                int i8 = encodeBase64Chunk + 1;
                cArr[encodeBase64Chunk] = '\\';
                this.f18864e0 = i8 + 1;
                cArr[i8] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i7;
        }
        int i9 = i2 - i;
        if (i9 > 0) {
            if (this.f18864e0 > i4) {
                mo27266u1();
            }
            int i10 = i + 1;
            int i11 = bArr[i] << 16;
            if (i9 == 2) {
                i11 |= (bArr[i10] & 255) << 8;
            }
            this.f18864e0 = base64Variant.encodeBase64Partial(i11, i9, this.f18861Y, this.f18864e0);
        }
    }

    /* renamed from: C0 */
    public void mo13836C0(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 32) {
            if (i2 > this.f18866k0 - this.f18864e0) {
                mo27266u1();
            }
            System.arraycopy(cArr, i, this.f18861Y, this.f18864e0, i2);
            this.f18864e0 += i2;
            return;
        }
        mo27266u1();
        this.f18859U.write(cArr, i, i2);
    }

    /* renamed from: C1 */
    public final void mo27241C1(qw5 qw5, boolean z) throws IOException {
        if (this.f9817a != null) {
            mo27246H1(qw5, z);
            return;
        }
        if (this.f18864e0 + 1 >= this.f18866k0) {
            mo27266u1();
        }
        if (z) {
            char[] cArr = this.f18861Y;
            int i = this.f18864e0;
            this.f18864e0 = i + 1;
            cArr[i] = ',';
        }
        if (this.f18384M) {
            char[] asQuotedChars = qw5.asQuotedChars();
            mo13836C0(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        char[] cArr2 = this.f18861Y;
        int i2 = this.f18864e0;
        int i3 = i2 + 1;
        this.f18864e0 = i3;
        cArr2[i2] = this.f18860X;
        int appendQuoted = qw5.appendQuoted(cArr2, i3);
        if (appendQuoted < 0) {
            mo27243E1(qw5);
            return;
        }
        int i4 = this.f18864e0 + appendQuoted;
        this.f18864e0 = i4;
        if (i4 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr3 = this.f18861Y;
        int i5 = this.f18864e0;
        this.f18864e0 = i5 + 1;
        cArr3[i5] = this.f18860X;
    }

    /* renamed from: D1 */
    public final void mo27242D1(String str, boolean z) throws IOException {
        if (this.f9817a != null) {
            mo27247I1(str, z);
            return;
        }
        if (this.f18864e0 + 1 >= this.f18866k0) {
            mo27266u1();
        }
        if (z) {
            char[] cArr = this.f18861Y;
            int i = this.f18864e0;
            this.f18864e0 = i + 1;
            cArr[i] = ',';
        }
        if (this.f18384M) {
            mo27255Q1(str);
            return;
        }
        char[] cArr2 = this.f18861Y;
        int i2 = this.f18864e0;
        this.f18864e0 = i2 + 1;
        cArr2[i2] = this.f18860X;
        mo27255Q1(str);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr3 = this.f18861Y;
        int i3 = this.f18864e0;
        this.f18864e0 = i3 + 1;
        cArr3[i3] = this.f18860X;
    }

    /* renamed from: E1 */
    public final void mo27243E1(qw5 qw5) throws IOException {
        char[] asQuotedChars = qw5.asQuotedChars();
        mo13836C0(asQuotedChars, 0, asQuotedChars.length);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = this.f18860X;
    }

    /* renamed from: F1 */
    public final void mo27244F1(String str) throws IOException {
        mo27266u1();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.f18866k0;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.f18861Y, 0);
            if (this.f18382I != null) {
                mo27254P1(i2);
            } else {
                int i4 = this.f18381H;
                if (i4 != 0) {
                    mo27253O1(i2, i4);
                } else {
                    mo27252N1(i2);
                }
            }
            if (i3 < length) {
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: G0 */
    public void mo13840G0() throws IOException {
        mo18747l1("start an array");
        this.f10689x = this.f10689x.mo24460m();
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartArray(this);
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = '[';
    }

    /* renamed from: G1 */
    public final void mo27245G1() throws IOException {
        if (this.f18864e0 + 4 >= this.f18866k0) {
            mo27266u1();
        }
        int i = this.f18864e0;
        char[] cArr = this.f18861Y;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.f18864e0 = i4 + 1;
    }

    /* renamed from: H1 */
    public final void mo27246H1(qw5 qw5, boolean z) throws IOException {
        if (z) {
            this.f9817a.writeObjectEntrySeparator(this);
        } else {
            this.f9817a.beforeObjectEntries(this);
        }
        char[] asQuotedChars = qw5.asQuotedChars();
        if (this.f18384M) {
            mo13836C0(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = this.f18860X;
        mo13836C0(asQuotedChars, 0, asQuotedChars.length);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i2 = this.f18864e0;
        this.f18864e0 = i2 + 1;
        cArr2[i2] = this.f18860X;
    }

    /* renamed from: I1 */
    public final void mo27247I1(String str, boolean z) throws IOException {
        if (z) {
            this.f9817a.writeObjectEntrySeparator(this);
        } else {
            this.f9817a.beforeObjectEntries(this);
        }
        if (this.f18384M) {
            mo27255Q1(str);
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = this.f18860X;
        mo27255Q1(str);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i2 = this.f18864e0;
        this.f18864e0 = i2 + 1;
        cArr2[i2] = this.f18860X;
    }

    /* renamed from: J */
    public int mo13842J(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        mo18747l1("write a binary value");
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i2 = this.f18864e0;
        this.f18864e0 = i2 + 1;
        cArr[i2] = this.f18860X;
        byte[] d = this.f18379B.mo24734d();
        if (i < 0) {
            try {
                i = mo27271z1(base64Variant, inputStream, d);
            } catch (Throwable th) {
                this.f18379B.mo24745o(d);
                throw th;
            }
        } else {
            int A1 = mo27239A1(base64Variant, inputStream, d, i);
            if (A1 > 0) {
                mo13861a("Too few bytes available: missing " + A1 + " bytes (out of " + i + ")");
            }
        }
        this.f18379B.mo24745o(d);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i3 = this.f18864e0;
        this.f18864e0 = i3 + 1;
        cArr2[i3] = this.f18860X;
        return i;
    }

    /* renamed from: J1 */
    public final void mo27248J1(int i) throws IOException {
        if (this.f18864e0 + 13 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i2 = this.f18864e0;
        int i3 = i2 + 1;
        this.f18864e0 = i3;
        cArr[i2] = this.f18860X;
        int r = lc4.m21390r(i, cArr, i3);
        char[] cArr2 = this.f18861Y;
        this.f18864e0 = r + 1;
        cArr2[r] = this.f18860X;
    }

    /* renamed from: K1 */
    public final void mo27249K1(long j) throws IOException {
        if (this.f18864e0 + 23 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        int i2 = i + 1;
        this.f18864e0 = i2;
        cArr[i] = this.f18860X;
        int t = lc4.m21392t(j, cArr, i2);
        char[] cArr2 = this.f18861Y;
        this.f18864e0 = t + 1;
        cArr2[t] = this.f18860X;
    }

    /* renamed from: L */
    public void mo13844L(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo18747l1("write a binary value");
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i3 = this.f18864e0;
        this.f18864e0 = i3 + 1;
        cArr[i3] = this.f18860X;
        mo27240B1(base64Variant, bArr, i, i2 + i);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i4 = this.f18864e0;
        this.f18864e0 = i4 + 1;
        cArr2[i4] = this.f18860X;
    }

    /* renamed from: L1 */
    public final void mo27250L1(String str) throws IOException {
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = this.f18860X;
        mo13834B0(str);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i2 = this.f18864e0;
        this.f18864e0 = i2 + 1;
        cArr2[i2] = this.f18860X;
    }

    /* renamed from: M1 */
    public final void mo27251M1(short s) throws IOException {
        if (this.f18864e0 + 8 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        int i2 = i + 1;
        this.f18864e0 = i2;
        cArr[i] = this.f18860X;
        int r = lc4.m21390r(s, cArr, i2);
        char[] cArr2 = this.f18861Y;
        this.f18864e0 = r + 1;
        cArr2[r] = this.f18860X;
    }

    /* renamed from: N1 */
    public final void mo27252N1(int i) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this.f18380C;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                cArr = this.f18861Y;
                c = cArr[i2];
                if ((c < length && iArr[c] != 0) || (i2 = i2 + 1) >= i) {
                    int i4 = i2 - i3;
                }
                cArr = this.f18861Y;
                c = cArr[i2];
                break;
            } while ((i2 = i2 + 1) >= i);
            int i42 = i2 - i3;
            if (i42 > 0) {
                this.f18859U.write(cArr, i3, i42);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            i3 = mo27267v1(this.f18861Y, i2, i, c, iArr[c]);
        }
    }

    /* renamed from: O0 */
    public void mo13848O0(Object obj) throws IOException {
        mo18747l1("start an array");
        this.f10689x = this.f10689x.mo24461n(obj);
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartArray(this);
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = '[';
    }

    /* renamed from: O1 */
    public final void mo27253O1(int i, int i2) throws IOException, JsonGenerationException {
        char[] cArr;
        char c;
        int[] iArr = this.f18380C;
        int min = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                cArr = this.f18861Y;
                c = cArr[i3];
                if (c >= min) {
                    if (c > i2) {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this.f18859U.write(cArr, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = mo27267v1(this.f18861Y, i3, i, c, i5);
        }
    }

    /* renamed from: P */
    public void mo13849P(boolean z) throws IOException {
        int i;
        mo18747l1("write a boolean value");
        if (this.f18864e0 + 5 >= this.f18866k0) {
            mo27266u1();
        }
        int i2 = this.f18864e0;
        char[] cArr = this.f18861Y;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.f18864e0 = i + 1;
    }

    /* renamed from: P0 */
    public void mo13850P0(Object obj, int i) throws IOException {
        mo18747l1("start an array");
        this.f10689x = this.f10689x.mo24461n(obj);
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartArray(this);
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i2 = this.f18864e0;
        this.f18864e0 = i2 + 1;
        cArr[i2] = '[';
    }

    /* renamed from: P1 */
    public final void mo27254P1(int i) throws IOException, JsonGenerationException {
        char c;
        int[] iArr = this.f18380C;
        int i2 = this.f18381H;
        if (i2 < 1) {
            i2 = 65535;
        }
        int min = Math.min(iArr.length, i2 + 1);
        CharacterEscapes characterEscapes = this.f18382I;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                c = this.f18861Y[i3];
                if (c >= min) {
                    if (c <= i2) {
                        qw5 escapeSequence = characterEscapes.getEscapeSequence(c);
                        this.f18863b1 = escapeSequence;
                        if (escapeSequence != null) {
                            i5 = -2;
                            break;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this.f18859U.write(this.f18861Y, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = mo27267v1(this.f18861Y, i3, i, c, i5);
        }
    }

    /* renamed from: Q0 */
    public void mo13852Q0() throws IOException {
        mo18747l1("start an object");
        this.f10689x = this.f10689x.mo24462o();
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartObject(this);
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = '{';
    }

    /* renamed from: Q1 */
    public final void mo27255Q1(String str) throws IOException {
        int length = str.length();
        int i = this.f18866k0;
        if (length > i) {
            mo27244F1(str);
            return;
        }
        if (this.f18864e0 + length > i) {
            mo27266u1();
        }
        str.getChars(0, length, this.f18861Y, this.f18864e0);
        if (this.f18382I != null) {
            mo27261W1(length);
            return;
        }
        int i2 = this.f18381H;
        if (i2 != 0) {
            mo27259U1(length, i2);
        } else {
            mo27257S1(length);
        }
    }

    /* renamed from: R1 */
    public final void mo27256R1(char[] cArr, int i, int i2) throws IOException {
        if (this.f18382I != null) {
            mo27262X1(cArr, i, i2);
            return;
        }
        int i3 = this.f18381H;
        if (i3 != 0) {
            mo27260V1(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this.f18380C;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if ((c < length && iArr[c] != 0) || (i5 = i5 + 1) >= i4) {
                    int i6 = i5 - i;
                }
                char c2 = cArr[i5];
                break;
            } while ((i5 = i5 + 1) >= i4);
            int i62 = i5 - i;
            if (i62 < 32) {
                if (this.f18864e0 + i62 > this.f18866k0) {
                    mo27266u1();
                }
                if (i62 > 0) {
                    System.arraycopy(cArr, i, this.f18861Y, this.f18864e0, i62);
                    this.f18864e0 += i62;
                }
            } else {
                mo27266u1();
                this.f18859U.write(cArr, i, i62);
            }
            if (i5 < i4) {
                i = i5 + 1;
                char c3 = cArr[i5];
                mo27265t1(c3, iArr[c3]);
            } else {
                return;
            }
        }
    }

    /* renamed from: S */
    public void mo13853S() throws IOException {
        if (!this.f10689x.mo28327f()) {
            mo13861a("Current context not Array but " + this.f10689x.mo28330j());
        }
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeEndArray(this, this.f10689x.mo28326d());
        } else {
            if (this.f18864e0 >= this.f18866k0) {
                mo27266u1();
            }
            char[] cArr = this.f18861Y;
            int i = this.f18864e0;
            this.f18864e0 = i + 1;
            cArr[i] = ']';
        }
        this.f10689x = this.f10689x.mo24459l();
    }

    /* renamed from: S0 */
    public void mo13854S0(Object obj) throws IOException {
        mo18747l1("start an object");
        this.f10689x = this.f10689x.mo24463p(obj);
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartObject(this);
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = '{';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6.f18861Y;
        r3 = r6.f18864e0;
        r6.f18864e0 = r3 + 1;
        r2 = r2[r3];
        mo27268w1(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6.f18862Z;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6.f18859U.write(r2, r4, r3);
     */
    /* renamed from: S1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27257S1(int r7) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.f18864e0
            int r0 = r0 + r7
            int[] r7 = r6.f18380C
            int r1 = r7.length
        L_0x0006:
            int r2 = r6.f18864e0
            if (r2 >= r0) goto L_0x0036
        L_0x000a:
            char[] r2 = r6.f18861Y
            int r3 = r6.f18864e0
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x0030
            r4 = r7[r4]
            if (r4 == 0) goto L_0x0030
            int r4 = r6.f18862Z
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0020
            java.io.Writer r5 = r6.f18859U
            r5.write(r2, r4, r3)
        L_0x0020:
            char[] r2 = r6.f18861Y
            int r3 = r6.f18864e0
            int r4 = r3 + 1
            r6.f18864e0 = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6.mo27268w1(r2, r3)
            goto L_0x0006
        L_0x0030:
            int r3 = r3 + 1
            r6.f18864e0 = r3
            if (r3 < r0) goto L_0x000a
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vn7.mo27257S1(int):void");
    }

    /* renamed from: T1 */
    public final void mo27258T1(qw5 qw5) throws IOException {
        char[] asQuotedChars = qw5.asQuotedChars();
        int length = asQuotedChars.length;
        if (length < 32) {
            if (length > this.f18866k0 - this.f18864e0) {
                mo27266u1();
            }
            System.arraycopy(asQuotedChars, 0, this.f18861Y, this.f18864e0, length);
            this.f18864e0 += length;
        } else {
            mo27266u1();
            this.f18859U.write(asQuotedChars, 0, length);
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = this.f18860X;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC] */
    /* renamed from: U1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27259U1(int r9, int r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r0 = r8.f18864e0
            int r0 = r0 + r9
            int[] r9 = r8.f18380C
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        L_0x000c:
            int r2 = r8.f18864e0
            if (r2 >= r0) goto L_0x003a
        L_0x0010:
            char[] r2 = r8.f18861Y
            int r3 = r8.f18864e0
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x001d
            r5 = r9[r4]
            if (r5 == 0) goto L_0x0034
            goto L_0x0020
        L_0x001d:
            if (r4 <= r10) goto L_0x0034
            r5 = -1
        L_0x0020:
            int r6 = r8.f18862Z
            int r3 = r3 - r6
            if (r3 <= 0) goto L_0x002a
            java.io.Writer r7 = r8.f18859U
            r7.write(r2, r6, r3)
        L_0x002a:
            int r2 = r8.f18864e0
            int r2 = r2 + 1
            r8.f18864e0 = r2
            r8.mo27268w1(r4, r5)
            goto L_0x000c
        L_0x0034:
            int r3 = r3 + 1
            r8.f18864e0 = r3
            if (r3 < r0) goto L_0x0010
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vn7.mo27259U1(int, int):void");
    }

    /* renamed from: V1 */
    public final void mo27260V1(char[] cArr, int i, int i2, int i3) throws IOException, JsonGenerationException {
        char c;
        int i4 = i2 + i;
        int[] iArr = this.f18380C;
        int min = Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i;
            while (true) {
                c = cArr[i6];
                if (c >= min) {
                    if (c > i3) {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i6++;
                if (i6 >= i4) {
                    break;
                }
            }
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.f18864e0 + i7 > this.f18866k0) {
                    mo27266u1();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.f18861Y, this.f18864e0, i7);
                    this.f18864e0 += i7;
                }
            } else {
                mo27266u1();
                this.f18859U.write(cArr, i, i7);
            }
            if (i6 < i4) {
                i = i6 + 1;
                mo27265t1(c, i5);
            } else {
                return;
            }
        }
    }

    /* renamed from: W */
    public void mo13855W() throws IOException {
        if (!this.f10689x.mo28328g()) {
            mo13861a("Current context not Object but " + this.f10689x.mo28330j());
        }
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeEndObject(this, this.f10689x.mo28326d());
        } else {
            if (this.f18864e0 >= this.f18866k0) {
                mo27266u1();
            }
            char[] cArr = this.f18861Y;
            int i = this.f18864e0;
            this.f18864e0 = i + 1;
            cArr[i] = '}';
        }
        this.f10689x = this.f10689x.mo24459l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC] */
    /* renamed from: W1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27261W1(int r12) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r11 = this;
            int r0 = r11.f18864e0
            int r0 = r0 + r12
            int[] r12 = r11.f18380C
            int r1 = r11.f18381H
            r2 = 1
            if (r1 >= r2) goto L_0x000d
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x000d:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            com.fasterxml.jackson.core.io.CharacterEscapes r4 = r11.f18382I
        L_0x0016:
            int r5 = r11.f18864e0
            if (r5 >= r0) goto L_0x0052
        L_0x001a:
            char[] r5 = r11.f18861Y
            int r6 = r11.f18864e0
            char r5 = r5[r6]
            if (r5 >= r3) goto L_0x0027
            r6 = r12[r5]
            if (r6 == 0) goto L_0x004b
            goto L_0x0034
        L_0x0027:
            if (r5 <= r1) goto L_0x002b
            r6 = -1
            goto L_0x0034
        L_0x002b:
            qw5 r6 = r4.getEscapeSequence(r5)
            r11.f18863b1 = r6
            if (r6 == 0) goto L_0x004b
            r6 = -2
        L_0x0034:
            int r7 = r11.f18864e0
            int r8 = r11.f18862Z
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x0042
            java.io.Writer r9 = r11.f18859U
            char[] r10 = r11.f18861Y
            r9.write(r10, r8, r7)
        L_0x0042:
            int r7 = r11.f18864e0
            int r7 = r7 + r2
            r11.f18864e0 = r7
            r11.mo27268w1(r5, r6)
            goto L_0x0016
        L_0x004b:
            int r5 = r11.f18864e0
            int r5 = r5 + r2
            r11.f18864e0 = r5
            if (r5 < r0) goto L_0x001a
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vn7.mo27261W1(int):void");
    }

    /* renamed from: X1 */
    public final void mo27262X1(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        char c;
        int i3 = i2 + i;
        int[] iArr = this.f18380C;
        int i4 = this.f18381H;
        if (i4 < 1) {
            i4 = 65535;
        }
        int min = Math.min(iArr.length, i4 + 1);
        CharacterEscapes characterEscapes = this.f18382I;
        int i5 = 0;
        while (i < i3) {
            int i6 = i;
            while (true) {
                c = cArr[i6];
                if (c >= min) {
                    if (c <= i4) {
                        qw5 escapeSequence = characterEscapes.getEscapeSequence(c);
                        this.f18863b1 = escapeSequence;
                        if (escapeSequence != null) {
                            i5 = -2;
                            break;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i6++;
                if (i6 >= i3) {
                    break;
                }
            }
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.f18864e0 + i7 > this.f18866k0) {
                    mo27266u1();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.f18861Y, this.f18864e0, i7);
                    this.f18864e0 += i7;
                }
            } else {
                mo27266u1();
                this.f18859U.write(cArr, i, i7);
            }
            if (i6 < i3) {
                i = i6 + 1;
                mo27265t1(c, i5);
            } else {
                return;
            }
        }
    }

    /* renamed from: Y */
    public void mo13858Y(qw5 qw5) throws IOException {
        int w = this.f10689x.mo24469w(qw5.getValue());
        if (w == 4) {
            mo13861a("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (w != 1) {
            z = false;
        }
        mo27241C1(qw5, z);
    }

    /* renamed from: Y0 */
    public void mo13859Y0(qw5 qw5) throws IOException {
        mo18747l1("write a string");
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        int i2 = i + 1;
        this.f18864e0 = i2;
        cArr[i] = this.f18860X;
        int appendQuoted = qw5.appendQuoted(cArr, i2);
        if (appendQuoted < 0) {
            mo27258T1(qw5);
            return;
        }
        int i3 = this.f18864e0 + appendQuoted;
        this.f18864e0 = i3;
        if (i3 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i4 = this.f18864e0;
        this.f18864e0 = i4 + 1;
        cArr2[i4] = this.f18860X;
    }

    /* renamed from: Y1 */
    public final void mo27263Y1(String str) throws IOException {
        int i = this.f18866k0;
        int i2 = this.f18864e0;
        int i3 = i - i2;
        str.getChars(0, i3, this.f18861Y, i2);
        this.f18864e0 += i3;
        mo27266u1();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.f18866k0;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.f18861Y, 0);
                this.f18862Z = 0;
                this.f18864e0 = i4;
                mo27266u1();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.f18861Y, 0);
                this.f18862Z = 0;
                this.f18864e0 = length;
                return;
            }
        }
    }

    /* renamed from: Z0 */
    public void mo13860Z0(String str) throws IOException {
        mo18747l1("write a string");
        if (str == null) {
            mo27245G1();
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = this.f18860X;
        mo27255Q1(str);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i2 = this.f18864e0;
        this.f18864e0 = i2 + 1;
        cArr2[i2] = this.f18860X;
    }

    /* renamed from: a1 */
    public void mo13862a1(char[] cArr, int i, int i2) throws IOException {
        mo18747l1("write a string");
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr2 = this.f18861Y;
        int i3 = this.f18864e0;
        this.f18864e0 = i3 + 1;
        cArr2[i3] = this.f18860X;
        mo27256R1(cArr, i, i2);
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr3 = this.f18861Y;
        int i4 = this.f18864e0;
        this.f18864e0 = i4 + 1;
        cArr3[i4] = this.f18860X;
    }

    /* renamed from: b0 */
    public void mo13864b0(String str) throws IOException {
        int w = this.f10689x.mo24469w(str);
        if (w == 4) {
            mo13861a("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (w != 1) {
            z = false;
        }
        mo27242D1(str, z);
    }

    /* renamed from: c0 */
    public void mo13866c0() throws IOException {
        mo18747l1("write a null");
        mo27245G1();
    }

    public void close() throws IOException {
        super.close();
        if (this.f18861Y != null && mo13889m(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                z63 k = mo13885k();
                if (!k.mo28327f()) {
                    if (!k.mo28328g()) {
                        break;
                    }
                    mo13855W();
                } else {
                    mo13853S();
                }
            }
        }
        mo27266u1();
        this.f18862Z = 0;
        this.f18864e0 = 0;
        if (this.f18859U != null) {
            if (this.f18379B.mo24744n() || mo13889m(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.f18859U.close();
            } else if (mo13889m(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.f18859U.flush();
            }
        }
        mo27270y1();
    }

    /* renamed from: e0 */
    public void mo13872e0(double d) throws IOException {
        if (this.f10688s || (lc4.m21387o(d) && mo13889m(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo13860Z0(String.valueOf(d));
            return;
        }
        mo18747l1("write a number");
        mo13834B0(String.valueOf(d));
    }

    public void flush() throws IOException {
        mo27266u1();
        if (this.f18859U != null && mo13889m(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f18859U.flush();
        }
    }

    /* renamed from: g0 */
    public void mo13877g0(float f) throws IOException {
        if (this.f10688s || (lc4.m21388p(f) && mo13889m(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            mo13860Z0(String.valueOf(f));
            return;
        }
        mo18747l1("write a number");
        mo13834B0(String.valueOf(f));
    }

    /* renamed from: h0 */
    public void mo13880h0(int i) throws IOException {
        mo18747l1("write a number");
        if (this.f10688s) {
            mo27248J1(i);
            return;
        }
        if (this.f18864e0 + 11 >= this.f18866k0) {
            mo27266u1();
        }
        this.f18864e0 = lc4.m21390r(i, this.f18861Y, this.f18864e0);
    }

    /* renamed from: i0 */
    public void mo13882i0(long j) throws IOException {
        mo18747l1("write a number");
        if (this.f10688s) {
            mo27249K1(j);
            return;
        }
        if (this.f18864e0 + 21 >= this.f18866k0) {
            mo27266u1();
        }
        this.f18864e0 = lc4.m21392t(j, this.f18861Y, this.f18864e0);
    }

    /* renamed from: j0 */
    public void mo13884j0(String str) throws IOException {
        mo18747l1("write a number");
        if (str == null) {
            mo27245G1();
        } else if (this.f10688s) {
            mo27250L1(str);
        } else {
            mo13834B0(str);
        }
    }

    /* renamed from: k0 */
    public void mo13886k0(BigDecimal bigDecimal) throws IOException {
        mo18747l1("write a number");
        if (bigDecimal == null) {
            mo27245G1();
        } else if (this.f10688s) {
            mo27250L1(mo18744h1(bigDecimal));
        } else {
            mo13834B0(mo18744h1(bigDecimal));
        }
    }

    /* renamed from: l0 */
    public void mo13888l0(BigInteger bigInteger) throws IOException {
        mo18747l1("write a number");
        if (bigInteger == null) {
            mo27245G1();
        } else if (this.f10688s) {
            mo27250L1(bigInteger.toString());
        } else {
            mo13834B0(bigInteger.toString());
        }
    }

    /* renamed from: l1 */
    public final void mo18747l1(String str) throws IOException {
        char c;
        int x = this.f10689x.mo24470x();
        if (this.f9817a != null) {
            mo26652r1(str, x);
            return;
        }
        if (x == 1) {
            c = ',';
        } else if (x == 2) {
            c = ':';
        } else if (x == 3) {
            qw5 qw5 = this.f18383L;
            if (qw5 != null) {
                mo13834B0(qw5.getValue());
                return;
            }
            return;
        } else if (x == 5) {
            mo26651q1(str);
            return;
        } else {
            return;
        }
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = c;
    }

    /* renamed from: o0 */
    public void mo13891o0(short s) throws IOException {
        mo18747l1("write a number");
        if (this.f10688s) {
            mo27251M1(s);
            return;
        }
        if (this.f18864e0 + 6 >= this.f18866k0) {
            mo27266u1();
        }
        this.f18864e0 = lc4.m21390r(s, this.f18861Y, this.f18864e0);
    }

    /* renamed from: s1 */
    public final char[] mo27264s1() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.f18867v0 = cArr;
        return cArr;
    }

    /* renamed from: t1 */
    public final void mo27265t1(char c, int i) throws IOException, JsonGenerationException {
        String str;
        int i2;
        if (i >= 0) {
            if (this.f18864e0 + 2 > this.f18866k0) {
                mo27266u1();
            }
            char[] cArr = this.f18861Y;
            int i3 = this.f18864e0;
            int i4 = i3 + 1;
            cArr[i3] = '\\';
            this.f18864e0 = i4 + 1;
            cArr[i4] = (char) i;
        } else if (i != -2) {
            if (this.f18864e0 + 5 >= this.f18866k0) {
                mo27266u1();
            }
            int i5 = this.f18864e0;
            char[] cArr2 = this.f18861Y;
            int i6 = i5 + 1;
            cArr2[i5] = '\\';
            int i7 = i6 + 1;
            cArr2[i6] = 'u';
            if (c > 255) {
                int i8 = 255 & (c >> 8);
                int i9 = i7 + 1;
                char[] cArr3 = f18858o1;
                cArr2[i7] = cArr3[i8 >> 4];
                i2 = i9 + 1;
                cArr2[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i7 + 1;
                cArr2[i7] = '0';
                i2 = i10 + 1;
                cArr2[i10] = '0';
            }
            int i11 = i2 + 1;
            char[] cArr4 = f18858o1;
            cArr2[i2] = cArr4[c >> 4];
            cArr2[i11] = cArr4[c & 15];
            this.f18864e0 = i11 + 1;
        } else {
            qw5 qw5 = this.f18863b1;
            if (qw5 == null) {
                str = this.f18382I.getEscapeSequence(c).getValue();
            } else {
                str = qw5.getValue();
                this.f18863b1 = null;
            }
            int length = str.length();
            if (this.f18864e0 + length > this.f18866k0) {
                mo27266u1();
                if (length > this.f18866k0) {
                    this.f18859U.write(str);
                    return;
                }
            }
            str.getChars(0, length, this.f18861Y, this.f18864e0);
            this.f18864e0 += length;
        }
    }

    /* renamed from: u1 */
    public void mo27266u1() throws IOException {
        int i = this.f18864e0;
        int i2 = this.f18862Z;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f18862Z = 0;
            this.f18864e0 = 0;
            this.f18859U.write(this.f18861Y, i2, i3);
        }
    }

    /* renamed from: v1 */
    public final int mo27267v1(char[] cArr, int i, int i2, char c, int i3) throws IOException, JsonGenerationException {
        String str;
        int i4;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.f18867v0;
                if (cArr2 == null) {
                    cArr2 = mo27264s1();
                }
                cArr2[1] = (char) i3;
                this.f18859U.write(cArr2, 0, 2);
                return i;
            }
            int i5 = i - 2;
            cArr[i5] = '\\';
            cArr[i5 + 1] = (char) i3;
            return i5;
        } else if (i3 == -2) {
            qw5 qw5 = this.f18863b1;
            if (qw5 == null) {
                str = this.f18382I.getEscapeSequence(c).getValue();
            } else {
                str = qw5.getValue();
                this.f18863b1 = null;
            }
            int length = str.length();
            if (i < length || i >= i2) {
                this.f18859U.write(str);
                return i;
            }
            int i6 = i - length;
            str.getChars(0, length, cArr, i6);
            return i6;
        } else if (i <= 5 || i >= i2) {
            char[] cArr3 = this.f18867v0;
            if (cArr3 == null) {
                cArr3 = mo27264s1();
            }
            this.f18862Z = this.f18864e0;
            if (c > 255) {
                int i7 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr4 = f18858o1;
                cArr3[10] = cArr4[i7 >> 4];
                cArr3[11] = cArr4[i7 & 15];
                cArr3[12] = cArr4[c2 >> 4];
                cArr3[13] = cArr4[c2 & 15];
                this.f18859U.write(cArr3, 8, 6);
                return i;
            }
            char[] cArr5 = f18858o1;
            cArr3[6] = cArr5[c >> 4];
            cArr3[7] = cArr5[c & 15];
            this.f18859U.write(cArr3, 2, 6);
            return i;
        } else {
            int i8 = i - 6;
            int i9 = i8 + 1;
            cArr[i8] = '\\';
            int i10 = i9 + 1;
            cArr[i9] = 'u';
            if (c > 255) {
                int i11 = (c >> 8) & 255;
                int i12 = i10 + 1;
                char[] cArr6 = f18858o1;
                cArr[i10] = cArr6[i11 >> 4];
                i4 = i12 + 1;
                cArr[i12] = cArr6[i11 & 15];
                c = (char) (c & 255);
            } else {
                int i13 = i10 + 1;
                cArr[i10] = '0';
                i4 = i13 + 1;
                cArr[i13] = '0';
            }
            int i14 = i4 + 1;
            char[] cArr7 = f18858o1;
            cArr[i4] = cArr7[c >> 4];
            cArr[i14] = cArr7[c & 15];
            return i14 - 5;
        }
    }

    /* renamed from: w1 */
    public final void mo27268w1(char c, int i) throws IOException, JsonGenerationException {
        String str;
        int i2;
        if (i >= 0) {
            int i3 = this.f18864e0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.f18862Z = i4;
                char[] cArr = this.f18861Y;
                cArr[i4] = '\\';
                cArr[i4 + 1] = (char) i;
                return;
            }
            char[] cArr2 = this.f18867v0;
            if (cArr2 == null) {
                cArr2 = mo27264s1();
            }
            this.f18862Z = this.f18864e0;
            cArr2[1] = (char) i;
            this.f18859U.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i5 = this.f18864e0;
            if (i5 >= 6) {
                char[] cArr3 = this.f18861Y;
                int i6 = i5 - 6;
                this.f18862Z = i6;
                cArr3[i6] = '\\';
                int i7 = i6 + 1;
                cArr3[i7] = 'u';
                if (c > 255) {
                    int i8 = (c >> 8) & 255;
                    int i9 = i7 + 1;
                    char[] cArr4 = f18858o1;
                    cArr3[i9] = cArr4[i8 >> 4];
                    i2 = i9 + 1;
                    cArr3[i2] = cArr4[i8 & 15];
                    c = (char) (c & 255);
                } else {
                    int i10 = i7 + 1;
                    cArr3[i10] = '0';
                    i2 = i10 + 1;
                    cArr3[i2] = '0';
                }
                int i11 = i2 + 1;
                char[] cArr5 = f18858o1;
                cArr3[i11] = cArr5[c >> 4];
                cArr3[i11 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.f18867v0;
            if (cArr6 == null) {
                cArr6 = mo27264s1();
            }
            this.f18862Z = this.f18864e0;
            if (c > 255) {
                int i12 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = f18858o1;
                cArr6[10] = cArr7[i12 >> 4];
                cArr6[11] = cArr7[i12 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this.f18859U.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = f18858o1;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this.f18859U.write(cArr6, 2, 6);
        } else {
            qw5 qw5 = this.f18863b1;
            if (qw5 == null) {
                str = this.f18382I.getEscapeSequence(c).getValue();
            } else {
                str = qw5.getValue();
                this.f18863b1 = null;
            }
            int length = str.length();
            int i13 = this.f18864e0;
            if (i13 >= length) {
                int i14 = i13 - length;
                this.f18862Z = i14;
                str.getChars(0, length, this.f18861Y, i14);
                return;
            }
            this.f18862Z = i13;
            this.f18859U.write(str);
        }
    }

    /* renamed from: x1 */
    public final int mo27269x1(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i5 = min - i4;
            if (i5 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i4, i5);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    /* renamed from: y0 */
    public void mo13902y0(char c) throws IOException {
        if (this.f18864e0 >= this.f18866k0) {
            mo27266u1();
        }
        char[] cArr = this.f18861Y;
        int i = this.f18864e0;
        this.f18864e0 = i + 1;
        cArr[i] = c;
    }

    /* renamed from: y1 */
    public void mo27270y1() {
        char[] cArr = this.f18861Y;
        if (cArr != null) {
            this.f18861Y = null;
            this.f18379B.mo24746p(cArr);
        }
        char[] cArr2 = this.f18865e1;
        if (cArr2 != null) {
            this.f18865e1 = null;
            this.f18379B.mo24747q(cArr2);
        }
    }

    /* renamed from: z1 */
    public final int mo27271z1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int i = this.f18866k0 - 6;
        int i2 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 > i3) {
                i5 = mo27269x1(inputStream, bArr, i4, i5, bArr.length);
                if (i5 < 3) {
                    break;
                }
                i3 = i5 - 3;
                i4 = 0;
            }
            if (this.f18864e0 > i) {
                mo27266u1();
            }
            int i7 = i4 + 1;
            int i8 = i7 + 1;
            i4 = i8 + 1;
            i6 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i7] & 255) | (bArr[i4] << 8)) << 8) | (bArr[i8] & 255), this.f18861Y, this.f18864e0);
            this.f18864e0 = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.f18861Y;
                int i9 = encodeBase64Chunk + 1;
                cArr[encodeBase64Chunk] = '\\';
                this.f18864e0 = i9 + 1;
                cArr[i9] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i5 <= 0) {
            return i6;
        }
        if (this.f18864e0 > i) {
            mo27266u1();
        }
        int i10 = bArr[0] << 16;
        if (1 < i5) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i6 + i2;
        this.f18864e0 = base64Variant.encodeBase64Partial(i10, i2, this.f18861Y, this.f18864e0);
        return i11;
    }
}
