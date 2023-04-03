package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: f37 */
/* compiled from: UTF8StreamJsonParser */
public class f37 extends lm4 {

    /* renamed from: P1 */
    public static final int f11505P1 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* renamed from: Q1 */
    public static final int f11506Q1 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* renamed from: R1 */
    public static final int f11507R1 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();

    /* renamed from: S1 */
    public static final int f11508S1 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* renamed from: T1 */
    public static final int f11509T1 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* renamed from: U1 */
    public static final int f11510U1 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* renamed from: V1 */
    public static final int f11511V1 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* renamed from: W1 */
    public static final int f11512W1 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* renamed from: X1 */
    public static final int[] f11513X1 = ud0.m28150j();

    /* renamed from: Y1 */
    public static final int[] f11514Y1 = ud0.m28148h();

    /* renamed from: E1 */
    public xe4 f11515E1;

    /* renamed from: F1 */
    public final y60 f11516F1;

    /* renamed from: G1 */
    public int[] f11517G1 = new int[16];

    /* renamed from: H1 */
    public boolean f11518H1;

    /* renamed from: I1 */
    public int f11519I1;

    /* renamed from: J1 */
    public int f11520J1;

    /* renamed from: K1 */
    public int f11521K1;

    /* renamed from: L1 */
    public int f11522L1;

    /* renamed from: M1 */
    public InputStream f11523M1;

    /* renamed from: N1 */
    public byte[] f11524N1;

    /* renamed from: O1 */
    public boolean f11525O1;

    public f37(po2 po2, int i, InputStream inputStream, xe4 xe4, y60 y60, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(po2, i);
        this.f11523M1 = inputStream;
        this.f11515E1 = xe4;
        this.f11516F1 = y60;
        this.f11524N1 = bArr;
        this.f14566Q = i2;
        this.f14567U = i3;
        this.f14570Z = i2 - i4;
        this.f14568X = (long) ((-i2) + i4);
        this.f11525O1 = z;
    }

    /* renamed from: S2 */
    public static final int m16499S2(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    /* renamed from: A2 */
    public final int mo19611A2(int i) throws IOException {
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr = this.f11524N1;
        int i2 = this.f14566Q;
        int i3 = i2 + 1;
        this.f14566Q = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo19654e3(b & 255, i3);
        }
        byte b2 = ((i & 7) << 6) | (b & 63);
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr2 = this.f11524N1;
        int i4 = this.f14566Q;
        int i5 = i4 + 1;
        this.f14566Q = i5;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            mo19654e3(b3 & 255, i5);
        }
        byte b4 = (b2 << 6) | (b3 & 63);
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr3 = this.f11524N1;
        int i6 = this.f14566Q;
        int i7 = i6 + 1;
        this.f14566Q = i7;
        byte b5 = bArr3[i6];
        if ((b5 & 192) != 128) {
            mo19654e3(b5 & 255, i7);
        }
        return ((b4 << 6) | (b5 & 63)) - 65536;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* renamed from: A3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo19612A3(int[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            en6 r8 = r0.f14575o1
            char[] r8 = r8.mo19414m()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00f5
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00e2
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r5 = 1
            if (r13 != r14) goto L_0x0044
            r12 = r12 & 31
            r13 = r5
            goto L_0x005d
        L_0x0044:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x004e
            r12 = r12 & 15
            r13 = 2
            goto L_0x005d
        L_0x004e:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x0058
            r12 = r12 & 7
            r13 = r7
            goto L_0x005d
        L_0x0058:
            r0.mo19652c3(r12)
            r12 = r5
            r13 = r12
        L_0x005d:
            int r14 = r10 + r13
            if (r14 <= r4) goto L_0x0068
            com.fasterxml.jackson.core.JsonToken r14 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            java.lang.String r6 = " in field name"
            r0.mo23230v1(r6, r14)
        L_0x0068:
            int r6 = r10 >> 2
            r6 = r1[r6]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r6 = r6 >> r14
            int r10 = r10 + 1
            r14 = r6 & 192(0xc0, float:2.69E-43)
            r15 = 128(0x80, float:1.794E-43)
            if (r14 == r15) goto L_0x007d
            r0.mo19653d3(r6)
        L_0x007d:
            int r12 = r12 << 6
            r6 = r6 & 63
            r6 = r6 | r12
            if (r13 <= r5) goto L_0x00be
            int r5 = r10 >> 2
            r5 = r1[r5]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r5 = r5 >> r12
            int r10 = r10 + 1
            r12 = r5 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x0097
            r0.mo19653d3(r5)
        L_0x0097:
            int r6 = r6 << 6
            r5 = r5 & 63
            r5 = r5 | r6
            r6 = 2
            if (r13 <= r6) goto L_0x00bb
            int r6 = r10 >> 2
            r6 = r1[r6]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r6 = r6 >> r12
            int r10 = r10 + 1
            r12 = r6 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x00b4
            r12 = r6 & 255(0xff, float:3.57E-43)
            r0.mo19653d3(r12)
        L_0x00b4:
            int r5 = r5 << 6
            r6 = r6 & 63
            r5 = r5 | r6
            r12 = r5
            goto L_0x00bf
        L_0x00bb:
            r12 = r5
            r5 = r6
            goto L_0x00c0
        L_0x00be:
            r12 = r6
        L_0x00bf:
            r5 = 2
        L_0x00c0:
            if (r13 <= r5) goto L_0x00e2
            r5 = 65536(0x10000, float:9.18355E-41)
            int r12 = r12 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00cf
            en6 r5 = r0.f14575o1
            char[] r5 = r5.mo19416o()
            r8 = r5
        L_0x00cf:
            int r5 = r11 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r13 = r12 >> 10
            int r13 = r13 + r6
            char r6 = (char) r13
            r8[r11] = r6
            r6 = 56320(0xdc00, float:7.8921E-41)
            r11 = r12 & 1023(0x3ff, float:1.434E-42)
            r12 = r11 | r6
            r11 = r5
        L_0x00e2:
            int r5 = r8.length
            if (r11 < r5) goto L_0x00ec
            en6 r5 = r0.f14575o1
            char[] r5 = r5.mo19416o()
            r8 = r5
        L_0x00ec:
            int r5 = r11 + 1
            char r6 = (char) r12
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00f5:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x0102
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x0102:
            y60 r3 = r0.f11516F1
            java.lang.String r1 = r3.mo27958p(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f37.mo19612A3(int[], int, int):java.lang.String");
    }

    /* renamed from: B2 */
    public String mo19613B2() throws IOException {
        int i = this.f14566Q;
        if (i >= this.f14567U) {
            mo19631K2();
            i = this.f14566Q;
        }
        int i2 = 0;
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f11513X1;
        int min = Math.min(this.f14567U, m.length + i);
        byte[] bArr = this.f11524N1;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                m[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.f14566Q = i + 1;
                return this.f14575o1.mo19398D(i2);
            }
        }
        this.f14566Q = i;
        mo19617D2(m, i2);
        return this.f14575o1.mo19413l();
    }

    /* renamed from: B3 */
    public final String mo19614B3(int i, int i2) throws JsonParseException {
        int S2 = m16499S2(i, i2);
        String w = this.f11516F1.mo27964w(S2);
        if (w != null) {
            return w;
        }
        int[] iArr = this.f11517G1;
        iArr[0] = S2;
        return mo19612A3(iArr, 1, i2);
    }

    /* renamed from: C2 */
    public void mo19615C2() throws IOException {
        int i = this.f14566Q;
        if (i >= this.f14567U) {
            mo19631K2();
            i = this.f14566Q;
        }
        int i2 = 0;
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f11513X1;
        int min = Math.min(this.f14567U, m.length + i);
        byte[] bArr = this.f11524N1;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                m[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.f14566Q = i + 1;
                this.f14575o1.mo19399E(i2);
                return;
            }
        }
        this.f14566Q = i;
        mo19617D2(m, i2);
    }

    /* renamed from: C3 */
    public final String mo19616C3(int i, int i2, int i3) throws JsonParseException {
        int S2 = m16499S2(i2, i3);
        String x = this.f11516F1.mo27965x(i, S2);
        if (x != null) {
            return x;
        }
        int[] iArr = this.f11517G1;
        iArr[0] = i;
        iArr[1] = S2;
        return mo19612A3(iArr, 2, i3);
    }

