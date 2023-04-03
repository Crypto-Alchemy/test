package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: i84 */
/* compiled from: NonBlockingJsonParserBase */
public abstract class i84 extends lm4 {

    /* renamed from: U1 */
    public static final String[] f13185U1 = {"NaN", "Infinity", "+Infinity", "-Infinity"};

    /* renamed from: V1 */
    public static final double[] f13186V1 = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};

    /* renamed from: E1 */
    public final y60 f13187E1;

    /* renamed from: F1 */
    public int[] f13188F1 = new int[8];

    /* renamed from: G1 */
    public int f13189G1;

    /* renamed from: H1 */
    public int f13190H1;

    /* renamed from: I1 */
    public int f13191I1;

    /* renamed from: J1 */
    public int f13192J1;

    /* renamed from: K1 */
    public int f13193K1;

    /* renamed from: L1 */
    public int f13194L1;

    /* renamed from: M1 */
    public int f13195M1;

    /* renamed from: N1 */
    public int f13196N1;

    /* renamed from: O1 */
    public int f13197O1;

    /* renamed from: P1 */
    public int f13198P1;

    /* renamed from: Q1 */
    public boolean f13199Q1 = false;

    /* renamed from: R1 */
    public int f13200R1;

    /* renamed from: S1 */
    public int f13201S1 = 0;

    /* renamed from: T1 */
    public int f13202T1 = 1;

    public i84(po2 po2, int i, y60 y60) {
        super(po2, i);
        this.f13187E1 = y60;
        this.f15012g = null;
        this.f13195M1 = 0;
        this.f13196N1 = 1;
    }

    /* renamed from: B2 */
    public static final int m19465B2(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    /* renamed from: A */
    public Object mo13924A() throws IOException {
        if (this.f15012g == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.f14579s1;
        }
        return null;
    }

    /* renamed from: A2 */
    public final String mo21482A2(int i) {
        return f13185U1[i];
    }

    /* renamed from: C2 */
    public void mo21483C2(int i) throws JsonParseException {
        if (i < 32) {
            mo23210A1(i);
        }
        mo21484D2(i);
    }

    /* renamed from: D2 */
    public void mo21484D2(int i) throws JsonParseException {
        mo23225q1("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    /* renamed from: E2 */
    public void mo21485E2(int i) throws JsonParseException {
        mo23225q1("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    /* renamed from: F2 */
    public void mo21486F2(int i, int i2) throws JsonParseException {
        this.f14566Q = i2;
        mo21485E2(i);
    }

    /* renamed from: G */
    public Object mo13931G() {
        return null;
    }

    /* renamed from: G2 */
    public final JsonToken mo21487G2() throws IOException {
        this.f14571b1 = this.f14571b1.mo26151m(-1, -1);
        this.f13195M1 = 5;
        this.f13196N1 = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: H2 */
    public final JsonToken mo21488H2() throws IOException {
        this.f14571b1 = this.f14571b1.mo26152n(-1, -1);
        this.f13195M1 = 2;
        this.f13196N1 = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: I2 */
    public final void mo21489I2() {
        this.f14574k0 = Math.max(this.f14569Y, this.f13202T1);
        int i = this.f14566Q;
        this.f14582v0 = i - this.f14570Z;
        this.f14572e0 = this.f14568X + ((long) (i - this.f13201S1));
    }

    /* renamed from: J2 */
    public final JsonToken mo21490J2(JsonToken jsonToken) throws IOException {
        this.f13195M1 = this.f13196N1;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: K2 */
    public final JsonToken mo21491K2(int i, String str) throws IOException {
        this.f14575o1.mo19396B(str);
        this.f14561A1 = str.length();
        this.f14580t1 = 1;
        this.f14581u1 = i;
        this.f13195M1 = this.f13196N1;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: L1 */
    public void mo18440L1() throws IOException {
        this.f13201S1 = 0;
        this.f14567U = 0;
    }

    /* renamed from: L2 */
    public final JsonToken mo21492L2(int i) throws IOException {
        String str = f13185U1[i];
        this.f14575o1.mo19396B(str);
        if (!mo13989y0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            mo23226r1("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        this.f14561A1 = 0;
        this.f14580t1 = 8;
        this.f14584w1 = f13186V1[i];
        this.f13195M1 = this.f13196N1;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: Q */
    public yz2<StreamReadCapability> mo13943Q() {
        return lm4.f14560D1;
    }

    /* renamed from: S0 */
    public int mo13946S0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] l = mo13975l(base64Variant);
        outputStream.write(l);
        return l.length;
    }

    /* renamed from: W */
    public String mo13947W() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.f14575o1.mo19413l();
        }
        return mo21501z2(jsonToken);
    }

    /* renamed from: X */
    public char[] mo13949X() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.mo14000id();
        if (id == 5) {
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
        } else if (id == 6 || id == 7 || id == 8) {
            return this.f14575o1.mo19422u();
        } else {
            return this.f15012g.asCharArray();
        }
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
        if (id == 6 || id == 7 || id == 8) {
            return this.f14575o1.mo19400F();
        }
        return this.f15012g.asCharArray().length;
    }

    /* renamed from: Y1 */
    public void mo18455Y1() throws IOException {
        super.mo18455Y1();
        this.f13187E1.mo27939G();
    }

    /* renamed from: b0 */
    public int mo13956b0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.mo14000id();
        if (id == 6 || id == 7 || id == 8) {
            return this.f14575o1.mo19423v();
        }
        return 0;
    }

    /* renamed from: c0 */
    public JsonLocation mo13958c0() {
        return new JsonLocation(mo22816M1(), this.f14572e0, -1, this.f14574k0, this.f14582v0);
    }

    /* renamed from: k0 */
    public String mo13974k0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.f14575o1.mo19413l();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        }
        return super.mo13976l0((String) null);
    }

    /* renamed from: l */
    public byte[] mo13975l(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.VALUE_STRING) {
            mo23226r1("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", jsonToken);
        }
        if (this.f14579s1 == null) {
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
            return this.f14575o1.mo19413l();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        }
        return super.mo13976l0(str);
    }

    /* renamed from: p */
    public xe4 mo13980p() {
        return null;
    }

    /* renamed from: q */
    public JsonLocation mo13981q() {
        int i = (this.f14566Q - this.f14570Z) + 1;
        return new JsonLocation(mo22816M1(), this.f14568X + ((long) (this.f14566Q - this.f13201S1)), -1, Math.max(this.f14569Y, this.f13202T1), i);
    }

    /* renamed from: q0 */
    public boolean mo13982q0() {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.f14575o1.mo19424w();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f14577q1;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo21493r2(int[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonParseException {
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
            r0.mo21484D2(r12)
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
            r0.mo21485E2(r6)
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
            r0.mo21485E2(r5)
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
            r0.mo21485E2(r12)
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
            y60 r3 = r0.f13187E1
            java.lang.String r1 = r3.mo27958p(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i84.mo21493r2(int[], int, int):java.lang.String");
    }

    /* renamed from: s2 */
    public final JsonToken mo21494s2() throws IOException {
        int i;
        if (!this.f14571b1.mo28327f()) {
            mo22827Z1(93, '}');
        }
        t53 r = this.f14571b1.mo11443e();
        this.f14571b1 = r;
        if (r.mo28328g()) {
            i = 3;
        } else if (r.mo28327f()) {
            i = 6;
        } else {
            i = 1;
        }
        this.f13195M1 = i;
        this.f13196N1 = i;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: t2 */
    public final JsonToken mo21495t2() throws IOException {
        int i;
        if (!this.f14571b1.mo28328g()) {
            mo22827Z1(125, ']');
        }
        t53 r = this.f14571b1.mo11443e();
        this.f14571b1 = r;
        if (r.mo28328g()) {
            i = 3;
        } else if (r.mo28327f()) {
            i = 6;
        } else {
            i = 1;
        }
        this.f13195M1 = i;
        this.f13196N1 = i;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: u2 */
    public final JsonToken mo21496u2() throws IOException {
        this.f13195M1 = 7;
        if (!this.f14571b1.mo28329h()) {
            mo20102h1();
        }
        close();
        this.f15012g = null;
        return null;
    }

    /* renamed from: v2 */
    public final JsonToken mo21497v2(String str) throws IOException {
        this.f13195M1 = 4;
        this.f14571b1.mo26157t(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this.f15012g = jsonToken;
        return jsonToken;
    }

    /* renamed from: w2 */
    public final String mo21498w2(int i, int i2) throws JsonParseException {
        int B2 = m19465B2(i, i2);
        String w = this.f13187E1.mo27964w(B2);
        if (w != null) {
            return w;
        }
        int[] iArr = this.f13188F1;
        iArr[0] = B2;
        return mo21493r2(iArr, 1, i2);
    }

    /* renamed from: x2 */
    public final String mo21499x2(int i, int i2, int i3) throws JsonParseException {
        int B2 = m19465B2(i2, i3);
        String x = this.f13187E1.mo27965x(i, B2);
        if (x != null) {
            return x;
        }
        int[] iArr = this.f13188F1;
        iArr[0] = i;
        iArr[1] = B2;
        return mo21493r2(iArr, 2, i3);
    }

    /* renamed from: y2 */
    public final String mo21500y2(int i, int i2, int i3, int i4) throws JsonParseException {
        int B2 = m19465B2(i3, i4);
        String y = this.f13187E1.mo27966y(i, i2, B2);
        if (y != null) {
            return y;
        }
        int[] iArr = this.f13188F1;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = m19465B2(B2, i4);
        return mo21493r2(iArr, 3, i4);
    }

    /* renamed from: z2 */
    public final String mo21501z2(JsonToken jsonToken) {
        int id;
        if (jsonToken == null || (id = jsonToken.mo14000id()) == -1) {
            return null;
        }
        if (id == 5) {
            return this.f14571b1.mo11435b();
        }
        if (id == 6 || id == 7 || id == 8) {
            return this.f14575o1.mo19413l();
        }
        return jsonToken.asString();
    }
}
