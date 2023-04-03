package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;

public class TextNode extends ValueNode {
    public static final TextNode EMPTY_STRING_NODE = new TextNode("");
    private static final long serialVersionUID = 2;
    public final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    @Deprecated
    public static void appendQuoted(StringBuilder sb, String str) {
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        ud0.m28141a(sb, str);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return EMPTY_STRING_NODE;
        }
        return new TextNode(str);
    }

    public boolean asBoolean(boolean z) {
        String str = this._value;
        if (str == null) {
            return z;
        }
        String trim = str.trim();
        if ("true".equals(trim)) {
            return true;
        }
        if ("false".equals(trim)) {
            return false;
        }
        return z;
    }

    public double asDouble(double d) {
        return kc4.m20640c(this._value, d);
    }

    public int asInt(int i) {
        return kc4.m20641d(this._value, i);
    }

    public long asLong(long j) {
        return kc4.m20642e(this._value, j);
    }

    public String asText() {
        return this._value;
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    public byte[] binaryValue() throws IOException {
        return getBinaryValue(C3514vx.m29159a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        String trim = this._value.trim();
        g60 g60 = new g60(Math.max(16, Math.min(65536, ((trim.length() >> 2) * 3) + 4)));
        try {
            base64Variant.decode(trim, g60);
            return g60.mo20400n();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.from((JsonParser) null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", new Object[]{e.getMessage()}), trim, byte[].class);
        }
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public final void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        String str = this._value;
        if (str == null) {
            jsonGenerator.mo13866c0();
        } else {
            jsonGenerator.mo13860Z0(str);
        }
    }

    public String textValue() {
        return this._value;
    }

    public String asText(String str) {
        String str2 = this._value;
        return str2 == null ? str : str2;
    }
}
