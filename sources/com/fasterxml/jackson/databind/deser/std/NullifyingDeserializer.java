package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer instance = new NullifyingDeserializer();
    private static final long serialVersionUID = 1;

    public NullifyingDeserializer() {
        super((Class<?>) Object.class);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo13984s0(JsonToken.FIELD_NAME)) {
            while (true) {
                JsonToken N0 = jsonParser.mo13938N0();
                if (N0 == null || N0 == JsonToken.END_OBJECT) {
                    return null;
                }
                jsonParser.mo13959c1();
            }
        } else {
            jsonParser.mo13959c1();
            return null;
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        int h = jsonParser.mo13967h();
        if (h == 1 || h == 3 || h == 5) {
            return j07.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        return null;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }
}
