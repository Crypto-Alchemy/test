package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.Type;

@zz2
public class TokenBufferSerializer extends StdSerializer<fr6> {
    public TokenBufferSerializer() {
        super(fr6.class);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        t43.mo26057j(javaType);
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode("any", true);
    }

    public void serialize(fr6 fr6, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        fr6.mo20079G1(jsonGenerator);
    }

    public final void serializeWithType(fr6 fr6, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(fr6, JsonToken.VALUE_EMBEDDED_OBJECT));
        serialize(fr6, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }
}
