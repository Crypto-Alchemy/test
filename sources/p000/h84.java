package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import java.io.IOException;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: h84 */
/* compiled from: NonBlockingJsonParser */
public class h84 extends i84 {

    /* renamed from: X1 */
    public static final int f12771X1 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* renamed from: Y1 */
    public static final int f12772Y1 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* renamed from: Z1 */
    public static final int f12773Z1 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* renamed from: a2 */
    public static final int f12774a2 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* renamed from: b2 */
    public static final int f12775b2 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* renamed from: c2 */
    public static final int f12776c2 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* renamed from: d2 */
    public static final int f12777d2 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* renamed from: e2 */
    public static final int[] f12778e2 = ud0.m28150j();

    /* renamed from: f2 */
    public static final int[] f12779f2 = ud0.m28148h();

    /* renamed from: W1 */
    public byte[] f12780W1 = mm4.f15008r;

    public h84(po2 po2, int i, y60 y60) {
        super(po2, i, y60);
    }

    /* renamed from: A3 */
    public JsonToken mo21006A3() throws IOException {
        int i = this.f14566Q;
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f12778e2;
        int min = Math.min(this.f14567U, m.length + i);
        byte[] bArr = this.f12780W1;
        int i2 = 0;
        while (i < min) {
            byte b = bArr[i] & 255;
            if (b == 39) {
                this.f14566Q = i + 1;
                this.f14575o1.mo19399E(i2);
                return mo21490J2(JsonToken.VALUE_STRING);
            } else if (iArr[b] != 0) {
                break;
            } else {
                i++;
                m[i2] = (char) b;
                i2++;
            }
        }
        this.f14575o1.mo19399E(i2);
        this.f14566Q = i;
        return mo21036X2();
    }

