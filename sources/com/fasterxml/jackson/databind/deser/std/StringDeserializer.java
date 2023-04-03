package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

@zz2
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer instance = new StringDeserializer();
    private static final long serialVersionUID = 1;

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return "";
    }

    public boolean isCachable() {
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.Textual;
    }

    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String k0;
        if (jsonParser.mo13984s0(JsonToken.VALUE_STRING)) {
            return jsonParser.mo13947W();
        }
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.START_ARRAY) {
            return (String) _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (g == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object A = jsonParser.mo13924A();
            if (A == null) {
                return null;
            }
            if (A instanceof byte[]) {
                return deserializationContext.getBase64Variant().encode((byte[]) A, false);
            }
            return A.toString();
        } else if (g == JsonToken.START_OBJECT) {
            return deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        } else {
            if (!g.isScalarValue() || (k0 = jsonParser.mo13974k0()) == null) {
                return (String) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            return k0;
        }
    }

    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return deserialize(jsonParser, deserializationContext);
    }
}
