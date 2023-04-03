package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: d37 */
/* compiled from: UTF8DataInputJsonParser */
public class d37 extends lm4 {

    /* renamed from: L1 */
    public static final int f10466L1 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* renamed from: M1 */
    public static final int f10467M1 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* renamed from: N1 */
    public static final int f10468N1 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();

    /* renamed from: O1 */
    public static final int f10469O1 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* renamed from: P1 */
    public static final int f10470P1 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* renamed from: Q1 */
    public static final int f10471Q1 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* renamed from: R1 */
    public static final int f10472R1 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* renamed from: S1 */
    public static final int f10473S1 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* renamed from: T1 */
    public static final int[] f10474T1 = ud0.m28150j();

    /* renamed from: U1 */
    public static final int[] f10475U1 = ud0.m28148h();

    /* renamed from: E1 */
    public xe4 f10476E1;

    /* renamed from: F1 */
    public final y60 f10477F1;

    /* renamed from: G1 */
    public int[] f10478G1 = new int[16];

    /* renamed from: H1 */
    public boolean f10479H1;

    /* renamed from: I1 */
    public int f10480I1;

    /* renamed from: J1 */
    public DataInput f10481J1;

    /* renamed from: K1 */
    public int f10482K1;

    public d37(po2 po2, int i, DataInput dataInput, xe4 xe4, y60 y60, int i2) {
        super(po2, i);
        this.f10476E1 = xe4;
        this.f10477F1 = y60;
        this.f10481J1 = dataInput;
        this.f10482K1 = i2;
    }

    /* renamed from: C2 */
    public static int[] m14700C2(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }

