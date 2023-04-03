package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super((Class<?>) ByteBuffer.class);
    }

    public LogicalType logicalType() {
        return LogicalType.Binary;
    }

    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return ByteBuffer.wrap(jsonParser.mo13973k());
    }

    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) throws IOException {
        l60 l60 = new l60(byteBuffer);
        jsonParser.mo13946S0(deserializationContext.getBase64Variant(), l60);
        l60.close();
        return byteBuffer;
    }
}
