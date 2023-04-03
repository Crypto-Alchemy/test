package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class NullNode extends ValueNode {
    public static final NullNode instance = new NullNode();
    private static final long serialVersionUID = 1;

    public static NullNode getInstance() {
        return instance;
    }

    public String asText() {
        return "null";
    }

    public String asText(String str) {
        return str;
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    public boolean equals(Object obj) {
        if (obj == this || (obj instanceof NullNode)) {
            return true;
        }
        return false;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }

    public Object readResolve() {
        return instance;
    }

    public g53 requireNonNull() {
        return (g53) _reportRequiredViolation("requireNonNull() called on `NullNode`", new Object[0]);
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        zw5.defaultSerializeNull(jsonGenerator);
    }
}
