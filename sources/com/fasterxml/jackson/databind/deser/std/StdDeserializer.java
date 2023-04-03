package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public abstract class StdDeserializer<T> extends o43<T> implements Serializable {
    @Deprecated
    public static final int F_MASK_ACCEPT_ARRAYS = (DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask());
    public static final int F_MASK_INT_COERCIONS = (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask());
    private static final long serialVersionUID = 1;
    public final Class<?> _valueClass;
    public final JavaType _valueType;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.StdDeserializer$a */
    public static /* synthetic */ class C2011a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9973a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.CoercionAction[] r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9973a = r0
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9973a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9973a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.TryConvert     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9973a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.Fail     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.C2011a.<clinit>():void");
        }
    }

    public StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    public static final boolean _isBlank(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final double _parseDouble(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    public final boolean _byteOverflow(int i) {
        return i < -128 || i > 255;
    }

    public CoercionAction _checkCoercionFail(DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, Object obj, String str) throws IOException {
        if (coercionAction == CoercionAction.Fail) {
            deserializationContext.reportBadCoercion(this, cls, obj, "Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, _coercedTypeDesc());
        }
        return coercionAction;
    }

    public Double _checkDoubleSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && _isNaN(str)) {
                    return Double.valueOf(Double.NaN);
                }
                return null;
            } else if (_isPosInf(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            } else {
                return null;
            }
        } else if (_isNegInf(str)) {
            return Double.valueOf(Double.NEGATIVE_INFINITY);
        } else {
            return null;
        }
    }

    public Float _checkFloatSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && _isNaN(str)) {
                    return Float.valueOf(Float.NaN);
                }
                return null;
            } else if (_isPosInf(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            } else {
                return null;
            }
        } else if (_isNegInf(str)) {
            return Float.valueOf(Float.NEGATIVE_INFINITY);
        } else {
            return null;
        }
    }

    public CoercionAction _checkFloatToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(LogicalType.Integer, cls, CoercionInputShape.Float);
        if (findCoercionAction != CoercionAction.Fail) {
            return findCoercionAction;
        }
        Number L = jsonParser.mo13936L();
        return _checkCoercionFail(deserializationContext, findCoercionAction, cls, L, "Floating-point value (" + jsonParser.mo13947W() + ")");
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str) throws IOException {
        return _checkFromStringCoercion(deserializationContext, str, logicalType(), handledType());
    }

    public boolean _checkTextualNull(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        if (!_hasTextualNull(str)) {
            return false;
        }
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            _reportFailedNullCoerce(deserializationContext, true, mapperFeature, "String \"null\"");
        }
        return true;
    }

    public Boolean _coerceBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(LogicalType.Boolean, cls, CoercionInputShape.Integer);
        int i = C2011a.f9973a[findCoercionAction.ordinal()];
        boolean z = true;
        if (i == 1) {
            return Boolean.FALSE;
        }
        if (i == 2) {
            return null;
        }
        if (i == 4) {
            Number L = jsonParser.mo13936L();
            _checkCoercionFail(deserializationContext, findCoercionAction, cls, L, "Integer value (" + jsonParser.mo13947W() + ")");
            return Boolean.FALSE;
        } else if (jsonParser.mo13935K() != JsonParser.NumberType.INT) {
            return Boolean.valueOf(!"0".equals(jsonParser.mo13947W()));
        } else {
            if (jsonParser.mo13933I() == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.fasterxml.jackson.databind.DeserializationFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX WARNING: Multi-variable type inference failed */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _coerceEmptyString(com.fasterxml.jackson.databind.DeserializationContext r3, boolean r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r3.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r0)
            if (r1 != 0) goto L_0x000a
            r4 = 1
            goto L_0x0015
        L_0x000a:
            if (r4 == 0) goto L_0x001c
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r4 = r3.isEnabled((com.fasterxml.jackson.databind.DeserializationFeature) r0)
            if (r4 == 0) goto L_0x001c
            r4 = 0
        L_0x0015:
            java.lang.String r1 = "empty String (\"\")"
            r2._reportFailedNullCoerce(r3, r4, r0, r1)
            r3 = 0
            return r3
        L_0x001c:
            java.lang.Object r3 = r2.getNullValue(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString(com.fasterxml.jackson.databind.DeserializationContext, boolean):java.lang.Object");
    }

    public Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
            return jsonParser.mo13971j();
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS)) {
            return Long.valueOf(jsonParser.mo13934J());
        }
        return jsonParser.mo13936L();
    }

    @Deprecated
    public Object _coerceNullToken(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        if (z) {
            _verifyNullForPrimitive(deserializationContext);
        }
        return getNullValue(deserializationContext);
    }

    @Deprecated
    public Object _coerceTextualNull(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            _reportFailedNullCoerce(deserializationContext, true, mapperFeature, "String \"null\"");
        }
        return getNullValue(deserializationContext);
    }

    public String _coercedTypeDesc() {
        String str;
        JavaType valueType = getValueType();
        boolean z = false;
        if (valueType == null || valueType.isPrimitive()) {
            Class<?> handledType = handledType();
            if (handledType.isArray() || Collection.class.isAssignableFrom(handledType) || Map.class.isAssignableFrom(handledType)) {
                z = true;
            }
            str = wf0.m29539y(handledType);
        } else {
            if (valueType.isContainerType() || valueType.isReferenceType()) {
                z = true;
            }
            str = wf0.m29480G(valueType);
        }
        if (z) {
            return "element of " + str;
        }
        return str + " value";
    }

    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction _findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean isEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (isEnabled || _findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken N0 = jsonParser.mo13938N0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (N0 == jsonToken) {
                int i = C2011a.f9973a[_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return getNullValue(deserializationContext);
                }
            } else if (isEnabled) {
                T _deserializeWrappedValue = _deserializeWrappedValue(jsonParser, deserializationContext);
                if (jsonParser.mo13938N0() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return _deserializeWrappedValue;
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    @Deprecated
    public T _deserializeFromEmpty(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo13984s0(JsonToken.START_ARRAY) || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
            return null;
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    public Object _deserializeFromEmptyString(JsonParser jsonParser, DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, String str) throws IOException {
        int i = C2011a.f9973a[coercionAction.ordinal()];
        if (i == 1) {
            return getEmptyValue(deserializationContext);
        }
        if (i != 4) {
            return null;
        }
        _checkCoercionFail(deserializationContext, coercionAction, cls, "", "empty String (\"\")");
        return null;
    }

    public T _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        Class<?> handledType = handledType();
        String k0 = jsonParser.mo13974k0();
        if (valueInstantiator != null && valueInstantiator.canCreateFromString()) {
            return valueInstantiator.createFromString(deserializationContext, k0);
        }
        if (k0.isEmpty()) {
            return _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionAction(logicalType(), handledType, CoercionInputShape.EmptyString), handledType, "empty String (\"\")");
        } else if (_isBlank(k0)) {
            return _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType(), handledType, CoercionAction.Fail), handledType, "blank String (all whitespace)");
        } else {
            if (valueInstantiator != null) {
                k0 = k0.trim();
                if (valueInstantiator.canCreateFromInt() && deserializationContext.findCoercionAction(LogicalType.Integer, Integer.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                    return valueInstantiator.createFromInt(deserializationContext, _parseIntPrimitive(deserializationContext, k0));
                }
                if (valueInstantiator.canCreateFromLong() && deserializationContext.findCoercionAction(LogicalType.Integer, Long.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                    return valueInstantiator.createFromLong(deserializationContext, _parseLongPrimitive(deserializationContext, k0));
                }
                if (valueInstantiator.canCreateFromBoolean() && deserializationContext.findCoercionAction(LogicalType.Boolean, Boolean.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                    String trim = k0.trim();
                    if ("true".equals(trim)) {
                        return valueInstantiator.createFromBoolean(deserializationContext, true);
                    }
                    if ("false".equals(trim)) {
                        return valueInstantiator.createFromBoolean(deserializationContext, false);
                    }
                }
            }
            return deserializationContext.handleMissingInstantiator(handledType, valueInstantiator, deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", k0);
        }
    }

    public T _deserializeWrappedValue(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonToken = JsonToken.START_ARRAY;
        if (!jsonParser.mo13984s0(jsonToken)) {
            return deserialize(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.mo13965g(), jsonParser, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", new Object[]{wf0.m29497X(this._valueClass), jsonToken, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"}), new Object[0]);
    }

    @Deprecated
    public void _failDoubleToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        deserializationContext.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", jsonParser.mo13974k0(), str);
    }

    public CoercionAction _findCoercionFromBlankString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionFromBlankString(logicalType(), handledType(), CoercionAction.Fail);
    }

    public CoercionAction _findCoercionFromEmptyArray(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyArray);
    }

    public CoercionAction _findCoercionFromEmptyString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [o43<?>, o43] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.bc4 _findNullProvider(com.fasterxml.jackson.databind.DeserializationContext r3, com.fasterxml.jackson.databind.BeanProperty r4, com.fasterxml.jackson.annotation.Nulls r5, p000.o43<?> r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            com.fasterxml.jackson.annotation.Nulls r0 = com.fasterxml.jackson.annotation.Nulls.FAIL
            if (r5 != r0) goto L_0x001d
            if (r4 != 0) goto L_0x0018
            if (r6 != 0) goto L_0x000b
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            goto L_0x000f
        L_0x000b:
            java.lang.Class r4 = r6.handledType()
        L_0x000f:
            com.fasterxml.jackson.databind.JavaType r3 = r3.constructType(r4)
            com.fasterxml.jackson.databind.deser.impl.NullsFailProvider r3 = com.fasterxml.jackson.databind.deser.impl.NullsFailProvider.constructForRootValue(r3)
            return r3
        L_0x0018:
            com.fasterxml.jackson.databind.deser.impl.NullsFailProvider r3 = com.fasterxml.jackson.databind.deser.impl.NullsFailProvider.constructForProperty(r4)
            return r3
        L_0x001d:
            com.fasterxml.jackson.annotation.Nulls r0 = com.fasterxml.jackson.annotation.Nulls.AS_EMPTY
            r1 = 0
            if (r5 != r0) goto L_0x0074
            if (r6 != 0) goto L_0x0025
            return r1
        L_0x0025:
            boolean r5 = r6 instanceof com.fasterxml.jackson.databind.deser.BeanDeserializerBase
            if (r5 == 0) goto L_0x0054
            r5 = r6
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase r5 = (com.fasterxml.jackson.databind.deser.BeanDeserializerBase) r5
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5.getValueInstantiator()
            boolean r0 = r0.canCreateUsingDefault()
            if (r0 != 0) goto L_0x0054
            if (r4 != 0) goto L_0x003d
            com.fasterxml.jackson.databind.JavaType r4 = r5.getValueType()
            goto L_0x0041
        L_0x003d:
            com.fasterxml.jackson.databind.JavaType r4 = r4.getType()
        L_0x0041:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r4
            java.lang.String r6 = "Cannot create empty instance of %s, no default Creator"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Object r3 = r3.reportBadDefinition(r4, r5)
            bc4 r3 = (p000.bc4) r3
            return r3
        L_0x0054:
            com.fasterxml.jackson.databind.util.AccessPattern r4 = r6.getEmptyAccessPattern()
            com.fasterxml.jackson.databind.util.AccessPattern r5 = com.fasterxml.jackson.databind.util.AccessPattern.ALWAYS_NULL
            if (r4 != r5) goto L_0x0061
            com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider r3 = com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider.nuller()
            return r3
        L_0x0061:
            com.fasterxml.jackson.databind.util.AccessPattern r5 = com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT
            if (r4 != r5) goto L_0x006e
            java.lang.Object r3 = r6.getEmptyValue(r3)
            com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider r3 = com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider.forValue(r3)
            return r3
        L_0x006e:
            com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider r3 = new com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider
            r3.<init>(r6)
            return r3
        L_0x0074:
            com.fasterxml.jackson.annotation.Nulls r3 = com.fasterxml.jackson.annotation.Nulls.SKIP
            if (r5 != r3) goto L_0x007d
            com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider r3 = com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider.skipper()
            return r3
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._findNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.annotation.Nulls, o43):bc4");
    }

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public final boolean _intOverflow(long j) {
        return j < -2147483648L || j > 2147483647L;
    }

    @Deprecated
    public boolean _isEmptyOrTextualNull(String str) {
        if (str.isEmpty() || "null".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean _isFalse(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'f') {
            return "false".equals(str);
        }
        if (charAt != 'F') {
            return false;
        }
        if ("FALSE".equals(str) || "False".equals(str)) {
            return true;
        }
        return false;
    }

    public final boolean _isIntNumber(String str) {
        int i;
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '-' && charAt != '+') {
            i = 0;
        } else if (length == 1) {
            return false;
        } else {
            i = 1;
        }
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                return false;
            }
            i++;
        }
        return true;
    }

    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    public final boolean _isNegInf(String str) {
        if ("-Infinity".equals(str) || "-INF".equals(str)) {
            return true;
        }
        return false;
    }

    public final boolean _isPosInf(String str) {
        if ("Infinity".equals(str) || "INF".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean _isTrue(String str) {
        char charAt = str.charAt(0);
        if (charAt == 't') {
            return "true".equals(str);
        }
        if (charAt != 'T') {
            return false;
        }
        if ("TRUE".equals(str) || "True".equals(str)) {
            return true;
        }
        return false;
    }

    public Number _nonNullNumber(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h == 1) {
            str = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else if (h == 3) {
            return (Boolean) _deserializeFromArray(jsonParser, deserializationContext);
        } else {
            if (h == 6) {
                str = jsonParser.mo13947W();
            } else if (h == 7) {
                return _coerceBooleanFromInt(jsonParser, deserializationContext, cls);
            } else {
                switch (h) {
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    default:
                        return (Boolean) deserializationContext.handleUnexpectedToken(cls, jsonParser);
                }
            }
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str, LogicalType.Boolean, cls);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            return null;
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return Boolean.FALSE;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length == 4) {
            if (_isTrue(trim)) {
                return Boolean.TRUE;
            }
        } else if (length == 5 && _isFalse(trim)) {
            return Boolean.FALSE;
        }
        if (_checkTextualNull(deserializationContext, trim)) {
            return null;
        }
        return (Boolean) deserializationContext.handleWeirdStringValue(cls, trim, "only \"true\" or \"false\" recognized", new Object[0]);
    }

    @Deprecated
    public boolean _parseBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
        return !"0".equals(jsonParser.mo13947W());
    }

    @Deprecated
    public final boolean _parseBooleanPrimitive(DeserializationContext deserializationContext, JsonParser jsonParser, Class<?> cls) throws IOException {
        return _parseBooleanPrimitive(jsonParser, deserializationContext);
    }

    public final byte _parseBytePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h != 1) {
            if (h != 3) {
                if (h == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0;
                } else if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7) {
                    return jsonParser.mo13978n();
                } else {
                    if (h == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Byte.TYPE);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.mo13978n();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.mo13938N0();
                byte _parseBytePrimitive = _parseBytePrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseBytePrimitive;
            }
            return ((Byte) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(Byte.TYPE), jsonParser)).byteValue();
        }
        str = deserializationContext.extractScalarFromObject(jsonParser, this, Byte.TYPE);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str, LogicalType.Integer, Byte.TYPE);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0;
        } else if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0;
        } else {
            String trim = str.trim();
            if (_hasTextualNull(trim)) {
                _verifyNullForPrimitiveCoercion(deserializationContext, trim);
                return 0;
            }
            try {
                int j = kc4.m20647j(trim);
                if (_byteOverflow(j)) {
                    return ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue();
                }
                return (byte) j;
            } catch (IllegalArgumentException unused) {
                return ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, trim, "not a valid `byte` value", new Object[0])).byteValue();
            }
        }
    }

    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        long j;
        int h = jsonParser.mo13967h();
        if (h == 1) {
            str = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        } else if (h == 3) {
            return _parseDateFromArray(jsonParser, deserializationContext);
        } else {
            if (h == 11) {
                return (Date) getNullValue(deserializationContext);
            }
            if (h == 6) {
                str = jsonParser.mo13947W();
            } else if (h != 7) {
                return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            } else {
                try {
                    j = jsonParser.mo13934J();
                } catch (StreamReadException unused) {
                    j = ((Number) deserializationContext.handleWeirdNumberValue(this._valueClass, jsonParser.mo13936L(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0])).longValue();
                }
                return new Date(j);
            }
        }
        return _parseDate(str.trim(), deserializationContext);
    }

    public Date _parseDateFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction _findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean isEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (isEnabled || _findCoercionFromEmptyArray != CoercionAction.Fail) {
            if (jsonParser.mo13938N0() == JsonToken.END_ARRAY) {
                int i = C2011a.f9973a[_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return (Date) getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return (Date) getNullValue(deserializationContext);
                }
            } else if (isEnabled) {
                Date _parseDate = _parseDate(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseDate;
            }
        }
        return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h != 1) {
            if (h != 3) {
                if (h == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return Utils.DOUBLE_EPSILON;
                } else if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7 || h == 8) {
                    return jsonParser.mo13990z();
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.mo13938N0();
                double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseDoublePrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken((Class<?>) Double.TYPE, jsonParser)).doubleValue();
        }
        str = deserializationContext.extractScalarFromObject(jsonParser, this, Double.TYPE);
        Double _checkDoubleSpecialValue = _checkDoubleSpecialValue(str);
        if (_checkDoubleSpecialValue != null) {
            return _checkDoubleSpecialValue.doubleValue();
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str, LogicalType.Integer, Double.TYPE);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return Utils.DOUBLE_EPSILON;
        } else if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return Utils.DOUBLE_EPSILON;
        } else {
            String trim = str.trim();
            if (!_hasTextualNull(trim)) {
                return _parseDoublePrimitive(deserializationContext, trim);
            }
            _verifyNullForPrimitiveCoercion(deserializationContext, trim);
            return Utils.DOUBLE_EPSILON;
        }
    }

    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h != 1) {
            if (h != 3) {
                if (h == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return Utils.FLOAT_EPSILON;
                } else if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7 || h == 8) {
                    return jsonParser.mo13927C();
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.mo13938N0();
                float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseFloatPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken((Class<?>) Float.TYPE, jsonParser)).floatValue();
        }
        str = deserializationContext.extractScalarFromObject(jsonParser, this, Float.TYPE);
        Float _checkFloatSpecialValue = _checkFloatSpecialValue(str);
        if (_checkFloatSpecialValue != null) {
            return _checkFloatSpecialValue.floatValue();
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str, LogicalType.Integer, Float.TYPE);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return Utils.FLOAT_EPSILON;
        } else if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return Utils.FLOAT_EPSILON;
        } else {
            String trim = str.trim();
            if (!_hasTextualNull(trim)) {
                return _parseFloatPrimitive(deserializationContext, trim);
            }
            _verifyNullForPrimitiveCoercion(deserializationContext, trim);
            return Utils.FLOAT_EPSILON;
        }
    }

    public final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h != 1) {
            if (h != 3) {
                if (h == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0;
                } else if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7) {
                    return jsonParser.mo13933I();
                } else {
                    if (h == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Integer.TYPE);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.mo13966g0();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.mo13938N0();
                int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseIntPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken((Class<?>) Integer.TYPE, jsonParser)).intValue();
        }
        str = deserializationContext.extractScalarFromObject(jsonParser, this, Integer.TYPE);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str, LogicalType.Integer, Integer.TYPE);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0;
        } else if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0;
        } else {
            String trim = str.trim();
            if (!_hasTextualNull(trim)) {
                return _parseIntPrimitive(deserializationContext, trim);
            }
            _verifyNullForPrimitiveCoercion(deserializationContext, trim);
            return 0;
        }
    }

    public final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h == 1) {
            str = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else if (h == 3) {
            return (Integer) _deserializeFromArray(jsonParser, deserializationContext);
        } else {
            if (h == 11) {
                return (Integer) getNullValue(deserializationContext);
            }
            if (h == 6) {
                str = jsonParser.mo13947W();
            } else if (h == 7) {
                return Integer.valueOf(jsonParser.mo13933I());
            } else {
                if (h != 8) {
                    return (Integer) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                if (_checkFloatToIntCoercion == CoercionAction.AsNull) {
                    return (Integer) getNullValue(deserializationContext);
                }
                if (_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                    return (Integer) getEmptyValue(deserializationContext);
                }
                return Integer.valueOf(jsonParser.mo13966g0());
            }
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Integer) getNullValue(deserializationContext);
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Integer) getEmptyValue(deserializationContext);
        }
        String trim = str.trim();
        if (_checkTextualNull(deserializationContext, trim)) {
            return (Integer) getNullValue(deserializationContext);
        }
        return _parseInteger(deserializationContext, trim);
    }

    public final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h == 1) {
            str = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else if (h == 3) {
            return (Long) _deserializeFromArray(jsonParser, deserializationContext);
        } else {
            if (h == 11) {
                return (Long) getNullValue(deserializationContext);
            }
            if (h == 6) {
                str = jsonParser.mo13947W();
            } else if (h == 7) {
                return Long.valueOf(jsonParser.mo13934J());
            } else {
                if (h != 8) {
                    return (Long) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                if (_checkFloatToIntCoercion == CoercionAction.AsNull) {
                    return (Long) getNullValue(deserializationContext);
                }
                if (_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                    return (Long) getEmptyValue(deserializationContext);
                }
                return Long.valueOf(jsonParser.mo13970i0());
            }
        }
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Long) getNullValue(deserializationContext);
        }
        if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Long) getEmptyValue(deserializationContext);
        }
        String trim = str.trim();
        if (_checkTextualNull(deserializationContext, trim)) {
            return (Long) getNullValue(deserializationContext);
        }
        return _parseLong(deserializationContext, trim);
    }

    public final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h != 1) {
            if (h != 3) {
                if (h == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0;
                } else if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7) {
                    return jsonParser.mo13934J();
                } else {
                    if (h == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Long.TYPE);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.mo13970i0();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.mo13938N0();
                long _parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseLongPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken((Class<?>) Long.TYPE, jsonParser)).longValue();
        }
        str = deserializationContext.extractScalarFromObject(jsonParser, this, Long.TYPE);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str, LogicalType.Integer, Long.TYPE);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0;
        } else if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0;
        } else {
            String trim = str.trim();
            if (!_hasTextualNull(trim)) {
                return _parseLongPrimitive(deserializationContext, trim);
            }
            _verifyNullForPrimitiveCoercion(deserializationContext, trim);
            return 0;
        }
    }

    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        int h = jsonParser.mo13967h();
        if (h != 1) {
            if (h != 3) {
                if (h == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0;
                } else if (h == 6) {
                    str = jsonParser.mo13947W();
                } else if (h == 7) {
                    return jsonParser.mo13945S();
                } else {
                    if (h == 8) {
                        CoercionAction _checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Short.TYPE);
                        if (_checkFloatToIntCoercion == CoercionAction.AsNull || _checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.mo13945S();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.mo13938N0();
                short _parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return _parseShortPrimitive;
            }
            return ((Short) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(Short.TYPE), jsonParser)).shortValue();
        }
        str = deserializationContext.extractScalarFromObject(jsonParser, this, Short.TYPE);
        CoercionAction _checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, str, LogicalType.Integer, Short.TYPE);
        if (_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0;
        } else if (_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0;
        } else {
            String trim = str.trim();
            if (_hasTextualNull(trim)) {
                _verifyNullForPrimitiveCoercion(deserializationContext, trim);
                return 0;
            }
            try {
                int j = kc4.m20647j(trim);
                if (_shortOverflow(j)) {
                    return ((Short) deserializationContext.handleWeirdStringValue(Short.TYPE, trim, "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue();
                }
                return (short) j;
            } catch (IllegalArgumentException unused) {
                return ((Short) deserializationContext.handleWeirdStringValue(Short.TYPE, trim, "not a valid `short` value", new Object[0])).shortValue();
            }
        }
    }

    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return jsonParser.mo13947W();
        }
        if (jsonParser.mo13984s0(JsonToken.VALUE_EMBEDDED_OBJECT)) {
            Object A = jsonParser.mo13924A();
            if (A instanceof byte[]) {
                return deserializationContext.getBase64Variant().encode((byte[]) A, false);
            }
            if (A == null) {
                return null;
            }
            return A.toString();
        } else if (jsonParser.mo13984s0(JsonToken.START_OBJECT)) {
            return deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        } else {
            String k0 = jsonParser.mo13974k0();
            if (k0 != null) {
                return k0;
            }
            return (String) deserializationContext.handleUnexpectedToken((Class<?>) String.class, jsonParser);
        }
    }

    public void _reportFailedNullCoerce(DeserializationContext deserializationContext, boolean z, Enum<?> enumR, String str) throws JsonMappingException {
        String str2;
        if (z) {
            str2 = "enable";
        } else {
            str2 = "disable";
        }
        deserializationContext.reportInputMismatch((o43<?>) this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), str2, enumR.getDeclaringClass().getSimpleName(), enumR.name());
    }

    public final boolean _shortOverflow(int i) {
        return i < -32768 || i > 32767;
    }

    public void _verifyEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13938N0() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
    }

    public final void _verifyNullForPrimitive(DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.reportInputMismatch((o43<?>) this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.fasterxml.jackson.databind.DeserializationFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void _verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.String r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r6.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000c
            r1 = r3
            goto L_0x0015
        L_0x000c:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r1 = r6.isEnabled((com.fasterxml.jackson.databind.DeserializationFeature) r0)
            if (r1 == 0) goto L_0x002b
            r1 = r2
        L_0x0015:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x001e
            java.lang.String r7 = "empty String (\"\")"
            goto L_0x0028
        L_0x001e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            java.lang.String r7 = "String \"%s\""
            java.lang.String r7 = java.lang.String.format(r7, r3)
        L_0x0028:
            r5._reportFailedNullCoerce(r6, r1, r0, r7)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String):void");
    }

    @Deprecated
    public final void _verifyNullForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        String str2;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            if (str.isEmpty()) {
                str2 = "empty String (\"\")";
            } else {
                str2 = String.format("String \"%s\"", new Object[]{str});
            }
            _reportFailedNullCoerce(deserializationContext, true, mapperFeature, str2);
        }
    }

    @Deprecated
    public void _verifyNumberForScalarCoercion(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            deserializationContext.reportInputMismatch((o43<?>) this, "Cannot coerce Number (%s) to %s (enable `%s.%s` to allow)", jsonParser.mo13947W(), _coercedTypeDesc(), mapperFeature.getDeclaringClass().getSimpleName(), mapperFeature.name());
        }
    }

    @Deprecated
    public void _verifyStringForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            deserializationContext.reportInputMismatch((o43<?>) this, "Cannot coerce String \"%s\" to %s (enable `%s.%s` to allow)", str, _coercedTypeDesc(), mapperFeature.getDeclaringClass().getSimpleName(), mapperFeature.name());
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public bc4 findContentNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, o43<?> o43) throws JsonMappingException {
        Nulls findContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (findContentNullStyle == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        }
        if (findContentNullStyle != Nulls.FAIL) {
            bc4 _findNullProvider = _findNullProvider(deserializationContext, beanProperty, findContentNullStyle, o43);
            if (_findNullProvider != null) {
                return _findNullProvider;
            }
            return o43;
        } else if (beanProperty != null) {
            return NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
        } else {
            JavaType constructType = deserializationContext.constructType(o43.handledType());
            if (constructType.isContainerType()) {
                constructType = constructType.getContentType();
            }
            return NullsFailProvider.constructForRootValue(constructType);
        }
    }

    public Nulls findContentNullStyle(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        if (beanProperty != null) {
            return beanProperty.getMetadata().getContentNulls();
        }
        return deserializationContext.getConfig().getDefaultSetterInfo().getContentNulls();
    }

    public o43<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, o43<?> o43) throws JsonMappingException {
        AnnotatedMember member;
        Object findDeserializationContentConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (findDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) == null) {
            return o43;
        }
        ot0<Object, Object> converterInstance = deserializationContext.converterInstance(beanProperty.getMember(), findDeserializationContentConverter);
        JavaType b = converterInstance.mo23477b(deserializationContext.getTypeFactory());
        o43<Object> o432 = o43;
        if (o43 == null) {
            o432 = deserializationContext.findContextualValueDeserializer(b, beanProperty);
        }
        return new StdDelegatingDeserializer(converterInstance, b, o432);
    }

    public o43<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    public Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (findFormatOverrides != null) {
            return findFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls);
        }
        return deserializationContext.getDefaultPropertyFormat(cls);
    }

    public final bc4 findValueNullProvider(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        if (settableBeanProperty != null) {
            return _findNullProvider(deserializationContext, settableBeanProperty, propertyMetadata.getValueNulls(), settableBeanProperty.getValueDeserializer());
        }
        return null;
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this._valueClass;
    }

    public ValueInstantiator getValueInstantiator() {
        return null;
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportWrongTokenException((o43<?>) this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (obj == null) {
            obj = handledType();
        }
        if (!deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            jsonParser.mo13959c1();
        }
    }

    public Class<?> handledType() {
        return this._valueClass;
    }

    public boolean isDefaultDeserializer(o43<?> o43) {
        return wf0.m29488O(o43);
    }

    public boolean isDefaultKeyDeserializer(ha3 ha3) {
        return wf0.m29488O(ha3);
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str, LogicalType logicalType, Class<?> cls) throws IOException {
        if (str.isEmpty()) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.EmptyString), cls, str, "empty String (\"\")");
        } else if (_isBlank(str)) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType, cls, CoercionAction.Fail), cls, str, "blank String (all whitespace)");
        } else if (deserializationContext.isEnabled(StreamReadCapability.UNTYPED_SCALARS)) {
            return CoercionAction.TryConvert;
        } else {
            CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.String);
            if (findCoercionAction == CoercionAction.Fail) {
                deserializationContext.reportInputMismatch((o43<?>) this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, _coercedTypeDesc());
            }
            return findCoercionAction;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean _parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.mo13967h()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x004c
            r3 = 3
            if (r0 == r3) goto L_0x002c
            r3 = 6
            if (r0 == r3) goto L_0x0027
            r3 = 7
            if (r0 == r3) goto L_0x001a
            switch(r0) {
                case 9: goto L_0x0019;
                case 10: goto L_0x0018;
                case 11: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x003f
        L_0x0015:
            r5._verifyNullForPrimitive(r7)
        L_0x0018:
            return r2
        L_0x0019:
            return r1
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Boolean r6 = r5._coerceBooleanFromInt(r6, r7, r1)
            boolean r6 = r0.equals(r6)
            return r6
        L_0x0027:
            java.lang.String r6 = r6.mo13947W()
            goto L_0x0052
        L_0x002c:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r7.isEnabled((com.fasterxml.jackson.databind.DeserializationFeature) r0)
            if (r0 == 0) goto L_0x003f
            r6.mo13938N0()
            boolean r0 = r5._parseBooleanPrimitive(r6, r7)
            r5._verifyEndArrayForSingle(r6, r7)
            return r0
        L_0x003f:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Object r6 = r7.handleUnexpectedToken((java.lang.Class<?>) r0, (com.fasterxml.jackson.core.JsonParser) r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x004c:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.String r6 = r7.extractScalarFromObject(r6, r5, r0)
        L_0x0052:
            com.fasterxml.jackson.databind.type.LogicalType r0 = com.fasterxml.jackson.databind.type.LogicalType.Boolean
            java.lang.Class r3 = java.lang.Boolean.TYPE
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = r5._checkFromStringCoercion(r7, r6, r0, r3)
            com.fasterxml.jackson.databind.cfg.CoercionAction r4 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull
            if (r0 != r4) goto L_0x0062
            r5._verifyNullForPrimitive(r7)
            return r2
        L_0x0062:
            com.fasterxml.jackson.databind.cfg.CoercionAction r4 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty
            if (r0 != r4) goto L_0x0067
            return r2
        L_0x0067:
            java.lang.String r6 = r6.trim()
            int r0 = r6.length()
            r4 = 4
            if (r0 != r4) goto L_0x0079
            boolean r0 = r5._isTrue(r6)
            if (r0 == 0) goto L_0x0083
            return r1
        L_0x0079:
            r1 = 5
            if (r0 != r1) goto L_0x0083
            boolean r0 = r5._isFalse(r6)
            if (r0 == 0) goto L_0x0083
            return r2
        L_0x0083:
            boolean r0 = r5._hasTextualNull(r6)
            if (r0 == 0) goto L_0x008d
            r5._verifyNullForPrimitiveCoercion(r7, r6)
            return r2
        L_0x008d:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            java.lang.Object r6 = r7.handleWeirdStringValue(r3, r6, r1, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = r7.equals(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):boolean");
    }

    public JavaType getValueType(DeserializationContext deserializationContext) {
        JavaType javaType = this._valueType;
        if (javaType != null) {
            return javaType;
        }
        return deserializationContext.constructType(this._valueClass);
    }

    public StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
        this._valueType = javaType;
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
        this._valueType = stdDeserializer._valueType;
    }

    public Date _parseDate(String str, DeserializationContext deserializationContext) throws IOException {
        try {
            if (str.isEmpty()) {
                if (C2011a.f9973a[_checkFromStringCoercion(deserializationContext, str).ordinal()] != 1) {
                    return null;
                }
                return new Date(0);
            } else if (_hasTextualNull(str)) {
                return null;
            } else {
                return deserializationContext.parseDate(str);
            }
        } catch (IllegalArgumentException e) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", wf0.m29528o(e));
        }
    }

    public final double _parseDoublePrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return _parseDouble(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public final float _parseFloatPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Float.TYPE, str, "not a valid `float` value", new Object[0])).floatValue();
        }
    }

    public final int _parseIntPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            if (str.length() <= 9) {
                return kc4.m20647j(str);
            }
            long l = kc4.m20649l(str);
            if (!_intOverflow(l)) {
                return (int) l;
            }
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Integer.TYPE, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE)).intValue();
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Integer.TYPE, str, "not a valid `int` value", new Object[0])).intValue();
        }
    }

    public final Integer _parseInteger(DeserializationContext deserializationContext, String str) throws IOException {
        Class<Integer> cls = Integer.class;
        try {
            if (str.length() <= 9) {
                return Integer.valueOf(kc4.m20647j(str));
            }
            long l = kc4.m20649l(str);
            if (!_intOverflow(l)) {
                return Integer.valueOf((int) l);
            }
            return (Integer) deserializationContext.handleWeirdStringValue(cls, str, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
        } catch (IllegalArgumentException unused) {
            return (Integer) deserializationContext.handleWeirdStringValue(cls, str, "not a valid `java.lang.Integer` value", new Object[0]);
        }
    }

    public final Long _parseLong(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return Long.valueOf(kc4.m20649l(str));
        } catch (IllegalArgumentException unused) {
            return (Long) deserializationContext.handleWeirdStringValue(Long.class, str, "not a valid `java.lang.Long` value", new Object[0]);
        }
    }

    public final long _parseLongPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return kc4.m20649l(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Long.TYPE, str, "not a valid `long` value", new Object[0])).longValue();
        }
    }
}
