package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class UnsupportedTypeSerializer extends StdSerializer<Object> {
    private static final long serialVersionUID = 1;
    public final String _message;
    public final JavaType _type;

    public UnsupportedTypeSerializer(JavaType javaType, String str) {
        super(Object.class);
        this._type = javaType;
        this._message = str;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        zw5.reportBadDefinition(this._type, this._message);
    }
}
