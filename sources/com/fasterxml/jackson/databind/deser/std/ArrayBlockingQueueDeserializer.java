package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    private static final long serialVersionUID = 1;

    public ArrayBlockingQueueDeserializer(JavaType javaType, o43<Object> o43, j07 j07, ValueInstantiator valueInstantiator) {
        super(javaType, o43, j07, valueInstantiator);
    }

    public Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        Collection<Object> _deserializeFromArray = super._deserializeFromArray(jsonParser, deserializationContext, collection);
        if (_deserializeFromArray.isEmpty()) {
            return new ArrayBlockingQueue(1, false);
        }
        return new ArrayBlockingQueue(_deserializeFromArray.size(), false, _deserializeFromArray);
    }

    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return null;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public ArrayBlockingQueueDeserializer(JavaType javaType, o43<Object> o43, j07 j07, ValueInstantiator valueInstantiator, o43<Object> o432, bc4 bc4, Boolean bool) {
        super(javaType, o43, j07, valueInstantiator, o432, bc4, bool);
    }

    public ArrayBlockingQueueDeserializer withResolved(o43<?> o43, o43<?> o432, j07 j07, bc4 bc4, Boolean bool) {
        return new ArrayBlockingQueueDeserializer(this._containerType, o432, j07, this._valueInstantiator, o43, bc4, bool);
    }

    public ArrayBlockingQueueDeserializer(ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer) {
        super(arrayBlockingQueueDeserializer);
    }
}
