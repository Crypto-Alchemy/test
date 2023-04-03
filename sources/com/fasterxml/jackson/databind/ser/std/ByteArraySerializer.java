package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import java.io.IOException;
import java.lang.reflect.Type;

@zz2
public class ByteArraySerializer extends StdSerializer<byte[]> {
    private static final long serialVersionUID = 1;

    public ByteArraySerializer() {
        super(byte[].class);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        e43 m = t43.mo26059m(javaType);
        if (m != null) {
            m.mo19119d(JsonFormatTypes.INTEGER);
        }
    }

    public g53 getSchema(zw5 zw5, Type type) {
        return createSchemaNode("array", true).set("items", createSchemaNode("byte"));
    }

    public boolean isEmpty(zw5 zw5, byte[] bArr) {
        return bArr.length == 0;
    }

    public void serialize(byte[] bArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13844L(zw5.getConfig().getBase64Variant(), bArr, 0, bArr.length);
    }

    public void serializeWithType(byte[] bArr, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23018d(bArr, JsonToken.VALUE_EMBEDDED_OBJECT));
        jsonGenerator.mo13844L(zw5.getConfig().getBase64Variant(), bArr, 0, bArr.length);
        m17.mo16713h(jsonGenerator, g);
    }
}
