package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;
import org.web3j.abi.datatypes.Utf8String;

public class ClassSerializer extends StdScalarSerializer<Class<?>> {
    public ClassSerializer() {
        super(Class.class, false);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        visitStringFormat(t43, javaType);
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode(Utf8String.TYPE_NAME, true);
    }

    public void serialize(Class<?> cls, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13860Z0(cls.getName());
    }
}
