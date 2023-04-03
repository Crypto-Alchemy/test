package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.annotation.Annotation;

public final class ObjectIdValueProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    public final ObjectIdReader _objectIdReader;

    public ObjectIdValueProperty(ObjectIdReader objectIdReader, PropertyMetadata propertyMetadata) {
        super(objectIdReader.propertyName, objectIdReader.getIdType(), propertyMetadata, objectIdReader.getDeserializer());
        this._objectIdReader = objectIdReader;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.VALUE_NULL)) {
            return null;
        }
        Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        deserializationContext.findObjectId(deserialize, objectIdReader.generator, objectIdReader.resolver).mo15610b(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        if (settableBeanProperty != null) {
            return settableBeanProperty.setAndReturn(obj, deserialize);
        }
        return obj;
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return null;
    }

    public AnnotatedMember getMember() {
        return null;
    }

    public void set(Object obj, Object obj2) throws IOException {
        setAndReturn(obj, obj2);
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        if (settableBeanProperty != null) {
            return settableBeanProperty.setAndReturn(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new ObjectIdValueProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(bc4 bc4) {
        return new ObjectIdValueProperty(this, this._valueDeserializer, bc4);
    }

    public SettableBeanProperty withValueDeserializer(o43<?> o43) {
        o43<Object> o432 = this._valueDeserializer;
        if (o432 == o43) {
            return this;
        }
        bc4 bc4 = this._nullProvider;
        if (o432 == bc4) {
            bc4 = o43;
        }
        return new ObjectIdValueProperty(this, o43, bc4);
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, o43<?> o43, bc4 bc4) {
        super(objectIdValueProperty, o43, bc4);
        this._objectIdReader = objectIdValueProperty._objectIdReader;
    }

    public ObjectIdValueProperty(ObjectIdValueProperty objectIdValueProperty, PropertyName propertyName) {
        super(objectIdValueProperty, propertyName);
        this._objectIdReader = objectIdValueProperty._objectIdReader;
    }
}
