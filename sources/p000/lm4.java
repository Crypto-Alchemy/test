package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.p009io.ContentReference;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: lm4 */
/* compiled from: ParserBase */
public abstract class lm4 extends mm4 {

    /* renamed from: D1 */
    public static final yz2<StreamReadCapability> f14560D1 = JsonParser.f9821e;

    /* renamed from: A1 */
    public int f14561A1;

    /* renamed from: B1 */
    public int f14562B1;

    /* renamed from: C1 */
    public int f14563C1;

    /* renamed from: M */
    public final po2 f14564M;

    /* renamed from: P */
    public boolean f14565P;

    /* renamed from: Q */
    public int f14566Q;

    /* renamed from: U */
    public int f14567U;

    /* renamed from: X */
    public long f14568X;

    /* renamed from: Y */
    public int f14569Y = 1;

    /* renamed from: Z */
    public int f14570Z;

    /* renamed from: b1 */
    public t53 f14571b1;

    /* renamed from: e0 */
    public long f14572e0;

    /* renamed from: e1 */
    public JsonToken f14573e1;

    /* renamed from: k0 */
    public int f14574k0 = 1;

    /* renamed from: o1 */
    public final en6 f14575o1;

    /* renamed from: p1 */
    public char[] f14576p1;

    /* renamed from: q1 */
    public boolean f14577q1;

    /* renamed from: r1 */
    public g60 f14578r1;

    /* renamed from: s1 */
    public byte[] f14579s1;

    /* renamed from: t1 */
    public int f14580t1 = 0;

    /* renamed from: u1 */
    public int f14581u1;

    /* renamed from: v0 */
    public int f14582v0;

    /* renamed from: v1 */
    public long f14583v1;

    /* renamed from: w1 */
    public double f14584w1;

    /* renamed from: x1 */
    public BigInteger f14585x1;

    /* renamed from: y1 */
    public BigDecimal f14586y1;

    /* renamed from: z1 */
    public boolean f14587z1;