    /* renamed from: t3 */
    public static final int m14701t3(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    /* renamed from: A2 */
    public final void mo18430A2(char[] cArr, int i, int i2) throws IOException {
        int[] iArr = f10474T1;
        int length = cArr.length;
        while (true) {
            int i3 = iArr[i2];
            int i4 = 0;
            if (i3 == 0) {
                if (i >= length) {
                    cArr = this.f14575o1.mo19417p();
                    length = cArr.length;
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this.f10481J1.readUnsignedByte();
                i++;
            } else if (i2 == 34) {
                this.f14575o1.mo19399E(i);
                return;
            } else {
                if (i3 == 1) {
                    i2 = mo18445P1();
                } else if (i3 == 2) {
                    i2 = mo18482v2(i2);
                } else if (i3 == 3) {
                    i2 = mo18484w2(i2);
                } else if (i3 == 4) {
                    int x2 = mo18486x2(i2);
                    if (i >= cArr.length) {
                        cArr = this.f14575o1.mo19417p();
                        length = cArr.length;
                        i = 0;
                    }
                    cArr[i] = (char) (55296 | (x2 >> 10));
                    i2 = (x2 & 1023) | 56320;
                    i++;
                } else if (i2 < 32) {
                    mo22829b2(i2, "string value");
                } else {
                    mo18452V2(i2);
                }
                if (i >= cArr.length) {
                    cArr = this.f14575o1.mo19417p();
                    length = cArr.length;
                } else {
                    i4 = i;
                }
                i = i4 + 1;
                cArr[i4] = (char) i2;
                i2 = this.f10481J1.readUnsignedByte();
            }
        }
    }

    /* renamed from: B2 */
    public final String mo18431B2(JsonToken jsonToken) {
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

    /* renamed from: D2 */
    public JsonToken mo18432D2() throws IOException {
        int i;
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f10474T1;
        int i2 = 0;
        while (true) {
            int length = m.length;
            if (i2 >= m.length) {
                m = this.f14575o1.mo19417p();
                length = m.length;
                i2 = 0;
            }
            while (true) {
                int readUnsignedByte = this.f10481J1.readUnsignedByte();
                if (readUnsignedByte == 39) {
                    this.f14575o1.mo19399E(i);
                    return JsonToken.VALUE_STRING;
                }
                int i3 = iArr[readUnsignedByte];
                if (i3 == 0 || readUnsignedByte == 34) {
                    int i4 = i + 1;
                    m[i] = (char) readUnsignedByte;
                    i2 = i4;
                    if (i4 >= length) {
                        break;
                    }
                } else {
                    if (i3 == 1) {
                        readUnsignedByte = mo18445P1();
                    } else if (i3 == 2) {
                        readUnsignedByte = mo18482v2(readUnsignedByte);
                    } else if (i3 == 3) {
                        readUnsignedByte = mo18484w2(readUnsignedByte);
                    } else if (i3 != 4) {
                        if (readUnsignedByte < 32) {
                            mo22829b2(readUnsignedByte, "string value");
                        }
                        mo18452V2(readUnsignedByte);
                    } else {
                        int x2 = mo18486x2(readUnsignedByte);
                        int i5 = i + 1;
                        m[i] = (char) (55296 | (x2 >> 10));
                        if (i5 >= m.length) {
                            m = this.f14575o1.mo19417p();
                            i = 0;
                        } else {
                            i = i5;
                        }
                        readUnsignedByte = 56320 | (x2 & 1023);
                    }
                    if (i >= m.length) {
                        m = this.f14575o1.mo19417p();
                        i = 0;
                    }
                    m[i] = (char) readUnsignedByte;
                    i2 = i + 1;
                }
            }
        }
    }

    /* renamed from: E0 */
    public String mo13930E0() throws IOException {
        JsonToken jsonToken;
        this.f14580t1 = 0;
        JsonToken jsonToken2 = this.f15012g;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            mo18438J2();
            return null;
        }
        if (this.f10479H1) {
            mo18463f3();
        }
        int j3 = mo18467j3();
        this.f14579s1 = null;
        this.f14574k0 = this.f14569Y;
        if (j3 == 93 || j3 == 125) {
            mo18477s2(j3);
            return null;
        }
        if (this.f14571b1.mo26153p()) {
            if (j3 != 44) {
                mo23233y1(j3, "was expecting comma to separate " + this.f14571b1.mo28330j() + " entries");
            }
            j3 = mo18467j3();
            if ((this.f9822a & f10466L1) != 0 && (j3 == 93 || j3 == 125)) {
                mo18477s2(j3);
                return null;
            }
        }
        if (!this.f14571b1.mo28328g()) {
            mo18439K2(j3);
            return null;
        }
        String R2 = mo18448R2(j3);
        this.f14571b1.mo26157t(R2);
        this.f15012g = jsonToken3;
        int b3 = mo18459b3();
        if (b3 == 34) {
            this.f10479H1 = true;
            this.f14573e1 = JsonToken.VALUE_STRING;
            return R2;
        }
        if (b3 != 45) {
            if (b3 == 46) {
                mo18443N2();
            } else if (b3 == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (b3 == 102) {
                mo18437I2("false", 1);
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (b3 == 110) {
                mo18437I2("null", 1);
                jsonToken = JsonToken.VALUE_NULL;
            } else if (b3 == 116) {
                mo18437I2("true", 1);
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (b3 != 123) {
                switch (b3) {
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
                        break;
                    default:
                        jsonToken = mo18436H2(b3);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            jsonToken = mo18450T2(b3);
        } else {
            jsonToken = mo18449S2();
        }
        this.f14573e1 = jsonToken;
        return R2;
    }

    /* renamed from: E2 */
    public JsonToken mo18433E2(int i, boolean z) throws IOException {
        String str;
        double d;
        while (i == 73) {
            i = this.f10481J1.readUnsignedByte();
            if (i != 78) {
                if (i != 110) {
                    break;
                } else if (z) {
                    str = "-Infinity";
                } else {
                    str = "+Infinity";
                }
            } else if (z) {
                str = "-INF";
            } else {
                str = "+INF";
            }
            mo18437I2(str, 3);
            if ((this.f9822a & f10468N1) != 0) {
                if (z) {
                    d = Double.NEGATIVE_INFINITY;
                } else {
                    d = Double.POSITIVE_INFINITY;
                }
                return mo22841o2(str, d);
            }
            mo23225q1("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        mo23219J1(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    /* renamed from: F2 */
    public final int mo18434F2() throws IOException {
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if (readUnsignedByte >= 48 && readUnsignedByte <= 57) {
            if ((this.f9822a & f10467M1) == 0) {
                mo23212C1("Leading zeroes not allowed");
            }
            while (readUnsignedByte == 48) {
                readUnsignedByte = this.f10481J1.readUnsignedByte();
            }
        }
        return readUnsignedByte;
    }

    /* renamed from: G */
    public Object mo13931G() {
        return this.f10481J1;
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
            } else if (!this.f10479H1) {
                return this.f14575o1.mo19413l();
            } else {
                this.f10479H1 = false;
                return mo18488y2();
            }
        } else if (mo13938N0() == JsonToken.VALUE_STRING) {
            return mo13947W();
        } else {
            return null;
        }
    }

    /* renamed from: G2 */
    public String mo18435G2(int i) throws IOException {
        if (i == 39 && (this.f9822a & f10470P1) != 0) {
            return mo18441L2();
        }
        if ((this.f9822a & f10471Q1) == 0) {
            mo23233y1((char) mo18480u2(i), "was expecting double-quote to start field name");
        }
        int[] k = ud0.m28151k();
        if (k[i] != 0) {
            mo23233y1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.f10478G1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        do {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArr.length) {
                    iArr = m14700C2(iArr, iArr.length);
                    this.f10478G1 = iArr;
                }
                iArr[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            i = this.f10481J1.readUnsignedByte();
        } while (k[i] == 0);
        this.f10482K1 = i;
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] C2 = m14700C2(iArr, iArr.length);
                this.f10478G1 = C2;
                iArr = C2;
            }
            iArr[i3] = i4;
            i3++;
        }
        String z = this.f10477F1.mo27967z(iArr, i3);
        if (z == null) {
            return mo18472o3(iArr, i3, i2);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r3.f14571b1.mo28327f() == false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    /* renamed from: H2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken mo18436H2(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x007f
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x0066
            r0 = 78
            if (r4 == r0) goto L_0x004d
            r0 = 93
            if (r4 == r0) goto L_0x002a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x0047
            r0 = 43
            if (r4 == r0) goto L_0x001e
            r0 = 44
            if (r4 == r0) goto L_0x0033
            goto L_0x008b
        L_0x001e:
            java.io.DataInput r4 = r3.f10481J1
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo18433E2(r4, r0)
            return r4
        L_0x002a:
            t53 r0 = r3.f14571b1
            boolean r0 = r0.mo28327f()
            if (r0 != 0) goto L_0x0033
            goto L_0x008b
        L_0x0033:
            t53 r0 = r3.f14571b1
            boolean r0 = r0.mo28329h()
            if (r0 != 0) goto L_0x0047
            int r0 = r3.f9822a
            int r1 = f10469O1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0047
            r3.f10482K1 = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x0047:
            java.lang.String r0 = "expected a value"
            r3.mo23233y1(r4, r0)
            goto L_0x007f
        L_0x004d:
            java.lang.String r0 = "NaN"
            r3.mo18437I2(r0, r1)
            int r1 = r3.f9822a
            int r2 = f10468N1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0060
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo22841o2(r0, r1)
            return r4
        L_0x0060:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.mo23225q1(r0)
            goto L_0x008b
        L_0x0066:
            java.lang.String r0 = "Infinity"
            r3.mo18437I2(r0, r1)
            int r1 = r3.f9822a
            int r2 = f10468N1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0079
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo22841o2(r0, r1)
            return r4
        L_0x0079:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.mo23225q1(r0)
            goto L_0x008b
        L_0x007f:
            int r0 = r3.f9822a
            int r1 = f10470P1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x008b
            com.fasterxml.jackson.core.JsonToken r4 = r3.mo18432D2()
            return r4
        L_0x008b:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.mo22830c2()
            r3.mo18457Z2(r4, r0, r1)
        L_0x00aa:
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
        throw new UnsupportedOperationException("Method not decompiled: p000.d37.mo18436H2(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: I2 */
    public final void mo18437I2(String str, int i) throws IOException {
        int length = str.length();
        do {
            int readUnsignedByte = this.f10481J1.readUnsignedByte();
            if (readUnsignedByte != str.charAt(i)) {
                mo18456Y2(readUnsignedByte, str.substring(0, i));
            }
            i++;
        } while (i < length);
        int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
        if (!(readUnsignedByte2 < 48 || readUnsignedByte2 == 93 || readUnsignedByte2 == 125)) {
            mo18475r2(str, i, readUnsignedByte2);
        }
        this.f10482K1 = readUnsignedByte2;
    }

    /* renamed from: J2 */
    public final JsonToken mo18438J2() {
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
    public final JsonToken mo18439K2(int i) throws IOException {
        if (i == 34) {
            this.f10479H1 = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f15012g = jsonToken;
            return jsonToken;
        } else if (i == 45) {
            JsonToken S2 = mo18449S2();
            this.f15012g = S2;
            return S2;
        } else if (i == 46) {
            JsonToken N2 = mo18443N2();
            this.f15012g = N2;
            return N2;
        } else if (i == 91) {
            this.f14571b1 = this.f14571b1.mo26151m(this.f14574k0, this.f14582v0);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f15012g = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            mo18437I2("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f15012g = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            mo18437I2("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f15012g = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            mo18437I2("true", 1);
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
                    JsonToken T2 = mo18450T2(i);
                    this.f15012g = T2;
                    return T2;
                default:
                    JsonToken H2 = mo18436H2(i);
                    this.f15012g = H2;
                    return H2;
            }
        } else {
            this.f14571b1 = this.f14571b1.mo26152n(this.f14574k0, this.f14582v0);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.f15012g = jsonToken6;
            return jsonToken6;
        }
    }

    /* renamed from: L1 */
    public void mo18440L1() throws IOException {
    }

    /* renamed from: L2 */
    public String mo18441L2() throws IOException {
        int i;
        int i2;
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return "";
        }
        int[] iArr = this.f10478G1;
        int[] iArr2 = f10475U1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (readUnsignedByte != 39) {
            if (!(readUnsignedByte == 34 || iArr2[readUnsignedByte] == 0)) {
                if (readUnsignedByte != 92) {
                    mo22829b2(readUnsignedByte, PublicResolver.FUNC_NAME);
                } else {
                    readUnsignedByte = mo18445P1();
                }
                if (readUnsignedByte > 127) {
                    if (i2 >= 4) {
                        if (i4 >= iArr.length) {
                            iArr = m14700C2(iArr, iArr.length);
                            this.f10478G1 = iArr;
                        }
                        iArr[i4] = i;
                        i = 0;
                        i4++;
                        i2 = 0;
                    }
                    if (readUnsignedByte < 2048) {
                        i = (i << 8) | (readUnsignedByte >> 6) | 192;
                        i2++;
                    } else {
                        int i6 = (i << 8) | (readUnsignedByte >> 12) | 224;
                        int i7 = i2 + 1;
                        if (i7 >= 4) {
                            if (i4 >= iArr.length) {
                                iArr = m14700C2(iArr, iArr.length);
                                this.f10478G1 = iArr;
                            }
                            iArr[i4] = i6;
                            i6 = 0;
                            i4++;
                            i7 = 0;
                        }
                        i = (i6 << 8) | ((readUnsignedByte >> 6) & 63) | 128;
                        i2 = i7 + 1;
                    }
                    readUnsignedByte = (readUnsignedByte & 63) | 128;
                }
            }
            if (i2 < 4) {
                i3 = i2 + 1;
                i5 = readUnsignedByte | (i << 8);
            } else {
                if (i4 >= iArr.length) {
                    iArr = m14700C2(iArr, iArr.length);
                    this.f10478G1 = iArr;
                }
                iArr[i4] = i;
                i5 = readUnsignedByte;
                i4++;
                i3 = 1;
            }
            readUnsignedByte = this.f10481J1.readUnsignedByte();
        }
        if (i2 > 0) {
            if (i4 >= iArr.length) {
                int[] C2 = m14700C2(iArr, iArr.length);
                this.f10478G1 = C2;
                iArr = C2;
            }
            iArr[i4] = m14701t3(i, i2);
            i4++;
        }
        String z = this.f10477F1.mo27967z(iArr, i4);
        if (z == null) {
            return mo18472o3(iArr, i4, i2);
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.JsonToken mo18442M2(char[] r8, int r9, int r10, boolean r11, int r12) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 57
            r1 = 48
            r2 = 0
            r3 = 46
            if (r10 != r3) goto L_0x0039
            int r3 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            r10 = r2
            r9 = r3
        L_0x0010:
            java.io.DataInput r3 = r7.f10481J1
            int r3 = r3.readUnsignedByte()
            if (r3 < r1) goto L_0x002e
            if (r3 <= r0) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            int r10 = r10 + 1
            int r4 = r8.length
            if (r9 < r4) goto L_0x0027
            en6 r8 = r7.f14575o1
            char[] r8 = r8.mo19417p()
            r9 = r2
        L_0x0027:
            int r4 = r9 + 1
            char r3 = (char) r3
            r8[r9] = r3
            r9 = r4
            goto L_0x0010
        L_0x002e:
            if (r10 != 0) goto L_0x0035
            java.lang.String r4 = "Decimal point not followed by a digit"
            r7.mo23219J1(r3, r4)
        L_0x0035:
            r6 = r3
            r3 = r10
            r10 = r6
            goto L_0x003a
        L_0x0039:
            r3 = r2
        L_0x003a:
            r4 = 101(0x65, float:1.42E-43)
            if (r10 == r4) goto L_0x0042
            r4 = 69
            if (r10 != r4) goto L_0x00a2
        L_0x0042:
            int r4 = r8.length
            if (r9 < r4) goto L_0x004c
            en6 r8 = r7.f14575o1
            char[] r8 = r8.mo19417p()
            r9 = r2
        L_0x004c:
            int r4 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            java.io.DataInput r9 = r7.f10481J1
            int r9 = r9.readUnsignedByte()
            r10 = 45
            if (r9 == r10) goto L_0x0064
            r10 = 43
            if (r9 != r10) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            r10 = r9
            r9 = r4
            r4 = r2
            goto L_0x007d
        L_0x0064:
            int r10 = r8.length
            if (r4 < r10) goto L_0x006e
            en6 r8 = r7.f14575o1
            char[] r8 = r8.mo19417p()
            r4 = r2
        L_0x006e:
            int r10 = r4 + 1
            char r9 = (char) r9
            r8[r4] = r9
            java.io.DataInput r9 = r7.f10481J1
            int r9 = r9.readUnsignedByte()
            r4 = r2
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x007d:
            if (r10 > r0) goto L_0x009a
            if (r10 < r1) goto L_0x009a
            int r4 = r4 + 1
            int r5 = r8.length
            if (r9 < r5) goto L_0x008d
            en6 r8 = r7.f14575o1
            char[] r8 = r8.mo19417p()
            r9 = r2
        L_0x008d:
            int r5 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            java.io.DataInput r9 = r7.f10481J1
            int r10 = r9.readUnsignedByte()
            r9 = r5
            goto L_0x007d
        L_0x009a:
            if (r4 != 0) goto L_0x00a1
            java.lang.String r8 = "Exponent indicator not followed by a digit"
            r7.mo23219J1(r10, r8)
        L_0x00a1:
            r2 = r4
        L_0x00a2:
            r7.f10482K1 = r10
            t53 r8 = r7.f14571b1
            boolean r8 = r8.mo28329h()
            if (r8 == 0) goto L_0x00af
            r7.mo18471n3()
        L_0x00af:
            en6 r8 = r7.f14575o1
            r8.mo19399E(r9)
            com.fasterxml.jackson.core.JsonToken r8 = r7.mo22842p2(r11, r12, r3, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d37.mo18442M2(char[], int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    /* renamed from: N0 */
    public JsonToken mo13938N0() throws IOException {
        JsonToken jsonToken;
        if (this.f14565P) {
            return null;
        }
        JsonToken jsonToken2 = this.f15012g;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return mo18438J2();
        }
        this.f14580t1 = 0;
        if (this.f10479H1) {
            mo18463f3();
        }
        int l3 = mo18469l3();
        if (l3 < 0) {
            close();
            this.f15012g = null;
            return null;
        }
        this.f14579s1 = null;
        this.f14574k0 = this.f14569Y;
        if (l3 == 93 || l3 == 125) {
            mo18477s2(l3);
            return this.f15012g;
        }
        if (this.f14571b1.mo26153p()) {
            if (l3 != 44) {
                mo23233y1(l3, "was expecting comma to separate " + this.f14571b1.mo28330j() + " entries");
            }
            l3 = mo18467j3();
            if ((this.f9822a & f10466L1) != 0 && (l3 == 93 || l3 == 125)) {
                mo18477s2(l3);
                return this.f15012g;
            }
        }
        if (!this.f14571b1.mo28328g()) {
            return mo18439K2(l3);
        }
        this.f14571b1.mo26157t(mo18448R2(l3));
        this.f15012g = jsonToken3;
        int b3 = mo18459b3();
        if (b3 == 34) {
            this.f10479H1 = true;
            this.f14573e1 = JsonToken.VALUE_STRING;
            return this.f15012g;
        }
        if (b3 == 45) {
            jsonToken = mo18449S2();
        } else if (b3 == 46) {
            jsonToken = mo18443N2();
        } else if (b3 == 91) {
            jsonToken = JsonToken.START_ARRAY;
        } else if (b3 == 102) {
            mo18437I2("false", 1);
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (b3 == 110) {
            mo18437I2("null", 1);
            jsonToken = JsonToken.VALUE_NULL;
        } else if (b3 == 116) {
            mo18437I2("true", 1);
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (b3 != 123) {
            switch (b3) {
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
                    jsonToken = mo18450T2(b3);
                    break;
                default:
                    jsonToken = mo18436H2(b3);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this.f14573e1 = jsonToken;
        return this.f15012g;
    }

    /* renamed from: N2 */
    public final JsonToken mo18443N2() throws IOException {
        if (!mo13989y0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return mo18436H2(46);
        }
        return mo18442M2(this.f14575o1.mo19414m(), 0, 46, false, 0);
    }

    /* renamed from: O2 */
    public final String mo18444O2(int i, int i2, int i3) throws IOException {
        int[] iArr = this.f10478G1;
        iArr[0] = this.f10480I1;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = f10475U1;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int readUnsignedByte = this.f10481J1.readUnsignedByte();
            if (iArr2[readUnsignedByte] == 0) {
                int i6 = (i4 << 8) | readUnsignedByte;
                int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
                if (iArr2[readUnsignedByte2] == 0) {
                    int i7 = (i6 << 8) | readUnsignedByte2;
                    int readUnsignedByte3 = this.f10481J1.readUnsignedByte();
                    if (iArr2[readUnsignedByte3] == 0) {
                        int i8 = (i7 << 8) | readUnsignedByte3;
                        int readUnsignedByte4 = this.f10481J1.readUnsignedByte();
                        if (iArr2[readUnsignedByte4] == 0) {
                            int[] iArr3 = this.f10478G1;
                            if (i5 >= iArr3.length) {
                                this.f10478G1 = m14700C2(iArr3, i5);
                            }
                            this.f10478G1[i5] = i8;
                            i5++;
                            i4 = readUnsignedByte4;
                        } else if (readUnsignedByte4 == 34) {
                            return mo18478s3(this.f10478G1, i5, i8, 4);
                        } else {
                            return mo18481u3(this.f10478G1, i5, i8, readUnsignedByte4, 4);
                        }
                    } else if (readUnsignedByte3 == 34) {
                        return mo18478s3(this.f10478G1, i5, i7, 3);
                    } else {
                        return mo18481u3(this.f10478G1, i5, i7, readUnsignedByte3, 3);
                    }
                } else if (readUnsignedByte2 == 34) {
                    return mo18478s3(this.f10478G1, i5, i6, 2);
                } else {
                    return mo18481u3(this.f10478G1, i5, i6, readUnsignedByte2, 2);
                }
            } else if (readUnsignedByte == 34) {
                return mo18478s3(this.f10478G1, i5, i4, 1);
            } else {
                return mo18481u3(this.f10478G1, i5, i4, readUnsignedByte, 1);
            }
        }
    }

    /* renamed from: P1 */
    public char mo18445P1() throws IOException {
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if (readUnsignedByte == 34 || readUnsignedByte == 47 || readUnsignedByte == 92) {
            return (char) readUnsignedByte;
        }
        if (readUnsignedByte == 98) {
            return 8;
        }
        if (readUnsignedByte == 102) {
            return 12;
        }
        if (readUnsignedByte == 110) {
            return 10;
        }
        if (readUnsignedByte == 114) {
            return 13;
        }
        if (readUnsignedByte == 116) {
            return 9;
        }
        if (readUnsignedByte != 117) {
            return mo22822T1((char) mo18480u2(readUnsignedByte));
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
            int b = ud0.m28142b(readUnsignedByte2);
            if (b < 0) {
                mo23233y1(readUnsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | b;
        }
        return (char) i;
    }

    /* renamed from: P2 */
    public final String mo18446P2(int i) throws IOException {
        int[] iArr = f10475U1;
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int i2 = (i << 8) | readUnsignedByte;
            int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i3 = (i2 << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this.f10481J1.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i4 = (i3 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this.f10481J1.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        return mo18447Q2(readUnsignedByte4, i4);
                    }
                    if (readUnsignedByte4 == 34) {
                        return mo18474q3(this.f10480I1, i4, 4);
                    }
                    return mo18485w3(this.f10480I1, i4, readUnsignedByte4, 4);
                } else if (readUnsignedByte3 == 34) {
                    return mo18474q3(this.f10480I1, i3, 3);
                } else {
                    return mo18485w3(this.f10480I1, i3, readUnsignedByte3, 3);
                }
            } else if (readUnsignedByte2 == 34) {
                return mo18474q3(this.f10480I1, i2, 2);
            } else {
                return mo18485w3(this.f10480I1, i2, readUnsignedByte2, 2);
            }
        } else if (readUnsignedByte == 34) {
            return mo18474q3(this.f10480I1, i, 1);
        } else {
            return mo18485w3(this.f10480I1, i, readUnsignedByte, 1);
        }
    }

    /* renamed from: Q */
    public yz2<StreamReadCapability> mo13943Q() {
        return lm4.f14560D1;
    }

    /* renamed from: Q2 */
    public final String mo18447Q2(int i, int i2) throws IOException {
        int[] iArr = f10475U1;
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int i3 = (i << 8) | readUnsignedByte;
            int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i4 = (i3 << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this.f10481J1.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i5 = (i4 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this.f10481J1.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        return mo18444O2(readUnsignedByte4, i2, i5);
                    }
                    if (readUnsignedByte4 == 34) {
                        return mo18476r3(this.f10480I1, i2, i5, 4);
                    }
                    return mo18487x3(this.f10480I1, i2, i5, readUnsignedByte4, 4);
                } else if (readUnsignedByte3 == 34) {
                    return mo18476r3(this.f10480I1, i2, i4, 3);
                } else {
                    return mo18487x3(this.f10480I1, i2, i4, readUnsignedByte3, 3);
                }
            } else if (readUnsignedByte2 == 34) {
                return mo18476r3(this.f10480I1, i2, i3, 2);
            } else {
                return mo18487x3(this.f10480I1, i2, i3, readUnsignedByte2, 2);
            }
        } else if (readUnsignedByte == 34) {
            return mo18476r3(this.f10480I1, i2, i, 1);
        } else {
            return mo18487x3(this.f10480I1, i2, i, readUnsignedByte, 1);
        }
    }

    /* renamed from: R2 */
    public final String mo18448R2(int i) throws IOException {
        if (i != 34) {
            return mo18435G2(i);
        }
        int[] iArr = f10475U1;
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i2 = (readUnsignedByte << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this.f10481J1.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i3 = (i2 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this.f10481J1.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        int i4 = (i3 << 8) | readUnsignedByte4;
                        int readUnsignedByte5 = this.f10481J1.readUnsignedByte();
                        if (iArr[readUnsignedByte5] == 0) {
                            this.f10480I1 = i4;
                            return mo18446P2(readUnsignedByte5);
                        } else if (readUnsignedByte5 == 34) {
                            return mo18473p3(i4, 4);
                        } else {
                            return mo18483v3(i4, readUnsignedByte5, 4);
                        }
                    } else if (readUnsignedByte4 == 34) {
                        return mo18473p3(i3, 3);
                    } else {
                        return mo18483v3(i3, readUnsignedByte4, 3);
                    }
                } else if (readUnsignedByte3 == 34) {
                    return mo18473p3(i2, 2);
                } else {
                    return mo18483v3(i2, readUnsignedByte3, 2);
                }
            } else if (readUnsignedByte2 == 34) {
                return mo18473p3(readUnsignedByte, 1);
            } else {
                return mo18483v3(readUnsignedByte, readUnsignedByte2, 1);
            }
        } else if (readUnsignedByte == 34) {
            return "";
        } else {
            return mo18483v3(0, readUnsignedByte, 0);
        }
    }

    /* renamed from: S0 */
    public int mo13946S0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.f10479H1 || this.f15012g != JsonToken.VALUE_STRING) {
            byte[] l = mo13975l(base64Variant);
            outputStream.write(l);
            return l.length;
        }
        byte[] d = this.f14564M.mo24734d();
        try {
            return mo18451U2(base64Variant, outputStream, d);
        } finally {
            this.f14564M.mo24745o(d);
        }
    }

    /* renamed from: S2 */
    public JsonToken mo18449S2() throws IOException {
        int i;
        char[] m = this.f14575o1.mo19414m();
        m[0] = '-';
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        m[1] = (char) readUnsignedByte;
        if (readUnsignedByte <= 48) {
            if (readUnsignedByte != 48) {
                return mo18433E2(readUnsignedByte, true);
            }
            i = mo18434F2();
        } else if (readUnsignedByte > 57) {
            return mo18433E2(readUnsignedByte, true);
        } else {
            i = this.f10481J1.readUnsignedByte();
        }
        int i2 = 2;
        int i3 = 1;
        while (i <= 57 && i >= 48) {
            i3++;
            m[i2] = (char) i;
            i = this.f10481J1.readUnsignedByte();
            i2++;
        }
        if (i == 46 || i == 101 || i == 69) {
            return mo18442M2(m, i2, i, true, i3);
        }
        this.f14575o1.mo19399E(i2);
        this.f10482K1 = i;
        if (this.f14571b1.mo28329h()) {
            mo18471n3();
        }
        return mo22843q2(true, i3);
    }

    /* renamed from: T2 */
    public JsonToken mo18450T2(int i) throws IOException {
        int i2;
        char[] m = this.f14575o1.mo19414m();
        int i3 = 1;
        if (i == 48) {
            i2 = mo18434F2();
            if (i2 > 57 || i2 < 48) {
                m[0] = '0';
            } else {
                i3 = 0;
            }
        } else {
            m[0] = (char) i;
            i2 = this.f10481J1.readUnsignedByte();
        }
        int i4 = i2;
        char[] cArr = m;
        int i5 = i3;
        int i6 = i5;
        while (i4 <= 57 && i4 >= 48) {
            i6++;
            if (i5 >= cArr.length) {
                cArr = this.f14575o1.mo19417p();
                i5 = 0;
            }
            cArr[i5] = (char) i4;
            i4 = this.f10481J1.readUnsignedByte();
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return mo18442M2(cArr, i5, i4, false, i6);
        }
        this.f14575o1.mo19399E(i5);
        if (this.f14571b1.mo28329h()) {
            mo18471n3();
        } else {
            this.f10482K1 = i4;
        }
        return mo22843q2(false, i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
        r11.f10479H1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (r3 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        r4 = r4 + r3;
        r13.write(r14, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return r4;
     */
    /* renamed from: U2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo18451U2(com.fasterxml.jackson.core.Base64Variant r12, java.io.OutputStream r13, byte[] r14) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 3
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0006:
            java.io.DataInput r5 = r11.f10481J1
            int r5 = r5.readUnsignedByte()
            r6 = 32
            if (r5 <= r6) goto L_0x0006
            int r6 = r12.decodeBase64Char((int) r5)
            r7 = 34
            if (r6 >= 0) goto L_0x0023
            if (r5 != r7) goto L_0x001c
            goto L_0x00d2
        L_0x001c:
            int r6 = r11.mo22818O1(r12, r5, r2)
            if (r6 >= 0) goto L_0x0023
            goto L_0x0006
        L_0x0023:
            if (r3 <= r0) goto L_0x002a
            int r4 = r4 + r3
            r13.write(r14, r2, r3)
            r3 = r2
        L_0x002a:
            java.io.DataInput r5 = r11.f10481J1
            int r5 = r5.readUnsignedByte()
            int r8 = r12.decodeBase64Char((int) r5)
            if (r8 >= 0) goto L_0x003b
            r8 = 1
            int r8 = r11.mo22818O1(r12, r5, r8)
        L_0x003b:
            int r5 = r6 << 6
            r5 = r5 | r8
            java.io.DataInput r6 = r11.f10481J1
            int r6 = r6.readUnsignedByte()
            int r8 = r12.decodeBase64Char((int) r6)
            r9 = 2
            r10 = -2
            if (r8 >= 0) goto L_0x00a8
            if (r8 == r10) goto L_0x0068
            if (r6 != r7) goto L_0x0063
            int r0 = r5 >> 4
            int r1 = r3 + 1
            byte r0 = (byte) r0
            r14[r3] = r0
            boolean r0 = r12.usesPadding()
            if (r0 == 0) goto L_0x0060
            r11.mo22821S1(r12)
        L_0x0060:
            r3 = r1
            goto L_0x00d2
        L_0x0063:
            int r6 = r11.mo22818O1(r12, r6, r9)
            r8 = r6
        L_0x0068:
            if (r8 != r10) goto L_0x00a8
            java.io.DataInput r6 = r11.f10481J1
            int r6 = r6.readUnsignedByte()
            boolean r7 = r12.usesPaddingChar((int) r6)
            if (r7 != 0) goto L_0x00a0
            r7 = 92
            if (r6 != r7) goto L_0x0081
            int r7 = r11.mo22818O1(r12, r6, r1)
            if (r7 != r10) goto L_0x0081
            goto L_0x00a0
        L_0x0081:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "expected padding character '"
            r13.append(r14)
            char r14 = r12.getPaddingChar()
            r13.append(r14)
            java.lang.String r14 = "'"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r12 = r11.mo22839m2(r12, r6, r1, r13)
            throw r12
        L_0x00a0:
            int r5 = r5 >> 4
            int r6 = r3 + 1
            byte r5 = (byte) r5
            r14[r3] = r5
            goto L_0x0108
        L_0x00a8:
            int r5 = r5 << 6
            r5 = r5 | r8
            java.io.DataInput r6 = r11.f10481J1
            int r6 = r6.readUnsignedByte()
            int r8 = r12.decodeBase64Char((int) r6)
            if (r8 >= 0) goto L_0x00f2
            if (r8 == r10) goto L_0x00e0
            if (r6 != r7) goto L_0x00db
            int r0 = r5 >> 2
            int r1 = r3 + 1
            int r5 = r0 >> 8
            byte r5 = (byte) r5
            r14[r3] = r5
            int r3 = r1 + 1
            byte r0 = (byte) r0
            r14[r1] = r0
            boolean r0 = r12.usesPadding()
            if (r0 == 0) goto L_0x00d2
            r11.mo22821S1(r12)
        L_0x00d2:
            r11.f10479H1 = r2
            if (r3 <= 0) goto L_0x00da
            int r4 = r4 + r3
            r13.write(r14, r2, r3)
        L_0x00da:
            return r4
        L_0x00db:
            int r6 = r11.mo22818O1(r12, r6, r1)
            r8 = r6
        L_0x00e0:
            if (r8 != r10) goto L_0x00f2
            int r5 = r5 >> 2
            int r6 = r3 + 1
            int r7 = r5 >> 8
            byte r7 = (byte) r7
            r14[r3] = r7
            int r3 = r6 + 1
            byte r5 = (byte) r5
            r14[r6] = r5
            goto L_0x0006
        L_0x00f2:
            int r5 = r5 << 6
            r5 = r5 | r8
            int r6 = r3 + 1
            int r7 = r5 >> 16
            byte r7 = (byte) r7
            r14[r3] = r7
            int r3 = r6 + 1
            int r7 = r5 >> 8
            byte r7 = (byte) r7
            r14[r6] = r7
            int r6 = r3 + 1
            byte r5 = (byte) r5
            r14[r3] = r5
        L_0x0108:
            r3 = r6
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d37.mo18451U2(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    /* renamed from: V2 */
    public void mo18452V2(int i) throws JsonParseException {
        if (i < 32) {
            mo23210A1(i);
        }
        mo18453W2(i);
    }

    /* renamed from: W */
    public String mo13947W() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return mo18431B2(jsonToken);
        }
        if (!this.f10479H1) {
            return this.f14575o1.mo19413l();
        }
        this.f10479H1 = false;
        return mo18488y2();
    }

    /* renamed from: W2 */
    public void mo18453W2(int i) throws JsonParseException {
        mo23225q1("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
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
            } else if (this.f10479H1) {
                this.f10479H1 = false;
                mo18489z2();
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
    public final void mo18454X2(int i) throws JsonParseException {
        mo23225q1("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    /* renamed from: Y */
    public int mo13950Y() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.f10479H1) {
                this.f10479H1 = false;
                mo18489z2();
            }
            return this.f14575o1.mo19400F();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f14571b1.mo11435b().length();
        } else {
            if (jsonToken == null) {
                return 0;
            }
            if (jsonToken.isNumeric()) {
                return this.f14575o1.mo19400F();
            }
            return this.f15012g.asCharArray().length;
        }
    }

    /* renamed from: Y1 */
    public void mo18455Y1() throws IOException {
        super.mo18455Y1();
        this.f10477F1.mo27939G();
    }

    /* renamed from: Y2 */
    public void mo18456Y2(int i, String str) throws IOException {
        mo18457Z2(i, str, mo22830c2());
    }

    /* renamed from: Z2 */
    public void mo18457Z2(int i, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char u2 = (char) mo18480u2(i);
            if (!Character.isJavaIdentifierPart(u2)) {
                mo23225q1("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            }
            sb.append(u2);
            i = this.f10481J1.readUnsignedByte();
        }
    }

    /* renamed from: a3 */
    public final void mo18458a3() throws IOException {
        int[] g = ud0.m28147g();
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        while (true) {
            int i = g[readUnsignedByte];
            if (i != 0) {
                if (i == 2) {
                    mo18464g3();
                } else if (i == 3) {
                    mo18465h3();
                } else if (i == 4) {
                    mo18466i3();
                } else if (i == 10 || i == 13) {
                    this.f14569Y++;
                } else if (i != 42) {
                    mo18452V2(readUnsignedByte);
                } else {
                    readUnsignedByte = this.f10481J1.readUnsignedByte();
                    if (readUnsignedByte == 47) {
                        return;
                    }
                }
            }
            readUnsignedByte = this.f10481J1.readUnsignedByte();
        }
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
            boolean r0 = r3.f10479H1
            if (r0 == 0) goto L_0x001d
            r3.f10479H1 = r1
            r3.mo18489z2()
        L_0x001d:
            en6 r0 = r3.f14575o1
            int r0 = r0.mo19423v()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d37.mo13956b0():int");
    }

    /* renamed from: b3 */
    public final int mo18459b3() throws IOException {
        int i = this.f10482K1;
        if (i < 0) {
            i = this.f10481J1.readUnsignedByte();
        } else {
            this.f10482K1 = -1;
        }
        if (i == 58) {
            int readUnsignedByte = this.f10481J1.readUnsignedByte();
            if (readUnsignedByte > 32) {
                if (readUnsignedByte == 47 || readUnsignedByte == 35) {
                    return mo18460c3(readUnsignedByte, true);
                }
                return readUnsignedByte;
            } else if ((readUnsignedByte != 32 && readUnsignedByte != 9) || (readUnsignedByte = this.f10481J1.readUnsignedByte()) <= 32) {
                return mo18460c3(readUnsignedByte, true);
            } else {
                if (readUnsignedByte == 47 || readUnsignedByte == 35) {
                    return mo18460c3(readUnsignedByte, true);
                }
                return readUnsignedByte;
            }
        } else {
            if (i == 32 || i == 9) {
                i = this.f10481J1.readUnsignedByte();
            }
            if (i != 58) {
                return mo18460c3(i, false);
            }
            int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                if (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) {
                    return mo18460c3(readUnsignedByte2, true);
                }
                return readUnsignedByte2;
            } else if ((readUnsignedByte2 != 32 && readUnsignedByte2 != 9) || (readUnsignedByte2 = this.f10481J1.readUnsignedByte()) <= 32) {
                return mo18460c3(readUnsignedByte2, true);
            } else {
                if (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) {
                    return mo18460c3(readUnsignedByte2, true);
                }
                return readUnsignedByte2;
            }
        }
    }

    /* renamed from: c0 */
    public JsonLocation mo13958c0() {
        return new JsonLocation(mo22816M1(), -1, -1, this.f14574k0, -1);
    }

    /* renamed from: c3 */
    public final int mo18460c3(int i, boolean z) throws IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    mo18461d3();
                } else if (i != 35 || !mo18470m3()) {
                    if (z) {
                        return i;
                    }
                    if (i != 58) {
                        mo23233y1(i, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i == 13 || i == 10) {
                this.f14569Y++;
            }
            i = this.f10481J1.readUnsignedByte();
        }
    }

    /* renamed from: d3 */
    public final void mo18461d3() throws IOException {
        if ((this.f9822a & f10472R1) == 0) {
            mo23233y1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if (readUnsignedByte == 47) {
            mo18462e3();
        } else if (readUnsignedByte == 42) {
            mo18458a3();
        } else {
            mo23233y1(readUnsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    /* renamed from: e3 */
    public final void mo18462e3() throws IOException {
        int[] g = ud0.m28147g();
        while (true) {
            int readUnsignedByte = this.f10481J1.readUnsignedByte();
            int i = g[readUnsignedByte];
            if (i != 0) {
                if (i == 2) {
                    mo18464g3();
                } else if (i == 3) {
                    mo18465h3();
                } else if (i == 4) {
                    mo18466i3();
                } else if (i == 10 || i == 13) {
                    this.f14569Y++;
                } else if (i != 42 && i < 0) {
                    mo18452V2(readUnsignedByte);
                }
            }
        }
        this.f14569Y++;
    }

    /* renamed from: f3 */
    public void mo18463f3() throws IOException {
        this.f10479H1 = false;
        int[] iArr = f10474T1;
        while (true) {
            int readUnsignedByte = this.f10481J1.readUnsignedByte();
            int i = iArr[readUnsignedByte];
            if (i != 0) {
                if (readUnsignedByte != 34) {
                    if (i == 1) {
                        mo18445P1();
                    } else if (i == 2) {
                        mo18464g3();
                    } else if (i == 3) {
                        mo18465h3();
                    } else if (i == 4) {
                        mo18466i3();
                    } else if (readUnsignedByte < 32) {
                        mo22829b2(readUnsignedByte, "string value");
                    } else {
                        mo18452V2(readUnsignedByte);
                    }
                } else {
                    return;
                }
            }
        }
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
    public final void mo18464g3() throws IOException {
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            mo18454X2(readUnsignedByte & 255);
        }
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
    public final void mo18465h3() throws IOException {
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            mo18454X2(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            mo18454X2(readUnsignedByte2 & 255);
        }
    }

    /* renamed from: i3 */
    public final void mo18466i3() throws IOException {
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            mo18454X2(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            mo18454X2(readUnsignedByte2 & 255);
        }
        int readUnsignedByte3 = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            mo18454X2(readUnsignedByte3 & 255);
        }
    }

    /* renamed from: j3 */
    public final int mo18467j3() throws IOException {
        int i = this.f10482K1;
        if (i < 0) {
            i = this.f10481J1.readUnsignedByte();
        } else {
            this.f10482K1 = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this.f14569Y++;
            }
            i = this.f10481J1.readUnsignedByte();
        }
        if (i == 47 || i == 35) {
            return mo18468k3(i);
        }
        return i;
    }

    /* renamed from: k0 */
    public String mo13974k0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.f10479H1) {
                return this.f14575o1.mo19413l();
            }
            this.f10479H1 = false;
            return mo18488y2();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        } else {
            return super.mo13976l0((String) null);
        }
    }

    /* renamed from: k3 */
    public final int mo18468k3(int i) throws IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    mo18461d3();
                } else if (i != 35 || !mo18470m3()) {
                    return i;
                }
            } else if (i == 13 || i == 10) {
                this.f14569Y++;
            }
            i = this.f10481J1.readUnsignedByte();
        }
        return i;
    }

    /* renamed from: l */
    public byte[] mo13975l(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.f14579s1 == null)) {
            mo23225q1("Current token (" + this.f15012g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f10479H1) {
            try {
                this.f14579s1 = mo18479t2(base64Variant);
                this.f10479H1 = false;
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
            if (!this.f10479H1) {
                return this.f14575o1.mo19413l();
            }
            this.f10479H1 = false;
            return mo18488y2();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        } else {
            return super.mo13976l0(str);
        }
    }

    /* renamed from: l3 */
    public final int mo18469l3() throws IOException {
        int i = this.f10482K1;
        if (i < 0) {
            try {
                i = this.f10481J1.readUnsignedByte();
            } catch (EOFException unused) {
                return mo22819Q1();
            }
        } else {
            this.f10482K1 = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this.f14569Y++;
            }
            try {
                i = this.f10481J1.readUnsignedByte();
            } catch (EOFException unused2) {
                return mo22819Q1();
            }
        }
        if (i == 47 || i == 35) {
            return mo18468k3(i);
        }
        return i;
    }

    /* renamed from: m3 */
    public final boolean mo18470m3() throws IOException {
        if ((this.f9822a & f10473S1) == 0) {
            return false;
        }
        mo18462e3();
        return true;
    }

    /* renamed from: n3 */
    public final void mo18471n3() throws IOException {
        int i = this.f10482K1;
        if (i <= 32) {
            this.f10482K1 = -1;
            if (i == 13 || i == 10) {
                this.f14569Y++;
                return;
            }
            return;
        }
        mo23232x1(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo18472o3(int[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonParseException {
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
            r0.mo18453W2(r12)
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
            r0.mo18454X2(r6)
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
            r0.mo18454X2(r5)
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
            r0.mo18454X2(r12)
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
            y60 r3 = r0.f10477F1
            java.lang.String r1 = r3.mo27958p(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d37.mo18472o3(int[], int, int):java.lang.String");
    }

    /* renamed from: p */
    public xe4 mo13980p() {
        return this.f10476E1;
    }

    /* renamed from: p3 */
    public final String mo18473p3(int i, int i2) throws JsonParseException {
        int t3 = m14701t3(i, i2);
        String w = this.f10477F1.mo27964w(t3);
        if (w != null) {
            return w;
        }
        int[] iArr = this.f10478G1;
        iArr[0] = t3;
        return mo18472o3(iArr, 1, i2);
    }

    /* renamed from: q */
    public JsonLocation mo13981q() {
        return new JsonLocation(mo22816M1(), -1, -1, this.f14569Y, -1);
    }

    /* renamed from: q3 */
    public final String mo18474q3(int i, int i2, int i3) throws JsonParseException {
        int t3 = m14701t3(i2, i3);
        String x = this.f10477F1.mo27965x(i, t3);
        if (x != null) {
            return x;
        }
        int[] iArr = this.f10478G1;
        iArr[0] = i;
        iArr[1] = t3;
        return mo18472o3(iArr, 2, i3);
    }

    /* renamed from: r2 */
    public final void mo18475r2(String str, int i, int i2) throws IOException {
        char u2 = (char) mo18480u2(i2);
        if (Character.isJavaIdentifierPart(u2)) {
            mo18456Y2(u2, str.substring(0, i));
        }
    }

    /* renamed from: r3 */
    public final String mo18476r3(int i, int i2, int i3, int i4) throws JsonParseException {
        int t3 = m14701t3(i3, i4);
        String y = this.f10477F1.mo27966y(i, i2, t3);
        if (y != null) {
            return y;
        }
        int[] iArr = this.f10478G1;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = m14701t3(t3, i4);
        return mo18472o3(iArr, 3, i4);
    }

    /* renamed from: s2 */
    public final void mo18477s2(int i) throws JsonParseException {
        if (i == 93) {
            if (!this.f14571b1.mo28327f()) {
                mo22827Z1(i, '}');
            }
            this.f14571b1 = this.f14571b1.mo26150l();
            this.f15012g = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            if (!this.f14571b1.mo28328g()) {
                mo22827Z1(i, ']');
            }
            this.f14571b1 = this.f14571b1.mo26150l();
            this.f15012g = JsonToken.END_OBJECT;
        }
    }

    /* renamed from: s3 */
    public final String mo18478s3(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = m14700C2(iArr, iArr.length);
            this.f10478G1 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = m14701t3(i2, i3);
        String z = this.f10477F1.mo27967z(iArr, i4);
        if (z == null) {
            return mo18472o3(iArr, i4, i3);
        }
        return z;
    }

    /* renamed from: t2 */
    public final byte[] mo18479t2(Base64Variant base64Variant) throws IOException {
        int readUnsignedByte;
        g60 R1 = mo22820R1();
        while (true) {
            int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte2 == 34) {
                        return R1.mo20400n();
                    }
                    decodeBase64Char = mo22818O1(base64Variant, readUnsignedByte2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                int readUnsignedByte3 = this.f10481J1.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = mo22818O1(base64Variant, readUnsignedByte3, 1);
                }
                int i = (decodeBase64Char << 6) | decodeBase64Char2;
                int readUnsignedByte4 = this.f10481J1.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte4 == 34) {
                            R1.mo20387b(i >> 4);
                            if (base64Variant.usesPadding()) {
                                mo22821S1(base64Variant);
                            }
                            return R1.mo20400n();
                        }
                        decodeBase64Char3 = mo22818O1(base64Variant, readUnsignedByte4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        readUnsignedByte = this.f10481J1.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte) || (readUnsignedByte == 92 && mo22818O1(base64Variant, readUnsignedByte, 3) == -2)) {
                            R1.mo20387b(i >> 4);
                        }
                    }
                }
                int i2 = (i << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this.f10481J1.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 == 34) {
                            R1.mo20390d(i2 >> 2);
                            if (base64Variant.usesPadding()) {
                                mo22821S1(base64Variant);
                            }
                            return R1.mo20400n();
                        }
                        decodeBase64Char4 = mo22818O1(base64Variant, readUnsignedByte5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        R1.mo20390d(i2 >> 2);
                    }
                }
                R1.mo20388c((i2 << 6) | decodeBase64Char4);
            }
        }
        throw mo22839m2(base64Variant, readUnsignedByte, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: u2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo18480u2(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L_0x006e
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
            r6.mo18453W2(r0)
            goto L_0x0010
        L_0x002c:
            java.io.DataInput r3 = r6.f10481J1
            int r3 = r3.readUnsignedByte()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x003d
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6.mo18454X2(r4)
        L_0x003d:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L_0x006e
            java.io.DataInput r2 = r6.f10481J1
            int r2 = r2.readUnsignedByte()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x0053
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6.mo18454X2(r3)
        L_0x0053:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L_0x006e
            java.io.DataInput r0 = r6.f10481J1
            int r0 = r0.readUnsignedByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x0069
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.mo18454X2(r1)
        L_0x0069:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L_0x006e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d37.mo18480u2(int):int");
    }

    /* renamed from: u3 */
    public final String mo18481u3(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = f10475U1;
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
                            iArr = m14700C2(iArr, iArr.length);
                            this.f10478G1 = iArr;
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
                                iArr = m14700C2(iArr, iArr.length);
                                this.f10478G1 = iArr;
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
                    iArr = m14700C2(iArr, iArr.length);
                    this.f10478G1 = iArr;
                }
                iArr[i] = r8;
                i2 = i3;
                i++;
                i4 = 1;
            }
            i3 = this.f10481J1.readUnsignedByte();
        }
        if (r10 > 0) {
            if (i >= iArr.length) {
                iArr = m14700C2(iArr, iArr.length);
                this.f10478G1 = iArr;
            }
            iArr[i] = m14701t3(r8, r10);
            i++;
        }
        String z = this.f10477F1.mo27967z(iArr, i);
        if (z == null) {
            return mo18472o3(iArr, i, r10);
        }
        return z;
    }

    /* renamed from: v2 */
    public final int mo18482v2(int i) throws IOException {
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            mo18454X2(readUnsignedByte & 255);
        }
        return ((i & 31) << 6) | (readUnsignedByte & 63);
    }

    /* renamed from: v3 */
    public final String mo18483v3(int i, int i2, int i3) throws IOException {
        return mo18481u3(this.f10478G1, 0, i, i2, i3);
    }

    /* renamed from: w2 */
    public final int mo18484w2(int i) throws IOException {
        int i2 = i & 15;
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            mo18454X2(readUnsignedByte & 255);
        }
        int i3 = (i2 << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            mo18454X2(readUnsignedByte2 & 255);
        }
        return (i3 << 6) | (readUnsignedByte2 & 63);
    }

