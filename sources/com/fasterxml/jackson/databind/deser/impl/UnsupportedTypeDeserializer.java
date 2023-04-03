package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class UnsupportedTypeDeserializer extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;
    public final String _message;
    public final JavaType _type;

    public UnsupportedTypeDeserializer(JavaType javaType, String str) {
        super(javaType);
        this._type = javaType;
        this._message = str;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object A;
        if (jsonParser.mo13965g() == JsonToken.VALUE_EMBEDDED_OBJECT && ((A = jsonParser.mo13924A()) == null || this._type.getRawClass().isAssignableFrom(A.getClass()))) {
            return A;
        }
        deserializationContext.reportBadDefinition(this._type, this._message);
        return null;
    }
}
