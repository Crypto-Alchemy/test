package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p009io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: e37 */
/* compiled from: UTF8JsonGenerator */
public class e37 extends u43 {

    /* renamed from: o1 */
    public static final byte[] f11033o1 = ud0.m28143c();

    /* renamed from: p1 */
    public static final byte[] f11034p1 = {110, 117, 108, 108};

    /* renamed from: q1 */
    public static final byte[] f11035q1 = {116, 114, 117, 101};

    /* renamed from: r1 */
    public static final byte[] f11036r1 = {102, 97, 108, 115, 101};

    /* renamed from: U */
    public final OutputStream f11037U;

    /* renamed from: X */
    public byte f11038X;

    /* renamed from: Y */
    public byte[] f11039Y;

    /* renamed from: Z */
    public int f11040Z;

    /* renamed from: b1 */
    public final int f11041b1;

    /* renamed from: e0 */
    public final int f11042e0;

    /* renamed from: e1 */
    public boolean f11043e1;

    /* renamed from: k0 */
    public final int f11044k0;

    /* renamed from: v0 */
    public char[] f11045v0;

    public e37(po2 po2, int i, xe4 xe4, OutputStream outputStream, char c) {
        super(po2, i, xe4);
        this.f11037U = outputStream;
        this.f11038X = (byte) c;
        if (c != '\"') {
            this.f18380C = ud0.m28146f(c);
        }
        this.f11043e1 = true;
        byte[] j = po2.mo24740j();
        this.f11039Y = j;
        int length = j.length;
        this.f11042e0 = length;
        this.f11044k0 = length >> 3;
        char[] e = po2.mo24735e();
        this.f11045v0 = e;
        this.f11041b1 = e.length;
        if (mo13889m(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            mo13899x(127);
        }
    }

    /* renamed from: A0 */
    public void mo13833A0(qw5 qw5) throws IOException {
        int appendUnquotedUTF8 = qw5.appendUnquotedUTF8(this.f11039Y, this.f11040Z);
        if (appendUnquotedUTF8 < 0) {
            mo19086C1(qw5.asUnquotedUTF8());
        } else {
            this.f11040Z += appendUnquotedUTF8;
        }
    }

    /* renamed from: A1 */
    public final int mo19084A1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int x1;
        int i2 = this.f11042e0 - 6;
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
                i6 = mo19116x1(inputStream, bArr, i5, i6, i);
                if (i6 < 3) {
                    i5 = 0;
                    break;
                }
                i4 = i6 - 3;
                i5 = 0;
            }
            if (this.f11040Z > i2) {
                mo19111s1();
            }
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            i5 = i8 + 1;
            i -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i7] & 255) | (bArr[i5] << 8)) << 8) | (bArr[i8] & 255), this.f11039Y, this.f11040Z);
            this.f11040Z = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.f11039Y;
                int i9 = encodeBase64Chunk + 1;
                bArr2[encodeBase64Chunk] = 92;
                this.f11040Z = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0 || (x1 = mo19116x1(inputStream, bArr, i5, i6, i)) <= 0) {
            return i;
        }
        if (this.f11040Z > i2) {
            mo19111s1();
        }
        int i10 = bArr[0] << 16;
        if (1 < x1) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.f11040Z = base64Variant.encodeBase64Partial(i10, i3, this.f11039Y, this.f11040Z);
        return i - i3;
    }

    /* renamed from: B0 */
    public void mo13834B0(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f11045v0;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            mo13836C0(cArr, 0, length);
            return;
        }
        mo19110a2(str, 0, length);
    }

    /* renamed from: B1 */
    public final void mo19085B1(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 - 3;
        int i4 = this.f11042e0 - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this.f11040Z > i4) {
                mo19111s1();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f11039Y, this.f11040Z);
            this.f11040Z = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.f11039Y;
                int i8 = encodeBase64Chunk + 1;
                bArr2[encodeBase64Chunk] = 92;
                this.f11040Z = i8 + 1;
                bArr2[i8] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i7;
        }
        int i9 = i2 - i;
        if (i9 > 0) {
            if (this.f11040Z > i4) {
                mo19111s1();
            }
            int i10 = i + 1;
            int i11 = bArr[i] << 16;
            if (i9 == 2) {
                i11 |= (bArr[i10] & 255) << 8;
            }
            this.f11040Z = base64Variant.encodeBase64Partial(i11, i9, this.f11039Y, this.f11040Z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 >= 2048) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r1 = r5.f11039Y;
        r2 = r5.f11040Z;
        r3 = r2 + 1;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r5.f11040Z = r3 + 1;
        r1[r3] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r7 = mo19114v1(r0, r6, r7, r8);
     */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13836C0(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r8 + r8
            int r0 = r0 + r8
            int r1 = r5.f11040Z
            int r1 = r1 + r0
            int r2 = r5.f11042e0
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r5.mo19099P1(r6, r7, r8)
            return
        L_0x0010:
            r5.mo19111s1()
        L_0x0013:
            int r8 = r8 + r7
        L_0x0014:
            if (r7 >= r8) goto L_0x004f
        L_0x0016:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0040
            int r7 = r7 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x003b
            byte[] r1 = r5.f11039Y
            int r2 = r5.f11040Z
            int r3 = r2 + 1
            int r4 = r0 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5.f11040Z = r2
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r1[r3] = r0
            goto L_0x0014
        L_0x003b:
            int r7 = r5.mo19114v1(r0, r6, r7, r8)
            goto L_0x0014
        L_0x0040:
            byte[] r1 = r5.f11039Y
            int r2 = r5.f11040Z
            int r3 = r2 + 1
            r5.f11040Z = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0016
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e37.mo13836C0(char[], int, int):void");
    }

    /* renamed from: C1 */
    public final void mo19086C1(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f11040Z + length > this.f11042e0) {
            mo19111s1();
            if (length > 512) {
                this.f11037U.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f11039Y, this.f11040Z, length);
        this.f11040Z += length;
    }

    /* renamed from: D0 */
    public void mo13837D0(qw5 qw5) throws IOException {
        mo18747l1("write a raw (unencoded) value");
        int appendUnquotedUTF8 = qw5.appendUnquotedUTF8(this.f11039Y, this.f11040Z);
        if (appendUnquotedUTF8 < 0) {
            mo19086C1(qw5.asUnquotedUTF8());
        } else {
            this.f11040Z += appendUnquotedUTF8;
        }
    }

    /* renamed from: D1 */
    public final int mo19087D1(byte[] bArr, int i, qw5 qw5, int i2) throws IOException, JsonGenerationException {
        byte[] asUnquotedUTF8 = qw5.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length > 6) {
            return mo19112t1(bArr, i, this.f11042e0, asUnquotedUTF8, i2);
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    /* renamed from: E1 */
    public final void mo19088E1(String str, int i, int i2) throws IOException {
        if (this.f11040Z + ((i2 - i) * 6) > this.f11042e0) {
            mo19111s1();
        }
        int i3 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        int i4 = this.f18381H;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this.f18382I;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i6 = iArr[charAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3++;
                } else if (i6 > 0) {
                    int i7 = i3 + 1;
                    bArr[i3] = 92;
                    i3 = i7 + 1;
                    bArr[i7] = (byte) i6;
                } else if (i6 == -2) {
                    qw5 escapeSequence = characterEscapes.getEscapeSequence(charAt);
                    if (escapeSequence == null) {
                        mo13861a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(charAt) + ", although was supposed to have one");
                    }
                    i3 = mo19087D1(bArr, i3, escapeSequence, i2 - i5);
                } else {
                    i3 = mo19090G1(charAt, i3);
                }
            } else if (charAt > i4) {
                i3 = mo19090G1(charAt, i3);
            } else {
                qw5 escapeSequence2 = characterEscapes.getEscapeSequence(charAt);
                if (escapeSequence2 != null) {
                    i3 = mo19087D1(bArr, i3, escapeSequence2, i2 - i5);
                } else if (charAt <= 2047) {
                    int i8 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    i3 = i8 + 1;
                    bArr[i8] = (byte) ((charAt & '?') | 128);
                } else {
                    i3 = mo19113u1(charAt, i3);
                }
            }
            i = i5;
        }
        this.f11040Z = i3;
    }

    /* renamed from: F1 */
    public final void mo19089F1(char[] cArr, int i, int i2) throws IOException {
        if (this.f11040Z + ((i2 - i) * 6) > this.f11042e0) {
            mo19111s1();
        }
        int i3 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        int i4 = this.f18381H;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this.f18382I;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3++;
                } else if (i6 > 0) {
                    int i7 = i3 + 1;
                    bArr[i3] = 92;
                    i3 = i7 + 1;
                    bArr[i7] = (byte) i6;
                } else if (i6 == -2) {
                    qw5 escapeSequence = characterEscapes.getEscapeSequence(c);
                    if (escapeSequence == null) {
                        mo13861a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c) + ", although was supposed to have one");
                    }
                    i3 = mo19087D1(bArr, i3, escapeSequence, i2 - i5);
                } else {
                    i3 = mo19090G1(c, i3);
                }
            } else if (c > i4) {
                i3 = mo19090G1(c, i3);
            } else {
                qw5 escapeSequence2 = characterEscapes.getEscapeSequence(c);
                if (escapeSequence2 != null) {
                    i3 = mo19087D1(bArr, i3, escapeSequence2, i2 - i5);
                } else if (c <= 2047) {
                    int i8 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i8 + 1;
                    bArr[i8] = (byte) ((c & '?') | 128);
                } else {
                    i3 = mo19113u1(c, i3);
                }
            }
            i = i5;
        }
        this.f11040Z = i3;
    }

    /* renamed from: G0 */
    public final void mo13840G0() throws IOException {
        mo18747l1("start an array");
        this.f10689x = this.f10689x.mo24460m();
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartArray(this);
            return;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = 91;
    }

    /* renamed from: G1 */
    public final int mo19090G1(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.f11039Y;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = f11033o1;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = f11033o1;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    /* renamed from: H1 */
    public final void mo19091H1() throws IOException {
        if (this.f11040Z + 4 >= this.f11042e0) {
            mo19111s1();
        }
        System.arraycopy(f11034p1, 0, this.f11039Y, this.f11040Z, 4);
        this.f11040Z += 4;
    }

    /* renamed from: I1 */
    public final void mo19092I1(qw5 qw5) throws IOException {
        int w = this.f10689x.mo24469w(qw5.getValue());
        if (w == 4) {
            mo13861a("Can not write a field name, expecting a value");
        }
        if (w == 1) {
            this.f9817a.writeObjectEntrySeparator(this);
        } else {
            this.f9817a.beforeObjectEntries(this);
        }
        boolean z = !this.f18384M;
        if (z) {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr = this.f11039Y;
            int i = this.f11040Z;
            this.f11040Z = i + 1;
            bArr[i] = this.f11038X;
        }
        int appendQuotedUTF8 = qw5.appendQuotedUTF8(this.f11039Y, this.f11040Z);
        if (appendQuotedUTF8 < 0) {
            mo19086C1(qw5.asQuotedUTF8());
        } else {
            this.f11040Z += appendQuotedUTF8;
        }
        if (z) {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr2 = this.f11039Y;
            int i2 = this.f11040Z;
            this.f11040Z = i2 + 1;
            bArr2[i2] = this.f11038X;
        }
    }

    /* renamed from: J */
    public int mo13842J(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        mo18747l1("write a binary value");
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i2 = this.f11040Z;
        this.f11040Z = i2 + 1;
        bArr[i2] = this.f11038X;
        byte[] d = this.f18379B.mo24734d();
        if (i < 0) {
            try {
                i = mo19118z1(base64Variant, inputStream, d);
            } catch (Throwable th) {
                this.f18379B.mo24745o(d);
                throw th;
            }
        } else {
            int A1 = mo19084A1(base64Variant, inputStream, d, i);
            if (A1 > 0) {
                mo13861a("Too few bytes available: missing " + A1 + " bytes (out of " + i + ")");
            }
        }
        this.f18379B.mo24745o(d);
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i3 = this.f11040Z;
        this.f11040Z = i3 + 1;
        bArr2[i3] = this.f11038X;
        return i;
    }

    /* renamed from: J1 */
    public final void mo19093J1(String str) throws IOException {
        int w = this.f10689x.mo24469w(str);
        if (w == 4) {
            mo13861a("Can not write a field name, expecting a value");
        }
        if (w == 1) {
            this.f9817a.writeObjectEntrySeparator(this);
        } else {
            this.f9817a.beforeObjectEntries(this);
        }
        if (this.f18384M) {
            mo19107X1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f11041b1) {
            mo19107X1(str, true);
            return;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = this.f11038X;
        str.getChars(0, length, this.f11045v0, 0);
        if (length <= this.f11044k0) {
            if (this.f11040Z + length > this.f11042e0) {
                mo19111s1();
            }
            mo19101R1(this.f11045v0, 0, length);
        } else {
            mo19108Y1(this.f11045v0, 0, length);
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i2 = this.f11040Z;
        this.f11040Z = i2 + 1;
        bArr2[i2] = this.f11038X;
    }

    /* renamed from: K1 */
    public final void mo19094K1(int i) throws IOException {
        if (this.f11040Z + 13 >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i2 = this.f11040Z;
        int i3 = i2 + 1;
        this.f11040Z = i3;
        bArr[i2] = this.f11038X;
        int q = lc4.m21389q(i, bArr, i3);
        byte[] bArr2 = this.f11039Y;
        this.f11040Z = q + 1;
        bArr2[q] = this.f11038X;
    }

    /* renamed from: L */
    public void mo13844L(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        mo18747l1("write a binary value");
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i3 = this.f11040Z;
        this.f11040Z = i3 + 1;
        bArr2[i3] = this.f11038X;
        mo19085B1(base64Variant, bArr, i, i2 + i);
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr3 = this.f11039Y;
        int i4 = this.f11040Z;
        this.f11040Z = i4 + 1;
        bArr3[i4] = this.f11038X;
    }

    /* renamed from: L1 */
    public final void mo19095L1(long j) throws IOException {
        if (this.f11040Z + 23 >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        int i2 = i + 1;
        this.f11040Z = i2;
        bArr[i] = this.f11038X;
        int s = lc4.m21391s(j, bArr, i2);
        byte[] bArr2 = this.f11039Y;
        this.f11040Z = s + 1;
        bArr2[s] = this.f11038X;
    }

    /* renamed from: M1 */
    public final void mo19096M1(String str) throws IOException {
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = this.f11038X;
        mo13834B0(str);
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i2 = this.f11040Z;
        this.f11040Z = i2 + 1;
        bArr2[i2] = this.f11038X;
    }

    /* renamed from: N1 */
    public final void mo19097N1(short s) throws IOException {
        if (this.f11040Z + 8 >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        int i2 = i + 1;
        this.f11040Z = i2;
        bArr[i] = this.f11038X;
        int q = lc4.m21389q(s, bArr, i2);
        byte[] bArr2 = this.f11039Y;
        this.f11040Z = q + 1;
        bArr2[q] = this.f11038X;
    }

    /* renamed from: O0 */
    public final void mo13848O0(Object obj) throws IOException {
        mo18747l1("start an array");
        this.f10689x = this.f10689x.mo24461n(obj);
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartArray(this);
            return;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = 91;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 >= 2048) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r1 = r5.f11039Y;
        r2 = r5.f11040Z;
        r3 = r2 + 1;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r5.f11040Z = r3 + 1;
        r1[r3] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r7 = mo19114v1(r0, r6, r7, r8);
     */
    /* renamed from: O1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19098O1(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
        L_0x0000:
            if (r7 >= r8) goto L_0x003b
        L_0x0002:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x002c
            int r7 = r7 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x0027
            byte[] r1 = r5.f11039Y
            int r2 = r5.f11040Z
            int r3 = r2 + 1
            int r4 = r0 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5.f11040Z = r2
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r1[r3] = r0
            goto L_0x0000
        L_0x0027:
            int r7 = r5.mo19114v1(r0, r6, r7, r8)
            goto L_0x0000
        L_0x002c:
            byte[] r1 = r5.f11039Y
            int r2 = r5.f11040Z
            int r3 = r2 + 1
            r5.f11040Z = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0002
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e37.mo19098O1(char[], int, int):void");
    }

    /* renamed from: P */
    public void mo13849P(boolean z) throws IOException {
        byte[] bArr;
        mo18747l1("write a boolean value");
        if (this.f11040Z + 5 >= this.f11042e0) {
            mo19111s1();
        }
        if (z) {
            bArr = f11035q1;
        } else {
            bArr = f11036r1;
        }
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f11039Y, this.f11040Z, length);
        this.f11040Z += length;
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
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i2 = this.f11040Z;
        this.f11040Z = i2 + 1;
        bArr[i2] = 91;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r9 = mo19114v1(r9, r8, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if ((r7.f11040Z + 3) < r7.f11042e0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        mo19111s1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r2 = r9 + 1;
        r9 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9 >= 2048) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r7.f11040Z;
        r5 = r4 + 1;
        r1[r4] = (byte) ((r9 >> 6) | 192);
        r7.f11040Z = r5 + 1;
        r1[r5] = (byte) ((r9 & '?') | 128);
        r9 = r2;
     */
    /* renamed from: P1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19099P1(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.f11042e0
            byte[] r1 = r7.f11039Y
            int r10 = r10 + r9
        L_0x0005:
            if (r9 >= r10) goto L_0x0050
        L_0x0007:
            char r2 = r8[r9]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003c
            int r2 = r7.f11040Z
            int r2 = r2 + 3
            int r4 = r7.f11042e0
            if (r2 < r4) goto L_0x0018
            r7.mo19111s1()
        L_0x0018:
            int r2 = r9 + 1
            char r9 = r8[r9]
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 >= r4) goto L_0x0037
            int r4 = r7.f11040Z
            int r5 = r4 + 1
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r5 + 1
            r7.f11040Z = r4
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r1[r5] = r9
            r9 = r2
            goto L_0x0005
        L_0x0037:
            int r9 = r7.mo19114v1(r9, r8, r2, r10)
            goto L_0x0005
        L_0x003c:
            int r3 = r7.f11040Z
            if (r3 < r0) goto L_0x0043
            r7.mo19111s1()
        L_0x0043:
            int r3 = r7.f11040Z
            int r4 = r3 + 1
            r7.f11040Z = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0007
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e37.mo19099P1(char[], int, int):void");
    }

    /* renamed from: Q0 */
    public final void mo13852Q0() throws IOException {
        mo18747l1("start an object");
        this.f10689x = this.f10689x.mo24462o();
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeStartObject(this);
            return;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = 123;
    }

    /* renamed from: Q1 */
    public final void mo19100Q1(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        while (i < i3) {
            char charAt = str.charAt(i);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i4] = (byte) charAt;
            i++;
            i4++;
        }
        this.f11040Z = i4;
        if (i >= i3) {
            return;
        }
        if (this.f18382I != null) {
            mo19088E1(str, i, i3);
        } else if (this.f18381H == 0) {
            mo19102S1(str, i, i3);
        } else {
            mo19104U1(str, i, i3);
        }
    }

    /* renamed from: R1 */
    public final void mo19101R1(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.f11040Z = i4;
        if (i >= i3) {
            return;
        }
        if (this.f18382I != null) {
            mo19089F1(cArr, i, i3);
        } else if (this.f18381H == 0) {
            mo19103T1(cArr, i, i3);
        } else {
            mo19105V1(cArr, i, i3);
        }
    }

    /* renamed from: S */
    public final void mo13853S() throws IOException {
        if (!this.f10689x.mo28327f()) {
            mo13861a("Current context not Array but " + this.f10689x.mo28330j());
        }
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeEndArray(this, this.f10689x.mo28326d());
        } else {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr = this.f11039Y;
            int i = this.f11040Z;
            this.f11040Z = i + 1;
            bArr[i] = 93;
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
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = 123;
    }

    /* renamed from: S1 */
    public final void mo19102S1(String str, int i, int i2) throws IOException {
        if (this.f11040Z + ((i2 - i) * 6) > this.f11042e0) {
            mo19111s1();
        }
        int i3 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        while (i < i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i5 = iArr[charAt];
                if (i5 == 0) {
                    bArr[i3] = (byte) charAt;
                    i = i4;
                    i3++;
                } else if (i5 > 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = 92;
                    i3 = i6 + 1;
                    bArr[i6] = (byte) i5;
                } else {
                    i3 = mo19090G1(charAt, i3);
                }
            } else if (charAt <= 2047) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = mo19113u1(charAt, i3);
            }
            i = i4;
        }
        this.f11040Z = i3;
    }

    /* renamed from: T1 */
    public final void mo19103T1(char[] cArr, int i, int i2) throws IOException {
        if (this.f11040Z + ((i2 - i) * 6) > this.f11042e0) {
            mo19111s1();
        }
        int i3 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i5 = iArr[c];
                if (i5 == 0) {
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3++;
                } else if (i5 > 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = 92;
                    i3 = i6 + 1;
                    bArr[i6] = (byte) i5;
                } else {
                    i3 = mo19090G1(c, i3);
                }
            } else if (c <= 2047) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((c & '?') | 128);
            } else {
                i3 = mo19113u1(c, i3);
            }
            i = i4;
        }
        this.f11040Z = i3;
    }

    /* renamed from: U1 */
    public final void mo19104U1(String str, int i, int i2) throws IOException {
        if (this.f11040Z + ((i2 - i) * 6) > this.f11042e0) {
            mo19111s1();
        }
        int i3 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        int i4 = this.f18381H;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                int i6 = iArr[charAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3++;
                } else if (i6 > 0) {
                    int i7 = i3 + 1;
                    bArr[i3] = 92;
                    i3 = i7 + 1;
                    bArr[i7] = (byte) i6;
                } else {
                    i3 = mo19090G1(charAt, i3);
                }
            } else if (charAt > i4) {
                i3 = mo19090G1(charAt, i3);
            } else if (charAt <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = mo19113u1(charAt, i3);
            }
            i = i5;
        }
        this.f11040Z = i3;
    }

    /* renamed from: V1 */
    public final void mo19105V1(char[] cArr, int i, int i2) throws IOException {
        if (this.f11040Z + ((i2 - i) * 6) > this.f11042e0) {
            mo19111s1();
        }
        int i3 = this.f11040Z;
        byte[] bArr = this.f11039Y;
        int[] iArr = this.f18380C;
        int i4 = this.f18381H;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3++;
                } else if (i6 > 0) {
                    int i7 = i3 + 1;
                    bArr[i3] = 92;
                    i3 = i7 + 1;
                    bArr[i7] = (byte) i6;
                } else {
                    i3 = mo19090G1(c, i3);
                }
            } else if (c > i4) {
                i3 = mo19090G1(c, i3);
            } else if (c <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i3 = mo19113u1(c, i3);
            }
            i = i5;
        }
        this.f11040Z = i3;
    }

    /* renamed from: W */
    public final void mo13855W() throws IOException {
        if (!this.f10689x.mo28328g()) {
            mo13861a("Current context not Object but " + this.f10689x.mo28330j());
        }
        su4 su4 = this.f9817a;
        if (su4 != null) {
            su4.writeEndObject(this, this.f10689x.mo28326d());
        } else {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr = this.f11039Y;
            int i = this.f11040Z;
            this.f11040Z = i + 1;
            bArr[i] = 125;
        }
        this.f10689x = this.f10689x.mo24459l();
    }

    /* renamed from: W1 */
    public final void mo19106W1(String str, int i, int i2) throws IOException {
        do {
            int min = Math.min(this.f11044k0, i2);
            if (this.f11040Z + min > this.f11042e0) {
                mo19111s1();
            }
            mo19100Q1(str, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: X1 */
    public final void mo19107X1(String str, boolean z) throws IOException {
        if (z) {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr = this.f11039Y;
            int i = this.f11040Z;
            this.f11040Z = i + 1;
            bArr[i] = this.f11038X;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this.f11044k0, length);
            if (this.f11040Z + min > this.f11042e0) {
                mo19111s1();
            }
            mo19100Q1(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr2 = this.f11039Y;
            int i3 = this.f11040Z;
            this.f11040Z = i3 + 1;
            bArr2[i3] = this.f11038X;
        }
    }

    /* renamed from: Y */
    public void mo13858Y(qw5 qw5) throws IOException {
        if (this.f9817a != null) {
            mo19092I1(qw5);
            return;
        }
        int w = this.f10689x.mo24469w(qw5.getValue());
        if (w == 4) {
            mo13861a("Can not write a field name, expecting a value");
        }
        if (w == 1) {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr = this.f11039Y;
            int i = this.f11040Z;
            this.f11040Z = i + 1;
            bArr[i] = 44;
        }
        if (this.f18384M) {
            mo19109Z1(qw5);
            return;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i2 = this.f11040Z;
        int i3 = i2 + 1;
        this.f11040Z = i3;
        bArr2[i2] = this.f11038X;
        int appendQuotedUTF8 = qw5.appendQuotedUTF8(bArr2, i3);
        if (appendQuotedUTF8 < 0) {
            mo19086C1(qw5.asQuotedUTF8());
        } else {
            this.f11040Z += appendQuotedUTF8;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr3 = this.f11039Y;
        int i4 = this.f11040Z;
        this.f11040Z = i4 + 1;
        bArr3[i4] = this.f11038X;
    }

    /* renamed from: Y0 */
    public final void mo13859Y0(qw5 qw5) throws IOException {
        mo18747l1("write a string");
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        int i2 = i + 1;
        this.f11040Z = i2;
        bArr[i] = this.f11038X;
        int appendQuotedUTF8 = qw5.appendQuotedUTF8(bArr, i2);
        if (appendQuotedUTF8 < 0) {
            mo19086C1(qw5.asQuotedUTF8());
        } else {
            this.f11040Z += appendQuotedUTF8;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i3 = this.f11040Z;
        this.f11040Z = i3 + 1;
        bArr2[i3] = this.f11038X;
    }

    /* renamed from: Y1 */
    public final void mo19108Y1(char[] cArr, int i, int i2) throws IOException {
        do {
            int min = Math.min(this.f11044k0, i2);
            if (this.f11040Z + min > this.f11042e0) {
                mo19111s1();
            }
            mo19101R1(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: Z0 */
    public void mo13860Z0(String str) throws IOException {
        mo18747l1("write a string");
        if (str == null) {
            mo19091H1();
            return;
        }
        int length = str.length();
        if (length > this.f11044k0) {
            mo19107X1(str, true);
            return;
        }
        if (this.f11040Z + length >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = this.f11038X;
        mo19100Q1(str, 0, length);
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i2 = this.f11040Z;
        this.f11040Z = i2 + 1;
        bArr2[i2] = this.f11038X;
    }

    /* renamed from: Z1 */
    public final void mo19109Z1(qw5 qw5) throws IOException {
        int appendQuotedUTF8 = qw5.appendQuotedUTF8(this.f11039Y, this.f11040Z);
        if (appendQuotedUTF8 < 0) {
            mo19086C1(qw5.asQuotedUTF8());
        } else {
            this.f11040Z += appendQuotedUTF8;
        }
    }

    /* renamed from: a1 */
    public void mo13862a1(char[] cArr, int i, int i2) throws IOException {
        mo18747l1("write a string");
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i3 = this.f11040Z;
        int i4 = i3 + 1;
        this.f11040Z = i4;
        bArr[i3] = this.f11038X;
        if (i2 <= this.f11044k0) {
            if (i4 + i2 > this.f11042e0) {
                mo19111s1();
            }
            mo19101R1(cArr, i, i2);
        } else {
            mo19108Y1(cArr, i, i2);
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i5 = this.f11040Z;
        this.f11040Z = i5 + 1;
        bArr2[i5] = this.f11038X;
    }

    /* renamed from: a2 */
    public void mo19110a2(String str, int i, int i2) throws IOException {
        char c;
        char[] cArr = this.f11045v0;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            mo13836C0(cArr, 0, i2);
            return;
        }
        int i3 = this.f11042e0;
        int min = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = min * 3;
        while (i2 > 0) {
            int min2 = Math.min(min, i2);
            str.getChars(i, i + min2, cArr, 0);
            if (this.f11040Z + i4 > this.f11042e0) {
                mo19111s1();
            }
            if (min2 > 1 && (c = cArr[min2 - 1]) >= 55296 && c <= 56319) {
                min2--;
            }
            mo19098O1(cArr, 0, min2);
            i += min2;
            i2 -= min2;
        }
    }

    /* renamed from: b0 */
    public void mo13864b0(String str) throws IOException {
        if (this.f9817a != null) {
            mo19093J1(str);
            return;
        }
        int w = this.f10689x.mo24469w(str);
        if (w == 4) {
            mo13861a("Can not write a field name, expecting a value");
        }
        if (w == 1) {
            if (this.f11040Z >= this.f11042e0) {
                mo19111s1();
            }
            byte[] bArr = this.f11039Y;
            int i = this.f11040Z;
            this.f11040Z = i + 1;
            bArr[i] = 44;
        }
        if (this.f18384M) {
            mo19107X1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f11041b1) {
            mo19107X1(str, true);
            return;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr2 = this.f11039Y;
        int i2 = this.f11040Z;
        int i3 = i2 + 1;
        this.f11040Z = i3;
        bArr2[i2] = this.f11038X;
        if (length <= this.f11044k0) {
            if (i3 + length > this.f11042e0) {
                mo19111s1();
            }
            mo19100Q1(str, 0, length);
        } else {
            mo19106W1(str, 0, length);
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr3 = this.f11039Y;
        int i4 = this.f11040Z;
        this.f11040Z = i4 + 1;
        bArr3[i4] = this.f11038X;
    }

    /* renamed from: c0 */
    public void mo13866c0() throws IOException {
        mo18747l1("write a null");
        mo19091H1();
    }

    public void close() throws IOException {
        super.close();
        if (this.f11039Y != null && mo13889m(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
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
        mo19111s1();
        this.f11040Z = 0;
        if (this.f11037U != null) {
            if (this.f18379B.mo24744n() || mo13889m(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.f11037U.close();
            } else if (mo13889m(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.f11037U.flush();
            }
        }
        mo19117y1();
    }

    /* renamed from: e0 */
    public void mo13872e0(double d) throws IOException {
        if (this.f10688s || (lc4.m21387o(d) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f10687r))) {
            mo13860Z0(String.valueOf(d));
            return;
        }
        mo18747l1("write a number");
        mo13834B0(String.valueOf(d));
    }

    public void flush() throws IOException {
        mo19111s1();
        if (this.f11037U != null && mo13889m(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f11037U.flush();
        }
    }

    /* renamed from: g0 */
    public void mo13877g0(float f) throws IOException {
        if (this.f10688s || (lc4.m21388p(f) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f10687r))) {
            mo13860Z0(String.valueOf(f));
            return;
        }
        mo18747l1("write a number");
        mo13834B0(String.valueOf(f));
    }

    /* renamed from: h0 */
    public void mo13880h0(int i) throws IOException {
        mo18747l1("write a number");
        if (this.f11040Z + 11 >= this.f11042e0) {
            mo19111s1();
        }
        if (this.f10688s) {
            mo19094K1(i);
        } else {
            this.f11040Z = lc4.m21389q(i, this.f11039Y, this.f11040Z);
        }
    }

    /* renamed from: i0 */
    public void mo13882i0(long j) throws IOException {
        mo18747l1("write a number");
        if (this.f10688s) {
            mo19095L1(j);
            return;
        }
        if (this.f11040Z + 21 >= this.f11042e0) {
            mo19111s1();
        }
        this.f11040Z = lc4.m21391s(j, this.f11039Y, this.f11040Z);
    }

    /* renamed from: j0 */
    public void mo13884j0(String str) throws IOException {
        mo18747l1("write a number");
        if (str == null) {
            mo19091H1();
        } else if (this.f10688s) {
            mo19096M1(str);
        } else {
            mo13834B0(str);
        }
    }

    /* renamed from: k0 */
    public void mo13886k0(BigDecimal bigDecimal) throws IOException {
        mo18747l1("write a number");
        if (bigDecimal == null) {
            mo19091H1();
        } else if (this.f10688s) {
            mo19096M1(mo18744h1(bigDecimal));
        } else {
            mo13834B0(mo18744h1(bigDecimal));
        }
    }

    /* renamed from: l0 */
    public void mo13888l0(BigInteger bigInteger) throws IOException {
        mo18747l1("write a number");
        if (bigInteger == null) {
            mo19091H1();
        } else if (this.f10688s) {
            mo19096M1(bigInteger.toString());
        } else {
            mo13834B0(bigInteger.toString());
        }
    }

    /* renamed from: l1 */
    public final void mo18747l1(String str) throws IOException {
        byte b;
        int x = this.f10689x.mo24470x();
        if (this.f9817a != null) {
            mo26652r1(str, x);
            return;
        }
        if (x == 1) {
            b = 44;
        } else if (x == 2) {
            b = 58;
        } else if (x == 3) {
            qw5 qw5 = this.f18383L;
            if (qw5 != null) {
                byte[] asUnquotedUTF8 = qw5.asUnquotedUTF8();
                if (asUnquotedUTF8.length > 0) {
                    mo19086C1(asUnquotedUTF8);
                    return;
                }
                return;
            }
            return;
        } else if (x == 5) {
            mo26651q1(str);
            return;
        } else {
            return;
        }
        if (this.f11040Z >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i = this.f11040Z;
        this.f11040Z = i + 1;
        bArr[i] = b;
    }

    /* renamed from: o0 */
    public void mo13891o0(short s) throws IOException {
        mo18747l1("write a number");
        if (this.f11040Z + 6 >= this.f11042e0) {
            mo19111s1();
        }
        if (this.f10688s) {
            mo19097N1(s);
        } else {
            this.f11040Z = lc4.m21389q(s, this.f11039Y, this.f11040Z);
        }
    }

    /* renamed from: s1 */
    public final void mo19111s1() throws IOException {
        int i = this.f11040Z;
        if (i > 0) {
            this.f11040Z = 0;
            this.f11037U.write(this.f11039Y, 0, i);
        }
    }

    /* renamed from: t1 */
    public final int mo19112t1(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException, JsonGenerationException {
        int length = bArr2.length;
        if (i + length > i2) {
            this.f11040Z = i;
            mo19111s1();
            i = this.f11040Z;
            if (length > bArr.length) {
                this.f11037U.write(bArr2, 0, length);
                return i;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        int i4 = i + length;
        if ((i3 * 6) + i4 <= i2) {
            return i4;
        }
        this.f11040Z = i4;
        mo19111s1();
        return this.f11040Z;
    }

    /* renamed from: u1 */
    public final int mo19113u1(int i, int i2) throws IOException {
        byte[] bArr = this.f11039Y;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            bArr[i4] = (byte) ((i & 63) | 128);
            return i4 + 1;
        }
        int i5 = i2 + 1;
        bArr[i2] = 92;
        int i6 = i5 + 1;
        bArr[i5] = 117;
        int i7 = i6 + 1;
        byte[] bArr2 = f11033o1;
        bArr[i6] = bArr2[(i >> 12) & 15];
        int i8 = i7 + 1;
        bArr[i7] = bArr2[(i >> 8) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 4) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[i & 15];
        return i10;
    }

    /* renamed from: v1 */
    public final int mo19114v1(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.f11039Y;
            int i4 = this.f11040Z;
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.f11040Z = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3 || cArr == null) {
            mo13861a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i)}));
        } else {
            mo19115w1(i, cArr[i2]);
        }
        return i2 + 1;
    }

    /* renamed from: w1 */
    public final void mo19115w1(int i, int i2) throws IOException {
        int k1 = mo18746k1(i, i2);
        if (this.f11040Z + 4 > this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        int i3 = this.f11040Z;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((k1 >> 18) | 240);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (((k1 >> 12) & 63) | 128);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((k1 >> 6) & 63) | 128);
        this.f11040Z = i6 + 1;
        bArr[i6] = (byte) ((k1 & 63) | 128);
    }

    /* renamed from: x1 */
    public final int mo19116x1(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
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
        if (this.f11040Z + 3 >= this.f11042e0) {
            mo19111s1();
        }
        byte[] bArr = this.f11039Y;
        if (c <= 127) {
            int i = this.f11040Z;
            this.f11040Z = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.f11040Z;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f11040Z = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            mo19114v1(c, (char[]) null, 0, 0);
        }
    }

    /* renamed from: y1 */
    public void mo19117y1() {
        byte[] bArr = this.f11039Y;
        if (bArr != null && this.f11043e1) {
            this.f11039Y = null;
            this.f18379B.mo24750t(bArr);
        }
        char[] cArr = this.f11045v0;
        if (cArr != null) {
            this.f11045v0 = null;
            this.f18379B.mo24746p(cArr);
        }
    }

    /* renamed from: z1 */
    public final int mo19118z1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int i = this.f11042e0 - 6;
        int i2 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 > i3) {
                i5 = mo19116x1(inputStream, bArr, i4, i5, bArr.length);
                if (i5 < 3) {
                    break;
                }
                i3 = i5 - 3;
                i4 = 0;
            }
            if (this.f11040Z > i) {
                mo19111s1();
            }
            int i7 = i4 + 1;
            int i8 = i7 + 1;
            i4 = i8 + 1;
            i6 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i7] & 255) | (bArr[i4] << 8)) << 8) | (bArr[i8] & 255), this.f11039Y, this.f11040Z);
            this.f11040Z = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.f11039Y;
                int i9 = encodeBase64Chunk + 1;
                bArr2[encodeBase64Chunk] = 92;
                this.f11040Z = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i5 <= 0) {
            return i6;
        }
        if (this.f11040Z > i) {
            mo19111s1();
        }
        int i10 = bArr[0] << 16;
        if (1 < i5) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i6 + i2;
        this.f11040Z = base64Variant.encodeBase64Partial(i10, i2, this.f11039Y, this.f11040Z);
        return i11;
    }
}