    /* renamed from: w3 */
    public final String mo18485w3(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this.f10478G1;
        iArr[0] = i;
        return mo18481u3(iArr, 1, i2, i3, i4);
    }

    /* renamed from: x2 */
    public final int mo18486x2(int i) throws IOException {
        int readUnsignedByte = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            mo18454X2(readUnsignedByte & 255);
        }
        int i2 = ((i & 7) << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            mo18454X2(readUnsignedByte2 & 255);
        }
        int i3 = (i2 << 6) | (readUnsignedByte2 & 63);
        int readUnsignedByte3 = this.f10481J1.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            mo18454X2(readUnsignedByte3 & 255);
        }
        return ((i3 << 6) | (readUnsignedByte3 & 63)) - 65536;
    }

    /* renamed from: x3 */
    public final String mo18487x3(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.f10478G1;
        iArr[0] = i;
        iArr[1] = i2;
        return mo18481u3(iArr, 2, i3, i4, i5);
    }

    /* renamed from: y2 */
    public final String mo18488y2() throws IOException {
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f10474T1;
        int length = m.length;
        int i = 0;
        while (true) {
            int readUnsignedByte = this.f10481J1.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i2 = i + 1;
                m[i] = (char) readUnsignedByte;
                if (i2 >= length) {
                    mo18430A2(m, i2, this.f10481J1.readUnsignedByte());
                    return this.f14575o1.mo19413l();
                }
                i = i2;
            } else if (readUnsignedByte == 34) {
                return this.f14575o1.mo19398D(i);
            } else {
                mo18430A2(m, i, readUnsignedByte);
                return this.f14575o1.mo19413l();
            }
        }
    }

    /* renamed from: z2 */
    public void mo18489z2() throws IOException {
        char[] m = this.f14575o1.mo19414m();
        int[] iArr = f10474T1;
        int length = m.length;
        int i = 0;
        while (true) {
            int readUnsignedByte = this.f10481J1.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i2 = i + 1;
                m[i] = (char) readUnsignedByte;
                if (i2 >= length) {
                    mo18430A2(m, i2, this.f10481J1.readUnsignedByte());
                    return;
                }
                i = i2;
            } else if (readUnsignedByte == 34) {
                this.f14575o1.mo19399E(i);
                return;
            } else {
                mo18430A2(m, i, readUnsignedByte);
                return;
            }
        }
    }
}
