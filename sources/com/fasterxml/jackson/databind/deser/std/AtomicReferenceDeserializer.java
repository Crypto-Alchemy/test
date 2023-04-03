package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    private static final long serialVersionUID = 1;

    public AtomicReferenceDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, j07 j07, o43<?> o43) {
        super(javaType, valueInstantiator, j07, o43);
    }

    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return null;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public AtomicReference<Object> getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicReference<>(this._valueDeserializer.getNullValue(deserializationContext));
    }

    public Object getReferenced(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    public AtomicReference<Object> referenceValue(Object obj) {
        return new AtomicReference<>(obj);
    }

    public AtomicReference<Object> updateReference(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    public AtomicReferenceDeserializer withResolved(j07 j07, o43<?> o43) {
        return new AtomicReferenceDeserializer(this._fullType, this._valueInstantiator, j07, o43);
    }
}
