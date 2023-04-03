package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.p009io.JsonEOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: mm4 */
/* compiled from: ParserMinimalBase */
public abstract class mm4 extends JsonParser {

    /* renamed from: A */
    public static final BigInteger f15002A;

    /* renamed from: B */
    public static final BigInteger f15003B;

    /* renamed from: C */
    public static final BigDecimal f15004C;

    /* renamed from: H */
    public static final BigDecimal f15005H;

    /* renamed from: I */
    public static final BigDecimal f15006I;

    /* renamed from: L */
    public static final BigDecimal f15007L;

    /* renamed from: r */
    public static final byte[] f15008r = new byte[0];

    /* renamed from: s */
    public static final int[] f15009s = new int[0];

    /* renamed from: x */
    public static final BigInteger f15010x;

    /* renamed from: y */
    public static final BigInteger f15011y;

    /* renamed from: g */
    public JsonToken f15012g;

    /* renamed from: k */
    public JsonToken f15013k;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        f15010x = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        f15011y = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f15002A = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f15003B = valueOf4;
        f15004C = new BigDecimal(valueOf3);
        f15005H = new BigDecimal(valueOf4);
        f15006I = new BigDecimal(valueOf);
        f15007L = new BigDecimal(valueOf2);
    }

    public mm4(int i) {
        super(i);
    }

    /* renamed from: g1 */
    public static final String m22340g1(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        } else if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        } else {
            return "'" + c + "' (code " + i + ")";
        }
    }

    /* renamed from: A0 */
    public boolean mo13925A0() {
        if (this.f15012g == JsonToken.VALUE_NUMBER_INT) {
            return true;
        }
        return false;
    }

    /* renamed from: A1 */
    public void mo23210A1(int i) throws JsonParseException {
        mo23225q1("Illegal character (" + m22340g1((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    /* renamed from: B0 */
    public boolean mo13926B0() {
        if (this.f15012g == JsonToken.START_ARRAY) {
            return true;
        }
        return false;
    }

    /* renamed from: B1 */
    public final void mo23211B1(String str, Throwable th) throws JsonParseException {
        throw mo23220d1(str, th);
    }

    /* renamed from: C0 */
    public boolean mo13928C0() {
        if (this.f15012g == JsonToken.START_OBJECT) {
            return true;
        }
        return false;
    }

    /* renamed from: C1 */
    public void mo23212C1(String str) throws JsonParseException {
        mo23225q1("Invalid numeric value: " + str);
    }

    /* renamed from: D1 */
    public void mo23213D1() throws IOException {
        mo23214E1(mo13947W());
    }

    /* renamed from: E1 */
    public void mo23214E1(String str) throws IOException {
        mo23215F1(str, mo13965g());
    }

    /* renamed from: F1 */
    public void mo23215F1(String str, JsonToken jsonToken) throws IOException {
        mo23228t1(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{mo23223k1(str), Integer.MIN_VALUE, Integer.MAX_VALUE}), jsonToken, Integer.TYPE);
    }

    /* renamed from: G1 */
    public void mo23216G1() throws IOException {
        mo23217H1(mo13947W());
    }

    /* renamed from: H1 */
    public void mo23217H1(String str) throws IOException {
        mo23218I1(str, mo13965g());
    }

    /* renamed from: I1 */
    public void mo23218I1(String str, JsonToken jsonToken) throws IOException {
        mo23228t1(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{mo23223k1(str), Long.MIN_VALUE, Long.MAX_VALUE}), jsonToken, Long.TYPE);
    }

    /* renamed from: J1 */
    public void mo23219J1(int i, String str) throws JsonParseException {
        String format = String.format("Unexpected character (%s) in numeric value", new Object[]{m22340g1(i)});
        if (str != null) {
            format = format + ": " + str;
        }
        mo23225q1(format);
    }

    /* renamed from: N0 */
    public abstract JsonToken mo13938N0() throws IOException;

    /* renamed from: O0 */
    public JsonToken mo13940O0() throws IOException {
        JsonToken N0 = mo13938N0();
        if (N0 == JsonToken.FIELD_NAME) {
            return mo13938N0();
        }
        return N0;
    }

    /* renamed from: W */
    public abstract String mo13947W() throws IOException;

    /* renamed from: c1 */
    public JsonParser mo13959c1() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken N0 = mo13938N0();
            if (N0 == null) {
                mo20102h1();
                return this;
            } else if (N0.isStructStart()) {
                i++;
            } else if (N0.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (N0 == JsonToken.NOT_AVAILABLE) {
                mo23226r1("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    /* renamed from: d1 */
    public final JsonParseException mo23220d1(String str, Throwable th) {
        return new JsonParseException((JsonParser) this, str, th);
    }

    /* renamed from: e */
    public void mo13962e() {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken != null) {
            this.f15013k = jsonToken;
            this.f15012g = null;
        }
    }

    /* renamed from: f1 */
    public void mo23221f1(String str, g60 g60, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, g60);
        } catch (IllegalArgumentException e) {
            mo23225q1(e.getMessage());
        }
    }

    /* renamed from: g */
    public JsonToken mo13965g() {
        return this.f15012g;
    }

    /* renamed from: g0 */
    public int mo13966g0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return mo13933I();
        }
        return mo13968h0(0);
    }

    /* renamed from: h */
    public int mo13967h() {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.mo14000id();
    }

    /* renamed from: h0 */
    public int mo13968h0(int i) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return mo13933I();
        }
        if (jsonToken == null) {
            return i;
        }
        int id = jsonToken.mo14000id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object A = mo13924A();
                    if (A instanceof Number) {
                        return ((Number) A).intValue();
                    }
                    return i;
                default:
                    return i;
            }
        } else {
            String W = mo13947W();
            if (mo23222j1(W)) {
                return 0;
            }
            return kc4.m20641d(W, i);
        }
    }

    /* renamed from: h1 */
    public abstract void mo20102h1() throws JsonParseException;

    /* renamed from: i0 */
    public long mo13970i0() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return mo13934J();
        }
        return mo13972j0(0);
    }

    /* renamed from: j0 */
    public long mo13972j0(long j) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return mo13934J();
        }
        if (jsonToken == null) {
            return j;
        }
        int id = jsonToken.mo14000id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object A = mo13924A();
                    if (A instanceof Number) {
                        return ((Number) A).longValue();
                    }
                    return j;
                default:
                    return j;
            }
        } else {
            String W = mo13947W();
            if (mo23222j1(W)) {
                return 0;
            }
            return kc4.m20642e(W, j);
        }
    }

    /* renamed from: j1 */
    public boolean mo23222j1(String str) {
        return "null".equals(str);
    }

    /* renamed from: k0 */
    public String mo13974k0() throws IOException {
        return mo13976l0((String) null);
    }

    /* renamed from: k1 */
    public String mo23223k1(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    /* renamed from: l0 */
    public String mo13976l0(String str) throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return mo13947W();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return mo13983s();
        }
        if (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) {
            return str;
        }
        return mo13947W();
    }

    /* renamed from: l1 */
    public String mo23224l1(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    /* renamed from: o0 */
    public boolean mo13979o0() {
        if (this.f15012g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q1 */
    public final void mo23225q1(String str) throws JsonParseException {
        throw mo13953a(str);
    }

    /* renamed from: r1 */
    public final void mo23226r1(String str, Object obj) throws JsonParseException {
        throw mo13953a(String.format(str, new Object[]{obj}));
    }

    /* renamed from: s */
    public abstract String mo13983s() throws IOException;

    /* renamed from: s0 */
    public boolean mo13984s0(JsonToken jsonToken) {
        if (this.f15012g == jsonToken) {
            return true;
        }
        return false;
    }

    /* renamed from: s1 */
    public final void mo23227s1(String str, Object obj, Object obj2) throws JsonParseException {
        throw mo13953a(String.format(str, new Object[]{obj, obj2}));
    }

    /* renamed from: t1 */
    public void mo23228t1(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    /* renamed from: u1 */
    public void mo23229u1() throws JsonParseException {
        mo23230v1(" in " + this.f15012g, this.f15012g);
    }

    /* renamed from: v */
    public JsonToken mo13985v() {
        return this.f15012g;
    }

    /* renamed from: v1 */
    public void mo23230v1(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    /* renamed from: w1 */
    public void mo23231w1(JsonToken jsonToken) throws JsonParseException {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            str = " in a Number value";
        } else {
            str = " in a value";
        }
        mo23230v1(str, jsonToken);
    }

    @Deprecated
    /* renamed from: x */
    public int mo13986x() {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.mo14000id();
    }

    /* renamed from: x0 */
    public boolean mo13987x0(int i) {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == null) {
            if (i == 0) {
                return true;
            }
            return false;
        } else if (jsonToken.mo14000id() == i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: x1 */
    public void mo23232x1(int i) throws JsonParseException {
        mo23233y1(i, "Expected space separating root-level values");
    }

    /* renamed from: y1 */
    public void mo23233y1(int i, String str) throws JsonParseException {
        if (i < 0) {
            mo23229u1();
        }
        String format = String.format("Unexpected character (%s)", new Object[]{m22340g1(i)});
        if (str != null) {
            format = format + ": " + str;
        }
        mo23225q1(format);
    }

    /* renamed from: z1 */
    public final void mo23234z1() {
        c97.m11761c();
    }
}
