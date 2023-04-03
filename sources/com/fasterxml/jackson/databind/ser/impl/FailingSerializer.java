package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class FailingSerializer extends StdSerializer<Object> {
    public final String _msg;

    public FailingSerializer(String str) {
        super(Object.class);
        this._msg = str;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        zw5.reportMappingProblem(this._msg, new Object[0]);
    }
}
