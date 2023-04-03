package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;
import org.web3j.abi.datatypes.Utf8String;

@zz2
public final class StringSerializer extends StdScalarSerializer<Object> {
    private static final long serialVersionUID = 1;

    public StringSerializer() {
        super(String.class, false);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        visitStringFormat(t43, javaType);
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode(Utf8String.TYPE_NAME, true);
    }

    public boolean isEmpty(zw5 zw5, Object obj) {
        return ((String) obj).isEmpty();
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13860Z0((String) obj);
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        jsonGenerator.mo13860Z0((String) obj);
    }
}
