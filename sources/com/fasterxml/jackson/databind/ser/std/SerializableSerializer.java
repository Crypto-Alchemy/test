package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import p000.w63;

@zz2
public class SerializableSerializer extends StdSerializer<w63> {
    public static final SerializableSerializer instance = new SerializableSerializer();

    public SerializableSerializer() {
        super(w63.class);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        t43.mo26057j(javaType);
    }

    public boolean isEmpty(zw5 zw5, w63 w63) {
        if (w63 instanceof w63.C3522a) {
            return ((w63.C3522a) w63).isEmpty(zw5);
        }
        return false;
    }

    public void serialize(w63 w63, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        w63.serialize(jsonGenerator, zw5);
    }

    public final void serializeWithType(w63 w63, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        w63.serializeWithType(jsonGenerator, zw5, m17);
    }
}
