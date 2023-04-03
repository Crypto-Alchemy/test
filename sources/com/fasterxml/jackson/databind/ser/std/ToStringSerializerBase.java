package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;
import org.web3j.abi.datatypes.Utf8String;

public abstract class ToStringSerializerBase extends StdSerializer<Object> {
    public ToStringSerializerBase(Class<?> cls) {
        super(cls, false);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        visitStringFormat(t43, javaType);
    }

    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        return createSchemaNode(Utf8String.TYPE_NAME, true);
    }

    public boolean isEmpty(zw5 zw5, Object obj) {
        return valueToString(obj).isEmpty();
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13860Z0(valueToString(obj));
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(obj, JsonToken.VALUE_STRING));
        serialize(obj, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }

    public abstract String valueToString(Object obj);
}
