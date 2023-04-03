package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p009io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class JsonGenerator implements Closeable, Flushable {

    /* renamed from: d */
    public static final yz2<StreamWriteCapability> f9814d;

    /* renamed from: e */
    public static final yz2<StreamWriteCapability> f9815e;

    /* renamed from: g */
    public static final yz2<StreamWriteCapability> f9816g;

    /* renamed from: a */
    public su4 f9817a;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        private final boolean _defaultState;
        private final int _mask;

        /* access modifiers changed from: public */
        Feature(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
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

    /* renamed from: com.fasterxml.jackson.core.JsonGenerator$a */
    public static /* synthetic */ class C1976a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9819a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion[] r0 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9819a = r0
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PARENT_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9819a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.PAYLOAD_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9819a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.METADATA_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9819a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9819a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.type.WritableTypeId$Inclusion r1 = com.fasterxml.jackson.core.type.WritableTypeId.Inclusion.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonGenerator.C1976a.<clinit>():void");
        }
    }

    static {
        yz2<StreamWriteCapability> a = yz2.m30875a(StreamWriteCapability.values());
        f9814d = a;
        f9815e = a.mo28277c(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        f9816g = a.mo28277c(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    /* renamed from: A */
    public void mo13832A(d82 d82) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", new Object[]{getClass().getName(), d82.mo18570a()}));
    }

    /* renamed from: A0 */
    public void mo13833A0(qw5 qw5) throws IOException {
        mo13834B0(qw5.getValue());
    }

    /* renamed from: B0 */
    public abstract void mo13834B0(String str) throws IOException;

    /* renamed from: C */
    public void mo13835C(double[] dArr, int i, int i2) throws IOException {
        if (dArr != null) {
            mo13865c(dArr.length, i, i2);
            mo13850P0(dArr, i2);
            int i3 = i2 + i;
            while (i < i3) {
                mo13872e0(dArr[i]);
                i++;
            }
            mo13853S();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    /* renamed from: C0 */
    public abstract void mo13836C0(char[] cArr, int i, int i2) throws IOException;

    /* renamed from: D0 */
    public void mo13837D0(qw5 qw5) throws IOException {
        mo13838E0(qw5.getValue());
    }

    /* renamed from: E0 */
    public abstract void mo13838E0(String str) throws IOException;

    /* renamed from: G */
    public void mo13839G(int[] iArr, int i, int i2) throws IOException {
        if (iArr != null) {
            mo13865c(iArr.length, i, i2);
            mo13850P0(iArr, i2);
            int i3 = i2 + i;
            while (i < i3) {
                mo13880h0(iArr[i]);
                i++;
            }
            mo13853S();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    /* renamed from: G0 */
    public abstract void mo13840G0() throws IOException;

    /* renamed from: I */
    public void mo13841I(long[] jArr, int i, int i2) throws IOException {
        if (jArr != null) {
            mo13865c(jArr.length, i, i2);
            mo13850P0(jArr, i2);
            int i3 = i2 + i;
            while (i < i3) {
                mo13882i0(jArr[i]);
                i++;
            }
            mo13853S();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    /* renamed from: J */
    public abstract int mo13842J(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException;

    /* renamed from: K */
    public int mo13843K(InputStream inputStream, int i) throws IOException {
        return mo13842J(C3514vx.m29159a(), inputStream, i);
    }

    /* renamed from: L */
    public abstract void mo13844L(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: N */
    public void mo13845N(byte[] bArr) throws IOException {
        mo13844L(C3514vx.m29159a(), bArr, 0, bArr.length);
    }

    @Deprecated
    /* renamed from: N0 */
    public void mo13846N0(int i) throws IOException {
        mo13840G0();
    }

    /* renamed from: O */
    public void mo13847O(byte[] bArr, int i, int i2) throws IOException {
        mo13844L(C3514vx.m29159a(), bArr, i, i2);
    }

    /* renamed from: O0 */
    public void mo13848O0(Object obj) throws IOException {
        mo13840G0();
        mo13895s(obj);
    }

    /* renamed from: P */
    public abstract void mo13849P(boolean z) throws IOException;

    /* renamed from: P0 */
    public void mo13850P0(Object obj, int i) throws IOException {
        mo13846N0(i);
        mo13895s(obj);
    }

    /* renamed from: Q */
    public void mo13851Q(Object obj) throws IOException {
        if (obj == null) {
            mo13866c0();
        } else if (obj instanceof byte[]) {
            mo13845N((byte[]) obj);
        } else {
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    /* renamed from: Q0 */
    public abstract void mo13852Q0() throws IOException;

    /* renamed from: S */
    public abstract void mo13853S() throws IOException;

    /* renamed from: S0 */
    public void mo13854S0(Object obj) throws IOException {
        mo13852Q0();
        mo13895s(obj);
    }

    /* renamed from: W */
    public abstract void mo13855W() throws IOException;

    /* renamed from: W0 */
    public void mo13856W0(Object obj, int i) throws IOException {
        mo13852Q0();
        mo13895s(obj);
    }

    /* renamed from: X */
    public void mo13857X(long j) throws IOException {
        mo13864b0(Long.toString(j));
    }

    /* renamed from: Y */
    public abstract void mo13858Y(qw5 qw5) throws IOException;

    /* renamed from: Y0 */
    public abstract void mo13859Y0(qw5 qw5) throws IOException;

    /* renamed from: Z0 */
    public abstract void mo13860Z0(String str) throws IOException;

    /* renamed from: a */
    public void mo13861a(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    /* renamed from: a1 */
    public abstract void mo13862a1(char[] cArr, int i, int i2) throws IOException;

    /* renamed from: b */
    public final void mo13863b() {
        c97.m11761c();
    }

    /* renamed from: b0 */
    public abstract void mo13864b0(String str) throws IOException;

    /* renamed from: c */
    public final void mo13865c(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)}));
        }
    }

    /* renamed from: c0 */
    public abstract void mo13866c0() throws IOException;

    /* renamed from: c1 */
    public void mo13867c1(String str, String str2) throws IOException {
        mo13864b0(str);
        mo13860Z0(str2);
    }

    public abstract void close() throws IOException;

    /* renamed from: d */
    public void mo13869d(Object obj) throws IOException {
        if (obj == null) {
            mo13866c0();
        } else if (obj instanceof String) {
            mo13860Z0((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    mo13880h0(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    mo13882i0(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    mo13872e0(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    mo13877g0(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    mo13891o0(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    mo13891o0((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    mo13888l0((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    mo13886k0((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    mo13880h0(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    mo13882i0(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                mo13845N((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                mo13849P(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                mo13849P(((AtomicBoolean) obj).get());
                return;
            }
            throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
        }
    }

    /* renamed from: d1 */
    public void mo13870d1(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    /* renamed from: e */
    public boolean mo13871e() {
        return true;
    }

    /* renamed from: e0 */
    public abstract void mo13872e0(double d) throws IOException;

    /* renamed from: f */
    public boolean mo13873f() {
        return false;
    }

    /* renamed from: f1 */
    public WritableTypeId mo13874f1(WritableTypeId writableTypeId) throws IOException {
        String str;
        Object obj = writableTypeId.f9861c;
        JsonToken jsonToken = writableTypeId.f9864f;
        if (mo13879h()) {
            writableTypeId.f9865g = false;
            mo13870d1(obj);
        } else {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = String.valueOf(obj);
            }
            writableTypeId.f9865g = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.f9863e;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.f9863e = inclusion;
            }
            int i = C1976a.f9819a[inclusion.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    mo13854S0(writableTypeId.f9859a);
                    mo13867c1(writableTypeId.f9862d, str);
                    return writableTypeId;
                } else if (i != 4) {
                    mo13840G0();
                    mo13860Z0(str);
                } else {
                    mo13852Q0();
                    mo13864b0(str);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            mo13854S0(writableTypeId.f9859a);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            mo13840G0();
        }
        return writableTypeId;
    }

    public abstract void flush() throws IOException;

    /* renamed from: g */
    public boolean mo13876g() {
        return false;
    }

    /* renamed from: g0 */
    public abstract void mo13877g0(float f) throws IOException;

    /* renamed from: g1 */
    public WritableTypeId mo13878g1(WritableTypeId writableTypeId) throws IOException {
        String str;
        JsonToken jsonToken = writableTypeId.f9864f;
        if (jsonToken == JsonToken.START_OBJECT) {
            mo13855W();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            mo13853S();
        }
        if (writableTypeId.f9865g) {
            int i = C1976a.f9819a[writableTypeId.f9863e.ordinal()];
            if (i == 1) {
                Object obj = writableTypeId.f9861c;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = String.valueOf(obj);
                }
                mo13867c1(writableTypeId.f9862d, str);
            } else if (!(i == 2 || i == 3)) {
                if (i != 5) {
                    mo13855W();
                } else {
                    mo13853S();
                }
            }
        }
        return writableTypeId;
    }

    /* renamed from: h */
    public boolean mo13879h() {
        return false;
    }

    /* renamed from: h0 */
    public abstract void mo13880h0(int i) throws IOException;

    /* renamed from: i */
    public abstract JsonGenerator mo13881i(Feature feature);

    /* renamed from: i0 */
    public abstract void mo13882i0(long j) throws IOException;

    /* renamed from: j */
    public abstract int mo13883j();

    /* renamed from: j0 */
    public abstract void mo13884j0(String str) throws IOException;

    /* renamed from: k */
    public abstract z63 mo13885k();

    /* renamed from: k0 */
    public abstract void mo13886k0(BigDecimal bigDecimal) throws IOException;

    /* renamed from: l */
    public su4 mo13887l() {
        return this.f9817a;
    }

    /* renamed from: l0 */
    public abstract void mo13888l0(BigInteger bigInteger) throws IOException;

    /* renamed from: m */
    public abstract boolean mo13889m(Feature feature);

    /* renamed from: n */
    public JsonGenerator mo13890n(int i, int i2) {
        return this;
    }

    /* renamed from: o0 */
    public void mo13891o0(short s) throws IOException {
        mo13880h0(s);
    }

    /* renamed from: p */
    public JsonGenerator mo13892p(int i, int i2) {
        return mo13897v((i & i2) | (mo13883j() & (~i2)));
    }

    /* renamed from: q */
    public JsonGenerator mo13893q(CharacterEscapes characterEscapes) {
        return this;
    }

    /* renamed from: q0 */
    public void mo13894q0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    /* renamed from: s */
    public void mo13895s(Object obj) {
        z63 k = mo13885k();
        if (k != null) {
            k.mo11437i(obj);
        }
    }

    /* renamed from: s0 */
    public void mo13896s0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    @Deprecated
    /* renamed from: v */
    public abstract JsonGenerator mo13897v(int i);

    public abstract void writeObject(Object obj) throws IOException;

    /* renamed from: x */
    public abstract JsonGenerator mo13899x(int i);

    /* renamed from: x0 */
    public void mo13900x0(String str) throws IOException {
    }

    /* renamed from: y */
    public JsonGenerator mo13901y(su4 su4) {
        this.f9817a = su4;
        return this;
    }

    /* renamed from: y0 */
    public abstract void mo13902y0(char c) throws IOException;

    /* renamed from: z */
    public JsonGenerator mo13903z(qw5 qw5) {
        throw new UnsupportedOperationException();
    }
}
