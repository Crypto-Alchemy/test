package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Objects;

public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements js0 {
    private static final long serialVersionUID = 1;
    public o43<Enum<?>> _enumDeserializer;
    public final JavaType _enumType;
    public final bc4 _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;

    public EnumSetDeserializer(JavaType javaType, o43<?> o43) {
        super((Class<?>) EnumSet.class);
        this._enumType = javaType;
        if (javaType.isEnumType()) {
            this._enumDeserializer = o43;
            this._unwrapSingle = null;
            this._nullProvider = null;
            this._skipNullValues = false;
            return;
        }
        throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
    }

    public final EnumSet<?> _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Enum enumR;
        while (true) {
            try {
                JsonToken N0 = jsonParser.mo13938N0();
                if (N0 == JsonToken.END_ARRAY) {
                    return enumSet;
                }
                if (N0 != JsonToken.VALUE_NULL) {
                    enumR = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
                } else if (!this._skipNullValues) {
                    enumR = (Enum) this._nullProvider.getNullValue(deserializationContext);
                }
                if (enumR != null) {
                    enumSet.add(enumR);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) enumSet, enumSet.size());
            }
        }
    }

    /* renamed from: a */
    public final EnumSet mo15668a() {
        return EnumSet.noneOf(this._enumType.getRawClass());
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43 o43;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, EnumSet.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        o43 o432 = this._enumDeserializer;
        if (o432 == null) {
            o43 = deserializationContext.findContextualValueDeserializer(this._enumType, beanProperty);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(o432, beanProperty, this._enumType);
        }
        return withResolved(o43, findContentNullProvider(deserializationContext, beanProperty, o43), findFormatFeature);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return mo15668a();
    }

    public EnumSet<?> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        boolean z;
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return (EnumSet) deserializationContext.handleUnexpectedToken((Class<?>) EnumSet.class, jsonParser);
        }
        if (jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumType, jsonParser);
        }
        try {
            Enum deserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
            if (deserialize != null) {
                enumSet.add(deserialize);
            }
            return enumSet;
        } catch (Exception e) {
            throw JsonMappingException.wrapWithPath((Throwable) e, (Object) enumSet, enumSet.size());
        }
    }

    public boolean isCachable() {
        if (this._enumType.getValueHandler() != null) {
            return false;
        }
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public EnumSetDeserializer withDeserializer(o43<?> o43) {
        if (this._enumDeserializer == o43) {
            return this;
        }
        return new EnumSetDeserializer(this, o43, this._nullProvider, this._unwrapSingle);
    }

    @Deprecated
    public EnumSetDeserializer withResolved(o43<?> o43, Boolean bool) {
        return withResolved(o43, this._nullProvider, bool);
    }

    public EnumSetDeserializer withResolved(o43<?> o43, bc4 bc4, Boolean bool) {
        if (Objects.equals(this._unwrapSingle, bool) && this._enumDeserializer == o43 && this._nullProvider == o43) {
            return this;
        }
        return new EnumSetDeserializer(this, o43, bc4, bool);
    }

    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        EnumSet a = mo15668a();
        if (!jsonParser.mo13926B0()) {
            return handleNonArray(jsonParser, deserializationContext, a);
        }
        return _deserialize(jsonParser, deserializationContext, a);
    }

    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet<?> enumSet) throws IOException {
        if (!jsonParser.mo13926B0()) {
            return handleNonArray(jsonParser, deserializationContext, enumSet);
        }
        return _deserialize(jsonParser, deserializationContext, enumSet);
    }

    @Deprecated
    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, o43<?> o43, Boolean bool) {
        this(enumSetDeserializer, o43, enumSetDeserializer._nullProvider, bool);
    }

    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, o43<?> o43, bc4 bc4, Boolean bool) {
        super((StdDeserializer<?>) enumSetDeserializer);
        this._enumType = enumSetDeserializer._enumType;
        this._enumDeserializer = o43;
        this._nullProvider = bc4;
        this._skipNullValues = NullsConstantProvider.isSkipper(bc4);
        this._unwrapSingle = bool;
    }
}
