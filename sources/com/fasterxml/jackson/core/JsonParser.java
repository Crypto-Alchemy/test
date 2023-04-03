package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonParser implements Closeable {

    /* renamed from: e */
    public static final yz2<StreamReadCapability> f9821e = yz2.m30875a(StreamReadCapability.values());

    /* renamed from: a */
    public int f9822a;

    /* renamed from: d */
    public transient RequestPayload f9823d;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        
        private final boolean _defaultState;
        private final int _mask;

        /* access modifiers changed from: public */
        Feature(boolean z) {
            this._mask = 1 << ordinal();
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            if ((i & this._mask) != 0) {
                return true;
            }
            return false;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser() {
    }

    public JsonParser(int i) {
        this.f9822a = i;
    }

    /* renamed from: A */
    public Object mo13924A() throws IOException {
        return null;
    }

    /* renamed from: A0 */
    public boolean mo13925A0() {
        if (mo13965g() == JsonToken.VALUE_NUMBER_INT) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public boolean mo13926B0() {
        if (mo13965g() == JsonToken.START_ARRAY) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public abstract float mo13927C() throws IOException;

    /* renamed from: C0 */
    public boolean mo13928C0() {
        if (mo13965g() == JsonToken.START_OBJECT) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    public boolean mo13929D0() throws IOException {
        return false;
    }

    /* renamed from: E0 */
    public String mo13930E0() throws IOException {
        if (mo13938N0() == JsonToken.FIELD_NAME) {
            return mo13983s();
        }
        return null;
    }

    /* renamed from: G */
    public Object mo13931G() {
        return null;
    }

    /* renamed from: G0 */
    public String mo13932G0() throws IOException {
        if (mo13938N0() == JsonToken.VALUE_STRING) {
            return mo13947W();
        }
        return null;
    }

    /* renamed from: I */
    public abstract int mo13933I() throws IOException;

    /* renamed from: J */
    public abstract long mo13934J() throws IOException;

    /* renamed from: K */
    public abstract NumberType mo13935K() throws IOException;

    /* renamed from: L */
    public abstract Number mo13936L() throws IOException;

    /* renamed from: N */
    public Number mo13937N() throws IOException {
        return mo13936L();
    }

    /* renamed from: N0 */
    public abstract JsonToken mo13938N0() throws IOException;

    /* renamed from: O */
    public Object mo13939O() throws IOException {
        return null;
    }

    /* renamed from: O0 */
    public abstract JsonToken mo13940O0() throws IOException;

    /* renamed from: P */
    public abstract z63 mo13941P();

    /* renamed from: P0 */
    public JsonParser mo13942P0(int i, int i2) {
        return this;
    }

    /* renamed from: Q */
    public yz2<StreamReadCapability> mo13943Q() {
        return f9821e;
    }

    /* renamed from: Q0 */
    public JsonParser mo13944Q0(int i, int i2) {
        return mo13952Z0((i & i2) | (this.f9822a & (~i2)));
    }

    /* renamed from: S */
    public short mo13945S() throws IOException {
        int I = mo13933I();
        if (I >= -32768 && I <= 32767) {
            return (short) I;
        }
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", new Object[]{mo13947W()}), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
    }

    /* renamed from: S0 */
    public int mo13946S0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        mo13955b();
        return 0;
    }

    /* renamed from: W */
    public abstract String mo13947W() throws IOException;

    /* renamed from: W0 */
    public boolean mo13948W0() {
        return false;
    }

    /* renamed from: X */
    public abstract char[] mo13949X() throws IOException;

    /* renamed from: Y */
    public abstract int mo13950Y() throws IOException;

    /* renamed from: Y0 */
    public void mo13951Y0(Object obj) {
        z63 P = mo13941P();
        if (P != null) {
            P.mo11437i(obj);
        }
    }

    @Deprecated
    /* renamed from: Z0 */
    public JsonParser mo13952Z0(int i) {
        this.f9822a = i;
        return this;
    }

    /* renamed from: a */
    public JsonParseException mo13953a(String str) {
        return new JsonParseException(this, str).withRequestPayload(this.f9823d);
    }

    /* renamed from: a1 */
    public void mo13954a1(d82 d82) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + d82.mo18570a() + "'");
    }

    /* renamed from: b */
    public void mo13955b() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    /* renamed from: b0 */
    public abstract int mo13956b0() throws IOException;

    /* renamed from: c */
    public boolean mo13957c() {
        return false;
    }

    /* renamed from: c0 */
    public abstract JsonLocation mo13958c0();

    /* renamed from: c1 */
    public abstract JsonParser mo13959c1() throws IOException;

    public abstract void close() throws IOException;

    /* renamed from: d */
    public boolean mo13961d() {
        return false;
    }

    /* renamed from: e */
    public abstract void mo13962e();

    /* renamed from: e0 */
    public Object mo13963e0() throws IOException {
        return null;
    }

    /* renamed from: f */
    public String mo13964f() throws IOException {
        return mo13983s();
    }

    /* renamed from: g */
    public JsonToken mo13965g() {
        return mo13985v();
    }

    /* renamed from: g0 */
    public int mo13966g0() throws IOException {
        return mo13968h0(0);
    }

    /* renamed from: h */
    public int mo13967h() {
        return mo13986x();
    }

    /* renamed from: h0 */
    public int mo13968h0(int i) throws IOException {
        return i;
    }

    /* renamed from: i */
    public JsonParser mo13969i(Feature feature) {
        this.f9822a = feature.getMask() | this.f9822a;
        return this;
    }

    /* renamed from: i0 */
    public long mo13970i0() throws IOException {
        return mo13972j0(0);
    }

    /* renamed from: j */
    public abstract BigInteger mo13971j() throws IOException;

    /* renamed from: j0 */
    public long mo13972j0(long j) throws IOException {
        return j;
    }

    /* renamed from: k */
    public byte[] mo13973k() throws IOException {
        return mo13975l(C3514vx.m29159a());
    }

    /* renamed from: k0 */
    public String mo13974k0() throws IOException {
        return mo13976l0((String) null);
    }

    /* renamed from: l */
    public abstract byte[] mo13975l(Base64Variant base64Variant) throws IOException;

    /* renamed from: l0 */
    public abstract String mo13976l0(String str) throws IOException;

    /* renamed from: m */
    public boolean mo13977m() throws IOException {
        JsonToken g = mo13965g();
        if (g == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (g == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, String.format("Current token (%s) not of boolean type", new Object[]{g})).withRequestPayload(this.f9823d);
    }

    /* renamed from: n */
    public byte mo13978n() throws IOException {
        int I = mo13933I();
        if (I >= -128 && I <= 255) {
            return (byte) I;
        }
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", new Object[]{mo13947W()}), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
    }

    /* renamed from: o0 */
    public abstract boolean mo13979o0();

    /* renamed from: p */
    public abstract xe4 mo13980p();

    /* renamed from: q */
    public abstract JsonLocation mo13981q();

    /* renamed from: q0 */
    public abstract boolean mo13982q0();

    /* renamed from: s */
    public abstract String mo13983s() throws IOException;

    /* renamed from: s0 */
    public abstract boolean mo13984s0(JsonToken jsonToken);

    /* renamed from: v */
    public abstract JsonToken mo13985v();

    @Deprecated
    /* renamed from: x */
    public abstract int mo13986x();

    /* renamed from: x0 */
    public abstract boolean mo13987x0(int i);

    /* renamed from: y */
    public abstract BigDecimal mo13988y() throws IOException;

    /* renamed from: y0 */
    public boolean mo13989y0(Feature feature) {
        return feature.enabledIn(this.f9822a);
    }

    /* renamed from: z */
    public abstract double mo13990z() throws IOException;
}
