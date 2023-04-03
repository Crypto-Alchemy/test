package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;

@zz2
public class ToEmptyObjectSerializer extends StdSerializer<Object> {
    public ToEmptyObjectSerializer(Class<?> cls) {
        super(cls, false);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        t43.mo16635e(javaType);
    }

    public g53 getSchema(zw5 zw5, Type type) throws JsonMappingException {
        return null;
    }

    public boolean isEmpty(zw5 zw5, Object obj) {
        return true;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13856W0(obj, 0);
        jsonGenerator.mo13855W();
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        m17.mo16713h(jsonGenerator, m17.mo16712g(jsonGenerator, m17.mo23018d(obj, JsonToken.START_OBJECT)));
    }

    public ToEmptyObjectSerializer(JavaType javaType) {
        super(javaType);
    }
}
