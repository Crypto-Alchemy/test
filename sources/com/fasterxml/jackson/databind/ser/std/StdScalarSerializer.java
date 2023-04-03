package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;
import org.web3j.abi.datatypes.Utf8String;

public abstract class StdScalarSerializer<T> extends StdSerializer<T> {
    public StdScalarSerializer(Class<T> cls) {
        super(cls);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        visitStringFormat(t43, javaType);
    }

    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        return createSchemaNode(Utf8String.TYPE_NAME, true);
    }

    public void serializeWithType(T t, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(t, JsonToken.VALUE_STRING));
        serialize(t, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }

    public StdScalarSerializer(Class<?> cls, boolean z) {
        super(cls);
    }

    public StdScalarSerializer(StdScalarSerializer<?> stdScalarSerializer) {
        super((StdSerializer<?>) stdScalarSerializer);
    }
}