    public lm4(po2 po2, int i) {
        super(i);
        el1 el1;
        this.f14564M = po2;
        this.f14575o1 = po2.mo24741k();
        if (JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i)) {
            el1 = el1.m16173f(this);
        } else {
            el1 = null;
        }
        this.f14571b1 = t53.m27435o(el1);
    }

    /* renamed from: k2 */
    public static int[] m21533k2(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }

    /* renamed from: C */
    public float mo13927C() throws IOException {
        return (float) mo13990z();
    }

    /* renamed from: D0 */
    public boolean mo13929D0() {
        if (this.f15012g != JsonToken.VALUE_NUMBER_FLOAT || (this.f14580t1 & 8) == 0) {
            return false;
        }
        double d = this.f14584w1;
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public int mo13933I() throws IOException {
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

    /* renamed from: J */
    public long mo13934J() throws IOException {
        int i = this.f14580t1;
        if ((i & 2) == 0) {
            if (i == 0) {
                mo22824V1(2);
            }
            if ((this.f14580t1 & 2) == 0) {
                mo22836i2();
            }
        }
        return this.f14583v1;
    }

    /* renamed from: K */
    public JsonParser.NumberType mo13935K() throws IOException {
        if (this.f14580t1 == 0) {
            mo22824V1(0);
        }
        if (this.f15012g == JsonToken.VALUE_NUMBER_INT) {
            int i = this.f14580t1;
            if ((i & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        } else if ((this.f14580t1 & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        } else {
            return JsonParser.NumberType.DOUBLE;
        }
    }

    /* renamed from: K1 */
    public void mo22815K1(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) != 0 && (i & mask) != 0) {
            if (this.f14571b1.mo26154q() == null) {
                this.f14571b1 = this.f14571b1.mo26159v(el1.m16173f(this));
            } else {
                this.f14571b1 = this.f14571b1.mo26159v((el1) null);
            }
        }
    }

    /* renamed from: L */
    public Number mo13936L() throws IOException {
        if (this.f14580t1 == 0) {
            mo22824V1(0);
        }
        if (this.f15012g == JsonToken.VALUE_NUMBER_INT) {
            int i = this.f14580t1;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.f14581u1);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.f14583v1);
            }
            if ((i & 4) != 0) {
                return this.f14585x1;
            }
            mo23234z1();
        }
        int i2 = this.f14580t1;
        if ((i2 & 16) != 0) {
            return this.f14586y1;
        }
        if ((i2 & 8) == 0) {
            mo23234z1();
        }
        return Double.valueOf(this.f14584w1);
    }

    /* renamed from: L1 */
    public abstract void mo18440L1() throws IOException;

    /* renamed from: M1 */
    public ContentReference mo22816M1() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.f9822a)) {
            return this.f14564M.mo24742l();
        }
        return ContentReference.unknown();
    }

    /* renamed from: N */
    public Number mo13937N() throws IOException {
        if (this.f15012g == JsonToken.VALUE_NUMBER_INT) {
            if (this.f14580t1 == 0) {
                mo22824V1(0);
            }
            int i = this.f14580t1;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.f14581u1);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.f14583v1);
            }
            if ((i & 4) != 0) {
                return this.f14585x1;
            }
            mo23234z1();
        }
        if (this.f14580t1 == 0) {
            mo22824V1(16);
        }
        int i2 = this.f14580t1;
        if ((i2 & 16) != 0) {
            return this.f14586y1;
        }
        if ((i2 & 8) == 0) {
            mo23234z1();
        }
        return Double.valueOf(this.f14584w1);
    }

    /* renamed from: N1 */
    public final int mo22817N1(Base64Variant base64Variant, char c, int i) throws IOException {
        if (c == '\\') {
            char P1 = mo18445P1();
            if (P1 <= ' ' && i == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(P1);
            if (decodeBase64Char >= 0 || (decodeBase64Char == -2 && i >= 2)) {
                return decodeBase64Char;
            }
            throw mo22838l2(base64Variant, P1, i);
        }
        throw mo22838l2(base64Variant, c, i);
    }

    /* renamed from: O1 */
    public final int mo22818O1(Base64Variant base64Variant, int i, int i2) throws IOException {
        if (i == 92) {
            char P1 = mo18445P1();
            if (P1 <= ' ' && i2 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char((int) P1);
            if (decodeBase64Char >= 0 || decodeBase64Char == -2) {
                return decodeBase64Char;
            }
            throw mo22838l2(base64Variant, P1, i2);
        }
        throw mo22838l2(base64Variant, i, i2);
    }

    /* renamed from: P1 */
    public abstract char mo18445P1() throws IOException;

    /* renamed from: Q0 */
    public JsonParser mo13944Q0(int i, int i2) {
        int i3 = this.f9822a;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.f9822a = i4;
            mo22815K1(i4, i5);
        }
        return this;
    }

    /* renamed from: Q1 */
    public final int mo22819Q1() throws JsonParseException {
        mo20102h1();
        return -1;
    }

    /* renamed from: R1 */
    public g60 mo22820R1() {
        g60 g60 = this.f14578r1;
        if (g60 == null) {
            this.f14578r1 = new g60();
        } else {
            g60.mo20397k();
        }
        return this.f14578r1;
    }

    /* renamed from: S1 */
    public void mo22821S1(Base64Variant base64Variant) throws IOException {
        mo23225q1(base64Variant.missingPaddingMessage());
    }

    /* renamed from: T1 */
    public char mo22822T1(char c) throws JsonProcessingException {
        if (mo13989y0(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && mo13989y0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        mo23225q1("Unrecognized character escape " + mm4.m22340g1(c));
        return c;
    }

    /* renamed from: U1 */
    public int mo22823U1() throws IOException {
        if (this.f14565P) {
            mo23225q1("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.f15012g != JsonToken.VALUE_NUMBER_INT || this.f14561A1 > 9) {
            mo22824V1(1);
            if ((this.f14580t1 & 1) == 0) {
                mo22835h2();
            }
            return this.f14581u1;
        }
        int j = this.f14575o1.mo19411j(this.f14587z1);
        this.f14581u1 = j;
        this.f14580t1 = 1;
        return j;
    }

    /* renamed from: V1 */
    public void mo22824V1(int i) throws IOException {
        if (this.f14565P) {
            mo23225q1("Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this.f14561A1;
            if (i2 <= 9) {
                this.f14581u1 = this.f14575o1.mo19411j(this.f14587z1);
                this.f14580t1 = 1;
            } else if (i2 <= 18) {
                long k = this.f14575o1.mo19412k(this.f14587z1);
                if (i2 == 10) {
                    if (this.f14587z1) {
                        if (k >= -2147483648L) {
                            this.f14581u1 = (int) k;
                            this.f14580t1 = 1;
                            return;
                        }
                    } else if (k <= 2147483647L) {
                        this.f14581u1 = (int) k;
                        this.f14580t1 = 1;
                        return;
                    }
                }
                this.f14583v1 = k;
                this.f14580t1 = 2;
            } else {
                mo22826X1(i);
            }
        } else if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            mo22825W1(i);
        } else {
            mo23226r1("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
        }
    }

    /* renamed from: W1 */
    public final void mo22825W1(int i) throws IOException {
        if (i == 16) {
            try {
                this.f14586y1 = this.f14575o1.mo19409h();
                this.f14580t1 = 16;
            } catch (NumberFormatException e) {
                mo23211B1("Malformed numeric value (" + mo23224l1(this.f14575o1.mo19413l()) + ")", e);
            }
        } else {
            this.f14584w1 = this.f14575o1.mo19410i();
            this.f14580t1 = 8;
        }
    }

    /* renamed from: X1 */
    public final void mo22826X1(int i) throws IOException {
        String l = this.f14575o1.mo19413l();
        try {
            int i2 = this.f14561A1;
            char[] u = this.f14575o1.mo19422u();
            int v = this.f14575o1.mo19423v();
            boolean z = this.f14587z1;
            if (z) {
                v++;
            }
            if (kc4.m20639b(u, v, i2, z)) {
                this.f14583v1 = Long.parseLong(l);
                this.f14580t1 = 2;
                return;
            }
            if (i == 1 || i == 2) {
                mo22828a2(i, l);
            }
            if (i != 8) {
                if (i != 32) {
                    this.f14585x1 = new BigInteger(l);
                    this.f14580t1 = 4;
                    return;
                }
            }
            this.f14584w1 = kc4.m20646i(l);
            this.f14580t1 = 8;
        } catch (NumberFormatException e) {
            mo23211B1("Malformed numeric value (" + mo23224l1(l) + ")", e);
        }
    }

    /* renamed from: Y0 */
    public void mo13951Y0(Object obj) {
        this.f14571b1.mo11437i(obj);
    }

    /* renamed from: Y1 */
    public void mo18455Y1() throws IOException {
        this.f14575o1.mo19425x();
        char[] cArr = this.f14576p1;
        if (cArr != null) {
            this.f14576p1 = null;
            this.f14564M.mo24747q(cArr);
        }
    }

    @Deprecated
    /* renamed from: Z0 */
    public JsonParser mo13952Z0(int i) {
        int i2 = this.f9822a ^ i;
        if (i2 != 0) {
            this.f9822a = i;
            mo22815K1(i, i2);
        }
        return this;
    }

    /* renamed from: Z1 */
    public void mo22827Z1(int i, char c) throws JsonParseException {
        t53 j2 = mo13941P();
        mo23225q1(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i), Character.valueOf(c), j2.mo28330j(), j2.mo26158u(mo22816M1())}));
    }

    /* renamed from: a2 */
    public void mo22828a2(int i, String str) throws IOException {
        if (i == 1) {
            mo23214E1(str);
        } else {
            mo23217H1(str);
        }
    }

    /* renamed from: b2 */
    public void mo22829b2(int i, String str) throws JsonParseException {
        if (!mo13989y0(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            mo23225q1("Illegal unquoted character (" + mm4.m22340g1((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    /* renamed from: c2 */
    public String mo22830c2() throws IOException {
        return mo22831d2();
    }

    public void close() throws IOException {
        if (!this.f14565P) {
            this.f14566Q = Math.max(this.f14566Q, this.f14567U);
            this.f14565P = true;
            try {
                mo18440L1();
            } finally {
                mo18455Y1();
            }
        }
    }

    /* renamed from: d2 */
    public String mo22831d2() throws IOException {
        if (mo13989y0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            return "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')";
        }
        return "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    /* renamed from: e2 */
    public void mo22832e2() throws IOException {
        int i = this.f14580t1;
        if ((i & 8) != 0) {
            this.f14586y1 = kc4.m20643f(mo13947W());
        } else if ((i & 4) != 0) {
            this.f14586y1 = new BigDecimal(this.f14585x1);
        } else if ((i & 2) != 0) {
            this.f14586y1 = BigDecimal.valueOf(this.f14583v1);
        } else if ((i & 1) != 0) {
            this.f14586y1 = BigDecimal.valueOf((long) this.f14581u1);
        } else {
            mo23234z1();
        }
        this.f14580t1 |= 16;
    }

    /* renamed from: f2 */
    public void mo22833f2() throws IOException {
        int i = this.f14580t1;
        if ((i & 16) != 0) {
            this.f14585x1 = this.f14586y1.toBigInteger();
        } else if ((i & 2) != 0) {
            this.f14585x1 = BigInteger.valueOf(this.f14583v1);
        } else if ((i & 1) != 0) {
            this.f14585x1 = BigInteger.valueOf((long) this.f14581u1);
        } else if ((i & 8) != 0) {
            this.f14585x1 = BigDecimal.valueOf(this.f14584w1).toBigInteger();
        } else {
            mo23234z1();
        }
        this.f14580t1 |= 4;
    }

    /* renamed from: g2 */
    public void mo22834g2() throws IOException {
        int i = this.f14580t1;
        if ((i & 16) != 0) {
            this.f14584w1 = this.f14586y1.doubleValue();
        } else if ((i & 4) != 0) {
            this.f14584w1 = this.f14585x1.doubleValue();
        } else if ((i & 2) != 0) {
            this.f14584w1 = (double) this.f14583v1;
        } else if ((i & 1) != 0) {
            this.f14584w1 = (double) this.f14581u1;
        } else {
            mo23234z1();
        }
        this.f14580t1 |= 8;
    }

    /* renamed from: h1 */
    public void mo20102h1() throws JsonParseException {
        String str;
        if (!this.f14571b1.mo28329h()) {
            if (this.f14571b1.mo28327f()) {
                str = "Array";
            } else {
                str = "Object";
            }
            mo23230v1(String.format(": expected close marker for %s (start marker at %s)", new Object[]{str, this.f14571b1.mo26158u(mo22816M1())}), (JsonToken) null);
        }
    }

    /* renamed from: h2 */
    public void mo22835h2() throws IOException {
        int i = this.f14580t1;
        if ((i & 2) != 0) {
            long j = this.f14583v1;
            int i2 = (int) j;
            if (((long) i2) != j) {
                mo23215F1(mo13947W(), mo13965g());
            }
            this.f14581u1 = i2;
        } else if ((i & 4) != 0) {
            if (mm4.f15010x.compareTo(this.f14585x1) > 0 || mm4.f15011y.compareTo(this.f14585x1) < 0) {
                mo23213D1();
            }
            this.f14581u1 = this.f14585x1.intValue();
        } else if ((i & 8) != 0) {
            double d = this.f14584w1;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                mo23213D1();
            }
            this.f14581u1 = (int) this.f14584w1;
        } else if ((i & 16) != 0) {
            if (mm4.f15006I.compareTo(this.f14586y1) > 0 || mm4.f15007L.compareTo(this.f14586y1) < 0) {
                mo23213D1();
            }
            this.f14581u1 = this.f14586y1.intValue();
        } else {
            mo23234z1();
        }
        this.f14580t1 |= 1;
    }

    /* renamed from: i */
    public JsonParser mo13969i(JsonParser.Feature feature) {
        this.f9822a |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this.f14571b1.mo26154q() == null) {
            this.f14571b1 = this.f14571b1.mo26159v(el1.m16173f(this));
        }
        return this;
    }

    /* renamed from: i2 */
    public void mo22836i2() throws IOException {
        int i = this.f14580t1;
        if ((i & 1) != 0) {
            this.f14583v1 = (long) this.f14581u1;
        } else if ((i & 4) != 0) {
            if (mm4.f15002A.compareTo(this.f14585x1) > 0 || mm4.f15003B.compareTo(this.f14585x1) < 0) {
                mo23216G1();
            }
            this.f14583v1 = this.f14585x1.longValue();
        } else if ((i & 8) != 0) {
            double d = this.f14584w1;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                mo23216G1();
            }
            this.f14583v1 = (long) this.f14584w1;
        } else if ((i & 16) != 0) {
            if (mm4.f15004C.compareTo(this.f14586y1) > 0 || mm4.f15005H.compareTo(this.f14586y1) < 0) {
                mo23216G1();
            }
            this.f14583v1 = this.f14586y1.longValue();
        } else {
            mo23234z1();
        }
        this.f14580t1 |= 2;
    }

    /* renamed from: j */
    public BigInteger mo13971j() throws IOException {
        int i = this.f14580t1;
        if ((i & 4) == 0) {
            if (i == 0) {
                mo22824V1(4);
            }
            if ((this.f14580t1 & 4) == 0) {
                mo22833f2();
            }
        }
        return this.f14585x1;
    }

    /* renamed from: j2 */
    public t53 mo13941P() {
        return this.f14571b1;
    }

    /* renamed from: l2 */
    public IllegalArgumentException mo22838l2(Base64Variant base64Variant, int i, int i2) throws IllegalArgumentException {
        return mo22839m2(base64Variant, i, i2, (String) null);
    }

    /* renamed from: m2 */
    public IllegalArgumentException mo22839m2(Base64Variant base64Variant, int i, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", new Object[]{Integer.toHexString(i), Integer.valueOf(i2 + 1)});
        } else if (base64Variant.usesPaddingChar(i)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    /* renamed from: n2 */
    public final JsonToken mo22840n2(boolean z, int i, int i2, int i3) {
        if (i2 >= 1 || i3 >= 1) {
            return mo22842p2(z, i, i2, i3);
        }
        return mo22843q2(z, i);
    }

    /* renamed from: o2 */
    public final JsonToken mo22841o2(String str, double d) {
        this.f14575o1.mo19396B(str);
        this.f14584w1 = d;
        this.f14580t1 = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* renamed from: p2 */
    public final JsonToken mo22842p2(boolean z, int i, int i2, int i3) {
        this.f14587z1 = z;
        this.f14561A1 = i;
        this.f14562B1 = i2;
        this.f14563C1 = i3;
        this.f14580t1 = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* renamed from: q0 */
    public boolean mo13982q0() {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f14577q1;
        }
        return false;
    }

    /* renamed from: q2 */
    public final JsonToken mo22843q2(boolean z, int i) {
        this.f14587z1 = z;
        this.f14561A1 = i;
        this.f14562B1 = 0;
        this.f14563C1 = 0;
        this.f14580t1 = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    /* renamed from: s */
    public String mo13983s() throws IOException {
        t53 r;
        JsonToken jsonToken = this.f15012g;
        if ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (r = this.f14571b1.mo11443e()) != null) {
            return r.mo11435b();
        }
        return this.f14571b1.mo11435b();
    }

    /* renamed from: y */
    public BigDecimal mo13988y() throws IOException {
        int i = this.f14580t1;
        if ((i & 16) == 0) {
            if (i == 0) {
                mo22824V1(16);
            }
            if ((this.f14580t1 & 16) == 0) {
                mo22832e2();
            }
        }
        return this.f14586y1;
    }

    /* renamed from: z */
    public double mo13990z() throws IOException {
        int i = this.f14580t1;
        if ((i & 8) == 0) {
            if (i == 0) {
                mo22824V1(8);
            }
            if ((this.f14580t1 & 8) == 0) {
                mo22834g2();
            }
        }
        return this.f14584w1;
    }
}
