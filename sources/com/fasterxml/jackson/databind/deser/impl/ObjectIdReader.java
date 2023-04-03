package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.io.Serializable;

public class ObjectIdReader implements Serializable {
    private static final long serialVersionUID = 1;
    public final o43<Object> _deserializer;
    public final JavaType _idType;
    public final ObjectIdGenerator<?> generator;
    public final SettableBeanProperty idProperty;
    public final PropertyName propertyName;
    public final C1974a resolver;

    public ObjectIdReader(JavaType javaType, PropertyName propertyName2, ObjectIdGenerator<?> objectIdGenerator, o43<?> o43, SettableBeanProperty settableBeanProperty, C1974a aVar) {
        this._idType = javaType;
        this.propertyName = propertyName2;
        this.generator = objectIdGenerator;
        this.resolver = aVar;
        this._deserializer = o43;
        this.idProperty = settableBeanProperty;
    }

    public static ObjectIdReader construct(JavaType javaType, PropertyName propertyName2, ObjectIdGenerator<?> objectIdGenerator, o43<?> o43, SettableBeanProperty settableBeanProperty, C1974a aVar) {
        return new ObjectIdReader(javaType, propertyName2, objectIdGenerator, o43, settableBeanProperty, aVar);
    }

    public o43<Object> getDeserializer() {
        return this._deserializer;
    }

    public JavaType getIdType() {
        return this._idType;
    }

    public boolean isValidReferencePropertyName(String str, JsonParser jsonParser) {
        return this.generator.isValidReferencePropertyName(str, jsonParser);
    }

    public boolean maySerializeAsObject() {
        return this.generator.maySerializeAsObject();
    }

    public Object readObjectReference(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext);
    }
}
