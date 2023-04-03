package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

@zz2
public class TokenBufferDeserializer extends StdScalarDeserializer<fr6> {
    private static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super((Class<?>) fr6.class);
    }

    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    public fr6 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.bufferForInputBuffering(jsonParser).mo20075C1(jsonParser, deserializationContext);
    }
}
