package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class NumberDeserializers {

    /* renamed from: a */
    public static final HashSet<String> f9970a = new HashSet<>();

    @zz2
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        public final LogicalType logicalType() {
            return LogicalType.Float;
        }

        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return (BigDecimal) _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7 || h == 8) {
                    return jsonParser.mo13988y();
                } else {
                    return (BigDecimal) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return (BigDecimal) getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigDecimal) getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_hasTextualNull(trim)) {
                return (BigDecimal) getNullValue(deserializationContext);
            }
            try {
                return new BigDecimal(trim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid representation", new Object[0]);
            }
        }
    }

    @zz2
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            if (jsonParser.mo13925A0()) {
                return jsonParser.mo13971j();
            }
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return (BigInteger) _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h != 8) {
                    return (BigInteger) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                } else {
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    if (_checkFloatToIntCoercion == CoercionAction.AsNull) {
                        return (BigInteger) getNullValue(deserializationContext);
                    }
                    if (_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                        return (BigInteger) getEmptyValue(deserializationContext);
                    }
                    return jsonParser.mo13988y().toBigInteger();
                }
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return (BigInteger) getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigInteger) getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_hasTextualNull(trim)) {
                return (BigInteger) getNullValue(deserializationContext);
            }
            try {
                return new BigInteger(trim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid representation", new Object[0]);
            }
        }
    }

    @zz2
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        public static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        private static final long serialVersionUID = 1;
        public static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, (Boolean) null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken g = jsonParser.mo13965g();
            if (g == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (g == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
            JsonToken g = jsonParser.mo13965g();
            if (g == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (g == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }
    }

    @zz2
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        public static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, (byte) 0);
        private static final long serialVersionUID = 1;
        public static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, (Byte) null);

        public ByteDeserializer(Class<Byte> cls, Byte b) {
            super(cls, LogicalType.Integer, b, (byte) 0);
        }

        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return (Byte) _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 11) {
                    return (Byte) getNullValue(deserializationContext);
                }
                if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7) {
                    return Byte.valueOf(jsonParser.mo13978n());
                } else {
                    if (h != 8) {
                        return (Byte) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    if (_checkFloatToIntCoercion == CoercionAction.AsNull) {
                        return (Byte) getNullValue(deserializationContext);
                    }
                    if (_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                        return (Byte) getEmptyValue(deserializationContext);
                    }
                    return Byte.valueOf(jsonParser.mo13978n());
                }
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return (Byte) getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Byte) getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return (Byte) getNullValue(deserializationContext);
            }
            try {
                int j = kc4.m20647j(trim);
                if (_byteOverflow(j)) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) j);
            } catch (IllegalArgumentException unused) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Byte value", new Object[0]);
            }
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13925A0()) {
                return Byte.valueOf(jsonParser.mo13978n());
            }
            if (this._primitive) {
                return Byte.valueOf(_parseBytePrimitive(jsonParser, deserializationContext));
            }
            return _parseByte(jsonParser, deserializationContext);
        }
    }

    @zz2
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        public static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, 0);
        private static final long serialVersionUID = 1;
        public static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, (Character) null);

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, LogicalType.Integer, ch, 0);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return (Character) _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 11) {
                    if (this._primitive) {
                        _verifyNullForPrimitive(deserializationContext);
                    }
                    return (Character) getNullValue(deserializationContext);
                } else if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h != 7) {
                    return (Character) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                } else {
                    CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.Integer);
                    int i = C2010a.f9971a[findCoercionAction.ordinal()];
                    if (i == 1) {
                        Class<?> cls = this._valueClass;
                        Number L = jsonParser.mo13936L();
                        _checkCoercionFail(deserializationContext, findCoercionAction, cls, L, "Integer value (" + jsonParser.mo13947W() + ")");
                    } else if (i != 2) {
                        if (i == 3) {
                            return (Character) getEmptyValue(deserializationContext);
                        }
                        int I = jsonParser.mo13933I();
                        if (I < 0 || I > 65535) {
                            return (Character) deserializationContext.handleWeirdNumberValue(handledType(), Integer.valueOf(I), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                        }
                        return Character.valueOf((char) I);
                    }
                    return (Character) getNullValue(deserializationContext);
                }
            }
            if (str.length() == 1) {
                return Character.valueOf(str.charAt(0));
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return (Character) getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Character) getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return (Character) getNullValue(deserializationContext);
            }
            return (Character) deserializationContext.handleWeirdStringValue(handledType(), trim, "Expected either Integer value code or 1-character String", new Object[0]);
        }
    }

    @zz2
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        public static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(Utils.DOUBLE_EPSILON));
        private static final long serialVersionUID = 1;
        public static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, (Double) null);

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, LogicalType.Float, d, Double.valueOf(Utils.DOUBLE_EPSILON));
        }

        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return (Double) _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 11) {
                    return (Double) getNullValue(deserializationContext);
                }
                if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7 || h == 8) {
                    return Double.valueOf(jsonParser.mo13990z());
                } else {
                    return (Double) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
            }
            Double _checkDoubleSpecialValue = _checkDoubleSpecialValue(str);
            if (_checkDoubleSpecialValue != null) {
                return _checkDoubleSpecialValue;
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return (Double) getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Double) getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return (Double) getNullValue(deserializationContext);
            }
            try {
                return Double.valueOf(StdDeserializer._parseDouble(trim));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid `Double` value", new Object[0]);
            }
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13984s0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.mo13990z());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return _parseDouble(jsonParser, deserializationContext);
        }

        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
            if (jsonParser.mo13984s0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.mo13990z());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return _parseDouble(jsonParser, deserializationContext);
        }
    }

    @zz2
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        public static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(Utils.FLOAT_EPSILON));
        private static final long serialVersionUID = 1;
        public static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, (Float) null);

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, LogicalType.Float, f, Float.valueOf(Utils.FLOAT_EPSILON));
        }

        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return (Float) _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 11) {
                    return (Float) getNullValue(deserializationContext);
                }
                if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7 || h == 8) {
                    return Float.valueOf(jsonParser.mo13927C());
                } else {
                    return (Float) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
            }
            Float _checkFloatSpecialValue = _checkFloatSpecialValue(str);
            if (_checkFloatSpecialValue != null) {
                return _checkFloatSpecialValue;
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return (Float) getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Float) getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return (Float) getNullValue(deserializationContext);
            }
            try {
                return Float.valueOf(Float.parseFloat(trim));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid `Float` value", new Object[0]);
            }
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13984s0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.mo13927C());
            }
            if (this._primitive) {
                return Float.valueOf(_parseFloatPrimitive(jsonParser, deserializationContext));
            }
            return _parseFloat(jsonParser, deserializationContext);
        }
    }

    @zz2
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        public static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, 0);
        private static final long serialVersionUID = 1;
        public static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, (Integer) null);

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public boolean isCachable() {
            return true;
        }

        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13925A0()) {
                return Integer.valueOf(jsonParser.mo13933I());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
            if (jsonParser.mo13925A0()) {
                return Integer.valueOf(jsonParser.mo13933I());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }
    }

    @zz2
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        public static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, 0L);
        private static final long serialVersionUID = 1;
        public static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, (Long) null);

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, LogicalType.Integer, l, 0L);
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public boolean isCachable() {
            return true;
        }

        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13925A0()) {
                return Long.valueOf(jsonParser.mo13934J());
            }
            if (this._primitive) {
                return Long.valueOf(_parseLongPrimitive(jsonParser, deserializationContext));
            }
            return _parseLong(jsonParser, deserializationContext, Long.class);
        }
    }

    @zz2
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h != 7) {
                    if (h != 8) {
                        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.mo13929D0()) {
                        return jsonParser.mo13936L();
                    }
                    return jsonParser.mo13988y();
                } else if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                } else {
                    return jsonParser.mo13936L();
                }
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_hasTextualNull(trim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(trim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(trim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(trim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                if (!_isIntNumber(trim)) {
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return new BigDecimal(trim);
                    }
                    return Double.valueOf(trim);
                } else if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return new BigInteger(trim);
                } else {
                    long parseLong = Long.parseLong(trim);
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) || parseLong > 2147483647L || parseLong < -2147483648L) {
                        return Long.valueOf(parseLong);
                    }
                    return Integer.valueOf((int) parseLong);
                }
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid number", new Object[0]);
            }
        }

        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
            int h = jsonParser.mo13967h();
            if (h == 6 || h == 7 || h == 8) {
                return deserialize(jsonParser, deserializationContext);
            }
            return j07.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }

        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }
    }

    @zz2
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        public static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, 0);
        private static final long serialVersionUID = 1;
        public static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, (Short) null);

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, LogicalType.Integer, sh, (short) 0);
        }

        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str;
            int h = jsonParser.mo13967h();
            if (h == 1) {
                str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else if (h == 3) {
                return (Short) _deserializeFromArray(jsonParser, deserializationContext);
            } else {
                if (h == 11) {
                    return (Short) getNullValue(deserializationContext);
                }
                if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7) {
                    return Short.valueOf(jsonParser.mo13945S());
                } else {
                    if (h != 8) {
                        return (Short) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                    if (_checkFloatToIntCoercion == CoercionAction.AsNull) {
                        return (Short) getNullValue(deserializationContext);
                    }
                    if (_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                        return (Short) getEmptyValue(deserializationContext);
                    }
                    return Short.valueOf(jsonParser.mo13945S());
                }
            }
            CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
            if (_checkFromStringCoercion == CoercionAction.AsNull) {
                return (Short) getNullValue(deserializationContext);
            }
            if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Short) getEmptyValue(deserializationContext);
            }
            String trim = str.trim();
            if (_checkTextualNull(deserializationContext, trim)) {
                return (Short) getNullValue(deserializationContext);
            }
            try {
                int j = kc4.m20647j(trim);
                if (_shortOverflow(j)) {
                    return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) j);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid Short value", new Object[0]);
            }
        }

        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.mo13925A0()) {
                return Short.valueOf(jsonParser.mo13945S());
            }
            if (this._primitive) {
                return Short.valueOf(_parseShortPrimitive(jsonParser, deserializationContext));
            }
            return _parseShort(jsonParser, deserializationContext);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$a */
    public static /* synthetic */ class C2010a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9971a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.CoercionAction[] r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9971a = r0
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.Fail     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9971a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9971a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers.C2010a.<clinit>():void");
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            f9970a.add(clsArr[i].getName());
        }
    }

    /* renamed from: a */
    public static o43<?> m14108a(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
            if (cls == Void.TYPE) {
                return NullifyingDeserializer.instance;
            }
        } else if (!f9970a.contains(str)) {
            return null;
        } else {
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        public final T _emptyValue;
        public final LogicalType _logicalType;
        public final T _nullValue;
        public final boolean _primitive;

        public PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t, T t2) {
            super((Class<?>) cls);
            this._logicalType = logicalType;
            this._nullValue = t;
            this._emptyValue = t2;
            this._primitive = cls.isPrimitive();
        }

        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        public AccessPattern getNullAccessPattern() {
            if (this._primitive) {
                return AccessPattern.DYNAMIC;
            }
            if (this._nullValue == null) {
                return AccessPattern.ALWAYS_NULL;
            }
            return AccessPattern.CONSTANT;
        }

        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch((o43<?>) this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", wf0.m29514h(handledType()));
            }
            return this._nullValue;
        }

        public final LogicalType logicalType() {
            return this._logicalType;
        }

        @Deprecated
        public PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            this(cls, LogicalType.OtherScalar, t, t2);
        }
    }
}
