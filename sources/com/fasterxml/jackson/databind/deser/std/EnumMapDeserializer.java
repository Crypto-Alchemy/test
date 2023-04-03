package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.EnumMap;

public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements js0, xe5 {
    private static final long serialVersionUID = 1;
    public o43<Object> _delegateDeserializer;
    public final Class<?> _enumClass;
    public ha3 _keyDeserializer;
    public PropertyBasedCreator _propertyBasedCreator;
    public o43<Object> _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;
    public final j07 _valueTypeDeserializer;

    public EnumMapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, ha3 ha3, o43<?> o43, j07 j07, bc4 bc4) {
        super(javaType, bc4, (Boolean) null);
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = ha3;
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
        this._valueInstantiator = valueInstantiator;
    }

    public EnumMap<?, ?> _deserializeUsingProperties(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        Object obj;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, (ObjectIdReader) null);
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else if (jsonParser.mo13984s0(JsonToken.FIELD_NAME)) {
            str = jsonParser.mo13964f();
        } else {
            str = null;
        }
        while (str != null) {
            JsonToken N0 = jsonParser.mo13938N0();
            SettableBeanProperty e = propertyBasedCreator.mo15600e(str);
            if (e == null) {
                Enum enumR = (Enum) this._keyDeserializer.deserializeKey(str, deserializationContext);
                if (enumR != null) {
                    try {
                        if (N0 != JsonToken.VALUE_NULL) {
                            j07 j07 = this._valueTypeDeserializer;
                            if (j07 == null) {
                                obj = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                            } else {
                                obj = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
                            }
                        } else if (!this._skipNullValues) {
                            obj = this._nullProvider.getNullValue(deserializationContext);
                        }
                        g.mo24273d(enumR, obj);
                    } catch (Exception e2) {
                        wrapAndThrow(deserializationContext, e2, this._containerType.getRawClass(), str);
                        return null;
                    }
                } else if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, str, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                } else {
                    jsonParser.mo13938N0();
                    jsonParser.mo13959c1();
                }
            } else if (g.mo24271b(e, e.deserialize(jsonParser, deserializationContext))) {
                jsonParser.mo13938N0();
                try {
                    return deserialize(jsonParser, deserializationContext, (EnumMap) propertyBasedCreator.mo15598a(deserializationContext, g));
                } catch (Exception e3) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e3, this._containerType.getRawClass(), str);
                }
            }
            str = jsonParser.mo13930E0();
        }
        try {
            return (EnumMap) propertyBasedCreator.mo15598a(deserializationContext, g);
        } catch (Exception e4) {
            wrapAndThrow(deserializationContext, e4, this._containerType.getRawClass(), str);
            return null;
        }
    }

    public EnumMap<?, ?> constructMap(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            return new EnumMap<>(this._enumClass);
        }
        try {
            if (valueInstantiator.canCreateUsingDefault()) {
                return (EnumMap) this._valueInstantiator.createUsingDefault(deserializationContext);
            }
            return (EnumMap) deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), (JsonParser) null, "no default constructor found", new Object[0]);
        } catch (IOException e) {
            return (EnumMap) wf0.m29513g0(deserializationContext, e);
        }
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43 o43;
        ha3 ha3 = this._keyDeserializer;
        if (ha3 == null) {
            ha3 = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        }
        o43 o432 = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        if (o432 == null) {
            o43 = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(o432, beanProperty, contentType);
        }
        j07 j07 = this._valueTypeDeserializer;
        if (j07 != null) {
            j07 = j07.forProperty(beanProperty);
        }
        return withResolved(ha3, o43, j07, findContentNullProvider(deserializationContext, beanProperty, o43));
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public o43<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return constructMap(deserializationContext);
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public boolean isCachable() {
        if (this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null) {
            return true;
        }
        return false;
    }

    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            return;
        }
        if (valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{javaType, this._valueInstantiator.getClass().getName()}));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, (BeanProperty) null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{javaType2, this._valueInstantiator.getClass().getName()}));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, (BeanProperty) null);
        } else if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.m14069c(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
    }

    public EnumMapDeserializer withResolved(ha3 ha3, o43<?> o43, j07 j07, bc4 bc4) {
        if (ha3 == this._keyDeserializer && bc4 == this._nullProvider && o43 == this._valueDeserializer && j07 == this._valueTypeDeserializer) {
            return this;
        }
        return new EnumMapDeserializer(this, ha3, o43, j07, bc4);
    }

    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingProperties(jsonParser, deserializationContext);
        }
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null) {
            return (EnumMap) this._valueInstantiator.createUsingDelegate(deserializationContext, o43.deserialize(jsonParser, deserializationContext));
        }
        int h = jsonParser.mo13967h();
        if (!(h == 1 || h == 2)) {
            if (h == 3) {
                return (EnumMap) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (h != 5) {
                if (h != 6) {
                    return (EnumMap) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                return (EnumMap) _deserializeFromString(jsonParser, deserializationContext);
            }
        }
        return deserialize(jsonParser, deserializationContext, (EnumMap) constructMap(deserializationContext));
    }

    public EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, ha3 ha3, o43<?> o43, j07 j07, bc4 bc4) {
        super((ContainerDeserializerBase<?>) enumMapDeserializer, bc4, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = ha3;
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }

    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String str;
        Object obj;
        jsonParser.mo13951Y0(enumMap);
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else {
            JsonToken g = jsonParser.mo13965g();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (g != jsonToken) {
                if (g == JsonToken.END_OBJECT) {
                    return enumMap;
                }
                deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, (String) null, new Object[0]);
            }
            str = jsonParser.mo13964f();
        }
        while (str != null) {
            Enum enumR = (Enum) this._keyDeserializer.deserializeKey(str, deserializationContext);
            JsonToken N0 = jsonParser.mo13938N0();
            if (enumR != null) {
                try {
                    if (N0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            obj = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (j07 == null) {
                        obj = o43.deserialize(jsonParser, deserializationContext);
                    } else {
                        obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                    }
                    enumMap.put(enumR, obj);
                } catch (Exception e) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e, enumMap, str);
                }
            } else if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, str, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
            } else {
                jsonParser.mo13959c1();
            }
            str = jsonParser.mo13930E0();
        }
        return enumMap;
    }

    @Deprecated
    public EnumMapDeserializer(JavaType javaType, ha3 ha3, o43<?> o43, j07 j07) {
        this(javaType, (ValueInstantiator) null, ha3, o43, j07, (bc4) null);
    }
}