    /* renamed from: D2 */
    public final void mo19617D2(char[] cArr, int i) throws IOException {
        int[] iArr = f11513X1;
        byte[] bArr = this.f11524N1;
        while (true) {
            int i2 = this.f14566Q;
            if (i2 >= this.f14567U) {
                mo19631K2();
                i2 = this.f14566Q;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.f14575o1.mo19417p();
                i = 0;
            }
            int min = Math.min(this.f14567U, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.f14566Q = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = iArr[i5];
                if (i6 != 0) {
                    this.f14566Q = i4;
                    if (i5 == 34) {
                        this.f14575o1.mo19399E(i);
                        return;
                    }
                    if (i6 == 1) {
                        i5 = mo18445P1();
                    } else if (i6 == 2) {
                        i5 = mo19679x2(i5);
                    } else if (i6 == 3) {
                        i5 = this.f14567U - i4 >= 2 ? mo19683z2(i5) : mo19681y2(i5);
                    } else if (i6 == 4) {
                        int A2 = mo19611A2(i5);
                        int i7 = i + 1;
                        cArr[i] = (char) (55296 | (A2 >> 10));
                        if (i7 >= cArr.length) {
                            cArr = this.f14575o1.mo19417p();
                            i = 0;
                        } else {
                            i = i7;
                        }
                        i5 = (A2 & 1023) | 56320;
                    } else if (i5 < 32) {
                        mo22829b2(i5, "string value");
                    } else {
                        mo19651b3(i5);
                    }
                    if (i >= cArr.length) {
                        cArr = this.f14575o1.mo19417p();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    /* renamed from: D3 */
    public final String mo19618D3(int i, int i2, int i3, int i4) throws JsonParseException {
        int S2 = m16499S2(i3, i4);
        String y = this.f11516F1.mo27966y(i, i2, S2);
        if (y != null) {
            return y;
        }
        int[] iArr = this.f11517G1;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = m16499S2(S2, i4);
        return mo19612A3(iArr, 3, i4);
    }

    /* renamed from: E0 */
    public String mo13930E0() throws IOException {
        JsonToken jsonToken;
        this.f14580t1 = 0;
        JsonToken jsonToken2 = this.f15012g;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            mo19641Q2();
            return null;
        }
        if (this.f11518H1) {
            mo19663n3();
        }
        int t3 = mo19672t3();
        if (t3 < 0) {
            close();
            this.f15012g = null;
            return null;
        }
        this.f14579s1 = null;
        if (t3 == 93) {
            mo19669s2();
            this.f15012g = JsonToken.END_ARRAY;
            return null;
        } else if (t3 == 125) {
            mo19671t2();
            this.f15012g = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this.f14571b1.mo26153p()) {
                if (t3 != 44) {
                    mo23233y1(t3, "was expecting comma to separate " + this.f14571b1.mo28330j() + " entries");
                }
                t3 = mo19668r3();
                if ((this.f9822a & f11505P1) != 0 && (t3 == 93 || t3 == 125)) {
                    mo19673u2(t3);
                    return null;
                }
            }
            if (!this.f14571b1.mo28328g()) {
                mo19678w3();
                mo19642R2(t3);
                return null;
            }
            mo19680x3();
            String W2 = mo19646W2(t3);
            this.f14571b1.mo26157t(W2);
            this.f15012g = jsonToken3;
            int j3 = mo19659j3();
            mo19678w3();
            if (j3 == 34) {
                this.f11518H1 = true;
                this.f14573e1 = JsonToken.VALUE_STRING;
                return W2;
            }
            if (j3 == 45) {
                jsonToken = mo19647X2();
            } else if (j3 == 46) {
                jsonToken = mo19645V2();
            } else if (j3 == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (j3 == 102) {
                mo19633L2();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (j3 == 110) {
                mo19635M2();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (j3 == 116) {
                mo19640P2();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (j3 != 123) {
                switch (j3) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = mo19649Z2(j3);
                        break;
                    default:
                        jsonToken = mo19627I2(j3);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this.f14573e1 = jsonToken;
            return W2;
        }
    }

    /* renamed from: E2 */
    public final String mo19619E2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.mo14000id();
        if (id == 5) {
            return this.f14571b1.mo11435b();
        }
        if (id == 6 || id == 7 || id == 8) {
            return this.f14575o1.mo19413l();
        }
        return jsonToken.asString();
    }

    /* renamed from: E3 */
    public final String mo19620E3(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = lm4.m21533k2(iArr, iArr.length);
            this.f11517G1 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = m16499S2(i2, i3);
        String z = this.f11516F1.mo27967z(iArr, i4);
        if (z == null) {
            return mo19612A3(iArr, i4, i3);
        }
        return z;
    }

    /* renamed from: F2 */
    public JsonToken mo19621F2() throws IOException {
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f11513X1;
        byte[] bArr = this.f11524N1;
        int i = 0;
        while (true) {
            if (this.f14566Q >= this.f14567U) {
                mo19631K2();
            }
            if (i >= m.length) {
                m = this.f14575o1.mo19417p();
                i = 0;
            }
            int i2 = this.f14567U;
            int length = this.f14566Q + (m.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this.f14566Q;
                if (i3 >= i2) {
                    break;
                }
                int i4 = i3 + 1;
                this.f14566Q = i4;
                int i5 = bArr[i3] & 255;
                if (i5 == 39) {
                    this.f14575o1.mo19399E(i);
                    return JsonToken.VALUE_STRING;
                }
                int i6 = iArr[i5];
                if (i6 == 0 || i5 == 34) {
                    m[i] = (char) i5;
                    i++;
                } else {
                    if (i6 == 1) {
                        i5 = mo18445P1();
                    } else if (i6 == 2) {
                        i5 = mo19679x2(i5);
                    } else if (i6 != 3) {
                        if (i6 != 4) {
                            if (i5 < 32) {
                                mo22829b2(i5, "string value");
                            }
                            mo19651b3(i5);
                        } else {
                            int A2 = mo19611A2(i5);
                            int i7 = i + 1;
                            m[i] = (char) (55296 | (A2 >> 10));
                            if (i7 >= m.length) {
                                m = this.f14575o1.mo19417p();
                                i = 0;
                            } else {
                                i = i7;
                            }
                            i5 = 56320 | (A2 & 1023);
                        }
                    } else if (this.f14567U - i4 >= 2) {
                        i5 = mo19683z2(i5);
                    } else {
                        i5 = mo19681y2(i5);
                    }
                    if (i >= m.length) {
                        m = this.f14575o1.mo19417p();
                        i = 0;
                    }
                    m[i] = (char) i5;
                    i++;
                }
            }
        }
    }

    /* renamed from: F3 */
    public final int mo19622F3() throws IOException {
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr = this.f11524N1;
        int i = this.f14566Q;
        this.f14566Q = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: G */
    public Object mo13931G() {
        return this.f11523M1;
    }

    /* renamed from: G0 */
    public String mo13932G0() throws IOException {
        if (this.f15012g == JsonToken.FIELD_NAME) {
            this.f14577q1 = false;
            JsonToken jsonToken = this.f14573e1;
            this.f14573e1 = null;
            this.f15012g = jsonToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this.f14571b1 = this.f14571b1.mo26151m(this.f14574k0, this.f14582v0);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this.f14571b1 = this.f14571b1.mo26152n(this.f14574k0, this.f14582v0);
                }
                return null;
            } else if (!this.f11518H1) {
                return this.f14575o1.mo19413l();
            } else {
                this.f11518H1 = false;
                return mo19613B2();
            }
        } else if (mo13938N0() == JsonToken.VALUE_STRING) {
            return mo13947W();
        } else {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v2 ?, r4v6 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: G2 */
    public com.fasterxml.jackson.core.JsonToken mo19623G2(
/*
Method generation error in method: f37.G2(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* renamed from: G3 */
    public final String mo19624G3(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = f11514Y1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    mo22829b2(i3, PublicResolver.FUNC_NAME);
                } else {
                    i3 = mo18445P1();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (r10 >= 4) {
                        if (i >= iArr.length) {
                            iArr = lm4.m21533k2(iArr, iArr.length);
                            this.f11517G1 = iArr;
                        }
                        iArr[i] = r8;
                        i++;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i3 < 2048) {
                        r8 = (r8 << 8) | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i6 = (r8 << 8) | (i3 >> 12) | 224;
                        int i7 = r10 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = lm4.m21533k2(iArr, iArr.length);
                                this.f11517G1 = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        r8 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = lm4.m21533k2(iArr, iArr.length);
                    this.f11517G1 = iArr;
                }
                iArr[i] = r8;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                mo23230v1(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.f11524N1;
            int i8 = this.f14566Q;
            this.f14566Q = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (r10 > 0) {
            if (i >= iArr.length) {
                iArr = lm4.m21533k2(iArr, iArr.length);
                this.f11517G1 = iArr;
            }
            iArr[i] = m16499S2(r8, r10);
            i++;
        }
        String z = this.f11516F1.mo27967z(iArr, i);
        if (z == null) {
            return mo19612A3(iArr, i, r10);
        }
        return z;
    }

    /* renamed from: H2 */
    public String mo19625H2(int i) throws IOException {
        if (i == 39 && (this.f9822a & f11509T1) != 0) {
            return mo19643T2();
        }
        if ((this.f9822a & f11510U1) == 0) {
            mo23233y1((char) mo19677w2(i), "was expecting double-quote to start field name");
        }
        int[] k = ud0.m28151k();
        if (k[i] != 0) {
            mo23233y1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.f11517G1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArr.length) {
                    iArr = lm4.m21533k2(iArr, iArr.length);
                    this.f11517G1 = iArr;
                }
                iArr[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                mo23230v1(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.f11524N1;
            int i5 = this.f14566Q;
            i = bArr[i5] & 255;
            if (k[i] != 0) {
                break;
            }
            this.f14566Q = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] k2 = lm4.m21533k2(iArr, iArr.length);
                this.f11517G1 = k2;
                iArr = k2;
            }
            iArr[i3] = i4;
            i3++;
        }
        String z = this.f11516F1.mo27967z(iArr, i3);
        if (z == null) {
            return mo19612A3(iArr, i3, i2);
        }
        return z;
    }

    /* renamed from: H3 */
    public final String mo19626H3(int i, int i2, int i3) throws IOException {
        int[] iArr = this.f11517G1;
        iArr[0] = this.f11519I1;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this.f11524N1;
        int[] iArr2 = f11514Y1;
        byte b = i;
        int i4 = 3;
        while (true) {
            int i5 = this.f14566Q;
            if (i5 + 4 <= this.f14567U) {
                int i6 = i5 + 1;
                this.f14566Q = i6;
                byte b2 = bArr[i5] & 255;
                if (iArr2[b2] == 0) {
                    byte b3 = (b << 8) | b2;
                    int i7 = i6 + 1;
                    this.f14566Q = i7;
                    byte b4 = bArr[i6] & 255;
                    if (iArr2[b4] == 0) {
                        byte b5 = (b3 << 8) | b4;
                        int i8 = i7 + 1;
                        this.f14566Q = i8;
                        byte b6 = bArr[i7] & 255;
                        if (iArr2[b6] == 0) {
                            int i9 = (b5 << 8) | b6;
                            this.f14566Q = i8 + 1;
                            byte b7 = bArr[i8] & 255;
                            if (iArr2[b7] == 0) {
                                int[] iArr3 = this.f11517G1;
                                if (i4 >= iArr3.length) {
                                    this.f11517G1 = lm4.m21533k2(iArr3, i4);
                                }
                                this.f11517G1[i4] = i9;
                                b = b7;
                                i4++;
                            } else if (b7 == 34) {
                                return mo19620E3(this.f11517G1, i4, i9, 4);
                            } else {
                                return mo19624G3(this.f11517G1, i4, i9, b7, 4);
                            }
                        } else if (b6 == 34) {
                            return mo19620E3(this.f11517G1, i4, b5, 3);
                        } else {
                            return mo19624G3(this.f11517G1, i4, b5, b6, 3);
                        }
                    } else if (b4 == 34) {
                        return mo19620E3(this.f11517G1, i4, b3, 2);
                    } else {
                        return mo19624G3(this.f11517G1, i4, b3, b4, 2);
                    }
                } else if (b2 == 34) {
                    return mo19620E3(this.f11517G1, i4, b, 1);
                } else {
                    return mo19624G3(this.f11517G1, i4, b, b2, 1);
                }
            } else {
                return mo19624G3(this.f11517G1, i4, 0, b, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.f14571b1.mo28327f() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* renamed from: I2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken mo19627I2(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x009a
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x0081
            r0 = 78
            if (r4 == r0) goto L_0x0068
            r0 = 93
            if (r4 == r0) goto L_0x0042
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x0062
            r0 = 43
            if (r4 == r0) goto L_0x001f
            r0 = 44
            if (r4 == r0) goto L_0x004b
            goto L_0x00a6
        L_0x001f:
            int r4 = r3.f14566Q
            int r0 = r3.f14567U
            if (r4 < r0) goto L_0x0030
            boolean r4 = r3.mo19629J2()
            if (r4 != 0) goto L_0x0030
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3.mo23231w1(r4)
        L_0x0030:
            byte[] r4 = r3.f11524N1
            int r0 = r3.f14566Q
            int r1 = r0 + 1
            r3.f14566Q = r1
            byte r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo19623G2(r4, r0)
            return r4
        L_0x0042:
            t53 r0 = r3.f14571b1
            boolean r0 = r0.mo28327f()
            if (r0 != 0) goto L_0x004b
            goto L_0x00a6
        L_0x004b:
            t53 r0 = r3.f14571b1
            boolean r0 = r0.mo28329h()
            if (r0 != 0) goto L_0x0062
            int r0 = r3.f9822a
            int r2 = f11508S1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0062
            int r4 = r3.f14566Q
            int r4 = r4 - r1
            r3.f14566Q = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x0062:
            java.lang.String r0 = "expected a value"
            r3.mo23233y1(r4, r0)
            goto L_0x009a
        L_0x0068:
            java.lang.String r0 = "NaN"
            r3.mo19637N2(r0, r1)
            int r1 = r3.f9822a
            int r2 = f11507R1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x007b
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo22841o2(r0, r1)
            return r4
        L_0x007b:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.mo23225q1(r0)
            goto L_0x00a6
        L_0x0081:
            java.lang.String r0 = "Infinity"
            r3.mo19637N2(r0, r1)
            int r1 = r3.f9822a
            int r2 = f11507R1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0094
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo22841o2(r0, r1)
            return r4
        L_0x0094:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.mo23225q1(r0)
            goto L_0x00a6
        L_0x009a:
            int r0 = r3.f9822a
            int r1 = f11509T1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a6
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo19621F2()
            return r4
        L_0x00a6:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00c5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.mo22830c2()
            r3.mo19656g3(r0, r1)
        L_0x00c5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected a valid value "
            r0.append(r1)
            java.lang.String r1 = r3.mo22831d2()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.mo23233y1(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f37.mo19627I2(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: I3 */
    public final String mo19628I3(int i) throws IOException {
        byte[] bArr = this.f11524N1;
        int[] iArr = f11514Y1;
        int i2 = this.f14566Q;
        int i3 = i2 + 1;
        this.f14566Q = i3;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i << 8) | b;
            int i4 = i3 + 1;
            this.f14566Q = i4;
            byte b3 = bArr[i3] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i5 = i4 + 1;
                this.f14566Q = i5;
                byte b5 = bArr[i4] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    this.f14566Q = i5 + 1;
                    byte b7 = bArr[i5] & 255;
                    if (iArr[b7] == 0) {
                        return mo19630J3(b7, b6);
                    }
                    if (b7 == 34) {
                        return mo19616C3(this.f11519I1, b6, 4);
                    }
                    return mo19634L3(this.f11519I1, b6, b7, 4);
                } else if (b5 == 34) {
                    return mo19616C3(this.f11519I1, b4, 3);
                } else {
                    return mo19634L3(this.f11519I1, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return mo19616C3(this.f11519I1, b2, 2);
            } else {
                return mo19634L3(this.f11519I1, b2, b3, 2);
            }
        } else if (b == 34) {
            return mo19616C3(this.f11519I1, i, 1);
        } else {
            return mo19634L3(this.f11519I1, i, b, 1);
        }
    }

    /* renamed from: J2 */
    public final boolean mo19629J2() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.f11523M1;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this.f11524N1), 0, length);
        if (read > 0) {
            int i = this.f14567U;
            this.f14568X += (long) i;
            this.f14570Z -= i;
            this.f11520J1 -= i;
            this.f14566Q = 0;
            this.f14567U = read;
            return true;
        }
        mo18440L1();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.f11524N1.length + " bytes");
        }
        return false;
    }

    /* renamed from: J3 */
    public final String mo19630J3(int i, int i2) throws IOException {
        byte[] bArr = this.f11524N1;
        int[] iArr = f11514Y1;
        int i3 = this.f14566Q;
        int i4 = i3 + 1;
        this.f14566Q = i4;
        byte b = bArr[i3] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i << 8) | b;
            int i5 = i4 + 1;
            this.f14566Q = i5;
            byte b3 = bArr[i4] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i6 = i5 + 1;
                this.f14566Q = i6;
                byte b5 = bArr[i5] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    this.f14566Q = i6 + 1;
                    byte b7 = bArr[i6] & 255;
                    if (iArr[b7] == 0) {
                        return mo19626H3(b7, i2, b6);
                    }
                    if (b7 == 34) {
                        return mo19618D3(this.f11519I1, i2, b6, 4);
                    }
                    return mo19636M3(this.f11519I1, i2, b6, b7, 4);
                } else if (b5 == 34) {
                    return mo19618D3(this.f11519I1, i2, b4, 3);
                } else {
                    return mo19636M3(this.f11519I1, i2, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return mo19618D3(this.f11519I1, i2, b2, 2);
            } else {
                return mo19636M3(this.f11519I1, i2, b2, b3, 2);
            }
        } else if (b == 34) {
            return mo19618D3(this.f11519I1, i2, i, 1);
        } else {
            return mo19636M3(this.f11519I1, i2, i, b, 1);
        }
    }

    /* renamed from: K2 */
    public void mo19631K2() throws IOException {
        if (!mo19629J2()) {
            mo23229u1();
        }
    }

    /* renamed from: K3 */
    public final String mo19632K3(int i, int i2, int i3) throws IOException {
        return mo19624G3(this.f11517G1, 0, i, i2, i3);
    }

    /* renamed from: L1 */
    public void mo18440L1() throws IOException {
        if (this.f11523M1 != null) {
            if (this.f14564M.mo24744n() || mo13989y0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.f11523M1.close();
            }
            this.f11523M1 = null;
        }
    }

    /* renamed from: L2 */
    public final void mo19633L2() throws IOException {
        byte b;
        int i = this.f14566Q;
        if (i + 4 < this.f14567U) {
            byte[] bArr = this.f11524N1;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 115) {
                        int i5 = i4 + 1;
                        if (bArr[i4] == 101 && ((b = bArr[i5] & 255) < 48 || b == 93 || b == 125)) {
                            this.f14566Q = i5;
                            return;
                        }
                    }
                }
            }
        }
        mo19639O2("false", 1);
    }

    /* renamed from: L3 */
    public final String mo19634L3(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this.f11517G1;
        iArr[0] = i;
        return mo19624G3(iArr, 1, i2, i3, i4);
    }

    /* renamed from: M2 */
    public final void mo19635M2() throws IOException {
        byte b;
        int i = this.f14566Q;
        if (i + 3 < this.f14567U) {
            byte[] bArr = this.f11524N1;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 108 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.f14566Q = i4;
                        return;
                    }
                }
            }
        }
        mo19639O2("null", 1);
    }

    /* renamed from: M3 */
    public final String mo19636M3(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.f11517G1;
        iArr[0] = i;
        iArr[1] = i2;
        return mo19624G3(iArr, 2, i3, i4, i5);
    }

    /* renamed from: N0 */
    public JsonToken mo13938N0() throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this.f15012g;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return mo19641Q2();
        }
        this.f14580t1 = 0;
        if (this.f11518H1) {
            mo19663n3();
        }
        int t3 = mo19672t3();
        if (t3 < 0) {
            close();
            this.f15012g = null;
            return null;
        }
        this.f14579s1 = null;
        if (t3 == 93) {
            mo19669s2();
            JsonToken jsonToken4 = JsonToken.END_ARRAY;
            this.f15012g = jsonToken4;
            return jsonToken4;
        } else if (t3 == 125) {
            mo19671t2();
            JsonToken jsonToken5 = JsonToken.END_OBJECT;
            this.f15012g = jsonToken5;
            return jsonToken5;
        } else {
            if (this.f14571b1.mo26153p()) {
                if (t3 != 44) {
                    mo23233y1(t3, "was expecting comma to separate " + this.f14571b1.mo28330j() + " entries");
                }
                t3 = mo19668r3();
                if ((this.f9822a & f11505P1) != 0 && (t3 == 93 || t3 == 125)) {
                    return mo19673u2(t3);
                }
            }
            if (!this.f14571b1.mo28328g()) {
                mo19678w3();
                return mo19642R2(t3);
            }
            mo19680x3();
            this.f14571b1.mo26157t(mo19646W2(t3));
            this.f15012g = jsonToken3;
            int j3 = mo19659j3();
            mo19678w3();
            if (j3 == 34) {
                this.f11518H1 = true;
                this.f14573e1 = JsonToken.VALUE_STRING;
                return this.f15012g;
            }
            if (j3 == 45) {
                jsonToken = mo19647X2();
            } else if (j3 == 46) {
                jsonToken = mo19645V2();
            } else if (j3 == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (j3 == 102) {
                mo19633L2();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (j3 == 110) {
                mo19635M2();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (j3 == 116) {
                mo19640P2();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (j3 != 123) {
                switch (j3) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = mo19649Z2(j3);
                        break;
                    default:
                        jsonToken = mo19627I2(j3);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this.f14573e1 = jsonToken;
            return this.f15012g;
        }
    }

    /* renamed from: N2 */
    public final void mo19637N2(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this.f14566Q + length >= this.f14567U) {
            mo19639O2(str, i);
            return;
        }
        do {
            if (this.f11524N1[this.f14566Q] != str.charAt(i)) {
                mo19655f3(str.substring(0, i));
            }
            i2 = this.f14566Q + 1;
            this.f14566Q = i2;
            i++;
        } while (i < length);
        byte b = this.f11524N1[i2] & 255;
        if (b >= 48 && b != 93 && b != 125) {
            mo19667r2(str, i, b);
        }
    }

    /* renamed from: N3 */
    public String mo19638N3() throws IOException {
        if (this.f14566Q >= this.f14567U && !mo19629J2()) {
            mo23230v1(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.f11524N1;
        int i = this.f14566Q;
        this.f14566Q = i + 1;
        byte b = bArr[i] & 255;
        if (b == 34) {
            return "";
        }
        return mo19624G3(this.f11517G1, 0, 0, b, 0);
    }

    /* renamed from: O2 */
    public final void mo19639O2(String str, int i) throws IOException {
        int i2;
        byte b;
        int length = str.length();
        do {
            if ((this.f14566Q >= this.f14567U && !mo19629J2()) || this.f11524N1[this.f14566Q] != str.charAt(i)) {
                mo19655f3(str.substring(0, i));
            }
            i2 = this.f14566Q + 1;
            this.f14566Q = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f14567U || mo19629J2()) && (b = this.f11524N1[this.f14566Q] & 255) >= 48 && b != 93 && b != 125) {
            mo19667r2(str, i, b);
        }
    }

    /* renamed from: P1 */
    public char mo18445P1() throws IOException {
        if (this.f14566Q >= this.f14567U && !mo19629J2()) {
            mo23230v1(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this.f11524N1;
        int i = this.f14566Q;
        this.f14566Q = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return 8;
        }
        if (b == 102) {
            return 12;
        }
        if (b == 110) {
            return 10;
        }
        if (b == 114) {
            return 13;
        }
        if (b == 116) {
            return 9;
        }
        if (b != 117) {
            return mo22822T1((char) mo19677w2(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                mo23230v1(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this.f11524N1;
            int i4 = this.f14566Q;
            this.f14566Q = i4 + 1;
            byte b2 = bArr2[i4];
            int b3 = ud0.m28142b(b2);
            if (b3 < 0) {
                mo23233y1(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | b3;
        }
        return (char) i2;
    }

    /* renamed from: P2 */
    public final void mo19640P2() throws IOException {
        byte b;
        int i = this.f14566Q;
        if (i + 3 < this.f14567U) {
            byte[] bArr = this.f11524N1;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i2 + 1;
                if (bArr[i2] == 117) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 101 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.f14566Q = i4;
                        return;
                    }
                }
            }
        }
        mo19639O2("true", 1);
    }

    /* renamed from: Q */
    public yz2<StreamReadCapability> mo13943Q() {
        return lm4.f14560D1;
    }

    /* renamed from: Q2 */
    public final JsonToken mo19641Q2() {
        this.f14577q1 = false;
        JsonToken jsonToken = this.f14573e1;
        this.f14573e1 = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f14571b1 = this.f14571b1.mo26151m(this.f14574k0, this.f14582v0);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f14571b1 = this.f14571b1.mo26152n(this.f14574k0, this.f14582v0);
        }
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: R2 */
    public final JsonToken mo19642R2(int i) throws IOException {
        if (i == 34) {
            this.f11518H1 = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f15012g = jsonToken;
            return jsonToken;
        } else if (i == 45) {
            JsonToken X2 = mo19647X2();
            this.f15012g = X2;
            return X2;
        } else if (i == 46) {
            JsonToken V2 = mo19645V2();
            this.f15012g = V2;
            return V2;
        } else if (i == 91) {
            this.f14571b1 = this.f14571b1.mo26151m(this.f14574k0, this.f14582v0);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f15012g = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            mo19633L2();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f15012g = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            mo19635M2();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f15012g = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            mo19640P2();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.f15012g = jsonToken5;
            return jsonToken5;
        } else if (i != 123) {
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken Z2 = mo19649Z2(i);
                    this.f15012g = Z2;
                    return Z2;
                default:
                    JsonToken I2 = mo19627I2(i);
                    this.f15012g = I2;
                    return I2;
            }
        } else {
            this.f14571b1 = this.f14571b1.mo26152n(this.f14574k0, this.f14582v0);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.f15012g = jsonToken6;
            return jsonToken6;
        }
    }

    /* renamed from: S0 */
    public int mo13946S0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.f11518H1 || this.f15012g != JsonToken.VALUE_STRING) {
            byte[] l = mo13975l(base64Variant);
            outputStream.write(l);
            return l.length;
        }
        byte[] d = this.f14564M.mo24734d();
        try {
            return mo19650a3(base64Variant, outputStream, d);
        } finally {
            this.f14564M.mo24745o(d);
        }
    }

    /* renamed from: T2 */
    public String mo19643T2() throws IOException {
        int i;
        int i2;
        if (this.f14566Q >= this.f14567U && !mo19629J2()) {
            mo23230v1(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.f11524N1;
        int i3 = this.f14566Q;
        this.f14566Q = i3 + 1;
        char c = bArr[i3] & 255;
        if (c == '\'') {
            return "";
        }
        int[] iArr = this.f11517G1;
        int[] iArr2 = f11514Y1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c != '\'') {
            if (!(iArr2[c] == 0 || c == '\"')) {
                if (c != '\\') {
                    mo22829b2(c, PublicResolver.FUNC_NAME);
                } else {
                    c = mo18445P1();
                }
                if (c > 127) {
                    if (i2 >= 4) {
                        if (i5 >= iArr.length) {
                            iArr = lm4.m21533k2(iArr, iArr.length);
                            this.f11517G1 = iArr;
                        }
                        iArr[i5] = i;
                        i = 0;
                        i5++;
                        i2 = 0;
                    }
                    if (c < 2048) {
                        i = (i << 8) | (c >> 6) | 192;
                        i2++;
                    } else {
                        int i7 = (i << 8) | (c >> 12) | 224;
                        int i8 = i2 + 1;
                        if (i8 >= 4) {
                            if (i5 >= iArr.length) {
                                iArr = lm4.m21533k2(iArr, iArr.length);
                                this.f11517G1 = iArr;
                            }
                            iArr[i5] = i7;
                            i7 = 0;
                            i5++;
                            i8 = 0;
                        }
                        i = (i7 << 8) | ((c >> 6) & 63) | 128;
                        i2 = i8 + 1;
                    }
                    c = (c & '?') | 128;
                }
            }
            if (i2 < 4) {
                i4 = i2 + 1;
                i6 = c | (i << 8);
            } else {
                if (i5 >= iArr.length) {
                    iArr = lm4.m21533k2(iArr, iArr.length);
                    this.f11517G1 = iArr;
                }
                iArr[i5] = i;
                i6 = c;
                i5++;
                i4 = 1;
            }
            if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                mo23230v1(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this.f11524N1;
            int i9 = this.f14566Q;
            this.f14566Q = i9 + 1;
            c = bArr2[i9] & 255;
        }
        if (i2 > 0) {
            if (i5 >= iArr.length) {
                int[] k2 = lm4.m21533k2(iArr, iArr.length);
                this.f11517G1 = k2;
                iArr = k2;
            }
            iArr[i5] = m16499S2(i, i2);
            i5++;
        }
        String z = this.f11516F1.mo27967z(iArr, i5);
        if (z == null) {
            return mo19612A3(iArr, i5, i2);
        }
        return z;
    }

    /* renamed from: U2 */
    public final JsonToken mo19644U2(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        boolean z2;
        int i4;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.f14575o1.mo19417p();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.f11524N1;
                int i6 = this.f14566Q;
                this.f14566Q = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                } else {
                    i4++;
                    if (i >= cArr.length) {
                        cArr = this.f14575o1.mo19417p();
                        i = 0;
                    }
                    cArr[i] = (char) i2;
                    i++;
                }
            }
            z2 = false;
            if (i4 == 0) {
                mo23219J1(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (r12 == 101 || r12 == 69) {
            if (i >= cArr.length) {
                cArr = this.f14575o1.mo19417p();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) r12;
            if (this.f14566Q >= this.f14567U) {
                mo19631K2();
            }
            byte[] bArr2 = this.f11524N1;
            int i8 = this.f14566Q;
            this.f14566Q = i8 + 1;
            byte b = bArr2[i8] & 255;
            if (b == 45 || b == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.f14575o1.mo19417p();
                    i7 = 0;
                }
                int i9 = i7 + 1;
                cArr[i7] = (char) b;
                if (this.f14566Q >= this.f14567U) {
                    mo19631K2();
                }
                byte[] bArr3 = this.f11524N1;
                int i10 = this.f14566Q;
                this.f14566Q = i10 + 1;
                b = bArr3[i10] & 255;
                i7 = i9;
            }
            r12 = b;
            int i11 = 0;
            while (true) {
                if (r12 >= 48 && r12 <= 57) {
                    i11++;
                    if (i7 >= cArr.length) {
                        cArr = this.f14575o1.mo19417p();
                        i7 = 0;
                    }
                    int i12 = i7 + 1;
                    cArr[i7] = (char) r12;
                    if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                        i5 = i11;
                        z2 = true;
                        r11 = i12;
                        break;
                    }
                    byte[] bArr4 = this.f11524N1;
                    int i13 = this.f14566Q;
                    this.f14566Q = i13 + 1;
                    r12 = bArr4[i13] & 255;
                    i7 = i12;
                } else {
                    i5 = i11;
                    r11 = i7;
                }
            }
            i5 = i11;
            r11 = i7;
            if (i5 == 0) {
                mo23219J1(r12, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.f14566Q--;
            if (this.f14571b1.mo28329h()) {
                mo19684z3(r12);
            }
        }
        this.f14575o1.mo19399E(i);
        return mo22842p2(z, i3, i4, i5);
    }

    /* renamed from: V2 */
    public final JsonToken mo19645V2() throws IOException {
        if (!mo13989y0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return mo19627I2(46);
        }
        return mo19644U2(this.f14575o1.mo19414m(), 0, 46, false, 0);
    }

    /* renamed from: W */
    public String mo13947W() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return mo19619E2(jsonToken);
        }
        if (!this.f11518H1) {
            return this.f14575o1.mo19413l();
        }
        this.f11518H1 = false;
        return mo19613B2();
    }

    /* renamed from: W2 */
    public final String mo19646W2(int i) throws IOException {
        if (i != 34) {
            return mo19625H2(i);
        }
        int i2 = this.f14566Q;
        if (i2 + 13 > this.f14567U) {
            return mo19638N3();
        }
        byte[] bArr = this.f11524N1;
        int[] iArr = f11514Y1;
        int i3 = i2 + 1;
        this.f14566Q = i3;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            int i4 = i3 + 1;
            this.f14566Q = i4;
            byte b2 = bArr[i3] & 255;
            if (iArr[b2] == 0) {
                byte b3 = (b << 8) | b2;
                int i5 = i4 + 1;
                this.f14566Q = i5;
                byte b4 = bArr[i4] & 255;
                if (iArr[b4] == 0) {
                    byte b5 = (b3 << 8) | b4;
                    int i6 = i5 + 1;
                    this.f14566Q = i6;
                    byte b6 = bArr[i5] & 255;
                    if (iArr[b6] == 0) {
                        byte b7 = (b5 << 8) | b6;
                        this.f14566Q = i6 + 1;
                        byte b8 = bArr[i6] & 255;
                        if (iArr[b8] == 0) {
                            this.f11519I1 = b7;
                            return mo19628I3(b8);
                        } else if (b8 == 34) {
                            return mo19614B3(b7, 4);
                        } else {
                            return mo19632K3(b7, b8, 4);
                        }
                    } else if (b6 == 34) {
                        return mo19614B3(b5, 3);
                    } else {
                        return mo19632K3(b5, b6, 3);
                    }
                } else if (b4 == 34) {
                    return mo19614B3(b3, 2);
                } else {
                    return mo19632K3(b3, b4, 2);
                }
            } else if (b2 == 34) {
                return mo19614B3(b, 1);
            } else {
                return mo19632K3(b, b2, 1);
            }
        } else if (b == 34) {
            return "";
        } else {
            return mo19632K3(0, b, 0);
        }
    }

    /* renamed from: X */
    public char[] mo13949X() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.mo14000id();
        if (id != 5) {
            if (id != 6) {
                if (!(id == 7 || id == 8)) {
                    return this.f15012g.asCharArray();
                }
            } else if (this.f11518H1) {
                this.f11518H1 = false;
                mo19615C2();
            }
            return this.f14575o1.mo19422u();
        }
        if (!this.f14577q1) {
            String b = this.f14571b1.mo11435b();
            int length = b.length();
            char[] cArr = this.f14576p1;
            if (cArr == null) {
                this.f14576p1 = this.f14564M.mo24736f(length);
            } else if (cArr.length < length) {
                this.f14576p1 = new char[length];
            }
            b.getChars(0, length, this.f14576p1, 0);
            this.f14577q1 = true;
        }
        return this.f14576p1;
    }

    /* renamed from: X2 */
    public JsonToken mo19647X2() throws IOException {
        int i;
        byte b;
        char[] m = this.f14575o1.mo19414m();
        m[0] = '-';
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr = this.f11524N1;
        int i2 = this.f14566Q;
        this.f14566Q = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 <= 48) {
            if (i3 != 48) {
                return mo19623G2(i3, true);
            }
            i3 = mo19682y3();
        } else if (i3 > 57) {
            return mo19623G2(i3, true);
        }
        int i4 = 2;
        m[1] = (char) i3;
        int min = Math.min(this.f14567U, (this.f14566Q + m.length) - 2);
        int i5 = 1;
        while (true) {
            int i6 = this.f14566Q;
            if (i6 >= min) {
                return mo19648Y2(m, i4, true, i5);
            }
            byte[] bArr2 = this.f11524N1;
            i = i6 + 1;
            this.f14566Q = i;
            b = bArr2[i6] & 255;
            if (b >= 48 && b <= 57) {
                i5++;
                m[i4] = (char) b;
                i4++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return mo19644U2(m, i4, b, true, i5);
        }
        this.f14566Q = i - 1;
        this.f14575o1.mo19399E(i4);
        if (this.f14571b1.mo28329h()) {
            mo19684z3(b);
        }
        return mo22843q2(true, i5);
    }

    /* renamed from: Y */
    public int mo13950Y() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.mo14000id();
        if (id == 5) {
            return this.f14571b1.mo11435b().length();
        }
        if (id != 6) {
            if (!(id == 7 || id == 8)) {
                return this.f15012g.asCharArray().length;
            }
        } else if (this.f11518H1) {
            this.f11518H1 = false;
            mo19615C2();
        }
        return this.f14575o1.mo19400F();
    }

    /* renamed from: Y1 */
    public void mo18455Y1() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super.mo18455Y1();
        this.f11516F1.mo27939G();
        if (this.f11525O1 && (bArr = this.f11524N1) != null && bArr != (bArr2 = mm4.f15008r)) {
            this.f11524N1 = bArr2;
            this.f14564M.mo24748r(bArr);
        }
    }