    /* renamed from: B3 */
    public final JsonToken mo21007B3(int i) throws IOException {
        byte b = i & 255;
        if (b == 239 && this.f13197O1 != 1) {
            return mo21037Y2(1);
        }
        while (b <= 32) {
            if (b != 32) {
                if (b == 10) {
                    this.f14569Y++;
                    this.f14570Z = this.f14566Q;
                } else if (b == 13) {
                    this.f13202T1++;
                    this.f14570Z = this.f14566Q;
                } else if (b != 9) {
                    mo23210A1(b);
                }
            }
            int i2 = this.f14566Q;
            if (i2 >= this.f14567U) {
                this.f13197O1 = 3;
                if (this.f14565P) {
                    return null;
                }
                if (this.f13199Q1) {
                    return mo21496u2();
                }
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this.f12780W1;
            this.f14566Q = i2 + 1;
            b = bArr[i2] & 255;
        }
        return mo21025P3(b);
    }

    /* renamed from: C3 */
    public JsonToken mo21008C3() throws IOException {
        byte b;
        int i = this.f14566Q;
        if (i + 4 < this.f14567U) {
            byte[] bArr = this.f12780W1;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 115) {
                        int i5 = i4 + 1;
                        if (bArr[i4] == 101 && ((b = bArr[i5] & 255) < 48 || b == 93 || b == 125)) {
                            this.f14566Q = i5;
                            return mo21490J2(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this.f13197O1 = 18;
        return mo21046h3("false", 1, JsonToken.VALUE_FALSE);
    }

    /* renamed from: D3 */
    public final JsonToken mo21009D3(int i) throws IOException {
        String V2;
        if (i > 32 || (i = mo21063y3(i)) > 0) {
            mo21489I2();
            if (i != 34) {
                if (i == 125) {
                    return mo21495t2();
                }
                return mo21058t3(i);
            } else if (this.f14566Q + 13 > this.f14567U || (V2 = mo21034V2()) == null) {
                return mo21059u3(0, 0, 0);
            } else {
                return mo21497v2(V2);
            }
        } else {
            this.f13197O1 = 4;
            return this.f15012g;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo21010E3(int r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 32
            r1 = 5
            if (r5 > r0) goto L_0x0010
            int r5 = r4.mo21063y3(r5)
            if (r5 > 0) goto L_0x0010
            r4.f13197O1 = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4.f15012g
            return r5
        L_0x0010:
            r2 = 44
            r3 = 125(0x7d, float:1.75E-43)
            if (r5 == r2) goto L_0x004e
            if (r5 != r3) goto L_0x001d
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21495t2()
            return r5
        L_0x001d:
            r2 = 35
            if (r5 != r2) goto L_0x0026
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21045g3(r1)
            return r5
        L_0x0026:
            r2 = 47
            if (r5 != r2) goto L_0x002f
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21017L3(r1)
            return r5
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "was expecting comma to separate "
            r1.append(r2)
            t53 r2 = r4.f14571b1
            java.lang.String r2 = r2.mo28330j()
            r1.append(r2)
            java.lang.String r2 = " entries"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.mo23233y1(r5, r1)
        L_0x004e:
            int r5 = r4.f14566Q
            int r1 = r4.f14567U
            r2 = 4
            if (r5 < r1) goto L_0x005c
            r4.f13197O1 = r2
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4.f15012g = r5
            return r5
        L_0x005c:
            byte[] r1 = r4.f12780W1
            byte r1 = r1[r5]
            int r5 = r5 + 1
            r4.f14566Q = r5
            if (r1 > r0) goto L_0x0071
            int r1 = r4.mo21063y3(r1)
            if (r1 > 0) goto L_0x0071
            r4.f13197O1 = r2
            com.fasterxml.jackson.core.JsonToken r5 = r4.f15012g
            return r5
        L_0x0071:
            r4.mo21489I2()
            r5 = 34
            if (r1 == r5) goto L_0x008b
            if (r1 != r3) goto L_0x0086
            int r5 = r4.f9822a
            int r0 = f12771X1
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0086
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21495t2()
            return r5
        L_0x0086:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21058t3(r1)
            return r5
        L_0x008b:
            int r5 = r4.f14566Q
            int r5 = r5 + 13
            int r0 = r4.f14567U
            if (r5 > r0) goto L_0x009e
            java.lang.String r5 = r4.mo21034V2()
            if (r5 == 0) goto L_0x009e
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21497v2(r5)
            return r5
        L_0x009e:
            r5 = 0
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21059u3(r5, r5, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21010E3(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken mo21011F3(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 57
            r1 = 48
            r2 = 46
            r3 = 0
            if (r9 != r2) goto L_0x0057
            int r9 = r7.length
            if (r8 < r9) goto L_0x0012
            en6 r7 = r6.f14575o1
            char[] r7 = r7.mo19416o()
        L_0x0012:
            int r9 = r8 + 1
            r7[r8] = r2
            r8 = r9
            r9 = r3
        L_0x0018:
            int r2 = r6.f14566Q
            int r4 = r6.f14567U
            if (r2 < r4) goto L_0x002e
            en6 r7 = r6.f14575o1
            r7.mo19399E(r8)
            r7 = 30
            r6.f13197O1 = r7
            r6.f14562B1 = r9
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r6.f15012g = r7
            return r7
        L_0x002e:
            byte[] r4 = r6.f12780W1
            int r5 = r2 + 1
            r6.f14566Q = r5
            byte r2 = r4[r2]
            if (r2 < r1) goto L_0x004d
            if (r2 <= r0) goto L_0x003b
            goto L_0x004d
        L_0x003b:
            int r4 = r7.length
            if (r8 < r4) goto L_0x0044
            en6 r7 = r6.f14575o1
            char[] r7 = r7.mo19416o()
        L_0x0044:
            int r4 = r8 + 1
            char r2 = (char) r2
            r7[r8] = r2
            int r9 = r9 + 1
            r8 = r4
            goto L_0x0018
        L_0x004d:
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r9 != 0) goto L_0x0059
            java.lang.String r4 = "Decimal point not followed by a digit"
            r6.mo23219J1(r2, r4)
            goto L_0x0059
        L_0x0057:
            r2 = r9
            r9 = r3
        L_0x0059:
            r6.f14562B1 = r9
            r9 = 101(0x65, float:1.42E-43)
            if (r2 == r9) goto L_0x0063
            r9 = 69
            if (r2 != r9) goto L_0x00ff
        L_0x0063:
            int r9 = r7.length
            if (r8 < r9) goto L_0x006c
            en6 r7 = r6.f14575o1
            char[] r7 = r7.mo19416o()
        L_0x006c:
            int r9 = r8 + 1
            char r2 = (char) r2
            r7[r8] = r2
            int r8 = r6.f14566Q
            int r2 = r6.f14567U
            if (r8 < r2) goto L_0x0087
            en6 r7 = r6.f14575o1
            r7.mo19399E(r9)
            r7 = 31
            r6.f13197O1 = r7
            r6.f14563C1 = r3
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r6.f15012g = r7
            return r7
        L_0x0087:
            byte[] r2 = r6.f12780W1
            int r4 = r8 + 1
            r6.f14566Q = r4
            byte r8 = r2[r8]
            r2 = 45
            r4 = 32
            if (r8 == r2) goto L_0x0099
            r2 = 43
            if (r8 != r2) goto L_0x00c4
        L_0x0099:
            int r2 = r7.length
            if (r9 < r2) goto L_0x00a2
            en6 r7 = r6.f14575o1
            char[] r7 = r7.mo19416o()
        L_0x00a2:
            int r2 = r9 + 1
            char r8 = (char) r8
            r7[r9] = r8
            int r8 = r6.f14566Q
            int r9 = r6.f14567U
            if (r8 < r9) goto L_0x00bb
            en6 r7 = r6.f14575o1
            r7.mo19399E(r2)
            r6.f13197O1 = r4
            r6.f14563C1 = r3
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r6.f15012g = r7
            return r7
        L_0x00bb:
            byte[] r9 = r6.f12780W1
            int r5 = r8 + 1
            r6.f14566Q = r5
            byte r8 = r9[r8]
        L_0x00c3:
            r9 = r2
        L_0x00c4:
            if (r8 < r1) goto L_0x00f5
            if (r8 > r0) goto L_0x00f5
            int r3 = r3 + 1
            int r2 = r7.length
            if (r9 < r2) goto L_0x00d3
            en6 r7 = r6.f14575o1
            char[] r7 = r7.mo19416o()
        L_0x00d3:
            int r2 = r9 + 1
            char r8 = (char) r8
            r7[r9] = r8
            int r8 = r6.f14566Q
            int r9 = r6.f14567U
            if (r8 < r9) goto L_0x00ec
            en6 r7 = r6.f14575o1
            r7.mo19399E(r2)
            r6.f13197O1 = r4
            r6.f14563C1 = r3
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r6.f15012g = r7
            return r7
        L_0x00ec:
            byte[] r9 = r6.f12780W1
            int r5 = r8 + 1
            r6.f14566Q = r5
            byte r8 = r9[r8]
            goto L_0x00c3
        L_0x00f5:
            r7 = r8 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x00fe
            java.lang.String r8 = "Exponent indicator not followed by a digit"
            r6.mo23219J1(r7, r8)
        L_0x00fe:
            r8 = r9
        L_0x00ff:
            int r7 = r6.f14566Q
            int r7 = r7 + -1
            r6.f14566Q = r7
            en6 r7 = r6.f14575o1
            r7.mo19399E(r8)
            r6.f14563C1 = r3
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            com.fasterxml.jackson.core.JsonToken r7 = r6.mo21490J2(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21011F3(char[], int, int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: G3 */
    public JsonToken mo21012G3() throws IOException {
        this.f14587z1 = false;
        this.f14561A1 = 0;
        return mo21011F3(this.f14575o1.mo19414m(), 0, 46);
    }

    /* renamed from: H3 */
    public JsonToken mo21013H3() throws IOException {
        this.f14587z1 = true;
        int i = this.f14566Q;
        if (i >= this.f14567U) {
            this.f13197O1 = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f15012g = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f12780W1;
        this.f14566Q = i + 1;
        byte b = bArr[i] & 255;
        int i2 = 2;
        if (b <= 48) {
            if (b == 48) {
                return mo21051m3();
            }
            mo23219J1(b, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (b > 57) {
            if (b == 73) {
                return mo21048j3(3, 2);
            }
            mo23219J1(b, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] m = this.f14575o1.mo19414m();
        m[0] = '-';
        m[1] = (char) b;
        int i3 = this.f14566Q;
        if (i3 >= this.f14567U) {
            this.f13197O1 = 26;
            this.f14575o1.mo19399E(2);
            this.f14561A1 = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this.f15012g = jsonToken2;
            return jsonToken2;
        }
        byte b2 = this.f12780W1[i3];
        while (true) {
            if (b2 < 48) {
                if (b2 == 46) {
                    this.f14561A1 = i2 - 1;
                    this.f14566Q++;
                    return mo21011F3(m, i2, b2);
                }
            } else if (b2 <= 57) {
                if (i2 >= m.length) {
                    m = this.f14575o1.mo19416o();
                }
                int i4 = i2 + 1;
                m[i2] = (char) b2;
                int i5 = this.f14566Q + 1;
                this.f14566Q = i5;
                if (i5 >= this.f14567U) {
                    this.f13197O1 = 26;
                    this.f14575o1.mo19399E(i4);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this.f15012g = jsonToken3;
                    return jsonToken3;
                }
                b2 = this.f12780W1[i5] & 255;
                i2 = i4;
            } else if (b2 == 101 || b2 == 69) {
                this.f14561A1 = i2 - 1;
                this.f14566Q++;
                return mo21011F3(m, i2, b2);
            }
        }
        this.f14561A1 = i2 - 1;
        this.f14575o1.mo19399E(i2);
        return mo21490J2(JsonToken.VALUE_NUMBER_INT);
    }

    /* renamed from: I3 */
    public JsonToken mo21014I3() throws IOException {
        byte b;
        int i = this.f14566Q;
        if (i + 3 < this.f14567U) {
            byte[] bArr = this.f12780W1;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 108 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.f14566Q = i4;
                        return mo21490J2(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this.f13197O1 = 16;
        return mo21046h3("null", 1, JsonToken.VALUE_NULL);
    }

    /* renamed from: J3 */
    public JsonToken mo21015J3() throws IOException {
        int i = this.f14566Q;
        if (i >= this.f14567U) {
            this.f13197O1 = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f15012g = jsonToken;
            return jsonToken;
        }
        int i2 = i + 1;
        byte b = this.f12780W1[i] & 255;
        if (b < 48) {
            if (b == 46) {
                this.f14566Q = i2;
                this.f14561A1 = 1;
                char[] m = this.f14575o1.mo19414m();
                m[0] = '0';
                return mo21011F3(m, 1, b);
            }
        } else if (b <= 57) {
            return mo21052n3();
        } else {
            if (b == 101 || b == 69) {
                this.f14566Q = i2;
                this.f14561A1 = 1;
                char[] m2 = this.f14575o1.mo19414m();
                m2[0] = '0';
                return mo21011F3(m2, 1, b);
            } else if (!(b == 93 || b == 125)) {
                mo23219J1(b, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return mo21491K2(0, "0");
    }

    /* renamed from: K3 */
    public JsonToken mo21016K3(int i) throws IOException {
        this.f14587z1 = false;
        char[] m = this.f14575o1.mo19414m();
        m[0] = (char) i;
        int i2 = this.f14566Q;
        if (i2 >= this.f14567U) {
            this.f13197O1 = 26;
            this.f14575o1.mo19399E(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f15012g = jsonToken;
            return jsonToken;
        }
        byte b = this.f12780W1[i2] & 255;
        int i3 = 1;
        while (true) {
            if (b < 48) {
                if (b == 46) {
                    this.f14561A1 = i3;
                    this.f14566Q++;
                    return mo21011F3(m, i3, b);
                }
            } else if (b <= 57) {
                if (i3 >= m.length) {
                    m = this.f14575o1.mo19416o();
                }
                int i4 = i3 + 1;
                m[i3] = (char) b;
                int i5 = this.f14566Q + 1;
                this.f14566Q = i5;
                if (i5 >= this.f14567U) {
                    this.f13197O1 = 26;
                    this.f14575o1.mo19399E(i4);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this.f15012g = jsonToken2;
                    return jsonToken2;
                }
                b = this.f12780W1[i5] & 255;
                i3 = i4;
            } else if (b == 101 || b == 69) {
                this.f14561A1 = i3;
                this.f14566Q++;
                return mo21011F3(m, i3, b);
            }
        }
        this.f14561A1 = i3;
        this.f14575o1.mo19399E(i3);
        return mo21490J2(JsonToken.VALUE_NUMBER_INT);
    }

    /* renamed from: L3 */
    public final JsonToken mo21017L3(int i) throws IOException {
        if ((this.f9822a & f12776c2) == 0) {
            mo23233y1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i2 = this.f14566Q;
        if (i2 >= this.f14567U) {
            this.f13191I1 = i;
            this.f13197O1 = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f15012g = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f12780W1;
        this.f14566Q = i2 + 1;
        byte b = bArr[i2];
        if (b == 42) {
            return mo21038Z2(i, false);
        }
        if (b == 47) {
            return mo21039a3(i);
        }
        mo23233y1(b & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    /* renamed from: M2 */
    public final int mo21018M2() throws IOException {
        if (this.f14567U - this.f14566Q < 5) {
            return mo21022O2(0, -1);
        }
        return mo21020N2();
    }

    /* renamed from: M3 */
    public JsonToken mo21019M3() throws IOException {
        int i = this.f14566Q;
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f12778e2;
        int min = Math.min(this.f14567U, m.length + i);
        byte[] bArr = this.f12780W1;
        int i2 = 0;
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
                return mo21490J2(JsonToken.VALUE_STRING);
            }
        }
        this.f14575o1.mo19399E(i2);
        this.f14566Q = i;
        return mo21054p3();
    }

    /* renamed from: N0 */
    public JsonToken mo13938N0() throws IOException {
        int i = this.f14566Q;
        if (i >= this.f14567U) {
            if (this.f14565P) {
                return null;
            }
            if (!this.f13199Q1) {
                return JsonToken.NOT_AVAILABLE;
            }
            if (this.f15012g == JsonToken.NOT_AVAILABLE) {
                return mo21056r3();
            }
            return mo21496u2();
        } else if (this.f15012g == JsonToken.NOT_AVAILABLE) {
            return mo21055q3();
        } else {
            this.f14580t1 = 0;
            this.f14572e0 = this.f14568X + ((long) i);
            this.f14579s1 = null;
            byte[] bArr = this.f12780W1;
            this.f14566Q = i + 1;
            byte b = bArr[i] & 255;
            switch (this.f13195M1) {
                case 0:
                    return mo21007B3(b);
                case 1:
                    return mo21025P3(b);
                case 2:
                    return mo21009D3(b);
                case 3:
                    return mo21010E3(b);
                case 4:
                    return mo21029R3(b);
                case 5:
                    return mo21025P3(b);
                case 6:
                    return mo21031S3(b);
                default:
                    c97.m11761c();
                    return null;
            }
        }
    }

    /* renamed from: N2 */
    public final int mo21020N2() throws IOException {
        byte[] bArr = this.f12780W1;
        int i = this.f14566Q;
        int i2 = i + 1;
        this.f14566Q = i2;
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
            return mo22822T1((char) b);
        }
        this.f14566Q = i2 + 1;
        byte b2 = bArr[i2];
        int b3 = ud0.m28142b(b2);
        if (b3 >= 0) {
            byte[] bArr2 = this.f12780W1;
            int i3 = this.f14566Q;
            this.f14566Q = i3 + 1;
            b2 = bArr2[i3];
            int b4 = ud0.m28142b(b2);
            if (b4 >= 0) {
                int i4 = (b3 << 4) | b4;
                byte[] bArr3 = this.f12780W1;
                int i5 = this.f14566Q;
                this.f14566Q = i5 + 1;
                byte b5 = bArr3[i5];
                int b6 = ud0.m28142b(b5);
                if (b6 >= 0) {
                    int i6 = (i4 << 4) | b6;
                    byte[] bArr4 = this.f12780W1;
                    int i7 = this.f14566Q;
                    this.f14566Q = i7 + 1;
                    b5 = bArr4[i7];
                    int b7 = ud0.m28142b(b5);
                    if (b7 >= 0) {
                        return (i6 << 4) | b7;
                    }
                }
                b2 = b5;
            }
        }
        mo23233y1(b2 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    /* renamed from: N3 */
    public JsonToken mo21021N3() throws IOException {
        byte b;
        int i = this.f14566Q;
        if (i + 3 < this.f14567U) {
            byte[] bArr = this.f12780W1;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i2 + 1;
                if (bArr[i2] == 117) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 101 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.f14566Q = i4;
                        return mo21490J2(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this.f13197O1 = 17;
        return mo21046h3("true", 1, JsonToken.VALUE_TRUE);
    }

    /* renamed from: O2 */
    public final int mo21022O2(int i, int i2) throws IOException {
        int i3 = this.f14566Q;
        int i4 = this.f14567U;
        if (i3 >= i4) {
            this.f13193K1 = i;
            this.f13194L1 = i2;
            return -1;
        }
        byte[] bArr = this.f12780W1;
        int i5 = i3 + 1;
        this.f14566Q = i5;
        byte b = bArr[i3];
        if (i2 == -1) {
            if (b == 34 || b == 47 || b == 92) {
                return b;
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
                return mo22822T1((char) b);
            }
            if (i5 >= i4) {
                this.f13194L1 = 0;
                this.f13193K1 = 0;
                return -1;
            }
            this.f14566Q = i5 + 1;
            b = bArr[i5];
            i2 = 0;
        }
        while (true) {
            byte b2 = b & 255;
            int b3 = ud0.m28142b(b2);
            if (b3 < 0) {
                mo23233y1(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | b3;
            i2++;
            if (i2 == 4) {
                return i;
            }
            int i6 = this.f14566Q;
            if (i6 >= this.f14567U) {
                this.f13194L1 = i2;
                this.f13193K1 = i;
                return -1;
            }
            byte[] bArr2 = this.f12780W1;
            this.f14566Q = i6 + 1;
            b = bArr2[i6];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r2.f14571b1.mo28327f() == false) goto L_0x005f;
     */
    /* renamed from: O3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken mo21023O3(boolean r3, int r4) throws java.io.IOException {
        /*
            r2 = this;
            r3 = 39
            if (r4 == r3) goto L_0x0053
            r3 = 73
            r0 = 1
            if (r4 == r3) goto L_0x004e
            r3 = 78
            if (r4 == r3) goto L_0x0048
            r3 = 93
            if (r4 == r3) goto L_0x0024
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 == r3) goto L_0x005f
            r3 = 43
            if (r4 == r3) goto L_0x001e
            r3 = 44
            if (r4 == r3) goto L_0x002d
            goto L_0x005f
        L_0x001e:
            r3 = 2
            com.fasterxml.jackson.core.JsonToken r3 = r2.mo21048j3(r3, r0)
            return r3
        L_0x0024:
            t53 r3 = r2.f14571b1
            boolean r3 = r3.mo28327f()
            if (r3 != 0) goto L_0x002d
            goto L_0x005f
        L_0x002d:
            t53 r3 = r2.f14571b1
            boolean r3 = r3.mo28329h()
            if (r3 != 0) goto L_0x005f
            int r3 = r2.f9822a
            int r1 = f12773Z1
            r3 = r3 & r1
            if (r3 == 0) goto L_0x005f
            int r3 = r2.f14566Q
            int r3 = r3 - r0
            r2.f14566Q = r3
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            com.fasterxml.jackson.core.JsonToken r3 = r2.mo21490J2(r3)
            return r3
        L_0x0048:
            r3 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r2.mo21048j3(r3, r0)
            return r3
        L_0x004e:
            com.fasterxml.jackson.core.JsonToken r3 = r2.mo21048j3(r0, r0)
            return r3
        L_0x0053:
            int r3 = r2.f9822a
            int r0 = f12774a2
            r3 = r3 & r0
            if (r3 == 0) goto L_0x005f
            com.fasterxml.jackson.core.JsonToken r3 = r2.mo21006A3()
            return r3
        L_0x005f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "expected a valid value "
            r3.append(r0)
            java.lang.String r0 = r2.mo22831d2()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.mo23233y1(r4, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21023O3(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: P1 */
    public char mo18445P1() throws IOException {
        c97.m11761c();
        return ' ';
    }

    /* renamed from: P2 */
    public final boolean mo21024P2(int i, int i2, boolean z) throws IOException {
        if (i2 == 1) {
            int O2 = mo21022O2(0, -1);
            if (O2 < 0) {
                this.f13197O1 = 41;
                return false;
            }
            this.f14575o1.mo19402a((char) O2);
            return true;
        } else if (i2 != 2) {
            if (i2 == 3) {
                int i3 = i & 15;
                if (z) {
                    byte[] bArr = this.f12780W1;
                    int i4 = this.f14566Q;
                    this.f14566Q = i4 + 1;
                    return mo21026Q2(i3, 1, bArr[i4]);
                }
                this.f13197O1 = 43;
                this.f13191I1 = i3;
                this.f13192J1 = 1;
                return false;
            } else if (i2 != 4) {
                if (i < 32) {
                    mo22829b2(i, "string value");
                } else {
                    mo21483C2(i);
                }
                this.f14575o1.mo19402a((char) i);
                return true;
            } else {
                int i5 = i & 7;
                if (z) {
                    byte[] bArr2 = this.f12780W1;
                    int i6 = this.f14566Q;
                    this.f14566Q = i6 + 1;
                    return mo21028R2(i5, 1, bArr2[i6]);
                }
                this.f13191I1 = i5;
                this.f13192J1 = 1;
                this.f13197O1 = 44;
                return false;
            }
        } else if (z) {
            byte[] bArr3 = this.f12780W1;
            int i7 = this.f14566Q;
            this.f14566Q = i7 + 1;
            this.f14575o1.mo19402a((char) mo21030S2(i, bArr3[i7]));
            return true;
        } else {
            this.f13197O1 = 42;
            this.f13191I1 = i;
            return false;
        }
    }

    /* renamed from: P3 */
    public final JsonToken mo21025P3(int i) throws IOException {
        if (i > 32 || (i = mo21063y3(i)) > 0) {
            mo21489I2();
            this.f14571b1.mo26153p();
            if (i == 34) {
                return mo21019M3();
            }
            if (i == 35) {
                return mo21045g3(12);
            }
            if (i == 91) {
                return mo21487G2();
            }
            if (i == 93) {
                return mo21494s2();
            }
            if (i == 102) {
                return mo21008C3();
            }
            if (i == 110) {
                return mo21014I3();
            }
            if (i == 116) {
                return mo21021N3();
            }
            if (i == 123) {
                return mo21488H2();
            }
            if (i == 125) {
                return mo21495t2();
            }
            switch (i) {
                case 45:
                    return mo21013H3();
                case 46:
                    if (mo13989y0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                        return mo21012G3();
                    }
                    break;
                case 47:
                    return mo21017L3(12);
                case 48:
                    return mo21015J3();
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return mo21016K3(i);
            }
            return mo21023O3(false, i);
        }
        this.f13197O1 = 12;
        return this.f15012g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r6v0 ?, r6v1 ?, r6v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: Q2 */
    public final boolean mo21026Q2(int r4, int r5, 
/*
Method generation error in method: h84.Q2(int, int, int):boolean, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ?
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

    /* renamed from: Q3 */
    public final JsonToken mo21027Q3(int i) throws IOException {
        if (i > 32 || (i = mo21063y3(i)) > 0) {
            mo21489I2();
            if (i == 34) {
                return mo21019M3();
            }
            if (i == 35) {
                return mo21045g3(15);
            }
            if (i == 45) {
                return mo21013H3();
            }
            if (i == 91) {
                return mo21487G2();
            }
            if (i != 93) {
                if (i == 102) {
                    return mo21008C3();
                }
                if (i == 110) {
                    return mo21014I3();
                }
                if (i == 116) {
                    return mo21021N3();
                }
                if (i == 123) {
                    return mo21488H2();
                }
                if (i != 125) {
                    switch (i) {
                        case 47:
                            return mo21017L3(15);
                        case 48:
                            return mo21015J3();
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            return mo21016K3(i);
                    }
                } else if ((this.f9822a & f12771X1) != 0) {
                    return mo21495t2();
                }
            } else if ((this.f9822a & f12771X1) != 0) {
                return mo21494s2();
            }
            return mo21023O3(true, i);
        }
        this.f13197O1 = 15;
        return this.f15012g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r9v0 ?, r9v1 ?, r9v2 ?, r9v8 ?, r9v11 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: R2 */
    public final boolean mo21028R2(int r7, int r8, 
/*
Method generation error in method: h84.R2(int, int, int):boolean, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ?
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo21029R3(int r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 32
            r1 = 14
            if (r5 > r0) goto L_0x0011
            int r5 = r4.mo21063y3(r5)
            if (r5 > 0) goto L_0x0011
            r4.f13197O1 = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4.f15012g
            return r5
        L_0x0011:
            r2 = 58
            r3 = 35
            if (r5 == r2) goto L_0x002c
            r2 = 47
            if (r5 != r2) goto L_0x0020
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21017L3(r1)
            return r5
        L_0x0020:
            if (r5 != r3) goto L_0x0027
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21045g3(r1)
            return r5
        L_0x0027:
            java.lang.String r1 = "was expecting a colon to separate field name and value"
            r4.mo23233y1(r5, r1)
        L_0x002c:
            int r5 = r4.f14566Q
            int r1 = r4.f14567U
            r2 = 12
            if (r5 < r1) goto L_0x003b
            r4.f13197O1 = r2
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4.f15012g = r5
            return r5
        L_0x003b:
            byte[] r1 = r4.f12780W1
            byte r1 = r1[r5]
            int r5 = r5 + 1
            r4.f14566Q = r5
            if (r1 > r0) goto L_0x0050
            int r1 = r4.mo21063y3(r1)
            if (r1 > 0) goto L_0x0050
            r4.f13197O1 = r2
            com.fasterxml.jackson.core.JsonToken r5 = r4.f15012g
            return r5
        L_0x0050:
            r4.mo21489I2()
            r5 = 34
            if (r1 != r5) goto L_0x005c
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21019M3()
            return r5
        L_0x005c:
            if (r1 == r3) goto L_0x00ac
            r5 = 45
            if (r1 == r5) goto L_0x00a7
            r5 = 91
            if (r1 == r5) goto L_0x00a2
            r5 = 102(0x66, float:1.43E-43)
            if (r1 == r5) goto L_0x009d
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L_0x0098
            r5 = 116(0x74, float:1.63E-43)
            if (r1 == r5) goto L_0x0093
            r5 = 123(0x7b, float:1.72E-43)
            if (r1 == r5) goto L_0x008e
            switch(r1) {
                case 47: goto L_0x0089;
                case 48: goto L_0x0084;
                case 49: goto L_0x007f;
                case 50: goto L_0x007f;
                case 51: goto L_0x007f;
                case 52: goto L_0x007f;
                case 53: goto L_0x007f;
                case 54: goto L_0x007f;
                case 55: goto L_0x007f;
                case 56: goto L_0x007f;
                case 57: goto L_0x007f;
                default: goto L_0x0079;
            }
        L_0x0079:
            r5 = 0
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21023O3(r5, r1)
            return r5
        L_0x007f:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21016K3(r1)
            return r5
        L_0x0084:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21015J3()
            return r5
        L_0x0089:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21017L3(r2)
            return r5
        L_0x008e:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21488H2()
            return r5
        L_0x0093:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21021N3()
            return r5
        L_0x0098:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21014I3()
            return r5
        L_0x009d:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21008C3()
            return r5
        L_0x00a2:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21487G2()
            return r5
        L_0x00a7:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21013H3()
            return r5
        L_0x00ac:
            com.fasterxml.jackson.core.JsonToken r5 = r4.mo21045g3(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21029R3(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: S2 */
    public final int mo21030S2(int i, int i2) throws IOException {
        if ((i2 & 192) != 128) {
            mo21486F2(i2 & 255, this.f14566Q);
        }
        return ((i & 31) << 6) | (i2 & 63);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: S3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo21031S3(int r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 32
            r1 = 13
            if (r8 > r0) goto L_0x0011
            int r8 = r7.mo21063y3(r8)
            if (r8 > 0) goto L_0x0011
            r7.f13197O1 = r1
            com.fasterxml.jackson.core.JsonToken r8 = r7.f15012g
            return r8
        L_0x0011:
            r2 = 44
            r3 = 35
            r4 = 125(0x7d, float:1.75E-43)
            r5 = 93
            if (r8 == r2) goto L_0x0058
            if (r8 != r5) goto L_0x0022
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21494s2()
            return r8
        L_0x0022:
            if (r8 != r4) goto L_0x0029
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21495t2()
            return r8
        L_0x0029:
            r2 = 47
            if (r8 != r2) goto L_0x0032
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21017L3(r1)
            return r8
        L_0x0032:
            if (r8 != r3) goto L_0x0039
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21045g3(r1)
            return r8
        L_0x0039:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "was expecting comma to separate "
            r1.append(r2)
            t53 r2 = r7.f14571b1
            java.lang.String r2 = r2.mo28330j()
            r1.append(r2)
            java.lang.String r2 = " entries"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.mo23233y1(r8, r1)
        L_0x0058:
            t53 r8 = r7.f14571b1
            r8.mo26153p()
            int r8 = r7.f14566Q
            int r1 = r7.f14567U
            r2 = 15
            if (r8 < r1) goto L_0x006c
            r7.f13197O1 = r2
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r7.f15012g = r8
            return r8
        L_0x006c:
            byte[] r1 = r7.f12780W1
            byte r1 = r1[r8]
            r6 = 1
            int r8 = r8 + r6
            r7.f14566Q = r8
            if (r1 > r0) goto L_0x0081
            int r1 = r7.mo21063y3(r1)
            if (r1 > 0) goto L_0x0081
            r7.f13197O1 = r2
            com.fasterxml.jackson.core.JsonToken r8 = r7.f15012g
            return r8
        L_0x0081:
            r7.mo21489I2()
            r8 = 34
            if (r1 != r8) goto L_0x008d
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21019M3()
            return r8
        L_0x008d:
            if (r1 == r3) goto L_0x00f9
            r8 = 45
            if (r1 == r8) goto L_0x00f4
            r8 = 91
            if (r1 == r8) goto L_0x00ef
            if (r1 == r5) goto L_0x00de
            r8 = 102(0x66, float:1.43E-43)
            if (r1 == r8) goto L_0x00d9
            r8 = 110(0x6e, float:1.54E-43)
            if (r1 == r8) goto L_0x00d4
            r8 = 116(0x74, float:1.63E-43)
            if (r1 == r8) goto L_0x00cf
            r8 = 123(0x7b, float:1.72E-43)
            if (r1 == r8) goto L_0x00ca
            if (r1 == r4) goto L_0x00be
            switch(r1) {
                case 47: goto L_0x00b9;
                case 48: goto L_0x00b4;
                case 49: goto L_0x00af;
                case 50: goto L_0x00af;
                case 51: goto L_0x00af;
                case 52: goto L_0x00af;
                case 53: goto L_0x00af;
                case 54: goto L_0x00af;
                case 55: goto L_0x00af;
                case 56: goto L_0x00af;
                case 57: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00ea
        L_0x00af:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21016K3(r1)
            return r8
        L_0x00b4:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21015J3()
            return r8
        L_0x00b9:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21017L3(r2)
            return r8
        L_0x00be:
            int r8 = r7.f9822a
            int r0 = f12771X1
            r8 = r8 & r0
            if (r8 == 0) goto L_0x00ea
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21495t2()
            return r8
        L_0x00ca:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21488H2()
            return r8
        L_0x00cf:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21021N3()
            return r8
        L_0x00d4:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21014I3()
            return r8
        L_0x00d9:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21008C3()
            return r8
        L_0x00de:
            int r8 = r7.f9822a
            int r0 = f12771X1
            r8 = r8 & r0
            if (r8 == 0) goto L_0x00ea
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21494s2()
            return r8
        L_0x00ea:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21023O3(r6, r1)
            return r8
        L_0x00ef:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21487G2()
            return r8
        L_0x00f4:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21013H3()
            return r8
        L_0x00f9:
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo21045g3(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21031S3(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: T2 */
    public final int mo21032T2(int i, int i2, int i3) throws IOException {
        int i4 = i & 15;
        if ((i2 & 192) != 128) {
            mo21486F2(i2 & 255, this.f14566Q);
        }
        int i5 = (i4 << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            mo21486F2(i3 & 255, this.f14566Q);
        }
        return (i5 << 6) | (i3 & 63);
    }

    /* renamed from: U2 */
    public final int mo21033U2(int i, int i2, int i3, int i4) throws IOException {
        if ((i2 & 192) != 128) {
            mo21486F2(i2 & 255, this.f14566Q);
        }
        int i5 = ((i & 7) << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            mo21486F2(i3 & 255, this.f14566Q);
        }
        int i6 = (i5 << 6) | (i3 & 63);
        if ((i4 & 192) != 128) {
            mo21486F2(i4 & 255, this.f14566Q);
        }
        return ((i6 << 6) | (i4 & 63)) - 65536;
    }

    /* renamed from: V2 */
    public final String mo21034V2() throws IOException {
        byte[] bArr = this.f12780W1;
        int[] iArr = f12779f2;
        int i = this.f14566Q;
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        if (iArr[b] == 0) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2] & 255;
            if (iArr[b2] == 0) {
                byte b3 = (b << 8) | b2;
                int i4 = i3 + 1;
                byte b4 = bArr[i3] & 255;
                if (iArr[b4] == 0) {
                    byte b5 = (b3 << 8) | b4;
                    int i5 = i4 + 1;
                    byte b6 = bArr[i4] & 255;
                    if (iArr[b6] == 0) {
                        byte b7 = (b5 << 8) | b6;
                        int i6 = i5 + 1;
                        byte b8 = bArr[i5] & 255;
                        if (iArr[b8] == 0) {
                            this.f13190H1 = b7;
                            return mo21060v3(i6, b8);
                        } else if (b8 != 34) {
                            return null;
                        } else {
                            this.f14566Q = i6;
                            return mo21498w2(b7, 4);
                        }
                    } else if (b6 != 34) {
                        return null;
                    } else {
                        this.f14566Q = i5;
                        return mo21498w2(b5, 3);
                    }
                } else if (b4 != 34) {
                    return null;
                } else {
                    this.f14566Q = i4;
                    return mo21498w2(b3, 2);
                }
            } else if (b2 != 34) {
                return null;
            } else {
                this.f14566Q = i3;
                return mo21498w2(b, 1);
            }
        } else if (b != 34) {
            return null;
        } else {
            this.f14566Q = i2;
            return "";
        }
    }

    /* renamed from: W2 */
    public final JsonToken mo21035W2(int i, int i2, int i3) throws IOException {
        int[] iArr = this.f13188F1;
        int[] iArr2 = f12779f2;
        while (true) {
            int i4 = this.f14566Q;
            if (i4 >= this.f14567U) {
                this.f13189G1 = i;
                this.f13191I1 = r10;
                this.f13192J1 = r11;
                this.f13197O1 = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f12780W1;
            this.f14566Q = i4 + 1;
            int i5 = bArr[i4] & 255;
            if (i5 == 39) {
                if (r11 > 0) {
                    if (i >= iArr.length) {
                        iArr = lm4.m21533k2(iArr, iArr.length);
                        this.f13188F1 = iArr;
                    }
                    iArr[i] = i84.m19465B2(r10, r11);
                    i++;
                } else if (i == 0) {
                    return mo21497v2("");
                }
                String z = this.f13187E1.mo27967z(iArr, i);
                if (z == null) {
                    z = mo21493r2(iArr, i, r11);
                }
                return mo21497v2(z);
            }
            if (!(i5 == 34 || iArr2[i5] == 0)) {
                if (i5 != 92) {
                    mo22829b2(i5, PublicResolver.FUNC_NAME);
                } else {
                    i5 = mo21018M2();
                    if (i5 < 0) {
                        this.f13197O1 = 8;
                        this.f13198P1 = 9;
                        this.f13189G1 = i;
                        this.f13191I1 = r10;
                        this.f13192J1 = r11;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this.f15012g = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i5 > 127) {
                    int i6 = 0;
                    if (r11 >= 4) {
                        if (i >= iArr.length) {
                            int[] k2 = lm4.m21533k2(iArr, iArr.length);
                            this.f13188F1 = k2;
                            iArr = k2;
                        }
                        iArr[i] = r10;
                        i++;
                        r10 = 0;
                        r11 = 0;
                    }
                    if (i5 < 2048) {
                        r10 = (r10 << 8) | (i5 >> 6) | 192;
                        r11++;
                    } else {
                        int i7 = (r10 << 8) | (i5 >> 12) | 224;
                        int i8 = r11 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                int[] k22 = lm4.m21533k2(iArr, iArr.length);
                                this.f13188F1 = k22;
                                iArr = k22;
                            }
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i6 = i7;
                        }
                        r10 = (i6 << 8) | ((i5 >> 6) & 63) | 128;
                        r11 = i8 + 1;
                    }
                    i5 = (i5 & 63) | 128;
                }
            }
            if (r11 < 4) {
                i3 = r11 + 1;
                i2 = (r10 << 8) | i5;
            } else {
                if (i >= iArr.length) {
                    iArr = lm4.m21533k2(iArr, iArr.length);
                    this.f13188F1 = iArr;
                }
                iArr[i] = r10;
                i++;
                i2 = i5;
                i3 = 1;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: X2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo21036X2() throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = f12778e2
            byte[] r1 = r12.f12780W1
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19418r()
            en6 r3 = r12.f14575o1
            int r3 = r3.mo19420t()
            int r4 = r12.f14566Q
            int r5 = r12.f14567U
            int r5 = r5 + -5
        L_0x0016:
            int r6 = r12.f14567U
            r7 = 45
            if (r4 < r6) goto L_0x002a
            r12.f14566Q = r4
            r12.f13197O1 = r7
            en6 r0 = r12.f14575o1
            r0.mo19399E(r3)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r12.f15012g = r0
            return r0
        L_0x002a:
            int r6 = r2.length
            r8 = 0
            if (r3 < r6) goto L_0x0035
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19417p()
            r3 = r8
        L_0x0035:
            int r6 = r12.f14567U
            int r9 = r2.length
            int r9 = r9 - r3
            int r9 = r9 + r4
            int r6 = java.lang.Math.min(r6, r9)
        L_0x003e:
            if (r4 >= r6) goto L_0x0016
            int r9 = r4 + 1
            byte r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r10 = r0[r4]
            if (r10 == 0) goto L_0x00fd
            r11 = 34
            if (r4 == r11) goto L_0x00fd
            r6 = 1
            if (r9 < r5) goto L_0x007b
            r12.f14566Q = r9
            en6 r2 = r12.f14575o1
            r2.mo19399E(r3)
            r2 = r0[r4]
            int r3 = r12.f14567U
            if (r9 >= r3) goto L_0x005f
            r8 = r6
        L_0x005f:
            boolean r2 = r12.mo21024P2(r4, r2, r8)
            if (r2 != 0) goto L_0x006c
            r12.f13198P1 = r7
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r12.f15012g = r0
            return r0
        L_0x006c:
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19418r()
            en6 r3 = r12.f14575o1
            int r3 = r3.mo19420t()
            int r4 = r12.f14566Q
            goto L_0x0016
        L_0x007b:
            if (r10 == r6) goto L_0x00e2
            r6 = 2
            if (r10 == r6) goto L_0x00d6
            r6 = 3
            if (r10 == r6) goto L_0x00c6
            r6 = 4
            if (r10 == r6) goto L_0x0095
            r6 = 32
            if (r4 >= r6) goto L_0x0090
            java.lang.String r6 = "string value"
            r12.mo22829b2(r4, r6)
            goto L_0x0093
        L_0x0090:
            r12.mo21483C2(r4)
        L_0x0093:
            r6 = r9
            goto L_0x00ea
        L_0x0095:
            byte[] r6 = r12.f12780W1
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r7 = r6[r7]
            int r11 = r10 + 1
            byte r6 = r6[r10]
            int r4 = r12.mo21033U2(r4, r9, r7, r6)
            int r6 = r3 + 1
            r7 = 55296(0xd800, float:7.7486E-41)
            int r9 = r4 >> 10
            r7 = r7 | r9
            char r7 = (char) r7
            r2[r3] = r7
            int r3 = r2.length
            if (r6 < r3) goto L_0x00bd
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19417p()
            r3 = r8
            goto L_0x00be
        L_0x00bd:
            r3 = r6
        L_0x00be:
            r6 = 56320(0xdc00, float:7.8921E-41)
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r4 = r4 | r6
            r6 = r11
            goto L_0x00ea
        L_0x00c6:
            byte[] r6 = r12.f12780W1
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r6 = r6[r7]
            int r4 = r12.mo21032T2(r4, r9, r6)
            r6 = r10
            goto L_0x00ea
        L_0x00d6:
            byte[] r6 = r12.f12780W1
            int r7 = r9 + 1
            byte r6 = r6[r9]
            int r4 = r12.mo21030S2(r4, r6)
            r6 = r7
            goto L_0x00ea
        L_0x00e2:
            r12.f14566Q = r9
            int r4 = r12.mo21020N2()
            int r6 = r12.f14566Q
        L_0x00ea:
            int r7 = r2.length
            if (r3 < r7) goto L_0x00f4
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19417p()
            goto L_0x00f5
        L_0x00f4:
            r8 = r3
        L_0x00f5:
            int r3 = r8 + 1
            char r4 = (char) r4
            r2[r8] = r4
            r4 = r6
            goto L_0x0016
        L_0x00fd:
            r10 = 39
            if (r4 != r10) goto L_0x010f
            r12.f14566Q = r9
            en6 r0 = r12.f14575o1
            r0.mo19399E(r3)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            com.fasterxml.jackson.core.JsonToken r0 = r12.mo21490J2(r0)
            return r0
        L_0x010f:
            int r10 = r3 + 1
            char r4 = (char) r4
            r2[r3] = r4
            r4 = r9
            r3 = r10
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21036X2():com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: Y2 */
    public final JsonToken mo21037Y2(int i) throws IOException {
        while (true) {
            int i2 = this.f14566Q;
            if (i2 < this.f14567U) {
                byte[] bArr = this.f12780W1;
                this.f14566Q = i2 + 1;
                byte b = bArr[i2] & 255;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            this.f14568X -= 3;
                            return mo21007B3(b);
                        }
                    } else if (b != 191) {
                        mo23226r1("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(b));
                    }
                } else if (b != 187) {
                    mo23226r1("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(b));
                }
                i++;
            } else {
                this.f13191I1 = i;
                this.f13197O1 = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
        }
    }

    /* renamed from: Z2 */
    public final JsonToken mo21038Z2(int i, boolean z) throws IOException {
        int i2;
        while (true) {
            int i3 = this.f14566Q;
            if (i3 >= this.f14567U) {
                if (z) {
                    i2 = 52;
                } else {
                    i2 = 53;
                }
                this.f13197O1 = i2;
                this.f13191I1 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f12780W1;
            int i4 = i3 + 1;
            this.f14566Q = i4;
            byte b = bArr[i3] & 255;
            if (b < 32) {
                if (b == 10) {
                    this.f14569Y++;
                    this.f14570Z = i4;
                } else if (b == 13) {
                    this.f13202T1++;
                    this.f14570Z = i4;
                } else if (b != 9) {
                    mo23210A1(b);
                }
            } else if (b == 42) {
                z = true;
            } else if (b == 47 && z) {
                return mo21064z3(i);
            }
            z = false;
        }
    }

    /* renamed from: a3 */
    public final JsonToken mo21039a3(int i) throws IOException {
        while (true) {
            int i2 = this.f14566Q;
            if (i2 >= this.f14567U) {
                this.f13197O1 = 54;
                this.f13191I1 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f12780W1;
            int i3 = i2 + 1;
            this.f14566Q = i3;
            byte b = bArr[i2] & 255;
            if (b < 32) {
                if (b == 10) {
                    this.f14569Y++;
                    this.f14570Z = i3;
                    break;
                } else if (b == 13) {
                    this.f13202T1++;
                    this.f14570Z = i3;
                    break;
                } else if (b != 9) {
                    mo23210A1(b);
                }
            }
        }
        return mo21064z3(i);
    }

    /* renamed from: b3 */
    public JsonToken mo21040b3() throws IOException {
        do {
            int i = this.f14566Q;
            if (i < this.f14567U) {
                byte[] bArr = this.f12780W1;
                this.f14566Q = i + 1;
                char c = (char) bArr[i];
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
                this.f14575o1.mo19402a(c);
            } else {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
        } while (this.f14575o1.mo19400F() < 256);
        return mo21062x3(this.f14575o1.mo19413l());
    }

    /* renamed from: c3 */
    public JsonToken mo21041c3() throws IOException {
        return mo21062x3(this.f14575o1.mo19413l());
    }

    /* renamed from: d3 */
    public final JsonToken mo21042d3() throws IOException {
        int i;
        int i2;
        int i3;
        int O2 = mo21022O2(this.f13193K1, this.f13194L1);
        if (O2 < 0) {
            this.f13197O1 = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i4 = this.f13189G1;
        int[] iArr = this.f13188F1;
        if (i4 >= iArr.length) {
            this.f13188F1 = lm4.m21533k2(iArr, 32);
        }
        int i5 = this.f13191I1;
        int i6 = this.f13192J1;
        int i7 = 1;
        if (O2 > 127) {
            int i8 = 0;
            if (i6 >= 4) {
                int[] iArr2 = this.f13188F1;
                int i9 = this.f13189G1;
                this.f13189G1 = i9 + 1;
                iArr2[i9] = i5;
                i5 = 0;
                i6 = 0;
            }
            if (O2 < 2048) {
                i2 = i5 << 8;
                i3 = (O2 >> 6) | 192;
            } else {
                int i10 = (i5 << 8) | (O2 >> 12) | 224;
                i++;
                if (i >= 4) {
                    int[] iArr3 = this.f13188F1;
                    int i11 = this.f13189G1;
                    this.f13189G1 = i11 + 1;
                    iArr3[i11] = i10;
                    i = 0;
                } else {
                    i8 = i10;
                }
                i2 = i8 << 8;
                i3 = ((O2 >> 6) & 63) | 128;
            }
            i5 = i2 | i3;
            i6 = i + 1;
            O2 = (O2 & 63) | 128;
        }
        if (i6 < 4) {
            i7 = 1 + i6;
            O2 |= i5 << 8;
        } else {
            int[] iArr4 = this.f13188F1;
            int i12 = this.f13189G1;
            this.f13189G1 = i12 + 1;
            iArr4[i12] = i5;
        }
        if (this.f13198P1 == 9) {
            return mo21035W2(this.f13189G1, O2, i7);
        }
        return mo21059u3(this.f13189G1, O2, i7);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r6v0 ?, r6v1 ?, r6v2 ?, r6v6 ?, r6v9 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: e3 */
    public com.fasterxml.jackson.core.JsonToken mo21043e3(boolean r5, 
/*
Method generation error in method: h84.e3(boolean, int):com.fasterxml.jackson.core.JsonToken, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ?
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

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken mo21044f3() throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.f14562B1
            en6 r1 = r6.f14575o1
            char[] r1 = r1.mo19418r()
            en6 r2 = r6.f14575o1
            int r2 = r2.mo19420t()
        L_0x000e:
            byte[] r3 = r6.f12780W1
            int r4 = r6.f14566Q
            int r5 = r4 + 1
            r6.f14566Q = r5
            byte r3 = r3[r4]
            r4 = 48
            if (r3 < r4) goto L_0x0042
            r4 = 57
            if (r3 > r4) goto L_0x0042
            int r0 = r0 + 1
            int r4 = r1.length
            if (r2 < r4) goto L_0x002b
            en6 r1 = r6.f14575o1
            char[] r1 = r1.mo19416o()
        L_0x002b:
            int r4 = r2 + 1
            char r3 = (char) r3
            r1[r2] = r3
            int r2 = r6.f14566Q
            int r3 = r6.f14567U
            if (r2 < r3) goto L_0x0040
            en6 r1 = r6.f14575o1
            r1.mo19399E(r4)
            r6.f14562B1 = r0
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            return r0
        L_0x0040:
            r2 = r4
            goto L_0x000e
        L_0x0042:
            if (r0 != 0) goto L_0x0049
            java.lang.String r1 = "Decimal point not followed by a digit"
            r6.mo23219J1(r3, r1)
        L_0x0049:
            r6.f14562B1 = r0
            en6 r0 = r6.f14575o1
            r0.mo19399E(r2)
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            r4 = 1
            if (r3 == r0) goto L_0x006e
            r0 = 69
            if (r3 != r0) goto L_0x005b
            goto L_0x006e
        L_0x005b:
            int r0 = r6.f14566Q
            int r0 = r0 - r4
            r6.f14566Q = r0
            en6 r0 = r6.f14575o1
            r0.mo19399E(r2)
            r6.f14563C1 = r1
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            com.fasterxml.jackson.core.JsonToken r0 = r6.mo21490J2(r0)
            return r0
        L_0x006e:
            en6 r0 = r6.f14575o1
            char r2 = (char) r3
            r0.mo19402a(r2)
            r6.f14563C1 = r1
            int r0 = r6.f14566Q
            int r1 = r6.f14567U
            if (r0 < r1) goto L_0x0083
            r0 = 31
            r6.f13197O1 = r0
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            return r0
        L_0x0083:
            r1 = 32
            r6.f13197O1 = r1
            byte[] r1 = r6.f12780W1
            int r2 = r0 + 1
            r6.f14566Q = r2
            byte r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.fasterxml.jackson.core.JsonToken r0 = r6.mo21043e3(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21044f3():com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: g3 */
    public final JsonToken mo21045g3(int i) throws IOException {
        if ((this.f9822a & f12777d2) == 0) {
            mo23233y1(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i2 = this.f14566Q;
            if (i2 >= this.f14567U) {
                this.f13197O1 = 55;
                this.f13191I1 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f12780W1;
            int i3 = i2 + 1;
            this.f14566Q = i3;
            byte b = bArr[i2] & 255;
            if (b < 32) {
                if (b == 10) {
                    this.f14569Y++;
                    this.f14570Z = i3;
                    break;
                } else if (b == 13) {
                    this.f13202T1++;
                    this.f14570Z = i3;
                    break;
                } else if (b != 9) {
                    mo23210A1(b);
                }
            }
        }
        return mo21064z3(i);
    }

    /* renamed from: h3 */
    public JsonToken mo21046h3(String str, int i, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (true) {
            int i2 = this.f14566Q;
            if (i2 >= this.f14567U) {
                this.f13191I1 = i;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken2;
                return jsonToken2;
            }
            byte b = this.f12780W1[i2];
            if (i == length) {
                if (b < 48 || b == 93 || b == 125) {
                    return mo21490J2(jsonToken);
                }
            } else if (b != str.charAt(i)) {
                break;
            } else {
                i++;
                this.f14566Q++;
            }
        }
        this.f13197O1 = 50;
        this.f14575o1.mo19426y(str, 0, i);
        return mo21040b3();
    }

    /* renamed from: i3 */
    public JsonToken mo21047i3(String str, int i, JsonToken jsonToken) throws IOException {
        if (i == str.length()) {
            this.f15012g = jsonToken;
            return jsonToken;
        }
        this.f14575o1.mo19426y(str, 0, i);
        return mo21041c3();
    }

    /* renamed from: j3 */
    public JsonToken mo21048j3(int i, int i2) throws IOException {
        String A2 = mo21482A2(i);
        int length = A2.length();
        while (true) {
            int i3 = this.f14566Q;
            if (i3 >= this.f14567U) {
                this.f13200R1 = i;
                this.f13191I1 = i2;
                this.f13197O1 = 19;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte b = this.f12780W1[i3];
            if (i2 == length) {
                if (b < 48 || b == 93 || b == 125) {
                    return mo21492L2(i);
                }
            } else if (b != A2.charAt(i2)) {
                break;
            } else {
                i2++;
                this.f14566Q++;
            }
        }
        this.f13197O1 = 50;
        this.f14575o1.mo19426y(A2, 0, i2);
        return mo21040b3();
    }

    /* renamed from: k3 */
    public JsonToken mo21049k3(int i, int i2) throws IOException {
        String A2 = mo21482A2(i);
        if (i2 == A2.length()) {
            return mo21492L2(i);
        }
        this.f14575o1.mo19426y(A2, 0, i2);
        return mo21041c3();
    }

    /* renamed from: l3 */
    public JsonToken mo21050l3(char[] cArr, int i) throws IOException {
        int i2;
        if (this.f14587z1) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        while (true) {
            int i3 = this.f14566Q;
            if (i3 >= this.f14567U) {
                this.f13197O1 = 26;
                this.f14575o1.mo19399E(i);
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte b = this.f12780W1[i3] & 255;
            if (b < 48) {
                if (b == 46) {
                    this.f14561A1 = i2 + i;
                    this.f14566Q = i3 + 1;
                    return mo21011F3(cArr, i, b);
                }
            } else if (b <= 57) {
                this.f14566Q = i3 + 1;
                if (i >= cArr.length) {
                    cArr = this.f14575o1.mo19416o();
                }
                cArr[i] = (char) b;
                i++;
            } else if (b == 101 || b == 69) {
                this.f14561A1 = i2 + i;
                this.f14566Q = i3 + 1;
                return mo21011F3(cArr, i, b);
            }
        }
        this.f14561A1 = i2 + i;
        this.f14575o1.mo19399E(i);
        return mo21490J2(JsonToken.VALUE_NUMBER_INT);
    }

    /* renamed from: m3 */
    public JsonToken mo21051m3() throws IOException {
        byte b;
        do {
            int i = this.f14566Q;
            if (i >= this.f14567U) {
                this.f13197O1 = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f12780W1;
            this.f14566Q = i + 1;
            b = bArr[i] & 255;
            if (b < 48) {
                if (b == 46) {
                    char[] m = this.f14575o1.mo19414m();
                    m[0] = '-';
                    m[1] = '0';
                    this.f14561A1 = 1;
                    return mo21011F3(m, 2, b);
                }
            } else if (b > 57) {
                if (b == 101 || b == 69) {
                    char[] m2 = this.f14575o1.mo19414m();
                    m2[0] = '-';
                    m2[1] = '0';
                    this.f14561A1 = 1;
                    return mo21011F3(m2, 2, b);
                } else if (!(b == 93 || b == 125)) {
                    mo23219J1(b, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this.f9822a & f12772Y1) == 0) {
                mo23212C1("Leading zeroes not allowed");
                continue;
            }
            this.f14566Q--;
            return mo21491K2(0, "0");
        } while (b == 48);
        char[] m3 = this.f14575o1.mo19414m();
        m3[0] = '-';
        m3[1] = (char) b;
        this.f14561A1 = 1;
        return mo21050l3(m3, 2);
    }

    /* renamed from: n3 */
    public JsonToken mo21052n3() throws IOException {
        byte b;
        do {
            int i = this.f14566Q;
            if (i >= this.f14567U) {
                this.f13197O1 = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f12780W1;
            this.f14566Q = i + 1;
            b = bArr[i] & 255;
            if (b < 48) {
                if (b == 46) {
                    char[] m = this.f14575o1.mo19414m();
                    m[0] = '0';
                    this.f14561A1 = 1;
                    return mo21011F3(m, 1, b);
                }
            } else if (b > 57) {
                if (b == 101 || b == 69) {
                    char[] m2 = this.f14575o1.mo19414m();
                    m2[0] = '0';
                    this.f14561A1 = 1;
                    return mo21011F3(m2, 1, b);
                } else if (!(b == 93 || b == 125)) {
                    mo23219J1(b, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this.f9822a & f12772Y1) == 0) {
                mo23212C1("Leading zeroes not allowed");
                continue;
            }
            this.f14566Q--;
            return mo21491K2(0, "0");
        } while (b == 48);
        char[] m3 = this.f14575o1.mo19414m();
        m3[0] = (char) b;
        this.f14561A1 = 1;
        return mo21050l3(m3, 1);
    }

    /* renamed from: o3 */
    public JsonToken mo21053o3(int i) throws IOException {
        if (i <= 48) {
            if (i == 48) {
                return mo21051m3();
            }
            mo23219J1(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i > 57) {
            if (i == 73) {
                return mo21048j3(3, 2);
            }
            mo23219J1(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] m = this.f14575o1.mo19414m();
        m[0] = '-';
        m[1] = (char) i;
        this.f14561A1 = 1;
        return mo21050l3(m, 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo21054p3() throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = f12778e2
            byte[] r1 = r12.f12780W1
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19418r()
            en6 r3 = r12.f14575o1
            int r3 = r3.mo19420t()
            int r4 = r12.f14566Q
            int r5 = r12.f14567U
            int r5 = r5 + -5
        L_0x0016:
            int r6 = r12.f14567U
            r7 = 40
            if (r4 < r6) goto L_0x002a
            r12.f14566Q = r4
            r12.f13197O1 = r7
            en6 r0 = r12.f14575o1
            r0.mo19399E(r3)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r12.f15012g = r0
            return r0
        L_0x002a:
            int r6 = r2.length
            r8 = 0
            if (r3 < r6) goto L_0x0035
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19417p()
            r3 = r8
        L_0x0035:
            int r6 = r12.f14567U
            int r9 = r2.length
            int r9 = r9 - r3
            int r9 = r9 + r4
            int r6 = java.lang.Math.min(r6, r9)
        L_0x003e:
            if (r4 >= r6) goto L_0x0016
            int r9 = r4 + 1
            byte r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r10 = r0[r4]
            if (r10 == 0) goto L_0x010b
            r6 = 34
            if (r4 != r6) goto L_0x005c
            r12.f14566Q = r9
            en6 r0 = r12.f14575o1
            r0.mo19399E(r3)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            com.fasterxml.jackson.core.JsonToken r0 = r12.mo21490J2(r0)
            return r0
        L_0x005c:
            r6 = 1
            if (r9 < r5) goto L_0x0089
            r12.f14566Q = r9
            en6 r2 = r12.f14575o1
            r2.mo19399E(r3)
            r2 = r0[r4]
            int r3 = r12.f14567U
            if (r9 >= r3) goto L_0x006d
            r8 = r6
        L_0x006d:
            boolean r2 = r12.mo21024P2(r4, r2, r8)
            if (r2 != 0) goto L_0x007a
            r12.f13198P1 = r7
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r12.f15012g = r0
            return r0
        L_0x007a:
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19418r()
            en6 r3 = r12.f14575o1
            int r3 = r3.mo19420t()
            int r4 = r12.f14566Q
            goto L_0x0016
        L_0x0089:
            if (r10 == r6) goto L_0x00f0
            r6 = 2
            if (r10 == r6) goto L_0x00e4
            r6 = 3
            if (r10 == r6) goto L_0x00d4
            r6 = 4
            if (r10 == r6) goto L_0x00a3
            r6 = 32
            if (r4 >= r6) goto L_0x009e
            java.lang.String r6 = "string value"
            r12.mo22829b2(r4, r6)
            goto L_0x00a1
        L_0x009e:
            r12.mo21483C2(r4)
        L_0x00a1:
            r6 = r9
            goto L_0x00f8
        L_0x00a3:
            byte[] r6 = r12.f12780W1
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r7 = r6[r7]
            int r11 = r10 + 1
            byte r6 = r6[r10]
            int r4 = r12.mo21033U2(r4, r9, r7, r6)
            int r6 = r3 + 1
            r7 = 55296(0xd800, float:7.7486E-41)
            int r9 = r4 >> 10
            r7 = r7 | r9
            char r7 = (char) r7
            r2[r3] = r7
            int r3 = r2.length
            if (r6 < r3) goto L_0x00cb
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19417p()
            r3 = r8
            goto L_0x00cc
        L_0x00cb:
            r3 = r6
        L_0x00cc:
            r6 = 56320(0xdc00, float:7.8921E-41)
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r4 = r4 | r6
            r6 = r11
            goto L_0x00f8
        L_0x00d4:
            byte[] r6 = r12.f12780W1
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r6 = r6[r7]
            int r4 = r12.mo21032T2(r4, r9, r6)
            r6 = r10
            goto L_0x00f8
        L_0x00e4:
            byte[] r6 = r12.f12780W1
            int r7 = r9 + 1
            byte r6 = r6[r9]
            int r4 = r12.mo21030S2(r4, r6)
            r6 = r7
            goto L_0x00f8
        L_0x00f0:
            r12.f14566Q = r9
            int r4 = r12.mo21020N2()
            int r6 = r12.f14566Q
        L_0x00f8:
            int r7 = r2.length
            if (r3 < r7) goto L_0x0102
            en6 r2 = r12.f14575o1
            char[] r2 = r2.mo19417p()
            goto L_0x0103
        L_0x0102:
            r8 = r3
        L_0x0103:
            int r3 = r8 + 1
            char r4 = (char) r4
            r2[r8] = r4
            r4 = r6
            goto L_0x0016
        L_0x010b:
            int r10 = r3 + 1
            char r4 = (char) r4
            r2[r3] = r4
            r4 = r9
            r3 = r10
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21054p3():com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: q3 */
    public final JsonToken mo21055q3() throws IOException {
        int i = this.f13197O1;
        if (i == 1) {
            return mo21037Y2(this.f13191I1);
        }
        if (i == 4) {
            byte[] bArr = this.f12780W1;
            int i2 = this.f14566Q;
            this.f14566Q = i2 + 1;
            return mo21009D3(bArr[i2] & 255);
        } else if (i != 5) {
            switch (i) {
                case 7:
                    return mo21059u3(this.f13189G1, this.f13191I1, this.f13192J1);
                case 8:
                    return mo21042d3();
                case 9:
                    return mo21035W2(this.f13189G1, this.f13191I1, this.f13192J1);
                case 10:
                    return mo21057s3(this.f13189G1, this.f13191I1, this.f13192J1);
                default:
                    switch (i) {
                        case 12:
                            byte[] bArr2 = this.f12780W1;
                            int i3 = this.f14566Q;
                            this.f14566Q = i3 + 1;
                            return mo21025P3(bArr2[i3] & 255);
                        case 13:
                            byte[] bArr3 = this.f12780W1;
                            int i4 = this.f14566Q;
                            this.f14566Q = i4 + 1;
                            return mo21031S3(bArr3[i4] & 255);
                        case 14:
                            byte[] bArr4 = this.f12780W1;
                            int i5 = this.f14566Q;
                            this.f14566Q = i5 + 1;
                            return mo21029R3(bArr4[i5] & 255);
                        case 15:
                            byte[] bArr5 = this.f12780W1;
                            int i6 = this.f14566Q;
                            this.f14566Q = i6 + 1;
                            return mo21027Q3(bArr5[i6] & 255);
                        case 16:
                            return mo21046h3("null", this.f13191I1, JsonToken.VALUE_NULL);
                        case 17:
                            return mo21046h3("true", this.f13191I1, JsonToken.VALUE_TRUE);
                        case 18:
                            return mo21046h3("false", this.f13191I1, JsonToken.VALUE_FALSE);
                        case 19:
                            return mo21048j3(this.f13200R1, this.f13191I1);
                        default:
                            switch (i) {
                                case 23:
                                    byte[] bArr6 = this.f12780W1;
                                    int i7 = this.f14566Q;
                                    this.f14566Q = i7 + 1;
                                    return mo21053o3(bArr6[i7] & 255);
                                case 24:
                                    return mo21052n3();
                                case 25:
                                    return mo21051m3();
                                case 26:
                                    return mo21050l3(this.f14575o1.mo19418r(), this.f14575o1.mo19420t());
                                default:
                                    switch (i) {
                                        case 30:
                                            return mo21044f3();
                                        case 31:
                                            byte[] bArr7 = this.f12780W1;
                                            int i8 = this.f14566Q;
                                            this.f14566Q = i8 + 1;
                                            return mo21043e3(true, bArr7[i8] & 255);
                                        case 32:
                                            byte[] bArr8 = this.f12780W1;
                                            int i9 = this.f14566Q;
                                            this.f14566Q = i9 + 1;
                                            return mo21043e3(false, bArr8[i9] & 255);
                                        default:
                                            switch (i) {
                                                case 40:
                                                    return mo21054p3();
                                                case 41:
                                                    int O2 = mo21022O2(this.f13193K1, this.f13194L1);
                                                    if (O2 < 0) {
                                                        return JsonToken.NOT_AVAILABLE;
                                                    }
                                                    this.f14575o1.mo19402a((char) O2);
                                                    if (this.f13198P1 == 45) {
                                                        return mo21036X2();
                                                    }
                                                    return mo21054p3();
                                                case 42:
                                                    en6 en6 = this.f14575o1;
                                                    int i10 = this.f13191I1;
                                                    byte[] bArr9 = this.f12780W1;
                                                    int i11 = this.f14566Q;
                                                    this.f14566Q = i11 + 1;
                                                    en6.mo19402a((char) mo21030S2(i10, bArr9[i11]));
                                                    if (this.f13198P1 == 45) {
                                                        return mo21036X2();
                                                    }
                                                    return mo21054p3();
                                                case 43:
                                                    int i12 = this.f13191I1;
                                                    int i13 = this.f13192J1;
                                                    byte[] bArr10 = this.f12780W1;
                                                    int i14 = this.f14566Q;
                                                    this.f14566Q = i14 + 1;
                                                    if (!mo21026Q2(i12, i13, bArr10[i14])) {
                                                        return JsonToken.NOT_AVAILABLE;
                                                    }
                                                    if (this.f13198P1 == 45) {
                                                        return mo21036X2();
                                                    }
                                                    return mo21054p3();
                                                case 44:
                                                    int i15 = this.f13191I1;
                                                    int i16 = this.f13192J1;
                                                    byte[] bArr11 = this.f12780W1;
                                                    int i17 = this.f14566Q;
                                                    this.f14566Q = i17 + 1;
                                                    if (!mo21028R2(i15, i16, bArr11[i17])) {
                                                        return JsonToken.NOT_AVAILABLE;
                                                    }
                                                    if (this.f13198P1 == 45) {
                                                        return mo21036X2();
                                                    }
                                                    return mo21054p3();
                                                case 45:
                                                    return mo21036X2();
                                                default:
                                                    switch (i) {
                                                        case 50:
                                                            return mo21040b3();
                                                        case 51:
                                                            return mo21017L3(this.f13191I1);
                                                        case 52:
                                                            return mo21038Z2(this.f13191I1, true);
                                                        case 53:
                                                            return mo21038Z2(this.f13191I1, false);
                                                        case 54:
                                                            return mo21039a3(this.f13191I1);
                                                        case 55:
                                                            return mo21045g3(this.f13191I1);
                                                        default:
                                                            c97.m11761c();
                                                            return null;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            byte[] bArr12 = this.f12780W1;
            int i18 = this.f14566Q;
            this.f14566Q = i18 + 1;
            return mo21010E3(bArr12[i18] & 255);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        mo23230v1(": was expecting closing '*/' for comment", com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        return mo21496u2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return mo21490J2(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
     */
    /* renamed from: r3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo21056r3() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f15012g
            int r1 = r3.f13197O1
            r2 = 3
            if (r1 == r2) goto L_0x00a6
            r2 = 12
            if (r1 == r2) goto L_0x00a1
            r2 = 50
            if (r1 == r2) goto L_0x009c
            switch(r1) {
                case 16: goto L_0x0091;
                case 17: goto L_0x0086;
                case 18: goto L_0x007b;
                case 19: goto L_0x0072;
                default: goto L_0x0012;
            }
        L_0x0012:
            r2 = 0
            switch(r1) {
                case 24: goto L_0x006b;
                case 25: goto L_0x006b;
                case 26: goto L_0x0056;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r1) {
                case 30: goto L_0x004d;
                case 31: goto L_0x003a;
                case 32: goto L_0x004f;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r1) {
                case 52: goto L_0x0041;
                case 53: goto L_0x0041;
                case 54: goto L_0x0048;
                case 55: goto L_0x0048;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": was expecting rest of token (internal state: "
            r1.append(r2)
            int r2 = r3.f13197O1
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.fasterxml.jackson.core.JsonToken r2 = r3.f15012g
            r3.mo23230v1(r1, r2)
            return r0
        L_0x003a:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            java.lang.String r1 = ": was expecting fraction after exponent marker"
            r3.mo23230v1(r1, r0)
        L_0x0041:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            java.lang.String r1 = ": was expecting closing '*/' for comment"
            r3.mo23230v1(r1, r0)
        L_0x0048:
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21496u2()
            return r0
        L_0x004d:
            r3.f14563C1 = r2
        L_0x004f:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21490J2(r0)
            return r0
        L_0x0056:
            en6 r0 = r3.f14575o1
            int r0 = r0.mo19420t()
            boolean r1 = r3.f14587z1
            if (r1 == 0) goto L_0x0062
            int r0 = r0 + -1
        L_0x0062:
            r3.f14561A1 = r0
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21490J2(r0)
            return r0
        L_0x006b:
            java.lang.String r0 = "0"
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21491K2(r2, r0)
            return r0
        L_0x0072:
            int r0 = r3.f13200R1
            int r1 = r3.f13191I1
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21049k3(r0, r1)
            return r0
        L_0x007b:
            int r0 = r3.f13191I1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            java.lang.String r2 = "false"
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21047i3(r2, r0, r1)
            return r0
        L_0x0086:
            int r0 = r3.f13191I1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            java.lang.String r2 = "true"
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21047i3(r2, r0, r1)
            return r0
        L_0x0091:
            int r0 = r3.f13191I1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            java.lang.String r2 = "null"
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21047i3(r2, r0, r1)
            return r0
        L_0x009c:
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21041c3()
            return r0
        L_0x00a1:
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21496u2()
            return r0
        L_0x00a6:
            com.fasterxml.jackson.core.JsonToken r0 = r3.mo21496u2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h84.mo21056r3():com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: s3 */
    public final JsonToken mo21057s3(int i, int i2, int i3) throws IOException {
        int[] iArr = this.f13188F1;
        int[] k = ud0.m28151k();
        while (true) {
            int i4 = this.f14566Q;
            if (i4 >= this.f14567U) {
                this.f13189G1 = i;
                this.f13191I1 = i2;
                this.f13192J1 = i3;
                this.f13197O1 = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte b = this.f12780W1[i4] & 255;
            if (k[b] != 0) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = lm4.m21533k2(iArr, iArr.length);
                        this.f13188F1 = iArr;
                    }
                    iArr[i] = i2;
                    i++;
                }
                String z = this.f13187E1.mo27967z(iArr, i);
                if (z == null) {
                    z = mo21493r2(iArr, i, i3);
                }
                return mo21497v2(z);
            }
            this.f14566Q = i4 + 1;
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | b;
            } else {
                if (i >= iArr.length) {
                    iArr = lm4.m21533k2(iArr, iArr.length);
                    this.f13188F1 = iArr;
                }
                iArr[i] = i2;
                i2 = b;
                i3 = 1;
                i++;
            }
        }
    }

    /* renamed from: t3 */
    public final JsonToken mo21058t3(int i) throws IOException {
        if (i != 35) {
            if (i != 39) {
                if (i == 47) {
                    return mo21017L3(4);
                }
                if (i == 93) {
                    return mo21494s2();
                }
            } else if ((this.f9822a & f12774a2) != 0) {
                return mo21035W2(0, 0, 0);
            }
        } else if ((this.f9822a & f12777d2) != 0) {
            return mo21045g3(4);
        }
        if ((this.f9822a & f12775b2) == 0) {
            mo23233y1((char) i, "was expecting double-quote to start field name");
        }
        if (ud0.m28151k()[i] != 0) {
            mo23233y1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return mo21057s3(0, i, 1);
    }

    /* renamed from: u3 */
    public final JsonToken mo21059u3(int i, int i2, int i3) throws IOException {
        int i4;
        int[] iArr = this.f13188F1;
        int[] iArr2 = f12779f2;
        while (true) {
            int i5 = this.f14566Q;
            if (i5 >= this.f14567U) {
                this.f13189G1 = i;
                this.f13191I1 = i2;
                this.f13192J1 = i3;
                this.f13197O1 = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.f15012g = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.f12780W1;
            this.f14566Q = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (iArr2[i6] == 0) {
                if (i3 >= 4) {
                    if (i >= iArr.length) {
                        int[] k2 = lm4.m21533k2(iArr, iArr.length);
                        this.f13188F1 = k2;
                        iArr = k2;
                    }
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i3 = 1;
                    i2 = i6;
                }
            } else if (i6 == 34) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = lm4.m21533k2(iArr, iArr.length);
                        this.f13188F1 = iArr;
                    }
                    iArr[i] = i84.m19465B2(i2, i3);
                    i++;
                } else if (i == 0) {
                    return mo21497v2("");
                }
                String z = this.f13187E1.mo27967z(iArr, i);
                if (z == null) {
                    z = mo21493r2(iArr, i, i3);
                }
                return mo21497v2(z);
            } else {
                if (i6 != 92) {
                    mo22829b2(i6, PublicResolver.FUNC_NAME);
                } else {
                    i6 = mo21018M2();
                    if (i6 < 0) {
                        this.f13197O1 = 8;
                        this.f13198P1 = 7;
                        this.f13189G1 = i;
                        this.f13191I1 = i2;
                        this.f13192J1 = i3;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this.f15012g = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i >= iArr.length) {
                    iArr = lm4.m21533k2(iArr, iArr.length);
                    this.f13188F1 = iArr;
                }
                if (i6 > 127) {
                    int i7 = 0;
                    if (i3 >= 4) {
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (i6 < 2048) {
                        r10 = (i2 << 8) | (i6 >> 6) | 192;
                        r11 = i3 + 1;
                    } else {
                        int i8 = (i2 << 8) | (i6 >> 12) | 224;
                        int i9 = i3 + 1;
                        if (i9 >= 4) {
                            iArr[i] = i8;
                            i++;
                            i9 = 0;
                        } else {
                            i7 = i8;
                        }
                        r10 = (i7 << 8) | ((i6 >> 6) & 63) | 128;
                        r11 = i9 + 1;
                    }
                    i6 = (i6 & 63) | 128;
                }
                if (i3 >= 4) {
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i3 = 1;
                    i2 = i6;
                }
            }
            i3++;
            i2 = (i2 << 8) | i6;
        }
    }

    /* renamed from: v3 */
    public final String mo21060v3(int i, int i2) throws IOException {
        byte[] bArr = this.f12780W1;
        int[] iArr = f12779f2;
        int i3 = i + 1;
        byte b = bArr[i] & 255;
        if (iArr[b] == 0) {
            byte b2 = b | (i2 << 8);
            int i4 = i3 + 1;
            byte b3 = bArr[i3] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i5 = i4 + 1;
                byte b5 = bArr[i4] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    int i6 = i5 + 1;
                    byte b7 = bArr[i5] & 255;
                    if (iArr[b7] == 0) {
                        return mo21061w3(i6, b7, b6);
                    }
                    if (b7 != 34) {
                        return null;
                    }
                    this.f14566Q = i6;
                    return mo21499x2(this.f13190H1, b6, 4);
                } else if (b5 != 34) {
                    return null;
                } else {
                    this.f14566Q = i5;
                    return mo21499x2(this.f13190H1, b4, 3);
                }
            } else if (b3 != 34) {
                return null;
            } else {
                this.f14566Q = i4;
                return mo21499x2(this.f13190H1, b2, 2);
            }
        } else if (b != 34) {
            return null;
        } else {
            this.f14566Q = i3;
            return mo21499x2(this.f13190H1, i2, 1);
        }
    }

    /* renamed from: w3 */
    public final String mo21061w3(int i, int i2, int i3) throws IOException {
        byte[] bArr = this.f12780W1;
        int[] iArr = f12779f2;
        int i4 = i + 1;
        byte b = bArr[i] & 255;
        if (iArr[b] == 0) {
            byte b2 = b | (i2 << 8);
            int i5 = i4 + 1;
            byte b3 = bArr[i4] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i6 = i5 + 1;
                byte b5 = bArr[i5] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    int i7 = i6 + 1;
                    if ((bArr[i6] & 255) != 34) {
                        return null;
                    }
                    this.f14566Q = i7;
                    return mo21500y2(this.f13190H1, i3, b6, 4);
                } else if (b5 != 34) {
                    return null;
                } else {
                    this.f14566Q = i6;
                    return mo21500y2(this.f13190H1, i3, b4, 3);
                }
            } else if (b3 != 34) {
                return null;
            } else {
                this.f14566Q = i5;
                return mo21500y2(this.f13190H1, i3, b2, 2);
            }
        } else if (b != 34) {
            return null;
        } else {
            this.f14566Q = i4;
            return mo21500y2(this.f13190H1, i3, i2, 1);
        }
    }

    /* renamed from: x3 */
    public JsonToken mo21062x3(String str) throws IOException {
        mo23227s1("Unrecognized token '%s': was expecting %s", this.f14575o1.mo19413l(), mo22830c2());
        return JsonToken.NOT_AVAILABLE;
    }

    /* renamed from: y3 */
    public final int mo21063y3(int i) throws IOException {
        do {
            if (i != 32) {
                if (i == 10) {
                    this.f14569Y++;
                    this.f14570Z = this.f14566Q;
                } else if (i == 13) {
                    this.f13202T1++;
                    this.f14570Z = this.f14566Q;
                } else if (i != 9) {
                    mo23210A1(i);
                }
            }
            int i2 = this.f14566Q;
            if (i2 >= this.f14567U) {
                this.f15012g = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this.f12780W1;
            this.f14566Q = i2 + 1;
            i = bArr[i2] & 255;
        } while (i <= 32);
        return i;
    }

    /* renamed from: z3 */
    public final JsonToken mo21064z3(int i) throws IOException {
        int i2 = this.f14566Q;
        if (i2 >= this.f14567U) {
            this.f13197O1 = i;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.f15012g = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f12780W1;
        this.f14566Q = i2 + 1;
        byte b = bArr[i2] & 255;
        if (i == 4) {
            return mo21009D3(b);
        }
        if (i == 5) {
            return mo21010E3(b);
        }
        switch (i) {
            case 12:
                return mo21025P3(b);
            case 13:
                return mo21031S3(b);
            case 14:
                return mo21029R3(b);
            case 15:
                return mo21027Q3(b);
            default:
                c97.m11761c();
                return null;
        }
    }
}
