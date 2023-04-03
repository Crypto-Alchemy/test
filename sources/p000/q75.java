package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: q75 */
/* compiled from: ReaderBasedJsonParser */
public class q75 extends lm4 {

    /* renamed from: O1 */
    public static final int f16833O1 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* renamed from: P1 */
    public static final int f16834P1 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* renamed from: Q1 */
    public static final int f16835Q1 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();

    /* renamed from: R1 */
    public static final int f16836R1 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* renamed from: S1 */
    public static final int f16837S1 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* renamed from: T1 */
    public static final int f16838T1 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* renamed from: U1 */
    public static final int f16839U1 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* renamed from: V1 */
    public static final int f16840V1 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* renamed from: W1 */
    public static final int[] f16841W1 = ud0.m28148h();

    /* renamed from: E1 */
    public Reader f16842E1;

    /* renamed from: F1 */
    public char[] f16843F1;

    /* renamed from: G1 */
    public boolean f16844G1;

    /* renamed from: H1 */
    public xe4 f16845H1;

    /* renamed from: I1 */
    public final yd0 f16846I1;

    /* renamed from: J1 */
    public final int f16847J1;

    /* renamed from: K1 */
    public boolean f16848K1;

    /* renamed from: L1 */
    public long f16849L1;

    /* renamed from: M1 */
    public int f16850M1;

    /* renamed from: N1 */
    public int f16851N1;

    public q75(po2 po2, int i, Reader reader, xe4 xe4, yd0 yd0, char[] cArr, int i2, int i3, boolean z) {
        super(po2, i);
        this.f16842E1 = reader;
        this.f16845H1 = xe4;
        this.f16843F1 = cArr;
        this.f14566Q = i2;
        this.f14567U = i3;
        this.f14570Z = i2;
        this.f14568X = (long) (-i2);
        this.f16846I1 = yd0;
        this.f16847J1 = yd0.mo28024m();
        this.f16844G1 = z;
    }