    /* renamed from: Y2 */
    public final JsonToken mo19648Y2(char[] cArr, int i, boolean z, int i2) throws IOException {
        int i3;
        byte b;
        char[] cArr2 = cArr;
        int i4 = i;
        int i5 = i2;
        while (true) {
            if (this.f14566Q < this.f14567U || mo19629J2()) {
                byte[] bArr = this.f11524N1;
                int i6 = this.f14566Q;
                i3 = i6 + 1;
                this.f14566Q = i3;
                b = bArr[i6] & 255;
                if (b <= 57 && b >= 48) {
                    if (i4 >= cArr2.length) {
                        i4 = 0;
                        cArr2 = this.f14575o1.mo19417p();
                    }
                    cArr2[i4] = (char) b;
                    i5++;
                    i4++;
                }
            } else {
                this.f14575o1.mo19399E(i4);
                return mo22843q2(z, i5);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return mo19644U2(cArr2, i4, b, z, i5);
        }
        this.f14566Q = i3 - 1;
        this.f14575o1.mo19399E(i4);
        if (this.f14571b1.mo28329h()) {
            mo19684z3(this.f11524N1[this.f14566Q] & 255);
        }
        return mo22843q2(z, i5);
    }

    /* renamed from: Z2 */
    public JsonToken mo19649Z2(int i) throws IOException {
        int i2;
        byte b;
        char[] m = this.f14575o1.mo19414m();
        if (i == 48) {
            i = mo19682y3();
        }
        m[0] = (char) i;
        int min = Math.min(this.f14567U, (this.f14566Q + m.length) - 1);
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int i5 = this.f14566Q;
            if (i5 >= min) {
                return mo19648Y2(m, i3, false, i4);
            }
            byte[] bArr = this.f11524N1;
            i2 = i5 + 1;
            this.f14566Q = i2;
            b = bArr[i5] & 255;
            if (b >= 48 && b <= 57) {
                i4++;
                m[i3] = (char) b;
                i3++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return mo19644U2(m, i3, b, false, i4);
        }
        this.f14566Q = i2 - 1;
        this.f14575o1.mo19399E(i3);
        if (this.f14571b1.mo28329h()) {
            mo19684z3(b);
        }
        return mo22843q2(false, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r10 < 0) goto L_0x0169;
     */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo19650a3(com.fasterxml.jackson.core.Base64Variant r17, java.io.OutputStream r18, byte[] r19) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r3.length
            r5 = 3
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x000e:
            int r9 = r0.f14566Q
            int r10 = r0.f14567U
            if (r9 < r10) goto L_0x0017
            r16.mo19631K2()
        L_0x0017:
            byte[] r9 = r0.f11524N1
            int r10 = r0.f14566Q
            int r11 = r10 + 1
            r0.f14566Q = r11
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 32
            if (r9 <= r10) goto L_0x0169
            int r10 = r1.decodeBase64Char((int) r9)
            r11 = 34
            if (r10 >= 0) goto L_0x003b
            if (r9 != r11) goto L_0x0033
            goto L_0x012e
        L_0x0033:
            int r10 = r0.mo22818O1(r1, r9, r6)
            if (r10 >= 0) goto L_0x003b
            goto L_0x0169
        L_0x003b:
            if (r7 <= r4) goto L_0x0042
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            r7 = r6
        L_0x0042:
            int r9 = r0.f14566Q
            int r12 = r0.f14567U
            if (r9 < r12) goto L_0x004b
            r16.mo19631K2()
        L_0x004b:
            byte[] r9 = r0.f11524N1
            int r12 = r0.f14566Q
            int r13 = r12 + 1
            r0.f14566Q = r13
            byte r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r12 = r1.decodeBase64Char((int) r9)
            r13 = 1
            if (r12 >= 0) goto L_0x0062
            int r12 = r0.mo22818O1(r1, r9, r13)
        L_0x0062:
            int r9 = r10 << 6
            r9 = r9 | r12
            int r10 = r0.f14566Q
            int r12 = r0.f14567U
            if (r10 < r12) goto L_0x006e
            r16.mo19631K2()
        L_0x006e:
            byte[] r10 = r0.f11524N1
            int r12 = r0.f14566Q
            int r14 = r12 + 1
            r0.f14566Q = r14
            byte r10 = r10[r12]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r12 = r1.decodeBase64Char((int) r10)
            r14 = 2
            r15 = -2
            if (r12 >= 0) goto L_0x00f0
            if (r12 == r15) goto L_0x00a3
            if (r10 != r11) goto L_0x009e
            int r4 = r9 >> 4
            int r5 = r7 + 1
            byte r4 = (byte) r4
            r3[r7] = r4
            boolean r4 = r17.usesPadding()
            if (r4 == 0) goto L_0x009b
            int r4 = r0.f14566Q
            int r4 = r4 - r13
            r0.f14566Q = r4
            r16.mo22821S1(r17)
        L_0x009b:
            r7 = r5
            goto L_0x012e
        L_0x009e:
            int r10 = r0.mo22818O1(r1, r10, r14)
            r12 = r10
        L_0x00a3:
            if (r12 != r15) goto L_0x00f0
            int r10 = r0.f14566Q
            int r11 = r0.f14567U
            if (r10 < r11) goto L_0x00ae
            r16.mo19631K2()
        L_0x00ae:
            byte[] r10 = r0.f11524N1
            int r11 = r0.f14566Q
            int r12 = r11 + 1
            r0.f14566Q = r12
            byte r10 = r10[r11]
            r10 = r10 & 255(0xff, float:3.57E-43)
            boolean r11 = r1.usesPaddingChar((int) r10)
            if (r11 != 0) goto L_0x00e6
            int r11 = r0.mo22818O1(r1, r10, r5)
            if (r11 != r15) goto L_0x00c7
            goto L_0x00e6
        L_0x00c7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected padding character '"
            r2.append(r3)
            char r3 = r17.getPaddingChar()
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r1 = r0.mo22839m2(r1, r10, r5, r2)
            throw r1
        L_0x00e6:
            int r9 = r9 >> 4
            int r10 = r7 + 1
            byte r9 = (byte) r9
            r3[r7] = r9
            r7 = r10
            goto L_0x000e
        L_0x00f0:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r0.f14566Q
            int r12 = r0.f14567U
            if (r10 < r12) goto L_0x00fc
            r16.mo19631K2()
        L_0x00fc:
            byte[] r10 = r0.f11524N1
            int r12 = r0.f14566Q
            int r5 = r12 + 1
            r0.f14566Q = r5
            byte r5 = r10[r12]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r10 = r1.decodeBase64Char((int) r5)
            if (r10 >= 0) goto L_0x0150
            if (r10 == r15) goto L_0x013e
            if (r5 != r11) goto L_0x0137
            int r4 = r9 >> 2
            int r5 = r7 + 1
            int r9 = r4 >> 8
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r17.usesPadding()
            if (r4 == 0) goto L_0x012e
            int r4 = r0.f14566Q
            int r4 = r4 - r13
            r0.f14566Q = r4
            r16.mo22821S1(r17)
        L_0x012e:
            r0.f11518H1 = r6
            if (r7 <= 0) goto L_0x0136
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
        L_0x0136:
            return r8
        L_0x0137:
            r11 = 3
            int r5 = r0.mo22818O1(r1, r5, r11)
            r10 = r5
            goto L_0x013f
        L_0x013e:
            r11 = 3
        L_0x013f:
            if (r10 != r15) goto L_0x0151
            int r5 = r9 >> 2
            int r9 = r7 + 1
            int r10 = r5 >> 8
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r9 + 1
            byte r5 = (byte) r5
            r3[r9] = r5
            goto L_0x016a
        L_0x0150:
            r11 = 3
        L_0x0151:
            int r5 = r9 << 6
            r5 = r5 | r10
            int r9 = r7 + 1
            int r10 = r5 >> 16
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r9 + 1
            int r10 = r5 >> 8
            byte r10 = (byte) r10
            r3[r9] = r10
            int r9 = r7 + 1
            byte r5 = (byte) r5
            r3[r7] = r5
            r7 = r9
            goto L_0x016a
        L_0x0169:
            r11 = r5
        L_0x016a:
            r5 = r11
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f37.mo19650a3(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13956b0() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f15012g
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.mo14000id()
            r2 = 6
            if (r0 == r2) goto L_0x0014
            r2 = 7
            if (r0 == r2) goto L_0x001d
            r2 = 8
            if (r0 == r2) goto L_0x001d
            goto L_0x0024
        L_0x0014:
            boolean r0 = r3.f11518H1
            if (r0 == 0) goto L_0x001d
            r3.f11518H1 = r1
            r3.mo19615C2()
        L_0x001d:
            en6 r0 = r3.f14575o1
            int r0 = r0.mo19423v()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f37.mo13956b0():int");
    }

    /* renamed from: b3 */
    public void mo19651b3(int i) throws JsonParseException {
        if (i < 32) {
            mo23210A1(i);
        }
        mo19652c3(i);
    }

    /* renamed from: c0 */
    public JsonLocation mo13958c0() {
        if (this.f15012g == JsonToken.FIELD_NAME) {
            return new JsonLocation(mo22816M1(), this.f14568X + ((long) (this.f11520J1 - 1)), -1, this.f11521K1, this.f11522L1);
        }
        return new JsonLocation(mo22816M1(), this.f14572e0 - 1, -1, this.f14574k0, this.f14582v0);
    }

    /* renamed from: c3 */
    public void mo19652c3(int i) throws JsonParseException {
        mo23225q1("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    /* renamed from: d3 */
    public void mo19653d3(int i) throws JsonParseException {
        mo23225q1("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    /* renamed from: e3 */
    public void mo19654e3(int i, int i2) throws JsonParseException {
        this.f14566Q = i2;
        mo19653d3(i);
    }

    /* renamed from: f3 */
    public void mo19655f3(String str) throws IOException {
        mo19656g3(str, mo22830c2());
    }

    /* renamed from: g0 */
    public int mo13966g0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.mo13968h0(0);
        }
        int i = this.f14580t1;
        if ((i & 1) == 0) {
            if (i == 0) {
                return mo22823U1();
            }
            if ((i & 1) == 0) {
                mo22835h2();
            }
        }
        return this.f14581u1;
    }

    /* renamed from: g3 */
    public void mo19656g3(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                break;
            }
            byte[] bArr = this.f11524N1;
            int i = this.f14566Q;
            this.f14566Q = i + 1;
            char w2 = (char) mo19677w2(bArr[i]);
            if (Character.isJavaIdentifierPart(w2)) {
                sb.append(w2);
                if (sb.length() >= 256) {
                    sb.append("...");
                    break;
                }
            } else {
                break;
            }
        }
        mo23227s1("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    /* renamed from: h0 */
    public int mo13968h0(int i) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.mo13968h0(i);
        }
        int i2 = this.f14580t1;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return mo22823U1();
            }
            if ((i2 & 1) == 0) {
                mo22835h2();
            }
        }
        return this.f14581u1;
    }

