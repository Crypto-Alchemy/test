package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

public final class TypeWrappedDeserializer extends o43<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    public final o43<Object> _deserializer;
    public final j07 _typeDeserializer;

    public TypeWrappedDeserializer(j07 j07, o43<?> o43) {
        this._typeDeserializer = j07;
        this._deserializer = o43;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserializeWithType(jsonParser, deserializationContext, this._typeDeserializer);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public o43<?> getDelegatee() {
        return this._deserializer.getDelegatee();
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return this._deserializer.getKnownPropertyNames();
    }

    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getNullValue(deserializationContext);
    }

    public Class<?> handledType() {
        return this._deserializer.handledType();
    }

    public LogicalType logicalType() {
        return this._deserializer.logicalType();
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._deserializer.supportsUpdate(deserializationConfig);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext, obj);
    }
}
