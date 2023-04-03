package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public final class MissingNode extends ValueNode {

    /* renamed from: a */
    public static final MissingNode f10094a = new MissingNode();
    private static final long serialVersionUID = 1;

    public static MissingNode getInstance() {
        return f10094a;
    }

    public String asText() {
        return "";
    }

    public String asText(String str) {
        return str;
    }

    public JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    public <T extends g53> T deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    public boolean isMissingNode() {
        return true;
    }

    public Object readResolve() {
        return f10094a;
    }

    public g53 require() {
        return (g53) _reportRequiredViolation("require() called on `MissingNode`", new Object[0]);
    }

    public g53 requireNonNull() {
        return (g53) _reportRequiredViolation("requireNonNull() called on `MissingNode`", new Object[0]);
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        jsonGenerator.mo13866c0();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        jsonGenerator.mo13866c0();
    }

    public String toPrettyString() {
        return "";
    }

    public String toString() {
        return "";
    }
}