    /* renamed from: h3 */
    public final void mo19657h3() throws IOException {
        int[] g = ud0.m28147g();
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                break;
            }
            byte[] bArr = this.f11524N1;
            int i = this.f14566Q;
            int i2 = i + 1;
            this.f14566Q = i2;
            byte b = bArr[i] & 255;
            int i3 = g[b];
            if (i3 != 0) {
                if (i3 == 2) {
                    mo19664o3();
                } else if (i3 == 3) {
                    mo19665p3();
                } else if (i3 == 4) {
                    mo19666q3(b);
                } else if (i3 == 10) {
                    this.f14569Y++;
                    this.f14570Z = i2;
                } else if (i3 != 13) {
                    if (i3 == 42) {
                        if (i2 >= this.f14567U && !mo19629J2()) {
                            break;
                        }
                        byte[] bArr2 = this.f11524N1;
                        int i4 = this.f14566Q;
                        if (bArr2[i4] == 47) {
                            this.f14566Q = i4 + 1;
                            return;
                        }
                    } else {
                        mo19651b3(b);
                    }
                } else {
                    mo19658i3();
                }
            }
        }
        mo23230v1(" in a comment", (JsonToken) null);
    }

    /* renamed from: i3 */
    public final void mo19658i3() throws IOException {
        if (this.f14566Q < this.f14567U || mo19629J2()) {
            byte[] bArr = this.f11524N1;
            int i = this.f14566Q;
            if (bArr[i] == 10) {
                this.f14566Q = i + 1;
            }
        }
        this.f14569Y++;
        this.f14570Z = this.f14566Q;
    }

    /* renamed from: j3 */
    public final int mo19659j3() throws IOException {
        int i = this.f14566Q;
        if (i + 4 >= this.f14567U) {
            return mo19660k3(false);
        }
        byte[] bArr = this.f11524N1;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this.f14566Q = i2;
            byte b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    int i3 = i2 + 1;
                    this.f14566Q = i3;
                    byte b3 = bArr[i3];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return mo19660k3(true);
                        }
                        this.f14566Q = i3 + 1;
                        return b3;
                    }
                }
                return mo19660k3(true);
            } else if (b2 == 47 || b2 == 35) {
                return mo19660k3(true);
            } else {
                this.f14566Q = i2 + 1;
                return b2;
            }
        } else {
            if (b == 32 || b == 9) {
                int i4 = i + 1;
                this.f14566Q = i4;
                b = bArr[i4];
            }
            if (b != 58) {
                return mo19660k3(false);
            }
            int i5 = this.f14566Q + 1;
            this.f14566Q = i5;
            byte b4 = bArr[i5];
            if (b4 <= 32) {
                if (b4 == 32 || b4 == 9) {
                    int i6 = i5 + 1;
                    this.f14566Q = i6;
                    byte b5 = bArr[i6];
                    if (b5 > 32) {
                        if (b5 == 47 || b5 == 35) {
                            return mo19660k3(true);
                        }
                        this.f14566Q = i6 + 1;
                        return b5;
                    }
                }
                return mo19660k3(true);
            } else if (b4 == 47 || b4 == 35) {
                return mo19660k3(true);
            } else {
                this.f14566Q = i5 + 1;
                return b4;
            }
        }
    }

    /* renamed from: k0 */
    public String mo13974k0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.f11518H1) {
                return this.f14575o1.mo19413l();
            }
            this.f11518H1 = false;
            return mo19613B2();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        } else {
            return super.mo13976l0((String) null);
        }
    }

    /* renamed from: k3 */
    public final int mo19660k3(boolean z) throws IOException {
        while (true) {
            if (this.f14566Q < this.f14567U || mo19629J2()) {
                byte[] bArr = this.f11524N1;
                int i = this.f14566Q;
                int i2 = i + 1;
                this.f14566Q = i2;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        mo19661l3();
                    } else if (b != 35 || !mo19676v3()) {
                        if (z) {
                            return b;
                        }
                        if (b != 58) {
                            mo23233y1(b, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (b != 32) {
                    if (b == 10) {
                        this.f14569Y++;
                        this.f14570Z = i2;
                    } else if (b == 13) {
                        mo19658i3();
                    } else if (b != 9) {
                        mo23210A1(b);
                    }
                }
            } else {
                mo23230v1(" within/between " + this.f14571b1.mo28330j() + " entries", (JsonToken) null);
                return -1;
            }
        }
    }

    /* renamed from: l */
    public byte[] mo13975l(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.f14579s1 == null)) {
            mo23225q1("Current token (" + this.f15012g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f11518H1) {
            try {
                this.f14579s1 = mo19675v2(base64Variant);
                this.f11518H1 = false;
            } catch (IllegalArgumentException e) {
                throw mo13953a("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this.f14579s1 == null) {
            g60 R1 = mo22820R1();
            mo23221f1(mo13947W(), R1, base64Variant);
            this.f14579s1 = R1.mo20400n();
        }
        return this.f14579s1;
    }

    /* renamed from: l0 */
    public String mo13976l0(String str) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.f11518H1) {
                return this.f14575o1.mo19413l();
            }
            this.f11518H1 = false;
            return mo19613B2();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        } else {
            return super.mo13976l0(str);
        }
    }

    /* renamed from: l3 */
    public final void mo19661l3() throws IOException {
        if ((this.f9822a & f11511V1) == 0) {
            mo23233y1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f14566Q >= this.f14567U && !mo19629J2()) {
            mo23230v1(" in a comment", (JsonToken) null);
        }
        byte[] bArr = this.f11524N1;
        int i = this.f14566Q;
        this.f14566Q = i + 1;
        byte b = bArr[i] & 255;
        if (b == 47) {
            mo19662m3();
        } else if (b == 42) {
            mo19657h3();
        } else {
            mo23233y1(b, "was expecting either '*' or '/' for a comment");
        }
    }

    /* renamed from: m3 */
    public final void mo19662m3() throws IOException {
        int[] g = ud0.m28147g();
        while (true) {
            if (this.f14566Q < this.f14567U || mo19629J2()) {
                byte[] bArr = this.f11524N1;
                int i = this.f14566Q;
                int i2 = i + 1;
                this.f14566Q = i2;
                byte b = bArr[i] & 255;
                int i3 = g[b];
                if (i3 != 0) {
                    if (i3 == 2) {
                        mo19664o3();
                    } else if (i3 == 3) {
                        mo19665p3();
                    } else if (i3 == 4) {
                        mo19666q3(b);
                    } else if (i3 == 10) {
                        this.f14569Y++;
                        this.f14570Z = i2;
                        return;
                    } else if (i3 == 13) {
                        mo19658i3();
                        return;
                    } else if (i3 != 42 && i3 < 0) {
                        mo19651b3(b);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: n3 */
    public void mo19663n3() throws IOException {
        this.f11518H1 = false;
        int[] iArr = f11513X1;
        byte[] bArr = this.f11524N1;
        while (true) {
            int i = this.f14566Q;
            int i2 = this.f14567U;
            if (i >= i2) {
                mo19631K2();
                i = this.f14566Q;
                i2 = this.f14567U;
            }
            while (true) {
                if (i >= i2) {
                    this.f14566Q = i;
                    break;
                }
                int i3 = i + 1;
                byte b = bArr[i] & 255;
                int i4 = iArr[b];
                if (i4 != 0) {
                    this.f14566Q = i3;
                    if (b != 34) {
                        if (i4 == 1) {
                            mo18445P1();
                        } else if (i4 == 2) {
                            mo19664o3();
                        } else if (i4 == 3) {
                            mo19665p3();
                        } else if (i4 == 4) {
                            mo19666q3(b);
                        } else if (b < 32) {
                            mo22829b2(b, "string value");
                        } else {
                            mo19651b3(b);
                        }
                    } else {
                        return;
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    /* renamed from: o3 */
    public final void mo19664o3() throws IOException {
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr = this.f11524N1;
        int i = this.f14566Q;
        int i2 = i + 1;
        this.f14566Q = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            mo19654e3(b & 255, i2);
        }
    }

    /* renamed from: p */
    public xe4 mo13980p() {
        return this.f11515E1;
    }

    /* renamed from: p3 */
    public final void mo19665p3() throws IOException {
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr = this.f11524N1;
        int i = this.f14566Q;
        int i2 = i + 1;
        this.f14566Q = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            mo19654e3(b & 255, i2);
        }
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr2 = this.f11524N1;
        int i3 = this.f14566Q;
        int i4 = i3 + 1;
        this.f14566Q = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            mo19654e3(b2 & 255, i4);
        }
    }

    /* renamed from: q */
    public JsonLocation mo13981q() {
        return new JsonLocation(mo22816M1(), this.f14568X + ((long) this.f14566Q), -1, this.f14569Y, (this.f14566Q - this.f14570Z) + 1);
    }

    /* renamed from: q3 */
    public final void mo19666q3(int i) throws IOException {
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr = this.f11524N1;
        int i2 = this.f14566Q;
        int i3 = i2 + 1;
        this.f14566Q = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo19654e3(b & 255, i3);
        }
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr2 = this.f11524N1;
        int i4 = this.f14566Q;
        int i5 = i4 + 1;
        this.f14566Q = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            mo19654e3(b2 & 255, i5);
        }
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr3 = this.f11524N1;
        int i6 = this.f14566Q;
        int i7 = i6 + 1;
        this.f14566Q = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            mo19654e3(b3 & 255, i7);
        }
    }

    /* renamed from: r2 */
    public final void mo19667r2(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) mo19677w2(i2))) {
            mo19655f3(str.substring(0, i));
        }
    }

    /* renamed from: r3 */
    public final int mo19668r3() throws IOException {
        while (true) {
            int i = this.f14566Q;
            if (i >= this.f14567U) {
                return mo19670s3();
            }
            byte[] bArr = this.f11524N1;
            int i2 = i + 1;
            this.f14566Q = i2;
            byte b = bArr[i] & 255;
            if (b > 32) {
                if (b != 47 && b != 35) {
                    return b;
                }
                this.f14566Q = i2 - 1;
                return mo19670s3();
            } else if (b != 32) {
                if (b == 10) {
                    this.f14569Y++;
                    this.f14570Z = i2;
                } else if (b == 13) {
                    mo19658i3();
                } else if (b != 9) {
                    mo23210A1(b);
                }
            }
        }
    }

    /* renamed from: s2 */
    public final void mo19669s2() throws JsonParseException {
        mo19678w3();
        if (!this.f14571b1.mo28327f()) {
            mo22827Z1(93, '}');
        }
        this.f14571b1 = this.f14571b1.mo26150l();
    }

    /* renamed from: s3 */
    public final int mo19670s3() throws IOException {
        byte b;
        while (true) {
            if (this.f14566Q < this.f14567U || mo19629J2()) {
                byte[] bArr = this.f11524N1;
                int i = this.f14566Q;
                int i2 = i + 1;
                this.f14566Q = i2;
                b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        mo19661l3();
                    } else if (b != 35 || !mo19676v3()) {
                        return b;
                    }
                } else if (b != 32) {
                    if (b == 10) {
                        this.f14569Y++;
                        this.f14570Z = i2;
                    } else if (b == 13) {
                        mo19658i3();
                    } else if (b != 9) {
                        mo23210A1(b);
                    }
                }
            } else {
                throw mo13953a("Unexpected end-of-input within/between " + this.f14571b1.mo28330j() + " entries");
            }
        }
        return b;
    }

    /* renamed from: t2 */
    public final void mo19671t2() throws JsonParseException {
        mo19678w3();
        if (!this.f14571b1.mo28328g()) {
            mo22827Z1(125, ']');
        }
        this.f14571b1 = this.f14571b1.mo26150l();
    }

    /* renamed from: t3 */
    public final int mo19672t3() throws IOException {
        if (this.f14566Q >= this.f14567U && !mo19629J2()) {
            return mo22819Q1();
        }
        byte[] bArr = this.f11524N1;
        int i = this.f14566Q;
        int i2 = i + 1;
        this.f14566Q = i2;
        byte b = bArr[i] & 255;
        if (b <= 32) {
            if (b != 32) {
                if (b == 10) {
                    this.f14569Y++;
                    this.f14570Z = i2;
                } else if (b == 13) {
                    mo19658i3();
                } else if (b != 9) {
                    mo23210A1(b);
                }
            }
            while (true) {
                int i3 = this.f14566Q;
                if (i3 >= this.f14567U) {
                    return mo19674u3();
                }
                byte[] bArr2 = this.f11524N1;
                int i4 = i3 + 1;
                this.f14566Q = i4;
                byte b2 = bArr2[i3] & 255;
                if (b2 > 32) {
                    if (b2 != 47 && b2 != 35) {
                        return b2;
                    }
                    this.f14566Q = i4 - 1;
                    return mo19674u3();
                } else if (b2 != 32) {
                    if (b2 == 10) {
                        this.f14569Y++;
                        this.f14570Z = i4;
                    } else if (b2 == 13) {
                        mo19658i3();
                    } else if (b2 != 9) {
                        mo23210A1(b2);
                    }
                }
            }
        } else if (b != 47 && b != 35) {
            return b;
        } else {
            this.f14566Q = i2 - 1;
            return mo19674u3();
        }
    }

    /* renamed from: u2 */
    public final JsonToken mo19673u2(int i) throws JsonParseException {
        if (i == 125) {
            mo19671t2();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this.f15012g = jsonToken;
            return jsonToken;
        }
        mo19669s2();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this.f15012g = jsonToken2;
        return jsonToken2;
    }

    /* renamed from: u3 */
    public final int mo19674u3() throws IOException {
        byte b;
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                return mo22819Q1();
            }
            byte[] bArr = this.f11524N1;
            int i = this.f14566Q;
            int i2 = i + 1;
            this.f14566Q = i2;
            b = bArr[i] & 255;
            if (b > 32) {
                if (b == 47) {
                    mo19661l3();
                } else if (b != 35 || !mo19676v3()) {
                    return b;
                }
            } else if (b != 32) {
                if (b == 10) {
                    this.f14569Y++;
                    this.f14570Z = i2;
                } else if (b == 13) {
                    mo19658i3();
                } else if (b != 9) {
                    mo23210A1(b);
                }
            }
        }
        return b;
    }

    /* renamed from: v2 */
    public final byte[] mo19675v2(Base64Variant base64Variant) throws IOException {
        g60 R1 = mo22820R1();
        while (true) {
            if (this.f14566Q >= this.f14567U) {
                mo19631K2();
            }
            byte[] bArr = this.f11524N1;
            int i = this.f14566Q;
            this.f14566Q = i + 1;
            byte b = bArr[i] & 255;
            if (b > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char((int) b);
                if (decodeBase64Char < 0) {
                    if (b == 34) {
                        return R1.mo20400n();
                    }
                    decodeBase64Char = mo22818O1(base64Variant, b, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.f14566Q >= this.f14567U) {
                    mo19631K2();
                }
                byte[] bArr2 = this.f11524N1;
                int i2 = this.f14566Q;
                this.f14566Q = i2 + 1;
                byte b2 = bArr2[i2] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char((int) b2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = mo22818O1(base64Variant, b2, 1);
                }
                int i3 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this.f14566Q >= this.f14567U) {
                    mo19631K2();
                }
                byte[] bArr3 = this.f11524N1;
                int i4 = this.f14566Q;
                this.f14566Q = i4 + 1;
                byte b3 = bArr3[i4] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char((int) b3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b3 == 34) {
                            R1.mo20387b(i3 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.f14566Q--;
                                mo22821S1(base64Variant);
                            }
                            return R1.mo20400n();
                        }
                        decodeBase64Char3 = mo22818O1(base64Variant, b3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this.f14566Q >= this.f14567U) {
                            mo19631K2();
                        }
                        byte[] bArr4 = this.f11524N1;
                        int i5 = this.f14566Q;
                        this.f14566Q = i5 + 1;
                        byte b4 = bArr4[i5] & 255;
                        if (base64Variant.usesPaddingChar((int) b4) || mo22818O1(base64Variant, b4, 3) == -2) {
                            R1.mo20387b(i3 >> 4);
                        } else {
                            throw mo22839m2(base64Variant, b4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i6 = (i3 << 6) | decodeBase64Char3;
                if (this.f14566Q >= this.f14567U) {
                    mo19631K2();
                }
                byte[] bArr5 = this.f11524N1;
                int i7 = this.f14566Q;
                this.f14566Q = i7 + 1;
                byte b5 = bArr5[i7] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char((int) b5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b5 == 34) {
                            R1.mo20390d(i6 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.f14566Q--;
                                mo22821S1(base64Variant);
                            }
                            return R1.mo20400n();
                        }
                        decodeBase64Char4 = mo22818O1(base64Variant, b5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        R1.mo20390d(i6 >> 2);
                    }
                }
                R1.mo20388c((i6 << 6) | decodeBase64Char4);
            }
        }
    }

    /* renamed from: v3 */
    public final boolean mo19676v3() throws IOException {
        if ((this.f9822a & f11512W1) == 0) {
            return false;
        }
        mo19662m3();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo19677w2(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L_0x0068
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L_0x0012
            r7 = r7 & 31
        L_0x0010:
            r0 = r2
            goto L_0x002c
        L_0x0012:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L_0x001c
            r7 = r7 & 15
            r0 = r1
            goto L_0x002c
        L_0x001c:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L_0x0026
            r7 = r7 & 7
            r0 = 3
            goto L_0x002c
        L_0x0026:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6.mo19652c3(r0)
            goto L_0x0010
        L_0x002c:
            int r3 = r6.mo19622F3()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x003b
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6.mo19653d3(r4)
        L_0x003b:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L_0x0068
            int r2 = r6.mo19622F3()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x004f
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6.mo19653d3(r3)
        L_0x004f:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L_0x0068
            int r0 = r6.mo19622F3()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x0063
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.mo19653d3(r1)
        L_0x0063:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L_0x0068:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f37.mo19677w2(int):int");
    }

    /* renamed from: w3 */
    public final void mo19678w3() {
        this.f14574k0 = this.f14569Y;
        int i = this.f14566Q;
        this.f14572e0 = this.f14568X + ((long) i);
        this.f14582v0 = i - this.f14570Z;
    }

    /* renamed from: x2 */
    public final int mo19679x2(int i) throws IOException {
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr = this.f11524N1;
        int i2 = this.f14566Q;
        int i3 = i2 + 1;
        this.f14566Q = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo19654e3(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    /* renamed from: x3 */
    public final void mo19680x3() {
        this.f11521K1 = this.f14569Y;
        int i = this.f14566Q;
        this.f11520J1 = i;
        this.f11522L1 = i - this.f14570Z;
    }

    /* renamed from: y2 */
    public final int mo19681y2(int i) throws IOException {
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        int i2 = i & 15;
        byte[] bArr = this.f11524N1;
        int i3 = this.f14566Q;
        int i4 = i3 + 1;
        this.f14566Q = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            mo19654e3(b & 255, i4);
        }
        byte b2 = (i2 << 6) | (b & 63);
        if (this.f14566Q >= this.f14567U) {
            mo19631K2();
        }
        byte[] bArr2 = this.f11524N1;
        int i5 = this.f14566Q;
        int i6 = i5 + 1;
        this.f14566Q = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            mo19654e3(b3 & 255, i6);
        }
        return (b2 << 6) | (b3 & 63);
    }

    /* renamed from: y3 */
    public final int mo19682y3() throws IOException {
        byte b;
        if ((this.f14566Q >= this.f14567U && !mo19629J2()) || (b = this.f11524N1[this.f14566Q] & 255) < 48 || b > 57) {
            return 48;
        }
        if ((this.f9822a & f11506Q1) == 0) {
            mo23212C1("Leading zeroes not allowed");
        }
        this.f14566Q++;
        if (b == 48) {
            do {
                if (this.f14566Q >= this.f14567U && !mo19629J2()) {
                    break;
                }
                byte[] bArr = this.f11524N1;
                int i = this.f14566Q;
                b = bArr[i] & 255;
                if (b < 48 || b > 57) {
                    return 48;
                }
                this.f14566Q = i + 1;
            } while (b == 48);
        }
        return b;
    }

    /* renamed from: z2 */
    public final int mo19683z2(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this.f11524N1;
        int i3 = this.f14566Q;
        int i4 = i3 + 1;
        this.f14566Q = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            mo19654e3(b & 255, i4);
        }
        byte b2 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this.f11524N1;
        int i5 = this.f14566Q;
        int i6 = i5 + 1;
        this.f14566Q = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            mo19654e3(b3 & 255, i6);
        }
        return (b2 << 6) | (b3 & 63);
    }

    /* renamed from: z3 */
    public final void mo19684z3(int i) throws IOException {
        int i2 = this.f14566Q + 1;
        this.f14566Q = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.f14569Y++;
            this.f14570Z = i2;
        } else if (i == 13) {
            mo19658i3();
        } else if (i != 32) {
            mo23232x1(i);
        }
    }
}
