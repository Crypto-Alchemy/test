package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.nio.file.Path;

public class NioPathSerializer extends StdScalarSerializer<Path> {
    private static final long serialVersionUID = 1;

    public NioPathSerializer() {
        super(Path.class);
    }

    public void serialize(Path path, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13860Z0(path.toUri().toString());
    }

    public void serializeWithType(Path path, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        WritableTypeId g = m17.mo16712g(jsonGenerator, m17.mo23020f(path, Path.class, JsonToken.VALUE_STRING));
        serialize(path, jsonGenerator, zw5);
        m17.mo16713h(jsonGenerator, g);
    }
}
