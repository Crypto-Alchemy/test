package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

@Deprecated
public class StdKeySerializer extends StdSerializer<Object> {
    public StdKeySerializer() {
        super(Object.class);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13864b0(obj.toString());
    }
}
