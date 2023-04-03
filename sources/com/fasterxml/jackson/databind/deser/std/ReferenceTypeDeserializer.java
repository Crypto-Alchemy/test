package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements js0 {
    private static final long serialVersionUID = 2;
    public final JavaType _fullType;
    public final o43<Object> _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;
    public final j07 _valueTypeDeserializer;

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, j07 j07, o43<?> o43) {
        super(javaType);
        this._valueInstantiator = valueInstantiator;
        this._fullType = javaType;
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43 o43;
        o43 o432 = this._valueDeserializer;
        if (o432 == null) {
            o43 = deserializationContext.findContextualValueDeserializer(this._fullType.getReferencedType(), beanProperty);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(o432, beanProperty, this._fullType.getReferencedType());
        }
        j07 j07 = this._valueTypeDeserializer;
        if (j07 != null) {
            j07 = j07.forProperty(beanProperty);
        }
        if (o43 == this._valueDeserializer && j07 == this._valueTypeDeserializer) {
            return this;
        }
        return withResolved(j07, o43);
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            return deserialize(jsonParser, deserializationContext, valueInstantiator.createUsingDefault(deserializationContext));
        }
        j07 j07 = this._valueTypeDeserializer;
        if (j07 == null) {
            obj = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            obj = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
        }
        return referenceValue(obj);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            return getNullValue(deserializationContext);
        }
        j07 j072 = this._valueTypeDeserializer;
        if (j072 == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return referenceValue(j072.deserializeTypedFromAny(jsonParser, deserializationContext));
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public abstract T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    public abstract Object getReferenced(T t);

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public JavaType getValueType() {
        return this._fullType;
    }

    public LogicalType logicalType() {
        o43<Object> o43 = this._valueDeserializer;
        if (o43 != null) {
            return o43.logicalType();
        }
        return super.logicalType();
    }

    public abstract T referenceValue(Object obj);

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        o43<Object> o43 = this._valueDeserializer;
        if (o43 == null) {
            return null;
        }
        return o43.supportsUpdate(deserializationConfig);
    }

    public abstract T updateReference(T t, Object obj);

    public abstract ReferenceTypeDeserializer<T> withResolved(j07 j07, o43<?> o43);

    @Deprecated
    public ReferenceTypeDeserializer(JavaType javaType, j07 j07, o43<?> o43) {
        this(javaType, (ValueInstantiator) null, j07, o43);
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        Object obj;
        Object obj2;
        if (this._valueDeserializer.supportsUpdate(deserializationContext.getConfig()).equals(Boolean.FALSE) || this._valueTypeDeserializer != null) {
            j07 j07 = this._valueTypeDeserializer;
            if (j07 == null) {
                obj = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j07);
            }
        } else {
            Object referenced = getReferenced(t);
            if (referenced == null) {
                j07 j072 = this._valueTypeDeserializer;
                if (j072 == null) {
                    obj2 = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, j072);
                }
                return referenceValue(obj2);
            }
            obj = this._valueDeserializer.deserialize(jsonParser, deserializationContext, referenced);
        }
        return updateReference(t, obj);
    }
}
