package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferSerializer extends StdScalarSerializer<ByteBuffer> {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
        e43 m = t43.mo26059m(javaType);
        if (m != null) {
            m.mo19119d(JsonFormatTypes.INTEGER);
        }
    }

    public void serialize(ByteBuffer byteBuffer, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        if (byteBuffer.hasArray()) {
            int position = byteBuffer.position();
            jsonGenerator.mo13847O(byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        k60 k60 = new k60(asReadOnlyBuffer);
        jsonGenerator.mo13843K(k60, asReadOnlyBuffer.remaining());
        k60.close();
    }
}
