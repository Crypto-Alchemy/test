package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.util.Objects;

@zz2
public class EnumDeserializer extends StdScalarDeserializer<Object> implements js0 {
    private static final long serialVersionUID = 1;
    public final Boolean _caseInsensitive;
    private final Enum<?> _enumDefaultValue;
    public Object[] _enumsByIndex;
    public final boolean _isFromIntValue;
    public final CompactStringObjectMap _lookupByName;
    public CompactStringObjectMap _lookupByToString;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.EnumDeserializer$a */
    public static /* synthetic */ class C2007a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9961a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.CoercionAction[] r0 = com.fasterxml.jackson.databind.cfg.CoercionAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9961a = r0
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9961a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9961a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.CoercionAction r1 = com.fasterxml.jackson.databind.cfg.CoercionAction.TryConvert     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumDeserializer.C2007a.<clinit>():void");
        }
    }

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super((Class<?>) enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = bool;
        this._isFromIntValue = enumResolver.isFromIntValue();
    }

    @Deprecated
    public static o43<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        return deserializerForCreator(deserializationConfig, cls, annotatedMethod, (ValueInstantiator) null, (SettableBeanProperty[]) null);
    }

    public static o43<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            wf0.m29512g(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    public Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.START_ARRAY)) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
    }

    public Class<?> _enumClass() {
        return handledType();
    }

    public Object _fromInteger(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.Integer);
        if (findCoercionAction == CoercionAction.Fail) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            Class<?> handledType = handledType();
            Integer valueOf = Integer.valueOf(i);
            _checkCoercionFail(deserializationContext, findCoercionAction, handledType, valueOf, "Integer value (" + i + ")");
        }
        int i2 = C2007a.f9961a[findCoercionAction.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return getEmptyValue(deserializationContext);
        }
        if (i >= 0) {
            Object[] objArr = this._enumsByIndex;
            if (i < objArr.length) {
                return objArr[i];
            }
        }
        if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i), "index value outside legal index range [0..%s]", Integer.valueOf(this._enumsByIndex.length - 1));
    }

    public Object _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        CompactStringObjectMap compactStringObjectMap;
        Object find;
        if (deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
            compactStringObjectMap = _getToStringLookup(deserializationContext);
        } else {
            compactStringObjectMap = this._lookupByName;
        }
        Object find2 = compactStringObjectMap.find(str);
        if (find2 != null) {
            return find2;
        }
        String trim = str.trim();
        if (trim == str || (find = compactStringObjectMap.find(trim)) == null) {
            return mo15661a(jsonParser, deserializationContext, compactStringObjectMap, trim);
        }
        return find;
    }

    public CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMap = this._lookupByToString;
        if (compactStringObjectMap == null) {
            synchronized (this) {
                compactStringObjectMap = EnumResolver.constructUsingToString(deserializationContext.getConfig(), _enumClass()).constructLookup();
            }
            this._lookupByToString = compactStringObjectMap;
        }
        return compactStringObjectMap;
    }

    /* renamed from: a */
    public final Object mo15661a(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) throws IOException {
        char charAt;
        CoercionAction coercionAction;
        String trim = str.trim();
        if (!trim.isEmpty()) {
            if (Boolean.TRUE.equals(this._caseInsensitive)) {
                Object findCaseInsensitive = compactStringObjectMap.findCaseInsensitive(trim);
                if (findCaseInsensitive != null) {
                    return findCaseInsensitive;
                }
            } else if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !this._isFromIntValue && (charAt = trim.charAt(0)) >= '0' && charAt <= '9') {
                try {
                    int parseInt = Integer.parseInt(trim);
                    if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                        return deserializationContext.handleWeirdStringValue(_enumClass(), trim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                    }
                    if (parseInt >= 0) {
                        Object[] objArr = this._enumsByIndex;
                        if (parseInt < objArr.length) {
                            return objArr[parseInt];
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this._enumDefaultValue;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdStringValue(_enumClass(), trim, "not one of the values accepted for Enum class: %s", compactStringObjectMap.keys());
        } else if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        } else {
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            if (str.isEmpty()) {
                coercionAction = _checkCoercionFail(deserializationContext, _findCoercionFromEmptyString(deserializationContext), handledType(), str, "empty String (\"\")");
            } else {
                coercionAction = _checkCoercionFail(deserializationContext, _findCoercionFromBlankString(deserializationContext), handledType(), str, "blank String (all whitespace)");
            }
            int i = C2007a.f9961a[coercionAction.ordinal()];
            if (i == 2 || i == 3) {
                return getEmptyValue(deserializationContext);
            }
            return null;
        }
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (findFormatFeature == null) {
            findFormatFeature = this._caseInsensitive;
        }
        return withResolved(findFormatFeature);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.mo13947W());
        }
        if (jsonParser.mo13984s0(JsonToken.VALUE_NUMBER_INT)) {
            if (this._isFromIntValue) {
                return _fromString(jsonParser, deserializationContext, jsonParser.mo13947W());
            }
            return _fromInteger(jsonParser, deserializationContext, jsonParser.mo13933I());
        } else if (jsonParser.mo13928C0()) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass));
        } else {
            return _deserializeOther(jsonParser, deserializationContext);
        }
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._enumDefaultValue;
    }

    public boolean isCachable() {
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    public EnumDeserializer withResolved(Boolean bool) {
        if (Objects.equals(this._caseInsensitive, bool)) {
            return this;
        }
        return new EnumDeserializer(this, bool);
    }

    public static o43<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            wf0.m29512g(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super((StdScalarDeserializer<?>) enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = bool;
        this._isFromIntValue = enumDeserializer._isFromIntValue;
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver) {
        this(enumResolver, (Boolean) null);
    }
}
