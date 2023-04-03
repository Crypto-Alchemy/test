package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import p000.C2103cq;

public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements js0 {
    public final bc4 _nuller;
    public final Boolean _unwrapSingle;

    /* renamed from: a */
    public transient Object f9972a;

    @zz2
    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        private static final long serialVersionUID = 1;

        public BooleanDeser() {
            super(boolean[].class);
        }

        public boolean[] _constructEmpty() {
            return new boolean[0];
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return new BooleanDeser(this, bc4, bool);
        }

        public BooleanDeser(BooleanDeser booleanDeser, bc4 bc4, Boolean bool) {
            super(booleanDeser, bc4, bool);
        }

        public boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            boolean z;
            if (!jsonParser.mo13926B0()) {
                return (boolean[]) handleNonArray(jsonParser, deserializationContext);
            }
            C2103cq.C2105b c = deserializationContext.getArrayBuilders().mo18215c();
            boolean[] zArr = (boolean[]) c.mo28578f();
            int i = 0;
            while (true) {
                try {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return (boolean[]) c.mo28577e(zArr, i);
                    }
                    if (N0 == JsonToken.VALUE_TRUE) {
                        z = true;
                    } else {
                        if (N0 != JsonToken.VALUE_FALSE) {
                            if (N0 == JsonToken.VALUE_NULL) {
                                bc4 bc4 = this._nuller;
                                if (bc4 != null) {
                                    bc4.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                }
                            } else {
                                z = _parseBooleanPrimitive(jsonParser, deserializationContext);
                            }
                        }
                        z = false;
                    }
                    if (i >= zArr.length) {
                        boolean[] zArr2 = (boolean[]) c.mo28575c(zArr, i);
                        i = 0;
                        zArr = zArr2;
                    }
                    int i2 = i + 1;
                    try {
                        zArr[i] = z;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) zArr, c.mo28576d() + i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) zArr, c.mo28576d() + i);
                }
            }
        }

        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }
    }

    @zz2
    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        private static final long serialVersionUID = 1;

        public ByteDeser() {
            super(byte[].class);
        }

        public byte[] _constructEmpty() {
            return new byte[0];
        }

        public LogicalType logicalType() {
            return LogicalType.Binary;
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return new ByteDeser(this, bc4, bool);
        }

        public ByteDeser(ByteDeser byteDeser, bc4 bc4, Boolean bool) {
            super(byteDeser, bc4, bool);
        }

        public byte[] _concat(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte b;
            JsonToken g = jsonParser.mo13965g();
            if (g == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.mo13975l(deserializationContext.getBase64Variant());
                } catch (StreamReadException e) {
                    String originalMessage = e.getOriginalMessage();
                    if (originalMessage.contains("base64")) {
                        return (byte[]) deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.mo13947W(), originalMessage, new Object[0]);
                    }
                }
            }
            if (g == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object A = jsonParser.mo13924A();
                if (A == null) {
                    return null;
                }
                if (A instanceof byte[]) {
                    return (byte[]) A;
                }
            }
            if (!jsonParser.mo13926B0()) {
                return (byte[]) handleNonArray(jsonParser, deserializationContext);
            }
            C2103cq.C2106c d = deserializationContext.getArrayBuilders().mo18216d();
            byte[] bArr = (byte[]) d.mo28578f();
            int i = 0;
            while (true) {
                try {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return (byte[]) d.mo28577e(bArr, i);
                    }
                    if (N0 == JsonToken.VALUE_NUMBER_INT) {
                        b = jsonParser.mo13978n();
                    } else if (N0 == JsonToken.VALUE_NULL) {
                        bc4 bc4 = this._nuller;
                        if (bc4 != null) {
                            bc4.getNullValue(deserializationContext);
                        } else {
                            _verifyNullForPrimitive(deserializationContext);
                            b = 0;
                        }
                    } else {
                        b = _parseBytePrimitive(jsonParser, deserializationContext);
                    }
                    if (i >= bArr.length) {
                        byte[] bArr2 = (byte[]) d.mo28575c(bArr, i);
                        i = 0;
                        bArr = bArr2;
                    }
                    int i2 = i + 1;
                    try {
                        bArr[i] = b;
                        i = i2;
                    } catch (Exception e2) {
                        e = e2;
                        i = i2;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) bArr, d.mo28576d() + i);
                    }
                } catch (Exception e3) {
                    e = e3;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) bArr, d.mo28576d() + i);
                }
            }
        }

        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte b;
            JsonToken g = jsonParser.mo13965g();
            if (g == JsonToken.VALUE_NUMBER_INT) {
                b = jsonParser.mo13978n();
            } else if (g == JsonToken.VALUE_NULL) {
                bc4 bc4 = this._nuller;
                if (bc4 != null) {
                    bc4.getNullValue(deserializationContext);
                    return (byte[]) getEmptyValue(deserializationContext);
                }
                _verifyNullForPrimitive(deserializationContext);
                return null;
            } else {
                b = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{b};
        }
    }

    @zz2
    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        private static final long serialVersionUID = 1;

        public CharDeser() {
            super(char[].class);
        }

        public char[] _constructEmpty() {
            return new char[0];
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return this;
        }

        public CharDeser(CharDeser charDeser, bc4 bc4, Boolean bool) {
            super(charDeser, bc4, bool);
        }

        public char[] _concat(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
                char[] X = jsonParser.mo13949X();
                int b0 = jsonParser.mo13956b0();
                int Y = jsonParser.mo13950Y();
                char[] cArr = new char[Y];
                System.arraycopy(X, b0, cArr, 0, Y);
                return cArr;
            } else if (jsonParser.mo13926B0()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return sb.toString().toCharArray();
                    }
                    if (N0 == JsonToken.VALUE_STRING) {
                        str = jsonParser.mo13947W();
                    } else if (N0 == JsonToken.VALUE_NULL) {
                        bc4 bc4 = this._nuller;
                        if (bc4 != null) {
                            bc4.getNullValue(deserializationContext);
                        } else {
                            _verifyNullForPrimitive(deserializationContext);
                            str = "\u0000";
                        }
                    } else {
                        str = ((CharSequence) deserializationContext.handleUnexpectedToken((Class<?>) Character.TYPE, jsonParser)).toString();
                    }
                    if (str.length() != 1) {
                        deserializationContext.reportInputMismatch((o43<?>) this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(str.length()));
                    }
                    sb.append(str.charAt(0));
                }
            } else {
                if (jsonParser.mo13984s0(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object A = jsonParser.mo13924A();
                    if (A == null) {
                        return null;
                    }
                    if (A instanceof char[]) {
                        return (char[]) A;
                    }
                    if (A instanceof String) {
                        return ((String) A).toCharArray();
                    }
                    if (A instanceof byte[]) {
                        return C3514vx.m29159a().encode((byte[]) A, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
        }

        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    @zz2
    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        private static final long serialVersionUID = 1;

        public DoubleDeser() {
            super(double[].class);
        }

        public double[] _constructEmpty() {
            return new double[0];
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return new DoubleDeser(this, bc4, bool);
        }

        public DoubleDeser(DoubleDeser doubleDeser, bc4 bc4, Boolean bool) {
            super(doubleDeser, bc4, bool);
        }

        public double[] _concat(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            bc4 bc4;
            if (!jsonParser.mo13926B0()) {
                return (double[]) handleNonArray(jsonParser, deserializationContext);
            }
            C2103cq.C2107d e = deserializationContext.getArrayBuilders().mo18217e();
            double[] dArr = (double[]) e.mo28578f();
            int i = 0;
            while (true) {
                try {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return (double[]) e.mo28577e(dArr, i);
                    }
                    if (N0 != JsonToken.VALUE_NULL || (bc4 = this._nuller) == null) {
                        double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                        if (i >= dArr.length) {
                            double[] dArr2 = (double[]) e.mo28575c(dArr, i);
                            i = 0;
                            dArr = dArr2;
                        }
                        int i2 = i + 1;
                        try {
                            dArr[i] = _parseDoublePrimitive;
                            i = i2;
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                            throw JsonMappingException.wrapWithPath((Throwable) e, (Object) dArr, e.mo28576d() + i);
                        }
                    } else {
                        bc4.getNullValue(deserializationContext);
                    }
                } catch (Exception e3) {
                    e = e3;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) dArr, e.mo28576d() + i);
                }
            }
        }

        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }
    }

    @zz2
    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        private static final long serialVersionUID = 1;

        public FloatDeser() {
            super(float[].class);
        }

        public float[] _constructEmpty() {
            return new float[0];
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return new FloatDeser(this, bc4, bool);
        }

        public FloatDeser(FloatDeser floatDeser, bc4 bc4, Boolean bool) {
            super(floatDeser, bc4, bool);
        }

        public float[] _concat(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            bc4 bc4;
            if (!jsonParser.mo13926B0()) {
                return (float[]) handleNonArray(jsonParser, deserializationContext);
            }
            C2103cq.C2108e f = deserializationContext.getArrayBuilders().mo18218f();
            float[] fArr = (float[]) f.mo28578f();
            int i = 0;
            while (true) {
                try {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return (float[]) f.mo28577e(fArr, i);
                    }
                    if (N0 != JsonToken.VALUE_NULL || (bc4 = this._nuller) == null) {
                        float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                        if (i >= fArr.length) {
                            float[] fArr2 = (float[]) f.mo28575c(fArr, i);
                            i = 0;
                            fArr = fArr2;
                        }
                        int i2 = i + 1;
                        try {
                            fArr[i] = _parseFloatPrimitive;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            throw JsonMappingException.wrapWithPath((Throwable) e, (Object) fArr, f.mo28576d() + i);
                        }
                    } else {
                        bc4.getNullValue(deserializationContext);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) fArr, f.mo28576d() + i);
                }
            }
        }

        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }
    }

    @zz2
    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser instance = new IntDeser();
        private static final long serialVersionUID = 1;

        public IntDeser() {
            super(int[].class);
        }

        public int[] _constructEmpty() {
            return new int[0];
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return new IntDeser(this, bc4, bool);
        }

        public IntDeser(IntDeser intDeser, bc4 bc4, Boolean bool) {
            super(intDeser, bc4, bool);
        }

        public int[] _concat(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int i;
            if (!jsonParser.mo13926B0()) {
                return (int[]) handleNonArray(jsonParser, deserializationContext);
            }
            C2103cq.C2109f g = deserializationContext.getArrayBuilders().mo18219g();
            int[] iArr = (int[]) g.mo28578f();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return (int[]) g.mo28577e(iArr, i2);
                    }
                    if (N0 == JsonToken.VALUE_NUMBER_INT) {
                        i = jsonParser.mo13933I();
                    } else if (N0 == JsonToken.VALUE_NULL) {
                        bc4 bc4 = this._nuller;
                        if (bc4 != null) {
                            bc4.getNullValue(deserializationContext);
                        } else {
                            _verifyNullForPrimitive(deserializationContext);
                            i = 0;
                        }
                    } else {
                        i = _parseIntPrimitive(jsonParser, deserializationContext);
                    }
                    if (i2 >= iArr.length) {
                        int[] iArr2 = (int[]) g.mo28575c(iArr, i2);
                        i2 = 0;
                        iArr = iArr2;
                    }
                    int i3 = i2 + 1;
                    try {
                        iArr[i2] = i;
                        i2 = i3;
                    } catch (Exception e) {
                        e = e;
                        i2 = i3;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) iArr, g.mo28576d() + i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) iArr, g.mo28576d() + i2);
                }
            }
        }

        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }
    }

    @zz2
    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser instance = new LongDeser();
        private static final long serialVersionUID = 1;

        public LongDeser() {
            super(long[].class);
        }

        public long[] _constructEmpty() {
            return new long[0];
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return new LongDeser(this, bc4, bool);
        }

        public LongDeser(LongDeser longDeser, bc4 bc4, Boolean bool) {
            super(longDeser, bc4, bool);
        }

        public long[] _concat(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            long j;
            if (!jsonParser.mo13926B0()) {
                return (long[]) handleNonArray(jsonParser, deserializationContext);
            }
            C2103cq.C2110g h = deserializationContext.getArrayBuilders().mo18220h();
            long[] jArr = (long[]) h.mo28578f();
            int i = 0;
            while (true) {
                try {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return (long[]) h.mo28577e(jArr, i);
                    }
                    if (N0 == JsonToken.VALUE_NUMBER_INT) {
                        j = jsonParser.mo13934J();
                    } else if (N0 == JsonToken.VALUE_NULL) {
                        bc4 bc4 = this._nuller;
                        if (bc4 != null) {
                            bc4.getNullValue(deserializationContext);
                        } else {
                            _verifyNullForPrimitive(deserializationContext);
                            j = 0;
                        }
                    } else {
                        j = _parseLongPrimitive(jsonParser, deserializationContext);
                    }
                    if (i >= jArr.length) {
                        long[] jArr2 = (long[]) h.mo28575c(jArr, i);
                        i = 0;
                        jArr = jArr2;
                    }
                    int i2 = i + 1;
                    try {
                        jArr[i] = j;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) jArr, h.mo28576d() + i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) jArr, h.mo28576d() + i);
                }
            }
        }

        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }
    }

    @zz2
    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        private static final long serialVersionUID = 1;

        public ShortDeser() {
            super(short[].class);
        }

        public short[] _constructEmpty() {
            return new short[0];
        }

        public PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool) {
            return new ShortDeser(this, bc4, bool);
        }

        public ShortDeser(ShortDeser shortDeser, bc4 bc4, Boolean bool) {
            super(shortDeser, bc4, bool);
        }

        public short[] _concat(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            short s;
            if (!jsonParser.mo13926B0()) {
                return (short[]) handleNonArray(jsonParser, deserializationContext);
            }
            C2103cq.C2111h i = deserializationContext.getArrayBuilders().mo18221i();
            short[] sArr = (short[]) i.mo28578f();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken N0 = jsonParser.mo13938N0();
                    if (N0 == JsonToken.END_ARRAY) {
                        return (short[]) i.mo28577e(sArr, i2);
                    }
                    if (N0 == JsonToken.VALUE_NULL) {
                        bc4 bc4 = this._nuller;
                        if (bc4 != null) {
                            bc4.getNullValue(deserializationContext);
                        } else {
                            _verifyNullForPrimitive(deserializationContext);
                            s = 0;
                        }
                    } else {
                        s = _parseShortPrimitive(jsonParser, deserializationContext);
                    }
                    if (i2 >= sArr.length) {
                        short[] sArr2 = (short[]) i.mo28575c(sArr, i2);
                        i2 = 0;
                        sArr = sArr2;
                    }
                    int i3 = i2 + 1;
                    try {
                        sArr[i2] = s;
                        i2 = i3;
                    } catch (Exception e) {
                        e = e;
                        i2 = i3;
                        throw JsonMappingException.wrapWithPath((Throwable) e, (Object) sArr, i.mo28576d() + i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) sArr, i.mo28576d() + i2);
                }
            }
        }

        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public static o43<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.instance;
        }
        if (cls == Long.TYPE) {
            return LongDeser.instance;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls == Character.TYPE) {
            return new CharDeser();
        }
        throw new IllegalStateException();
    }

    public abstract T _concat(T t, T t2);

    public abstract T _constructEmpty();

    public void _failOnNull(DeserializationContext deserializationContext) throws IOException {
        throw InvalidNullException.from(deserializationContext, (PropertyName) null, deserializationContext.constructType(this._valueClass));
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        bc4 bc4;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls findContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (findContentNullStyle == Nulls.SKIP) {
            bc4 = NullsConstantProvider.skipper();
        } else if (findContentNullStyle != Nulls.FAIL) {
            bc4 = null;
        } else if (beanProperty == null) {
            bc4 = NullsFailProvider.constructForRootValue(deserializationContext.constructType(this._valueClass.getComponentType()));
        } else {
            bc4 = NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
        }
        if (!Objects.equals(findFormatFeature, this._unwrapSingle) || bc4 != this._nuller) {
            return withResolved(bc4, findFormatFeature);
        }
        return this;
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        T deserialize = deserialize(jsonParser, deserializationContext);
        if (t == null || Array.getLength(t) == 0) {
            return deserialize;
        }
        return _concat(t, deserialize);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this.f9972a;
        if (obj != null) {
            return obj;
        }
        Object _constructEmpty = _constructEmpty();
        this.f9972a = _constructEmpty;
        return _constructEmpty;
    }

    public T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        boolean z;
        if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return handleSingleElementUnwrapped(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract PrimitiveArrayDeserializers<?> withResolved(bc4 bc4, Boolean bool);

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, bc4 bc4, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = bc4;
    }
}