    /* renamed from: A2 */
    public final String mo24956A2(int i, int i2, int[] iArr) throws IOException {
        this.f14575o1.mo19395A(this.f16843F1, i, this.f14566Q - i);
        char[] s = this.f14575o1.mo19419s();
        int t = this.f14575o1.mo19420t();
        int length = iArr.length;
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                break;
            }
            char c = this.f16843F1[this.f14566Q];
            if (c >= length) {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
            } else if (iArr[c] != 0) {
                break;
            }
            this.f14566Q++;
            i2 = (i2 * 33) + c;
            int i3 = t + 1;
            s[t] = c;
            if (i3 >= s.length) {
                s = this.f14575o1.mo19417p();
                t = 0;
            } else {
                t = i3;
            }
        }
        this.f14575o1.mo19399E(t);
        en6 en6 = this.f14575o1;
        return this.f16846I1.mo28023l(en6.mo19422u(), en6.mo19423v(), en6.mo19400F(), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r4 != 44) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3.f14571b1.mo28327f() == false) goto L_0x009a;
     */
    /* renamed from: B2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken mo24957B2(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x008e
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x0075
            r0 = 78
            if (r4 == r0) goto L_0x005c
            r0 = 93
            if (r4 == r0) goto L_0x003c
            r0 = 43
            if (r4 == r0) goto L_0x001b
            r0 = 44
            if (r4 == r0) goto L_0x0045
            goto L_0x009a
        L_0x001b:
            int r4 = r3.f14566Q
            int r0 = r3.f14567U
            if (r4 < r0) goto L_0x002c
            boolean r4 = r3.mo24958C2()
            if (r4 != 0) goto L_0x002c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3.mo23231w1(r4)
        L_0x002c:
            char[] r4 = r3.f16843F1
            int r0 = r3.f14566Q
            int r1 = r0 + 1
            r3.f14566Q = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo25004y2(r4, r0)
            return r4
        L_0x003c:
            t53 r0 = r3.f14571b1
            boolean r0 = r0.mo28327f()
            if (r0 != 0) goto L_0x0045
            goto L_0x009a
        L_0x0045:
            t53 r0 = r3.f14571b1
            boolean r0 = r0.mo28329h()
            if (r0 != 0) goto L_0x009a
            int r0 = r3.f9822a
            int r2 = f16836R1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x009a
            int r4 = r3.f14566Q
            int r4 = r4 - r1
            r3.f14566Q = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x005c:
            java.lang.String r0 = "NaN"
            r3.mo24962G2(r0, r1)
            int r1 = r3.f9822a
            int r2 = f16835Q1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x006f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo22841o2(r0, r1)
            return r4
        L_0x006f:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.mo23225q1(r0)
            goto L_0x009a
        L_0x0075:
            java.lang.String r0 = "Infinity"
            r3.mo24962G2(r0, r1)
            int r1 = r3.f9822a
            int r2 = f16835Q1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0088
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo22841o2(r0, r1)
            return r4
        L_0x0088:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.mo23225q1(r0)
            goto L_0x009a
        L_0x008e:
            int r0 = r3.f9822a
            int r1 = f16837S1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x009a
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo25003x2()
            return r4
        L_0x009a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.mo22830c2()
            r3.mo24977V2(r0, r1)
        L_0x00b9:
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
        throw new UnsupportedOperationException("Method not decompiled: p000.q75.mo24957B2(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: C2 */
    public boolean mo24958C2() throws IOException {
        Reader reader = this.f16842E1;
        if (reader != null) {
            char[] cArr = this.f16843F1;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i = this.f14567U;
                long j = (long) i;
                this.f14568X += j;
                this.f14570Z -= i;
                this.f16849L1 -= j;
                this.f14566Q = 0;
                this.f14567U = read;
                return true;
            }
            mo18440L1();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f14567U);
            }
        }
        return false;
    }

    /* renamed from: D2 */
    public void mo24959D2() throws IOException {
        if (!mo24958C2()) {
            mo23229u1();
        }
    }

    /* renamed from: E0 */
    public String mo13930E0() throws IOException {
        String str;
        JsonToken jsonToken;
        this.f14580t1 = 0;
        JsonToken jsonToken2 = this.f15012g;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            mo24965J2();
            return null;
        }
        if (this.f16848K1) {
            mo24986e3();
        }
        int f3 = mo24987f3();
        if (f3 < 0) {
            close();
            this.f15012g = null;
            return null;
        }
        this.f14579s1 = null;
        if (f3 == 93 || f3 == 125) {
            mo24998s2(f3);
            return null;
        }
        if (this.f14571b1.mo26153p()) {
            f3 = mo24983b3(f3);
            if ((this.f9822a & f16833O1) != 0 && (f3 == 93 || f3 == 125)) {
                mo24998s2(f3);
                return null;
            }
        }
        if (!this.f14571b1.mo28328g()) {
            mo24990i3();
            mo24966K2(f3);
            return null;
        }
        mo24991j3();
        if (f3 == 34) {
            str = mo24970O2();
        } else {
            str = mo25005z2(f3);
        }
        this.f14571b1.mo26157t(str);
        this.f15012g = jsonToken3;
        int Z2 = mo24981Z2();
        mo24990i3();
        if (Z2 == 34) {
            this.f16848K1 = true;
            this.f14573e1 = JsonToken.VALUE_STRING;
            return str;
        }
        if (Z2 == 45) {
            jsonToken = mo24972Q2();
        } else if (Z2 == 46) {
            jsonToken = mo24969N2();
        } else if (Z2 == 91) {
            jsonToken = JsonToken.START_ARRAY;
        } else if (Z2 == 102) {
            mo24960E2();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (Z2 == 110) {
            mo24961F2();
            jsonToken = JsonToken.VALUE_NULL;
        } else if (Z2 == 116) {
            mo24964I2();
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (Z2 != 123) {
            switch (Z2) {
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
                    jsonToken = mo24974S2(Z2);
                    break;
                default:
                    jsonToken = mo24957B2(Z2);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this.f14573e1 = jsonToken;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r0 + 1;
     */
    /* renamed from: E2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24960E2() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f14566Q
            int r1 = r0 + 4
            int r2 = r5.f14567U
            r3 = 1
            if (r1 >= r2) goto L_0x0038
            char[] r1 = r5.f16843F1
            char r2 = r1[r0]
            r4 = 97
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 115(0x73, float:1.61E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x0035
            r2 = 93
            if (r1 == r2) goto L_0x0035
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0038
        L_0x0035:
            r5.f14566Q = r0
            return
        L_0x0038:
            java.lang.String r0 = "false"
            r5.mo24962G2(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q75.mo24960E2():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = r0 + 1;
     */
    /* renamed from: F2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24961F2() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f14566Q
            int r1 = r0 + 3
            int r2 = r5.f14567U
            r3 = 1
            if (r1 >= r2) goto L_0x002f
            char[] r1 = r5.f16843F1
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002c
            r2 = 93
            if (r1 == r2) goto L_0x002c
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x002f
        L_0x002c:
            r5.f14566Q = r0
            return
        L_0x002f:
            java.lang.String r0 = "null"
            r5.mo24962G2(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q75.mo24961F2():void");
    }

    /* renamed from: G */
    public Object mo13931G() {
        return this.f16842E1;
    }

    /* renamed from: G0 */
    public final String mo13932G0() throws IOException {
        if (this.f15012g == JsonToken.FIELD_NAME) {
            this.f14577q1 = false;
            JsonToken jsonToken = this.f14573e1;
            this.f14573e1 = null;
            this.f15012g = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.f16848K1) {
                    this.f16848K1 = false;
                    mo25000u2();
                }
                return this.f14575o1.mo19413l();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this.f14571b1 = this.f14571b1.mo26151m(this.f14574k0, this.f14582v0);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this.f14571b1 = this.f14571b1.mo26152n(this.f14574k0, this.f14582v0);
            }
            return null;
        } else if (mo13938N0() == JsonToken.VALUE_STRING) {
            return mo13947W();
        } else {
            return null;
        }
    }

    /* renamed from: G2 */
    public final void mo24962G2(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this.f14566Q + length >= this.f14567U) {
            mo24963H2(str, i);
            return;
        }
        do {
            if (this.f16843F1[this.f14566Q] != str.charAt(i)) {
                mo24976U2(str.substring(0, i));
            }
            i2 = this.f14566Q + 1;
            this.f14566Q = i2;
            i++;
        } while (i < length);
        char c = this.f16843F1[i2];
        if (c >= '0' && c != ']' && c != '}') {
            mo24997r2(str, i, c);
        }
    }

    /* renamed from: H2 */
    public final void mo24963H2(String str, int i) throws IOException {
        int i2;
        char c;
        int length = str.length();
        do {
            if ((this.f14566Q >= this.f14567U && !mo24958C2()) || this.f16843F1[this.f14566Q] != str.charAt(i)) {
                mo24976U2(str.substring(0, i));
            }
            i2 = this.f14566Q + 1;
            this.f14566Q = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f14567U || mo24958C2()) && (c = this.f16843F1[this.f14566Q]) >= '0' && c != ']' && c != '}') {
            mo24997r2(str, i, c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = r0 + 1;
     */
    /* renamed from: I2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24964I2() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f14566Q
            int r1 = r0 + 3
            int r2 = r5.f14567U
            r3 = 1
            if (r1 >= r2) goto L_0x0031
            char[] r1 = r5.f16843F1
            char r2 = r1[r0]
            r4 = 114(0x72, float:1.6E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002e
            r2 = 93
            if (r1 == r2) goto L_0x002e
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0031
        L_0x002e:
            r5.f14566Q = r0
            return
        L_0x0031:
            java.lang.String r0 = "true"
            r5.mo24962G2(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q75.mo24964I2():void");
    }

    /* renamed from: J2 */
    public final JsonToken mo24965J2() {
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

    /* renamed from: K2 */
    public final JsonToken mo24966K2(int i) throws IOException {
        if (i == 34) {
            this.f16848K1 = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f15012g = jsonToken;
            return jsonToken;
        } else if (i == 91) {
            this.f14571b1 = this.f14571b1.mo26151m(this.f14574k0, this.f14582v0);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f15012g = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            mo24962G2("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f15012g = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            mo24962G2("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f15012g = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            mo24962G2("true", 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.f15012g = jsonToken5;
            return jsonToken5;
        } else if (i != 123) {
            switch (i) {
                case 44:
                    if (!this.f14571b1.mo28329h() && (this.f9822a & f16836R1) != 0) {
                        this.f14566Q--;
                        JsonToken jsonToken6 = JsonToken.VALUE_NULL;
                        this.f15012g = jsonToken6;
                        return jsonToken6;
                    }
                case 45:
                    JsonToken Q2 = mo24972Q2();
                    this.f15012g = Q2;
                    return Q2;
                case 46:
                    JsonToken N2 = mo24969N2();
                    this.f15012g = N2;
                    return N2;
                default:
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
                            JsonToken S2 = mo24974S2(i);
                            this.f15012g = S2;
                            return S2;
                    }
            }
            JsonToken B2 = mo24957B2(i);
            this.f15012g = B2;
            return B2;
        } else {
            this.f14571b1 = this.f14571b1.mo26152n(this.f14574k0, this.f14582v0);
            JsonToken jsonToken7 = JsonToken.START_OBJECT;
            this.f15012g = jsonToken7;
            return jsonToken7;
        }
    }

    /* renamed from: L1 */
    public void mo18440L1() throws IOException {
        if (this.f16842E1 != null) {
            if (this.f14564M.mo24744n() || mo13989y0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.f16842E1.close();
            }
            this.f16842E1 = null;
        }
    }

    /* renamed from: L2 */
    public String mo24967L2() throws IOException {
        int i = this.f14566Q;
        int i2 = this.f16847J1;
        int i3 = this.f14567U;
        if (i < i3) {
            int[] iArr = f16841W1;
            int length = iArr.length;
            do {
                char[] cArr = this.f16843F1;
                char c = cArr[i];
                if (c != '\'') {
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this.f14566Q;
                    this.f14566Q = i + 1;
                    return this.f16846I1.mo28023l(cArr, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this.f14566Q;
        this.f14566Q = i;
        return mo24971P2(i5, i2, 39);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r9 == 'E') goto L_0x0037;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0088  */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo24968M2(int r9, int r10, int r11, boolean r12, int r13) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.f14567U
            r1 = 57
            r2 = 48
            r3 = 0
            r4 = 46
            if (r9 != r4) goto L_0x002d
            r9 = r3
        L_0x000c:
            if (r11 < r0) goto L_0x0013
            com.fasterxml.jackson.core.JsonToken r9 = r8.mo24973R2(r12, r10)
            return r9
        L_0x0013:
            char[] r4 = r8.f16843F1
            int r5 = r11 + 1
            char r11 = r4[r11]
            if (r11 < r2) goto L_0x0022
            if (r11 <= r1) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            int r9 = r9 + 1
            r11 = r5
            goto L_0x000c
        L_0x0022:
            if (r9 != 0) goto L_0x0029
            java.lang.String r4 = "Decimal point not followed by a digit"
            r8.mo23219J1(r11, r4)
        L_0x0029:
            r7 = r11
            r11 = r9
            r9 = r7
            goto L_0x002f
        L_0x002d:
            r5 = r11
            r11 = r3
        L_0x002f:
            r4 = 101(0x65, float:1.42E-43)
            if (r9 == r4) goto L_0x0037
            r4 = 69
            if (r9 != r4) goto L_0x007c
        L_0x0037:
            if (r5 < r0) goto L_0x0040
            r8.f14566Q = r10
            com.fasterxml.jackson.core.JsonToken r9 = r8.mo24973R2(r12, r10)
            return r9
        L_0x0040:
            char[] r9 = r8.f16843F1
            int r4 = r5 + 1
            char r5 = r9[r5]
            r6 = 45
            if (r5 == r6) goto L_0x0052
            r6 = 43
            if (r5 != r6) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r9 = r5
        L_0x0050:
            r5 = r4
            goto L_0x005f
        L_0x0052:
            if (r4 < r0) goto L_0x005b
            r8.f14566Q = r10
            com.fasterxml.jackson.core.JsonToken r9 = r8.mo24973R2(r12, r10)
            return r9
        L_0x005b:
            int r5 = r4 + 1
            char r9 = r9[r4]
        L_0x005f:
            if (r9 > r1) goto L_0x0075
            if (r9 < r2) goto L_0x0075
            int r3 = r3 + 1
            if (r5 < r0) goto L_0x006e
            r8.f14566Q = r10
            com.fasterxml.jackson.core.JsonToken r9 = r8.mo24973R2(r12, r10)
            return r9
        L_0x006e:
            char[] r9 = r8.f16843F1
            int r4 = r5 + 1
            char r9 = r9[r5]
            goto L_0x0050
        L_0x0075:
            if (r3 != 0) goto L_0x007c
            java.lang.String r0 = "Exponent indicator not followed by a digit"
            r8.mo23219J1(r9, r0)
        L_0x007c:
            int r5 = r5 + -1
            r8.f14566Q = r5
            t53 r0 = r8.f14571b1
            boolean r0 = r0.mo28329h()
            if (r0 == 0) goto L_0x008b
            r8.mo24994m3(r9)
        L_0x008b:
            int r5 = r5 - r10
            en6 r9 = r8.f14575o1
            char[] r0 = r8.f16843F1
            r9.mo19395A(r0, r10, r5)
            com.fasterxml.jackson.core.JsonToken r9 = r8.mo22842p2(r12, r13, r11, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q75.mo24968M2(int, int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: N0 */
    public final JsonToken mo13938N0() throws IOException {
        JsonToken jsonToken;
        String str;
        JsonToken jsonToken2 = this.f15012g;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return mo24965J2();
        }
        this.f14580t1 = 0;
        if (this.f16848K1) {
            mo24986e3();
        }
        int f3 = mo24987f3();
        if (f3 < 0) {
            close();
            this.f15012g = null;
            return null;
        }
        this.f14579s1 = null;
        if (f3 == 93 || f3 == 125) {
            mo24998s2(f3);
            return this.f15012g;
        }
        if (this.f14571b1.mo26153p()) {
            f3 = mo24983b3(f3);
            if ((this.f9822a & f16833O1) != 0 && (f3 == 93 || f3 == 125)) {
                mo24998s2(f3);
                return this.f15012g;
            }
        }
        boolean g = this.f14571b1.mo28328g();
        if (g) {
            mo24991j3();
            if (f3 == 34) {
                str = mo24970O2();
            } else {
                str = mo25005z2(f3);
            }
            this.f14571b1.mo26157t(str);
            this.f15012g = jsonToken3;
            f3 = mo24981Z2();
        }
        mo24990i3();
        if (f3 == 34) {
            this.f16848K1 = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (f3 == 91) {
            if (!g) {
                this.f14571b1 = this.f14571b1.mo26151m(this.f14574k0, this.f14582v0);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (f3 == 102) {
            mo24960E2();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (f3 != 110) {
            if (f3 != 116) {
                if (f3 == 123) {
                    if (!g) {
                        this.f14571b1 = this.f14571b1.mo26152n(this.f14574k0, this.f14582v0);
                    }
                    jsonToken = JsonToken.START_OBJECT;
                } else if (f3 == 125) {
                    mo23233y1(f3, "expected a value");
                } else if (f3 == 45) {
                    jsonToken = mo24972Q2();
                } else if (f3 != 46) {
                    switch (f3) {
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
                            jsonToken = mo24974S2(f3);
                            break;
                        default:
                            jsonToken = mo24957B2(f3);
                            break;
                    }
                } else {
                    jsonToken = mo24969N2();
                }
            }
            mo24964I2();
            jsonToken = JsonToken.VALUE_TRUE;
        } else {
            mo24961F2();
            jsonToken = JsonToken.VALUE_NULL;
        }
        if (g) {
            this.f14573e1 = jsonToken;
            return this.f15012g;
        }
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: N2 */
    public final JsonToken mo24969N2() throws IOException {
        if (!mo13989y0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return mo24957B2(46);
        }
        int i = this.f14566Q;
        return mo24968M2(46, i - 1, i, false, 0);
    }

    /* renamed from: O2 */
    public final String mo24970O2() throws IOException {
        int i = this.f14566Q;
        int i2 = this.f16847J1;
        int[] iArr = f16841W1;
        while (true) {
            if (i >= this.f14567U) {
                break;
            }
            char[] cArr = this.f16843F1;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this.f14566Q;
                this.f14566Q = i + 1;
                return this.f16846I1.mo28023l(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this.f14566Q;
        this.f14566Q = i;
        return mo24971P2(i4, i2, 34);
    }

    /* renamed from: P1 */
    public char mo18445P1() throws IOException {
        if (this.f14566Q >= this.f14567U && !mo24958C2()) {
            mo23230v1(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this.f16843F1;
        int i = this.f14566Q;
        this.f14566Q = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return 8;
        }
        if (c == 'f') {
            return 12;
        }
        if (c == 'n') {
            return 10;
        }
        if (c == 'r') {
            return 13;
        }
        if (c == 't') {
            return 9;
        }
        if (c != 'u') {
            return mo22822T1(c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                mo23230v1(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this.f16843F1;
            int i4 = this.f14566Q;
            this.f14566Q = i4 + 1;
            char c2 = cArr2[i4];
            int b = ud0.m28142b(c2);
            if (b < 0) {
                mo23233y1(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | b;
        }
        return (char) i2;
    }

    /* renamed from: P2 */
    public final String mo24971P2(int i, int i2, int i3) throws IOException {
        this.f14575o1.mo19395A(this.f16843F1, i, this.f14566Q - i);
        char[] s = this.f14575o1.mo19419s();
        int t = this.f14575o1.mo19420t();
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                mo23230v1(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this.f16843F1;
            int i4 = this.f14566Q;
            this.f14566Q = i4 + 1;
            char c = cArr[i4];
            if (c <= '\\') {
                if (c == '\\') {
                    c = mo18445P1();
                } else if (c <= i3) {
                    if (c == i3) {
                        this.f14575o1.mo19399E(t);
                        en6 en6 = this.f14575o1;
                        return this.f16846I1.mo28023l(en6.mo19422u(), en6.mo19423v(), en6.mo19400F(), i2);
                    } else if (c < ' ') {
                        mo22829b2(c, PublicResolver.FUNC_NAME);
                    }
                }
            }
            i2 = (i2 * 33) + c;
            int i5 = t + 1;
            s[t] = c;
            if (i5 >= s.length) {
                s = this.f14575o1.mo19417p();
                t = 0;
            } else {
                t = i5;
            }
        }
    }

    /* renamed from: Q */
    public yz2<StreamReadCapability> mo13943Q() {
        return lm4.f14560D1;
    }

    /* renamed from: Q2 */
    public final JsonToken mo24972Q2() throws IOException {
        int i = this.f14566Q;
        int i2 = i - 1;
        int i3 = this.f14567U;
        if (i >= i3) {
            return mo24973R2(true, i2);
        }
        int i4 = i + 1;
        char c = this.f16843F1[i];
        if (c > '9' || c < '0') {
            this.f14566Q = i4;
            return mo25004y2(c, true);
        } else if (c == '0') {
            return mo24973R2(true, i2);
        } else {
            int i5 = 1;
            while (i4 < i3) {
                int i6 = i4 + 1;
                char c2 = this.f16843F1[i4];
                if (c2 >= '0' && c2 <= '9') {
                    i5++;
                    i4 = i6;
                } else if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.f14566Q = i6;
                    return mo24968M2(c2, i2, i6, true, i5);
                } else {
                    int i7 = i6 - 1;
                    this.f14566Q = i7;
                    if (this.f14571b1.mo28329h()) {
                        mo24994m3(c2);
                    }
                    this.f14575o1.mo19395A(this.f16843F1, i2, i7 - i2);
                    return mo22843q2(true, i5);
                }
            }
            return mo24973R2(true, i2);
        }
    }

    /* renamed from: R2 */
    public final JsonToken mo24973R2(boolean z, int i) throws IOException {
        int i2;
        char c;
        boolean z2;
        int i3;
        char c2;
        char n3;
        int i4;
        if (z) {
            i++;
        }
        this.f14566Q = i;
        char[] m = this.f14575o1.mo19414m();
        int i5 = 0;
        if (z) {
            m[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i6 = this.f14566Q;
        if (i6 < this.f14567U) {
            char[] cArr = this.f16843F1;
            this.f14566Q = i6 + 1;
            c = cArr[i6];
        } else {
            c = mo24996o3("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (c == '0') {
            c = mo24993l3();
        }
        int i7 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i7++;
                if (i2 >= m.length) {
                    m = this.f14575o1.mo19417p();
                    i2 = 0;
                }
                int i8 = i2 + 1;
                m[i2] = c;
                if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                    c = 0;
                    i2 = i8;
                    z2 = true;
                    break;
                }
                char[] cArr2 = this.f16843F1;
                int i9 = this.f14566Q;
                this.f14566Q = i9 + 1;
                c = cArr2[i9];
                i2 = i8;
            } else {
                z2 = false;
            }
        }
        z2 = false;
        if (i7 == 0) {
            return mo25004y2(c, z);
        }
        if (c == '.') {
            if (i2 >= m.length) {
                m = this.f14575o1.mo19417p();
                i2 = 0;
            }
            m[i2] = c;
            int i10 = i2 + 1;
            i3 = 0;
            while (true) {
                if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.f16843F1;
                int i11 = this.f14566Q;
                this.f14566Q = i11 + 1;
                c = cArr3[i11];
                if (c < '0' || c > '9') {
                    break;
                }
                i3++;
                if (i2 >= m.length) {
                    m = this.f14575o1.mo19417p();
                    i2 = 0;
                }
                m[i2] = c;
                i10 = i2 + 1;
            }
            if (i3 == 0) {
                mo23219J1(c, "Decimal point not followed by a digit");
            }
        } else {
            i3 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i2 >= m.length) {
                m = this.f14575o1.mo19417p();
                i2 = 0;
            }
            int i12 = i2 + 1;
            m[i2] = c;
            int i13 = this.f14566Q;
            if (i13 < this.f14567U) {
                char[] cArr4 = this.f16843F1;
                this.f14566Q = i13 + 1;
                c2 = cArr4[i13];
            } else {
                c2 = mo24995n3("expected a digit for number exponent");
            }
            if (c2 == '-' || c2 == '+') {
                if (i12 >= m.length) {
                    m = this.f14575o1.mo19417p();
                    i12 = 0;
                }
                int i14 = i12 + 1;
                m[i12] = c2;
                int i15 = this.f14566Q;
                if (i15 < this.f14567U) {
                    char[] cArr5 = this.f16843F1;
                    this.f14566Q = i15 + 1;
                    n3 = cArr5[i15];
                } else {
                    n3 = mo24995n3("expected a digit for number exponent");
                }
                i12 = i14;
            }
            int i16 = 0;
            char c3 = c2;
            while (true) {
                if (c <= '9' && c >= '0') {
                    i16++;
                    if (i12 >= m.length) {
                        m = this.f14575o1.mo19417p();
                        i12 = 0;
                    }
                    i4 = i12 + 1;
                    m[i12] = c;
                    if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                        i5 = i16;
                        z2 = true;
                        break;
                    }
                    char[] cArr6 = this.f16843F1;
                    int i17 = this.f14566Q;
                    this.f14566Q = i17 + 1;
                    c3 = cArr6[i17];
                    i12 = i4;
                } else {
                    i5 = i16;
                    i4 = i12;
                }
            }
            i5 = i16;
            i4 = i12;
            if (i5 == 0) {
                mo23219J1(c, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.f14566Q--;
            if (this.f14571b1.mo28329h()) {
                mo24994m3(c);
            }
        }
        this.f14575o1.mo19399E(i2);
        return mo22840n2(z, i7, i3, i5);
    }

    /* renamed from: S0 */
    public int mo13946S0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.f16848K1 || this.f15012g != JsonToken.VALUE_STRING) {
            byte[] l = mo13975l(base64Variant);
            outputStream.write(l);
            return l.length;
        }
        byte[] d = this.f14564M.mo24734d();
        try {
            return mo24975T2(base64Variant, outputStream, d);
        } finally {
            this.f14564M.mo24745o(d);
        }
    }

    /* renamed from: S2 */
    public final JsonToken mo24974S2(int i) throws IOException {
        int i2 = this.f14566Q;
        int i3 = i2 - 1;
        int i4 = this.f14567U;
        if (i == 48) {
            return mo24973R2(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this.f16843F1[i2];
            if (c >= '0' && c <= '9') {
                i5++;
                i2 = i6;
            } else if (c == '.' || c == 'e' || c == 'E') {
                this.f14566Q = i6;
                return mo24968M2(c, i3, i6, false, i5);
            } else {
                int i7 = i6 - 1;
                this.f14566Q = i7;
                if (this.f14571b1.mo28329h()) {
                    mo24994m3(c);
                }
                this.f14575o1.mo19395A(this.f16843F1, i3, i7 - i3);
                return mo22843q2(false, i5);
            }
        }
        this.f14566Q = i3;
        return mo24973R2(false, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r10 < 0) goto L_0x015f;
     */
    /* renamed from: T2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24975T2(com.fasterxml.jackson.core.Base64Variant r17, java.io.OutputStream r18, byte[] r19) throws java.io.IOException {
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
            r16.mo24959D2()
        L_0x0017:
            char[] r9 = r0.f16843F1
            int r10 = r0.f14566Q
            int r11 = r10 + 1
            r0.f14566Q = r11
            char r9 = r9[r10]
            r10 = 32
            if (r9 <= r10) goto L_0x015f
            int r10 = r1.decodeBase64Char((char) r9)
            r11 = 34
            if (r10 >= 0) goto L_0x0039
            if (r9 != r11) goto L_0x0031
            goto L_0x0124
        L_0x0031:
            int r10 = r0.mo22817N1(r1, r9, r6)
            if (r10 >= 0) goto L_0x0039
            goto L_0x015f
        L_0x0039:
            if (r7 <= r4) goto L_0x0040
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            r7 = r6
        L_0x0040:
            int r9 = r0.f14566Q
            int r12 = r0.f14567U
            if (r9 < r12) goto L_0x0049
            r16.mo24959D2()
        L_0x0049:
            char[] r9 = r0.f16843F1
            int r12 = r0.f14566Q
            int r13 = r12 + 1
            r0.f14566Q = r13
            char r9 = r9[r12]
            int r12 = r1.decodeBase64Char((char) r9)
            r13 = 1
            if (r12 >= 0) goto L_0x005e
            int r12 = r0.mo22817N1(r1, r9, r13)
        L_0x005e:
            int r9 = r10 << 6
            r9 = r9 | r12
            int r10 = r0.f14566Q
            int r12 = r0.f14567U
            if (r10 < r12) goto L_0x006a
            r16.mo24959D2()
        L_0x006a:
            char[] r10 = r0.f16843F1
            int r12 = r0.f14566Q
            int r14 = r12 + 1
            r0.f14566Q = r14
            char r10 = r10[r12]
            int r12 = r1.decodeBase64Char((char) r10)
            r14 = 2
            r15 = -2
            if (r12 >= 0) goto L_0x00e8
            if (r12 == r15) goto L_0x009d
            if (r10 != r11) goto L_0x0098
            int r4 = r9 >> 4
            int r5 = r7 + 1
            byte r4 = (byte) r4
            r3[r7] = r4
            boolean r4 = r17.usesPadding()
            if (r4 == 0) goto L_0x0095
            int r4 = r0.f14566Q
            int r4 = r4 - r13
            r0.f14566Q = r4
            r16.mo22821S1(r17)
        L_0x0095:
            r7 = r5
            goto L_0x0124
        L_0x0098:
            int r10 = r0.mo22817N1(r1, r10, r14)
            r12 = r10
        L_0x009d:
            if (r12 != r15) goto L_0x00e8
            int r10 = r0.f14566Q
            int r11 = r0.f14567U
            if (r10 < r11) goto L_0x00a8
            r16.mo24959D2()
        L_0x00a8:
            char[] r10 = r0.f16843F1
            int r11 = r0.f14566Q
            int r12 = r11 + 1
            r0.f14566Q = r12
            char r10 = r10[r11]
            boolean r11 = r1.usesPaddingChar((char) r10)
            if (r11 != 0) goto L_0x00de
            int r11 = r0.mo22817N1(r1, r10, r5)
            if (r11 != r15) goto L_0x00bf
            goto L_0x00de
        L_0x00bf:
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
        L_0x00de:
            int r9 = r9 >> 4
            int r10 = r7 + 1
            byte r9 = (byte) r9
            r3[r7] = r9
            r7 = r10
            goto L_0x000e
        L_0x00e8:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r0.f14566Q
            int r12 = r0.f14567U
            if (r10 < r12) goto L_0x00f4
            r16.mo24959D2()
        L_0x00f4:
            char[] r10 = r0.f16843F1
            int r12 = r0.f14566Q
            int r5 = r12 + 1
            r0.f14566Q = r5
            char r5 = r10[r12]
            int r10 = r1.decodeBase64Char((char) r5)
            if (r10 >= 0) goto L_0x0146
            if (r10 == r15) goto L_0x0134
            if (r5 != r11) goto L_0x012d
            int r4 = r9 >> 2
            int r5 = r7 + 1
            int r9 = r4 >> 8
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r17.usesPadding()
            if (r4 == 0) goto L_0x0124
            int r4 = r0.f14566Q
            int r4 = r4 - r13
            r0.f14566Q = r4
            r16.mo22821S1(r17)
        L_0x0124:
            r0.f16848K1 = r6
            if (r7 <= 0) goto L_0x012c
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
        L_0x012c:
            return r8
        L_0x012d:
            r11 = 3
            int r5 = r0.mo22817N1(r1, r5, r11)
            r10 = r5
            goto L_0x0135
        L_0x0134:
            r11 = 3
        L_0x0135:
            if (r10 != r15) goto L_0x0147
            int r5 = r9 >> 2
            int r9 = r7 + 1
            int r10 = r5 >> 8
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r9 + 1
            byte r5 = (byte) r5
            r3[r9] = r5
            goto L_0x0160
        L_0x0146:
            r11 = 3
        L_0x0147:
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
            goto L_0x0160
        L_0x015f:
            r11 = r5
        L_0x0160:
            r5 = r11
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q75.mo24975T2(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    /* renamed from: U2 */
    public void mo24976U2(String str) throws IOException {
        mo24977V2(str, mo22830c2());
    }

    /* renamed from: V2 */
    public void mo24977V2(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                break;
            }
            char c = this.f16843F1[this.f14566Q];
            if (Character.isJavaIdentifierPart(c)) {
                this.f14566Q++;
                sb.append(c);
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

    /* renamed from: W */
    public final String mo13947W() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return mo25002w2(jsonToken);
        }
        if (this.f16848K1) {
            this.f16848K1 = false;
            mo25000u2();
        }
        return this.f14575o1.mo19413l();
    }

    /* renamed from: W2 */
    public final int mo24978W2() throws IOException {
        char c;
        while (true) {
            if (this.f14566Q < this.f14567U || mo24958C2()) {
                char[] cArr = this.f16843F1;
                int i = this.f14566Q;
                int i2 = i + 1;
                this.f14566Q = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        mo24984c3();
                    } else if (c != '#' || !mo24989h3()) {
                        return c;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        this.f14569Y++;
                        this.f14570Z = i2;
                    } else if (c == 13) {
                        mo24980Y2();
                    } else if (c != 9) {
                        mo23210A1(c);
                    }
                }
            } else {
                throw mo13953a("Unexpected end-of-input within/between " + this.f14571b1.mo28330j() + " entries");
            }
        }
        return c;
    }

    /* renamed from: X */
    public final char[] mo13949X() throws IOException {
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
            } else if (this.f16848K1) {
                this.f16848K1 = false;
                mo25000u2();
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
    public final void mo24979X2() throws IOException {
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                break;
            }
            char[] cArr = this.f16843F1;
            int i = this.f14566Q;
            int i2 = i + 1;
            this.f14566Q = i2;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (i2 >= this.f14567U && !mo24958C2()) {
                        break;
                    }
                    char[] cArr2 = this.f16843F1;
                    int i3 = this.f14566Q;
                    if (cArr2[i3] == '/') {
                        this.f14566Q = i3 + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        this.f14569Y++;
                        this.f14570Z = i2;
                    } else if (c == 13) {
                        mo24980Y2();
                    } else if (c != 9) {
                        mo23210A1(c);
                    }
                }
            }
        }
        mo23230v1(" in a comment", (JsonToken) null);
    }

    /* renamed from: Y */
    public final int mo13950Y() throws IOException {
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
        } else if (this.f16848K1) {
            this.f16848K1 = false;
            mo25000u2();
        }
        return this.f14575o1.mo19400F();
    }

    /* renamed from: Y1 */
    public void mo18455Y1() throws IOException {
        char[] cArr;
        super.mo18455Y1();
        this.f16846I1.mo28029r();
        if (this.f16844G1 && (cArr = this.f16843F1) != null) {
            this.f16843F1 = null;
            this.f14564M.mo24749s(cArr);
        }
    }

    /* renamed from: Y2 */
    public final void mo24980Y2() throws IOException {
        if (this.f14566Q < this.f14567U || mo24958C2()) {
            char[] cArr = this.f16843F1;
            int i = this.f14566Q;
            if (cArr[i] == 10) {
                this.f14566Q = i + 1;
            }
        }
        this.f14569Y++;
        this.f14570Z = this.f14566Q;
    }

    /* renamed from: Z2 */
    public final int mo24981Z2() throws IOException {
        int i = this.f14566Q;
        if (i + 4 >= this.f14567U) {
            return mo24982a3(false);
        }
        char[] cArr = this.f16843F1;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.f14566Q = i2;
            char c2 = cArr[i2];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == 9) {
                    int i3 = i2 + 1;
                    this.f14566Q = i3;
                    char c3 = cArr[i3];
                    if (c3 > ' ') {
                        if (c3 == '/' || c3 == '#') {
                            return mo24982a3(true);
                        }
                        this.f14566Q = i3 + 1;
                        return c3;
                    }
                }
                return mo24982a3(true);
            } else if (c2 == '/' || c2 == '#') {
                return mo24982a3(true);
            } else {
                this.f14566Q = i2 + 1;
                return c2;
            }
        } else {
            if (c == ' ' || c == 9) {
                int i4 = i + 1;
                this.f14566Q = i4;
                c = cArr[i4];
            }
            if (c != ':') {
                return mo24982a3(false);
            }
            int i5 = this.f14566Q + 1;
            this.f14566Q = i5;
            char c4 = cArr[i5];
            if (c4 <= ' ') {
                if (c4 == ' ' || c4 == 9) {
                    int i6 = i5 + 1;
                    this.f14566Q = i6;
                    char c5 = cArr[i6];
                    if (c5 > ' ') {
                        if (c5 == '/' || c5 == '#') {
                            return mo24982a3(true);
                        }
                        this.f14566Q = i6 + 1;
                        return c5;
                    }
                }
                return mo24982a3(true);
            } else if (c4 == '/' || c4 == '#') {
                return mo24982a3(true);
            } else {
                this.f14566Q = i5 + 1;
                return c4;
            }
        }
    }

    /* renamed from: a3 */
    public final int mo24982a3(boolean z) throws IOException {
        while (true) {
            if (this.f14566Q < this.f14567U || mo24958C2()) {
                char[] cArr = this.f16843F1;
                int i = this.f14566Q;
                int i2 = i + 1;
                this.f14566Q = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        mo24984c3();
                    } else if (c != '#' || !mo24989h3()) {
                        if (z) {
                            return c;
                        }
                        if (c != ':') {
                            mo23233y1(c, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (c < ' ') {
                    if (c == 10) {
                        this.f14569Y++;
                        this.f14570Z = i2;
                    } else if (c == 13) {
                        mo24980Y2();
                    } else if (c != 9) {
                        mo23210A1(c);
                    }
                }
            } else {
                mo23230v1(" within/between " + this.f14571b1.mo28330j() + " entries", (JsonToken) null);
                return -1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13956b0() throws java.io.IOException {
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
            boolean r0 = r3.f16848K1
            if (r0 == 0) goto L_0x001d
            r3.f16848K1 = r1
            r3.mo25000u2()
        L_0x001d:
            en6 r0 = r3.f14575o1
            int r0 = r0.mo19423v()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q75.mo13956b0():int");
    }

    /* renamed from: b3 */
    public final int mo24983b3(int i) throws IOException {
        if (i != 44) {
            mo23233y1(i, "was expecting comma to separate " + this.f14571b1.mo28330j() + " entries");
        }
        while (true) {
            int i2 = this.f14566Q;
            if (i2 >= this.f14567U) {
                return mo24978W2();
            }
            char[] cArr = this.f16843F1;
            int i3 = i2 + 1;
            this.f14566Q = i3;
            char c = cArr[i2];
            if (c > ' ') {
                if (c != '/' && c != '#') {
                    return c;
                }
                this.f14566Q = i3 - 1;
                return mo24978W2();
            } else if (c < ' ') {
                if (c == 10) {
                    this.f14569Y++;
                    this.f14570Z = i3;
                } else if (c == 13) {
                    mo24980Y2();
                } else if (c != 9) {
                    mo23210A1(c);
                }
            }
        }
    }

    /* renamed from: c0 */
    public JsonLocation mo13958c0() {
        if (this.f15012g == JsonToken.FIELD_NAME) {
            return new JsonLocation(mo22816M1(), -1, this.f14568X + (this.f16849L1 - 1), this.f16850M1, this.f16851N1);
        }
        return new JsonLocation(mo22816M1(), -1, this.f14572e0 - 1, this.f14574k0, this.f14582v0);
    }

    /* renamed from: c3 */
    public final void mo24984c3() throws IOException {
        if ((this.f9822a & f16839U1) == 0) {
            mo23233y1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f14566Q >= this.f14567U && !mo24958C2()) {
            mo23230v1(" in a comment", (JsonToken) null);
        }
        char[] cArr = this.f16843F1;
        int i = this.f14566Q;
        this.f14566Q = i + 1;
        char c = cArr[i];
        if (c == '/') {
            mo24985d3();
        } else if (c == '*') {
            mo24979X2();
        } else {
            mo23233y1(c, "was expecting either '*' or '/' for a comment");
        }
    }

    /* renamed from: d3 */
    public final void mo24985d3() throws IOException {
        while (true) {
            if (this.f14566Q < this.f14567U || mo24958C2()) {
                char[] cArr = this.f16843F1;
                int i = this.f14566Q;
                int i2 = i + 1;
                this.f14566Q = i2;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        this.f14569Y++;
                        this.f14570Z = i2;
                        return;
                    } else if (c == 13) {
                        mo24980Y2();
                        return;
                    } else if (c != 9) {
                        mo23210A1(c);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e3 */
    public final void mo24986e3() throws IOException {
        this.f16848K1 = false;
        int i = this.f14566Q;
        int i2 = this.f14567U;
        char[] cArr = this.f16843F1;
        while (true) {
            if (i >= i2) {
                this.f14566Q = i;
                if (!mo24958C2()) {
                    mo23230v1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i = this.f14566Q;
                i2 = this.f14567U;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.f14566Q = i3;
                    mo18445P1();
                    i = this.f14566Q;
                    i2 = this.f14567U;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.f14566Q = i3;
                        return;
                    } else if (c < ' ') {
                        this.f14566Q = i3;
                        mo22829b2(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    /* renamed from: f3 */
    public final int mo24987f3() throws IOException {
        if (this.f14566Q >= this.f14567U && !mo24958C2()) {
            return mo22819Q1();
        }
        char[] cArr = this.f16843F1;
        int i = this.f14566Q;
        int i2 = i + 1;
        this.f14566Q = i2;
        char c = cArr[i];
        if (c <= ' ') {
            if (c != ' ') {
                if (c == 10) {
                    this.f14569Y++;
                    this.f14570Z = i2;
                } else if (c == 13) {
                    mo24980Y2();
                } else if (c != 9) {
                    mo23210A1(c);
                }
            }
            while (true) {
                int i3 = this.f14566Q;
                if (i3 >= this.f14567U) {
                    return mo24988g3();
                }
                char[] cArr2 = this.f16843F1;
                int i4 = i3 + 1;
                this.f14566Q = i4;
                char c2 = cArr2[i3];
                if (c2 > ' ') {
                    if (c2 != '/' && c2 != '#') {
                        return c2;
                    }
                    this.f14566Q = i4 - 1;
                    return mo24988g3();
                } else if (c2 != ' ') {
                    if (c2 == 10) {
                        this.f14569Y++;
                        this.f14570Z = i4;
                    } else if (c2 == 13) {
                        mo24980Y2();
                    } else if (c2 != 9) {
                        mo23210A1(c2);
                    }
                }
            }
        } else if (c != '/' && c != '#') {
            return c;
        } else {
            this.f14566Q = i2 - 1;
            return mo24988g3();
        }
    }

    /* renamed from: g3 */
    public final int mo24988g3() throws IOException {
        char c;
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                return mo22819Q1();
            }
            char[] cArr = this.f16843F1;
            int i = this.f14566Q;
            int i2 = i + 1;
            this.f14566Q = i2;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    mo24984c3();
                } else if (c != '#' || !mo24989h3()) {
                    return c;
                }
            } else if (c != ' ') {
                if (c == 10) {
                    this.f14569Y++;
                    this.f14570Z = i2;
                } else if (c == 13) {
                    mo24980Y2();
                } else if (c != 9) {
                    mo23210A1(c);
                }
            }
        }
        return c;
    }

    /* renamed from: h3 */
    public final boolean mo24989h3() throws IOException {
        if ((this.f9822a & f16840V1) == 0) {
            return false;
        }
        mo24985d3();
        return true;
    }

    /* renamed from: i3 */
    public final void mo24990i3() {
        int i = this.f14566Q;
        this.f14572e0 = this.f14568X + ((long) i);
        this.f14574k0 = this.f14569Y;
        this.f14582v0 = i - this.f14570Z;
    }

    /* renamed from: j3 */
    public final void mo24991j3() {
        int i = this.f14566Q;
        this.f16849L1 = (long) i;
        this.f16850M1 = this.f14569Y;
        this.f16851N1 = i - this.f14570Z;
    }

    /* renamed from: k0 */
    public final String mo13974k0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.f16848K1) {
                this.f16848K1 = false;
                mo25000u2();
            }
            return this.f14575o1.mo19413l();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        } else {
            return super.mo13976l0((String) null);
        }
    }

    /* renamed from: k3 */
    public final char mo24992k3() throws IOException {
        char c;
        if ((this.f14566Q >= this.f14567U && !mo24958C2()) || (c = this.f16843F1[this.f14566Q]) < '0' || c > '9') {
            return '0';
        }
        if ((this.f9822a & f16834P1) == 0) {
            mo23212C1("Leading zeroes not allowed");
        }
        this.f14566Q++;
        if (c == '0') {
            do {
                if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                    break;
                }
                char[] cArr = this.f16843F1;
                int i = this.f14566Q;
                c = cArr[i];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this.f14566Q = i + 1;
            } while (c == '0');
        }
        return c;
    }

    /* renamed from: l */
    public byte[] mo13975l(Base64Variant base64Variant) throws IOException {
        byte[] bArr;
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this.f14579s1) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
            mo23225q1("Current token (" + this.f15012g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f16848K1) {
            try {
                this.f14579s1 = mo24999t2(base64Variant);
                this.f16848K1 = false;
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
    public final String mo13976l0(String str) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.f16848K1) {
                this.f16848K1 = false;
                mo25000u2();
            }
            return this.f14575o1.mo19413l();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        } else {
            return super.mo13976l0(str);
        }
    }

    /* renamed from: l3 */
    public final char mo24993l3() throws IOException {
        char c;
        int i = this.f14566Q;
        if (i >= this.f14567U || ((c = this.f16843F1[i]) >= '0' && c <= '9')) {
            return mo24992k3();
        }
        return '0';
    }

    /* renamed from: m3 */
    public final void mo24994m3(int i) throws IOException {
        int i2 = this.f14566Q + 1;
        this.f14566Q = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.f14569Y++;
            this.f14570Z = i2;
        } else if (i == 13) {
            mo24980Y2();
        } else if (i != 32) {
            mo23232x1(i);
        }
    }

    @Deprecated
    /* renamed from: n3 */
    public char mo24995n3(String str) throws IOException {
        return mo24996o3(str, (JsonToken) null);
    }

    /* renamed from: o3 */
    public char mo24996o3(String str, JsonToken jsonToken) throws IOException {
        if (this.f14566Q >= this.f14567U && !mo24958C2()) {
            mo23230v1(str, jsonToken);
        }
        char[] cArr = this.f16843F1;
        int i = this.f14566Q;
        this.f14566Q = i + 1;
        return cArr[i];
    }

    /* renamed from: p */
    public xe4 mo13980p() {
        return this.f16845H1;
    }

    /* renamed from: q */
    public JsonLocation mo13981q() {
        return new JsonLocation(mo22816M1(), -1, ((long) this.f14566Q) + this.f14568X, this.f14569Y, (this.f14566Q - this.f14570Z) + 1);
    }

    /* renamed from: r2 */
    public final void mo24997r2(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) i2)) {
            mo24976U2(str.substring(0, i));
        }
    }

    /* renamed from: s2 */
    public final void mo24998s2(int i) throws JsonParseException {
        if (i == 93) {
            mo24990i3();
            if (!this.f14571b1.mo28327f()) {
                mo22827Z1(i, '}');
            }
            this.f14571b1 = this.f14571b1.mo26150l();
            this.f15012g = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            mo24990i3();
            if (!this.f14571b1.mo28328g()) {
                mo22827Z1(i, ']');
            }
            this.f14571b1 = this.f14571b1.mo26150l();
            this.f15012g = JsonToken.END_OBJECT;
        }
    }

    /* renamed from: t2 */
    public byte[] mo24999t2(Base64Variant base64Variant) throws IOException {
        g60 R1 = mo22820R1();
        while (true) {
            if (this.f14566Q >= this.f14567U) {
                mo24959D2();
            }
            char[] cArr = this.f16843F1;
            int i = this.f14566Q;
            this.f14566Q = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c);
                if (decodeBase64Char < 0) {
                    if (c == '\"') {
                        return R1.mo20400n();
                    }
                    decodeBase64Char = mo22817N1(base64Variant, c, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.f14566Q >= this.f14567U) {
                    mo24959D2();
                }
                char[] cArr2 = this.f16843F1;
                int i2 = this.f14566Q;
                this.f14566Q = i2 + 1;
                char c2 = cArr2[i2];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = mo22817N1(base64Variant, c2, 1);
                }
                int i3 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this.f14566Q >= this.f14567U) {
                    mo24959D2();
                }
                char[] cArr3 = this.f16843F1;
                int i4 = this.f14566Q;
                this.f14566Q = i4 + 1;
                char c3 = cArr3[i4];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c3 == '\"') {
                            R1.mo20387b(i3 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.f14566Q--;
                                mo22821S1(base64Variant);
                            }
                            return R1.mo20400n();
                        }
                        decodeBase64Char3 = mo22817N1(base64Variant, c3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this.f14566Q >= this.f14567U) {
                            mo24959D2();
                        }
                        char[] cArr4 = this.f16843F1;
                        int i5 = this.f14566Q;
                        this.f14566Q = i5 + 1;
                        char c4 = cArr4[i5];
                        if (base64Variant.usesPaddingChar(c4) || mo22817N1(base64Variant, c4, 3) == -2) {
                            R1.mo20387b(i3 >> 4);
                        } else {
                            throw mo22839m2(base64Variant, c4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i6 = (i3 << 6) | decodeBase64Char3;
                if (this.f14566Q >= this.f14567U) {
                    mo24959D2();
                }
                char[] cArr5 = this.f16843F1;
                int i7 = this.f14566Q;
                this.f14566Q = i7 + 1;
                char c5 = cArr5[i7];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c5 == '\"') {
                            R1.mo20390d(i6 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.f14566Q--;
                                mo22821S1(base64Variant);
                            }
                            return R1.mo20400n();
                        }
                        decodeBase64Char4 = mo22817N1(base64Variant, c5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        R1.mo20390d(i6 >> 2);
                    }
                }
                R1.mo20388c((i6 << 6) | decodeBase64Char4);
            }
        }
    }

    /* renamed from: u2 */
    public final void mo25000u2() throws IOException {
        int i = this.f14566Q;
        int i2 = this.f14567U;
        if (i < i2) {
            int[] iArr = f16841W1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.f16843F1;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    en6 en6 = this.f14575o1;
                    int i3 = this.f14566Q;
                    en6.mo19395A(cArr, i3, i - i3);
                    this.f14566Q = i + 1;
                    return;
                }
            }
        }
        en6 en62 = this.f14575o1;
        char[] cArr2 = this.f16843F1;
        int i4 = this.f14566Q;
        en62.mo19427z(cArr2, i4, i - i4);
        this.f14566Q = i;
        mo25001v2();
    }

    /* renamed from: v2 */
    public void mo25001v2() throws IOException {
        char[] s = this.f14575o1.mo19419s();
        int t = this.f14575o1.mo19420t();
        int[] iArr = f16841W1;
        int length = iArr.length;
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                mo23230v1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.f16843F1;
            int i = this.f14566Q;
            this.f14566Q = i + 1;
            char c = cArr[i];
            if (c < length && iArr[c] != 0) {
                if (c == '\"') {
                    this.f14575o1.mo19399E(t);
                    return;
                } else if (c == '\\') {
                    c = mo18445P1();
                } else if (c < ' ') {
                    mo22829b2(c, "string value");
                }
            }
            if (t >= s.length) {
                s = this.f14575o1.mo19417p();
                t = 0;
            }
            s[t] = c;
            t++;
        }
    }

    /* renamed from: w2 */
    public final String mo25002w2(JsonToken jsonToken) {
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

    /* renamed from: x2 */
    public JsonToken mo25003x2() throws IOException {
        char[] m = this.f14575o1.mo19414m();
        int t = this.f14575o1.mo19420t();
        while (true) {
            if (this.f14566Q >= this.f14567U && !mo24958C2()) {
                mo23230v1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.f16843F1;
            int i = this.f14566Q;
            this.f14566Q = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = mo18445P1();
                } else if (c <= '\'') {
                    if (c == '\'') {
                        this.f14575o1.mo19399E(t);
                        return JsonToken.VALUE_STRING;
                    } else if (c < ' ') {
                        mo22829b2(c, "string value");
                    }
                }
            }
            if (t >= m.length) {
                m = this.f14575o1.mo19417p();
                t = 0;
            }
            m[t] = c;
            t++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ?, r10v1 ?, r10v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: y2 */
    public com.fasterxml.jackson.core.JsonToken mo25004y2(
/*
Method generation error in method: q75.y2(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ?
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

    /* renamed from: z2 */
    public String mo25005z2(int i) throws IOException {
        boolean z;
        if (i == 39 && (this.f9822a & f16837S1) != 0) {
            return mo24967L2();
        }
        if ((this.f9822a & f16838T1) == 0) {
            mo23233y1(i, "was expecting double-quote to start field name");
        }
        int[] i2 = ud0.m28149i();
        int length = i2.length;
        if (i >= length) {
            z = Character.isJavaIdentifierPart((char) i);
        } else if (i2[i] == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo23233y1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i3 = this.f14566Q;
        int i4 = this.f16847J1;
        int i5 = this.f14567U;
        if (i3 < i5) {
            do {
                char[] cArr = this.f16843F1;
                char c = cArr[i3];
                if (c < length) {
                    if (i2[c] != 0) {
                        int i6 = this.f14566Q - 1;
                        this.f14566Q = i3;
                        return this.f16846I1.mo28023l(cArr, i6, i3 - i6, i4);
                    }
                } else if (!Character.isJavaIdentifierPart((char) c)) {
                    int i7 = this.f14566Q - 1;
                    this.f14566Q = i3;
                    return this.f16846I1.mo28023l(this.f16843F1, i7, i3 - i7, i4);
                }
                i4 = (i4 * 33) + c;
                i3++;
            } while (i3 < i5);
        }
        this.f14566Q = i3;
        return mo24956A2(this.f14566Q - 1, i4, i2);
    }

    public q75(po2 po2, int i, Reader reader, xe4 xe4, yd0 yd0) {
        super(po2, i);
        this.f16842E1 = reader;
        this.f16843F1 = po2.mo24738h();
        this.f14566Q = 0;
        this.f14567U = 0;
        this.f16845H1 = xe4;
        this.f16846I1 = yd0;
        this.f16847J1 = yd0.mo28024m();
        this.f16844G1 = true;
    }
}
