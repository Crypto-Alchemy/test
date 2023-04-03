package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import java.io.IOException;

public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super((Class<?>) Object.class);
    }

    public void failForEmpty(zw5 zw5, Object obj) throws JsonMappingException {
        zw5.reportBadDefinition((Class<?>) handledType(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[]{obj.getClass().getName()}));
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (zw5.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(zw5, obj);
        }
        super.serialize(obj, jsonGenerator, zw5);
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        if (zw5.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(zw5, obj);
        }
        super.serializeWithType(obj, jsonGenerator, zw5, m17);
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls);
    }
}
